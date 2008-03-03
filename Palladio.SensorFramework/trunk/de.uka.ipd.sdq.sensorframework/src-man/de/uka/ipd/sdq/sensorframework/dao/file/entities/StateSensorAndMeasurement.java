/**
 * 
 */
package de.uka.ipd.sdq.sensorframework.dao.file.entities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.uka.ipd.sdq.sensorframework.dao.file.FileManager;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.Measurement;
import de.uka.ipd.sdq.sensorframework.entities.Sensor;
import de.uka.ipd.sdq.sensorframework.entities.State;
import de.uka.ipd.sdq.sensorframework.entities.StateSensor;
import de.uka.ipd.sdq.sensorframework.storage.lists.BackgroundMemoryList;

/**
 * @author ihssane
 * 
 */
public class StateSensorAndMeasurement extends AbstractSensorAndMeasurements {

	private static final long serialVersionUID = -7553464522648015852L;
	private BackgroundMemoryList<State> states;

	public StateSensorAndMeasurement(FileManager fm, ExperimentRun er, Sensor sensor) throws IOException {
		super(fm, er, sensor);
		states = new BackgroundMemoryList<State>(getMeasurementsFileName(),new StateSerializer((StateSensor) sensor));
		fm.addOpenList(states);
	}

	public void addState(double et, State state) {
		eventTimes.add(et);
		states.add(state);
	}

	public List<State> getStates() {
		return states;
	}

	@Override
	public List<Measurement> getMeasurements() {
		ArrayList<Measurement> m = new ArrayList<Measurement>();
		for (int i = 0; i < states.size(); i++) {
			m.add(new StateMeasurementImpl(i, eventTimes.get(i), states
							.get(i)));
		}
		return m;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof StateSensorAndMeasurement))
			return false;
		StateSensorAndMeasurement sam = (StateSensorAndMeasurement) obj;
		return (super.equals(obj)) && (getStates().equals(sam.getStates()));
	}

	@Override
	public void store() {
		super.store();
		try {
			states.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}
