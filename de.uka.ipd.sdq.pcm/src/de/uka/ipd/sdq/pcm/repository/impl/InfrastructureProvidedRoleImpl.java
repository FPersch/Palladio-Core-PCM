/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.repository.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.pcm.repository.InfrastructureInterface;
import de.uka.ipd.sdq.pcm.repository.InfrastructureProvidedRole;
import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Infrastructure Provided Role</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.repository.impl.InfrastructureProvidedRoleImpl#getProvidedInterface__InfrastructureProvidedRole
 * <em>Provided Interface Infrastructure Provided Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureProvidedRoleImpl extends ProvidedRoleImpl implements InfrastructureProvidedRole {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

    /**
     * The cached value of the '{@link #getProvidedInterface__InfrastructureProvidedRole()
     * <em>Provided Interface Infrastructure Provided Role</em>}' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getProvidedInterface__InfrastructureProvidedRole()
     * @generated
     * @ordered
     */
    protected InfrastructureInterface providedInterface__InfrastructureProvidedRole;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InfrastructureProvidedRoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RepositoryPackage.Literals.INFRASTRUCTURE_PROVIDED_ROLE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InfrastructureInterface getProvidedInterface__InfrastructureProvidedRole() {
        if (this.providedInterface__InfrastructureProvidedRole != null
                && ((EObject) this.providedInterface__InfrastructureProvidedRole).eIsProxy()) {
            final InternalEObject oldProvidedInterface__InfrastructureProvidedRole = (InternalEObject) this.providedInterface__InfrastructureProvidedRole;
            this.providedInterface__InfrastructureProvidedRole = (InfrastructureInterface) this
                    .eResolveProxy(oldProvidedInterface__InfrastructureProvidedRole);
            if (this.providedInterface__InfrastructureProvidedRole != oldProvidedInterface__InfrastructureProvidedRole) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(
                            this,
                            Notification.RESOLVE,
                            RepositoryPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE,
                            oldProvidedInterface__InfrastructureProvidedRole,
                            this.providedInterface__InfrastructureProvidedRole));
                }
            }
        }
        return this.providedInterface__InfrastructureProvidedRole;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public InfrastructureInterface basicGetProvidedInterface__InfrastructureProvidedRole() {
        return this.providedInterface__InfrastructureProvidedRole;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProvidedInterface__InfrastructureProvidedRole(
            final InfrastructureInterface newProvidedInterface__InfrastructureProvidedRole) {
        final InfrastructureInterface oldProvidedInterface__InfrastructureProvidedRole = this.providedInterface__InfrastructureProvidedRole;
        this.providedInterface__InfrastructureProvidedRole = newProvidedInterface__InfrastructureProvidedRole;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    RepositoryPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE,
                    oldProvidedInterface__InfrastructureProvidedRole,
                    this.providedInterface__InfrastructureProvidedRole));
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
        case RepositoryPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE:
            if (resolve) {
                return this.getProvidedInterface__InfrastructureProvidedRole();
            }
            return this.basicGetProvidedInterface__InfrastructureProvidedRole();
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
        case RepositoryPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE:
            this.setProvidedInterface__InfrastructureProvidedRole((InfrastructureInterface) newValue);
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
        case RepositoryPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE:
            this.setProvidedInterface__InfrastructureProvidedRole((InfrastructureInterface) null);
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
        case RepositoryPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE:
            return this.providedInterface__InfrastructureProvidedRole != null;
        }
        return super.eIsSet(featureID);
    }

} // InfrastructureProvidedRoleImpl