package de.uka.ipd.sdq.scheduler.resources.active.special;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Random;

import de.uka.ipd.sdq.probfunction.math.util.MathTools;
import de.uka.ipd.sdq.scheduler.IRunningProcess;
import de.uka.ipd.sdq.scheduler.ISchedulableProcess;
import de.uka.ipd.sdq.scheduler.LoggingWrapper;
import de.uka.ipd.sdq.scheduler.SchedulerModel;
import de.uka.ipd.sdq.scheduler.entities.SchedulerEntity;
import de.uka.ipd.sdq.scheduler.resources.active.AbstractActiveResource;
import de.uka.ipd.sdq.simulation.abstractsimengine.AbstractSimEventDelegator;
import de.uka.ipd.sdq.simulation.abstractsimengine.IEntity;
import de.uka.ipd.sdq.simulation.abstractsimengine.NullEntity;

/**
 * This class is for testing purposes only. It is used for the MASCOTS paper case study. 
 * @author hauck
 *
 */
public class SimProcessorSharingResourceWindows extends AbstractActiveResource {
	
	private class DoLoadBalancingEvent extends AbstractSimEventDelegator<NullEntity> {
		
		public DoLoadBalancingEvent(SchedulerModel model) {
			super(model, SimProcessorSharingResourceWindows.class.getName());
		}
		

		@Override
		 public void eventRoutine(NullEntity who) {
			//System.out.println(simulator.time() + ": Trying load balancing...");
			int coreToBalanceTo = getCoreWithShortestQueue();
			int coreToBalanceFrom = getCoreWithLongestQueue();
			if ((running_processesPerCore.get(coreToBalanceTo).size() == 0) && (running_processesPerCore.get(coreToBalanceFrom).size() > 0)) {
				// We have an idle core. Do load balancing.
				
				// select a random process from the sender core
				Hashtable<ISchedulableProcess, Double> runningProcesses = running_processesPerCore.get(coreToBalanceFrom);
				ISchedulableProcess[] processes = runningProcesses.keySet().toArray(new ISchedulableProcess[]{});
			
				// move random process from sender core to idle core
				Random random = new Random();
				ISchedulableProcess processToBalance = processes[random.nextInt(processes.length)];
				double simTime = getModel().getSimulationControl().getCurrentSimulationTime();
				System.out.println(simTime + ": Balancing process: " + processToBalance.getId() + " from core " + coreToBalanceFrom + " to " + coreToBalanceTo);
				Double processValue = runningProcesses.get(processToBalance);
				runningProcesses.remove(processToBalance);
				putProcessOnCore(processToBalance, processValue, coreToBalanceTo);
				
			} else {
			//	System.out.println(simulator.time() + ": No load balancing needed.");
			}
			
		}

	}
	
	private class ProcessingFinishedEvent extends AbstractSimEventDelegator<ISchedulableProcess> {
		
		public ProcessingFinishedEvent(SchedulerModel model) {
			super(model, ProcessingFinishedEvent.class.getName());
		}

		@Override
		public void eventRoutine(ISchedulableProcess process) {
			ISchedulableProcess last = process;
			toNow();
			// NEW
			int core = getCoreOfARunningProcess(last);
			running_processesPerCore.get(core).remove(last);
			// running_processes.remove(last);
			// TODO: now, we have to check, if we have to perform load
			// balancing.
			// And probably re-calculate times?
			
			// suggestion:
			if (running_processesPerCore.get(core).size() == 0) {
				int coreToBalanceFrom = getCoreWithLongestQueue();
				if (running_processesPerCore.get(coreToBalanceFrom).size() <= 1) {
					// all cores are idle or have no contention
				} else {
					// Try load balancing one time unit from now
                    DoLoadBalancingEvent event = new DoLoadBalancingEvent(SimProcessorSharingResourceWindows.this
                            .getModel());
					double simTime = getModel().getSimulationControl().getCurrentSimulationTime();
					event.schedule(IEntity.NULL, simTime+1);
				}
			}
		//	System.out.println(simulator.time() + ": " + last.getId() + " finished");
			// LoggingWrapper.log(last + " finished.");
			scheduleNextEvent();
			last.activate();
		}
		
	}
	
	private ProcessingFinishedEvent processingFinished = new ProcessingFinishedEvent(null);
	private ArrayList<Hashtable<ISchedulableProcess,Double>> running_processesPerCore = new ArrayList<Hashtable<ISchedulableProcess, Double>>();
	// private Hashtable<ISchedulableProcess,Double> running_processes = new
	// Hashtable<ISchedulableProcess, Double>();
	private double last_time; 
	private int coreToUseForInitialLoadBalancing = 0;

	public SimProcessorSharingResourceWindows(SchedulerModel model, String name, String id, int numberOfCores) {
		super(model, numberOfCores, name, id);
		for (int j=0; j<numberOfCores; j++) {
			running_processesPerCore.add(new Hashtable<ISchedulableProcess, Double>());
		}
	}


	
	public void scheduleNextEvent() {
		/**
		 * New: look in all queues, i.e. in all nested running_processes
		 * hashtables, which process is to be scheduled next.
		 */
		ISchedulableProcess shortest = null;
		Double shortestTime = 0.0;
		for (Hashtable<ISchedulableProcess, Double> running_processes : running_processesPerCore) {
			for (ISchedulableProcess process : running_processes.keySet()) {
			//	System.out.println("Time: " + simulator.time() + ", looking for shortest time: " + process.getId() + " time: " + running_processes.get(process) + ", speed: " + getSpeed(process));
				if (shortest == null || shortestTime > running_processes.get(process) * getSpeed(process)){
					shortest = process;
					shortestTime = running_processes.get(process) * getSpeed(process);
				//	System.out.println("Shortest: " + shortest.getId() + ", shortest time: " + shortestTime);
				}
			}
		}
	
		processingFinished.removeEvent();
		if (shortest!=null){
			// New: calculate time for process
			double time = shortestTime;// * getSpeed(shortest);
			// double time = running_processes.get(shortest) * getSpeed();
		//	System.out.println("Time: " + simulator.time() + ", scheduling event at " + time);
			if (!MathTools.less(0, time)) {
                time = 0.0;
            }
			processingFinished.schedule(shortest, time);
		}
	}
	
	private int getCoreOfARunningProcess(ISchedulableProcess process) {
		for (int i=0; i<running_processesPerCore.size(); i++) {
			Hashtable<ISchedulableProcess, Double> running_processes = running_processesPerCore.get(i);
			if (running_processes.containsKey(process)) {
				return i;
			}
		}
		LoggingWrapper.logger.warn("Core of process not found. Returning core 0.");
		return 0;
	}
	
	private int getCoreWithLongestQueue() {
		int coreWithLongestQueue = 0;
		int queueSize = 0;
		for (int i=0; i<running_processesPerCore.size(); i++) {
			if (running_processesPerCore.get(i).size() > queueSize) {
				queueSize = running_processesPerCore.get(i).size();
				coreWithLongestQueue = i;
			}
		}
		return coreWithLongestQueue;
	}
	
	private int getCoreWithShortestQueue() {
		int coreWithShortestQueue = -1;
		int queueSize = 0;
		for (int i=0; i<running_processesPerCore.size(); i++) {
			if (coreWithShortestQueue == -1) {
				queueSize = running_processesPerCore.get(i).size();
				coreWithShortestQueue = i;
			} else {
				if (running_processesPerCore.get(i).size() < queueSize) {
					queueSize = running_processesPerCore.get(i).size();
					coreWithShortestQueue = i;
				}
			}
		}
		return coreWithShortestQueue;
	}


	private void toNow() {
		double now = getModel().getSimulationControl().getCurrentSimulationTime();
		double passed_time = now - last_time;
		// System.out.println("toNow: " + now + " - " + last_time + " = " +
		// passed_time);
		if (MathTools.less(0, passed_time)){
			// passed_time /= getSpeed();
			// NEW
			for (Hashtable<ISchedulableProcess, Double> running_processes : running_processesPerCore) {
				for (Entry<ISchedulableProcess,Double> e : running_processes.entrySet()) {
					double processPassedTime = passed_time / getSpeed(e.getKey());
					double rem =   e.getValue() - processPassedTime;
					// System.out.println("toNow " + e.getKey().getId() + ": " +
					// e.getValue() + " - " + processPassedTime + " = " + rem);
					e.setValue(rem);
				}
			}
		}
		last_time = now;
	}
	
