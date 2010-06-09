/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
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
import de.uka.ipd.sdq.pcm.core.composition.AssemblyEventConnector;
import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.core.composition.CompositionPackage;
import de.uka.ipd.sdq.pcm.core.connectors.impl.ConnectorImpl;
import de.uka.ipd.sdq.pcm.repository.SinkRole;
import de.uka.ipd.sdq.pcm.repository.SourceRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Event Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.AssemblyEventConnectorImpl#getSinkRole__AssemblyEventConnector <em>Sink Role Assembly Event Connector</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.AssemblyEventConnectorImpl#getSourceRole__AssemblyEventConnector <em>Source Role Assembly Event Connector</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.AssemblyEventConnectorImpl#getSinkAssemblyContext__AssemblyEventConnector <em>Sink Assembly Context Assembly Event Connector</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.AssemblyEventConnectorImpl#getSourceAssemblyContext__AssemblyEventConnector <em>Source Assembly Context Assembly Event Connector</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.AssemblyEventConnectorImpl#getParentStructure__AssemblyEventConnector <em>Parent Structure Assembly Event Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyEventConnectorImpl extends ConnectorImpl implements AssemblyEventConnector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached value of the '{@link #getSinkRole__AssemblyEventConnector() <em>Sink Role Assembly Event Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinkRole__AssemblyEventConnector()
	 * @generated
	 * @ordered
	 */
	protected SinkRole sinkRole__AssemblyEventConnector;

	/**
	 * The cached value of the '{@link #getSourceRole__AssemblyEventConnector() <em>Source Role Assembly Event Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRole__AssemblyEventConnector()
	 * @generated
	 * @ordered
	 */
	protected SourceRole sourceRole__AssemblyEventConnector;

	/**
	 * The cached value of the '{@link #getSinkAssemblyContext__AssemblyEventConnector() <em>Sink Assembly Context Assembly Event Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinkAssemblyContext__AssemblyEventConnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext sinkAssemblyContext__AssemblyEventConnector;

	/**
	 * The cached value of the '{@link #getSourceAssemblyContext__AssemblyEventConnector() <em>Source Assembly Context Assembly Event Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAssemblyContext__AssemblyEventConnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext sourceAssemblyContext__AssemblyEventConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyEventConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.ASSEMBLY_EVENT_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkRole getSinkRole__AssemblyEventConnector() {
		if (sinkRole__AssemblyEventConnector != null && sinkRole__AssemblyEventConnector.eIsProxy()) {
			InternalEObject oldSinkRole__AssemblyEventConnector = (InternalEObject)sinkRole__AssemblyEventConnector;
			sinkRole__AssemblyEventConnector = (SinkRole)eResolveProxy(oldSinkRole__AssemblyEventConnector);
			if (sinkRole__AssemblyEventConnector != oldSinkRole__AssemblyEventConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ROLE_ASSEMBLY_EVENT_CONNECTOR, oldSinkRole__AssemblyEventConnector, sinkRole__AssemblyEventConnector));
			}
		}
		return sinkRole__AssemblyEventConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkRole basicGetSinkRole__AssemblyEventConnector() {
		return sinkRole__AssemblyEventConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinkRole__AssemblyEventConnector(SinkRole newSinkRole__AssemblyEventConnector) {
		SinkRole oldSinkRole__AssemblyEventConnector = sinkRole__AssemblyEventConnector;
		sinkRole__AssemblyEventConnector = newSinkRole__AssemblyEventConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ROLE_ASSEMBLY_EVENT_CONNECTOR, oldSinkRole__AssemblyEventConnector, sinkRole__AssemblyEventConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRole getSourceRole__AssemblyEventConnector() {
		if (sourceRole__AssemblyEventConnector != null && sourceRole__AssemblyEventConnector.eIsProxy()) {
			InternalEObject oldSourceRole__AssemblyEventConnector = (InternalEObject)sourceRole__AssemblyEventConnector;
			sourceRole__AssemblyEventConnector = (SourceRole)eResolveProxy(oldSourceRole__AssemblyEventConnector);
			if (sourceRole__AssemblyEventConnector != oldSourceRole__AssemblyEventConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ROLE_ASSEMBLY_EVENT_CONNECTOR, oldSourceRole__AssemblyEventConnector, sourceRole__AssemblyEventConnector));
			}
		}
		return sourceRole__AssemblyEventConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRole basicGetSourceRole__AssemblyEventConnector() {
		return sourceRole__AssemblyEventConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRole__AssemblyEventConnector(SourceRole newSourceRole__AssemblyEventConnector) {
		SourceRole oldSourceRole__AssemblyEventConnector = sourceRole__AssemblyEventConnector;
		sourceRole__AssemblyEventConnector = newSourceRole__AssemblyEventConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ROLE_ASSEMBLY_EVENT_CONNECTOR, oldSourceRole__AssemblyEventConnector, sourceRole__AssemblyEventConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getSinkAssemblyContext__AssemblyEventConnector() {
		if (sinkAssemblyContext__AssemblyEventConnector != null && sinkAssemblyContext__AssemblyEventConnector.eIsProxy()) {
			InternalEObject oldSinkAssemblyContext__AssemblyEventConnector = (InternalEObject)sinkAssemblyContext__AssemblyEventConnector;
			sinkAssemblyContext__AssemblyEventConnector = (AssemblyContext)eResolveProxy(oldSinkAssemblyContext__AssemblyEventConnector);
			if (sinkAssemblyContext__AssemblyEventConnector != oldSinkAssemblyContext__AssemblyEventConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR, oldSinkAssemblyContext__AssemblyEventConnector, sinkAssemblyContext__AssemblyEventConnector));
			}
		}
		return sinkAssemblyContext__AssemblyEventConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetSinkAssemblyContext__AssemblyEventConnector() {
		return sinkAssemblyContext__AssemblyEventConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinkAssemblyContext__AssemblyEventConnector(AssemblyContext newSinkAssemblyContext__AssemblyEventConnector) {
		AssemblyContext oldSinkAssemblyContext__AssemblyEventConnector = sinkAssemblyContext__AssemblyEventConnector;
		sinkAssemblyContext__AssemblyEventConnector = newSinkAssemblyContext__AssemblyEventConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR, oldSinkAssemblyContext__AssemblyEventConnector, sinkAssemblyContext__AssemblyEventConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getSourceAssemblyContext__AssemblyEventConnector() {
		if (sourceAssemblyContext__AssemblyEventConnector != null && sourceAssemblyContext__AssemblyEventConnector.eIsProxy()) {
			InternalEObject oldSourceAssemblyContext__AssemblyEventConnector = (InternalEObject)sourceAssemblyContext__AssemblyEventConnector;
			sourceAssemblyContext__AssemblyEventConnector = (AssemblyContext)eResolveProxy(oldSourceAssemblyContext__AssemblyEventConnector);
			if (sourceAssemblyContext__AssemblyEventConnector != oldSourceAssemblyContext__AssemblyEventConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR, oldSourceAssemblyContext__AssemblyEventConnector, sourceAssemblyContext__AssemblyEventConnector));
			}
		}
		return sourceAssemblyContext__AssemblyEventConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetSourceAssemblyContext__AssemblyEventConnector() {
		return sourceAssemblyContext__AssemblyEventConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAssemblyContext__AssemblyEventConnector(AssemblyContext newSourceAssemblyContext__AssemblyEventConnector) {
		AssemblyContext oldSourceAssemblyContext__AssemblyEventConnector = sourceAssemblyContext__AssemblyEventConnector;
		sourceAssemblyContext__AssemblyEventConnector = newSourceAssemblyContext__AssemblyEventConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR, oldSourceAssemblyContext__AssemblyEventConnector, sourceAssemblyContext__AssemblyEventConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedStructure getParentStructure__AssemblyEventConnector() {
		if (eContainerFeatureID() != CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR) return null;
		return (ComposedStructure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructure__AssemblyEventConnector(ComposedStructure newParentStructure__AssemblyEventConnector, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructure__AssemblyEventConnector, CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure__AssemblyEventConnector(ComposedStructure newParentStructure__AssemblyEventConnector) {
		if (newParentStructure__AssemblyEventConnector != eInternalContainer() || (eContainerFeatureID() != CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR && newParentStructure__AssemblyEventConnector != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructure__AssemblyEventConnector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructure__AssemblyEventConnector != null)
				msgs = ((InternalEObject)newParentStructure__AssemblyEventConnector).eInverseAdd(this, CompositionPackage.COMPOSED_STRUCTURE__ASSEMBLY_EVENT_CONNECTOR_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
			msgs = basicSetParentStructure__AssemblyEventConnector(newParentStructure__AssemblyEventConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR, newParentStructure__AssemblyEventConnector, newParentStructure__AssemblyEventConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStructure__AssemblyEventConnector((ComposedStructure)otherEnd, msgs);
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
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR:
				return basicSetParentStructure__AssemblyEventConnector(null, msgs);
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
		switch (eContainerFeatureID()) {
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR:
				return eInternalContainer().eInverseRemove(this, CompositionPackage.COMPOSED_STRUCTURE__ASSEMBLY_EVENT_CONNECTOR_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
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
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ROLE_ASSEMBLY_EVENT_CONNECTOR:
				if (resolve) return getSinkRole__AssemblyEventConnector();
				return basicGetSinkRole__AssemblyEventConnector();
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ROLE_ASSEMBLY_EVENT_CONNECTOR:
				if (resolve) return getSourceRole__AssemblyEventConnector();
				return basicGetSourceRole__AssemblyEventConnector();
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR:
				if (resolve) return getSinkAssemblyContext__AssemblyEventConnector();
				return basicGetSinkAssemblyContext__AssemblyEventConnector();
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR:
				if (resolve) return getSourceAssemblyContext__AssemblyEventConnector();
				return basicGetSourceAssemblyContext__AssemblyEventConnector();
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR:
				return getParentStructure__AssemblyEventConnector();
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
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ROLE_ASSEMBLY_EVENT_CONNECTOR:
				setSinkRole__AssemblyEventConnector((SinkRole)newValue);
				return;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ROLE_ASSEMBLY_EVENT_CONNECTOR:
				setSourceRole__AssemblyEventConnector((SourceRole)newValue);
				return;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR:
				setSinkAssemblyContext__AssemblyEventConnector((AssemblyContext)newValue);
				return;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR:
				setSourceAssemblyContext__AssemblyEventConnector((AssemblyContext)newValue);
				return;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR:
				setParentStructure__AssemblyEventConnector((ComposedStructure)newValue);
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
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ROLE_ASSEMBLY_EVENT_CONNECTOR:
				setSinkRole__AssemblyEventConnector((SinkRole)null);
				return;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ROLE_ASSEMBLY_EVENT_CONNECTOR:
				setSourceRole__AssemblyEventConnector((SourceRole)null);
				return;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR:
				setSinkAssemblyContext__AssemblyEventConnector((AssemblyContext)null);
				return;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR:
				setSourceAssemblyContext__AssemblyEventConnector((AssemblyContext)null);
				return;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR:
				setParentStructure__AssemblyEventConnector((ComposedStructure)null);
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
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ROLE_ASSEMBLY_EVENT_CONNECTOR:
				return sinkRole__AssemblyEventConnector != null;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ROLE_ASSEMBLY_EVENT_CONNECTOR:
				return sourceRole__AssemblyEventConnector != null;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SINK_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR:
				return sinkAssemblyContext__AssemblyEventConnector != null;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__SOURCE_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR:
				return sourceAssemblyContext__AssemblyEventConnector != null;
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_ASSEMBLY_EVENT_CONNECTOR:
				return getParentStructure__AssemblyEventConnector() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyEventConnectorImpl
