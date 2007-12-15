package de.uka.sdq.pcm.transformations.builder.connectors;

import de.uka.ipd.sdq.pcm.core.composition.AssemblyConnector;
import de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource;
import de.uka.sdq.pcm.transformations.builder.IComponentBuilder;
import de.uka.sdq.pcm.transformations.builder.infrastructure.IMiddlewareInteractingComponentBuilder;
import de.uka.sdq.pcm.transformations.builder.infrastructure.MiddlewareCallingComponentBuilder;
import de.uka.sdq.pcm.transformations.builder.util.PCMAndCompletionModelHolder;

public class ConfigurableMiddlewareCallingConnectorCompletionBuilder extends
		AbstractClientServerConnectorCompletionBuilder {

	private String clientSideBeforeCall;
	private String clientSideAfterCall;
	private String serverSideBeforeCall;
	private String serverSideAfterCall;

	public ConfigurableMiddlewareCallingConnectorCompletionBuilder(
			PCMAndCompletionModelHolder models, AssemblyConnector connector,
			LinkingResource linkingResource, IComponentBuilder innerBuilder,
			String clientSideBeforeCall, String serverSideBeforeCall,
			String serverSideAfterCall, String clientSideAfterCall) {
		super(models, connector, linkingResource, innerBuilder);
		this.clientSideBeforeCall = clientSideBeforeCall;
		this.clientSideAfterCall = clientSideAfterCall;
		this.serverSideBeforeCall = serverSideBeforeCall;
		this.serverSideAfterCall = serverSideAfterCall;
	}

	@Override
	protected IMiddlewareInteractingComponentBuilder createClientSideBuilder() {
		MiddlewareCallingComponentBuilder builder = new MiddlewareCallingComponentBuilder
				(myModels, 
				this.connectorToReplace.getRequiredRole_CompositeAssemblyConnector().getRequiredInterface__RequiredRole(),
				this.connectorToReplace.getRequiredRole_CompositeAssemblyConnector().getRequiredInterface__RequiredRole(),
				this.middlewareInterface,
				this.myLinkingResource.getFromResourceContainer_LinkingResource().get(0),
				clientSideBeforeCall,
				clientSideAfterCall);
		return builder;
	}

	@Override
	protected IMiddlewareInteractingComponentBuilder createServerSideBuilder() {
		MiddlewareCallingComponentBuilder builder = new MiddlewareCallingComponentBuilder
				(myModels, 
				this.connectorToReplace.getRequiredRole_CompositeAssemblyConnector().getRequiredInterface__RequiredRole(),
				this.connectorToReplace.getRequiredRole_CompositeAssemblyConnector().getRequiredInterface__RequiredRole(),
				this.middlewareInterface,
				this.myLinkingResource.getFromResourceContainer_LinkingResource().get(0),
				serverSideBeforeCall,
				serverSideAfterCall);
		return builder;
	}
}
