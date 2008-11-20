/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.core.entity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Providing Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This meta-class is inherited by classes that both require and provide an Interface. It thus combines the properties of InterfaceProvidingEntity and InterfaceRequiringEntity. Prominent inheriting classes are all component types, for example.
 * 
 * See also:
 * Interface, ProvidedRole, RequiredRole, InterfaceProvidingEntity, InterfaceRequiringEntity
 * <!-- end-model-doc -->
 *
 *
 * @see de.uka.ipd.sdq.pcm.core.entity.EntityPackage#getInterfaceProvidingRequiringEntity()
 * @model abstract="true"
 * @generated
 */
public interface InterfaceProvidingRequiringEntity extends InterfaceProvidingEntity, InterfaceRequiringEntity, ResourceInterfaceRequiringEntity {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2008 by SDQ, IPD, University of Karlsruhe, Germany";

} // InterfaceProvidingRequiringEntity
