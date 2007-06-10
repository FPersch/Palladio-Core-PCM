package de.uka.ipd.sdq.sensorfactory.dao.db4o;

import java.util.Collection;
import java.util.Date;

import com.db4o.ObjectContainer;
import com.db4o.ext.ExtObjectContainer;

import de.uka.ipd.sdq.sensorfactory.dao.db4o.entities.ExperimentRunImpl;
import de.uka.ipd.sdq.sensorfactory.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorfactory.entities.dao.IDAOFactory;
import de.uka.ipd.sdq.sensorfactory.entities.dao.IExperimentRunDAO;
import de.uka.ipd.sdq.sensorfactory.entities.impl.ExperimentImpl;

public class DB4OExperimentRunDAO implements IExperimentRunDAO {

	private ObjectContainer db;
	private IDAOFactory factory;
	private IDGenerator idGen;

	public DB4OExperimentRunDAO(IDAOFactory factory, ObjectContainer db, IDGenerator idGen) {
		this.factory = factory;
		this.db = db;
		this.idGen = idGen;
	}

	public ExperimentRun addExperimentRun(String p_experimentdatetime) {
		ExperimentRun result = new ExperimentRunImpl(this.factory,db);
		result.setExperimentRunID(idGen.getNextExperimentRunID());
		result.setExperimentDateTime(new Date().toString());
		
		db.set(result);
		db.commit();
		
		return result;
	}

	public ExperimentRun get(long id) {
		ExperimentRunImpl result = new ExperimentRunImpl(factory,db);
		result.setExperimentRunID(id);
		return (ExperimentRun) db.get(result).get(0);
	}

	public Collection<ExperimentRun> getExperimentRuns() {
		return db.query(ExperimentRun.class);
	}

	public void store(ExperimentRun er) {
		((ExtObjectContainer)db).set(er,2);
	}

}
