/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.parameter;

import de.uka.ipd.sdq.stoex.PCMRandomVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Characterisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.parameter.VariableCharacterisation#getType <em>Type</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.parameter.VariableCharacterisation#getSpecification_VariableCharacterisation <em>Specification Variable Characterisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.parameter.ParameterPackage#getVariableCharacterisation()
 * @model
 * @generated
 */
public interface VariableCharacterisation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uka.ipd.sdq.pcm.parameter.VariableCharacterisationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.uka.ipd.sdq.pcm.parameter.VariableCharacterisationType
	 * @see #setType(VariableCharacterisationType)
	 * @see de.uka.ipd.sdq.pcm.parameter.ParameterPackage#getVariableCharacterisation_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VariableCharacterisationType getType();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.parameter.VariableCharacterisation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.uka.ipd.sdq.pcm.parameter.VariableCharacterisationType
	 * @see #getType()
	 * @generated
	 */
	void setType(VariableCharacterisationType value);

	/**
	 * Returns the value of the '<em><b>Specification Variable Characterisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Variable Characterisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Variable Characterisation</em>' containment reference.
	 * @see #setSpecification_VariableCharacterisation(PCMRandomVariable)
	 * @see de.uka.ipd.sdq.pcm.parameter.ParameterPackage#getVariableCharacterisation_Specification_VariableCharacterisation()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getSpecification_VariableCharacterisation();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.parameter.VariableCharacterisation#getSpecification_VariableCharacterisation <em>Specification Variable Characterisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Variable Characterisation</em>' containment reference.
	 * @see #getSpecification_VariableCharacterisation()
	 * @generated
	 */
	void setSpecification_VariableCharacterisation(PCMRandomVariable value);

} // VariableCharacterisation
