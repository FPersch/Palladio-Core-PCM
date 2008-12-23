/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.repository.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uka.ipd.sdq.pcm.core.entity.impl.EntityImpl;
import de.uka.ipd.sdq.pcm.repository.CollectionDataType;
import de.uka.ipd.sdq.pcm.repository.DataType;
import de.uka.ipd.sdq.pcm.repository.Repository;
import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.impl.CollectionDataTypeImpl#getRepository_DataType <em>Repository Data Type</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.impl.CollectionDataTypeImpl#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionDataTypeImpl extends EntityImpl implements CollectionDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached value of the '{@link #getInnerType_CollectionDataType() <em>Inner Type Collection Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerType_CollectionDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType innerType_CollectionDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.COLLECTION_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository_DataType() {
		if (eContainerFeatureID != RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE) return null;
		return (Repository)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository_DataType(Repository newRepository_DataType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository_DataType, RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository_DataType(Repository newRepository_DataType) {
		if (newRepository_DataType != eInternalContainer() || (eContainerFeatureID != RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE && newRepository_DataType != null)) {
			if (EcoreUtil.isAncestor(this, newRepository_DataType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository_DataType != null)
				msgs = ((InternalEObject)newRepository_DataType).eInverseAdd(this, RepositoryPackage.REPOSITORY__DATATYPES_REPOSITORY, Repository.class, msgs);
			msgs = basicSetRepository_DataType(newRepository_DataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE, newRepository_DataType, newRepository_DataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getInnerType_CollectionDataType() {
		if (innerType_CollectionDataType != null && innerType_CollectionDataType.eIsProxy()) {
			InternalEObject oldInnerType_CollectionDataType = (InternalEObject)innerType_CollectionDataType;
			innerType_CollectionDataType = (DataType)eResolveProxy(oldInnerType_CollectionDataType);
			if (innerType_CollectionDataType != oldInnerType_CollectionDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE, oldInnerType_CollectionDataType, innerType_CollectionDataType));
			}
		}
		return innerType_CollectionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetInnerType_CollectionDataType() {
		return innerType_CollectionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerType_CollectionDataType(DataType newInnerType_CollectionDataType) {
		DataType oldInnerType_CollectionDataType = innerType_CollectionDataType;
		innerType_CollectionDataType = newInnerType_CollectionDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE, oldInnerType_CollectionDataType, innerType_CollectionDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository_DataType((Repository)otherEnd, msgs);
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
			case RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
				return basicSetRepository_DataType(null, msgs);
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
		switch (eContainerFeatureID) {
			case RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
				return eInternalContainer().eInverseRemove(this, RepositoryPackage.REPOSITORY__DATATYPES_REPOSITORY, Repository.class, msgs);
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
			case RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
				return getRepository_DataType();
			case RepositoryPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
				if (resolve) return getInnerType_CollectionDataType();
				return basicGetInnerType_CollectionDataType();
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
			case RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
				setRepository_DataType((Repository)newValue);
				return;
			case RepositoryPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
				setInnerType_CollectionDataType((DataType)newValue);
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
			case RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
				setRepository_DataType((Repository)null);
				return;
			case RepositoryPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
				setInnerType_CollectionDataType((DataType)null);
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
			case RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE:
				return getRepository_DataType() != null;
			case RepositoryPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
				return innerType_CollectionDataType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
				case RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE: return RepositoryPackage.DATA_TYPE__REPOSITORY_DATA_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
				case RepositoryPackage.DATA_TYPE__REPOSITORY_DATA_TYPE: return RepositoryPackage.COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CollectionDataTypeImpl
