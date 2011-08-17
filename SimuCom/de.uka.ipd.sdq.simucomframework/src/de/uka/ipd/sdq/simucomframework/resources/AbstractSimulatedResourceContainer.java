package de.uka.ipd.sdq.simucomframework.resources;

import java.util.Collection;
import java.util.HashMap;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import de.uka.ipd.sdq.simucomframework.exceptions.ResourceContainerIsMissingRequiredResourceType;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;

/**
 * Base class for simulated resource container. A resource container corresponds
 * to PCM resource container in such that they contain an arbitrary amount
 * of active resources
 * @author Steffen Becker
 *
 */
public abstract class AbstractSimulatedResourceContainer {
	
	protected static Logger logger = 
		Logger.getLogger(AbstractSimulatedResourceContainer.class.getName());
	protected SimuComModel myModel = null;
	protected String myContainerID = null;

	// TODO: Multiple Resources with Scheduler
	protected HashMap<String, AbstractScheduledResource> activeResources = new HashMap<String, AbstractScheduledResource>();
	
	// Resources can also be lookup by the provided resource interface id 
	protected HashMap<String, String> activeResourceProvidedInterfaces = new HashMap<String, String>();
	
	public AbstractSimulatedResourceContainer(SimuComModel myModel, String myContainerID) {
		super();
		this.myModel = myModel;
		this.myContainerID = myContainerID;
		logger.info("Simulated Resource Container created. ContainerID "+myContainerID);
	}

	/**
	 * Demand processing of a resource demand by a given type of active resources
	 * In future versions this has to control schedulers of resource types which
	 * exist in multiple instances
	 * @param requestingProcess The thread requesting the processing of a resouce demand
	 * @param typeID ID of the resource type to which the demand is directed. Same as the
	 * PCM resource type IDs
	 * @param demand The demand in units processable by the resource. The resource is
	 * responsible itself for converting this demand into time spans
	 */
	public void loadActiveResource(SimuComSimProcess requestingProcess, String typeID, double demand) {
		AbstractScheduledResource resource = activeResources.get(typeID);
		if (resource == null) {
			logger.error("Resource container is missing a resource which was attempted to be loaded"+
					" by a component. ID of resource type was: "+typeID);
			throw new ResourceContainerIsMissingRequiredResourceType(typeID);
		}
		resource.consumeResource(requestingProcess, 1, demand);
	}
	
	/**
	 * Demand processing of a resource demand by a given type of active resource and a resource interface operation
	 * @param requestingProcess The thread requesting the processing of a resource demand
	 * @param typeID ID of the resource provided interface to which the demand is directed.
	 * @param resourceServiceID the id of the resource service to be called.
	 * @param demand The demand in units processable by the resource. The resource is
	 * responsible itself for converting this demand into time spans
	 */
	public void loadActiveResource(SimuComSimProcess requestingProcess, String providedInterfaceID, int resourceServiceID, double demand) {
		AbstractScheduledResource resource = null;
		String typeID = activeResourceProvidedInterfaces.get(providedInterfaceID);
		if (typeID != null) {
			resource = activeResources.get(typeID);
		}
		if (resource == null) {
			logger.error("Resource container is missing a resource which was attempted to be loaded"+
					" by a component. ID of resource type was: "+typeID);
			throw new ResourceContainerIsMissingRequiredResourceType(typeID);
		}
		resource.consumeResource(requestingProcess, resourceServiceID, demand);
	}

	/**
	 * @return All active resources in this resource container
	 */
	public Collection<AbstractScheduledResource> getActiveResources() {
		return activeResources.values();
	}

	/**
	 * @return The ID of the resource container itself
	 */
	public String getResourceContainerID() {
		return myContainerID;
	}
	
}
