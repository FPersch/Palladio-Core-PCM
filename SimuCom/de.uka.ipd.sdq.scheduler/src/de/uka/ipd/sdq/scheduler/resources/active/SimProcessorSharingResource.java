package de.uka.ipd.sdq.scheduler.resources.active;

import java.util.Hashtable;
import java.util.Map.Entry;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import de.uka.ipd.sdq.probfunction.math.util.MathTools;
import de.uka.ipd.sdq.scheduler.ISchedulableProcess;
import de.uka.ipd.sdq.scheduler.LoggingWrapper;
import de.uka.ipd.sdq.scheduler.SchedulerModel;
import de.uka.ipd.sdq.scheduler.entities.SchedulerEntity;
import de.uka.ipd.sdq.simulation.abstractsimengine.AbstractSimEventDelegator;

public class SimProcessorSharingResource extends AbstractActiveResource {

    private static final Logger LOGGER = Logger.getLogger(SimProcessorSharingResource.class);

    /**
     * The minimum amount of time used for scheduling an event
     */
    static double JIFFY = 1e-9;

    private class ProcessingFinishedEvent extends AbstractSimEventDelegator<ISchedulableProcess> {

        public ProcessingFinishedEvent(final SchedulerModel model) {
            super(model, ProcessingFinishedEvent.class.getName());
        }

        @Override
        public void eventRoutine(final ISchedulableProcess process) {
            final ISchedulableProcess last = process;
            toNow();
            running_processes.remove(last);

            fireStateChange(running_processes.size(), 0);

            fireDemandCompleted(last);
            LoggingWrapper.log(last + " finished.");
            scheduleNextEvent();
            last.activate();
        }

    }

    private final ProcessingFinishedEvent processingFinished;
    private final Hashtable<ISchedulableProcess, Double> running_processes = new Hashtable<ISchedulableProcess, Double>();
    private double last_time;

    public SimProcessorSharingResource(final SchedulerModel model, final String name, final String id, final long i) {
        super(model, i, name, id);
        this.processingFinished = new ProcessingFinishedEvent(model);
    }

    public void scheduleNextEvent() {
        ISchedulableProcess shortest = null;
        for (final ISchedulableProcess process : running_processes.keySet()) {
            if (shortest == null || running_processes.get(shortest) > running_processes.get(process)) {
                shortest = process;
            }
        }
        processingFinished.removeEvent();
        if (shortest != null) {
            double remainingTime = running_processes.get(shortest) * getSpeed();

            // avoid trouble caused by rounding issues
            remainingTime = remainingTime < JIFFY ? 0.0 : remainingTime;

            assert remainingTime >= 0 : "Remaining time (" + remainingTime + ")small than zero!";

            processingFinished.schedule(shortest, remainingTime);
        }
    }

    private void toNow() {
        final double now = getModel().getSimulationControl().getCurrentSimulationTime();
        double passed_time = now - last_time;
        if (MathTools.less(0, passed_time)) {
            passed_time /= getSpeed();
            for (final Entry<ISchedulableProcess, Double> e : running_processes.entrySet()) {
                final double rem = e.getValue() - passed_time;
                e.setValue(rem);
            }
        }
        last_time = now;
    }

    private double getSpeed() {
        final double speed = (double) running_processes.size() / (double) getCapacity();
        return speed < 1.0 ? 1.0 : speed;
    }

    @Override
    public void start() {
    }

    @Override
    protected void dequeue(final ISchedulableProcess process) {
    }

    @Override
    protected void doProcessing(final ISchedulableProcess process, final int resourceServiceID, double demand) {
        toNow();
        LoggingWrapper.log("PS: " + process + " demands " + demand);
        if (demand < JIFFY) {
            demand = JIFFY;
            LoggingWrapper.log("PS: " + process + " demand was increased to match JIFFY " + demand);
        }

        running_processes.put(process, demand);

        fireStateChange(running_processes.size(), 0);

        scheduleNextEvent();
        process.passivate();
    }

    @Override
    public double getRemainingDemand(final ISchedulableProcess process) {
        if (!running_processes.contains(process)) {
            return 0.0;
        }
        toNow();
        return running_processes.get(process);
    }

    @Override
    public void updateDemand(final ISchedulableProcess process, final double demand) {
        boolean updated = false;
        for (final Entry<ISchedulableProcess, Double> e : running_processes.entrySet()) {
            if (e.getKey().equals(process)) {
                if (Double.isNaN(demand)) {
                    if (LOGGER.isEnabledFor(Level.INFO)) {
                        LOGGER.info("Specified demand " + demand + "is not a number.");
                    }
                }
                e.setValue(demand);
                updated = true;
                break;
            }
        }
        if (updated == false) {
            throw new RuntimeException("COULD NOT UPDATE PROCESS!");
        }
        scheduleNextEvent();
    }

    @Override
    protected void enqueue(final ISchedulableProcess process) {
    }

    @Override
    public void registerProcess(final ISchedulableProcess process) {
    }

    @Override
    public int getQueueLengthFor(final SchedulerEntity schedulerEntity, final int coreID) {
        return this.running_processes.size();
    }

    @Override
    public void stop() {
    }

}
