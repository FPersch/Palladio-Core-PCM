package de.uka.ipd.sdq.codegen.simucontroller;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.codegen.simucontroller.actions.ISimuComControl;
import de.uka.ipd.sdq.codegen.simucontroller.views.SimuView;
import de.uka.ipd.sdq.simucomframework.IStatusObserver;
import de.uka.ipd.sdq.simucomframework.SimuComStatus;

public class SimuComJob extends Job implements IStatusObserver {

	private ISimuComControl control;
	private IProgressMonitor monitor;
	private SimuView myView;
	private int lastProgress;
	
	private String errorMessage;
	private SimuComStatus status;
	private long maxSimulationTime;

	public SimuComJob(ISimuComControl control, long maxSimulationTime, SimuView myView) {
		super("Simulation Run");
		this.control = control;
		this.myView = myView;
		this.maxSimulationTime = maxSimulationTime;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		this.monitor = monitor;
		lastProgress = 0;
		monitor.beginTask("Simulation Run", 100);
		try {
			status = control.startSimulation(maxSimulationTime, this);
		} catch (Exception e) {
			return Status.CANCEL_STATUS;
		} finally {
			monitor.done();
		}
		if (status == SimuComStatus.ERROR){
			this.errorMessage = control.getErrorMessage();
		}
		return Status.OK_STATUS;
	}

	public void updateStatus(final int percentDone) {
		// if (myView instanceof SimuView){
		// SimuView simuView = (SimuView) myView;
		// simuView.updateProgressBar(percentDone);
		// }
		if (lastProgress < percentDone) {
			monitor.worked(percentDone - lastProgress);
			lastProgress = percentDone;
		}
		if (myView != null) {
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

				public void run() {
					myView.updateProgressBar(percentDone);
				}

			});
		}
		if (monitor.isCanceled()) {
			control.stopSimulation();
		}
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public SimuComStatus getStatus() {
		return status;
	}
}