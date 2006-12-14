package de.uka.ipd.sdq.simucomframework.resources;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import desmoj.core.simulator.SimProcess;

public class SimulatedResourceContainer {

	private String myContainerID = null;
	private SimuComModel myModel = null;

	// ResourceTypeID -> SimulatedActiveResource
	// TODO: Multiple Resources with Scheduler
	private HashMap<String, SimulatedActiveResource> activeResources = new HashMap<String, SimulatedActiveResource>();

	// ResourceTypeID -> SimulatedPassiveResource
	private HashMap<String, SimulatedPassiveResource> passiveResources = new HashMap<String, SimulatedPassiveResource>();

	public SimulatedResourceContainer(SimuComModel myModel, String containerID) {
		myContainerID = containerID;
		this.myModel = myModel;
	}

	public void loadActiveResource(SimProcess requestingProcess, String typeID, double demand) {
		System.out.println(typeID + " loaded with "+demand);
		SimulatedActiveResource resource = activeResources.get(typeID);
		resource.consumeResource(requestingProcess, demand);
	}

	public void aquirePassiveResource(SimProcess requestingProcess, String typeID) {
		System.out.println(typeID + " aquire request");
		SimulatedPassiveResource resource = passiveResources.get(typeID);
		resource.aquire(requestingProcess);
	}
	
	public void releasePassiveResource(String typeID) {
		System.out.println(typeID + " release request");
		SimulatedPassiveResource resource = passiveResources.get(typeID);
		resource.release();
	}
	
	public void addActiveResource(String typeID, double d, String units) {
		activeResources.put(typeID, 
				new SimulatedActiveResource(myModel, typeID, d, units));
	}
	
	public void addPassiveResource(String typeID, int capacity) {
		passiveResources.put(typeID, 
				new SimulatedPassiveResource(myModel, typeID, capacity));
	}
	
	public String getResourceContainerID() {
		return myContainerID;
	}

	public Collection<SimulatedActiveResource> getActiveResources() {
		return activeResources.values();
	}

	public Collection<SimulatedPassiveResource> getPassiveResources() {
		return passiveResources.values();
	}
}
