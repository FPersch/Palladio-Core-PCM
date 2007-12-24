package de.uka.ipd.sdq.scheduler.resources.passive;

import de.uka.ipd.sdq.scheduler.IRunningProcess;
import de.uka.ipd.sdq.scheduler.ISchedulableProcess;
import de.uka.ipd.sdq.scheduler.LoggingWrapper;
import de.uka.ipd.sdq.scheduler.priority.IPriorityBoost;
import de.uka.ipd.sdq.scheduler.processes.IActiveProcess;
import de.uka.ipd.sdq.scheduler.processes.impl.PreemptiveProcess;
import de.uka.ipd.sdq.scheduler.processes.impl.ProcessWithPriority;
import de.uka.ipd.sdq.scheduler.resources.IResourceInstance;
import de.uka.ipd.sdq.scheduler.resources.active.SimActiveResource;

public class SimFairPassiveResource extends SimAbstractPassiveResource {

	public SimFairPassiveResource(int capacity, String name, String id,
			IPriorityBoost priority_boost, SimActiveResource managing_resource) {
		super(capacity, name, id, priority_boost, managing_resource);
	}

	private boolean canProceed(IRunningProcess process, int num) {
		return (waiting_queue.isEmpty() || waiting_queue.peek().getProcess()
				.equals(process))
				&& num <= capacity;
	}

	public boolean acquire(ISchedulableProcess sched_process, int num) {
		PreemptiveProcess process = (PreemptiveProcess)main_resource.lookUp(sched_process);
		if (canProceed(process, num)) {
			grantAccess(process, num);
			return true;
		} else {
			LoggingWrapper.log("Process " + process + " is waiting for " + num
					+ " of " + this);
			WaitingProcess waiting_process = new WaitingProcess(process, num);
			fromRunningToWaiting(waiting_process, false);
			process.getSchedulableProcess().passivate();
			return false;
		}
	}

	public void release(ISchedulableProcess sched_process, int num) {
		IActiveProcess process = main_resource.lookUp(sched_process);
		
		LoggingWrapper.log("Process " + process + " releases " + num + " of "
				+ this);
		capacity += num;
		notifyWaitingProcesses(process.getLastInstance());
	}

	private void notifyWaitingProcesses(IResourceInstance current) {
		WaitingProcess waitingProcess = waiting_queue.peek();
		if (waitingProcess != null) {
			if (tryToDequeueProcess(waitingProcess))
				fromWaitingToReady(waitingProcess, current);
		}
	}

	private void grantAccess(PreemptiveProcess process, int num) {
		LoggingWrapper.log("Process " + process + " acquires " + num + " of "
				+ this);
		boostPriority(process);
		punish(process);
		capacity -= num;
		assert capacity >= 0 : "More resource than available have been acquired!";
	}

	/**
	 * Tries to remove the given process from the waiting queue and get access
	 * of the required number of passive resources.
	 * 
	 * @param waitingProcess
	 * @return True if the process was successfully dequeued and activated,
	 *         otherwise false.
	 */
	private boolean tryToDequeueProcess(WaitingProcess waitingProcess) {
		if (canProceed(waitingProcess.getProcess(), waitingProcess
				.getNumRequested())) {
			grantAccess((ProcessWithPriority)waitingProcess.getProcess(), waitingProcess
					.getNumRequested());
			return true;
		}
		return false;
	}

}
