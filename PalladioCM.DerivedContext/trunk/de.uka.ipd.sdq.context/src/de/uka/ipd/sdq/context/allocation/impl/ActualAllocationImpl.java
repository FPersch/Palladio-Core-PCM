/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.context.allocation.impl;

import de.uka.ipd.sdq.context.allocation.ActualAllocation;
import de.uka.ipd.sdq.context.allocation.ActualAllocationContext;
import de.uka.ipd.sdq.context.allocation.AllocationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.context.allocation.impl.ActualAllocationImpl#getActualAllocationContext_ActualAllocation <em>Actual Allocation Context Actual Allocation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActualAllocationImpl extends EObjectImpl implements ActualAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

	/**
	 * The cached value of the '{@link #getActualAllocationContext_ActualAllocation() <em>Actual Allocation Context Actual Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualAllocationContext_ActualAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList actualAllocationContext_ActualAllocation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AllocationPackage.Literals.ACTUAL_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActualAllocationContext_ActualAllocation() {
		if (actualAllocationContext_ActualAllocation == null) {
			actualAllocationContext_ActualAllocation = new EObjectContainmentEList(ActualAllocationContext.class, this, AllocationPackage.ACTUAL_ALLOCATION__ACTUAL_ALLOCATION_CONTEXT_ACTUAL_ALLOCATION);
		}
		return actualAllocationContext_ActualAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationPackage.ACTUAL_ALLOCATION__ACTUAL_ALLOCATION_CONTEXT_ACTUAL_ALLOCATION:
				return ((InternalEList)getActualAllocationContext_ActualAllocation()).basicRemove(otherEnd, msgs);
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
			case AllocationPackage.ACTUAL_ALLOCATION__ACTUAL_ALLOCATION_CONTEXT_ACTUAL_ALLOCATION:
				return getActualAllocationContext_ActualAllocation();
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
			case AllocationPackage.ACTUAL_ALLOCATION__ACTUAL_ALLOCATION_CONTEXT_ACTUAL_ALLOCATION:
				getActualAllocationContext_ActualAllocation().clear();
				getActualAllocationContext_ActualAllocation().addAll((Collection)newValue);
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
			case AllocationPackage.ACTUAL_ALLOCATION__ACTUAL_ALLOCATION_CONTEXT_ACTUAL_ALLOCATION:
				getActualAllocationContext_ActualAllocation().clear();
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
			case AllocationPackage.ACTUAL_ALLOCATION__ACTUAL_ALLOCATION_CONTEXT_ACTUAL_ALLOCATION:
				return actualAllocationContext_ActualAllocation != null && !actualAllocationContext_ActualAllocation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActualAllocationImpl