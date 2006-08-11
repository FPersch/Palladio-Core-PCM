/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.ipd.uka.sdq.pcm.assembly.impl;

import de.ipd.uka.sdq.identifier.IdentifierPackage;

import de.ipd.uka.sdq.pcm.allocation.AllocationPackage;

import de.ipd.uka.sdq.pcm.allocation.impl.AllocationPackageImpl;

import de.ipd.uka.sdq.pcm.assembly.Assembly;
import de.ipd.uka.sdq.pcm.assembly.AssemblyContext;
import de.ipd.uka.sdq.pcm.assembly.AssemblyFactory;
import de.ipd.uka.sdq.pcm.assembly.AssemblyPackage;
import de.ipd.uka.sdq.pcm.assembly.SystemAssemblyConnector;

import de.ipd.uka.sdq.pcm.assembly.util.AssemblyValidator;

import de.ipd.uka.sdq.pcm.core.connectors.ConnectorsPackage;

import de.ipd.uka.sdq.pcm.core.connectors.impl.ConnectorsPackageImpl;

import de.ipd.uka.sdq.pcm.core.entity.EntityPackage;

import de.ipd.uka.sdq.pcm.core.entity.impl.EntityPackageImpl;

import de.ipd.uka.sdq.pcm.core.stochastics.StochasticsPackage;

import de.ipd.uka.sdq.pcm.core.stochastics.impl.StochasticsPackageImpl;

import de.ipd.uka.sdq.pcm.parameter.ParameterPackage;

import de.ipd.uka.sdq.pcm.parameter.impl.ParameterPackageImpl;

import de.ipd.uka.sdq.pcm.protocol.ProtocolPackage;

import de.ipd.uka.sdq.pcm.protocol.impl.ProtocolPackageImpl;

import de.ipd.uka.sdq.pcm.repository.RepositoryPackage;

import de.ipd.uka.sdq.pcm.repository.impl.RepositoryPackageImpl;

import de.ipd.uka.sdq.pcm.resourceenvironment.ResourceenvironmentPackage;

import de.ipd.uka.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl;

import de.ipd.uka.sdq.pcm.resourcetype.ResourcetypePackage;

import de.ipd.uka.sdq.pcm.resourcetype.impl.ResourcetypePackageImpl;

import de.ipd.uka.sdq.pcm.seff.SeffPackage;

import de.ipd.uka.sdq.pcm.seff.impl.SeffPackageImpl;

import de.ipd.uka.sdq.pcm.system.SystemPackage;

import de.ipd.uka.sdq.pcm.system.impl.SystemPackageImpl;

import de.ipd.uka.sdq.pcm.usagemodel.UsagemodelPackage;

import de.ipd.uka.sdq.pcm.usagemodel.impl.UsagemodelPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyPackageImpl extends EPackageImpl implements AssemblyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemAssemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.ipd.uka.sdq.pcm.assembly.AssemblyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssemblyPackageImpl() {
		super(eNS_URI, AssemblyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssemblyPackage init() {
		if (isInited) return (AssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);

		// Obtain or create and register package
		AssemblyPackageImpl theAssemblyPackage = (AssemblyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AssemblyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AssemblyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StochasticsPackageImpl theStochasticsPackage = (StochasticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StochasticsPackage.eNS_URI) instanceof StochasticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StochasticsPackage.eNS_URI) : StochasticsPackage.eINSTANCE);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI) instanceof EntityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI) : EntityPackage.eINSTANCE);
		ConnectorsPackageImpl theConnectorsPackage = (ConnectorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorsPackage.eNS_URI) instanceof ConnectorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorsPackage.eNS_URI) : ConnectorsPackage.eINSTANCE);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		SeffPackageImpl theSeffPackage = (SeffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI) instanceof SeffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI) : SeffPackage.eINSTANCE);
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) instanceof ResourcetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) : ResourcetypePackage.eINSTANCE);
		ParameterPackageImpl theParameterPackage = (ParameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI) instanceof ParameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI) : ParameterPackage.eINSTANCE);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);
		ResourceenvironmentPackageImpl theResourceenvironmentPackage = (ResourceenvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI) instanceof ResourceenvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI) : ResourceenvironmentPackage.eINSTANCE);
		UsagemodelPackageImpl theUsagemodelPackage = (UsagemodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI) instanceof UsagemodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI) : UsagemodelPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);

		// Create package meta-data objects
		theAssemblyPackage.createPackageContents();
		theStochasticsPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theConnectorsPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theSeffPackage.createPackageContents();
		theResourcetypePackage.createPackageContents();
		theParameterPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		theResourceenvironmentPackage.createPackageContents();
		theUsagemodelPackage.createPackageContents();
		theSystemPackage.createPackageContents();

		// Initialize created meta-data
		theAssemblyPackage.initializePackageContents();
		theStochasticsPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theConnectorsPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theSeffPackage.initializePackageContents();
		theResourcetypePackage.initializePackageContents();
		theParameterPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		theResourceenvironmentPackage.initializePackageContents();
		theUsagemodelPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAssemblyPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AssemblyValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAssemblyPackage.freeze();

		return theAssemblyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemAssemblyConnector() {
		return systemAssemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAssemblyConnector_ProvidingContext_SystemAssemblyConnector() {
		return (EReference)systemAssemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAssemblyConnector_RequiringContext_SystemAssemblyConnector() {
		return (EReference)systemAssemblyConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAssemblyConnector_ProvidedRole_SystemAssemblyConnector() {
		return (EReference)systemAssemblyConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAssemblyConnector_RequiredRole_SystemAssemblyConnector() {
		return (EReference)systemAssemblyConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyContext() {
		return assemblyContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyContext_EncapsulatedComponent__AssemblyContext() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssembly() {
		return assemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_Assemblycontexts_Assembly() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_AssemblyConnectors_Assembly() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyFactory getAssemblyFactory() {
		return (AssemblyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemAssemblyConnectorEClass = createEClass(SYSTEM_ASSEMBLY_CONNECTOR);
		createEReference(systemAssemblyConnectorEClass, SYSTEM_ASSEMBLY_CONNECTOR__PROVIDING_CONTEXT_SYSTEM_ASSEMBLY_CONNECTOR);
		createEReference(systemAssemblyConnectorEClass, SYSTEM_ASSEMBLY_CONNECTOR__REQUIRING_CONTEXT_SYSTEM_ASSEMBLY_CONNECTOR);
		createEReference(systemAssemblyConnectorEClass, SYSTEM_ASSEMBLY_CONNECTOR__PROVIDED_ROLE_SYSTEM_ASSEMBLY_CONNECTOR);
		createEReference(systemAssemblyConnectorEClass, SYSTEM_ASSEMBLY_CONNECTOR__REQUIRED_ROLE_SYSTEM_ASSEMBLY_CONNECTOR);

		assemblyContextEClass = createEClass(ASSEMBLY_CONTEXT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT);

		assemblyEClass = createEClass(ASSEMBLY);
		createEReference(assemblyEClass, ASSEMBLY__ASSEMBLYCONTEXTS_ASSEMBLY);
		createEReference(assemblyEClass, ASSEMBLY__ASSEMBLY_CONNECTORS_ASSEMBLY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConnectorsPackage theConnectorsPackage = (ConnectorsPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorsPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Add supertypes to classes
		systemAssemblyConnectorEClass.getESuperTypes().add(theConnectorsPackage.getConnector());
		assemblyContextEClass.getESuperTypes().add(theEntityPackage.getEntity());
		assemblyEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(systemAssemblyConnectorEClass, SystemAssemblyConnector.class, "SystemAssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemAssemblyConnector_ProvidingContext_SystemAssemblyConnector(), this.getAssemblyContext(), null, "providingContext_SystemAssemblyConnector", null, 1, 1, SystemAssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemAssemblyConnector_RequiringContext_SystemAssemblyConnector(), this.getAssemblyContext(), null, "requiringContext_SystemAssemblyConnector", null, 1, 1, SystemAssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemAssemblyConnector_ProvidedRole_SystemAssemblyConnector(), theRepositoryPackage.getProvidedRole(), null, "providedRole_SystemAssemblyConnector", null, 1, 1, SystemAssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemAssemblyConnector_RequiredRole_SystemAssemblyConnector(), theRepositoryPackage.getRequiredRole(), null, "requiredRole_SystemAssemblyConnector", null, 1, 1, SystemAssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(systemAssemblyConnectorEClass, ecorePackage.getEBoolean(), "contextIDsOfProvidesRoleNotEqualRequiresRole", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(assemblyContextEClass, AssemblyContext.class, "AssemblyContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyContext_EncapsulatedComponent__AssemblyContext(), theRepositoryPackage.getProvidesComponentType(), null, "encapsulatedComponent__AssemblyContext", null, 1, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assemblyEClass, Assembly.class, "Assembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssembly_Assemblycontexts_Assembly(), this.getAssemblyContext(), null, "assemblycontexts_Assembly", null, 0, -1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssembly_AssemblyConnectors_Assembly(), this.getSystemAssemblyConnector(), null, "assemblyConnectors_Assembly", null, 0, -1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AssemblyPackageImpl
