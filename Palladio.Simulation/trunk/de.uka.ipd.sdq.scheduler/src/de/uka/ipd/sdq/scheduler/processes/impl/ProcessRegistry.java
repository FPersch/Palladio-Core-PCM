package de.uka.ipd.sdq.scheduler.processes.impl;

import java.util.Hashtable;

import de.uka.ipd.sdq.scheduler.ISchedulableProcess;
import de.uka.ipd.sdq.scheduler.processes.IActiveProcess;
import de.uka.ipd.sdq.scheduler.resources.active.SimActiveResource;


public class ProcessRegistry {
	
	private Hashtable<ISchedulableProcess, IActiveProcess> registry;
	private SimActiveResource resource;
	
	public ProcessRegistry(SimActiveResource resource) {
		super();
		this.registry = new Hashtable<ISchedulableProcess, IActiveProcess>();
		this.resource = resource;
	}

	public void registerProcess(IActiveProcess process){
		registry.put(process.getSchedulableProcess(), process);
		process.getSchedulableProcess().setMainResource(resource);
	}
	
	public IActiveProcess lookUp(ISchedulableProcess process){
		return registry.get(process);
	}
	
	public void unregisterProcess(ISchedulableProcess process){
		registry.remove(process);
	}

	public IActiveProcess findProcess(String processName) {
		for (IActiveProcess p: registry.values()){
			if (p.getName().startsWith(processName))
				return p;
		}
		assert false : "Cannot find process: " + processName;  
		return null;
	}
	
}
