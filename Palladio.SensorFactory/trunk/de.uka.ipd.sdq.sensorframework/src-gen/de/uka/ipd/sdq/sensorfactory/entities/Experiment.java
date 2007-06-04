
		package de.uka.ipd.sdq.sensorfactory.entities;
		public interface Experiment 
		
		
		{
			/* Getter and Setter for Properties with cardinality 0..1 or 1 which are not a composition */
			
	
	
	long
 getExperimentID()
;
	
	void setExperimentID(
	long
 value)
;
;
	
	
	String
 getExperimentName()
;
	
	void setExperimentName(
	String
 value)
;

			
			/* Getter and Setter for Properties with cardinality 0..1 or 1 which are a composition */
			
			
			/* Getter and Setter for Properties with cardinality 0..* which are not a composition */
			
			
			/* Getter and Setter for Properties with cardinality 0..* which are a composition */
			
	
		
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
	
	
	void addSensor(de.uka.ipd.sdq.sensorfactory.entities.Sensor value)
;
	
	java.util.Collection<
	de.uka.ipd.sdq.sensorfactory.entities.Sensor
> getSensors()
;
;
	
		
	de.uka.ipd.sdq.sensorfactory.entities.ExperimentRun addExperimentRun(
		
		
   
	String
 p_experimentdatetime
	)
;
	
	
	void addExperimentRun(de.uka.ipd.sdq.sensorfactory.entities.ExperimentRun value)
;
	
	java.util.Collection<
	de.uka.ipd.sdq.sensorfactory.entities.ExperimentRun
> getExperimentRuns()
;

			
			/* Abstract Operations */
			
		}
	