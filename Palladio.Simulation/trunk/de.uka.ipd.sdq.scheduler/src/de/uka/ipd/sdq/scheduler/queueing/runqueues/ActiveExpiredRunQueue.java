package de.uka.ipd.sdq.scheduler.queueing.runqueues;

import java.util.ArrayList;
import java.util.List;

import de.uka.ipd.sdq.scheduler.processes.IActiveProcess;
import de.uka.ipd.sdq.scheduler.processes.impl.PreemptiveProcess;
import de.uka.ipd.sdq.scheduler.queueing.IProcessQueue;
import de.uka.ipd.sdq.scheduler.queueing.IRunQueue;
import de.uka.ipd.sdq.scheduler.resources.IResourceInstance;

public class ActiveExpiredRunQueue extends AbstractRunQueue {

	private IProcessQueue activePriorityArray;
	private IProcessQueue expiredPriorityArray;

	public ActiveExpiredRunQueue(IProcessQueue queue_prototype) {
		this.activePriorityArray = queue_prototype.createNewInstance();
		this.expiredPriorityArray = queue_prototype.createNewInstance();
	}

	/**
	 * Adds a new process to the end of the expired priority array.
	 */
	@Override
	public void addProcessToRunQueue(IActiveProcess process, boolean inFront) {
		if (process instanceof PreemptiveProcess) {
			PreemptiveProcess preemptiveProcess = (PreemptiveProcess) process;
			if (preemptiveProcess.getTimeslice().completelyFinished()) {
				expiredPriorityArray.add(process, inFront);
			} else {
				activePriorityArray.add(process, inFront);
			}
		} else {
			expiredPriorityArray.add(process, inFront);
		}
	}

	@Override
	protected int numWaitingProcesses() {
		return activePriorityArray.size()
				+ expiredPriorityArray.size();
	}

	@Override
	public IActiveProcess getNextRunnableProcess(IResourceInstance instance) {
		if (activeQueueEmpty())
			switchActiveAndExpired();
		if (activePriorityArray.isEmpty()) // no process to be scheduled.
			return null;
		return activePriorityArray.getNextRunnableProcess(instance);
	}

	@Override
	public IActiveProcess getNextRunnableProcess() {
		if (activeQueueEmpty())
			switchActiveAndExpired();
		if (activePriorityArray.isEmpty()) // no process to be scheduled.
			return null;
		return activePriorityArray.getNextRunnableProcess();
	}

	private void switchActiveAndExpired() {
		IProcessQueue temp = activePriorityArray;
		activePriorityArray = expiredPriorityArray;
		expiredPriorityArray = temp;
	}

	@Override
	public boolean removePendingProcess(IActiveProcess process) {
		return activePriorityArray.remove(process) ||
			   expiredPriorityArray.remove(process);
	}

	/**
	 * Determines whether the current active queue is empty including the
	 * running and standby processes.
	 */
	protected boolean activeQueueEmpty() {
		return running_on_table.isEmpty() && activePriorityArray.isEmpty();
	}

	@Override
	public IRunQueue createNewInstance() {
		return new ActiveExpiredRunQueue(activePriorityArray);
	}

	@Override
	public List<IActiveProcess> identifyMovableProcesses(
			IResourceInstance targetInstance, boolean prio_increasing, boolean queue_ascending, int processes_needed) {
		List<IActiveProcess> process_list = new ArrayList<IActiveProcess>(); 
		expiredPriorityArray.identifyMovableProcesses(targetInstance, prio_increasing, queue_ascending, processes_needed, process_list) ;
		activePriorityArray.identifyMovableProcesses(targetInstance, prio_increasing, queue_ascending, processes_needed, process_list) ;
		return process_list;
	}

	public IProcessQueue getBestRunnableQueue(
			IResourceInstance instance) {
		IProcessQueue result = activePriorityArray
				.getBestRunnableQueue(instance);
		if (result == null) {
			result = expiredPriorityArray.getBestRunnableQueue(instance);
		}
		return result;
	}

	@Override
	public boolean containsPending(IActiveProcess process) {
		return activePriorityArray.contains(process) || expiredPriorityArray.contains(process);
	}
}
