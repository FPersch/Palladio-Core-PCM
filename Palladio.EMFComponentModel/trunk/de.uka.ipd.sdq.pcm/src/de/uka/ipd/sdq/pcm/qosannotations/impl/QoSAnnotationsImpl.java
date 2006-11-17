
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.qosannotations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.core.entity.impl.EntityImpl;
import de.uka.ipd.sdq.pcm.qosannotations.QoSAnnotations;
import de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage;
import de.uka.ipd.sdq.pcm.qosannotations.SpecifiedExecutionTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SAnnotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.qosannotations.impl.QoSAnnotationsImpl#getSpecifiedExecutionTimes_QoSAnnotations <em>Specified Execution Times Qo SAnnotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QoSAnnotationsImpl extends EntityImpl implements QoSAnnotations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(c) by SDQ, IPD, U Karlsruhe (TH), 2006";

	/**
	 * The cached value of the '{@link #getSpecifiedExecutionTimes_QoSAnnotations() <em>Specified Execution Times Qo SAnnotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedExecutionTimes_QoSAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList specifiedExecutionTimes_QoSAnnotations = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSAnnotationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QosannotationsPackage.Literals.QO_SANNOTATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpecifiedExecutionTimes_QoSAnnotations() {
		if (specifiedExecutionTimes_QoSAnnotations == null) {
			specifiedExecutionTimes_QoSAnnotations = new EObjectContainmentEList(SpecifiedExecutionTime.class, this, QosannotationsPackage.QO_SANNOTATIONS__SPECIFIED_EXECUTION_TIMES_QO_SANNOTATIONS);
		}
		return specifiedExecutionTimes_QoSAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QosannotationsPackage.QO_SANNOTATIONS__SPECIFIED_EXECUTION_TIMES_QO_SANNOTATIONS:
				return ((InternalEList)getSpecifiedExecutionTimes_QoSAnnotations()).basicRemove(otherEnd, msgs);
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
			case QosannotationsPackage.QO_SANNOTATIONS__SPECIFIED_EXECUTION_TIMES_QO_SANNOTATIONS:
				return getSpecifiedExecutionTimes_QoSAnnotations();
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
			case QosannotationsPackage.QO_SANNOTATIONS__SPECIFIED_EXECUTION_TIMES_QO_SANNOTATIONS:
				getSpecifiedExecutionTimes_QoSAnnotations().clear();
				getSpecifiedExecutionTimes_QoSAnnotations().addAll((Collection)newValue);
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
			case QosannotationsPackage.QO_SANNOTATIONS__SPECIFIED_EXECUTION_TIMES_QO_SANNOTATIONS:
				getSpecifiedExecutionTimes_QoSAnnotations().clear();
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
			case QosannotationsPackage.QO_SANNOTATIONS__SPECIFIED_EXECUTION_TIMES_QO_SANNOTATIONS:
				return specifiedExecutionTimes_QoSAnnotations != null && !specifiedExecutionTimes_QoSAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QoSAnnotationsImpl