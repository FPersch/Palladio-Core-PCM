package de.uka.ipd.sdq.simucomframework.usage;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.reliability.core.FailureStatistics;
import de.uka.ipd.sdq.scheduler.IActiveResource;
import de.uka.ipd.sdq.simucomframework.Context;
import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;

/**
 * Implementation of the workload driver interface for open workloads
 * 
 * @author Steffen Becker
 * 
 */
public class OpenWorkload extends SimuComSimProcess implements IWorkloadDriver {

	private String interArrivalTime;
	private IUserFactory userFactory;
	private String usageScenarioId;

	private static Logger logger = Logger.getLogger(OpenWorkload.class
			.getName());

	/**
	 * Counter for usage scenario runs.
	 */

	/**
	 * Constructor of the open workload driver
	 * 
	 * @param model
	 *            The simulation model this driver belongs to
	 * @param userFactory
	 *            The factory which is used to bread the users
	 * @param interArrivalTime
	 *            The time to wait between leaving a new user to its fate
	 */
	public OpenWorkload(SimuComModel model, IUserFactory userFactory,
			String interArrivalTime, String usageScenarioId) {
		super(model, "OpenWorkloadUserMaturationChamber");
		this.interArrivalTime = interArrivalTime;
		this.userFactory = userFactory;
		this.usageScenarioId = usageScenarioId;
	}

	public void run() {
		this.scheduleAt(0);
	}

	@Override
	protected void internalLifeCycle() {
		FailureStatistics.getInstance().reset();

		// As long as the simulation is running, new OpenWorkloadUsers are
		// generated and started:
		while (getModel().getSimulationControl().isRunning()) {
			
			try {
				// Generate and execute the new user:
				generateUser();
	
				// Wait for inter-arrival time:
				waitForNextUser();
				
				// Count the new user:
				if (this.getModel().getConfig().getSimulateFailures()) {
					FailureStatistics.getInstance().increaseRunCount();
					FailureStatistics.getInstance().printRunCount(logger);
				}
			}
			catch (OutOfMemoryError e) {
				// the system is overloaded. stop simulation
				logger.info("Stopping simulation run due to memory constraints.");
				getModel().getSimulationControl().stop();
			}
		}

		// Print failure statistics:
		// if (this.getModel().getConfig().getSimulateFailures()) {
		// 	FailureStatistics.getInstance().printFailureStatistics(logger);
		// }
	}

	private void waitForNextUser() {
		double interArrivalTimeSample = (Double) Context.evaluateStatic(
				interArrivalTime, Double.class);
		logger.debug("Waiting for " + interArrivalTimeSample
				+ " before spawing the next user");
		this.hold(interArrivalTimeSample);
	}

	private IUser generateUser() {
		logger.debug("Spawning New User...");
		IUser user = userFactory.createUser(usageScenarioId);
		user.startUserLife();
		return user;
	}

}
