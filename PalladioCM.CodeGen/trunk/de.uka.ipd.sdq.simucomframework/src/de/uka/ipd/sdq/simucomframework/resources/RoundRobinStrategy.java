package de.uka.ipd.sdq.simucomframework.resources;

import java.util.ArrayList;

import de.uka.ipd.sdq.simucomframework.resources.SimulatedActiveResource.JobAndDemandStruct;

public class RoundRobinStrategy implements ISchedulingStrategy {

	protected ArrayList<JobAndDemandStruct> runQueue = new ArrayList<JobAndDemandStruct>();
	
	@Override
	public void addJob(JobAndDemandStruct demand) {
		runQueue.add(demand);
	}

	@Override
	public double getTimeWhenNextJobIsDone() {
		double currentMin = runQueue.get(0).getDemand();
		
		for(JobAndDemandStruct job : runQueue){
			if (job.getDemand() < currentMin)
				currentMin = job.getDemand();
		}
		return currentMin * runQueue.size();
	}

	@Override
	public boolean hasMoreJobs() {
		return runQueue.size() > 0;
	}

	@Override
	public void processPassedTime(double timePassed) {
		int count = runQueue.size();
		for(JobAndDemandStruct job : runQueue){
			job.reduceDemand(timePassed/count);
		}
	}

	@Override
	public JobAndDemandStruct removeFinshedJob() {
		JobAndDemandStruct currentMin = runQueue.get(0);
		
		for(JobAndDemandStruct job : runQueue){
			if (job.getDemand() < currentMin.getDemand())
				currentMin = job;
		}
		if (Math.abs(currentMin.getDemand()) > Math.pow(10, -3))
			throw new RuntimeException("Job finished, but demand > 0");
		runQueue.remove(currentMin);
		return currentMin;
	}

	@Override
	public int getTotalJobCount() {
		return runQueue.size();
	}

}
