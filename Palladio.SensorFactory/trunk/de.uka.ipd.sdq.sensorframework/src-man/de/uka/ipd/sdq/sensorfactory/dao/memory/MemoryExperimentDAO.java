package de.uka.ipd.sdq.sensorfactory.dao.memory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import de.uka.ipd.sdq.sensorfactory.entities.Experiment;
import de.uka.ipd.sdq.sensorfactory.entities.dao.IExperimentDAO;
import de.uka.ipd.sdq.sensorfactory.entities.impl.ExperimentImpl;

public class MemoryExperimentDAO implements IExperimentDAO {

	private long nextID = 0;
	private HashMap<Long, Experiment> index = new HashMap<Long, Experiment>();
	
	private MemoryDAOFactory factory;

	public MemoryExperimentDAO(MemoryDAOFactory memoryDAOFactory) {
		this.factory = memoryDAOFactory;
	}

	public synchronized Experiment addExperiment(String p_experimentname) {
		ExperimentImpl result = new ExperimentImpl(factory);
		result.setExperimentID(nextID++);
		result.setExperimentName(p_experimentname);
		
		index.put(result.getExperimentID(),result);
		
		return result;
	}

	public synchronized Experiment get(long id) {
		return index.get(id);
	}

	public synchronized Collection<Experiment> getExperiments() {
		return Collections.unmodifiableCollection(index.values());
	}

	public Collection<Experiment> findByExperimentName(String searchKey) {
		ArrayList<Experiment> result = new ArrayList<Experiment>();
		for (Experiment e:this.index.values()){
			if (e.getExperimentName().equals(searchKey))
				result.add(e);
		}
		return Collections.unmodifiableCollection(result);
	}

}
