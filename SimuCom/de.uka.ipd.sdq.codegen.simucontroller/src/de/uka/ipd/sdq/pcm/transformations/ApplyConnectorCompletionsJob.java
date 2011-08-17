package de.uka.ipd.sdq.pcm.transformations;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import de.uka.ipd.sdq.codegen.simucontroller.SimuControllerPlugin;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.pcm.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.jobs.LoadMiddlewareConfigurationIntoBlackboardJob;
import de.uka.ipd.sdq.workflow.pcm.jobs.LoadPCMModelsIntoBlackboardJob;
import de.uka.ipd.sdq.featureconfig.Configuration;
import de.uka.ipd.sdq.pcm.allocation.AllocationContext;
import de.uka.ipd.sdq.pcm.allocation.AllocationFactory;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyConnector;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.core.composition.CompositionFactory;
import de.uka.ipd.sdq.pcm.core.composition.CompositionPackage;
import de.uka.ipd.sdq.pcm.repository.Repository;
import de.uka.ipd.sdq.pcm.repository.RepositoryFactory;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage;
import de.uka.ipd.sdq.pcm.transformations.builder.connectors.ConnectorReplacingBuilder;
import de.uka.ipd.sdq.pcm.transformations.builder.util.PCMAndCompletionModelHolder;
import de.uka.ipd.sdq.workflow.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.RollbackFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

public class ApplyConnectorCompletionsJob 
implements IBlackboardInteractingJob<MDSDBlackboard> {

	private static Logger logger = Logger.getLogger(ApplyConnectorCompletionsJob.class);
	
	public static final String COMPLETION_REPOSITORY_PARTITION = "de.uka.ipd.sdq.pcm.completionRepositoryPartition";
	
	private MDSDBlackboard blackboard;
	private SimuComWorkflowConfiguration configuration;
		
	public ApplyConnectorCompletionsJob(SimuComWorkflowConfiguration configuration) {
		super();
		
		this.configuration = configuration;
	}
	
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {

		PCMResourceSetPartition pcmModels = (PCMResourceSetPartition) blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
		ResourceSetPartition middlewareRepository = blackboard.getPartition(LoadMiddlewareConfigurationIntoBlackboardJob.MIDDLEWARE_PARTITION_ID);
		
		logger.info("Create completion repository...");
		ResourceSetPartition completionRepositoryPartition = new ResourceSetPartition();
		Repository completionRepository = RepositoryFactory.eINSTANCE.createRepository();
		completionRepository.setEntityName("CompletionsRepository");
		String tempDir = SimuControllerPlugin.getDefault().getStateLocation().append("temp").toOSString();
		Resource r = completionRepositoryPartition.getResourceSet().createResource(URI.createFileURI(tempDir));
		r.getContents().add(completionRepository);
		this.blackboard.addPartition(COMPLETION_REPOSITORY_PARTITION, completionRepositoryPartition);
		
		final PCMAndCompletionModelHolder models = new PCMAndCompletionModelHolder(
				pcmModels.getResourceTypeRepository(),
				null,
				pcmModels.getSystem(),
				pcmModels.getAllocation(),
				null,
				completionRepository,
				(Repository)middlewareRepository.getResourceSet().getResources().get(0).getContents().get(0)
				);
		
		final Configuration featureConfiguration = pcmModels.getFeatureConfig();
		
		new AllInstancesTransformer<ResourceContainer>(
				ResourceenvironmentPackage.eINSTANCE.getResourceContainer(),
				models.getAllocation().getTargetResourceEnvironment_Allocation()) {

					@Override
					protected void transform(ResourceContainer object) {
						addMiddleware(models, object);
					}
			
		}.transform();
		
		logger.info("Replace connectors with completions...");
		new AllInstancesTransformer<AssemblyConnector>(
				CompositionPackage.eINSTANCE.getAssemblyConnector(),
				models.getSystem()) {

					@Override
					protected void transform(AssemblyConnector connector) {
						if ( configuration.getSimulateLinkingResources() ) {
							ConnectorReplacingBuilder replacer = new ConnectorReplacingBuilder(models,connector,featureConfiguration.getDefaultConfig());
							replacer.build();
						}
					}
			
		}.transform();
	}

	/**
	 * Creates a middleware component instance and allocates it to the given resource container
	 */
	private void addMiddleware(PCMAndCompletionModelHolder models, ResourceContainer resContainer) {
		AssemblyContext ctx = CompositionFactory.eINSTANCE.createAssemblyContext();
		ctx.setEntityName("AssCtx Middleware "+resContainer.getEntityName());
		ctx.setEncapsulatedComponent__AssemblyContext(models.getMiddlewareRepository().getComponents__Repository().get(0)); // TODO: Parameterise me!
		models.getSystem().getAssemblyContexts__ComposedStructure().add(ctx);
		
		models.getSystem().getAssemblyContexts__ComposedStructure().add(ctx);
		AllocationContext allocCtx = AllocationFactory.eINSTANCE.createAllocationContext();
		allocCtx.setEntityName("AllocCtx Middleware "+resContainer.getEntityName());
		allocCtx.setAssemblyContext_AllocationContext(ctx);
		allocCtx.setResourceContainer_AllocationContext(resContainer);
		models.getAllocation().getAllocationContexts_Allocation().add(allocCtx);
		
		logger.info("Added middleware component >"+ctx.getEncapsulatedComponent__AssemblyContext().getEntityName()+
				"< to resource container >"+resContainer.getEntityName()+"<");
	}

	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	public String getName() {
		return "Add connector completions job";
	}

	public void rollback(IProgressMonitor monitor)
			throws RollbackFailedException {
		// Nothing to do here
	}
}
