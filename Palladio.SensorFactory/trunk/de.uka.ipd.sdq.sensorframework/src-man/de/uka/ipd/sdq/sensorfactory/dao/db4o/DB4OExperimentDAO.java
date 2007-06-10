package de.uka.ipd.sdq.sensorfactory.dao.db4o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.ext.ExtObjectContainer;
import com.db4o.query.Predicate;

import de.uka.ipd.sdq.sensorfactory.dao.db4o.entities.ExperimentImpl;
import de.uka.ipd.sdq.sensorfactory.entities.Experiment;
import de.uka.ipd.sdq.sensorfactory.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorfactory.entities.dao.IDAOFactory;
import de.uka.ipd.sdq.sensorfactory.entities.dao.IExperimentDAO;

public class DB4OExperimentDAO implements IExperimentDAO {

	private IDAOFactory factory;
	private ObjectContainer db;
	private IDGenerator idGen;
	
	public DB4OExperimentDAO(DB4ODAOFactory factory, ObjectContainer db, IDGenerator idGen) {
		this.factory = factory;
		this.db = db;
		this.idGen = idGen;
	}

	public synchronized Experiment addExperiment(String p_experimentname) {
		ExperimentImpl result = new ExperimentImpl(factory);
		result.setExperimentID(idGen.getNextExperimentID());
		result.setExperimentName(p_experimentname);
		
		db.set(result);
		db.commit();
		
		return result;
	}

	public synchronized Experiment get(long id) {
		ExperimentImpl result = new ExperimentImpl(factory);
		result.setExperimentID(id);
		return (Experiment) db.get(result).get(0);
	}

	public synchronized Collection<Experiment> getExperiments() {
		return Collections.unmodifiableCollection(db.query(Experiment.class));
	}

	public Collection<Experiment> findByExperimentName(final String searchKey) {
		List<Experiment> resultList = db.query(new Predicate<Experiment>() {
		          public boolean match(Experiment experiment) {
		              return experiment.getExperimentName().equals(searchKey);
		          }
		});  
		return Collections.unmodifiableCollection(resultList);
	}

	@Override
	public void store(Experiment e) {
		// Update this, the sensor collection and the run collection
		((ExtObjectContainer)db).set(e,2);
		for (ExperimentRun er:e.getExperimentRuns())
			factory.createExperimentRunDAO().store(er);
		db.commit();
	}

}
