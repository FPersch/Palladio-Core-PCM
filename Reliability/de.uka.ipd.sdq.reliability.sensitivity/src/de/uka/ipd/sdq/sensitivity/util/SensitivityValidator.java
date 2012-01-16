/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.sensitivity.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import de.uka.ipd.sdq.sensitivity.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.sensitivity.SensitivityPackage
 * @generated
 */
public class SensitivityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SensitivityValidator INSTANCE = new SensitivityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.sensitivity";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Component Reliability Parameter Must Have Double Variation' of 'Component Reliability Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT_RELIABILITY_PARAMETER__COMPONENT_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Internal Action Reliability Parameter Must Have Double Variation' of 'Internal Action Reliability Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Probabilistic Branch Parameter Must Have Double Variation' of 'Probabilistic Branch Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Hardware MTTF Parameter Must Have Double Variation' of 'Hardware MTTF Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HARDWARE_MTTF_PARAMETER__HARDWARE_MTTF_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Hardware MTTR Parameter Must Have Double Variation' of 'Hardware MTTR Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HARDWARE_MTTR_PARAMETER__HARDWARE_MTTR_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource MTTF Parameter Must Have Double Variation' of 'Resource MTTF Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_MTTF_PARAMETER__RESOURCE_MTTF_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource MTTR Parameter Must Have Double Variation' of 'Resource MTTR Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_MTTR_PARAMETER__RESOURCE_MTTR_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Network Reliability Parameter Must Have Double Variation' of 'Network Reliability Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORK_RELIABILITY_PARAMETER__NETWORK_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Communication Link Parameter Must Have Double Variation' of 'Communication Link Reliability Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMUNICATION_LINK_RELIABILITY_PARAMETER__COMMUNICATION_LINK_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Software Reliability Parameter Must Have Double Variation' of 'Software Reliability Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOFTWARE_RELIABILITY_PARAMETER__SOFTWARE_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'System Call Parameter Must Have String Sequence' of 'System Call Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_CALL_PARAMETER__SYSTEM_CALL_PARAMETER_MUST_HAVE_STRING_SEQUENCE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Usage Branch Parameter Must Have Double Variation' of 'Usage Branch Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USAGE_BRANCH_PARAMETER__USAGE_BRANCH_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Software Failure Type Reliability Parameter Must Have Double Variation' of 'Software Failure Types Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOFTWARE_FAILURE_TYPES_PARAMETER__SOFTWARE_FAILURE_TYPE_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitivityValidator() {
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SensitivityPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SensitivityPackage.SENSITIVITY_CONFIGURATION:
				return validateSensitivityConfiguration((SensitivityConfiguration)value, diagnostics, context);
			case SensitivityPackage.SENSITIVITY_PARAMETER:
				return validateSensitivityParameter((SensitivityParameter)value, diagnostics, context);
			case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER:
				return validateCombinedSensitivityParameter((CombinedSensitivityParameter)value, diagnostics, context);
			case SensitivityPackage.SENSITIVITY_RESULT_SPECIFICATION:
				return validateSensitivityResultSpecification((SensitivityResultSpecification)value, diagnostics, context);
			case SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER:
				return validateSingleSensitivityParameter((SingleSensitivityParameter)value, diagnostics, context);
			case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION:
				return validateSensitivityParameterVariation((SensitivityParameterVariation)value, diagnostics, context);
			case SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER:
				return validateComponentReliabilityParameter((ComponentReliabilityParameter)value, diagnostics, context);
			case SensitivityPackage.DOUBLE_PARAMETER_VARIATION:
				return validateDoubleParameterVariation((DoubleParameterVariation)value, diagnostics, context);
			case SensitivityPackage.STRING_PARAMETER_SEQUENCE:
				return validateStringParameterSequence((StringParameterSequence)value, diagnostics, context);
			case SensitivityPackage.DOUBLE_PARAMETER_RANGE:
				return validateDoubleParameterRange((DoubleParameterRange)value, diagnostics, context);
			case SensitivityPackage.DOUBLE_PARAMETER_SEQUENCE:
				return validateDoubleParameterSequence((DoubleParameterSequence)value, diagnostics, context);
			case SensitivityPackage.DOUBLE_PARAMETER_FUNCTION:
				return validateDoubleParameterFunction((DoubleParameterFunction)value, diagnostics, context);
			case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER:
				return validateInternalActionReliabilityParameter((InternalActionReliabilityParameter)value, diagnostics, context);
			case SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER:
				return validateProbabilisticBranchParameter((ProbabilisticBranchParameter)value, diagnostics, context);
			case SensitivityPackage.HARDWARE_MTTF_PARAMETER:
				return validateHardwareMTTFParameter((HardwareMTTFParameter)value, diagnostics, context);
			case SensitivityPackage.HARDWARE_MTTR_PARAMETER:
				return validateHardwareMTTRParameter((HardwareMTTRParameter)value, diagnostics, context);
			case SensitivityPackage.RESOURCE_MTTF_PARAMETER:
				return validateResourceMTTFParameter((ResourceMTTFParameter)value, diagnostics, context);
			case SensitivityPackage.RESOURCE_MTTR_PARAMETER:
				return validateResourceMTTRParameter((ResourceMTTRParameter)value, diagnostics, context);
			case SensitivityPackage.NETWORK_RELIABILITY_PARAMETER:
				return validateNetworkReliabilityParameter((NetworkReliabilityParameter)value, diagnostics, context);
			case SensitivityPackage.COMMUNICATION_LINK_RELIABILITY_PARAMETER:
				return validateCommunicationLinkReliabilityParameter((CommunicationLinkReliabilityParameter)value, diagnostics, context);
			case SensitivityPackage.SOFTWARE_RELIABILITY_PARAMETER:
				return validateSoftwareReliabilityParameter((SoftwareReliabilityParameter)value, diagnostics, context);
			case SensitivityPackage.SYSTEM_CALL_PARAMETER:
				return validateSystemCallParameter((SystemCallParameter)value, diagnostics, context);
			case SensitivityPackage.USAGE_BRANCH_PARAMETER:
				return validateUsageBranchParameter((UsageBranchParameter)value, diagnostics, context);
			case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE:
				return validateDoubleOffsetSequence((DoubleOffsetSequence)value, diagnostics, context);
			case SensitivityPackage.SOFTWARE_FAILURE_TYPES_PARAMETER:
				return validateSoftwareFailureTypesParameter((SoftwareFailureTypesParameter)value, diagnostics, context);
			case SensitivityPackage.FAILURE_TYPE_RESULT_SPECIFICATION:
				return validateFailureTypeResultSpecification((FailureTypeResultSpecification)value, diagnostics, context);
			case SensitivityPackage.FAILURE_DIMENSION_RESULT_SPECIFICATION:
				return validateFailureDimensionResultSpecification((FailureDimensionResultSpecification)value, diagnostics, context);
			case SensitivityPackage.DOUBLE_OFFSET_TYPE:
				return validateDoubleOffsetType((DoubleOffsetType)value, diagnostics, context);
			case SensitivityPackage.FAILURE_DIMENSION:
				return validateFailureDimension((FailureDimension)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensitivityConfiguration(SensitivityConfiguration sensitivityConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(sensitivityConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sensitivityConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sensitivityConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sensitivityConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sensitivityConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sensitivityConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sensitivityConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(sensitivityConfiguration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensitivityParameter(SensitivityParameter sensitivityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(sensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(sensitivityParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedSensitivityParameter(CombinedSensitivityParameter combinedSensitivityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(combinedSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(combinedSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(combinedSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(combinedSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(combinedSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(combinedSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(combinedSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(combinedSensitivityParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensitivityResultSpecification(SensitivityResultSpecification sensitivityResultSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(sensitivityResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sensitivityResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sensitivityResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sensitivityResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sensitivityResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sensitivityResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sensitivityResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(sensitivityResultSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleSensitivityParameter(SingleSensitivityParameter singleSensitivityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(singleSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleSensitivityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(singleSensitivityParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensitivityParameterVariation(SensitivityParameterVariation sensitivityParameterVariation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensitivityParameterVariation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentReliabilityParameter(ComponentReliabilityParameter componentReliabilityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(componentReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(componentReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentReliabilityParameter_ComponentReliabilityParameterMustHaveDoubleVariation(componentReliabilityParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ComponentReliabilityParameterMustHaveDoubleVariation constraint of '<em>Component Reliability Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentReliabilityParameter_ComponentReliabilityParameterMustHaveDoubleVariation(ComponentReliabilityParameter componentReliabilityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return componentReliabilityParameter.ComponentReliabilityParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleParameterVariation(DoubleParameterVariation doubleParameterVariation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleParameterVariation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringParameterSequence(StringParameterSequence stringParameterSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringParameterSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleParameterRange(DoubleParameterRange doubleParameterRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleParameterRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleParameterSequence(DoubleParameterSequence doubleParameterSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleParameterSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleParameterFunction(DoubleParameterFunction doubleParameterFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleParameterFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalActionReliabilityParameter(InternalActionReliabilityParameter internalActionReliabilityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(internalActionReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalActionReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalActionReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalActionReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalActionReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalActionReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalActionReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(internalActionReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalActionReliabilityParameter_InternalActionReliabilityParameterMustHaveDoubleVariation(internalActionReliabilityParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InternalActionReliabilityParameterMustHaveDoubleVariation constraint of '<em>Internal Action Reliability Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalActionReliabilityParameter_InternalActionReliabilityParameterMustHaveDoubleVariation(InternalActionReliabilityParameter internalActionReliabilityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalActionReliabilityParameter.InternalActionReliabilityParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilisticBranchParameter(ProbabilisticBranchParameter probabilisticBranchParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(probabilisticBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(probabilisticBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(probabilisticBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(probabilisticBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(probabilisticBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(probabilisticBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(probabilisticBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(probabilisticBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateProbabilisticBranchParameter_ProbabilisticBranchParameterMustHaveDoubleVariation(probabilisticBranchParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProbabilisticBranchParameterMustHaveDoubleVariation constraint of '<em>Probabilistic Branch Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilisticBranchParameter_ProbabilisticBranchParameterMustHaveDoubleVariation(ProbabilisticBranchParameter probabilisticBranchParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return probabilisticBranchParameter.ProbabilisticBranchParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareMTTFParameter(HardwareMTTFParameter hardwareMTTFParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(hardwareMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hardwareMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hardwareMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hardwareMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hardwareMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hardwareMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hardwareMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(hardwareMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateHardwareMTTFParameter_HardwareMTTFParameterMustHaveDoubleVariation(hardwareMTTFParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HardwareMTTFParameterMustHaveDoubleVariation constraint of '<em>Hardware MTTF Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareMTTFParameter_HardwareMTTFParameterMustHaveDoubleVariation(HardwareMTTFParameter hardwareMTTFParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hardwareMTTFParameter.HardwareMTTFParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareMTTRParameter(HardwareMTTRParameter hardwareMTTRParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(hardwareMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hardwareMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hardwareMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hardwareMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hardwareMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hardwareMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hardwareMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(hardwareMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateHardwareMTTRParameter_HardwareMTTRParameterMustHaveDoubleVariation(hardwareMTTRParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HardwareMTTRParameterMustHaveDoubleVariation constraint of '<em>Hardware MTTR Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareMTTRParameter_HardwareMTTRParameterMustHaveDoubleVariation(HardwareMTTRParameter hardwareMTTRParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hardwareMTTRParameter.HardwareMTTRParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceMTTFParameter(ResourceMTTFParameter resourceMTTFParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(resourceMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(resourceMTTFParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceMTTFParameter_ResourceMTTFParameterMustHaveDoubleVariation(resourceMTTFParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResourceMTTFParameterMustHaveDoubleVariation constraint of '<em>Resource MTTF Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceMTTFParameter_ResourceMTTFParameterMustHaveDoubleVariation(ResourceMTTFParameter resourceMTTFParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceMTTFParameter.ResourceMTTFParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceMTTRParameter(ResourceMTTRParameter resourceMTTRParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(resourceMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(resourceMTTRParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceMTTRParameter_ResourceMTTRParameterMustHaveDoubleVariation(resourceMTTRParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResourceMTTRParameterMustHaveDoubleVariation constraint of '<em>Resource MTTR Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceMTTRParameter_ResourceMTTRParameterMustHaveDoubleVariation(ResourceMTTRParameter resourceMTTRParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceMTTRParameter.ResourceMTTRParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkReliabilityParameter(NetworkReliabilityParameter networkReliabilityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(networkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(networkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkReliabilityParameter_NetworkReliabilityParameterMustHaveDoubleVariation(networkReliabilityParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NetworkReliabilityParameterMustHaveDoubleVariation constraint of '<em>Network Reliability Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkReliabilityParameter_NetworkReliabilityParameterMustHaveDoubleVariation(NetworkReliabilityParameter networkReliabilityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networkReliabilityParameter.NetworkReliabilityParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationLinkReliabilityParameter(CommunicationLinkReliabilityParameter communicationLinkReliabilityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(communicationLinkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communicationLinkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communicationLinkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communicationLinkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(communicationLinkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(communicationLinkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(communicationLinkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(communicationLinkReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommunicationLinkReliabilityParameter_CommunicationLinkParameterMustHaveDoubleVariation(communicationLinkReliabilityParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CommunicationLinkParameterMustHaveDoubleVariation constraint of '<em>Communication Link Reliability Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationLinkReliabilityParameter_CommunicationLinkParameterMustHaveDoubleVariation(CommunicationLinkReliabilityParameter communicationLinkReliabilityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return communicationLinkReliabilityParameter.CommunicationLinkParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareReliabilityParameter(SoftwareReliabilityParameter softwareReliabilityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(softwareReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(softwareReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(softwareReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(softwareReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(softwareReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(softwareReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(softwareReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(softwareReliabilityParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoftwareReliabilityParameter_SoftwareReliabilityParameterMustHaveDoubleVariation(softwareReliabilityParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SoftwareReliabilityParameterMustHaveDoubleVariation constraint of '<em>Software Reliability Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareReliabilityParameter_SoftwareReliabilityParameterMustHaveDoubleVariation(SoftwareReliabilityParameter softwareReliabilityParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return softwareReliabilityParameter.SoftwareReliabilityParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemCallParameter(SystemCallParameter systemCallParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(systemCallParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemCallParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemCallParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemCallParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemCallParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemCallParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemCallParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(systemCallParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemCallParameter_SystemCallParameterMustHaveStringSequence(systemCallParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SystemCallParameterMustHaveStringSequence constraint of '<em>System Call Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemCallParameter_SystemCallParameterMustHaveStringSequence(SystemCallParameter systemCallParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemCallParameter.SystemCallParameterMustHaveStringSequence(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageBranchParameter(UsageBranchParameter usageBranchParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(usageBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(usageBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(usageBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(usageBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(usageBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(usageBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(usageBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(usageBranchParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateUsageBranchParameter_UsageBranchParameterMustHaveDoubleVariation(usageBranchParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UsageBranchParameterMustHaveDoubleVariation constraint of '<em>Usage Branch Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageBranchParameter_UsageBranchParameterMustHaveDoubleVariation(UsageBranchParameter usageBranchParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return usageBranchParameter.UsageBranchParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleOffsetSequence(DoubleOffsetSequence doubleOffsetSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleOffsetSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareFailureTypesParameter(SoftwareFailureTypesParameter softwareFailureTypesParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(softwareFailureTypesParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(softwareFailureTypesParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(softwareFailureTypesParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(softwareFailureTypesParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(softwareFailureTypesParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(softwareFailureTypesParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(softwareFailureTypesParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(softwareFailureTypesParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoftwareFailureTypesParameter_SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation(softwareFailureTypesParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation constraint of '<em>Software Failure Types Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareFailureTypesParameter_SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation(SoftwareFailureTypesParameter softwareFailureTypesParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return softwareFailureTypesParameter.SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureTypeResultSpecification(FailureTypeResultSpecification failureTypeResultSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(failureTypeResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(failureTypeResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(failureTypeResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(failureTypeResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(failureTypeResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(failureTypeResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(failureTypeResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(failureTypeResultSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureDimensionResultSpecification(FailureDimensionResultSpecification failureDimensionResultSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(failureDimensionResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(failureDimensionResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(failureDimensionResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(failureDimensionResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(failureDimensionResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(failureDimensionResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(failureDimensionResultSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(failureDimensionResultSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleOffsetType(DoubleOffsetType doubleOffsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureDimension(FailureDimension failureDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SensitivityValidator
