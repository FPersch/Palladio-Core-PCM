/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.ipd.uka.sdq.pcm.resourcetype.impl;

import de.ipd.uka.sdq.pcm.resourcetype.ResourceRepository;
import de.ipd.uka.sdq.pcm.resourcetype.ResourceType;
import de.ipd.uka.sdq.pcm.resourcetype.ResourcetypePackage;

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
 * An implementation of the model object '<em><b>Resource Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.ipd.uka.sdq.pcm.resourcetype.impl.ResourceRepositoryImpl#getAvailableResourceTypes_ResourceRepository <em>Available Resource Types Resource Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRepositoryImpl extends EObjectImpl implements ResourceRepository {
	/**
	 * The cached value of the '{@link #getAvailableResourceTypes_ResourceRepository() <em>Available Resource Types Resource Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableResourceTypes_ResourceRepository()
	 * @generated
	 * @ordered
	 */
	protected EList availableResourceTypes_ResourceRepository = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ResourcetypePackage.Literals.RESOURCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAvailableResourceTypes_ResourceRepository() {
		if (availableResourceTypes_ResourceRepository == null) {
			availableResourceTypes_ResourceRepository = new EObjectContainmentEList(ResourceType.class, this, ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY);
		}
		return availableResourceTypes_ResourceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				return ((InternalEList)getAvailableResourceTypes_ResourceRepository()).basicRemove(otherEnd, msgs);
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
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				return getAvailableResourceTypes_ResourceRepository();
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
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				getAvailableResourceTypes_ResourceRepository().clear();
				getAvailableResourceTypes_ResourceRepository().addAll((Collection)newValue);
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
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				getAvailableResourceTypes_ResourceRepository().clear();
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
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				return availableResourceTypes_ResourceRepository != null && !availableResourceTypes_ResourceRepository.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceRepositoryImpl