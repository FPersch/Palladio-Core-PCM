package de.uka.ipd.sdq.scheduler.resources.active;

import de.uka.ipd.sdq.scheduler.factory.SchedulingFactory;
import umontreal.iro.lecuyer.simevents.Event;

public class PostSchedulingEvent extends Event {

	private SimActiveResource containing_resource;
	private SimResourceInstance instance;

	public PostSchedulingEvent(SimActiveResource containing_resource,
			SimResourceInstance simResourceInstance) {
		super(SchedulingFactory.getUsedSimulator());
		this.containing_resource = containing_resource;
		this.instance = simResourceInstance;
	}

	@Override
	public void actions() {
		containing_resource.getScheduler().postSchedule(instance);
	}

}
