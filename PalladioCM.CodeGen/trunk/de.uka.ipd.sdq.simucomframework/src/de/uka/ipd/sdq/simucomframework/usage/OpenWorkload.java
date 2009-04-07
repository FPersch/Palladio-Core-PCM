package de.uka.ipd.sdq.simucomframework.usage;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.scheduler.IActiveResource;
import de.uka.ipd.sdq.simucomframework.Context;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.SimProcess;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;


/**
 * Implementation of the workload driver interface for open workloads
 * @author Steffen Becker
 *
 */
public class OpenWorkload extends SimProcess implements IWorkloadDriver {

	private static final int USER_THRESHOLD = 1000;
	private String interArrivalTime;
	private IUserFactory userFactory;

	private static Logger logger = 
		Logger.getLogger(OpenWorkload.class.getName());
	
	/**
	 * Constructor of the open workload driver
	 * @param model The simulation model this driver belongs to
	 * @param userFactory The factory which is used to bread the users
	 * @param interArrivalTime The time to wait between leaving a new user to its fate
	 */
	public OpenWorkload(SimuComModel model, IUserFactory userFactory, String interArrivalTime) {
		super(model,"OpenWorkloadUserMaturationChamber");
		this.interArrivalTime = interArrivalTime;
		this.userFactory = userFactory;
	}

	public void run() {
		this.scheduleAt(0);
	}

	@Override
	protected void internalLifeCycle() {
		try {
			while(getModel().getSimulationControl().isRunning()) {
				generateUser();
				waitForNextUser();
				if (Thread.activeCount() > USER_THRESHOLD) {
					logger.error("Too many users spawned. Check your workload settings and try a lower workload.");
					throw new RuntimeException("Too many users spawned");
				}
			}
		} catch (OutOfMemoryError e){
			logger.error("The simulation is out of memory, probably because too many users spawned. Check your workload settings and try a lower workload.");
			throw new RuntimeException("Too many users spawned", e);
		}
	}

	private void waitForNextUser() {
		double interArrivalTimeSample = (Double)Context.evaluateStatic(interArrivalTime,Double.class);
		logger.info("Waiting for "+interArrivalTimeSample+" before spawing the next user");
		this.hold(interArrivalTimeSample);
	}

	private void generateUser() {
		logger.info("Spawning New User...");
		userFactory.createUser().startUserLife();
	}

	public void addTerminatedObserver(IActiveResource o) {
		// TODO Auto-generated method stub
		throw new RuntimeException("The method OpenWorkload.addTerminatedObserver has not been implemented yet.");
	}

	public void fireTerminated() {
		// TODO Auto-generated method stub
		throw new RuntimeException("The method OpenWorkload.fireTerminated has not been implemented yet.");
	}

	public void removeTerminatedObserver(IActiveResource o) {
		// TODO Auto-generated method stub
		throw new RuntimeException("The method OpenWorkload.removeTerminatedObserver has not been implemented yet.");
	}	
}
