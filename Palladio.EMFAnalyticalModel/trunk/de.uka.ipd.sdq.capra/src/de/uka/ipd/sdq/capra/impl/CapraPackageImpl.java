/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.capra.impl;

import de.uka.ipd.sdq.capra.CapraFactory;
import de.uka.ipd.sdq.capra.CapraModel;
import de.uka.ipd.sdq.capra.CapraPackage;
import de.uka.ipd.sdq.capra.ReplicatedProcess;

import de.uka.ipd.sdq.capra.core.CorePackage;

import de.uka.ipd.sdq.capra.core.impl.CorePackageImpl;

import de.uka.ipd.sdq.capra.extension.ExtensionPackage;

import de.uka.ipd.sdq.capra.extension.impl.ExtensionPackageImpl;

import de.uka.ipd.sdq.capra.measurement.MeasurementPackage;

import de.uka.ipd.sdq.capra.measurement.impl.MeasurementPackageImpl;

import de.uka.ipd.sdq.capra.resources.ResourcesPackage;

import de.uka.ipd.sdq.capra.resources.impl.ResourcesPackageImpl;

import de.uka.ipd.sdq.capra.schedulers.SchedulersPackage;

import de.uka.ipd.sdq.capra.schedulers.impl.SchedulersPackageImpl;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapraPackageImpl extends EPackageImpl implements CapraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replicatedProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capraModelEClass = null;

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
	 * @see de.uka.ipd.sdq.capra.CapraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapraPackageImpl() {
		super(eNS_URI, CapraFactory.eINSTANCE);
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
	public static CapraPackage init() {
		if (isInited) return (CapraPackage)EPackage.Registry.INSTANCE.getEPackage(CapraPackage.eNS_URI);

		// Obtain or create and register package
		CapraPackageImpl theCapraPackage = (CapraPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CapraPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CapraPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ProbfunctionPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) : ResourcesPackage.eINSTANCE);
		SchedulersPackageImpl theSchedulersPackage = (SchedulersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulersPackage.eNS_URI) instanceof SchedulersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulersPackage.eNS_URI) : SchedulersPackage.eINSTANCE);
		MeasurementPackageImpl theMeasurementPackage = (MeasurementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) instanceof MeasurementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) : MeasurementPackage.eINSTANCE);
		ExtensionPackageImpl theExtensionPackage = (ExtensionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionPackage.eNS_URI) instanceof ExtensionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionPackage.eNS_URI) : ExtensionPackage.eINSTANCE);

		// Create package meta-data objects
		theCapraPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theResourcesPackage.createPackageContents();
		theSchedulersPackage.createPackageContents();
		theMeasurementPackage.createPackageContents();
		theExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theCapraPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theResourcesPackage.initializePackageContents();
		theSchedulersPackage.initializePackageContents();
		theMeasurementPackage.initializePackageContents();
		theExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCapraPackage.freeze();

		return theCapraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplicatedProcess() {
		return replicatedProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatedProcess_NumReplicas() {
		return (EAttribute)replicatedProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatedProcess_Processvariable() {
		return (EReference)replicatedProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapraModel() {
		return capraModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapraModel_Processes() {
		return (EReference)capraModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapraModel_Resources() {
		return (EReference)capraModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapraModel_Identifiers() {
		return (EReference)capraModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapraModel_Sensors() {
		return (EReference)capraModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapraFactory getCapraFactory() {
		return (CapraFactory)getEFactoryInstance();
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
		replicatedProcessEClass = createEClass(REPLICATED_PROCESS);
		createEAttribute(replicatedProcessEClass, REPLICATED_PROCESS__NUM_REPLICAS);
		createEReference(replicatedProcessEClass, REPLICATED_PROCESS__PROCESSVARIABLE);

		capraModelEClass = createEClass(CAPRA_MODEL);
		createEReference(capraModelEClass, CAPRA_MODEL__PROCESSES);
		createEReference(capraModelEClass, CAPRA_MODEL__RESOURCES);
		createEReference(capraModelEClass, CAPRA_MODEL__IDENTIFIERS);
		createEReference(capraModelEClass, CAPRA_MODEL__SENSORS);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ResourcesPackage theResourcesPackage = (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		SchedulersPackage theSchedulersPackage = (SchedulersPackage)EPackage.Registry.INSTANCE.getEPackage(SchedulersPackage.eNS_URI);
		MeasurementPackage theMeasurementPackage = (MeasurementPackage)EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI);
		ExtensionPackage theExtensionPackage = (ExtensionPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCorePackage);
		getESubpackages().add(theResourcesPackage);
		getESubpackages().add(theSchedulersPackage);
		getESubpackages().add(theMeasurementPackage);
		getESubpackages().add(theExtensionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(replicatedProcessEClass, ReplicatedProcess.class, "ReplicatedProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplicatedProcess_NumReplicas(), ecorePackage.getEInt(), "numReplicas", null, 0, 1, ReplicatedProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicatedProcess_Processvariable(), theCorePackage.getProcessVariable(), null, "processvariable", null, 1, 1, ReplicatedProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capraModelEClass, CapraModel.class, "CapraModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapraModel_Processes(), this.getReplicatedProcess(), null, "processes", null, 0, -1, CapraModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapraModel_Resources(), theResourcesPackage.getResource(), null, "resources", null, 0, -1, CapraModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapraModel_Identifiers(), theCorePackage.getIdentifier(), null, "identifiers", null, 0, -1, CapraModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapraModel_Sensors(), theMeasurementPackage.getSensor(), null, "sensors", null, 0, -1, CapraModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CapraPackageImpl
