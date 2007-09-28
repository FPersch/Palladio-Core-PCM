package de.uka.ipd.sdq.capra.simulator.builder;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import umontreal.iro.lecuyer.probdist.DiscreteDistribution;
import de.uka.ipd.sdq.capra.core.Action;
import de.uka.ipd.sdq.capra.core.BoundedLoop;
import de.uka.ipd.sdq.capra.core.CapraExpression;
import de.uka.ipd.sdq.capra.core.Choice;
import de.uka.ipd.sdq.capra.core.DemandAction;
import de.uka.ipd.sdq.capra.core.ExternalSelector;
import de.uka.ipd.sdq.capra.core.InputEventAction;
import de.uka.ipd.sdq.capra.core.InternalSelector;
import de.uka.ipd.sdq.capra.core.ParallelComposition;
import de.uka.ipd.sdq.capra.core.ProbabilisticPrefix;
import de.uka.ipd.sdq.capra.core.Renaming;
import de.uka.ipd.sdq.capra.core.Restriction;
import de.uka.ipd.sdq.capra.core.SuccessfulTermination;
import de.uka.ipd.sdq.capra.extension.AcquireAction;
import de.uka.ipd.sdq.capra.extension.ReleaseAction;
import de.uka.ipd.sdq.capra.measurement.Sensor;
import de.uka.ipd.sdq.capra.measurement.TimeProbe;
import de.uka.ipd.sdq.capra.measurement.VisitProbe;
import de.uka.ipd.sdq.capra.simulator.actions.SimAction;
import de.uka.ipd.sdq.capra.simulator.actions.SimSuccessfulTermination;
import de.uka.ipd.sdq.capra.simulator.actions.SimTimeProbe;
import de.uka.ipd.sdq.capra.simulator.expressions.SimCapraExpression;
import de.uka.ipd.sdq.capra.simulator.expressions.SimInternalSelector;
import de.uka.ipd.sdq.capra.simulator.measurement.sensors.SimTimeSpanSensor;
import de.uka.ipd.sdq.probfunction.math.IProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.math.ISample;
import de.uka.ipd.sdq.probfunction.math.ISamplePDF;
import de.uka.ipd.sdq.probfunction.math.ManagedPDF;
import de.uka.ipd.sdq.probfunction.math.ManagedPMF;
import de.uka.ipd.sdq.scheduler.IActiveResource;
import de.uka.ipd.sdq.scheduler.IPassiveResource;

/**
 * @author     jens.happe
 */
public class CapraExpressionTransformer {

	private CapraExpressionFactory factory;
	private CapraExpressionVisitor expressionVisitor;
	private SensorManager sensorManager;
	private ResourceManager resourceManager;

	public CapraExpressionTransformer(ResourceManager resourceManager, SensorManager sensorManager, CapraExpressionFactory factory) {
		super();
		this.resourceManager = resourceManager;
		this.factory = factory;
		this.sensorManager = sensorManager;
		this.expressionVisitor = new CapraExpressionVisitor(this);
	}

	public SimCapraExpression transformProbabilisticPrefix(
			ProbabilisticPrefix probabilisticPrefix) {
		Action modelAction = probabilisticPrefix.getAction();
		EList<InternalSelector> targetOptions = probabilisticPrefix
				.getTargetOptions();
		int numOptions = targetOptions.size();

		SimAction simAction = transformAction(modelAction);
		SimInternalSelector[] targetExpressions = new SimInternalSelector[numOptions];
		for (int i = 0; i < numOptions; i++) {
			targetExpressions[i] = transformInteralSelector(targetOptions
					.get(i));
		}
		return factory.createSimProbabilisticPrefix(simAction,
				targetExpressions);
	}

	public SimAction transformAction(Action modelAction) {
		return (SimAction) expressionVisitor.visit(modelAction);
	}

	private SimInternalSelector transformInteralSelector(
			InternalSelector internalSelector) {
		double probability = internalSelector.getProbability();
		CapraExpression expression = internalSelector.getProcess();
		SimCapraExpression simExpression = transformCapraExpression(expression);
		return factory.createInternalSelector(probability, simExpression);
	}

	public SimCapraExpression transformCapraExpression(
			CapraExpression capraExpression) {
		return expressionVisitor.visit(capraExpression);
	}

	public SimCapraExpression transformDemandAction(DemandAction demandAction) {
		String name = demandAction.getIdentifier().getName();
		IActiveResource resource = resourceManager.getActiveResource(demandAction.getResourceUsage().getResource());
		ManagedPDF mPDF = new ManagedPDF(demandAction.getResourceUsage()
				.getUsageTime());
		ISamplePDF sPDF = mPDF.getSamplePdfTimeDomain();
		DiscreteDistribution distribution = transformPDF(sPDF);
		double sampleWidth = sPDF.getDistance();
		return factory.createDemandAction(name, distribution, sampleWidth, resource);
	}

