package de.uka.ipd.sdq.capra.simulator.resources.scheduling;


public interface IPreemptiveJobManager extends IJobManager {
	
	IScheduledJob dequeue();
	
	void enqueue(IScheduledJob job);

	IScheduledJob getCurrentJob();

	void requestNewTimeSlice(IScheduledJob job);

	void balanceQueues();

}
