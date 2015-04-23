/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.usagemodel.impl;

import de.uka.ipd.sdq.pcm.usagemodel.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.pcm.usagemodel.Branch;
import de.uka.ipd.sdq.pcm.usagemodel.BranchTransition;
import de.uka.ipd.sdq.pcm.usagemodel.ClosedWorkload;
import de.uka.ipd.sdq.pcm.usagemodel.Delay;
import de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall;
import de.uka.ipd.sdq.pcm.usagemodel.Loop;
import de.uka.ipd.sdq.pcm.usagemodel.OpenWorkload;
import de.uka.ipd.sdq.pcm.usagemodel.ScenarioBehaviour;
import de.uka.ipd.sdq.pcm.usagemodel.Start;
import de.uka.ipd.sdq.pcm.usagemodel.Stop;
import de.uka.ipd.sdq.pcm.usagemodel.UsageModel;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.pcm.usagemodel.UsagemodelFactory;
import de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage;
import de.uka.ipd.sdq.pcm.usagemodel.UserData;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class UsagemodelFactoryImpl extends EFactoryImpl implements
		UsagemodelFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static UsagemodelFactory init() {
		try {
			UsagemodelFactory theUsagemodelFactory = (UsagemodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(UsagemodelPackage.eNS_URI);
			if (theUsagemodelFactory != null) {
				return theUsagemodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsagemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UsagemodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UsagemodelPackage.USAGE_SCENARIO:
			return (EObject) createUsageScenario();
		case UsagemodelPackage.USER_DATA:
			return (EObject) createUserData();
		case UsagemodelPackage.USAGE_MODEL:
			return (EObject) createUsageModel();
		case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL:
			return (EObject) createEntryLevelSystemCall();
		case UsagemodelPackage.SCENARIO_BEHAVIOUR:
			return (EObject) createScenarioBehaviour();
		case UsagemodelPackage.BRANCH_TRANSITION:
			return (EObject) createBranchTransition();
		case UsagemodelPackage.BRANCH:
			return (EObject) createBranch();
		case UsagemodelPackage.LOOP:
			return (EObject) createLoop();
		case UsagemodelPackage.STOP:
			return (EObject) createStop();
		case UsagemodelPackage.START:
			return (EObject) createStart();
		case UsagemodelPackage.OPEN_WORKLOAD:
			return (EObject) createOpenWorkload();
		case UsagemodelPackage.DELAY:
			return (EObject) createDelay();
		case UsagemodelPackage.CLOSED_WORKLOAD:
			return (EObject) createClosedWorkload();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageScenario createUsageScenario() {
		UsageScenarioImpl usageScenario = new UsageScenarioImpl();
		return usageScenario;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScenarioBehaviour createScenarioBehaviour() {
		ScenarioBehaviourImpl scenarioBehaviour = new ScenarioBehaviourImpl();
		return scenarioBehaviour;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BranchTransition createBranchTransition() {
		BranchTransitionImpl branchTransition = new BranchTransitionImpl();
		return branchTransition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageModel createUsageModel() {
		UsageModelImpl usageModel = new UsageModelImpl();
		return usageModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenWorkload createOpenWorkload() {
		OpenWorkloadImpl openWorkload = new OpenWorkloadImpl();
		return openWorkload;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryLevelSystemCall createEntryLevelSystemCall() {
		EntryLevelSystemCallImpl entryLevelSystemCall = new EntryLevelSystemCallImpl();
		return entryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClosedWorkload createClosedWorkload() {
		ClosedWorkloadImpl closedWorkload = new ClosedWorkloadImpl();
		return closedWorkload;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserData createUserData() {
		UserDataImpl userData = new UserDataImpl();
		return userData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsagemodelPackage getUsagemodelPackage() {
		return (UsagemodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsagemodelPackage getPackage() {
		return UsagemodelPackage.eINSTANCE;
	}

} // UsagemodelFactoryImpl
