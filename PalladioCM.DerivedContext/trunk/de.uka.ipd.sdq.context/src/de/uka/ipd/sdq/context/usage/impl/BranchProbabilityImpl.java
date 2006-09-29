/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.context.usage.impl;

import de.uka.ipd.sdq.context.usage.BranchProbability;
import de.uka.ipd.sdq.context.usage.UsagePackage;

import de.uka.ipd.sdq.pcm.seff.BranchTransition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Probability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.context.usage.impl.BranchProbabilityImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.context.usage.impl.BranchProbabilityImpl#getBranchtransition_BranchProbability <em>Branchtransition Branch Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchProbabilityImpl extends EObjectImpl implements BranchProbability {
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBranchtransition_BranchProbability() <em>Branchtransition Branch Probability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchtransition_BranchProbability()
	 * @generated
	 * @ordered
	 */
	protected BranchTransition branchtransition_BranchProbability = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchProbabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UsagePackage.Literals.BRANCH_PROBABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagePackage.BRANCH_PROBABILITY__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchTransition getBranchtransition_BranchProbability() {
		if (branchtransition_BranchProbability != null && branchtransition_BranchProbability.eIsProxy()) {
			InternalEObject oldBranchtransition_BranchProbability = (InternalEObject)branchtransition_BranchProbability;
			branchtransition_BranchProbability = (BranchTransition)eResolveProxy(oldBranchtransition_BranchProbability);
			if (branchtransition_BranchProbability != oldBranchtransition_BranchProbability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY, oldBranchtransition_BranchProbability, branchtransition_BranchProbability));
			}
		}
		return branchtransition_BranchProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchTransition basicGetBranchtransition_BranchProbability() {
		return branchtransition_BranchProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchtransition_BranchProbability(BranchTransition newBranchtransition_BranchProbability) {
		BranchTransition oldBranchtransition_BranchProbability = branchtransition_BranchProbability;
		branchtransition_BranchProbability = newBranchtransition_BranchProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY, oldBranchtransition_BranchProbability, branchtransition_BranchProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsagePackage.BRANCH_PROBABILITY__PROBABILITY:
				return new Double(getProbability());
			case UsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY:
				if (resolve) return getBranchtransition_BranchProbability();
				return basicGetBranchtransition_BranchProbability();
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
			case UsagePackage.BRANCH_PROBABILITY__PROBABILITY:
				setProbability(((Double)newValue).doubleValue());
				return;
			case UsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY:
				setBranchtransition_BranchProbability((BranchTransition)newValue);
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
			case UsagePackage.BRANCH_PROBABILITY__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case UsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY:
				setBranchtransition_BranchProbability((BranchTransition)null);
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
			case UsagePackage.BRANCH_PROBABILITY__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case UsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY:
				return branchtransition_BranchProbability != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //BranchProbabilityImpl