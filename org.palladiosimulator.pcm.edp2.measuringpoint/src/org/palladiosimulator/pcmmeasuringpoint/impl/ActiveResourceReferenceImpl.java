/**
 */
package org.palladiosimulator.pcmmeasuringpoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.pcmmeasuringpoint.ActiveResourceReference;
import org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage;

import de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Active Resource Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.pcmmeasuringpoint.impl.ActiveResourceReferenceImpl#getActiveResource
 * <em>Active Resource</em>}</li>
 * <li>{@link org.palladiosimulator.pcmmeasuringpoint.impl.ActiveResourceReferenceImpl#getReplicaID
 * <em>Replica ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActiveResourceReferenceImpl extends MinimalEObjectImpl.Container implements
ActiveResourceReference {
    /**
     * The cached value of the '{@link #getActiveResource() <em>Active Resource</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getActiveResource()
     * @generated
     * @ordered
     */
    protected ProcessingResourceSpecification activeResource;

    /**
     * The default value of the '{@link #getReplicaID() <em>Replica ID</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getReplicaID()
     * @generated
     * @ordered
     */
    protected static final int REPLICA_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getReplicaID() <em>Replica ID</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getReplicaID()
     * @generated
     * @ordered
     */
    protected int replicaID = REPLICA_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ActiveResourceReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PcmmeasuringpointPackage.Literals.ACTIVE_RESOURCE_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ProcessingResourceSpecification getActiveResource() {
        if (this.activeResource != null && ((EObject) this.activeResource).eIsProxy()) {
            final InternalEObject oldActiveResource = (InternalEObject) this.activeResource;
            this.activeResource = (ProcessingResourceSpecification) this.eResolveProxy(oldActiveResource);
            if (this.activeResource != oldActiveResource) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__ACTIVE_RESOURCE, oldActiveResource,
                            this.activeResource));
                }
            }
        }
        return this.activeResource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ProcessingResourceSpecification basicGetActiveResource() {
        return this.activeResource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setActiveResource(final ProcessingResourceSpecification newActiveResource) {
        final ProcessingResourceSpecification oldActiveResource = this.activeResource;
        this.activeResource = newActiveResource;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__ACTIVE_RESOURCE, oldActiveResource,
                    this.activeResource));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getReplicaID() {
        return this.replicaID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setReplicaID(final int newReplicaID) {
        final int oldReplicaID = this.replicaID;
        this.replicaID = newReplicaID;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__REPLICA_ID, oldReplicaID, this.replicaID));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__ACTIVE_RESOURCE:
            if (resolve) {
                return this.getActiveResource();
            }
            return this.basicGetActiveResource();
        case PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__REPLICA_ID:
            return this.getReplicaID();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__ACTIVE_RESOURCE:
            this.setActiveResource((ProcessingResourceSpecification) newValue);
            return;
        case PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__REPLICA_ID:
            this.setReplicaID((Integer) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__ACTIVE_RESOURCE:
            this.setActiveResource((ProcessingResourceSpecification) null);
            return;
        case PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__REPLICA_ID:
            this.setReplicaID(REPLICA_ID_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__ACTIVE_RESOURCE:
            return this.activeResource != null;
        case PcmmeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE__REPLICA_ID:
            return this.replicaID != REPLICA_ID_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (replicaID: ");
        result.append(this.replicaID);
        result.append(')');
        return result.toString();
    }

} // ActiveResourceReferenceImpl
