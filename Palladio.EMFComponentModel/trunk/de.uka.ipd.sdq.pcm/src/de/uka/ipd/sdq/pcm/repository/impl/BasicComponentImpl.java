
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.repository.impl;

import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.ImplementationComponentType;
import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;

import de.uka.ipd.sdq.pcm.repository.util.RepositoryValidator;

import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.impl.BasicComponentImpl#getImplementationComponentType <em>Implementation Component Type</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.impl.BasicComponentImpl#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}</li>
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
	public static final String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached value of the '{@link #getImplementationComponentType() <em>Implementation Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationComponentType()
	 * @generated
	 * @ordered
	 */
	protected ImplementationComponentType implementationComponentType;

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
	 * The parsed OCL expression for the definition of the '{@link #NoSeffTypeUsedTwice <em>No Seff Type Used Twice</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NoSeffTypeUsedTwice
	 * @generated
	 */
	private static OCLExpression NoSeffTypeUsedTwiceInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '{@link #ProvideSameInterfacesAsImplementationType <em>Provide Same Interfaces As Implementation Type</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProvideSameInterfacesAsImplementationType
	 * @generated
	 */
	private static OCLExpression ProvideSameInterfacesAsImplementationTypeInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '{@link #RequireSameInterfacesAsImplementationType <em>Require Same Interfaces As Implementation Type</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RequireSameInterfacesAsImplementationType
	 * @generated
	 */
	private static OCLExpression RequireSameInterfacesAsImplementationTypeInvOCL;

	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/emf/2002/GenModel";
	
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
	public ImplementationComponentType getImplementationComponentType() {
		if (implementationComponentType != null && implementationComponentType.eIsProxy()) {
			InternalEObject oldImplementationComponentType = (InternalEObject)implementationComponentType;
			implementationComponentType = (ImplementationComponentType)eResolveProxy(oldImplementationComponentType);
			if (implementationComponentType != oldImplementationComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.BASIC_COMPONENT__IMPLEMENTATION_COMPONENT_TYPE, oldImplementationComponentType, implementationComponentType));
			}
		}
		return implementationComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationComponentType basicGetImplementationComponentType() {
		return implementationComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationComponentType(ImplementationComponentType newImplementationComponentType) {
		ImplementationComponentType oldImplementationComponentType = implementationComponentType;
		implementationComponentType = newImplementationComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.BASIC_COMPONENT__IMPLEMENTATION_COMPONENT_TYPE, oldImplementationComponentType, implementationComponentType));
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
	public boolean NoSeffTypeUsedTwice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (NoSeffTypeUsedTwiceInvOCL == null) {
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			
			
			String body = "self.serviceEffectSpecifications__BasicComponent->forAll(p1, p2 |    p1 <> p2 implies (p1.describedService__SEFF = p2.describedService__SEFF implies p1.seffTypeID <> p2.seffTypeID)) ";
			
			try {
				NoSeffTypeUsedTwiceInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(NoSeffTypeUsedTwiceInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProvideSameInterfacesAsImplementationType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ProvideSameInterfacesAsImplementationTypeInvOCL == null) {
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			
			
			String body = " self.providedRoles_InterfaceProvidingEntity->iterate(pr : ProvidedRole; acc1 : Bag(String) = Bag{} |   acc1->union(pr.providedInterface__ProvidedRole.id->asBag())  )  =  if      self.implementationComponentType->notEmpty()  then   self.implementationComponentType.providedRoles_InterfaceProvidingEntity->iterate(pr : ProvidedRole; acc2 : Bag(String) = Bag{} |    acc2->union(pr.providedInterface__ProvidedRole.id->asBag())   )  else   Bag{}  endif ";
			
			try {
				ProvideSameInterfacesAsImplementationTypeInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(ProvideSameInterfacesAsImplementationTypeInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean RequireSameInterfacesAsImplementationType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (RequireSameInterfacesAsImplementationTypeInvOCL == null) {
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			
			
			String body = " self.requiredRoles_InterfaceRequiringEntity->iterate(pr : RequiredRole; acc1 : Bag(String) = Bag{} |   acc1->union(pr.requiredInterface__RequiredRole.id->asBag())  )  =  if      self.implementationComponentType->notEmpty()  then   self.implementationComponentType.requiredRoles_InterfaceRequiringEntity->iterate(pr : RequiredRole; acc2 : Bag(String) = Bag{} |    acc2->union(pr.requiredInterface__RequiredRole.id->asBag())   )  else   Bag{}  endif ";
			
			try {
				RequireSameInterfacesAsImplementationTypeInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(RequireSameInterfacesAsImplementationTypeInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
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
			case RepositoryPackage.BASIC_COMPONENT__IMPLEMENTATION_COMPONENT_TYPE:
				if (resolve) return getImplementationComponentType();
				return basicGetImplementationComponentType();
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				return getServiceEffectSpecifications__BasicComponent();
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
			case RepositoryPackage.BASIC_COMPONENT__IMPLEMENTATION_COMPONENT_TYPE:
				setImplementationComponentType((ImplementationComponentType)newValue);
				return;
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				getServiceEffectSpecifications__BasicComponent().clear();
				getServiceEffectSpecifications__BasicComponent().addAll((Collection<? extends ServiceEffectSpecification>)newValue);
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
			case RepositoryPackage.BASIC_COMPONENT__IMPLEMENTATION_COMPONENT_TYPE:
				setImplementationComponentType((ImplementationComponentType)null);
				return;
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				getServiceEffectSpecifications__BasicComponent().clear();
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
			case RepositoryPackage.BASIC_COMPONENT__IMPLEMENTATION_COMPONENT_TYPE:
				return implementationComponentType != null;
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				return serviceEffectSpecifications__BasicComponent != null && !serviceEffectSpecifications__BasicComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicComponentImpl
