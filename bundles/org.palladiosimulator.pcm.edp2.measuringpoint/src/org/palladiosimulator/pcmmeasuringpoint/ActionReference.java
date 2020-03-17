/**
 */
package org.palladiosimulator.pcmmeasuringpoint;

import org.eclipse.emf.cdo.CDOObject;

import org.palladiosimulator.pcm.seff.AbstractAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcmmeasuringpoint.ActionReference#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage#getActionReference()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ActionReference extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(AbstractAction)
	 * @see org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage#getActionReference_Action()
	 * @model required="true"
	 * @generated
	 */
	AbstractAction getAction();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcmmeasuringpoint.ActionReference#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AbstractAction value);

} // ActionReference
