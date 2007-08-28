package de.uka.ipd.sdq.scheduler.processes.impl;

import java.util.ArrayList;
import java.util.List;

import umontreal.iro.lecuyer.simevents.Sim;
import de.uka.ipd.sdq.probfunction.math.util.MathTools;
import de.uka.ipd.sdq.scheduler.IProcessStateSensor;
import de.uka.ipd.sdq.scheduler.ISchedulableProcess;
import de.uka.ipd.sdq.scheduler.events.IDelayedAction;
import de.uka.ipd.sdq.scheduler.events.ProceedEvent;
import de.uka.ipd.sdq.scheduler.loaddistribution.IResourceInstanceConstraint;
import de.uka.ipd.sdq.scheduler.loaddistribution.constraints.MultipleResourceInstancesConstraint;
import de.uka.ipd.sdq.scheduler.loaddistribution.constraints.SingleResourceInstanceConstraint;
import de.uka.ipd.sdq.scheduler.processes.IActiveProcess;
import de.uka.ipd.sdq.scheduler.queueing.IRunQueue;
import de.uka.ipd.sdq.scheduler.resources.IResourceInstance;

public class ActiveProcess implements IActiveProcess {
	
	
	/**
	 * Creates a new wrapper containing the running information of a process.
	 * 
	 * @param process
	 *            The process that should be executed.
	 * 
	 * @param name
	 *            A UNIQUE name of the process.
	 */
	public ActiveProcess(ISchedulableProcess process, String name, String id) {
		super();

		this.affinityConstraint = null;
		this.currentDemand = 0;
		this.id = id;
		this.idealInstanceConstraint = null;
		this.lastInstanceConstraint = null;
		this.lastUpdateTime = 0;
		this.name = name;
		this.proceedEvent = new ProceedEvent(this);
		this.process = process;
		this.processStateSensorList = new ArrayList<IProcessStateSensor>();
		this.runqueue = null;
		this.state = PROCESS_STATE.READY;
	}

	// /////////////////////////////////////////////////////////////////////
	// Basics
	// /////////////////////////////////////////////////////////////////////

	private ISchedulableProcess process;
	private String name;
	private String id;
	private IRunQueue runqueue;

	public IRunQueue getRunQueue() {
		return runqueue;
	}
	
	public void setRunQueue(IRunQueue runqueue){
		this.runqueue = runqueue;
	}

	public ISchedulableProcess getSchedulableProcess() {
		return process;
	}

	public String getName() {
		return name;
	}
	
	public String getId(){
		return id;
	}

