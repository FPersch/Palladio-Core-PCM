package de.uka.sdq.pcm.transformations.builder.connectors;

import de.uka.ipd.sdq.featureconfig.FeatureConfig;
import de.uka.ipd.sdq.pcm.allocation.AllocationContext;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyConnector;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.core.composition.CompositionFactory;
import de.uka.ipd.sdq.pcm.repository.Interface;
import de.uka.ipd.sdq.pcm.repository.ProvidedRole;
import de.uka.ipd.sdq.pcm.repository.RequiredRole;
import de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.sdq.pcm.transformations.FeatureUtils;
import de.uka.sdq.pcm.transformations.builder.IBuilder;
import de.uka.sdq.pcm.transformations.builder.IComponentBuilder;
import de.uka.sdq.pcm.transformations.builder.resourceconsumer.LocalCommunicationComponentBuilder;
import de.uka.sdq.pcm.transformations.builder.resourceconsumer.NetworkLoadingComponentBuilder;
import de.uka.sdq.pcm.transformations.builder.util.PCMAndCompletionModelHolder;

/**
 * This builder replaces a given connector with a component built by the given component builder.
 * @author Snowball
 *
 */
public class ConnectorReplacingBuilder implements IBuilder {

	private AssemblyConnector connector;
	private ComposedStructure parent;
	private LinkingResource linkingRes;
	private PCMAndCompletionModelHolder models;
	private FeatureConfig featureConfig;

	public ConnectorReplacingBuilder(PCMAndCompletionModelHolder models, AssemblyConnector con, FeatureConfig featureConfig) {
		this.models = models;
		this.connector = con;
		this.linkingRes = findLinkingResource(connector);
		this.parent = con.getParentStructure_AssemblyConnector();
		this.featureConfig = featureConfig;
	}
	
	public void build() {
		// Teste hier: Entweder sind es 2 Prozesse auf dem selben Rechner _oder_ zwei Prozesse auf verschiedenen Rechner. 
		// Im letzten Fall ist die Konfigurationsoption "SameAddressSpace" illegal und wird somit übergangen...
		if (FeatureUtils.hasFeature(featureConfig,"DifferentAddressSpace") || linkingRes != null) {
			java.lang.System.out.println("Expanding a completion for remote connector "+connector.getEntityName());
		
			IClientServerConnectorCompletionComponentBuilder componentBuilder = 
				configureCompletionComponentBuilder();
		
			// First build the completion component
			componentBuilder.build();
		
			// Then integrate the component in the structure instead of the AssemblyConnector
			parent.getChildComponentContexts_ComposedStructure().add(componentBuilder.getAssemblyContext());
			
			embeddConnectorCompletionInApplication(componentBuilder);
			connectConnectorCompletionWithMiddleware(componentBuilder);
		
			// Finally, remove the connector from the architecture
			parent.getCompositeAssemblyConnectors_ComposedStructure().remove(connector);
		}
	}

	private IClientServerConnectorCompletionComponentBuilder configureCompletionComponentBuilder() {
		IComponentBuilder builder = null;
		IClientServerConnectorCompletionComponentBuilder result;
		ResourceContainer clientContainer = null;
		ResourceContainer serverContainer = null;
		
		if (linkingRes  != null) {
			clientContainer = linkingRes.getFromResourceContainer_LinkingResource().get(0);
			serverContainer = linkingRes.getToResourceContainer_LinkingResource().get(0);
			builder = new NetworkLoadingComponentBuilder(models, connector.getRequiredRole_CompositeAssemblyConnector().getRequiredInterface__RequiredRole(),linkingRes);
		} else {
			clientContainer = findContainer(this.connector.getRequiringChildComponentContext_CompositeAssemblyConnector());
			serverContainer = clientContainer;
			builder = new LocalCommunicationComponentBuilder(models, connector.getRequiredRole_CompositeAssemblyConnector().getRequiredInterface__RequiredRole());
		}
		
		if (FeatureUtils.hasFeature(featureConfig,"Encryption"))
			builder = new PairwiseMiddlewareInteractingInnerConnectorCompletionBuilder(models,connector,clientContainer,serverContainer,builder,"encrypt","decrypt");
		if (FeatureUtils.hasFeature(featureConfig,"Authentication"))
			builder = new ConfigurableMiddlewareCallingConnectorCompletionBuilder(models,connector,clientContainer,serverContainer,builder,"createCredentials","checkCredentials",null,null);
		
		result = new MarshallingConnectorCompletionBuilder(models,connector,clientContainer,serverContainer,builder);
		
		return result;
	}

