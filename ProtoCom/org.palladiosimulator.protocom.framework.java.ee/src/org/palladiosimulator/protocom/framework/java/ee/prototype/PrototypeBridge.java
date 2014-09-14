package org.palladiosimulator.protocom.framework.java.ee.prototype;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Singleton;

/**
 *
 * @author Christian Klaussner
 */
@Singleton
public final class PrototypeBridge {
	private Container[] containers;
	private IUsageScenario[] scenarios;
	private System system;
	private Allocation[] allocations;

	public void setContainers(Container[] containers) {
		this.containers = containers;
	}

	public Container[] getContainers() {
		return containers;
	}

	public void setUsageScenarios(IUsageScenario[] scenarios) {
		this.scenarios = scenarios;
	}

	public IUsageScenario[] getUsageScenarios() {
		return scenarios;
	}

	public void setSystem(System system) {
		this.system = system;
	}

	/**
	 *
	 * @return
	 */
	public System getSystem() {
		return system;
	}

	/**
	 *
	 * @param allocations
	 */
	public void setAllocations(Allocation[] allocations) {
		this.allocations = allocations;
	}

	/**
	 *
	 * @return
	 */
	public Allocation[] getAllocations() {
		return allocations;
	}

	/**
	 * Gets the allocations for the specified container.
	 * @param containerId
	 * @return
	 */
	public Allocation[] getAllocations(String containerId) {
		List<Allocation> list = new LinkedList<Allocation>();

		for (Allocation allocation : allocations) {
			if (allocation.getContainerId().equals(containerId)) {
				list.add(allocation);
			}
		}

		return list.toArray(new Allocation[0]);
	}
}