/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.seff.util;

import de.uka.ipd.sdq.identifier.Identifier;

import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.pcm.seff.*;

import de.uka.ipd.sdq.stoex.RandomVariable;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.seff.SeffPackage
 * @generated
 */
public class SeffSwitch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SeffPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffSwitch() {
		if (modelPackage == null) {
			modelPackage = SeffPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SeffPackage.STOP_ACTION: {
				StopAction stopAction = (StopAction)theEObject;
				T result = caseStopAction(stopAction);
				if (result == null) result = caseAbstractResourceDemandingAction(stopAction);
				if (result == null) result = caseAbstractAction(stopAction);
				if (result == null) result = caseEntity(stopAction);
				if (result == null) result = caseIdentifier(stopAction);
				if (result == null) result = caseNamedElement(stopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.ABSTRACT_RESOURCE_DEMANDING_ACTION: {
				AbstractResourceDemandingAction abstractResourceDemandingAction = (AbstractResourceDemandingAction)theEObject;
				T result = caseAbstractResourceDemandingAction(abstractResourceDemandingAction);
				if (result == null) result = caseAbstractAction(abstractResourceDemandingAction);
				if (result == null) result = caseEntity(abstractResourceDemandingAction);
				if (result == null) result = caseIdentifier(abstractResourceDemandingAction);
				if (result == null) result = caseNamedElement(abstractResourceDemandingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.ABSTRACT_ACTION: {
				AbstractAction abstractAction = (AbstractAction)theEObject;
				T result = caseAbstractAction(abstractAction);
				if (result == null) result = caseEntity(abstractAction);
				if (result == null) result = caseIdentifier(abstractAction);
				if (result == null) result = caseNamedElement(abstractAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND: {
				ParametricResourceDemand parametricResourceDemand = (ParametricResourceDemand)theEObject;
				T result = caseParametricResourceDemand(parametricResourceDemand);
				if (result == null) result = caseRandomVariable(parametricResourceDemand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.START_ACTION: {
				StartAction startAction = (StartAction)theEObject;
				T result = caseStartAction(startAction);
				if (result == null) result = caseAbstractResourceDemandingAction(startAction);
				if (result == null) result = caseAbstractAction(startAction);
				if (result == null) result = caseEntity(startAction);
				if (result == null) result = caseIdentifier(startAction);
				if (result == null) result = caseNamedElement(startAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.RESOURCE_DEMANDING_SEFF: {
				ResourceDemandingSEFF resourceDemandingSEFF = (ResourceDemandingSEFF)theEObject;
				T result = caseResourceDemandingSEFF(resourceDemandingSEFF);
				if (result == null) result = caseIdentifier(resourceDemandingSEFF);
				if (result == null) result = caseServiceEffectSpecification(resourceDemandingSEFF);
				if (result == null) result = caseResourceDemandingBehaviour(resourceDemandingSEFF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR: {
				ResourceDemandingBehaviour resourceDemandingBehaviour = (ResourceDemandingBehaviour)theEObject;
				T result = caseResourceDemandingBehaviour(resourceDemandingBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.RELEASE_ACTION: {
				ReleaseAction releaseAction = (ReleaseAction)theEObject;
				T result = caseReleaseAction(releaseAction);
				if (result == null) result = caseAbstractResourceDemandingAction(releaseAction);
				if (result == null) result = caseAbstractAction(releaseAction);
				if (result == null) result = caseEntity(releaseAction);
				if (result == null) result = caseIdentifier(releaseAction);
				if (result == null) result = caseNamedElement(releaseAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.LOOP_ACTION: {
				LoopAction loopAction = (LoopAction)theEObject;
				T result = caseLoopAction(loopAction);
				if (result == null) result = caseAbstractLoopAction(loopAction);
				if (result == null) result = caseAbstractResourceDemandingAction(loopAction);
				if (result == null) result = caseAbstractAction(loopAction);
				if (result == null) result = caseEntity(loopAction);
				if (result == null) result = caseIdentifier(loopAction);
				if (result == null) result = caseNamedElement(loopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.ABSTRACT_LOOP_ACTION: {
				AbstractLoopAction abstractLoopAction = (AbstractLoopAction)theEObject;
				T result = caseAbstractLoopAction(abstractLoopAction);
				if (result == null) result = caseAbstractResourceDemandingAction(abstractLoopAction);
				if (result == null) result = caseAbstractAction(abstractLoopAction);
				if (result == null) result = caseEntity(abstractLoopAction);
				if (result == null) result = caseIdentifier(abstractLoopAction);
				if (result == null) result = caseNamedElement(abstractLoopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.ITERATION_COUNT: {
				IterationCount iterationCount = (IterationCount)theEObject;
				T result = caseIterationCount(iterationCount);
				if (result == null) result = caseRandomVariable(iterationCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.INTERNAL_ACTION: {
				InternalAction internalAction = (InternalAction)theEObject;
				T result = caseInternalAction(internalAction);
				if (result == null) result = caseAbstractResourceDemandingAction(internalAction);
				if (result == null) result = caseAbstractAction(internalAction);
				if (result == null) result = caseEntity(internalAction);
				if (result == null) result = caseIdentifier(internalAction);
				if (result == null) result = caseNamedElement(internalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.FORK_ACTION: {
				ForkAction forkAction = (ForkAction)theEObject;
				T result = caseForkAction(forkAction);
				if (result == null) result = caseAbstractResourceDemandingAction(forkAction);
				if (result == null) result = caseAbstractAction(forkAction);
				if (result == null) result = caseEntity(forkAction);
				if (result == null) result = caseIdentifier(forkAction);
				if (result == null) result = caseNamedElement(forkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.EXTERNAL_CALL_ACTION: {
				ExternalCallAction externalCallAction = (ExternalCallAction)theEObject;
				T result = caseExternalCallAction(externalCallAction);
				if (result == null) result = caseAbstractAction(externalCallAction);
				if (result == null) result = caseEntity(externalCallAction);
				if (result == null) result = caseIdentifier(externalCallAction);
				if (result == null) result = caseNamedElement(externalCallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION: {
				ProbabilisticBranchTransition probabilisticBranchTransition = (ProbabilisticBranchTransition)theEObject;
				T result = caseProbabilisticBranchTransition(probabilisticBranchTransition);
				if (result == null) result = caseAbstractBranchTransition(probabilisticBranchTransition);
				if (result == null) result = caseIdentifier(probabilisticBranchTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.ABSTRACT_BRANCH_TRANSITION: {
				AbstractBranchTransition abstractBranchTransition = (AbstractBranchTransition)theEObject;
				T result = caseAbstractBranchTransition(abstractBranchTransition);
				if (result == null) result = caseIdentifier(abstractBranchTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.BRANCH_ACTION: {
				BranchAction branchAction = (BranchAction)theEObject;
				T result = caseBranchAction(branchAction);
				if (result == null) result = caseAbstractResourceDemandingAction(branchAction);
				if (result == null) result = caseAbstractAction(branchAction);
				if (result == null) result = caseEntity(branchAction);
				if (result == null) result = caseIdentifier(branchAction);
				if (result == null) result = caseNamedElement(branchAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.AQUIRE_ACTION: {
				AquireAction aquireAction = (AquireAction)theEObject;
				T result = caseAquireAction(aquireAction);
				if (result == null) result = caseAbstractResourceDemandingAction(aquireAction);
				if (result == null) result = caseAbstractAction(aquireAction);
				if (result == null) result = caseEntity(aquireAction);
				if (result == null) result = caseIdentifier(aquireAction);
				if (result == null) result = caseNamedElement(aquireAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.BRANCH_CONDITION: {
				BranchCondition branchCondition = (BranchCondition)theEObject;
				T result = caseBranchCondition(branchCondition);
				if (result == null) result = caseRandomVariable(branchCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.COLLECTION_ITERATOR_ACTION: {
				CollectionIteratorAction collectionIteratorAction = (CollectionIteratorAction)theEObject;
				T result = caseCollectionIteratorAction(collectionIteratorAction);
				if (result == null) result = caseAbstractLoopAction(collectionIteratorAction);
				if (result == null) result = caseAbstractResourceDemandingAction(collectionIteratorAction);
				if (result == null) result = caseAbstractAction(collectionIteratorAction);
				if (result == null) result = caseEntity(collectionIteratorAction);
				if (result == null) result = caseIdentifier(collectionIteratorAction);
				if (result == null) result = caseNamedElement(collectionIteratorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.GUARDED_BRANCH_TRANSITION: {
				GuardedBranchTransition guardedBranchTransition = (GuardedBranchTransition)theEObject;
				T result = caseGuardedBranchTransition(guardedBranchTransition);
				if (result == null) result = caseAbstractBranchTransition(guardedBranchTransition);
				if (result == null) result = caseIdentifier(guardedBranchTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.SET_VARIABLE_ACTION: {
				SetVariableAction setVariableAction = (SetVariableAction)theEObject;
				T result = caseSetVariableAction(setVariableAction);
				if (result == null) result = caseAbstractResourceDemandingAction(setVariableAction);
				if (result == null) result = caseAbstractAction(setVariableAction);
				if (result == null) result = caseEntity(setVariableAction);
				if (result == null) result = caseIdentifier(setVariableAction);
				if (result == null) result = caseNamedElement(setVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION: {
				ServiceEffectSpecification serviceEffectSpecification = (ServiceEffectSpecification)theEObject;
				T result = caseServiceEffectSpecification(serviceEffectSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Stop Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopAction(StopAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Resource Demanding Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Resource Demanding Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResourceDemandingAction(AbstractResourceDemandingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAction(AbstractAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parametric Resource Demand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parametric Resource Demand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametricResourceDemand(ParametricResourceDemand object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Start Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Start Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartAction(StartAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resource Demanding SEFF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resource Demanding SEFF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDemandingSEFF(ResourceDemandingSEFF object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resource Demanding Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resource Demanding Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDemandingBehaviour(ResourceDemandingBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Release Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Release Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseAction(ReleaseAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Loop Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Loop Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopAction(LoopAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Loop Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Loop Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractLoopAction(AbstractLoopAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Iteration Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Iteration Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationCount(IterationCount object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Internal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalAction(InternalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Fork Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Fork Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkAction(ForkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>External Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalCallAction(ExternalCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Probabilistic Branch Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Probabilistic Branch Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbabilisticBranchTransition(ProbabilisticBranchTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Branch Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Branch Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBranchTransition(AbstractBranchTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Branch Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Branch Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchAction(BranchAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Aquire Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Aquire Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAquireAction(AquireAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Branch Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Branch Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchCondition(BranchCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Collection Iterator Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Collection Iterator Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionIteratorAction(CollectionIteratorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Guarded Branch Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Guarded Branch Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardedBranchTransition(GuardedBranchTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Set Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Set Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetVariableAction(SetVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service Effect Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service Effect Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEffectSpecification(ServiceEffectSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Random Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Random Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomVariable(RandomVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SeffSwitch
