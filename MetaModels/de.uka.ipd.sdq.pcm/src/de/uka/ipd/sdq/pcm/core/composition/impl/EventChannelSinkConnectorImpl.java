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

import de.uka.ipd.sdq.pcm.core.CorePackage;
import de.uka.ipd.sdq.pcm.core.PCMRandomVariable;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.core.composition.CompositionPackage;
import de.uka.ipd.sdq.pcm.core.composition.EventChannelSinkConnector;
import de.uka.ipd.sdq.pcm.repository.SinkRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Channel Sink Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.EventChannelSinkConnectorImpl#getSinkRole__EventChannelSinkConnector <em>Sink Role Event Channel Sink Connector</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.EventChannelSinkConnectorImpl#getFilterCondition__EventChannelSinkConnector <em>Filter Condition Event Channel Sink Connector</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.EventChannelSinkConnectorImpl#getAssemblyContext__EventChannelSinkConnector <em>Assembly Context Event Channel Sink Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventChannelSinkConnectorImpl extends ConnectorImpl implements EventChannelSinkConnector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached value of the '{@link #getSinkRole__EventChannelSinkConnector() <em>Sink Role Event Channel Sink Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinkRole__EventChannelSinkConnector()
	 * @generated
	 * @ordered
	 */
	protected SinkRole sinkRole__EventChannelSinkConnector;

	/**
	 * The cached value of the '{@link #getFilterCondition__EventChannelSinkConnector() <em>Filter Condition Event Channel Sink Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterCondition__EventChannelSinkConnector()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable filterCondition__EventChannelSinkConnector;

	/**
	 * The cached value of the '{@link #getAssemblyContext__EventChannelSinkConnector() <em>Assembly Context Event Channel Sink Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext__EventChannelSinkConnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblyContext__EventChannelSinkConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChannelSinkConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.EVENT_CHANNEL_SINK_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkRole getSinkRole__EventChannelSinkConnector() {
		if (sinkRole__EventChannelSinkConnector != null && sinkRole__EventChannelSinkConnector.eIsProxy()) {
			InternalEObject oldSinkRole__EventChannelSinkConnector = (InternalEObject)sinkRole__EventChannelSinkConnector;
			sinkRole__EventChannelSinkConnector = (SinkRole)eResolveProxy(oldSinkRole__EventChannelSinkConnector);
			if (sinkRole__EventChannelSinkConnector != oldSinkRole__EventChannelSinkConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__SINK_ROLE_EVENT_CHANNEL_SINK_CONNECTOR, oldSinkRole__EventChannelSinkConnector, sinkRole__EventChannelSinkConnector));
			}
		}
		return sinkRole__EventChannelSinkConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkRole basicGetSinkRole__EventChannelSinkConnector() {
		return sinkRole__EventChannelSinkConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinkRole__EventChannelSinkConnector(SinkRole newSinkRole__EventChannelSinkConnector) {
		SinkRole oldSinkRole__EventChannelSinkConnector = sinkRole__EventChannelSinkConnector;
		sinkRole__EventChannelSinkConnector = newSinkRole__EventChannelSinkConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__SINK_ROLE_EVENT_CHANNEL_SINK_CONNECTOR, oldSinkRole__EventChannelSinkConnector, sinkRole__EventChannelSinkConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getFilterCondition__EventChannelSinkConnector() {
		return filterCondition__EventChannelSinkConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterCondition__EventChannelSinkConnector(PCMRandomVariable newFilterCondition__EventChannelSinkConnector, NotificationChain msgs) {
		PCMRandomVariable oldFilterCondition__EventChannelSinkConnector = filterCondition__EventChannelSinkConnector;
		filterCondition__EventChannelSinkConnector = newFilterCondition__EventChannelSinkConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR, oldFilterCondition__EventChannelSinkConnector, newFilterCondition__EventChannelSinkConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterCondition__EventChannelSinkConnector(PCMRandomVariable newFilterCondition__EventChannelSinkConnector) {
		if (newFilterCondition__EventChannelSinkConnector != filterCondition__EventChannelSinkConnector) {
			NotificationChain msgs = null;
			if (filterCondition__EventChannelSinkConnector != null)
				msgs = ((InternalEObject)filterCondition__EventChannelSinkConnector).eInverseRemove(this, CorePackage.PCM_RANDOM_VARIABLE__EVENT_CHANNEL_SINK_CONNECTOR_FILTER_CONDITION, PCMRandomVariable.class, msgs);
			if (newFilterCondition__EventChannelSinkConnector != null)
				msgs = ((InternalEObject)newFilterCondition__EventChannelSinkConnector).eInverseAdd(this, CorePackage.PCM_RANDOM_VARIABLE__EVENT_CHANNEL_SINK_CONNECTOR_FILTER_CONDITION, PCMRandomVariable.class, msgs);
			msgs = basicSetFilterCondition__EventChannelSinkConnector(newFilterCondition__EventChannelSinkConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR, newFilterCondition__EventChannelSinkConnector, newFilterCondition__EventChannelSinkConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblyContext__EventChannelSinkConnector() {
		if (assemblyContext__EventChannelSinkConnector != null && assemblyContext__EventChannelSinkConnector.eIsProxy()) {
			InternalEObject oldAssemblyContext__EventChannelSinkConnector = (InternalEObject)assemblyContext__EventChannelSinkConnector;
			assemblyContext__EventChannelSinkConnector = (AssemblyContext)eResolveProxy(oldAssemblyContext__EventChannelSinkConnector);
			if (assemblyContext__EventChannelSinkConnector != oldAssemblyContext__EventChannelSinkConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SINK_CONNECTOR, oldAssemblyContext__EventChannelSinkConnector, assemblyContext__EventChannelSinkConnector));
			}
		}
		return assemblyContext__EventChannelSinkConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext__EventChannelSinkConnector() {
		return assemblyContext__EventChannelSinkConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyContext__EventChannelSinkConnector(AssemblyContext newAssemblyContext__EventChannelSinkConnector) {
		AssemblyContext oldAssemblyContext__EventChannelSinkConnector = assemblyContext__EventChannelSinkConnector;
		assemblyContext__EventChannelSinkConnector = newAssemblyContext__EventChannelSinkConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SINK_CONNECTOR, oldAssemblyContext__EventChannelSinkConnector, assemblyContext__EventChannelSinkConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR:
				if (filterCondition__EventChannelSinkConnector != null)
					msgs = ((InternalEObject)filterCondition__EventChannelSinkConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR, null, msgs);
				return basicSetFilterCondition__EventChannelSinkConnector((PCMRandomVariable)otherEnd, msgs);
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
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR:
				return basicSetFilterCondition__EventChannelSinkConnector(null, msgs);
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
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__SINK_ROLE_EVENT_CHANNEL_SINK_CONNECTOR:
				if (resolve) return getSinkRole__EventChannelSinkConnector();
				return basicGetSinkRole__EventChannelSinkConnector();
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR:
				return getFilterCondition__EventChannelSinkConnector();
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SINK_CONNECTOR:
				if (resolve) return getAssemblyContext__EventChannelSinkConnector();
				return basicGetAssemblyContext__EventChannelSinkConnector();
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
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__SINK_ROLE_EVENT_CHANNEL_SINK_CONNECTOR:
				setSinkRole__EventChannelSinkConnector((SinkRole)newValue);
				return;
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR:
				setFilterCondition__EventChannelSinkConnector((PCMRandomVariable)newValue);
				return;
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SINK_CONNECTOR:
				setAssemblyContext__EventChannelSinkConnector((AssemblyContext)newValue);
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
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__SINK_ROLE_EVENT_CHANNEL_SINK_CONNECTOR:
				setSinkRole__EventChannelSinkConnector((SinkRole)null);
				return;
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR:
				setFilterCondition__EventChannelSinkConnector((PCMRandomVariable)null);
				return;
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SINK_CONNECTOR:
				setAssemblyContext__EventChannelSinkConnector((AssemblyContext)null);
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
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__SINK_ROLE_EVENT_CHANNEL_SINK_CONNECTOR:
				return sinkRole__EventChannelSinkConnector != null;
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR:
				return filterCondition__EventChannelSinkConnector != null;
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SINK_CONNECTOR:
				return assemblyContext__EventChannelSinkConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //EventChannelSinkConnectorImpl
