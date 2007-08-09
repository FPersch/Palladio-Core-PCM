/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourceenvironment;

import de.uka.ipd.sdq.pcm.core.entity.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linking Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getToResourceContainer_LinkingResource <em>To Resource Container Linking Resource</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getFromResourceContainer_LinkingResource <em>From Resource Container Linking Resource</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource()
 * @model
 * @generated
 */
public interface LinkingResource extends Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>To Resource Container Linking Resource</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Resource Container Linking Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Resource Container Linking Resource</em>' reference list.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource_ToResourceContainer_LinkingResource()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ResourceContainer> getToResourceContainer_LinkingResource();

	/**
	 * Returns the value of the '<em><b>From Resource Container Linking Resource</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Resource Container Linking Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Resource Container Linking Resource</em>' reference list.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource_FromResourceContainer_LinkingResource()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ResourceContainer> getFromResourceContainer_LinkingResource();

	/**
	 * Returns the value of the '<em><b>Communication Link Resource Specifications Linking Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Link Resource Specifications Linking Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Link Resource Specifications Linking Resource</em>' containment reference.
	 * @see #setCommunicationLinkResourceSpecifications_LinkingResource(CommunicationLinkResourceSpecification)
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	CommunicationLinkResourceSpecification getCommunicationLinkResourceSpecifications_LinkingResource();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Link Resource Specifications Linking Resource</em>' containment reference.
	 * @see #getCommunicationLinkResourceSpecifications_LinkingResource()
	 * @generated
	 */
	void setCommunicationLinkResourceSpecifications_LinkingResource(CommunicationLinkResourceSpecification value);

} // LinkingResource
