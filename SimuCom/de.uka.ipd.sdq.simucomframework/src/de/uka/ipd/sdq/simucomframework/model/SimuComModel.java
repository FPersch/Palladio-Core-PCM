package de.uka.ipd.sdq.simucomframework.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import umontreal.iro.lecuyer.simevents.Simulator;
import de.uka.ipd.sdq.errorhandling.SeverityAndIssue;
import de.uka.ipd.sdq.probespec.framework.ISampleBlackboard;
import de.uka.ipd.sdq.probespec.framework.ProbeSpecContext;
import de.uka.ipd.sdq.probfunction.math.impl.ProbabilityFunctionFactoryImpl;
import de.uka.ipd.sdq.reliability.core.FailureStatistics;
import de.uka.ipd.sdq.scheduler.ISchedulingFactory;
import de.uka.ipd.sdq.scheduler.factory.SchedulingFactory;
import de.uka.ipd.sdq.scheduler.resources.active.AbstractActiveResource;
import de.uka.ipd.sdq.simucomframework.DiscardInvalidMeasurementsBlackboardDecorator;
import de.uka.ipd.sdq.simucomframework.ISimulationListener;
import de.uka.ipd.sdq.simucomframework.ResourceRegistry;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.simucomframework.SimuComGarbageCollector;
import de.uka.ipd.sdq.simucomframework.SimuComResult;
import de.uka.ipd.sdq.simucomframework.calculator.CalculatorFactory;
import de.uka.ipd.sdq.simucomframework.calculator.SetupPipesAndFiltersStrategy;
import de.uka.ipd.sdq.simucomframework.probes.SimuComProbeStrategyRegistry;
import de.uka.ipd.sdq.simucomframework.resources.IResourceContainerFactory;
import de.uka.ipd.sdq.simucomframework.resources.SimulatedLinkingResourceContainer;
import de.uka.ipd.sdq.simucomframework.resources.SimulatedResourceContainer;
import de.uka.ipd.sdq.simucomframework.simucomstatus.Action;
import de.uka.ipd.sdq.simucomframework.simucomstatus.Process;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimuComStatus;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimucomstatusPackage;
import de.uka.ipd.sdq.simucomframework.usage.IWorkloadDriver;
import de.uka.ipd.sdq.simucomframework.variables.cache.StoExCache;
import de.uka.ipd.sdq.simucomframework.variables.stoexvisitor.PCMStoExEvaluationVisitor;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimEngineFactory;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimulationControl;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimulationModel;
import de.uka.ipd.sdq.simulation.abstractsimengine.ssj.SSJExperiment;

/**
 * Central simulation class needed by desmoj. Keeps the simulation state which is not part of the
 * context of threads
 * 
 * @author Steffen Becker
 * 
 */
public class SimuComModel implements ISimulationModel<SimuComModel> {

	protected static Logger logger =
		Logger.getLogger(SimuComModel.class.getName());

	protected ResourceRegistry resourceRegistry = null;
	private IWorkloadDriver[] workloadDrivers;
	private SimuComResult status = SimuComResult.OK;
	private Throwable errorMessage = null;
	private SimuComConfig config;
	private long mainMeasurementsCount;
	private ISimEngineFactory<SimuComModel> simulationEngineFactory;
	private ISimulationControl<SimuComModel> simControl;
	private SimuComStatus simulationStatus = null;
	/** List of issues experience during a simulation run of this configuration. */
	private List<SeverityAndIssue> issues;
	private ProbeSpecContext probeSpecContext = null;

