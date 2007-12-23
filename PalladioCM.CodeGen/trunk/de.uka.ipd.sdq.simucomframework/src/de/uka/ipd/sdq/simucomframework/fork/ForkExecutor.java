package de.uka.ipd.sdq.simucomframework.fork;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.simucomframework.abstractSimEngine.SimProcess;

/**
 * Helper to execute a fork action in the PCM. Implements the 
 * barrier design pattern.
 * @author Steffen Becker
 *
 */
public class ForkExecutor {
	private ForkedBehaviourProcess[] forks;
	private SimProcess parent;
	private static Logger logger = 
		Logger.getLogger(ForkExecutor.class.getName());

	/**
	 * Initialise the barrier with the forks to spawn and the parent process 
	 * which is continoued when all forks are done
	 * @param parent The parent simulation thread
	 * @param forks The threads to run in parallel
	 */
	public ForkExecutor(SimProcess parent, ForkedBehaviourProcess[] forks) {
		this.forks = forks;
		this.parent = parent;
	}
	
	/**
	 * Execute the child threads in parallel waiting for them to finish 
	 */
	public void run() {
		logger.info("Running parallel operations");
		double start = parent.getModel().getSimulationControl().getCurrentSimulationTime();
		for(ForkedBehaviourProcess p : forks) 
			p.scheduleAt(0);
		while(checkIfRemainingChildrenRun())
			parent.passivate();
		logger.debug("Forks took: "+(parent.getModel().getSimulationControl().getCurrentSimulationTime()-start));
	}

	/**
	 * @return True if there are child forks still running. This needs not be
	 * threadsafe as desmoj always exeutes only a single thread
	 */
	private boolean checkIfRemainingChildrenRun() {
		for(ForkedBehaviourProcess p : forks) 
			if (!p.isAsync() && !p.isTerminated())
				return true;
		return false;
	}
}
