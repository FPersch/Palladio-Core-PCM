package de.uka.ipd.sdq.scheduler.resources.balancing;

import de.uka.ipd.sdq.scheduler.resources.SimResourceInstance;

public interface IResourceInstanceConstraint {

	/**
	 * Checks whether this process can run on the specified resource instance.
	 */
	public abstract boolean check(SimResourceInstance instance);

}
