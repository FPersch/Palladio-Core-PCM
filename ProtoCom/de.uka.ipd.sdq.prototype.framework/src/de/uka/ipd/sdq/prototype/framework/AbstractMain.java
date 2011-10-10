package de.uka.ipd.sdq.prototype.framework;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;

import de.uka.ipd.sdq.measurement.strategies.activeresource.DegreeOfAccuracyEnum;
import de.uka.ipd.sdq.probfunction.math.impl.DefaultRandomGenerator;
import de.uka.ipd.sdq.sensorframework.dao.file.FileDAOFactory;
import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;
import de.uka.ipd.sdq.simucomframework.variables.cache.StoExCache;

/**
 * Abstract parent class of the main class of a QoS prototype. The class includes static,
 * i.e., not generator or model dependent, code like command line reading, taking measurements 
 * or setting up prototyped resources.
 * 
 * @author Steffen Becker, Thomas Zolynski, Sebastian Lehrig
 * 
 */
public abstract class AbstractMain {

	/**
	 * Root logger of the whole application. Changing its configuration impacts all log output.
	 */
	protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getRootLogger();

	/**
	 * Attributes for the measurements store
	 */
	private static IDAOFactory datasource = null;
	private ExperimentRun expRun;

	/**
	 * Threads used to simulate users
	 */
	protected ArrayList<Thread> threads = new ArrayList<Thread>();
	protected RunProperties runProps;

	/**
	 * Main method to run the generated prototype. It implements the main workflow, i.e.,
	 * parsing cmd line, setting up resources, datastores, RMI registry, etc.
	 *  
	 * @param args Command line arguments given for the prototype according to Apache CLI's configuration
	 */
	protected void run(String[] args) {
		runProps = CommandLineParser.parseCommandLine(args);
		setupLogging();
		logger.info("Command line read. Logging initialised. Protocom starts its workflow now...");
	
		logger.info("Reading allocation configuration. Callibrating container if needed");
		initAllocationStorage();
		AbstractAllocationStorage.initContainer();
		
		DefaultRandomGenerator randomGen = new DefaultRandomGenerator();
		if (runProps.hasOption('E')) {
			randomGen.setSeed(Long.parseLong(runProps.getOptionValue('E')));
		}
	
		logger.info("Initialising StoEx Cache " + (runProps.hasOption('E') ? " - Seed: " + runProps.getOptionValue('E') : ""));
	
		StoExCache.initialiseStoExCache(randomGen);
	
		handleStartOption();
	}

	/**
	 * Handles the start option set via the M-parameter.
	 * - If M has no option value, the user menu is displayed
	 * - If M has a option value, the corresponding main method is invoked (currently this is an experimental feature)
	 * - If M is not set, the default main method is invoked 
	 */
	private void handleStartOption() 
	{
		if (runProps.hasOption('M'))
		{
			String mainClass = runProps.getOptionValue('M');
			Method mainMethod = getMain(mainClass);
	
			if (!mainMethodFound(mainMethod))
			{
				List<Integer> itemIds = UserMenu.showUserMenu(getSystems());
				for (int itemId : itemIds)
				{
					handleMenuItem(itemId);
				}
			}
			else 
			{
				invokeMethod(mainMethod, new String[]{});
			}
		} 
		else
		{
			startDefaultMain();
		}
	}

	/**
	 * Executes the action that corresponds to itemId
	 * @param itemId The id of a menu item to execute
	 */
	private void handleMenuItem(int itemId)
	{
		if(itemId == 1)
		{
			// Start everything in local mode
			logger.debug("Start: Start everything in local mode");
			RmiRegistry.startRegistry();
			AbstractAllocationStorage.setLocalMode(true);
			setupResources();
			startDefaultMain();
		}
		else if(itemId == 2)
		{
			// RmiRegistry
			logger.debug("Start: RmiRegistry");
			RmiRegistry.main(null);
		}
		else if(itemId == 3)
		{
			// Usage Scenarios
			logger.debug("Start: Usage Scenarios");
			
			createExperiment();
			initMeasurement();
		}
		else
		{
			int i = 4;

			// This data source is only used temporary by components for inner sensors and NOT for the usage scenario.
			// This should be refactored into a better place, just like all in this class...
			datasource = prepareDatasource();
			ExperimentManager.setExperiment(datasource.createExperimentDAO().addExperiment(runProps.getOptionValue('n')));

			
			// systems
			String[][] systems = getSystems();
			for(String[] system : systems)
			{
				if(itemId == i)
				{
					logger.debug("Start: System "+system[0]);
					invokeMethod(getMain(system[0]), getRMIRegistry());
				}
				i++;
			}
			
			// container
			Collection<String> containers = AbstractAllocationStorage.getContainerIds();
			for(String containerId : containers)
			{
				if(itemId == i)
				{
					logger.debug("Start: Container "+AbstractAllocationStorage.getContainerName(containerId));
					Collection<Class<?>> components = AbstractAllocationStorage.getComponents(containerId);
					AbstractAllocationStorage.setActiveContainer(containerId);
					setupResources();
					
					for(Class<?> component : components)
					{
						logger.debug("Start: Component "+component.getName());
						invokeMethod(getMain(component), getRMIRegistry());
					}
				}
				i++;
			}
		}
	}

	
	private String[] getRMIRegistry() {
		if (runProps.hasOption("R")) {
			return new String[]{ runProps.getOptionValue("R") };
		}
		return new String[]{};
	}
	
