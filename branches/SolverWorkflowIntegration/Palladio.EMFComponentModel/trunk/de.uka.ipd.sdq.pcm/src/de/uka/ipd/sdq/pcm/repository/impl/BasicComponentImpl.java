/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.repository.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.PassiveResource;
import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;
import de.uka.ipd.sdq.pcm.repository.util.RepositoryValidator;
import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.impl.BasicComponentImpl#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.impl.BasicComponentImpl#getPassiveResource_BasicComponent <em>Passive Resource Basic Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicComponentImpl extends ImplementationComponentTypeImpl implements BasicComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached value of the '{@link #getServiceEffectSpecifications__BasicComponent() <em>Service Effect Specifications Basic Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceEffectSpecifications__BasicComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceEffectSpecification> serviceEffectSpecifications__BasicComponent;

	/**
	 * The cached value of the '{@link #getPassiveResource_BasicComponent() <em>Passive Resource Basic Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveResource_BasicComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<PassiveResource> passiveResource_BasicComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.BASIC_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceEffectSpecification> getServiceEffectSpecifications__BasicComponent() {
		if (serviceEffectSpecifications__BasicComponent == null) {
			serviceEffectSpecifications__BasicComponent = new EObjectContainmentEList<ServiceEffectSpecification>(ServiceEffectSpecification.class, this, RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT);
		}
		return serviceEffectSpecifications__BasicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassiveResource> getPassiveResource_BasicComponent() {
		if (passiveResource_BasicComponent == null) {
			passiveResource_BasicComponent = new EObjectContainmentEList<PassiveResource>(PassiveResource.class, this, RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT);
		}
		return passiveResource_BasicComponent;
	}

	/**
	 * The cached OCL expression body for the '{@link #NoSeffTypeUsedTwice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Seff Type Used Twice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NoSeffTypeUsedTwice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NO_SEFF_TYPE_USED_TWICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.serviceEffectSpecifications__BasicComponent->forAll(p1, p2 |\n"+"  p1 <> p2 implies (p1.describedService__SEFF = p2.describedService__SEFF implies p1.seffTypeID <> p2.seffTypeID))";

	/**
	 * The cached OCL invariant for the '{@link #NoSeffTypeUsedTwice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Seff Type Used Twice</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NoSeffTypeUsedTwice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint NO_SEFF_TYPE_USED_TWICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoSeffTypeUsedTwice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (NO_SEFF_TYPE_USED_TWICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(RepositoryPackage.Literals.BASIC_COMPONENT);
			try {
				NO_SEFF_TYPE_USED_TWICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(NO_SEFF_TYPE_USED_TWICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(NO_SEFF_TYPE_USED_TWICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RepositoryValidator.DIAGNOSTIC_SOURCE,
						 RepositoryValidator.BASIC_COMPONENT__NO_SEFF_TYPE_USED_TWICE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoSeffTypeUsedTwice", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProvideSameInterfacesAsImplementationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Provide Same Interfaces As Implementation Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProvideSameInterfacesAsImplementationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- BC has to provide the same interfaces like the implementationComponentType (if set) #\n"+"if\n"+"	 -- apply constraint only for non-empty ImplementationComponentTypes of a BC #\n"+"	self.parentCompleteComponentTypes->notEmpty()\n"+"then\n"+"	--own interface IDs:\n"+"    self.providedRoles_InterfaceProvidingEntity->collect(pr : ProvidedRole | pr.providedInterface__ProvidedRole.id)->asSet()\n"+"    =\n"+"    --complete type interface IDs:\n"+"    self.parentCompleteComponentTypes->collect(pr | pr.providedRoles_InterfaceProvidingEntity.providedInterface__ProvidedRole.id)->asSet()\n"+"else\n"+"	true\n"+"endif";

	/**
	 * The cached OCL invariant for the '{@link #ProvideSameInterfacesAsImplementationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Provide Same Interfaces As Implementation Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProvideSameInterfacesAsImplementationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROVIDE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProvideSameInterfacesAsImplementationType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROVIDE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(RepositoryPackage.Literals.BASIC_COMPONENT);
			try {
				PROVIDE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROVIDE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROVIDE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RepositoryValidator.DIAGNOSTIC_SOURCE,
						 RepositoryValidator.BASIC_COMPONENT__PROVIDE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProvideSameInterfacesAsImplementationType", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #RequireSameInterfacesAsImplementationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Require Same Interfaces As Implementation Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RequireSameInterfacesAsImplementationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- BC has to require the same interfaces like the implementationComponentType (if set) #\n"+"if\n"+"	 -- apply constraint only for non-empty ImplementationComponentTypes of a BC #\n"+"	self.parentCompleteComponentTypes->notEmpty()\n"+"then\n"+"	--own interface IDs:\n"+"    self.requiredRoles_InterfaceRequiringEntity->collect(rr : RequiredRole | rr.requiredInterface__RequiredRole.id)->asSet()\n"+"    =\n"+"    --complete type interface IDs:\n"+"    self.parentCompleteComponentTypes->collect(rr | rr.requiredRoles_InterfaceRequiringEntity.requiredInterface__RequiredRole.id)->asSet()\n"+"else\n"+"	true\n"+"endif";

	/**
	 * The cached OCL invariant for the '{@link #RequireSameInterfacesAsImplementationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Require Same Interfaces As Implementation Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RequireSameInterfacesAsImplementationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint REQUIRE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean RequireSameInterfacesAsImplementationType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (REQUIRE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(RepositoryPackage.Literals.BASIC_COMPONENT);
			try {
				REQUIRE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(REQUIRE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(REQUIRE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RepositoryValidator.DIAGNOSTIC_SOURCE,
						 RepositoryValidator.BASIC_COMPONENT__REQUIRE_SAME_INTERFACES_AS_IMPLEMENTATION_TYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RequireSameInterfacesAsImplementationType", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				return ((InternalEList<?>)getServiceEffectSpecifications__BasicComponent()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				return ((InternalEList<?>)getPassiveResource_BasicComponent()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				return getServiceEffectSpecifications__BasicComponent();
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				return getPassiveResource_BasicComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				getServiceEffectSpecifications__BasicComponent().clear();
				getServiceEffectSpecifications__BasicComponent().addAll((Collection<? extends ServiceEffectSpecification>)newValue);
				return;
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				getPassiveResource_BasicComponent().clear();
				getPassiveResource_BasicComponent().addAll((Collection<? extends PassiveResource>)newValue);
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
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				getServiceEffectSpecifications__BasicComponent().clear();
				return;
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				getPassiveResource_BasicComponent().clear();
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
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				return serviceEffectSpecifications__BasicComponent != null && !serviceEffectSpecifications__BasicComponent.isEmpty();
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				return passiveResource_BasicComponent != null && !passiveResource_BasicComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicComponentImpl
