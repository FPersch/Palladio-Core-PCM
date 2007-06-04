
		package de.uka.ipd.sdq.sensorfactory.entities.dao;
		public interface ISensorDAO {
			
				
	de.uka.ipd.sdq.sensorfactory.entities.StateSensor addStateSensor(
		
   
	de.uka.ipd.sdq.sensorfactory.entities.State
 p_initialstate
		
			,
		
		
   
	String
 p_sensorname
	)
;
			
				
	de.uka.ipd.sdq.sensorfactory.entities.TimeSpanSensor addTimeSpanSensor(
		
		
   
	String
 p_sensorname
	)
;
			

			/* Finder methods to search for Sensors */
			
	java.util.Collection<de.uka.ipd.sdq.sensorfactory.entities.Sensor> findBySensorName
		(
	String
 searchKey);
;

			de.uka.ipd.sdq.sensorfactory.entities.Sensor get(long id);
			java.util.Collection<de.uka.ipd.sdq.sensorfactory.entities.Sensor> getSensors();
		} 
	