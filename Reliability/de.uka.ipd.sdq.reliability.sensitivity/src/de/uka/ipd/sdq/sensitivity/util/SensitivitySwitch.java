/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.sensitivity.util;

import de.uka.ipd.sdq.identifier.Identifier;

import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.sensitivity.*;

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
 * @see de.uka.ipd.sdq.sensitivity.SensitivityPackage
 * @generated
 */
public class SensitivitySwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SensitivityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitivitySwitch() {
		if (modelPackage == null) {
			modelPackage = SensitivityPackage.eINSTANCE;
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
			case SensitivityPackage.SENSITIVITY_CONFIGURATION: {
				SensitivityConfiguration sensitivityConfiguration = (SensitivityConfiguration)theEObject;
				T result = caseSensitivityConfiguration(sensitivityConfiguration);
				if (result == null) result = caseEntity(sensitivityConfiguration);
				if (result == null) result = caseIdentifier(sensitivityConfiguration);
				if (result == null) result = caseNamedElement(sensitivityConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.SENSITIVITY_PARAMETER: {
				SensitivityParameter sensitivityParameter = (SensitivityParameter)theEObject;
				T result = caseSensitivityParameter(sensitivityParameter);
				if (result == null) result = caseEntity(sensitivityParameter);
				if (result == null) result = caseIdentifier(sensitivityParameter);
				if (result == null) result = caseNamedElement(sensitivityParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER: {
				CombinedSensitivityParameter combinedSensitivityParameter = (CombinedSensitivityParameter)theEObject;
				T result = caseCombinedSensitivityParameter(combinedSensitivityParameter);
				if (result == null) result = caseSensitivityParameter(combinedSensitivityParameter);
				if (result == null) result = caseEntity(combinedSensitivityParameter);
				if (result == null) result = caseIdentifier(combinedSensitivityParameter);
				if (result == null) result = caseNamedElement(combinedSensitivityParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER: {
				SingleSensitivityParameter singleSensitivityParameter = (SingleSensitivityParameter)theEObject;
				T result = caseSingleSensitivityParameter(singleSensitivityParameter);
				if (result == null) result = caseSensitivityParameter(singleSensitivityParameter);
				if (result == null) result = caseEntity(singleSensitivityParameter);
				if (result == null) result = caseIdentifier(singleSensitivityParameter);
				if (result == null) result = caseNamedElement(singleSensitivityParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION: {
				SensitivityParameterVariation sensitivityParameterVariation = (SensitivityParameterVariation)theEObject;
				T result = caseSensitivityParameterVariation(sensitivityParameterVariation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER: {
				ComponentReliabilityParameter componentReliabilityParameter = (ComponentReliabilityParameter)theEObject;
				T result = caseComponentReliabilityParameter(componentReliabilityParameter);
				if (result == null) result = caseSingleSensitivityParameter(componentReliabilityParameter);
				if (result == null) result = caseSensitivityParameter(componentReliabilityParameter);
				if (result == null) result = caseEntity(componentReliabilityParameter);
				if (result == null) result = caseIdentifier(componentReliabilityParameter);
				if (result == null) result = caseNamedElement(componentReliabilityParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.DOUBLE_PARAMETER_VARIATION: {
				DoubleParameterVariation doubleParameterVariation = (DoubleParameterVariation)theEObject;
				T result = caseDoubleParameterVariation(doubleParameterVariation);
				if (result == null) result = caseSensitivityParameterVariation(doubleParameterVariation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.STRING_PARAMETER_SEQUENCE: {
				StringParameterSequence stringParameterSequence = (StringParameterSequence)theEObject;
				T result = caseStringParameterSequence(stringParameterSequence);
				if (result == null) result = caseSensitivityParameterVariation(stringParameterSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.DOUBLE_PARAMETER_RANGE: {
				DoubleParameterRange doubleParameterRange = (DoubleParameterRange)theEObject;
				T result = caseDoubleParameterRange(doubleParameterRange);
				if (result == null) result = caseDoubleParameterVariation(doubleParameterRange);
				if (result == null) result = caseSensitivityParameterVariation(doubleParameterRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.DOUBLE_PARAMETER_SEQUENCE: {
				DoubleParameterSequence doubleParameterSequence = (DoubleParameterSequence)theEObject;
				T result = caseDoubleParameterSequence(doubleParameterSequence);
				if (result == null) result = caseDoubleParameterVariation(doubleParameterSequence);
				if (result == null) result = caseSensitivityParameterVariation(doubleParameterSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.DOUBLE_PARAMETER_FUNCTION: {
				DoubleParameterFunction doubleParameterFunction = (DoubleParameterFunction)theEObject;
				T result = caseDoubleParameterFunction(doubleParameterFunction);
				if (result == null) result = caseDoubleParameterVariation(doubleParameterFunction);
				if (result == null) result = caseSensitivityParameterVariation(doubleParameterFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER: {
				InternalActionReliabilityParameter internalActionReliabilityParameter = (InternalActionReliabilityParameter)theEObject;
				T result = caseInternalActionReliabilityParameter(internalActionReliabilityParameter);
				if (result == null) result = caseSingleSensitivityParameter(internalActionReliabilityParameter);
				if (result == null) result = caseSensitivityParameter(internalActionReliabilityParameter);
				if (result == null) result = caseEntity(internalActionReliabilityParameter);
				if (result == null) result = caseIdentifier(internalActionReliabilityParameter);
				if (result == null) result = caseNamedElement(internalActionReliabilityParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER: {
				ProbabilisticBranchParameter probabilisticBranchParameter = (ProbabilisticBranchParameter)theEObject;
				T result = caseProbabilisticBranchParameter(probabilisticBranchParameter);
				if (result == null) result = caseSingleSensitivityParameter(probabilisticBranchParameter);
				if (result == null) result = caseSensitivityParameter(probabilisticBranchParameter);
				if (result == null) result = caseEntity(probabilisticBranchParameter);
				if (result == null) result = caseIdentifier(probabilisticBranchParameter);
				if (result == null) result = caseNamedElement(probabilisticBranchParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.HARDWARE_MTTF_PARAMETER: {
				HardwareMTTFParameter hardwareMTTFParameter = (HardwareMTTFParameter)theEObject;
				T result = caseHardwareMTTFParameter(hardwareMTTFParameter);
				if (result == null) result = caseSingleSensitivityParameter(hardwareMTTFParameter);
				if (result == null) result = caseSensitivityParameter(hardwareMTTFParameter);
				if (result == null) result = caseEntity(hardwareMTTFParameter);
				if (result == null) result = caseIdentifier(hardwareMTTFParameter);
				if (result == null) result = caseNamedElement(hardwareMTTFParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.HARDWARE_MTTR_PARAMETER: {
				HardwareMTTRParameter hardwareMTTRParameter = (HardwareMTTRParameter)theEObject;
				T result = caseHardwareMTTRParameter(hardwareMTTRParameter);
				if (result == null) result = caseSingleSensitivityParameter(hardwareMTTRParameter);
				if (result == null) result = caseSensitivityParameter(hardwareMTTRParameter);
				if (result == null) result = caseEntity(hardwareMTTRParameter);
				if (result == null) result = caseIdentifier(hardwareMTTRParameter);
				if (result == null) result = caseNamedElement(hardwareMTTRParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.RESOURCE_MTTF_PARAMETER: {
				ResourceMTTFParameter resourceMTTFParameter = (ResourceMTTFParameter)theEObject;
				T result = caseResourceMTTFParameter(resourceMTTFParameter);
				if (result == null) result = caseSingleSensitivityParameter(resourceMTTFParameter);
				if (result == null) result = caseSensitivityParameter(resourceMTTFParameter);
				if (result == null) result = caseEntity(resourceMTTFParameter);
				if (result == null) result = caseIdentifier(resourceMTTFParameter);
				if (result == null) result = caseNamedElement(resourceMTTFParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.RESOURCE_MTTR_PARAMETER: {
				ResourceMTTRParameter resourceMTTRParameter = (ResourceMTTRParameter)theEObject;
				T result = caseResourceMTTRParameter(resourceMTTRParameter);
				if (result == null) result = caseSingleSensitivityParameter(resourceMTTRParameter);
				if (result == null) result = caseSensitivityParameter(resourceMTTRParameter);
				if (result == null) result = caseEntity(resourceMTTRParameter);
				if (result == null) result = caseIdentifier(resourceMTTRParameter);
				if (result == null) result = caseNamedElement(resourceMTTRParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.NETWORK_RELIABILITY_PARAMETER: {
				NetworkReliabilityParameter networkReliabilityParameter = (NetworkReliabilityParameter)theEObject;
				T result = caseNetworkReliabilityParameter(networkReliabilityParameter);
				if (result == null) result = caseSingleSensitivityParameter(networkReliabilityParameter);
				if (result == null) result = caseSensitivityParameter(networkReliabilityParameter);
				if (result == null) result = caseEntity(networkReliabilityParameter);
				if (result == null) result = caseIdentifier(networkReliabilityParameter);
				if (result == null) result = caseNamedElement(networkReliabilityParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.COMMUNICATION_LINK_RELIABILITY_PARAMETER: {
				CommunicationLinkReliabilityParameter communicationLinkReliabilityParameter = (CommunicationLinkReliabilityParameter)theEObject;
				T result = caseCommunicationLinkReliabilityParameter(communicationLinkReliabilityParameter);
				if (result == null) result = caseSingleSensitivityParameter(communicationLinkReliabilityParameter);
				if (result == null) result = caseSensitivityParameter(communicationLinkReliabilityParameter);
				if (result == null) result = caseEntity(communicationLinkReliabilityParameter);
				if (result == null) result = caseIdentifier(communicationLinkReliabilityParameter);
				if (result == null) result = caseNamedElement(communicationLinkReliabilityParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.SOFTWARE_RELIABILITY_PARAMETER: {
				SoftwareReliabilityParameter softwareReliabilityParameter = (SoftwareReliabilityParameter)theEObject;
				T result = caseSoftwareReliabilityParameter(softwareReliabilityParameter);
				if (result == null) result = caseSingleSensitivityParameter(softwareReliabilityParameter);
				if (result == null) result = caseSensitivityParameter(softwareReliabilityParameter);
				if (result == null) result = caseEntity(softwareReliabilityParameter);
				if (result == null) result = caseIdentifier(softwareReliabilityParameter);
				if (result == null) result = caseNamedElement(softwareReliabilityParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.SYSTEM_CALL_PARAMETER: {
				SystemCallParameter systemCallParameter = (SystemCallParameter)theEObject;
				T result = caseSystemCallParameter(systemCallParameter);
				if (result == null) result = caseSingleSensitivityParameter(systemCallParameter);
				if (result == null) result = caseSensitivityParameter(systemCallParameter);
				if (result == null) result = caseEntity(systemCallParameter);
				if (result == null) result = caseIdentifier(systemCallParameter);
				if (result == null) result = caseNamedElement(systemCallParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SensitivityPackage.USAGE_BRANCH_PARAMETER: {
				UsageBranchParameter usageBranchParameter = (UsageBranchParameter)theEObject;
				T result = caseUsageBranchParameter(usageBranchParameter);
				if (result == null) result = caseSingleSensitivityParameter(usageBranchParameter);
				if (result == null) result = caseSensitivityParameter(usageBranchParameter);
				if (result == null) result = caseEntity(usageBranchParameter);
				if (result == null) result = caseIdentifier(usageBranchParameter);
				if (result == null) result = caseNamedElement(usageBranchParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensitivityConfiguration(SensitivityConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensitivityParameter(SensitivityParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Sensitivity Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Sensitivity Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedSensitivityParameter(CombinedSensitivityParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Sensitivity Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Sensitivity Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleSensitivityParameter(SingleSensitivityParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Variation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Variation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensitivityParameterVariation(SensitivityParameterVariation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Reliability Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Reliability Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentReliabilityParameter(ComponentReliabilityParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Parameter Variation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Parameter Variation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleParameterVariation(DoubleParameterVariation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Parameter Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Parameter Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringParameterSequence(StringParameterSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Parameter Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Parameter Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleParameterRange(DoubleParameterRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Parameter Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Parameter Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleParameterSequence(DoubleParameterSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Parameter Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Parameter Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleParameterFunction(DoubleParameterFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Action Reliability Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Action Reliability Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalActionReliabilityParameter(InternalActionReliabilityParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probabilistic Branch Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probabilistic Branch Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbabilisticBranchParameter(ProbabilisticBranchParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware MTTF Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware MTTF Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareMTTFParameter(HardwareMTTFParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware MTTR Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware MTTR Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareMTTRParameter(HardwareMTTRParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource MTTF Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource MTTF Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceMTTFParameter(ResourceMTTFParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource MTTR Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource MTTR Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceMTTRParameter(ResourceMTTRParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Reliability Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Reliability Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkReliabilityParameter(NetworkReliabilityParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Link Reliability Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Link Reliability Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationLinkReliabilityParameter(CommunicationLinkReliabilityParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Reliability Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Reliability Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareReliabilityParameter(SoftwareReliabilityParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Call Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Call Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemCallParameter(SystemCallParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Branch Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Branch Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageBranchParameter(UsageBranchParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SensitivitySwitch
