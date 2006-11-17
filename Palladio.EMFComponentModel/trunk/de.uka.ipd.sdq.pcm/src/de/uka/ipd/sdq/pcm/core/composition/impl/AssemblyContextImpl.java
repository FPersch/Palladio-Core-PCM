
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.core.composition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.core.composition.CompositionPackage;
import de.uka.ipd.sdq.pcm.core.entity.impl.EntityImpl;
import de.uka.ipd.sdq.pcm.repository.ProvidesComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.AssemblyContextImpl#getEncapsulatedComponent_ChildComponentContext <em>Encapsulated Component Child Component Context</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.AssemblyContextImpl#getParentStructure_AssemblyContext <em>Parent Structure Assembly Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyContextImpl extends EntityImpl implements AssemblyContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(c) by SDQ, IPD, U Karlsruhe (TH), 2006";

	/**
	 * The cached value of the '{@link #getEncapsulatedComponent_ChildComponentContext() <em>Encapsulated Component Child Component Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedComponent_ChildComponentContext()
	 * @generated
	 * @ordered
	 */
	protected ProvidesComponentType encapsulatedComponent_ChildComponentContext = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.ASSEMBLY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidesComponentType getEncapsulatedComponent_ChildComponentContext() {
		if (encapsulatedComponent_ChildComponentContext != null && encapsulatedComponent_ChildComponentContext.eIsProxy()) {
			InternalEObject oldEncapsulatedComponent_ChildComponentContext = (InternalEObject)encapsulatedComponent_ChildComponentContext;
			encapsulatedComponent_ChildComponentContext = (ProvidesComponentType)eResolveProxy(oldEncapsulatedComponent_ChildComponentContext);
			if (encapsulatedComponent_ChildComponentContext != oldEncapsulatedComponent_ChildComponentContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_CHILD_COMPONENT_CONTEXT, oldEncapsulatedComponent_ChildComponentContext, encapsulatedComponent_ChildComponentContext));
			}
		}
		return encapsulatedComponent_ChildComponentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidesComponentType basicGetEncapsulatedComponent_ChildComponentContext() {
		return encapsulatedComponent_ChildComponentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncapsulatedComponent_ChildComponentContext(ProvidesComponentType newEncapsulatedComponent_ChildComponentContext) {
		ProvidesComponentType oldEncapsulatedComponent_ChildComponentContext = encapsulatedComponent_ChildComponentContext;
		encapsulatedComponent_ChildComponentContext = newEncapsulatedComponent_ChildComponentContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_CHILD_COMPONENT_CONTEXT, oldEncapsulatedComponent_ChildComponentContext, encapsulatedComponent_ChildComponentContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedStructure getParentStructure_AssemblyContext() {
		if (eContainerFeatureID != CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT) return null;
		return (ComposedStructure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructure_AssemblyContext(ComposedStructure newParentStructure_AssemblyContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructure_AssemblyContext, CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure_AssemblyContext(ComposedStructure newParentStructure_AssemblyContext) {
		if (newParentStructure_AssemblyContext != eInternalContainer() || (eContainerFeatureID != CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT && newParentStructure_AssemblyContext != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructure_AssemblyContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructure_AssemblyContext != null)
				msgs = ((InternalEObject)newParentStructure_AssemblyContext).eInverseAdd(this, CompositionPackage.COMPOSED_STRUCTURE__CHILD_COMPONENT_CONTEXTS_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
			msgs = basicSetParentStructure_AssemblyContext(newParentStructure_AssemblyContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT, newParentStructure_AssemblyContext, newParentStructure_AssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStructure_AssemblyContext((ComposedStructure)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				return basicSetParentStructure_AssemblyContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				return eInternalContainer().eInverseRemove(this, CompositionPackage.COMPOSED_STRUCTURE__CHILD_COMPONENT_CONTEXTS_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_CHILD_COMPONENT_CONTEXT:
				if (resolve) return getEncapsulatedComponent_ChildComponentContext();
				return basicGetEncapsulatedComponent_ChildComponentContext();
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				return getParentStructure_AssemblyContext();
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
			case CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_CHILD_COMPONENT_CONTEXT:
				setEncapsulatedComponent_ChildComponentContext((ProvidesComponentType)newValue);
				return;
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				setParentStructure_AssemblyContext((ComposedStructure)newValue);
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
			case CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_CHILD_COMPONENT_CONTEXT:
				setEncapsulatedComponent_ChildComponentContext((ProvidesComponentType)null);
				return;
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				setParentStructure_AssemblyContext((ComposedStructure)null);
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
			case CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_CHILD_COMPONENT_CONTEXT:
				return encapsulatedComponent_ChildComponentContext != null;
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				return getParentStructure_AssemblyContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyContextImpl