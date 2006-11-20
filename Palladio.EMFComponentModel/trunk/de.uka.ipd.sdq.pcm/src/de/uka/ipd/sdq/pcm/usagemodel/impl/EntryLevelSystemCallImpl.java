
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.usagemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.parameter.ParameterUsage;
import de.uka.ipd.sdq.pcm.repository.ProvidedRole;

import de.uka.ipd.sdq.pcm.repository.Signature;
import de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall;
import de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Level System Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.usagemodel.impl.EntryLevelSystemCallImpl#getActualParameterUsage_EntryLevelSystemCall <em>Actual Parameter Usage Entry Level System Call</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.usagemodel.impl.EntryLevelSystemCallImpl#getProvidedRole_EntryLevelSystemCall <em>Provided Role Entry Level System Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryLevelSystemCallImpl extends AbstractUserActionImpl implements EntryLevelSystemCall {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(c) by SDQ, IPD, U Karlsruhe (TH), 2006";

	/**
	 * The cached value of the '{@link #getActualParameterUsage_EntryLevelSystemCall() <em>Actual Parameter Usage Entry Level System Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualParameterUsage_EntryLevelSystemCall()
	 * @generated
	 * @ordered
	 */
	protected EList actualParameterUsage_EntryLevelSystemCall = null;

	/**
	 * The cached value of the '{@link #getProvidedRole_EntryLevelSystemCall() <em>Provided Role Entry Level System Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole_EntryLevelSystemCall()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole providedRole_EntryLevelSystemCall = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryLevelSystemCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UsagemodelPackage.Literals.ENTRY_LEVEL_SYSTEM_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActualParameterUsage_EntryLevelSystemCall() {
		if (actualParameterUsage_EntryLevelSystemCall == null) {
			actualParameterUsage_EntryLevelSystemCall = new EObjectContainmentEList(ParameterUsage.class, this, UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__ACTUAL_PARAMETER_USAGE_ENTRY_LEVEL_SYSTEM_CALL);
		}
		return actualParameterUsage_EntryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getProvidedRole_EntryLevelSystemCall() {
		if (providedRole_EntryLevelSystemCall != null && providedRole_EntryLevelSystemCall.eIsProxy()) {
			InternalEObject oldProvidedRole_EntryLevelSystemCall = (InternalEObject)providedRole_EntryLevelSystemCall;
			providedRole_EntryLevelSystemCall = (ProvidedRole)eResolveProxy(oldProvidedRole_EntryLevelSystemCall);
			if (providedRole_EntryLevelSystemCall != oldProvidedRole_EntryLevelSystemCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__PROVIDED_ROLE_ENTRY_LEVEL_SYSTEM_CALL, oldProvidedRole_EntryLevelSystemCall, providedRole_EntryLevelSystemCall));
			}
		}
		return providedRole_EntryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetProvidedRole_EntryLevelSystemCall() {
		return providedRole_EntryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedRole_EntryLevelSystemCall(ProvidedRole newProvidedRole_EntryLevelSystemCall) {
		ProvidedRole oldProvidedRole_EntryLevelSystemCall = providedRole_EntryLevelSystemCall;
		providedRole_EntryLevelSystemCall = newProvidedRole_EntryLevelSystemCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__PROVIDED_ROLE_ENTRY_LEVEL_SYSTEM_CALL, oldProvidedRole_EntryLevelSystemCall, providedRole_EntryLevelSystemCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__ACTUAL_PARAMETER_USAGE_ENTRY_LEVEL_SYSTEM_CALL:
				return ((InternalEList)getActualParameterUsage_EntryLevelSystemCall()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__ACTUAL_PARAMETER_USAGE_ENTRY_LEVEL_SYSTEM_CALL:
				return getActualParameterUsage_EntryLevelSystemCall();
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__PROVIDED_ROLE_ENTRY_LEVEL_SYSTEM_CALL:
				if (resolve) return getProvidedRole_EntryLevelSystemCall();
				return basicGetProvidedRole_EntryLevelSystemCall();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__ACTUAL_PARAMETER_USAGE_ENTRY_LEVEL_SYSTEM_CALL:
				getActualParameterUsage_EntryLevelSystemCall().clear();
				getActualParameterUsage_EntryLevelSystemCall().addAll((Collection)newValue);
				return;
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__PROVIDED_ROLE_ENTRY_LEVEL_SYSTEM_CALL:
				setProvidedRole_EntryLevelSystemCall((ProvidedRole)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__ACTUAL_PARAMETER_USAGE_ENTRY_LEVEL_SYSTEM_CALL:
				getActualParameterUsage_EntryLevelSystemCall().clear();
				return;
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__PROVIDED_ROLE_ENTRY_LEVEL_SYSTEM_CALL:
				setProvidedRole_EntryLevelSystemCall((ProvidedRole)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__ACTUAL_PARAMETER_USAGE_ENTRY_LEVEL_SYSTEM_CALL:
				return actualParameterUsage_EntryLevelSystemCall != null && !actualParameterUsage_EntryLevelSystemCall.isEmpty();
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL__PROVIDED_ROLE_ENTRY_LEVEL_SYSTEM_CALL:
				return providedRole_EntryLevelSystemCall != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryLevelSystemCallImpl