package de.uka.ipd.sdq.simucomframework.probes;

import static javax.measure.unit.SI.SECOND;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import de.uka.ipd.sdq.probespec.framework.ProbeType;
import de.uka.ipd.sdq.probespec.framework.measurements.BasicMeasurement;
import de.uka.ipd.sdq.probespec.framework.probes.IProbeStrategy;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimulationControl;

/**
 * ProbeStrategy which is able to measure the current simulated time. The
 * simulated time's unit is assumed to be {@link SI#SECOND}.
 *
 * @author Philipp Merkle
 *
 */
public class TakeSimulatedTimeStrategy implements IProbeStrategy {

    /**
     * @param o
     *            expects a {@link ISimulationControl}
     */
    @Override
    public BasicMeasurement<Double, Duration> takeSample(final String probeId, final Object... o) {
        double simTime = 0;
        if (o.length >= 1 && (o[0] instanceof ISimulationControl || o[0] instanceof Double)) {
            if (o[0] instanceof ISimulationControl) {
                final ISimulationControl simControl = (ISimulationControl) o[0];
                simTime = simControl.getCurrentSimulationTime();
            } else {
                simTime = (Double) o[0];
            }
        } else {
            throw new IllegalArgumentException(
                    "Expected an argument implementing "
                            + ISimulationControl.class.getSimpleName()
                            + " or an argument of type " + Double.class.getSimpleName() + ".");
        }

        // Here it is assumed that the simulation time's unit is SI.SECOND
        final Measure<Double, Duration> time = Measure.valueOf(simTime, SECOND);
        final BasicMeasurement<Double, Duration> sample = new BasicMeasurement<Double, Duration>(
                time, probeId, ProbeType.CURRENT_TIME);

        return sample;
    }

}