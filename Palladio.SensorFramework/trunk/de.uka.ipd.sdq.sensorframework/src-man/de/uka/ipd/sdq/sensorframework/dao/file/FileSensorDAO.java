/**
 * 
 */
package de.uka.ipd.sdq.sensorframework.dao.file;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import de.uka.ipd.sdq.sensorframework.dao.db4o.IDGenerator;
import de.uka.ipd.sdq.sensorframework.dao.file.entities.StateSensorImpl;
import de.uka.ipd.sdq.sensorframework.dao.file.entities.TimeSpanSensorImpl;
import de.uka.ipd.sdq.sensorframework.entities.Sensor;
import de.uka.ipd.sdq.sensorframework.entities.State;
import de.uka.ipd.sdq.sensorframework.entities.StateSensor;
import de.uka.ipd.sdq.sensorframework.entities.TimeSpanSensor;
import de.uka.ipd.sdq.sensorframework.entities.dao.ISensorDAO;

/**
 * @author issane, Steffen
 * 
 * Data Access Object (DAO) for persistence of Sensor Objects.
 * 
 */
public class FileSensorDAO extends AbstractFileDAO<Sensor> implements ISensorDAO {

	public FileSensorDAO(FileDAOFactory factory, IDGenerator idGen) {
		super(factory,idGen,FileDAOFactory.SENSOR_FILE_NAME_PREFIX);
	}

	public StateSensor addStateSensor(State p_initialstate, String p_sensorname) {
		StateSensor stsen = new StateSensorImpl(factory);
		stsen.setInitialState(p_initialstate);
		stsen.setSensorName(p_sensorname);
		stsen.setSensorID(idGen.getNextSensorID());

		store(stsen);

		return stsen;
	}

	public TimeSpanSensor addTimeSpanSensor(String p_sensorname) {
		TimeSpanSensor result = new TimeSpanSensorImpl(factory);
		result.setSensorID(idGen.getNextSensorID());
		result.setSensorName(p_sensorname);

		store(result);
		
		return result;
	}

	public Collection<Sensor> findBySensorName(String searchKey) {
		Collection<Sensor> result = new ArrayList<Sensor>();
		for (Sensor sen : getAllEntities())
			if (sen.getSensorName().equals(searchKey))
				result.add(sen);

		return Collections.unmodifiableCollection(result);
	}

	public Collection<Sensor> getSensors() {
		return this.getAllEntities();
	}

	public void removeSensor(Sensor sensor, boolean doCascade) {
		this.removeEntity(sensor, doCascade);
	}


}
