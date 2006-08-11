/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.ipd.uka.sdq.pcm.resourceenvironment;

import de.ipd.uka.sdq.pcm.resourcetype.ProcessingResourceType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.ipd.uka.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification <em>Active Resource Type Active Resource Specification</em>}</li>
 *   <li>{@link de.ipd.uka.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getProcessingRate <em>Processing Rate</em>}</li>
 *   <li>{@link de.ipd.uka.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.ipd.uka.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification()
 * @model
 * @generated
 */
public interface ProcessingResourceSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Resource Type Active Resource Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Resource Type Active Resource Specification</em>' reference.
	 * @see #setActiveResourceType_ActiveResourceSpecification(ProcessingResourceType)
	 * @see de.ipd.uka.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessingResourceType getActiveResourceType_ActiveResourceSpecification();

	/**
	 * Sets the value of the '{@link de.ipd.uka.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification <em>Active Resource Type Active Resource Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Resource Type Active Resource Specification</em>' reference.
	 * @see #getActiveResourceType_ActiveResourceSpecification()
	 * @generated
	 */
	void setActiveResourceType_ActiveResourceSpecification(ProcessingResourceType value);

	/**
	 * Returns the value of the '<em><b>Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Rate</em>' attribute.
	 * @see #setProcessingRate(int)
	 * @see de.ipd.uka.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification_ProcessingRate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getProcessingRate();

	/**
	 * Sets the value of the '{@link de.ipd.uka.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getProcessingRate <em>Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Rate</em>' attribute.
	 * @see #getProcessingRate()
	 * @generated
	 */
	void setProcessingRate(int value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see de.ipd.uka.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification_Units()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link de.ipd.uka.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

} // ProcessingResourceSpecification