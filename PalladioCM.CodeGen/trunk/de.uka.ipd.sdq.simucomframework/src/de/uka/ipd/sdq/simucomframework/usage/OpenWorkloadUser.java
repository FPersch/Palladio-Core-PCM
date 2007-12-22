package de.uka.ipd.sdq.simucomframework.usage;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.simucomframework.SimuComStatus;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.ISimProcessDelegate;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.SimProcess;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;

/**
 * Base class for open workload users. Open workload users begin their life,
 * execute their behaviour once, and then they die
 * @author Steffen Becker
 *
 */
public class OpenWorkloadUser extends SimProcess implements IUser {

	private IScenarioRunner scenarioRunner;
	private static Logger logger = 
		Logger.getLogger(OpenWorkloadUser.class.getName());

	public OpenWorkloadUser(SimuComModel owner, String name, IScenarioRunner scenarioRunner) {
		super(owner, name);
		this.scenarioRunner = scenarioRunner;
	}

	/* (non-Javadoc)
	 * @see desmoj.core.simulator.SimProcess#lifeCycle()
	 */
	@Override
	public void lifeCycle() {
		try {
			logger.debug(this.getName()+" started! I'm alive!!!");
			scenarioRunner(this);
			logger.debug(this.getName()+" done! I'm dying!!!");
//		} catch (SimFinishedException ex) {
		} catch (Exception e) {
			this.getModel().getSimulationControl().stop();
			((SimuComModel)getModel()).setStatus(SimuComStatus.ERROR,
					e);
		}
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.simucomframework.usage.IScenarioRunner#scenarioRunner(desmoj.core.simulator.SimProcess)
	 */
	public void scenarioRunner(SimProcess thread) {
		this.scenarioRunner.scenarioRunner(thread);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.simucomframework.usage.IUser#startUserLife()
	 */
	public void startUserLife() {
		this.scheduleAt(0);
	}
}
