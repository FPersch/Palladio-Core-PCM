package de.uka.ipd.sdq.simucomframework;

import java.util.Map;

/**
 * @author roman
 * 
 * The class encapsulates all configuration options for SimuCom.
 */
public class SimuComConfig {

	public static final String DATASOURCE_ID = "datasourceID";
	public static final String SHOULD_THROW_EXCEPTION = "shouldThrowException";
	public static final String RUN_NUMBER = "runNo";
	public static final String MAXIMUM_MEASUREMENT_COUNT = "maximumMeasurementCount";
	/** SimuCom configuration tab */
	public static String EXPERIMENT_RUN = "experimentRun";
	public static String SIMULATION_TIME = "simTime";
	public static String VERBOSE_LOGGING = "verboseLogging";
	
	/** configuration options */
	private String nameExperimentRun;
	private long simuTime;
	private boolean verboseLogging;
	private long datasourceID;
	private Integer runNumber;
	private Long maxMeasurementsCount;

	/**
	 * @param a map which maps configuation option IDs to their values
	 */
	public SimuComConfig(Map<String,Object> configuration){
		try {
			this.nameExperimentRun = (String) configuration.get(
					EXPERIMENT_RUN);
			this.simuTime = Long.valueOf((String)configuration.get(
					SIMULATION_TIME));
			this.maxMeasurementsCount = Long.valueOf((String)configuration.get(
					MAXIMUM_MEASUREMENT_COUNT));
			this.verboseLogging = (Boolean)configuration.get(
					VERBOSE_LOGGING);
			this.datasourceID = (Integer)configuration.get(
					DATASOURCE_ID);
			this.runNumber = (Integer)configuration.get(
					RUN_NUMBER);
		} catch (Exception e) {
			throw new RuntimeException("Setting up properties failed, please check launch config", e);
		}
	}

	public String getNameExperimentRun() {
		return nameExperimentRun + " RunNo. "+runNumber;
	}

	public long getSimuTime() {
		return simuTime;
	}

	public long getMaxMeasurementsCount() {
		return maxMeasurementsCount;
	}
	
	public boolean getVerboseLogging() {
		return verboseLogging;
	}

	public long getDatasourceID() {
		return this.datasourceID;
	}

	public String getEngine() {
		return "de.uka.ipd.sdq.simucomframework.ssj.SSJSimEngineFactory";
	}

}
