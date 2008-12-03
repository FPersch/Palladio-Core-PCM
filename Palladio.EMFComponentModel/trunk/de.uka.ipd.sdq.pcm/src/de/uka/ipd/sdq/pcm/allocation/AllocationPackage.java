/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.allocation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uka.ipd.sdq.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.allocation.AllocationFactory
 * @model kind="package"
 * @generated
 */
public interface AllocationPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2008 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "allocation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/Allocation/4.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocationPackage eINSTANCE = de.uka.ipd.sdq.pcm.allocation.impl.AllocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.allocation.impl.AllocationContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.allocation.impl.AllocationContextImpl
	 * @see de.uka.ipd.sdq.pcm.allocation.impl.AllocationPackageImpl#getAllocationContext()
	 * @generated
	 */
	int ALLOCATION_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Container Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assembly Context Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.allocation.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.allocation.impl.AllocationImpl
	 * @see de.uka.ipd.sdq.pcm.allocation.impl.AllocationPackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Allocation Contexts Allocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Resource Environment Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__SYSTEM_ALLOCATION = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.allocation.AllocationContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see de.uka.ipd.sdq.pcm.allocation.AllocationContext
	 * @generated
	 */
	EClass getAllocationContext();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.allocation.AllocationContext#getResourceContainer_AllocationContext <em>Resource Container Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Container Allocation Context</em>'.
	 * @see de.uka.ipd.sdq.pcm.allocation.AllocationContext#getResourceContainer_AllocationContext()
	 * @see #getAllocationContext()
	 * @generated
	 */
	EReference getAllocationContext_ResourceContainer_AllocationContext();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.allocation.AllocationContext#getAssemblyContext_AllocationContext <em>Assembly Context Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context Allocation Context</em>'.
	 * @see de.uka.ipd.sdq.pcm.allocation.AllocationContext#getAssemblyContext_AllocationContext()
	 * @see #getAllocationContext()
	 * @generated
	 */
	EReference getAllocationContext_AssemblyContext_AllocationContext();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.allocation.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see de.uka.ipd.sdq.pcm.allocation.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.allocation.Allocation#getAllocationContexts_Allocation <em>Allocation Contexts Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation Contexts Allocation</em>'.
	 * @see de.uka.ipd.sdq.pcm.allocation.Allocation#getAllocationContexts_Allocation()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_AllocationContexts_Allocation();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.allocation.Allocation#getTargetResourceEnvironment_Allocation <em>Target Resource Environment Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Resource Environment Allocation</em>'.
	 * @see de.uka.ipd.sdq.pcm.allocation.Allocation#getTargetResourceEnvironment_Allocation()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_TargetResourceEnvironment_Allocation();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.allocation.Allocation#getSystem_Allocation <em>System Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Allocation</em>'.
	 * @see de.uka.ipd.sdq.pcm.allocation.Allocation#getSystem_Allocation()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_System_Allocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AllocationFactory getAllocationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.allocation.impl.AllocationContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.allocation.impl.AllocationContextImpl
		 * @see de.uka.ipd.sdq.pcm.allocation.impl.AllocationPackageImpl#getAllocationContext()
		 * @generated
		 */
		EClass ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext();

		/**
		 * The meta object literal for the '<em><b>Resource Container Allocation Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext_ResourceContainer_AllocationContext();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Allocation Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext_AssemblyContext_AllocationContext();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.allocation.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.allocation.impl.AllocationImpl
		 * @see de.uka.ipd.sdq.pcm.allocation.impl.AllocationPackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts Allocation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION = eINSTANCE.getAllocation_AllocationContexts_Allocation();

		/**
		 * The meta object literal for the '<em><b>Target Resource Environment Allocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION = eINSTANCE.getAllocation_TargetResourceEnvironment_Allocation();

		/**
		 * The meta object literal for the '<em><b>System Allocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__SYSTEM_ALLOCATION = eINSTANCE.getAllocation_System_Allocation();

	}

} //AllocationPackage
