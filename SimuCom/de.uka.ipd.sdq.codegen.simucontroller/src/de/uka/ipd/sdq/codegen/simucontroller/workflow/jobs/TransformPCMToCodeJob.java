package de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs;

import java.util.HashMap;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xpand2.output.Outlet;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.pcm.repository.Repository;
import de.uka.ipd.sdq.pcm.transformations.ApplyConnectorCompletionsJob;
import de.uka.ipd.sdq.workflow.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.IJob;
import de.uka.ipd.sdq.workflow.OrderPreservingBlackboardCompositeJob;
import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.uka.ipd.sdq.workflow.mdsd.oaw.XpandGeneratorJob;
import de.uka.ipd.sdq.workflow.pcm.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.configurations.AbstractCodeGenerationWorkflowRunConfiguration;
import de.uka.ipd.sdq.workflow.pcm.configurations.AbstractPCMWorkflowRunConfiguration;
import de.uka.ipd.sdq.workflow.pcm.jobs.LoadPCMModelsIntoBlackboardJob;

/**
 * Start the Workflow-Engine of oAW - Generator
 */
public class TransformPCMToCodeJob 
extends OrderPreservingBlackboardCompositeJob<MDSDBlackboard>
implements IJob, IBlackboardInteractingJob<MDSDBlackboard> {

	private static final String REPOSITORY_ROOT_EXPAND_EXPRESSION = "m2t_transforms::repository::Root FOR pcmmodel";
	private static final String SYSTEM_ROOT_EXPAND_EXPRESSION     = "m2t_transforms::system::Root FOR system";
	private static final String ALLOCATION_ROOT_EXPAND_EXPRESSION = "m2t_transforms::allocation::AllocationTM FOR allocation";
	private static final String USAGE_ROOT_EXPAND_EXPRESSION 	  = "m2t_transforms::usage::UsageModel(allocation) FOR usage";

	private AbstractCodeGenerationWorkflowRunConfiguration configuration = null;

	public TransformPCMToCodeJob(AbstractCodeGenerationWorkflowRunConfiguration configuration) {
		super();
		
		this.configuration  = configuration;
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		// First generate the jobs
		// 1. Generate all repositories
		for(int repositoryIndex = 0; repositoryIndex < getRepositoryCount(); repositoryIndex++) {
			this.addJob(this.getGeneratorJob(getRepositoryTransformationSlots(repositoryIndex), REPOSITORY_ROOT_EXPAND_EXPRESSION));
		}
		if (configuration.isLoadMiddlewareAndCompletionFiles()) {
			this.addJob(this.getGeneratorJob(getMiddlewareRepositorySlots(), REPOSITORY_ROOT_EXPAND_EXPRESSION));
			this.addJob(this.getGeneratorJob(getCompletionRepositorySlots(), REPOSITORY_ROOT_EXPAND_EXPRESSION));
		}
		
		// 2. Generate the system
		this.addJob(this.getGeneratorJob(getSystemTransformationSlots(), SYSTEM_ROOT_EXPAND_EXPRESSION));
		
		// 3. Generate the allocation
		this.addJob(this.getGeneratorJob(getSystemTransformationSlots(), ALLOCATION_ROOT_EXPAND_EXPRESSION));

		// 4. Generate the usage
		this.addJob(this.getGeneratorJob(getSystemTransformationSlots(), USAGE_ROOT_EXPAND_EXPRESSION));
		
		// Now let them run
		super.execute(monitor);
	}

	private HashMap<String, EObject> getCompletionRepositorySlots() {
		HashMap<String,EObject> sC2 = new HashMap<String, EObject>();
		ResourceSetPartition completionRepositoryPartition = this.myBlackboard.getPartition(ApplyConnectorCompletionsJob.COMPLETION_REPOSITORY_PARTITION);
		
		sC2.put("pcmmodel",completionRepositoryPartition.getResourceSet().getResources().get(0).getContents().get(0));
		
		return sC2;	}

	private HashMap<String, EObject> getMiddlewareRepositorySlots() {
		HashMap<String,EObject> sC2 = new HashMap<String, EObject>();
		ResourceSetPartition mwRepositoryPartition = this.myBlackboard.getPartition(LoadMiddlewareConfigurationIntoBlackboardJob.MIDDLEWARE_PARTITION_ID);
		
		sC2.put("pcmmodel",mwRepositoryPartition.getResourceSet().getResources().get(0).getContents().get(0));
		
		return sC2;
	}

	/**
	 * @param slots 
	 * @param monitor
	 * @throws JobFailedException
	 * @throws UserCanceledException
	 */
	private XpandGeneratorJob getGeneratorJob(
			HashMap<String, EObject> slots,
			String expression) {
		XpandGeneratorJob job = new XpandGeneratorJob(
				slots,
				AbstractPCMWorkflowRunConfiguration.PCM_EPACKAGES,
				getPCMOutlets(),
				expression);
		job.getAdvices().add(configuration.getCodeGenerationAdvicesFile());
		job.setCheckProtectedRegions(true);
		
		return job;
	}

	/**
	 * @return
	 */
	private Outlet[] getPCMOutlets() {
		Outlet defaultOutlet = new Outlet(getBasePath());
		Outlet interfaces = new Outlet(getBasePath());
		interfaces.setName("INTERFACES");
		
		return new Outlet[]{defaultOutlet,interfaces};
	}

	/**
	 * @return
	 */
	private HashMap<String, EObject> getSystemTransformationSlots() {
		HashMap<String,EObject> sC2 = new HashMap<String, EObject>();
		PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition) this.myBlackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
		
		sC2.put("middleware",pcmPartition.getMiddlewareRepository());
		if (configuration.isLoadMiddlewareAndCompletionFiles()) { 
			sC2.put("featureConfig",pcmPartition.getFeatureConfig());
		}
		sC2.put("system",pcmPartition.getSystem());
		sC2.put("allocation",pcmPartition.getAllocation());
		sC2.put("usage",pcmPartition.getUsageModel());
		return sC2;
	}

	/**
	 * @return
	 */
	private HashMap<String, EObject> getRepositoryTransformationSlots(int repositoryIndex) {
		HashMap<String,EObject> sC2 = new HashMap<String, EObject>();
		PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition) this.myBlackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
		sC2.put("pcmmodel",pcmPartition.getRepositories().get(repositoryIndex));
		return sC2;
	}
	
	/**
	 * @return
	 */
	private int getRepositoryCount() {
		PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition) this.myBlackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
		return pcmPartition.getRepositories().size();
	}
		
	private String getBasePath() {
		String basePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() 
		+ "/" + this.configuration.getPluginID() + "/" + "src";
		
		return basePath;
	}

	public String getName() {
		return "Generate SimuCom Plugin Code";
	}
}