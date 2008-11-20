/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.repository;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a black-box component implementation. Basic components are atomic building blocks of a software architecture. They cannot be further subdivided into smaller components and are built from scratch, i.e, not by assembling other components. Component developers specify basic components by associating interfaces to them in a providing or requiring role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.BasicComponent#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.BasicComponent#getPassiveResource_BasicComponent <em>Passive Resource Basic Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getBasicComponent()
 * @model
 * @generated
 */
public interface BasicComponent extends ImplementationComponentType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2008 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Service Effect Specifications Basic Component</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Effect Specifications Basic Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the service effect specification for services provided by this basic component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Effect Specifications Basic Component</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getBasicComponent_ServiceEffectSpecifications__BasicComponent()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ServiceEffectSpecification> getServiceEffectSpecifications__BasicComponent();

	/**
	 * Returns the value of the '<em><b>Passive Resource Basic Component</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.repository.PassiveResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passive Resource Basic Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the passive resources, e.g., semaphores, that are owned by this basic component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Resource Basic Component</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getBasicComponent_PassiveResource_BasicComponent()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PassiveResource> getPassiveResource_BasicComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.serviceEffectSpecifications__BasicComponent->forAll(p1, p2 |
	 *   p1 <> p2 implies (p1.describedService__SEFF = p2.describedService__SEFF implies p1.seffTypeID <> p2.seffTypeID))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean NoSeffTypeUsedTwice(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- BC has to provide the same interfaces like the implementationComponentType (if set) #
	 * if
	 * 	 -- apply constraint only for non-empty ImplementationComponentTypes of a BC #
	 * 	self.parentCompleteComponentTypes->notEmpty()
	 * then
	 * 	--own interface IDs:
	 *     self.providedRoles_InterfaceProvidingEntity->collect(pr : ProvidedRole | pr.providedInterface__ProvidedRole.id)->asSet()
	 *     =
	 *     --complete type interface IDs:
	 *     self.parentCompleteComponentTypes->collect(pr | pr.providedRoles_InterfaceProvidingEntity.providedInterface__ProvidedRole.id)->asSet()
	 * else
	 * 	true
	 * endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ProvideSameInterfacesAsImplementationType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- BC has to require the same interfaces like the implementationComponentType (if set) #
	 * if
	 * 	 -- apply constraint only for non-empty ImplementationComponentTypes of a BC #
	 * 	self.parentCompleteComponentTypes->notEmpty()
	 * then
	 * 	--own interface IDs:
	 *     self.requiredRoles_InterfaceRequiringEntity->collect(rr : RequiredRole | rr.requiredInterface__RequiredRole.id)->asSet()
	 *     =
	 *     --complete type interface IDs:
	 *     self.parentCompleteComponentTypes->collect(rr | rr.requiredRoles_InterfaceRequiringEntity.requiredInterface__RequiredRole.id)->asSet()
	 * else
	 * 	true
	 * endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean RequireSameInterfacesAsImplementationType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BasicComponent
