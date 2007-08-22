/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.usagemodel;

import de.uka.ipd.sdq.stoex.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.usagemodel.Delay#getTimeSpecification_Delay <em>Time Specification Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage#getDelay()
 * @model
 * @generated
 */
public interface Delay extends AbstractUserAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Time Specification Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Specification Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Specification Delay</em>' containment reference.
	 * @see #setTimeSpecification_Delay(PCMRandomVariable)
	 * @see de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage#getDelay_TimeSpecification_Delay()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getTimeSpecification_Delay();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.usagemodel.Delay#getTimeSpecification_Delay <em>Time Specification Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Specification Delay</em>' containment reference.
	 * @see #getTimeSpecification_Delay()
	 * @generated
	 */
	void setTimeSpecification_Delay(PCMRandomVariable value);

} // Delay