	private void connectConnectorCompletionWithMiddleware(IClientServerConnectorCompletionComponentBuilder componentBuilder) {
		// Only support point-to-point connections
		AllocationContext clientMWContext = findClientSideMiddlewareAllocationContext();
		addAssemblyConnector(componentBuilder.getClientSideMiddlewareRole(), componentBuilder.getAssemblyContext(),
				clientMWContext.getAssemblyContext_AllocationContext().getEncapsulatedComponent_ChildComponentContext().getProvidedRoles_InterfaceProvidingEntity().get(0),
				clientMWContext.getAssemblyContext_AllocationContext());
		AllocationContext serverMWContext = findServerSideMiddlewareAllocationContext();
		addAssemblyConnector(componentBuilder.getServerSideMiddlewareRole(), componentBuilder.getAssemblyContext(),
				serverMWContext.getAssemblyContext_AllocationContext().getEncapsulatedComponent_ChildComponentContext().getProvidedRoles_InterfaceProvidingEntity().get(0),
				serverMWContext.getAssemblyContext_AllocationContext());
	}

	private void embeddConnectorCompletionInApplication(IClientServerConnectorCompletionComponentBuilder componentBuilder) {
		addAssemblyConnector(connector.getRequiredRole_CompositeAssemblyConnector(), 
					connector.getRequiringChildComponentContext_CompositeAssemblyConnector(),
					componentBuilder.getProvidedRole(), 
					componentBuilder.getAssemblyContext());
		addAssemblyConnector(componentBuilder.getRequiredRole(), 
					componentBuilder.getAssemblyContext(), 
					connector.getProvidedRole_CompositeAssemblyConnector(), 
					connector.getProvidingChildComponentContext_CompositeAssemblyConnector());
	}

	private void addAssemblyConnector(RequiredRole from, AssemblyContext fromContext, ProvidedRole to, AssemblyContext toContext){
		AssemblyConnector acon = CompositionFactory.eINSTANCE.createAssemblyConnector();
		acon.setParentStructure_AssemblyConnector(parent);
		acon.setRequiredRole_CompositeAssemblyConnector(from);
		acon.setRequiringChildComponentContext_CompositeAssemblyConnector(fromContext);
		acon.setProvidedRole_CompositeAssemblyConnector(to);
		acon.setProvidingChildComponentContext_CompositeAssemblyConnector(toContext);
	}	

	private AllocationContext findClientSideMiddlewareAllocationContext() {
		ResourceContainer container = linkingRes == null ? findContainer(connector.getRequiringChildComponentContext_CompositeAssemblyConnector()) : linkingRes.getFromResourceContainer_LinkingResource().get(0) ;
		return findAllocationContext(container,models.getMiddlewareRepository().getInterfaces__Repository().get(0));
	}
	
	private AllocationContext findServerSideMiddlewareAllocationContext(){
		ResourceContainer container = linkingRes == null ? findContainer(connector.getRequiringChildComponentContext_CompositeAssemblyConnector()) : linkingRes.getToResourceContainer_LinkingResource().get(0) ;
		return findAllocationContext(container,models.getMiddlewareRepository().getInterfaces__Repository().get(0));
	}

	private AllocationContext findAllocationContext(
			ResourceContainer resourceContainer, Interface interfaceToSearch) {
		for (AllocationContext context : models.getAllocation().getAllocationContexts_Allocation())
			if (context.getResourceContainer_AllocationContext() == resourceContainer && 
				context.getAssemblyContext_AllocationContext().getEncapsulatedComponent_ChildComponentContext().getProvidedRoles_InterfaceProvidingEntity().get(0).getProvidedInterface__ProvidedRole() == interfaceToSearch)
				return context;
		throw new RuntimeException("Model invalid, unable to find middleware component for resource container "+resourceContainer.getEntityName());
	}	
	
	/**
	 * Retrieve the linking resource for the given assembly connector
	 * @param con The connector to retrieve the linking resource for
	 * @return The linking resource on which the given connector is deployed
	 */
	private LinkingResource findLinkingResource(AssemblyConnector con) {
		for (LinkingResource lr : models.getAllocation().getTargetResourceEnvironment_Allocation().getLinkingresource()){
			if (lr.getFromResourceContainer_LinkingResource().contains(findContainer(con.getRequiringChildComponentContext_CompositeAssemblyConnector())) &&
					lr.getToResourceContainer_LinkingResource().contains(findContainer(con.getProvidingChildComponentContext_CompositeAssemblyConnector())))
				return lr;
		}
		if (findContainer(con.getRequiringChildComponentContext_CompositeAssemblyConnector()) != findContainer(con.getProvidingChildComponentContext_CompositeAssemblyConnector()))
			throw new RuntimeException("AssemblyConnector "+con.getEntityName()+" links different ResourceContainer, but there is no linking resource between the containers!");
		return null;
	}

	private ResourceContainer findContainer(
			AssemblyContext requiringChildComponentContext_CompositeAssemblyConnector) {
		for(AllocationContext ac : this.models.getAllocation().getAllocationContexts_Allocation()) {
			if (ac.getAssemblyContext_AllocationContext().getId().equals(requiringChildComponentContext_CompositeAssemblyConnector.getId()))
				return ac.getResourceContainer_AllocationContext();
		}
		return null;
	}
}
