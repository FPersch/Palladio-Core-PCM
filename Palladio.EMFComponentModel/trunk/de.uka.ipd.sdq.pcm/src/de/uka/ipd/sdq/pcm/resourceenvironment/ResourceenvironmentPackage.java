/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourceenvironment;

import de.uka.ipd.sdq.pcm.core.entity.EntityPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentFactory
 * @model kind="package"
 * @generated
 */
public interface ResourceenvironmentPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourceenvironment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/ResourceEnvironment/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcm.resourceenvironment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceenvironmentPackage eINSTANCE = de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceEnvironmentImpl <em>Resource Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceEnvironmentImpl
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getResourceEnvironment()
	 * @generated
	 */
	int RESOURCE_ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Linkingresource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT__LINKINGRESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Resource Container Resource Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT = 1;

	/**
	 * The number of structural features of the '<em>Resource Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.LinkingResourceImpl <em>Linking Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.LinkingResourceImpl
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getLinkingResource()
	 * @generated
	 */
	int LINKING_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>To Resource Container Linking Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE__TO_RESOURCE_CONTAINER_LINKING_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Resource Container Linking Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE__FROM_RESOURCE_CONTAINER_LINKING_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Specifications Linking Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Linking Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl <em>Communication Link Resource Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Type Communication Link Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Link Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY = 1;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT = 2;

	/**
	 * The number of structural features of the '<em>Communication Link Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.LatencyImpl <em>Latency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.LatencyImpl
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getLatency()
	 * @generated
	 */
	int LATENCY = 3;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__SPECIFICATION = StoexPackage.RANDOM_VARIABLE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__EXPRESSION = StoexPackage.RANDOM_VARIABLE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_FEATURE_COUNT = StoexPackage.RANDOM_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ThroughputImpl <em>Throughput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ThroughputImpl
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getThroughput()
	 * @generated
	 */
	int THROUGHPUT = 4;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT__SPECIFICATION = StoexPackage.RANDOM_VARIABLE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT__EXPRESSION = StoexPackage.RANDOM_VARIABLE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Throughput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_FEATURE_COUNT = StoexPackage.RANDOM_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl <em>Processing Resource Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getProcessingResourceSpecification()
	 * @generated
	 */
	int PROCESSING_RESOURCE_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Processing Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__PROCESSING_RATE = 2;

	/**
	 * The number of structural features of the '<em>Processing Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ProcessingRateImpl <em>Processing Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ProcessingRateImpl
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getProcessingRate()
	 * @generated
	 */
	int PROCESSING_RATE = 6;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE__SPECIFICATION = StoexPackage.RANDOM_VARIABLE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE__EXPRESSION = StoexPackage.RANDOM_VARIABLE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Processing Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_FEATURE_COUNT = StoexPackage.RANDOM_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceContainerImpl <em>Resource Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceContainerImpl
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getResourceContainer()
	 * @generated
	 */
	int RESOURCE_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.SchedulingPolicy
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getSchedulingPolicy()
	 * @generated
	 */
	int SCHEDULING_POLICY = 8;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ResourceEnvironment <em>Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Environment</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceEnvironment
	 * @generated
	 */
	EClass getResourceEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ResourceEnvironment#getLinkingresource <em>Linkingresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linkingresource</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceEnvironment#getLinkingresource()
	 * @see #getResourceEnvironment()
	 * @generated
	 */
	EReference getResourceEnvironment_Linkingresource();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ResourceEnvironment#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Container Resource Environment</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceEnvironment#getResourceContainer_ResourceEnvironment()
	 * @see #getResourceEnvironment()
	 * @generated
	 */
	EReference getResourceEnvironment_ResourceContainer_ResourceEnvironment();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource <em>Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linking Resource</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource
	 * @generated
	 */
	EClass getLinkingResource();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getToResourceContainer_LinkingResource <em>To Resource Container Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Resource Container Linking Resource</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getToResourceContainer_LinkingResource()
	 * @see #getLinkingResource()
	 * @generated
	 */
	EReference getLinkingResource_ToResourceContainer_LinkingResource();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getFromResourceContainer_LinkingResource <em>From Resource Container Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Resource Container Linking Resource</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getFromResourceContainer_LinkingResource()
	 * @see #getLinkingResource()
	 * @generated
	 */
	EReference getLinkingResource_FromResourceContainer_LinkingResource();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication Link Resource Specifications Linking Resource</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource()
	 * @see #getLinkingResource()
	 * @generated
	 */
	EReference getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification <em>Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link Resource Specification</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification
	 * @generated
	 */
	EClass getCommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification <em>Communication Link Resource Type Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Link Resource Type Communication Link Resource Specification</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification()
	 * @see #getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification#getLinkLatency <em>Link Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Latency</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification#getLinkLatency()
	 * @see #getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourceSpecification_LinkLatency();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throughput</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification#getThroughput()
	 * @see #getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourceSpecification_Throughput();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.resourceenvironment.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.Latency
	 * @generated
	 */
	EClass getLatency();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.resourceenvironment.Throughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throughput</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.Throughput
	 * @generated
	 */
	EClass getThroughput();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification <em>Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Specification</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification
	 * @generated
	 */
	EClass getProcessingResourceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Policy</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getSchedulingPolicy()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EAttribute getProcessingResourceSpecification_SchedulingPolicy();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification <em>Active Resource Type Active Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Resource Type Active Resource Specification</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EReference getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getProcessingRate <em>Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Rate</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getProcessingRate()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EReference getProcessingResourceSpecification_ProcessingRate();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingRate <em>Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Rate</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingRate
	 * @generated
	 */
	EClass getProcessingRate();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Container</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer
	 * @generated
	 */
	EClass getResourceContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Resource Specifications Resource Container</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer#getActiveResourceSpecifications_ResourceContainer()
	 * @see #getResourceContainer()
	 * @generated
	 */
	EReference getResourceContainer_ActiveResourceSpecifications_ResourceContainer();

	/**
	 * Returns the meta object for enum '{@link de.uka.ipd.sdq.pcm.resourceenvironment.SchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Policy</em>'.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.SchedulingPolicy
	 * @generated
	 */
	EEnum getSchedulingPolicy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourceenvironmentFactory getResourceenvironmentFactory();

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
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceEnvironmentImpl <em>Resource Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceEnvironmentImpl
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getResourceEnvironment()
		 * @generated
		 */
		EClass RESOURCE_ENVIRONMENT = eINSTANCE.getResourceEnvironment();

		/**
		 * The meta object literal for the '<em><b>Linkingresource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENVIRONMENT__LINKINGRESOURCE = eINSTANCE.getResourceEnvironment_Linkingresource();

		/**
		 * The meta object literal for the '<em><b>Resource Container Resource Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT = eINSTANCE.getResourceEnvironment_ResourceContainer_ResourceEnvironment();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.LinkingResourceImpl <em>Linking Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.LinkingResourceImpl
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getLinkingResource()
		 * @generated
		 */
		EClass LINKING_RESOURCE = eINSTANCE.getLinkingResource();

		/**
		 * The meta object literal for the '<em><b>To Resource Container Linking Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKING_RESOURCE__TO_RESOURCE_CONTAINER_LINKING_RESOURCE = eINSTANCE.getLinkingResource_ToResourceContainer_LinkingResource();

		/**
		 * The meta object literal for the '<em><b>From Resource Container Linking Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKING_RESOURCE__FROM_RESOURCE_CONTAINER_LINKING_RESOURCE = eINSTANCE.getLinkingResource_FromResourceContainer_LinkingResource();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Specifications Linking Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE = eINSTANCE.getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl <em>Communication Link Resource Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getCommunicationLinkResourceSpecification()
		 * @generated
		 */
		EClass COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Type Communication Link Resource Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Link Latency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY = eINSTANCE.getCommunicationLinkResourceSpecification_LinkLatency();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT = eINSTANCE.getCommunicationLinkResourceSpecification_Throughput();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.LatencyImpl <em>Latency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.LatencyImpl
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getLatency()
		 * @generated
		 */
		EClass LATENCY = eINSTANCE.getLatency();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ThroughputImpl <em>Throughput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ThroughputImpl
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getThroughput()
		 * @generated
		 */
		EClass THROUGHPUT = eINSTANCE.getThroughput();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl <em>Processing Resource Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getProcessingResourceSpecification()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Scheduling Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY = eINSTANCE.getProcessingResourceSpecification_SchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Processing Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_SPECIFICATION__PROCESSING_RATE = eINSTANCE.getProcessingResourceSpecification_ProcessingRate();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ProcessingRateImpl <em>Processing Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ProcessingRateImpl
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getProcessingRate()
		 * @generated
		 */
		EClass PROCESSING_RATE = eINSTANCE.getProcessingRate();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceContainerImpl <em>Resource Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceContainerImpl
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getResourceContainer()
		 * @generated
		 */
		EClass RESOURCE_CONTAINER = eINSTANCE.getResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = eINSTANCE.getResourceContainer_ActiveResourceSpecifications_ResourceContainer();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.SchedulingPolicy
		 * @see de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getSchedulingPolicy()
		 * @generated
		 */
		EEnum SCHEDULING_POLICY = eINSTANCE.getSchedulingPolicy();

	}

} //ResourceenvironmentPackage