	private Method getMain(Class<?> mainClass) {
		if (mainClass == null)
			return null;
		try {
			return mainClass.getMethod("main", String[].class);
		} catch (Throwable e) {
		}

		return null;
	}
	
	private boolean mainMethodFound(Method mainMethod) {
		logger.debug(mainMethod == null ? "Main method not found. Falling back" : "Main method passed on command line.");
		return mainMethod != null;
	}

	protected void initMeasurement() {

		if (runProps.hasOption('w')) {
			logger.info("Please pin java runtime to a single processor if needed! Press a key to continue!");
			waitForKey();
		}

		// init threads if configuration is active server (not -P) or only
		// warmup requested.
		if (!runProps.hasOption('P') || runProps.hasOption('W')) {
			initialiseThreads(ExperimentManager.getExperiment(), expRun);
		}

		// run measurements if the configuration is neither passive nor warmup
		// only.
		if (!runProps.hasOption('P') && !runProps.hasOption('W')) {

			try {

				logger.info("Current time: " + new Date());
				startThreads();

				stop();

			} catch (RuntimeException e) {
				throw e;
			} finally {
				logger.info("Current time: " + new Date());
				writeResultsAndClose(datasource);
			}
		}
		
		// close all running threads
		System.exit(0);
	}

	private void createExperiment() {
		datasource = prepareDatasource();
		ExperimentManager.setExperiment(datasource.createExperimentDAO().addExperiment(runProps.getOptionValue('n')));
		expRun = ExperimentManager.addExperimentRun();
		logger.info("Created data source at event time " + (System.nanoTime() / Math.pow(10, 9)));
	}

	private void startDefaultMain() {
		createExperiment();

		if (!runProps.hasOption('R')) {
			initialiseSystems();
		}
		initMeasurement();
	}

	protected abstract void initAllocationStorage();

	private void invokeMethod(Method method, String[] params) {
		try {
			method.invoke(null, (Object) params);
		} catch (Exception e) {
			logger.error("Failed to run main method",e);
			System.exit(-1);
		}
	}

	private Method getMain(String mainClass) {
		if (mainClass == null)
			return null;
		try {
			Class<?> cls = Class.forName(mainClass);
			return cls.getMethod("main", String[].class);
		} catch (Throwable e) {
			logger.info("Failed to retrieve main class. Falling back to menu mode");
		}
		return null;
	}

	private static void writeResultsAndClose(IDAOFactory datasource) {
		logger.info("Storing results...");
		datasource.createExperimentDAO().storeAll();
		datasource.finalizeAndClose();
		logger.info("...Done!");

		// wait a little before closing down results writer
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			logger.error("Failed to persist measurements", e);
			System.exit(-1);
		}
	}

	private void startThreads() {
		logger.info("Starting workload threads. ");
		if (runProps.hasOption('m'))
			logger.info("Taking " + runProps.getOptionValue('m') + " measurements");
		else
			logger.info("Request a measurement stop by pressing any key!");
		for (Thread t : threads) {
			t.start();
		}
	}

	private void setupLogging() {
		logger.removeAllAppenders();
		PatternLayout layout = new PatternLayout("%d{HH:mm} %-5p [%t]: %m%n");
		logger.addAppender(new ConsoleAppender(layout));
		if (runProps.hasOption('D'))
			logger.setLevel(Level.DEBUG);
		else
			logger.setLevel(Level.INFO);
	}

	private void waitForKey() {
		try {
			System.in.read();
			while (System.in.available() > 0) {
				System.in.read();
			}
		} catch (java.io.IOException e) {
			logger.error("Failed to wait for key. " + e);
			System.exit(-1);
		}		
	}

	private void stop() {
		if (!runProps.hasOption('m')) {
			logger.debug("Request Thread stop");
			for (Thread t : threads) {
				((IStopable) t).requestStop();
			}
		}
		for (Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	private IDAOFactory prepareDatasource() {
		if (!checkDirectory(runProps.getOptionValue('d'))) {
			String error = "Unable to find data directory. Ensure data directory exists and is writeable";
			logger.error(error);
			throw new RuntimeException(error);
		}
		IDAOFactory datasource = new FileDAOFactory(runProps.getOptionValue('d'));
		return datasource;
	}

	private boolean checkDirectory(String path) {
		File f = new File(path);
		if (f.isDirectory() && f.canWrite())
			return true;
		if (!f.exists()) {
			return f.mkdir();
		} else {
			return false;
		}
	}

	protected abstract void setupResources();

	protected abstract void initialiseSystems();

	protected abstract String[][] getSystems();
	
	protected DegreeOfAccuracyEnum getAccuracy()
	{
		DegreeOfAccuracyEnum accuracy = DegreeOfAccuracyEnum.MEDIUM;
		if(runProps.hasOption('a'))
		{
			try
			{
				String acc = runProps.getOptionValue('a').toUpperCase();
				accuracy = DegreeOfAccuracyEnum.valueOf( acc );
				logger.info("Using accuracy for calibration: " + acc);
			}
			catch(IllegalArgumentException e)
			{
				logger.warn("Calibration accuracy "+runProps.getOptionValue('a')+" not found! Using MEDIUM instead");
			}
		}
		else
		{
			logger.info("Using default accuracy for calibration: MEDIUM");
		}
		
		return accuracy;
	}
	
	/** 
	 * Initialise threads and perform warmup, if requested. 
	 */
	protected abstract void initialiseThreads(Experiment exp, ExperimentRun expRun);
}
