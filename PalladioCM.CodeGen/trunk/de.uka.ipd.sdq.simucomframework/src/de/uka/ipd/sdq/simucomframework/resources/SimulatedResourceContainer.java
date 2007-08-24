package de.uka.ipd.sdq.simucomframework.resources;

import java.util.Collection;
import java.util.HashMap;

import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import desmoj.core.simulator.SimProcess;

public class SimulatedResourceContainer extends AbstractSimulatedResourceContainer {
	
	// ResourceTypeID -> SimulatedPassiveResource
	// TODO: Becomes soon deprecated
	private HashMap<String, SimulatedPassiveResource> passiveResources = new HashMap<String, SimulatedPassiveResource>();

	public SimulatedResourceContainer(SimuComModel myModel, String containerID) {
		super(myModel,containerID);
	}

	public void acquirePassiveResource(SimProcess requestingProcess, String typeID) {
		logger.info(typeID + " acquire request");
		SimulatedPassiveResource resource = passiveResources.get(typeID);
		resource.acquire(requestingProcess);
	}
	
	public void releasePassiveResource(String typeID) {
		logger.info(typeID + " release request");
		SimulatedPassiveResource resource = passiveResources.get(typeID);
		resource.release();
	}
		
	public void addPassiveResource(String typeID, int capacity) {
		passiveResources.put(typeID, 
				new SimulatedPassiveResource(myModel, typeID, capacity));
	}
	
	public Collection<SimulatedPassiveResource> getPassiveResources() {
		return passiveResources.values();
	}

	public void addActiveResource(String typeID, String description, String processingRate, String units, SchedulingStrategy strategy) {
		activeResources.put(typeID, 
				new SimulatedActiveResource(myModel, typeID, description, processingRate, units, strategy));
	}
	
}
