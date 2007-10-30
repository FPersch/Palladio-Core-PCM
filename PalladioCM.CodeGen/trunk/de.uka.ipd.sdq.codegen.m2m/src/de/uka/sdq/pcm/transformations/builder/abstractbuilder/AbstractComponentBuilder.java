package de.uka.sdq.pcm.transformations.builder.abstractbuilder;

import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.repository.Interface;
import de.uka.ipd.sdq.pcm.repository.ProvidedRole;
import de.uka.ipd.sdq.pcm.repository.ProvidesComponentType;
import de.uka.ipd.sdq.pcm.repository.RepositoryFactory;
import de.uka.ipd.sdq.pcm.repository.RequiredRole;
import de.uka.sdq.pcm.transformations.builder.IComponentBuilder;
import de.uka.sdq.pcm.transformations.builder.util.PCMAndCompletionModelHolder;

/**
 * Replaces the passed AssemblyConnector with a completion
 * @author  Snowball
 */
public abstract class AbstractComponentBuilder
implements IComponentBuilder {
	
	/**
	 */
	protected ProvidesComponentType myComponent;
	protected ProvidedRole myProvidedRole;
	protected RequiredRole myRequiredRole;
	protected AssemblyContext myAssemblyContext;
	protected PCMAndCompletionModelHolder myModels;
	private static int counter = 0;

	public AbstractComponentBuilder(PCMAndCompletionModelHolder models) {
		this.myComponent = createComponent();
		this.myModels = models;
	}
	
	protected abstract ProvidesComponentType createComponent();
	
	public AssemblyContext getAssemblyContext() {
		return myAssemblyContext;
	}

	protected ProvidedRole addProvidedRole(Interface interf, String roleName) {
		ProvidedRole result = RepositoryFactory.eINSTANCE.createProvidedRole();
		result.setProvidedInterface__ProvidedRole(interf);
		result.setEntityName(roleName);
		myComponent.getProvidedRoles_InterfaceProvidingEntity().add(result);
		return result;
	}

	protected RequiredRole addRequiredRole(Interface interf, String roleName) {
		RequiredRole result = RepositoryFactory.eINSTANCE.createRequiredRole();
		result.setRequiredInterface__RequiredRole(interf);
		result.setEntityName(roleName);
		myComponent.getRequiredRoles_InterfaceRequiringEntity().add(result);
		return result;
	}

	public ProvidedRole getProvidedRole() {
		return myProvidedRole;
	}

	public RequiredRole getRequiredRole() {
		return myRequiredRole;
	}
	
	protected int getNextCounter(){
		counter++;
		return counter;
	}

	public ProvidesComponentType getComponent() {
		return myComponent;
	}

	public void build() {
		myModels.getCompletionRepository().getComponents__Repository().add(myComponent);
	}
	
}
