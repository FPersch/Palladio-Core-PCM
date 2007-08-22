/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.qosannotations;

import de.uka.ipd.sdq.pcm.repository.Role;
import de.uka.ipd.sdq.pcm.repository.Signature;

import de.uka.ipd.sdq.stoex.PCMRandomVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specified Execution Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.qosannotations.SpecifiedExecutionTime#getSignature_SpecifiedTimeConsumption <em>Signature Specified Time Consumption</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.qosannotations.SpecifiedExecutionTime#getRole_SpecifiedExecutionTime <em>Role Specified Execution Time</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.qosannotations.SpecifiedExecutionTime#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage#getSpecifiedExecutionTime()
 * @model abstract="true"
 * @generated
 */
public interface SpecifiedExecutionTime extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Signature Specified Time Consumption</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Specified Time Consumption</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Specified Time Consumption</em>' reference.
	 * @see #setSignature_SpecifiedTimeConsumption(Signature)
	 * @see de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage#getSpecifiedExecutionTime_Signature_SpecifiedTimeConsumption()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signature getSignature_SpecifiedTimeConsumption();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.qosannotations.SpecifiedExecutionTime#getSignature_SpecifiedTimeConsumption <em>Signature Specified Time Consumption</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Specified Time Consumption</em>' reference.
	 * @see #getSignature_SpecifiedTimeConsumption()
	 * @generated
	 */
	void setSignature_SpecifiedTimeConsumption(Signature value);

	/**
	 * Returns the value of the '<em><b>Role Specified Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Specified Execution Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Specified Execution Time</em>' reference.
	 * @see #setRole_SpecifiedExecutionTime(Role)
	 * @see de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage#getSpecifiedExecutionTime_Role_SpecifiedExecutionTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Role getRole_SpecifiedExecutionTime();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.qosannotations.SpecifiedExecutionTime#getRole_SpecifiedExecutionTime <em>Role Specified Execution Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Specified Execution Time</em>' reference.
	 * @see #getRole_SpecifiedExecutionTime()
	 * @generated
	 */
	void setRole_SpecifiedExecutionTime(Role value);

	/**
	 * Returns the value of the '<em><b>Specification Specified Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Specified Execution Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Specified Execution Time</em>' containment reference.
	 * @see #setSpecification_SpecifiedExecutionTime(PCMRandomVariable)
	 * @see de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage#getSpecifiedExecutionTime_Specification_SpecifiedExecutionTime()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getSpecification_SpecifiedExecutionTime();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.qosannotations.SpecifiedExecutionTime#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Specified Execution Time</em>' containment reference.
	 * @see #getSpecification_SpecifiedExecutionTime()
	 * @generated
	 */
	void setSpecification_SpecifiedExecutionTime(PCMRandomVariable value);

} // SpecifiedExecutionTime
