/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fzi.se.quality.parameters.impl;

import de.fzi.se.quality.parameters.ParameterInstance;
import de.fzi.se.quality.parameters.ParameterValue;
import de.fzi.se.quality.parameters.ParametersPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fzi.se.quality.parameters.impl.ParameterValueImpl#getParameterInstance <em>Parameter Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ParameterValueImpl extends IdentifierImpl implements ParameterValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInstance getParameterInstance() {
		if (eContainerFeatureID() != ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE) return null;
		return (ParameterInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterInstance(ParameterInstance newParameterInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParameterInstance, ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterInstance(ParameterInstance newParameterInstance) {
		if (newParameterInstance != eInternalContainer() || (eContainerFeatureID() != ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE && newParameterInstance != null)) {
			if (EcoreUtil.isAncestor(this, newParameterInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParameterInstance != null)
				msgs = ((InternalEObject)newParameterInstance).eInverseAdd(this, ParametersPackage.PARAMETER_INSTANCE__PARAMETER_VALUE, ParameterInstance.class, msgs);
			msgs = basicSetParameterInstance(newParameterInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE, newParameterInstance, newParameterInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParameterInstance((ParameterInstance)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE:
				return basicSetParameterInstance(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE:
				return eInternalContainer().eInverseRemove(this, ParametersPackage.PARAMETER_INSTANCE__PARAMETER_VALUE, ParameterInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE:
				return getParameterInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE:
				setParameterInstance((ParameterInstance)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE:
				setParameterInstance((ParameterInstance)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ParametersPackage.PARAMETER_VALUE__PARAMETER_INSTANCE:
				return getParameterInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterValueImpl
