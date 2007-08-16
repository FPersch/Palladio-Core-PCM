package de.uka.ipd.sdq.scheduler.processes;

public enum PROCESS_STATE {
	/**
	 * Thread is waiting to execute.
	 */
	READY, 
	/**
	 * Thread executes.
	 */
	RUNNING, 
	/**
	 * Thread has been selected for running on a specific processor. (Does this actually occur?)
	 */
	STANDBY, 
	/**
	 * Waiting for an object to synchronise.
	 */
	WAITING
}