	@Override
	public String toString() {
		return name + "_" +id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ActiveProcess) {
			ActiveProcess process = (ActiveProcess) obj;
			return this.id.equals(process.id);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	// /////////////////////////////////////////////////////////////////////
	// Process State
	// /////////////////////////////////////////////////////////////////////

	private PROCESS_STATE state = PROCESS_STATE.READY;
	private List<IProcessStateSensor> processStateSensorList;

	public PROCESS_STATE getState() {
		return state;
	}

	public void setState(PROCESS_STATE new_state) {
		state = new_state;
		for (IProcessStateSensor sensor : processStateSensorList) {
			sensor.update(new_state);
		}
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#setRunning()
	 */
	public void setRunning() {
		setState(PROCESS_STATE.RUNNING);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#setReady()
	 */
	public void setReady() {
		setState(PROCESS_STATE.READY);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#setWaiting()
	 */
	public void setWaiting() {
		setState(PROCESS_STATE.WAITING);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#isRunning()
	 */
	public boolean isRunning() {
		return getState() == PROCESS_STATE.RUNNING;
	}
	
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#isReady()
	 */
	public boolean isReady() {
		return getState() == PROCESS_STATE.READY;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#isWaiting()
	 */
	public boolean isWaiting() {
		return getState() == PROCESS_STATE.WAITING;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#addStateSensor(de.uka.ipd.sdq.scheduler.processes.IProcessStateSensor)
	 */
	public void addStateSensor(IProcessStateSensor sensor) {
		processStateSensorList.add(sensor);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#removeStateSensor(de.uka.ipd.sdq.scheduler.processes.IProcessStateSensor)
	 */
	public void removeStateSensor(IProcessStateSensor sensor) {
		processStateSensorList.remove(sensor);
	}

	// /////////////////////////////////////////////////////////////////////
	// Timing
	// /////////////////////////////////////////////////////////////////////

	private double currentDemand = 0;
	private double lastUpdateTime = 0;

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#getCurrentDemand()
	 */
	public double getCurrentDemand() {
		return currentDemand;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#setCurrentDemand(double)
	 */
	public void setCurrentDemand(double currentDemand) {
		assert MathTools.equalsDouble(currentDemand, 0.0);
		this.currentDemand = currentDemand;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#toNow()
	 */
	public void toNow() {
		double currentTime = Sim.time();
		if (isRunning()) {
			double passedTime = currentTime - lastUpdateTime;
			if (passedTime > MathTools.EPSILON_ERROR) {
				passTime(passedTime);
			}
		}
		lastUpdateTime = currentTime;
	}

	protected void passTime(double passedTime) {
		currentDemand -= passedTime;
	}

	// /////////////////////////////////////////////////////////////////////
	// Resource Instance Constraints
	// /////////////////////////////////////////////////////////////////////

	private MultipleResourceInstancesConstraint affinityConstraint;
	private SingleResourceInstanceConstraint idealInstanceConstraint;
	private SingleResourceInstanceConstraint lastInstanceConstraint;

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#setAffineInstances(java.util.List)
	 */
	public void setAffineInstances(List<IResourceInstance> instanceList) {
		affinityConstraint = new MultipleResourceInstancesConstraint(
				instanceList);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#hasAffinityList()
	 */
	public boolean hasAffinityList() {
		return affinityConstraint != null;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#checkAffinity(de.uka.ipd.sdq.scheduler.resources.IResourceInstance)
	 */
	public boolean checkAffinity(IResourceInstance instance) {
		return checkInstanceConstraint(affinityConstraint, instance);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#removeNonAffineInstances(java.util.List)
	 */
	public void removeNonAffineInstances(List<IResourceInstance> instances) {
		if (hasAffinityList()) {
			for (IResourceInstance instance : instances) {
				if (!affinityConstraint.check(instance)) {
					instances.remove(instance);
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#setIdealInstance(de.uka.ipd.sdq.scheduler.resources.IResourceInstance)
	 */
	public void setIdealInstance(IResourceInstance instance) {
		idealInstanceConstraint = new SingleResourceInstanceConstraint(instance);

	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#hasIdealInstance()
	 */
	public boolean hasIdealInstance() {
		return idealInstanceConstraint != null;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#isIdealInstance(de.uka.ipd.sdq.scheduler.resources.IResourceInstance)
	 */
	public boolean isIdealInstance(IResourceInstance instance) {
		return checkInstanceConstraint(idealInstanceConstraint, instance);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#getIdealInstance()
	 */
	public IResourceInstance getIdealInstance() {
		if (hasIdealInstance()) {
			return idealInstanceConstraint.getResourceInstance();
		}
		return null;
	}


	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#setLastInstance(de.uka.ipd.sdq.scheduler.resources.IResourceInstance)
	 */
	public void setLastInstance(IResourceInstance instance) {
		lastInstanceConstraint = new SingleResourceInstanceConstraint(instance);
	}
	
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#hasLastInstance()
	 */
	public boolean hasLastInstance() {
		return lastInstanceConstraint != null;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#getLastInstance()
	 */
	public IResourceInstance getLastInstance() {
		if (hasLastInstance())
			return lastInstanceConstraint.getResourceInstance();
		return null;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#isLastInstance(de.uka.ipd.sdq.scheduler.resources.IResourceInstance)
	 */
	public boolean isLastInstance(IResourceInstance instance) {
		return checkInstanceConstraint(lastInstanceConstraint, instance);
	}

	private boolean checkInstanceConstraint(
			IResourceInstanceConstraint constraint, IResourceInstance instance) {
		if (constraint != null) {
			return constraint.check(instance);
		}
		// if no constraint is defined, every instance is accepted.
		return true;
	}

	// /////////////////////////////////////////////////////////////////////
	// Resource Instance Constraints
	// /////////////////////////////////////////////////////////////////////

	private ProceedEvent proceedEvent = null;

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#scheduleProceedEvent()
	 */
	public void scheduleProceedEvent() {
		proceedEvent.schedule(getCurrentDemand());
	}
	
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#cancelProceedEvent()
	 */
	public void cancelProceedEvent() {
		proceedEvent.cancel();
	}


	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#getTimeUntilNextInterruption()
	 */
	public double getTimeUntilNextInterruption() {
		return currentDemand;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.scheduler.processes.impl.IRunnableProcess#setDelayedAction(de.uka.ipd.sdq.scheduler.events.IDelayedAction)
	 */
	public void setDelayedAction(IDelayedAction action) {
		this.proceedEvent.setDelayedAction(action);
	}

}
