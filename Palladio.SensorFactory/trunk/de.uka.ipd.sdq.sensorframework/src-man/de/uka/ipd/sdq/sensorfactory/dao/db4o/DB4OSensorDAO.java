package de.uka.ipd.sdq.sensorfactory.dao.db4o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.uka.ipd.sdq.sensorfactory.dao.db4o.entities.StateSensorImpl;
import de.uka.ipd.sdq.sensorfactory.dao.db4o.entities.TimeSpanSensorImpl;
import de.uka.ipd.sdq.sensorfactory.entities.Experiment;
import de.uka.ipd.sdq.sensorfactory.entities.Sensor;
import de.uka.ipd.sdq.sensorfactory.entities.State;
import de.uka.ipd.sdq.sensorfactory.entities.StateSensor;
import de.uka.ipd.sdq.sensorfactory.entities.TimeSpanSensor;
import de.uka.ipd.sdq.sensorfactory.entities.dao.IDAOFactory;
import de.uka.ipd.sdq.sensorfactory.entities.dao.ISensorDAO;

public class DB4OSensorDAO implements ISensorDAO {

	private IDAOFactory factory;
	private ObjectContainer db;
	private IDGenerator idGen;

	public DB4OSensorDAO(IDAOFactory factory, ObjectContainer db, IDGenerator idGen) {
		this.factory = factory;
		this.db = db;
		this.idGen = idGen;
	}

	@Override
	public StateSensor addStateSensor(State p_initialstate, String p_sensorname) {
		StateSensor result = new StateSensorImpl(factory);
		result.setSensorID(idGen.getNextSensorID());
		result.setInitialState(p_initialstate);
		result.setSensorName(p_sensorname);

		db.set(result);
		db.commit();
		return result;
	}

	@Override
	public TimeSpanSensor addTimeSpanSensor(String p_sensorname) {
		TimeSpanSensor result = new TimeSpanSensorImpl(factory);
		result.setSensorID(idGen.getNextSensorID());
		result.setSensorName(p_sensorname);
		
		db.set(result);
		db.commit();
		return result;
	}

	public Collection<Sensor> findBySensorName(final String searchKey) {
		List<Sensor> resultList = db.query(new Predicate<Sensor>() {
	          public boolean match(Sensor s) {
	              return s.getSensorName().equals(searchKey);
	          }
		});  
		return Collections.unmodifiableCollection(resultList);
	}

	public Sensor get(final long id) {
		List<Sensor> resultList = db.query(new Predicate<Sensor>() {
	          public boolean match(Sensor s) {
	              if (s instanceof TimeSpanSensor) {
	            	  return ((TimeSpanSensor)s).getSensorID() == id;
	              }
	              if (s instanceof StateSensor) {
	            	  return ((StateSensor)s).getSensorID() == id;
	              }
	              return false;
	          }
		});  
		return resultList.get(0);
	}

	public Collection<Sensor> getSensors() {
		// TODO Auto-generated method stub
		return null;
	}

}