    public SimuComModel(SimuComConfig config, SimuComStatus status, ISimEngineFactory<SimuComModel> factory,
            boolean isRemoteRun) {
		this.config = config;
		this.simulationEngineFactory = factory;
		factory.setModel(this);
		this.simControl = factory.createSimulationControl();
		resourceRegistry = new ResourceRegistry(this);
		this.simulationStatus = status;
		issues = new ArrayList<SeverityAndIssue>();		

		// All following uses of static objects have severy issues. Nobody really thought of
		// e.g. running Simucom in parallel (e.g. to utilise many cores)!
		
		// TODO: This is not thread and hence concurrency safe...
		// initialise Random Generators
		StoExCache.initialiseStoExCache(config.getRandomGenerator());
		// the function lib caches random generators.
		PCMStoExEvaluationVisitor.deleteFunctionLib();
		
		// TODO: This is not thread and hence concurrency safe...
		ProbabilityFunctionFactoryImpl.getInstance().setRandomGenerator(config.getRandomGenerator());

		// set up the resource scheduler
        initScheduler();
		
        // set up the measurement framework
        initialiseProbeSpecification();
	}

    private void initScheduler() {
        // Obtain the used SSJ simulator and set the scheduler's simulator accordingly.
        // FIXME: SimuCom should not be aware of the used simulation engine. 
        SSJExperiment<SimuComModel> exp = (SSJExperiment<SimuComModel>) this.getSimulationControl();
        Simulator simulator = exp.getSimulator(); 
        SchedulingFactory.setUsedSimulator(simulator);
        ISchedulingFactory.eINSTANCE.resetFactory();
    }
    
    private void initialiseProbeSpecification() {
        // create ProbeSpecification context
        probeSpecContext = new ProbeSpecContext(config.getBlackboardType(), new SimuComProbeStrategyRegistry(),
                new CalculatorFactory(this, new SetupPipesAndFiltersStrategy(this)));

        // decorate the current blackboard in order to discard any measurement that arrives after
        // the simulation end
        ISampleBlackboard currentBlackboard = probeSpecContext.getSampleBlackboard();
        ISampleBlackboard decoratedBlackboard = new DiscardInvalidMeasurementsBlackboardDecorator(currentBlackboard,
                simControl);
        probeSpecContext.setSampleBlackboard(decoratedBlackboard);

        // install a garbage collector which keeps track of the samples stored on the blackboard and
        // removes samples when they become obsolete
        SimuComGarbageCollector garbageCollector = new SimuComGarbageCollector(decoratedBlackboard);
        probeSpecContext.setBlackboardGarbageCollector(garbageCollector);        
    }
    
	/**
	 * @return Gets the list of issues.
	 */
	public List<SeverityAndIssue> getIssues() {
		return issues;
	}

	/**Sets the list of issues.
	 * @param issues the list of issues to use. May not be {@code null}.
	 */
	public void setIssues(List<SeverityAndIssue> issues) {
		if (issues == null) {
			throw new IllegalArgumentException("issues must not be null. Create and provide an empty list if the list should be reset.");
		}
		this.issues = issues;
	}

	/**Adds an issues to the list of issues.
	 * @param issue the issue.
	 */
	public void addIssue(SeverityAndIssue issue) {
		this.issues.add(issue);
	}

	private void initialiseSimStatus() {
        if (this.config.getVerboseLogging()) {
            EContentAdapter contentAdapter = new EContentAdapter() {

                /* (non-Javadoc)
                 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
                 */
                @Override
                public void notifyChanged(Notification notification) {
                    super.notifyChanged(notification);
                    if (notification.getEventType() == Notification.SET) {
                        if (notification.getFeature() == SimucomstatusPackage.eINSTANCE.getProcess_CurrentAction()) {
                            Process p = (Process) notification.getNotifier();
                            Action a = (Action) notification.getNewValue();
                            logger.debug("Process "+p.getId()+" changed currentAction to "+a.getClass().getName());
                        }
                    } else
                        logger.debug("Simulation Status Updated");
                }

            };
            simulationStatus.eAdapters().add(contentAdapter);
        }

    }

    @Override
    public void init() {       
        // start the workload
        notifyStartListeners();
        for (IWorkloadDriver w : workloadDrivers) {
            w.run();
        }
    }

    /**
     * Add the given usage scenarios to this simulation run
     * 
     * @param workload
     *            Usage scenarios to execute during this simulation run
     */
    public void setUsageScenarios(IWorkloadDriver[] workload) {
        this.workloadDrivers = workload;
    }

    /**
     * @return The resource registry storing all simulated resources and their states
     */
    public ResourceRegistry getResourceRegistry() {
        return resourceRegistry;
    }

    /**
     * Create this simulation run's resources using the resource factory given.
     * The factory is queried for the list of IDs of the resources to create and
     * creates and inialises each of them
     * @param resourceContainerFactory The resource factory used to initialse the simulated
     * resources
     */
    public void initialiseResourceContainer(IResourceContainerFactory resourceContainerFactory) {
        for (String id : resourceContainerFactory.getResourceContainerIDList()) {
            SimulatedResourceContainer rc = (SimulatedResourceContainer) resourceRegistry.createResourceContainer(id);
            resourceContainerFactory.fillResourceContainer(rc);
        }
        for (String id : resourceContainerFactory.getLinkingResourceContainerIDList()) {
            SimulatedLinkingResourceContainer rc = (SimulatedLinkingResourceContainer) resourceRegistry.createLinkingResourceContainer(id);
            resourceContainerFactory.fillLinkingResourceContainer(rc);
        }
        resourceRegistry.activateAllActiveResources();
    }

    /**
     * Set the simulation result
     * @param error The new status
     * @param t The exception message if any, null otherwise
     */
    public void setStatus(SimuComResult error, Throwable t) {
        this.status = error;
        this.errorMessage = t;
    }

    /**
     * @return The simulation status
     */
    public SimuComResult getErrorStatus(){
        return status;
    }

    /**
     * @return The exception caused during the last simulation run. Null
     * if there was no such exception
     */
    public Throwable getErrorThrowable(){
        return this.errorMessage;
    }

    /**
     * @return The configuration settings of this simulation model instance
     * @deprecated use {@link #getConfiguration()} instead
     */
    public SimuComConfig getConfig() {
        return config;
    }

    public void increaseMainMeasurementsCount() {
        mainMeasurementsCount++;
    }

    public long getMainMeasurementsCount() {
        return mainMeasurementsCount;
    }

    public ISimulationControl<SimuComModel> getSimulationControl() {
        return simControl;
    }

    public void setSimulationControl(ISimulationControl<SimuComModel> control) {
        this.simControl = control;
    }

    public void setSimulationEngineFactory(ISimEngineFactory<SimuComModel> factory) {
        this.simulationEngineFactory = factory;
    }

    public ISimEngineFactory<SimuComModel> getSimEngineFactory() {
        return this.simulationEngineFactory;
    }

    public SimuComStatus getSimulationStatus() {
        return simulationStatus;
    }

    public ProbeSpecContext getProbeSpecContext() {
        return probeSpecContext;
    }

    @Override
    public void finalise() {
        notifyStopListeners();

        this.getResourceRegistry().deactivateAllActiveResources();
        this.getResourceRegistry().deactivateAllPassiveResources();

        logger.info("Simulation took " + getSimulationControl().getCurrentSimulationTime() + " simulation seconds");

        AbstractActiveResource.cleanProcesses();

        // Print failure statistics:
        if (getConfig().getSimulateFailures()) {
            FailureStatistics.getInstance().printFailureStatistics(logger);
        }

        this.getProbeSpecContext().getThreadManager().stopThreads();

        // This does some cleanup.
        // TODO: review this, maybe this is obsolete, if the stuff is cleanup on a different
        // place.
        // Currently, this has to be done to cleanup some memory.
        ISchedulingFactory.eINSTANCE.resetFactory();
    }

    @Override
    public SimuComConfig getConfiguration() {
        return config;
    }

    private void notifyStartListeners() {
        for (ISimulationListener l : config.getListeners()) {
            l.simulationStart();
        }
    }

    private void notifyStopListeners() {
        for (ISimulationListener l : config.getListeners()) {
            l.simulationStop();
        }
    }

}
