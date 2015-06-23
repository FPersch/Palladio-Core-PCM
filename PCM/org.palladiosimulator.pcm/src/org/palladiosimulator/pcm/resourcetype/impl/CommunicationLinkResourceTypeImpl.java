/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package org.palladiosimulator.pcm.resourcetype.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.reliability.NetworkInducedFailureType;
import org.palladiosimulator.pcm.reliability.ReliabilityPackage;

import org.palladiosimulator.pcm.resourcetype.CommunicationLinkResourceType;
import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.resourcetype.impl.CommunicationLinkResourceTypeImpl#getNetworkInducedFailureType__CommunicationLinkResourceType <em>Network Induced Failure Type Communication Link Resource Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationLinkResourceTypeImpl extends ResourceTypeImpl implements CommunicationLinkResourceType {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommunicationLinkResourceTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResourcetypePackage.Literals.COMMUNICATION_LINK_RESOURCE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkInducedFailureType getNetworkInducedFailureType__CommunicationLinkResourceType() {
        return (NetworkInducedFailureType) eDynamicGet(
                ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE,
                ResourcetypePackage.Literals.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE,
                true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkInducedFailureType basicGetNetworkInducedFailureType__CommunicationLinkResourceType() {
        return (NetworkInducedFailureType) eDynamicGet(
                ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE,
                ResourcetypePackage.Literals.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE,
                false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNetworkInducedFailureType__CommunicationLinkResourceType(
            NetworkInducedFailureType newNetworkInducedFailureType__CommunicationLinkResourceType,
            NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newNetworkInducedFailureType__CommunicationLinkResourceType,
                ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNetworkInducedFailureType__CommunicationLinkResourceType(
            NetworkInducedFailureType newNetworkInducedFailureType__CommunicationLinkResourceType) {
        eDynamicSet(
                ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE,
                ResourcetypePackage.Literals.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE,
                newNetworkInducedFailureType__CommunicationLinkResourceType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            NetworkInducedFailureType networkInducedFailureType__CommunicationLinkResourceType = basicGetNetworkInducedFailureType__CommunicationLinkResourceType();
            if (networkInducedFailureType__CommunicationLinkResourceType != null)
                msgs = ((InternalEObject) networkInducedFailureType__CommunicationLinkResourceType).eInverseRemove(this,
                        ReliabilityPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE,
                        NetworkInducedFailureType.class, msgs);
            return basicSetNetworkInducedFailureType__CommunicationLinkResourceType(
                    (NetworkInducedFailureType) otherEnd, msgs);
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
        case ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            return basicSetNetworkInducedFailureType__CommunicationLinkResourceType(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            if (resolve)
                return getNetworkInducedFailureType__CommunicationLinkResourceType();
            return basicGetNetworkInducedFailureType__CommunicationLinkResourceType();
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
        case ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            setNetworkInducedFailureType__CommunicationLinkResourceType((NetworkInducedFailureType) newValue);
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
        case ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            setNetworkInducedFailureType__CommunicationLinkResourceType((NetworkInducedFailureType) null);
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
        case ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            return basicGetNetworkInducedFailureType__CommunicationLinkResourceType() != null;
        }
        return super.eIsSet(featureID);
    }

} //CommunicationLinkResourceTypeImpl
