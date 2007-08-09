/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.qosannotations.impl;

import de.uka.ipd.sdq.pcm.parameter.impl.VariableUsageImpl;

import de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage;
import de.uka.ipd.sdq.pcm.qosannotations.SpecifiedOutputParameterAbstraction;

import de.uka.ipd.sdq.pcm.repository.Role;
import de.uka.ipd.sdq.pcm.repository.Signature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specified Output Parameter Abstraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.qosannotations.impl.SpecifiedOutputParameterAbstractionImpl#getSignature_SpecifiedOutputParameterAbstraction <em>Signature Specified Output Parameter Abstraction</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.qosannotations.impl.SpecifiedOutputParameterAbstractionImpl#getRole_SpecifiedOutputParameterAbstraction <em>Role Specified Output Parameter Abstraction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecifiedOutputParameterAbstractionImpl extends VariableUsageImpl implements SpecifiedOutputParameterAbstraction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached value of the '{@link #getSignature_SpecifiedOutputParameterAbstraction() <em>Signature Specified Output Parameter Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature_SpecifiedOutputParameterAbstraction()
	 * @generated
	 * @ordered
	 */
	protected Signature signature_SpecifiedOutputParameterAbstraction;

	/**
	 * The cached value of the '{@link #getRole_SpecifiedOutputParameterAbstraction() <em>Role Specified Output Parameter Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_SpecifiedOutputParameterAbstraction()
	 * @generated
	 * @ordered
	 */
	protected Role role_SpecifiedOutputParameterAbstraction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecifiedOutputParameterAbstractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QosannotationsPackage.Literals.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getSignature_SpecifiedOutputParameterAbstraction() {
		if (signature_SpecifiedOutputParameterAbstraction != null && signature_SpecifiedOutputParameterAbstraction.eIsProxy()) {
			InternalEObject oldSignature_SpecifiedOutputParameterAbstraction = (InternalEObject)signature_SpecifiedOutputParameterAbstraction;
			signature_SpecifiedOutputParameterAbstraction = (Signature)eResolveProxy(oldSignature_SpecifiedOutputParameterAbstraction);
			if (signature_SpecifiedOutputParameterAbstraction != oldSignature_SpecifiedOutputParameterAbstraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION, oldSignature_SpecifiedOutputParameterAbstraction, signature_SpecifiedOutputParameterAbstraction));
			}
		}
		return signature_SpecifiedOutputParameterAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetSignature_SpecifiedOutputParameterAbstraction() {
		return signature_SpecifiedOutputParameterAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature_SpecifiedOutputParameterAbstraction(Signature newSignature_SpecifiedOutputParameterAbstraction) {
		Signature oldSignature_SpecifiedOutputParameterAbstraction = signature_SpecifiedOutputParameterAbstraction;
		signature_SpecifiedOutputParameterAbstraction = newSignature_SpecifiedOutputParameterAbstraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION, oldSignature_SpecifiedOutputParameterAbstraction, signature_SpecifiedOutputParameterAbstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole_SpecifiedOutputParameterAbstraction() {
		if (role_SpecifiedOutputParameterAbstraction != null && role_SpecifiedOutputParameterAbstraction.eIsProxy()) {
			InternalEObject oldRole_SpecifiedOutputParameterAbstraction = (InternalEObject)role_SpecifiedOutputParameterAbstraction;
			role_SpecifiedOutputParameterAbstraction = (Role)eResolveProxy(oldRole_SpecifiedOutputParameterAbstraction);
			if (role_SpecifiedOutputParameterAbstraction != oldRole_SpecifiedOutputParameterAbstraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION, oldRole_SpecifiedOutputParameterAbstraction, role_SpecifiedOutputParameterAbstraction));
			}
		}
		return role_SpecifiedOutputParameterAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole_SpecifiedOutputParameterAbstraction() {
		return role_SpecifiedOutputParameterAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_SpecifiedOutputParameterAbstraction(Role newRole_SpecifiedOutputParameterAbstraction) {
		Role oldRole_SpecifiedOutputParameterAbstraction = role_SpecifiedOutputParameterAbstraction;
		role_SpecifiedOutputParameterAbstraction = newRole_SpecifiedOutputParameterAbstraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION, oldRole_SpecifiedOutputParameterAbstraction, role_SpecifiedOutputParameterAbstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				if (resolve) return getSignature_SpecifiedOutputParameterAbstraction();
				return basicGetSignature_SpecifiedOutputParameterAbstraction();
			case QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				if (resolve) return getRole_SpecifiedOutputParameterAbstraction();
				return basicGetRole_SpecifiedOutputParameterAbstraction();
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
			case QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				setSignature_SpecifiedOutputParameterAbstraction((Signature)newValue);
				return;
			case QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				setRole_SpecifiedOutputParameterAbstraction((Role)newValue);
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
			case QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				setSignature_SpecifiedOutputParameterAbstraction((Signature)null);
				return;
			case QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				setRole_SpecifiedOutputParameterAbstraction((Role)null);
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
			case QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return signature_SpecifiedOutputParameterAbstraction != null;
			case QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return role_SpecifiedOutputParameterAbstraction != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecifiedOutputParameterAbstractionImpl
