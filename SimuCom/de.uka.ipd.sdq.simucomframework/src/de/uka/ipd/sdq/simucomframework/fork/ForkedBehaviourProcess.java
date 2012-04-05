package de.uka.ipd.sdq.simucomframework.fork;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.probespec.framework.RequestContext;
import de.uka.ipd.sdq.probespec.framework.garbagecollection.IRegionBasedGarbageCollector;
import de.uka.ipd.sdq.simucomframework.Context;
import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimProcess;

/**
 * Base class for ForkBehaviours. Generator creates a specialisation of this and
 * uses it to execute actions in parallel
 * 
 * @author Steffen Becker
 * 
 */
public abstract class ForkedBehaviourProcess extends SimuComSimProcess {

	protected Context ctx;
	private ISimProcess myParent;
	protected String assemblyContextID;
	private boolean isAsync;
	private boolean isTerminated = false;
	private IRegionBasedGarbageCollector<RequestContext> blackboardGarbageCollector;

	private static Logger logger = Logger.getLogger(ForkedBehaviourProcess.class.getName());

	public ForkedBehaviourProcess(Context myContext, String assemblyContextID, boolean isAsync) {
		super(myContext.getModel(), "Forked Behaviour", myContext.getThread().getRequestContext());
		
		// use the session id from the parent process
		this.currentSessionId = myContext.getThread().getCurrentSessionId();
		
		this.ctx = new ForkContext(myContext, this);
	 
		this.myParent = myContext.getThread();
		this.assemblyContextID = assemblyContextID;
		this.isAsync = isAsync;
        this.blackboardGarbageCollector = myContext.getModel().getProbeSpecContext().getBlackboardGarbageCollector();
        
        // prevent garbage collector to dispose measurements taken within the given request context
        this.blackboardGarbageCollector.enterRegion(getRequestContext().rootContext());
	}

	@Override
	protected void internalLifeCycle() {
		executeBehaviour();
		this.isTerminated = true;

		// if this has been synchronous call of the behaviour and the parent has
		// not yet terminated (which may happen under some wired conditions) and
		// the simulation is still running, we can think about triggering the
		// parent again.
		if (!isAsync && !myParent.isTerminated() && simulationIsRunning())
			myParent.scheduleAt(0);
		else {
			logger.debug("Asynch behaviour finished at simtime " + getModel().getSimulationControl().getCurrentSimulationTime());
		}
		
        // tell garbage collector that this process is no longer interested in measurements taken
        // within the given request context
        blackboardGarbageCollector.leaveRegion(getRequestContext().rootContext());
	}

	private boolean simulationIsRunning() {
		return this.ctx.getModel().getSimulationControl().isRunning();
	}

	/**
	 * Template method filled by the generate with the parallel behaviour
	 * specified in the PCM's fork action
	 */
	protected abstract void executeBehaviour();

	public boolean isAsync() {
		return isAsync;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uka.ipd.sdq.simulation.abstractsimengine.SimProcess#isTerminated
	 * ()
	 */
	@Override
	public boolean isTerminated() {
		return this.isTerminated;
	}

}
