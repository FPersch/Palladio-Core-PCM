package de.uka.ipd.sdq.simucomframework.ssj;

import de.uka.ipd.sdq.simucomframework.abstractSimEngine.Entity;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.IEntityDelegate;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.ISimEngineFactory;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.ISimEventDelegate;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.ISimProcessDelegate;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.ISimulationControlDelegate;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.SimEvent;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.SimProcess;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;

public class SSJSimEngineFactory implements ISimEngineFactory {

	@Override
	public ISimulationControlDelegate createSimulationControl(SimuComModel model) {
		ISimulationControlDelegate delegate = new SSJExperiment(model);
		model.setSimulationControl(delegate);
		model.setSimulationEngineFactory(this);
		
		return delegate;
	}

	@Override
	public ISimProcessDelegate createSimProcess(SimProcess myProcess, SimuComModel model, String name) {
		return new SSJSimProcess(
				myProcess,
				name);
	}

	@Override
	public ISimEventDelegate createSimEvent(SimEvent myEvent, SimuComModel model, String name) {
		return new SSJSimEvent(
				myEvent,
				name);
	}

	@Override
	public IEntityDelegate createEntity(Entity e, SimuComModel model, String name) {
		return new SSJEntity(
				e,
				name);
	}

}
