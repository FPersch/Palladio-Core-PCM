package de.uka.ipd.sdq.simucomframework.resources;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.reliability.core.FailureStatistics;
import de.uka.ipd.sdq.scheduler.IActiveResource;
import de.uka.ipd.sdq.scheduler.ISchedulableProcess;
import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import de.uka.ipd.sdq.simucomframework.exceptions.FailureException;
import de.uka.ipd.sdq.simucomframework.exceptions.ThroughputZeroOrNegativeException;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simucomframework.variables.StackContext;
import de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter;

/**
 * Realizes a LinkingResource. Adds the latency time to the 
 * passed demand in {@link #consumeResource(SimuComSimProcess, double)},
 * and they is loaded by latency + demand / throughput. 
 * 
 * @author hauck, brosch, merkle
 * 
 */
public class SimulatedLinkingResource extends AbstractScheduledResource {

	protected static Logger logger = Logger
			.getLogger(SimulatedLinkingResource.class.getName());

	private String throughput;
	private String latencySpec;
	private static long resourceId = 1;
	private String id;

	private double totalDemandedTime;
	private boolean utilizationSet = false;

	// private SimpleTimeSpanSensor demandedTimeSensor;
	// private OverallUtilisationSensor utilisationSensor;

	public SimulatedLinkingResource(String id, SimuComModel simuComModel,
			String typeID, String resourceContainerID, String resourceTypeID,
			String description, String d, String latencySpec,
			Double failureProbability) {
		super(simuComModel, typeID, resourceContainerID, resourceTypeID,
				description, SchedulingStrategy.FCFS, 1, false);
		this.id = id;
		this.latencySpec = latencySpec;
		this.throughput = d;
		this.failureProbability = failureProbability;
		this.canFail = (simuComModel.getConfiguration().getSimulateFailures() && this.failureProbability > 0.0);

	}

	public String getId() {
		return id;
	}

	@Override
	protected IActiveResource createActiveResource(SimuComModel simuComModel) {
		// this.demandedTimeSensor = new SimpleTimeSpanSensor(simuComModel,
		// "Demanded time at " + description);
		IActiveResource aResource = getModel().getSchedulingFactory()
				.createSimFCFSResource(SchedulingStrategy.FCFS.toString(),
						getNextResourceId());

		// utilisationSensor = new OverallUtilisationSensor(simuComModel,
		// "Utilisation of " + typeID + " " + description);
		return aResource;
	}

	@Override
	protected double calculateDemand(double demand) {
		double calculatedThroughput = NumberConverter.toDouble(StackContext
				.evaluateStatic(throughput));
		if (calculatedThroughput <= 0) {
			throw new ThroughputZeroOrNegativeException(
					"Throughput at resource " + getName()
							+ " was less or equal zero");
		}

		double result = NumberConverter.toDouble(StackContext
				.evaluateStatic(latencySpec))
				+ demand / calculatedThroughput;
		if(logger.isDebugEnabled())
			logger.debug("A network load of " + result + " has been determined.");

		return result;
	}


	/**
	 * @param abstractDemand: may be zero, in that case only the latency is considered. 
	 */
	@Override
	public void consumeResource(SimuComSimProcess process, int resourceServiceID,
			double abstractDemand) {		
		
		// If the resource can fail, simulate a failure with the given
		// probability.
		// This works for communication link resources (LAN), but only if the
		// "simulate linking resources" option is activated. Otherwise, the
		// commlink failure is triggered out of the OAW generated code.
		if (canFail) {
			if (Math.random() < failureProbability) {
				FailureException
						.raise(FailureStatistics.getInstance()
								.getInternalNetworkFailureType(id,
										this.resourceTypeID));
			}
		}
		
		// registerProcessWindows(process, aResource);
		// logger.info("Demanding " + abstractDemand);
		
		// Consider throughput spec and add latency to the demand.  
		double concreteDemand = calculateDemand(abstractDemand);
		// logger.info("Recording " + concreteDemand);
		fireDemand(concreteDemand);
		this.totalDemandedTime += concreteDemand;
		aResource.process(process, resourceServiceID, concreteDemand);
	}
	
	@Override
	public double getRemainingDemandForProcess(SimuComSimProcess thread) {
		return aResource.getRemainingDemand(thread);
	}
	
	@Override
	public void updateDemand(SimuComSimProcess thread, double demand) {
		aResource.updateDemand(thread, demand);
	}

	@Override
	public IActiveResource getScheduledResource() {
		return aResource;
		// return null;
	}

	private void registerProcessWindows(ISchedulableProcess process,
			IActiveResource resource) {
		/*
		 * if (resourceConf != null) { ProcessConfiguration processConf =
		 * ConfigurationFactory.eINSTANCE .createProcessConfiguration();
		 * processConf.setName(process.getId());
		 * processConf.setPriority(PriorityClass.DEFAULT);
		 * processConf.setReplicas(1); ProcessWithPriority p =
		 * (ProcessWithPriority) ISchedulingFactory.eINSTANCE
		 * .createRunningProcess(process, processConf, resourceConf);
		 * 
		 * resource.registerProcess(p); }
		 */
	}

	@Override
	public void activateResource() {
		aResource.start();
	}

	@Override
	public void deactivateResource() {
		if (utilizationSet == false) {
			// this.utilisationSensor.setTotalResourceDemand(totalDemandedTime,
			// 1);
			utilizationSet = true;
		}
		aResource.stop();
	}

	public static String getNextResourceId() {
		return "NETWORK_" + Long.toString(resourceId++);
	}
}