	@Override
	public double getRemainingDemand(ISchedulableProcess process) {
		boolean hasDemand = false;
		for (Hashtable<ISchedulableProcess, Double> running_processes : running_processesPerCore) {
			if (running_processes.containsKey(process)) {
				hasDemand = true;
				break;
			}
		}
		if (hasDemand == false) {
			return 0.0;
		}
		toNow();
		for (Hashtable<ISchedulableProcess, Double> running_processes : running_processesPerCore) {
			if (!running_processes.contains(process)) {
				return running_processes.get(process);
			}
		}
		// Should not be reached.
		return 0.0;
	}
	
	@Override
	public void updateDemand(ISchedulableProcess process, double demand) {
		for (Hashtable<ISchedulableProcess, Double> running_processes : running_processesPerCore) {
			for (Entry<ISchedulableProcess,Double> e : running_processes.entrySet()) {
				if (e.getKey().equals(process)) {
					e.setValue(demand);
					break;
				}
			}
		}
		scheduleNextEvent();
	}

    // New: calculate speed for a process.
	private double getSpeed(ISchedulableProcess process) {
		int core = getCoreOfARunningProcess(process);
		double speed = (double)running_processesPerCore.get(core).size();
		// double speed = (double)running_processes.size() /
		// (double)getCapacity();
		
		// comparison here is unnecessary, speed cannot be lower than 1. Keep it
		// anyway.
		return speed < 1.0 ? 1.0 : speed;
	}


	public void start() {
	}


	@Override
	protected void dequeue(ISchedulableProcess process) {
	}


	@Override
	protected void doProcessing(ISchedulableProcess process, int resourceServiceID, double demand) {
		toNow();
		LoggingWrapper.log("PS: " + process + " demands " + demand);
		//System.out.println("PS: " + process.getId() + " demands " + demand);
		int coreToPutOn = getLastCoreProcessWasRunningOn(process);
		if (coreToPutOn == -1) {
			// This is a new process which has issued demand for the first time.
			// New: Select core for initial load balancing based on cyclic
			// splitting
			putProcessOnCore(process, demand, coreToUseForInitialLoadBalancing);
			// running_processes.put(process, demand);
			coreToUseForInitialLoadBalancing++;
			if (coreToUseForInitialLoadBalancing>=getCapacity()) {
				// start with first core again next time
				coreToUseForInitialLoadBalancing = 0;
			}
		} else {
			putProcessOnCore(process, demand, coreToPutOn);
			// running_processesPerCore.get(coreToPutOn).put(process, demand);
		}
		
		// I don't know if this is right here.
		// I call toNow() again to update all processes (some processes might
		// now share the core with the new process)
		toNow();
		scheduleNextEvent();
		process.passivate();
	}

	@Override
	protected void enqueue(ISchedulableProcess process) {
	}


	public void stop() {
		
	}

	public void registerProcess(ISchedulableProcess process) {
	}
	
	public int getQueueLengthFor(SchedulerEntity schedulerEntity) {
		// TODO where is this needed? Return hard coded queue length of first
		// core.
		return this.running_processesPerCore.get(0).size();
		// return this.running_processes.size();
	}
	
	private Hashtable<ISchedulableProcess,Integer> all_processes = new Hashtable<ISchedulableProcess, Integer>();
	
	/**
	 * return -1 if a process was not running before, i.e. is a new process.
	 * 
	 * @param process
	 * @return
	 */
	private int getLastCoreProcessWasRunningOn(ISchedulableProcess process) {
		if (all_processes.containsKey(process)) {
			return all_processes.get(process);
		}
		return -1;
	}
	
	private void putProcessOnCore(ISchedulableProcess process, double demand, int core) {
		if (all_processes.containsKey(process)) {
			all_processes.remove(process);
		}
		all_processes.put(process, core);
		//System.out.println(simulator.time() + ": Putting " + process.getId() + " with demand " + demand + " on core " + core);
		running_processesPerCore.get(core).put(process, demand); 
	}

}