	public DiscreteDistribution transformPDF(ISamplePDF sPDF) {
		double pos = 0;
		double distance = sPDF.getDistance();
		List<Double> probList = sPDF.getValuesAsDouble();
		double[] obs = new double[probList.size()];
		double[] probs = new double[probList.size()];
		for (int i = 0; i < probList.size(); i++) {
			obs[i] = pos;
			probs[i] = probList.get(i);
			pos += distance;
		}
		return new DiscreteDistribution(probList.size(), obs, probs);
	}

	public DiscreteDistribution transformIntPMF(ManagedPMF managedPMF) {
		IProbabilityMassFunction pmf = managedPMF.getPmfTimeDomain();
		List<ISample> sampleList = pmf.getSamples();
		int size = sampleList.size();

		if (size > 0) {
			double[] obs = new double[size];
			double[] probs = new double[size];

			for (int i = 0; i < sampleList.size(); i++) {
				ISample sample = sampleList.get(i);
				obs[i] = (Integer) sample.getValue();
				probs[i] = sample.getProbability();
			}
			return new DiscreteDistribution(size, obs, probs);
		} else {
			System.out
					.println("PMF did not contain any samples! Creating default distribution.");
			return new DiscreteDistribution(1, new double[] { 10.0 },
					new double[] { 1.0 });
		}
	}

	public SimSuccessfulTermination transformSuccessfulTermination(
			SuccessfulTermination termination) {
		return factory.createSuccessfulTermination();
	}

	public SimCapraExpression transformTimeProbe(TimeProbe timeProbe) {
		SimTimeProbe simProbe = factory.createSimTimeProbe();

		for (Sensor s : timeProbe.getSensorsToStart()) {
			SimTimeSpanSensor simSensor = sensorManager
					.getTimeSpanSensor(s);
			simProbe.addSensorToStart(simSensor);
		}
		for (Sensor s : timeProbe.getSensorsToStop()) {
			SimTimeSpanSensor simSensor = sensorManager
					.getTimeSpanSensor(s);
			simProbe.addSensorToStop(simSensor);
		}
		return simProbe;
	}

	public SimCapraExpression transformVisitProbe(VisitProbe visitProbe) {
		// TODO Auto-generated method stub
		return null;
	}

	public SimCapraExpression transformBoundedLoop(BoundedLoop boundedLoop) {
		ManagedPMF pmf = new ManagedPMF(boundedLoop.getNumberOfIterations());
		CapraExpression modelRepeatedProcess = boundedLoop.getRepeatedProcess();
		CapraExpression modelTargetProcess = boundedLoop.getTargetProcess();

		DiscreteDistribution numIterations = transformIntPMF(pmf);
		SimCapraExpression repeatedProcess = transformCapraExpression(modelRepeatedProcess);
		SimCapraExpression targetProcess = transformCapraExpression(modelTargetProcess);

		return factory.createBoundedLoop(numIterations, repeatedProcess,
				targetProcess);
	}

	public SimCapraExpression transformChoice(Choice choice) {
		List<ExternalSelector> optionList = choice.getOptions();

		for (ExternalSelector option : optionList) {
			InputEventAction input = option.getInput();
			CapraExpression targetProcess = option.getTargetProcess();
		}

		// TODO Auto-generated method stub
		return null;
	}

	public SimCapraExpression transformParallelComposition(
			ParallelComposition parallelComposition) {
		for (CapraExpression expression : parallelComposition.getProcesses()) {
//			SimCapraProcess process = new SimCapraProcess();
		} 
		
		// TODO Auto-generated method stub
		return null;
	}

	public SimCapraExpression transformRenaming(Renaming renaming) {
		// TODO Auto-generated method stub
		return null;
	}

	public SimCapraExpression transformRestriction(Restriction restriction) {
		// TODO Auto-generated method stub
		return null;
	}

	public SimCapraExpression transformAcquireAction(AcquireAction acquireAction) {
		int numberRequested = acquireAction.getNumber();
		IPassiveResource resource = resourceManager.getPassiveResource(acquireAction.getResource());
		return factory.createAcquireAction(resource, numberRequested);
	}

	public SimCapraExpression transformReleaseAction(ReleaseAction releaseAction) {
		int numberReleased = releaseAction.getNumber();
		IPassiveResource resource = resourceManager.getPassiveResource(releaseAction.getResource());
		return factory.createReleaseAction(resource, numberReleased);
	}
}
