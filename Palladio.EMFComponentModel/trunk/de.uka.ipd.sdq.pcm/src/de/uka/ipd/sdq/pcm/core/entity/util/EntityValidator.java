/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.core.entity.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;
import de.uka.ipd.sdq.pcm.core.entity.*;
import de.uka.ipd.sdq.pcm.core.entity.ComposedProvidingRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.core.entity.EntityPackage;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceProvidingEntity;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceProvidingRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.NamedElement;
import de.uka.ipd.sdq.pcm.core.entity.ResourceInterfaceRequiringEntity;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.core.entity.EntityPackage
 * @generated
 */
public class EntityValidator extends EObjectValidator {
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
	public static final EntityValidator INSTANCE = new EntityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.pcm.core.entity";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Provided Roles Must Be Bound' of 'Composed Providing Requiring Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_MUST_BE_BOUND = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

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
	public EntityValidator() {
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
	  return EntityPackage.eINSTANCE;
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
			case EntityPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case EntityPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case EntityPackage.INTERFACE_PROVIDING_ENTITY:
				return validateInterfaceProvidingEntity((InterfaceProvidingEntity)value, diagnostics, context);
			case EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY:
				return validateInterfaceProvidingRequiringEntity((InterfaceProvidingRequiringEntity)value, diagnostics, context);
			case EntityPackage.INTERFACE_REQUIRING_ENTITY:
				return validateInterfaceRequiringEntity((InterfaceRequiringEntity)value, diagnostics, context);
			case EntityPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY:
				return validateResourceInterfaceRequiringEntity((ResourceInterfaceRequiringEntity)value, diagnostics, context);
			case EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY:
				return validateComposedProvidingRequiringEntity((ComposedProvidingRequiringEntity)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(entity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceProvidingEntity(InterfaceProvidingEntity interfaceProvidingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(interfaceProvidingEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceRequiringEntity(InterfaceRequiringEntity interfaceRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(interfaceRequiringEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceProvidingRequiringEntity(InterfaceProvidingRequiringEntity interfaceProvidingRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(interfaceProvidingRequiringEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInterfaceRequiringEntity(ResourceInterfaceRequiringEntity resourceInterfaceRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(resourceInterfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceInterfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceInterfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceInterfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceInterfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceInterfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceInterfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(resourceInterfaceRequiringEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedProvidingRequiringEntity(ComposedProvidingRequiringEntity composedProvidingRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedProvidingRequiringEntity_ProvidedRolesMustBeBound(composedProvidingRequiringEntity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProvidedRolesMustBeBound constraint of '<em>Composed Providing Requiring Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedProvidingRequiringEntity_ProvidedRolesMustBeBound(ComposedProvidingRequiringEntity composedProvidingRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return composedProvidingRequiringEntity.ProvidedRolesMustBeBound(diagnostics, context);
	}

} //EntityValidator
