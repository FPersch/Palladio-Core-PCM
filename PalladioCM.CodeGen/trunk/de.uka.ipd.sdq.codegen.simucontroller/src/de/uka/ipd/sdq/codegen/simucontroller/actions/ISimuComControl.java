package de.uka.ipd.sdq.codegen.simucontroller.actions;

import de.uka.ipd.sdq.simucomframework.IStatusObserver;
import de.uka.ipd.sdq.simucomframework.SimuComStatus;

public interface ISimuComControl {

	public SimuComStatus startSimulation(long maxSimulationTime, IStatusObserver statusObserver);
	public void stopSimulation();
	public String getErrorMessage();
}
