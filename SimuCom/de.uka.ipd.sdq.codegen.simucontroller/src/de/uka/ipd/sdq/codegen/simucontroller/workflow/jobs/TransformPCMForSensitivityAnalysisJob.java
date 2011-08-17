package de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.pcm.core.PCMRandomVariable;
import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.usagemodel.ClosedWorkload;
import de.uka.ipd.sdq.pcm.usagemodel.OpenWorkload;
import de.uka.ipd.sdq.workflow.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.RollbackFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.pcm.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.jobs.LoadPCMModelsIntoBlackboardJob;
import de.uka.ipd.sdq.workflow.pcm.runconfig.SensitivityAnalysisConfiguration;

public class TransformPCMForSensitivityAnalysisJob implements
		IBlackboardInteractingJob<MDSDBlackboard> {

	private MDSDBlackboard blackboard;
	private Logger logger = Logger
			.getLogger(TransformPCMForSensitivityAnalysisJob.class);
	private List<SensitivityAnalysisConfiguration> sconfList;

	public TransformPCMForSensitivityAnalysisJob(
			SimuComWorkflowConfiguration configuration) throws CoreException {
		super();
		this.sconfList = configuration.getSensitivityAnalysisConfigurations();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.uka.ipd.sdq.codegen.workflow.IBlackboardInteractingJob#setBlackbard
	 * (de.uka.ipd.sdq.codegen.workflow.Blackboard)
	 */
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.uka.ipd.sdq.codegen.workflow.IJob#execute(org.eclipse.core.runtime
	 * .IProgressMonitor)
	 */
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition) this.blackboard
				.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);

		for (SensitivityAnalysisConfiguration sconf : this.sconfList){
			applyParamterChange(sconf, pcmPartition);
		}

	}

	private void applyParamterChange(SensitivityAnalysisConfiguration sconf, PCMResourceSetPartition pcmPartition)
			throws JobFailedException {
		if (sconf.getVariable() != null && sconf.getVariable().equals(""))
			throw new JobFailedException(
					"Bad Sensitivity Analysis Job Configuration, no variable specified.");

		URI uri = URI.createURI(sconf.getVariable());

		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(uri, true);
		String uriString = sconf.getVariable();
		String varUri = uriString.substring(uriString.indexOf("#")+1);
		EObject variableToChange = resource.getEObject(varUri);

		EObject o = null;
		for (Resource r : pcmPartition.getResourceSet().getResources()) {
			if (o == null) {
				o = findEObject(r.getContents().get(0), variableToChange);
				if (o != null) {
					logger
							.info("Altering PCM variable for sensitivity analysis");
					alterObject(o, sconf);
				}
			}
		}
		if (o == null)
			throw new JobFailedException(
					"Sensistivity analaysis transformation was unable to find the sensitivity variable");
	}

	public void rollback(IProgressMonitor monitor)
			throws RollbackFailedException {
	}

	public String getName() {
		return "Inplace Transformation job for Sensitivity Analysis";
	}

	// ---

	private void alterObject(EObject o, SensitivityAnalysisConfiguration sconf) {
		//DecimalFormat df = new DecimalFormat("0.00000000", new DecimalFormatSymbols(Locale.US));
		//String value = df.format( sconf.getCurrent() );

		double value = sconf.getCurrent();

		if (o instanceof PCMRandomVariable) {
			PCMRandomVariable pcmRandVar = (PCMRandomVariable) o;
			if ((int)value == value){
				pcmRandVar.setSpecification(String.valueOf((int)value));
			} else {
				pcmRandVar.setSpecification(String.valueOf(value));
			}

		}
		if (o instanceof ClosedWorkload) {
			ClosedWorkload cw = (ClosedWorkload) o;
			cw.setPopulation((int)sconf.getCurrent());
		}
		if (o instanceof OpenWorkload) {
			OpenWorkload ow = (OpenWorkload) o;
			ow.getInterArrivalTime_OpenWorkload().setSpecification("Exp(" + value + ")");
		}
	}

	/**
	 * Finds object in tree based on the {@link #entityBasedEquals(EObject, EObject)} equality definition.
	 *
	 * @param objectTreeToSearchIn
	 * @param eObjectToFind
	 * @return
	 */
	private EObject findEObject(EObject objectTreeToSearchIn, EObject eObjectToFind) {
		Iterator<EObject> it = objectTreeToSearchIn.eAllContents();

		while (it.hasNext()) {
			EObject eo = it.next();

			if (entityBasedEquals(eo, eObjectToFind)) {
					return eo;
			}
		}
		return null;
	}

	/**
	 * Finds object based on the following recursive equality definition:
	 *
	 * Two objects are equal iff (1) they have both instance of {@link Entity}
	 * and have the same id, or (2) they are not both instances of
	 * {@link Entity} and they are instances of the same {@link EClass} and
	 * their parents are of equal {@link EClass} and their parents are equal
	 * based on this definition.
	 */
	private boolean entityBasedEquals(EObject eObject1, EObject eObject2) {

		if (eObject1 == eObject2){
			return true;
		}

		if (eObject1 != null && eObject2 != null){

			if (eObject1 instanceof Entity && eObject2 instanceof Entity) {
				Entity entity1 = (Entity) eObject1;
				Entity entity2 = (Entity) eObject2;

				if (entity1.getId().equals(entity2.getId())) {
					return true;
				}

			} else {

				//they must have the same class.
				EClass eClass1 = eObject1.eClass();
			    if (eClass1 != eObject2.eClass()){
			    	return false;
			    }

				// objects could be the same, check parents
			    EObject parent1 = eObject1.eContainer();
			    EObject parent2 = eObject2.eContainer();

				return entityBasedEquals(parent1, parent2);

			}


		}

		return false;

	}

}
