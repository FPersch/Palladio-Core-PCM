package de.uka.ipd.sdq.capra.simulator.resources.scheduling.impl;

import de.uka.ipd.sdq.capra.simulator.expressions.SimCapraProcess;
import de.uka.ipd.sdq.capra.simulator.resources.SimActiveResource;
import de.uka.ipd.sdq.capra.simulator.resources.scheduling.IPreemptiveJobManager;
import de.uka.ipd.sdq.capra.simulator.resources.scheduling.IScheduledJob;
import de.uka.ipd.sdq.capra.simulator.resources.scheduling.events.SchedulingEvent;
import de.uka.ipd.sdq.probfunction.math.util.MathTools;

public class PreemptiveStrategy extends AbstractSchedulingStrategy {

	private IPreemptiveJobManager jobManager;

	SchedulingEvent schedulingEvent;


	public PreemptiveStrategy(double timeslice) {
		super(new DoubleQueuePriorityJobManager(timeslice));
		this.jobManager = (IPreemptiveJobManager) super.jobManager;

	}

	public void setActiveResource(SimActiveResource resource) {
		this.schedulingEvent = new SchedulingEvent(resource);
	}

	@Override
	protected void progressTimeBy(double passedTime) {
		IScheduledJob job = jobManager.getCurrentJob();
		if (job != null) {
			assert (MathTools.lessOrEqual(passedTime, job.getRemainingDemand()));
			job.passTime(passedTime);
		}
	}

	@Override
	public void reschedule() {
		if (getRegistry().allProcessesReady()) {
			jobManager.balanceQueues();
			IScheduledJob job = jobManager.getCurrentJob();
			if (job != null) {
				schedulingEvent.cancel();
				schedulingEvent.setJob(job);
				schedulingEvent.schedule(job.getNextEventTime());
			}
		}
	}


	@Override
	public int getNumberOfJobs() {
		return jobManager.getNumberOfJobs();
	}

	@Override
	public boolean finishSchedulingCycle(IScheduledJob job) {
		assert (job == jobManager.getCurrentJob());
		if (job.demandProcessed()) {
			jobManager.removeFinishedJob(job);
			return true;
		} else {
			assert (job.timeSliceFinished());
			jobManager.requestNewTimeSlice(job);
			return false;
		}
	}

	protected IScheduledJob createJob(SimCapraProcess process, double demand) {
		PreemptiveProcess preemptiveProcess =  getRegistry().getPreemptiveProcess(process);
		return new PreemptiveJob(preemptiveProcess, demand);
	}
}
