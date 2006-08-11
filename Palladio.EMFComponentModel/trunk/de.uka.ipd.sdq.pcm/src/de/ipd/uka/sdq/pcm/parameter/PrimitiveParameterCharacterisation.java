/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.ipd.uka.sdq.pcm.parameter;

import de.ipd.uka.sdq.pcm.core.stochastics.RandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Parameter Characterisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.ipd.uka.sdq.pcm.parameter.PrimitiveParameterCharacterisation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.ipd.uka.sdq.pcm.parameter.ParameterPackage#getPrimitiveParameterCharacterisation()
 * @model
 * @generated
 */
public interface PrimitiveParameterCharacterisation extends RandomVariable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ipd.uka.sdq.pcm.parameter.PrimitiveParameterCharacterisationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.ipd.uka.sdq.pcm.parameter.PrimitiveParameterCharacterisationType
	 * @see #setType(PrimitiveParameterCharacterisationType)
	 * @see de.ipd.uka.sdq.pcm.parameter.ParameterPackage#getPrimitiveParameterCharacterisation_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PrimitiveParameterCharacterisationType getType();

	/**
	 * Sets the value of the '{@link de.ipd.uka.sdq.pcm.parameter.PrimitiveParameterCharacterisation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.ipd.uka.sdq.pcm.parameter.PrimitiveParameterCharacterisationType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveParameterCharacterisationType value);

} // PrimitiveParameterCharacterisation