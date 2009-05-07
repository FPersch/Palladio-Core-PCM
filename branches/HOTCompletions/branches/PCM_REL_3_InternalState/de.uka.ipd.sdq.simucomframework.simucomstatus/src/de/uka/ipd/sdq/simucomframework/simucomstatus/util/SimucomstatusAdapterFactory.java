/**
 * Copyright 2008, sdq.ipd.uka.de, U KA
 *
 * $Id$
 */
package de.uka.ipd.sdq.simucomframework.simucomstatus.util;

import de.uka.ipd.sdq.simucomframework.simucomstatus.Action;
import de.uka.ipd.sdq.simucomframework.simucomstatus.ActiveResouce;
import de.uka.ipd.sdq.simucomframework.simucomstatus.PassiveResource;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimuComStatus;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimucomstatusPackage;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimulatedProcesses;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimulatedResources;
import de.uka.ipd.sdq.simucomframework.simucomstatus.WaitForAcquire;
import de.uka.ipd.sdq.simucomframework.simucomstatus.WaitForDelay;
import de.uka.ipd.sdq.simucomframework.simucomstatus.WaitForDemand;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.SimucomstatusPackage
 * @generated
 */
public class SimucomstatusAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimucomstatusPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimucomstatusAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimucomstatusPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimucomstatusSwitch<Adapter> modelSwitch =
		new SimucomstatusSwitch<Adapter>() {
			@Override
			public Adapter caseSimuComStatus(SimuComStatus object) {
				return createSimuComStatusAdapter();
			}
			@Override
			public Adapter caseSimulatedProcesses(SimulatedProcesses object) {
				return createSimulatedProcessesAdapter();
			}
			@Override
			public Adapter caseProcess(de.uka.ipd.sdq.simucomframework.simucomstatus.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseSimulatedResources(SimulatedResources object) {
				return createSimulatedResourcesAdapter();
			}
			@Override
			public Adapter caseActiveResouce(ActiveResouce object) {
				return createActiveResouceAdapter();
			}
			@Override
			public Adapter caseWaitForDemand(WaitForDemand object) {
				return createWaitForDemandAdapter();
			}
			@Override
			public Adapter casePassiveResource(PassiveResource object) {
				return createPassiveResourceAdapter();
			}
			@Override
			public Adapter caseWaitForAcquire(WaitForAcquire object) {
				return createWaitForAcquireAdapter();
			}
			@Override
			public Adapter caseWaitForDelay(WaitForDelay object) {
				return createWaitForDelayAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.simucomframework.simucomstatus.SimuComStatus <em>Simu Com Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.SimuComStatus
	 * @generated
	 */
	public Adapter createSimuComStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.simucomframework.simucomstatus.SimulatedProcesses <em>Simulated Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.SimulatedProcesses
	 * @generated
	 */
	public Adapter createSimulatedProcessesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.simucomframework.simucomstatus.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.simucomframework.simucomstatus.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.simucomframework.simucomstatus.SimulatedResources <em>Simulated Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.SimulatedResources
	 * @generated
	 */
	public Adapter createSimulatedResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.simucomframework.simucomstatus.ActiveResouce <em>Active Resouce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.ActiveResouce
	 * @generated
	 */
	public Adapter createActiveResouceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.simucomframework.simucomstatus.WaitForDemand <em>Wait For Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.WaitForDemand
	 * @generated
	 */
	public Adapter createWaitForDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.simucomframework.simucomstatus.PassiveResource <em>Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.PassiveResource
	 * @generated
	 */
	public Adapter createPassiveResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.simucomframework.simucomstatus.WaitForAcquire <em>Wait For Acquire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.WaitForAcquire
	 * @generated
	 */
	public Adapter createWaitForAcquireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.simucomframework.simucomstatus.WaitForDelay <em>Wait For Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.simucomframework.simucomstatus.WaitForDelay
	 * @generated
	 */
	public Adapter createWaitForDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimucomstatusAdapterFactory
