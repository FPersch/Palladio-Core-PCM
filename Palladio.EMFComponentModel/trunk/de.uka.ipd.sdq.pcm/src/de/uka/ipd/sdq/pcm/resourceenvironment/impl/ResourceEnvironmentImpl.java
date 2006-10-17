
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourceenvironment.impl;

import de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceEnvironment;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage;

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
 * An implementation of the model object '<em><b>Resource Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceEnvironmentImpl#getLinkingresource <em>Linkingresource</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceEnvironmentImpl#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceEnvironmentImpl extends EObjectImpl implements ResourceEnvironment {
	/**
	 * The cached value of the '{@link #getLinkingresource() <em>Linkingresource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkingresource()
	 * @generated
	 * @ordered
	 */
	protected EList linkingresource = null;

	/**
	 * The cached value of the '{@link #getResourceContainer_ResourceEnvironment() <em>Resource Container Resource Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer_ResourceEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList resourceContainer_ResourceEnvironment = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ResourceenvironmentPackage.Literals.RESOURCE_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLinkingresource() {
		if (linkingresource == null) {
			linkingresource = new EObjectContainmentEList(LinkingResource.class, this, ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__LINKINGRESOURCE);
		}
		return linkingresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResourceContainer_ResourceEnvironment() {
		if (resourceContainer_ResourceEnvironment == null) {
			resourceContainer_ResourceEnvironment = new EObjectContainmentEList(ResourceContainer.class, this, ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT);
		}
		return resourceContainer_ResourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__LINKINGRESOURCE:
				return ((InternalEList)getLinkingresource()).basicRemove(otherEnd, msgs);
			case ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				return ((InternalEList)getResourceContainer_ResourceEnvironment()).basicRemove(otherEnd, msgs);
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
			case ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__LINKINGRESOURCE:
				return getLinkingresource();
			case ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				return getResourceContainer_ResourceEnvironment();
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
			case ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__LINKINGRESOURCE:
				getLinkingresource().clear();
				getLinkingresource().addAll((Collection)newValue);
				return;
			case ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				getResourceContainer_ResourceEnvironment().clear();
				getResourceContainer_ResourceEnvironment().addAll((Collection)newValue);
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
			case ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__LINKINGRESOURCE:
				getLinkingresource().clear();
				return;
			case ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				getResourceContainer_ResourceEnvironment().clear();
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
			case ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__LINKINGRESOURCE:
				return linkingresource != null && !linkingresource.isEmpty();
			case ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				return resourceContainer_ResourceEnvironment != null && !resourceContainer_ResourceEnvironment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceEnvironmentImpl