/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fzi.se.quality.qualityannotation;

import de.fzi.se.quality.QualityPackage;

import de.fzi.se.quality.parameters.ParametersPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
 * @see de.fzi.se.quality.qualityannotation.QualityAnnotationFactory
 * @model kind="package"
 * @generated
 */
public interface QualityAnnotationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qualityannotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fzi.de/PalladioComponentModel/Quality/QualityAnnotation/0.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qualityannotation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityAnnotationPackage eINSTANCE = de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.CallParameterDeviationImpl <em>Call Parameter Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.CallParameterDeviationImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getCallParameterDeviation()
	 * @generated
	 */
	int CALL_PARAMETER_DEVIATION = 0;

	/**
	 * The feature id for the '<em><b>Parameter Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PARAMETER_DEVIATION__PARAMETER_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Internal State Influence Analysis Aggregation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PARAMETER_DEVIATION__INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION = 1;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PARAMETER_DEVIATION__MAXIMUM = 2;

	/**
	 * The number of structural features of the '<em>Call Parameter Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PARAMETER_DEVIATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.QualityAnnotationImpl <em>Quality Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getQualityAnnotation()
	 * @generated
	 */
	int QUALITY_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ANNOTATION__ID = QualityPackage.QUALITY_STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Quality Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ANNOTATION__QUALITY_REPOSITORY = QualityPackage.QUALITY_STATEMENT__QUALITY_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ANNOTATION__IS_VALID = QualityPackage.QUALITY_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For Service Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ANNOTATION__FOR_SERVICE_SPECIFICATION = QualityPackage.QUALITY_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stipulated RE Precisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ANNOTATION__STIPULATED_RE_PRECISIONS = QualityPackage.QUALITY_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Internal State Influence Analysis Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ANNOTATION__INTERNAL_STATE_INFLUENCE_ANALYSIS_RESULT = QualityPackage.QUALITY_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valid For Parameter Partitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ANNOTATION__VALID_FOR_PARAMETER_PARTITIONS = QualityPackage.QUALITY_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Quality Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ANNOTATION_FEATURE_COUNT = QualityPackage.QUALITY_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.ServiceSpecificationImpl <em>Service Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.ServiceSpecificationImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getServiceSpecification()
	 * @generated
	 */
	int SERVICE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION__CHECKSUM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION__QUALITY_ANNOTATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.RequiredElementImpl <em>Required Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.RequiredElementImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getRequiredElement()
	 * @generated
	 */
	int REQUIRED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child REs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT__CHILD_RES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent RE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT__PARENT_RE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT__PRECISION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT__QUALITY_ANNOTATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Required Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.NumberOfCallsDeviationImpl <em>Number Of Calls Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.NumberOfCallsDeviationImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getNumberOfCallsDeviation()
	 * @generated
	 */
	int NUMBER_OF_CALLS_DEVIATION = 4;

	/**
	 * The feature id for the '<em><b>Internal State Influence Analysis Aggregation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CALLS_DEVIATION__INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION = 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CALLS_DEVIATION__MAXIMUM = 1;

	/**
	 * The feature id for the '<em><b>Required Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CALLS_DEVIATION__REQUIRED_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Number Of Calls Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CALLS_DEVIATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.InternalStateInfluenceAnalysisAggregationImpl <em>Internal State Influence Analysis Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.InternalStateInfluenceAnalysisAggregationImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getInternalStateInfluenceAnalysisAggregation()
	 * @generated
	 */
	int INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION__QUALITY_ANNOTATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Parameter Deviation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION__CALL_PARAMETER_DEVIATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION__NUMBER_OF_CALLS_DEVIATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Internal State Influence Analysis Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.REPrecisionImpl <em>RE Precision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.REPrecisionImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getREPrecision()
	 * @generated
	 */
	int RE_PRECISION = 6;

	/**
	 * The feature id for the '<em><b>Default Precision Number Of Calls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PRECISION__DEFAULT_PRECISION_NUMBER_OF_CALLS = 0;

	/**
	 * The feature id for the '<em><b>Default Precision Call Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PRECISION__DEFAULT_PRECISION_CALL_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Required Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PRECISION__REQUIRED_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>RE Precision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PRECISION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PrecisionImpl <em>Precision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PrecisionImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPrecision()
	 * @generated
	 */
	int PRECISION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECISION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The number of structural features of the '<em>Precision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECISION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMParameterPartitionImpl <em>PCM Parameter Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMParameterPartitionImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMParameterPartition()
	 * @generated
	 */
	int PCM_PARAMETER_PARTITION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER_PARTITION__ID = ParametersPackage.PARAMETER_PARTITION__ID;

	/**
	 * The feature id for the '<em><b>Validated Setting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER_PARTITION__VALIDATED_SETTING = ParametersPackage.PARAMETER_PARTITION__VALIDATED_SETTING;

	/**
	 * The feature id for the '<em><b>Characerised Parameter Partitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER_PARTITION__CHARACERISED_PARAMETER_PARTITIONS = ParametersPackage.PARAMETER_PARTITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER_PARTITION__PARAMETER_REFERENCE = ParametersPackage.PARAMETER_PARTITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCM Parameter Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER_PARTITION_FEATURE_COUNT = ParametersPackage.PARAMETER_PARTITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionImpl <em>Characterised PCM Parameter Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getCharacterisedPCMParameterPartition()
	 * @generated
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>For Characterisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION__FOR_CHARACTERISATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pcm Parameter Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION__PCM_PARAMETER_PARTITION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Characterised PCM Parameter Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionIntervalImpl <em>Characterised PCM Parameter Partition Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionIntervalImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getCharacterisedPCMParameterPartitionInterval()
	 * @generated
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL__ID = CHARACTERISED_PCM_PARAMETER_PARTITION__ID;

	/**
	 * The feature id for the '<em><b>For Characterisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL__FOR_CHARACTERISATION = CHARACTERISED_PCM_PARAMETER_PARTITION__FOR_CHARACTERISATION;

	/**
	 * The feature id for the '<em><b>Pcm Parameter Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL__PCM_PARAMETER_PARTITION = CHARACTERISED_PCM_PARAMETER_PARTITION__PCM_PARAMETER_PARTITION;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL__FROM = CHARACTERISED_PCM_PARAMETER_PARTITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL__TO = CHARACTERISED_PCM_PARAMETER_PARTITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Characterised PCM Parameter Partition Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL_FEATURE_COUNT = CHARACTERISED_PCM_PARAMETER_PARTITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionRangeImpl <em>Characterised PCM Parameter Partition Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionRangeImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getCharacterisedPCMParameterPartitionRange()
	 * @generated
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__ID = CHARACTERISED_PCM_PARAMETER_PARTITION__ID;

	/**
	 * The feature id for the '<em><b>For Characterisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__FOR_CHARACTERISATION = CHARACTERISED_PCM_PARAMETER_PARTITION__FOR_CHARACTERISATION;

	/**
	 * The feature id for the '<em><b>Pcm Parameter Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__PCM_PARAMETER_PARTITION = CHARACTERISED_PCM_PARAMETER_PARTITION__PCM_PARAMETER_PARTITION;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__VALUES = CHARACTERISED_PCM_PARAMETER_PARTITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characterised PCM Parameter Partition Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE_FEATURE_COUNT = CHARACTERISED_PCM_PARAMETER_PARTITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.ExactlyAsSpecifiedPrecisionImpl <em>Exactly As Specified Precision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.ExactlyAsSpecifiedPrecisionImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getExactlyAsSpecifiedPrecision()
	 * @generated
	 */
	int EXACTLY_AS_SPECIFIED_PRECISION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_AS_SPECIFIED_PRECISION__ID = PRECISION__ID;

	/**
	 * The number of structural features of the '<em>Exactly As Specified Precision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_AS_SPECIFIED_PRECISION_FEATURE_COUNT = PRECISION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.LimitedDeviationPrecisionImpl <em>Limited Deviation Precision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.LimitedDeviationPrecisionImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getLimitedDeviationPrecision()
	 * @generated
	 */
	int LIMITED_DEVIATION_PRECISION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITED_DEVIATION_PRECISION__ID = PRECISION__ID;

	/**
	 * The feature id for the '<em><b>Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITED_DEVIATION_PRECISION__ABSOLUTE = PRECISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITED_DEVIATION_PRECISION__RELATIVE = PRECISION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Limited Deviation Precision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITED_DEVIATION_PRECISION_FEATURE_COUNT = PRECISION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.NoPrecisionImpl <em>No Precision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.NoPrecisionImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getNoPrecision()
	 * @generated
	 */
	int NO_PRECISION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PRECISION__ID = PRECISION__ID;

	/**
	 * The number of structural features of the '<em>No Precision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PRECISION_FEATURE_COUNT = PRECISION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREImpl <em>PCMRE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMREImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMRE()
	 * @generated
	 */
	int PCMRE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE__ID = REQUIRED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE__NUMBER_OF_CALLS_DEVIATION = REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Child REs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE__CHILD_RES = REQUIRED_ELEMENT__CHILD_RES;

	/**
	 * The feature id for the '<em><b>Parent RE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE__PARENT_RE = REQUIRED_ELEMENT__PARENT_RE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE__PRECISION = REQUIRED_ELEMENT__PRECISION;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE__QUALITY_ANNOTATION = REQUIRED_ELEMENT__QUALITY_ANNOTATION;

	/**
	 * The number of structural features of the '<em>PCMRE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_FEATURE_COUNT = REQUIRED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMRECategoryImpl <em>PCMRE Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMRECategoryImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMRECategory()
	 * @generated
	 */
	int PCMRE_CATEGORY = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_CATEGORY__ID = PCMRE__ID;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_CATEGORY__NUMBER_OF_CALLS_DEVIATION = PCMRE__NUMBER_OF_CALLS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Child REs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_CATEGORY__CHILD_RES = PCMRE__CHILD_RES;

	/**
	 * The feature id for the '<em><b>Parent RE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_CATEGORY__PARENT_RE = PCMRE__PARENT_RE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_CATEGORY__PRECISION = PCMRE__PRECISION;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_CATEGORY__QUALITY_ANNOTATION = PCMRE__QUALITY_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_CATEGORY__CATEGORY = PCMRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCMRE Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_CATEGORY_FEATURE_COUNT = PCMRE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREInterfaceImpl <em>PCMRE Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMREInterfaceImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMREInterface()
	 * @generated
	 */
	int PCMRE_INTERFACE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_INTERFACE__ID = PCMRE__ID;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_INTERFACE__NUMBER_OF_CALLS_DEVIATION = PCMRE__NUMBER_OF_CALLS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Child REs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_INTERFACE__CHILD_RES = PCMRE__CHILD_RES;

	/**
	 * The feature id for the '<em><b>Parent RE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_INTERFACE__PARENT_RE = PCMRE__PARENT_RE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_INTERFACE__PRECISION = PCMRE__PRECISION;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_INTERFACE__QUALITY_ANNOTATION = PCMRE__QUALITY_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_INTERFACE__INTERFACE = PCMRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCMRE Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_INTERFACE_FEATURE_COUNT = PCMRE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMRERoleImpl <em>PCMRE Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMRERoleImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMRERole()
	 * @generated
	 */
	int PCMRE_ROLE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_ROLE__ID = PCMRE__ID;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_ROLE__NUMBER_OF_CALLS_DEVIATION = PCMRE__NUMBER_OF_CALLS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Child REs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_ROLE__CHILD_RES = PCMRE__CHILD_RES;

	/**
	 * The feature id for the '<em><b>Parent RE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_ROLE__PARENT_RE = PCMRE__PARENT_RE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_ROLE__PRECISION = PCMRE__PRECISION;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_ROLE__QUALITY_ANNOTATION = PCMRE__QUALITY_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_ROLE__ROLE = PCMRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCMRE Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_ROLE_FEATURE_COUNT = PCMRE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMRESignatureImpl <em>PCMRE Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMRESignatureImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMRESignature()
	 * @generated
	 */
	int PCMRE_SIGNATURE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_SIGNATURE__ID = PCMRE__ID;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_SIGNATURE__NUMBER_OF_CALLS_DEVIATION = PCMRE__NUMBER_OF_CALLS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Child REs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_SIGNATURE__CHILD_RES = PCMRE__CHILD_RES;

	/**
	 * The feature id for the '<em><b>Parent RE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_SIGNATURE__PARENT_RE = PCMRE__PARENT_RE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_SIGNATURE__PRECISION = PCMRE__PRECISION;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_SIGNATURE__QUALITY_ANNOTATION = PCMRE__QUALITY_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_SIGNATURE__SIGNATURE = PCMRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCMRE Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_SIGNATURE_FEATURE_COUNT = PCMRE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMServiceSpecificationImpl <em>PCM Service Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMServiceSpecificationImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMServiceSpecification()
	 * @generated
	 */
	int PCM_SERVICE_SPECIFICATION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SERVICE_SPECIFICATION__ID = SERVICE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SERVICE_SPECIFICATION__CHECKSUM = SERVICE_SPECIFICATION__CHECKSUM;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SERVICE_SPECIFICATION__QUALITY_ANNOTATION = SERVICE_SPECIFICATION__QUALITY_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Resource Demanding SEFF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SERVICE_SPECIFICATION__RESOURCE_DEMANDING_SEFF = SERVICE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Service Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SERVICE_SPECIFICATION_FEATURE_COUNT = SERVICE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREResourceInterfaceImpl <em>PCMRE Resource Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMREResourceInterfaceImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMREResourceInterface()
	 * @generated
	 */
	int PCMRE_RESOURCE_INTERFACE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_INTERFACE__ID = PCMRE__ID;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_INTERFACE__NUMBER_OF_CALLS_DEVIATION = PCMRE__NUMBER_OF_CALLS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Child REs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_INTERFACE__CHILD_RES = PCMRE__CHILD_RES;

	/**
	 * The feature id for the '<em><b>Parent RE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_INTERFACE__PARENT_RE = PCMRE__PARENT_RE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_INTERFACE__PRECISION = PCMRE__PRECISION;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_INTERFACE__QUALITY_ANNOTATION = PCMRE__QUALITY_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Resource Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_INTERFACE__RESOURCE_INTERFACE = PCMRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCMRE Resource Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_INTERFACE_FEATURE_COUNT = PCMRE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREResourceSignatureImpl <em>PCMRE Resource Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMREResourceSignatureImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMREResourceSignature()
	 * @generated
	 */
	int PCMRE_RESOURCE_SIGNATURE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_SIGNATURE__ID = PCMRE__ID;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_SIGNATURE__NUMBER_OF_CALLS_DEVIATION = PCMRE__NUMBER_OF_CALLS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Child REs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_SIGNATURE__CHILD_RES = PCMRE__CHILD_RES;

	/**
	 * The feature id for the '<em><b>Parent RE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_SIGNATURE__PARENT_RE = PCMRE__PARENT_RE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_SIGNATURE__PRECISION = PCMRE__PRECISION;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_SIGNATURE__QUALITY_ANNOTATION = PCMRE__QUALITY_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Resource Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_SIGNATURE__RESOURCE_SIGNATURE = PCMRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCMRE Resource Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_SIGNATURE_FEATURE_COUNT = PCMRE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREResourceImpl <em>PCMRE Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMREResourceImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMREResource()
	 * @generated
	 */
	int PCMRE_RESOURCE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE__ID = PCMRE__ID;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE__NUMBER_OF_CALLS_DEVIATION = PCMRE__NUMBER_OF_CALLS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Child REs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE__CHILD_RES = PCMRE__CHILD_RES;

	/**
	 * The feature id for the '<em><b>Parent RE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE__PARENT_RE = PCMRE__PARENT_RE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE__PRECISION = PCMRE__PRECISION;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE__QUALITY_ANNOTATION = PCMRE__QUALITY_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Processing Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE__PROCESSING_RESOURCE_TYPE = PCMRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCMRE Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_FEATURE_COUNT = PCMRE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREResourceRoleImpl <em>PCMRE Resource Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.impl.PCMREResourceRoleImpl
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMREResourceRole()
	 * @generated
	 */
	int PCMRE_RESOURCE_ROLE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_ROLE__ID = PCMRE__ID;

	/**
	 * The feature id for the '<em><b>Number Of Calls Deviation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_ROLE__NUMBER_OF_CALLS_DEVIATION = PCMRE__NUMBER_OF_CALLS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Child REs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_ROLE__CHILD_RES = PCMRE__CHILD_RES;

	/**
	 * The feature id for the '<em><b>Parent RE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_ROLE__PARENT_RE = PCMRE__PARENT_RE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_ROLE__PRECISION = PCMRE__PRECISION;

	/**
	 * The feature id for the '<em><b>Quality Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_ROLE__QUALITY_ANNOTATION = PCMRE__QUALITY_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_ROLE__RESOURCE_ROLE = PCMRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCMRE Resource Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMRE_RESOURCE_ROLE_FEATURE_COUNT = PCMRE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fzi.se.quality.qualityannotation.PCMRERequestCategory <em>PCMRE Request Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fzi.se.quality.qualityannotation.PCMRERequestCategory
	 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMRERequestCategory()
	 * @generated
	 */
	int PCMRE_REQUEST_CATEGORY = 25;


	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.CallParameterDeviation <em>Call Parameter Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Parameter Deviation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CallParameterDeviation
	 * @generated
	 */
	EClass getCallParameterDeviation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.se.quality.qualityannotation.CallParameterDeviation#getParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Reference</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CallParameterDeviation#getParameterReference()
	 * @see #getCallParameterDeviation()
	 * @generated
	 */
	EReference getCallParameterDeviation_ParameterReference();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.se.quality.qualityannotation.CallParameterDeviation#getInternalStateInfluenceAnalysisAggregation <em>Internal State Influence Analysis Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Internal State Influence Analysis Aggregation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CallParameterDeviation#getInternalStateInfluenceAnalysisAggregation()
	 * @see #getCallParameterDeviation()
	 * @generated
	 */
	EReference getCallParameterDeviation_InternalStateInfluenceAnalysisAggregation();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.se.quality.qualityannotation.CallParameterDeviation#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CallParameterDeviation#getMaximum()
	 * @see #getCallParameterDeviation()
	 * @generated
	 */
	EAttribute getCallParameterDeviation_Maximum();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.QualityAnnotation <em>Quality Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Annotation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.QualityAnnotation
	 * @generated
	 */
	EClass getQualityAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.se.quality.qualityannotation.QualityAnnotation#isValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see de.fzi.se.quality.qualityannotation.QualityAnnotation#isValid()
	 * @see #getQualityAnnotation()
	 * @generated
	 */
	EAttribute getQualityAnnotation_IsValid();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.se.quality.qualityannotation.QualityAnnotation#getForServiceSpecification <em>For Service Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Service Specification</em>'.
	 * @see de.fzi.se.quality.qualityannotation.QualityAnnotation#getForServiceSpecification()
	 * @see #getQualityAnnotation()
	 * @generated
	 */
	EReference getQualityAnnotation_ForServiceSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.se.quality.qualityannotation.QualityAnnotation#getStipulatedREPrecisions <em>Stipulated RE Precisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stipulated RE Precisions</em>'.
	 * @see de.fzi.se.quality.qualityannotation.QualityAnnotation#getStipulatedREPrecisions()
	 * @see #getQualityAnnotation()
	 * @generated
	 */
	EReference getQualityAnnotation_StipulatedREPrecisions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.se.quality.qualityannotation.QualityAnnotation#getInternalStateInfluenceAnalysisResult <em>Internal State Influence Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal State Influence Analysis Result</em>'.
	 * @see de.fzi.se.quality.qualityannotation.QualityAnnotation#getInternalStateInfluenceAnalysisResult()
	 * @see #getQualityAnnotation()
	 * @generated
	 */
	EReference getQualityAnnotation_InternalStateInfluenceAnalysisResult();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.se.quality.qualityannotation.QualityAnnotation#getValidForParameterPartitions <em>Valid For Parameter Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valid For Parameter Partitions</em>'.
	 * @see de.fzi.se.quality.qualityannotation.QualityAnnotation#getValidForParameterPartitions()
	 * @see #getQualityAnnotation()
	 * @generated
	 */
	EReference getQualityAnnotation_ValidForParameterPartitions();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.ServiceSpecification <em>Service Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Specification</em>'.
	 * @see de.fzi.se.quality.qualityannotation.ServiceSpecification
	 * @generated
	 */
	EClass getServiceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.se.quality.qualityannotation.ServiceSpecification#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum</em>'.
	 * @see de.fzi.se.quality.qualityannotation.ServiceSpecification#getChecksum()
	 * @see #getServiceSpecification()
	 * @generated
	 */
	EAttribute getServiceSpecification_Checksum();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.se.quality.qualityannotation.ServiceSpecification#getQualityAnnotation <em>Quality Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Quality Annotation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.ServiceSpecification#getQualityAnnotation()
	 * @see #getServiceSpecification()
	 * @generated
	 */
	EReference getServiceSpecification_QualityAnnotation();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.RequiredElement <em>Required Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Element</em>'.
	 * @see de.fzi.se.quality.qualityannotation.RequiredElement
	 * @generated
	 */
	EClass getRequiredElement();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.se.quality.qualityannotation.RequiredElement#getNumberOfCallsDeviation <em>Number Of Calls Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Number Of Calls Deviation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.RequiredElement#getNumberOfCallsDeviation()
	 * @see #getRequiredElement()
	 * @generated
	 */
	EReference getRequiredElement_NumberOfCallsDeviation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.se.quality.qualityannotation.RequiredElement#getChildREs <em>Child REs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child REs</em>'.
	 * @see de.fzi.se.quality.qualityannotation.RequiredElement#getChildREs()
	 * @see #getRequiredElement()
	 * @generated
	 */
	EReference getRequiredElement_ChildREs();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.se.quality.qualityannotation.RequiredElement#getParentRE <em>Parent RE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent RE</em>'.
	 * @see de.fzi.se.quality.qualityannotation.RequiredElement#getParentRE()
	 * @see #getRequiredElement()
	 * @generated
	 */
	EReference getRequiredElement_ParentRE();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.se.quality.qualityannotation.RequiredElement#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precision</em>'.
	 * @see de.fzi.se.quality.qualityannotation.RequiredElement#getPrecision()
	 * @see #getRequiredElement()
	 * @generated
	 */
	EReference getRequiredElement_Precision();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.se.quality.qualityannotation.RequiredElement#getQualityAnnotation <em>Quality Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Quality Annotation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.RequiredElement#getQualityAnnotation()
	 * @see #getRequiredElement()
	 * @generated
	 */
	EReference getRequiredElement_QualityAnnotation();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.NumberOfCallsDeviation <em>Number Of Calls Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Calls Deviation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.NumberOfCallsDeviation
	 * @generated
	 */
	EClass getNumberOfCallsDeviation();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.se.quality.qualityannotation.NumberOfCallsDeviation#getInternalStateInfluenceAnalysisAggregation <em>Internal State Influence Analysis Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Internal State Influence Analysis Aggregation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.NumberOfCallsDeviation#getInternalStateInfluenceAnalysisAggregation()
	 * @see #getNumberOfCallsDeviation()
	 * @generated
	 */
	EReference getNumberOfCallsDeviation_InternalStateInfluenceAnalysisAggregation();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.se.quality.qualityannotation.NumberOfCallsDeviation#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see de.fzi.se.quality.qualityannotation.NumberOfCallsDeviation#getMaximum()
	 * @see #getNumberOfCallsDeviation()
	 * @generated
	 */
	EAttribute getNumberOfCallsDeviation_Maximum();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.se.quality.qualityannotation.NumberOfCallsDeviation#getRequiredElement <em>Required Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Element</em>'.
	 * @see de.fzi.se.quality.qualityannotation.NumberOfCallsDeviation#getRequiredElement()
	 * @see #getNumberOfCallsDeviation()
	 * @generated
	 */
	EReference getNumberOfCallsDeviation_RequiredElement();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation <em>Internal State Influence Analysis Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal State Influence Analysis Aggregation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation
	 * @generated
	 */
	EClass getInternalStateInfluenceAnalysisAggregation();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.se.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getQualityAnnotation <em>Quality Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Quality Annotation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getQualityAnnotation()
	 * @see #getInternalStateInfluenceAnalysisAggregation()
	 * @generated
	 */
	EReference getInternalStateInfluenceAnalysisAggregation_QualityAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.se.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getCallParameterDeviation <em>Call Parameter Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call Parameter Deviation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getCallParameterDeviation()
	 * @see #getInternalStateInfluenceAnalysisAggregation()
	 * @generated
	 */
	EReference getInternalStateInfluenceAnalysisAggregation_CallParameterDeviation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.se.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getNumberOfCallsDeviation <em>Number Of Calls Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Number Of Calls Deviation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getNumberOfCallsDeviation()
	 * @see #getInternalStateInfluenceAnalysisAggregation()
	 * @generated
	 */
	EReference getInternalStateInfluenceAnalysisAggregation_NumberOfCallsDeviation();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.REPrecision <em>RE Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RE Precision</em>'.
	 * @see de.fzi.se.quality.qualityannotation.REPrecision
	 * @generated
	 */
	EClass getREPrecision();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.se.quality.qualityannotation.REPrecision#getDefaultPrecisionNumberOfCalls <em>Default Precision Number Of Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Precision Number Of Calls</em>'.
	 * @see de.fzi.se.quality.qualityannotation.REPrecision#getDefaultPrecisionNumberOfCalls()
	 * @see #getREPrecision()
	 * @generated
	 */
	EReference getREPrecision_DefaultPrecisionNumberOfCalls();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.se.quality.qualityannotation.REPrecision#getDefaultPrecisionCallParameter <em>Default Precision Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Precision Call Parameter</em>'.
	 * @see de.fzi.se.quality.qualityannotation.REPrecision#getDefaultPrecisionCallParameter()
	 * @see #getREPrecision()
	 * @generated
	 */
	EReference getREPrecision_DefaultPrecisionCallParameter();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.se.quality.qualityannotation.REPrecision#getRequiredElement <em>Required Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Required Element</em>'.
	 * @see de.fzi.se.quality.qualityannotation.REPrecision#getRequiredElement()
	 * @see #getREPrecision()
	 * @generated
	 */
	EReference getREPrecision_RequiredElement();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.Precision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precision</em>'.
	 * @see de.fzi.se.quality.qualityannotation.Precision
	 * @generated
	 */
	EClass getPrecision();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMParameterPartition <em>PCM Parameter Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Parameter Partition</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMParameterPartition
	 * @generated
	 */
	EClass getPCMParameterPartition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.se.quality.qualityannotation.PCMParameterPartition#getCharacerisedParameterPartitions <em>Characerised Parameter Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characerised Parameter Partitions</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMParameterPartition#getCharacerisedParameterPartitions()
	 * @see #getPCMParameterPartition()
	 * @generated
	 */
	EReference getPCMParameterPartition_CharacerisedParameterPartitions();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.se.quality.qualityannotation.PCMParameterPartition#getParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Reference</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMParameterPartition#getParameterReference()
	 * @see #getPCMParameterPartition()
	 * @generated
	 */
	EReference getPCMParameterPartition_ParameterReference();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartition <em>Characterised PCM Parameter Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characterised PCM Parameter Partition</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartition
	 * @generated
	 */
	EClass getCharacterisedPCMParameterPartition();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartition#getForCharacterisation <em>For Characterisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Characterisation</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartition#getForCharacterisation()
	 * @see #getCharacterisedPCMParameterPartition()
	 * @generated
	 */
	EAttribute getCharacterisedPCMParameterPartition_ForCharacterisation();

	/**
	 * Returns the meta object for the container reference '{@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartition#getPcmParameterPartition <em>Pcm Parameter Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pcm Parameter Partition</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartition#getPcmParameterPartition()
	 * @see #getCharacterisedPCMParameterPartition()
	 * @generated
	 */
	EReference getCharacterisedPCMParameterPartition_PcmParameterPartition();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionInterval <em>Characterised PCM Parameter Partition Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characterised PCM Parameter Partition Interval</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionInterval
	 * @generated
	 */
	EClass getCharacterisedPCMParameterPartitionInterval();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionInterval#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionInterval#getFrom()
	 * @see #getCharacterisedPCMParameterPartitionInterval()
	 * @generated
	 */
	EReference getCharacterisedPCMParameterPartitionInterval_From();

	/**
	 * Returns the meta object for the containment reference '{@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionInterval#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionInterval#getTo()
	 * @see #getCharacterisedPCMParameterPartitionInterval()
	 * @generated
	 */
	EReference getCharacterisedPCMParameterPartitionInterval_To();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionRange <em>Characterised PCM Parameter Partition Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characterised PCM Parameter Partition Range</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionRange
	 * @generated
	 */
	EClass getCharacterisedPCMParameterPartitionRange();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionRange#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionRange#getValues()
	 * @see #getCharacterisedPCMParameterPartitionRange()
	 * @generated
	 */
	EReference getCharacterisedPCMParameterPartitionRange_Values();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.ExactlyAsSpecifiedPrecision <em>Exactly As Specified Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exactly As Specified Precision</em>'.
	 * @see de.fzi.se.quality.qualityannotation.ExactlyAsSpecifiedPrecision
	 * @generated
	 */
	EClass getExactlyAsSpecifiedPrecision();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.LimitedDeviationPrecision <em>Limited Deviation Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limited Deviation Precision</em>'.
	 * @see de.fzi.se.quality.qualityannotation.LimitedDeviationPrecision
	 * @generated
	 */
	EClass getLimitedDeviationPrecision();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.se.quality.qualityannotation.LimitedDeviationPrecision#getAbsolute <em>Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute</em>'.
	 * @see de.fzi.se.quality.qualityannotation.LimitedDeviationPrecision#getAbsolute()
	 * @see #getLimitedDeviationPrecision()
	 * @generated
	 */
	EAttribute getLimitedDeviationPrecision_Absolute();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.se.quality.qualityannotation.LimitedDeviationPrecision#getRelative <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative</em>'.
	 * @see de.fzi.se.quality.qualityannotation.LimitedDeviationPrecision#getRelative()
	 * @see #getLimitedDeviationPrecision()
	 * @generated
	 */
	EAttribute getLimitedDeviationPrecision_Relative();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.NoPrecision <em>No Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Precision</em>'.
	 * @see de.fzi.se.quality.qualityannotation.NoPrecision
	 * @generated
	 */
	EClass getNoPrecision();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMRECategory <em>PCMRE Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCMRE Category</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMRECategory
	 * @generated
	 */
	EClass getPCMRECategory();

	/**
	 * Returns the meta object for the attribute '{@link de.fzi.se.quality.qualityannotation.PCMRECategory#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMRECategory#getCategory()
	 * @see #getPCMRECategory()
	 * @generated
	 */
	EAttribute getPCMRECategory_Category();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMRE <em>PCMRE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCMRE</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMRE
	 * @generated
	 */
	EClass getPCMRE();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMREInterface <em>PCMRE Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCMRE Interface</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMREInterface
	 * @generated
	 */
	EClass getPCMREInterface();

	/**
	 * Returns the meta object for the reference '{@link de.fzi.se.quality.qualityannotation.PCMREInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMREInterface#getInterface()
	 * @see #getPCMREInterface()
	 * @generated
	 */
	EReference getPCMREInterface_Interface();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMRERole <em>PCMRE Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCMRE Role</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMRERole
	 * @generated
	 */
	EClass getPCMRERole();

	/**
	 * Returns the meta object for the reference '{@link de.fzi.se.quality.qualityannotation.PCMRERole#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMRERole#getRole()
	 * @see #getPCMRERole()
	 * @generated
	 */
	EReference getPCMRERole_Role();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMRESignature <em>PCMRE Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCMRE Signature</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMRESignature
	 * @generated
	 */
	EClass getPCMRESignature();

	/**
	 * Returns the meta object for the reference '{@link de.fzi.se.quality.qualityannotation.PCMRESignature#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMRESignature#getSignature()
	 * @see #getPCMRESignature()
	 * @generated
	 */
	EReference getPCMRESignature_Signature();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMServiceSpecification <em>PCM Service Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Service Specification</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMServiceSpecification
	 * @generated
	 */
	EClass getPCMServiceSpecification();

	/**
	 * Returns the meta object for the reference '{@link de.fzi.se.quality.qualityannotation.PCMServiceSpecification#getResourceDemandingSEFF <em>Resource Demanding SEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Demanding SEFF</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMServiceSpecification#getResourceDemandingSEFF()
	 * @see #getPCMServiceSpecification()
	 * @generated
	 */
	EReference getPCMServiceSpecification_ResourceDemandingSEFF();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMREResourceInterface <em>PCMRE Resource Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCMRE Resource Interface</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMREResourceInterface
	 * @generated
	 */
	EClass getPCMREResourceInterface();

	/**
	 * Returns the meta object for the reference '{@link de.fzi.se.quality.qualityannotation.PCMREResourceInterface#getResourceInterface <em>Resource Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Interface</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMREResourceInterface#getResourceInterface()
	 * @see #getPCMREResourceInterface()
	 * @generated
	 */
	EReference getPCMREResourceInterface_ResourceInterface();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMREResourceSignature <em>PCMRE Resource Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCMRE Resource Signature</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMREResourceSignature
	 * @generated
	 */
	EClass getPCMREResourceSignature();

	/**
	 * Returns the meta object for the reference '{@link de.fzi.se.quality.qualityannotation.PCMREResourceSignature#getResourceSignature <em>Resource Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Signature</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMREResourceSignature#getResourceSignature()
	 * @see #getPCMREResourceSignature()
	 * @generated
	 */
	EReference getPCMREResourceSignature_ResourceSignature();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMREResource <em>PCMRE Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCMRE Resource</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMREResource
	 * @generated
	 */
	EClass getPCMREResource();

	/**
	 * Returns the meta object for the reference '{@link de.fzi.se.quality.qualityannotation.PCMREResource#getProcessingResourceType <em>Processing Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processing Resource Type</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMREResource#getProcessingResourceType()
	 * @see #getPCMREResource()
	 * @generated
	 */
	EReference getPCMREResource_ProcessingResourceType();

	/**
	 * Returns the meta object for class '{@link de.fzi.se.quality.qualityannotation.PCMREResourceRole <em>PCMRE Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCMRE Resource Role</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMREResourceRole
	 * @generated
	 */
	EClass getPCMREResourceRole();

	/**
	 * Returns the meta object for the reference '{@link de.fzi.se.quality.qualityannotation.PCMREResourceRole#getResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Role</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMREResourceRole#getResourceRole()
	 * @see #getPCMREResourceRole()
	 * @generated
	 */
	EReference getPCMREResourceRole_ResourceRole();

	/**
	 * Returns the meta object for enum '{@link de.fzi.se.quality.qualityannotation.PCMRERequestCategory <em>PCMRE Request Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PCMRE Request Category</em>'.
	 * @see de.fzi.se.quality.qualityannotation.PCMRERequestCategory
	 * @generated
	 */
	EEnum getPCMRERequestCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QualityAnnotationFactory getQualityAnnotationFactory();

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
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.CallParameterDeviationImpl <em>Call Parameter Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.CallParameterDeviationImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getCallParameterDeviation()
		 * @generated
		 */
		EClass CALL_PARAMETER_DEVIATION = eINSTANCE.getCallParameterDeviation();

		/**
		 * The meta object literal for the '<em><b>Parameter Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_PARAMETER_DEVIATION__PARAMETER_REFERENCE = eINSTANCE.getCallParameterDeviation_ParameterReference();

		/**
		 * The meta object literal for the '<em><b>Internal State Influence Analysis Aggregation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_PARAMETER_DEVIATION__INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION = eINSTANCE.getCallParameterDeviation_InternalStateInfluenceAnalysisAggregation();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_PARAMETER_DEVIATION__MAXIMUM = eINSTANCE.getCallParameterDeviation_Maximum();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.QualityAnnotationImpl <em>Quality Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getQualityAnnotation()
		 * @generated
		 */
		EClass QUALITY_ANNOTATION = eINSTANCE.getQualityAnnotation();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_ANNOTATION__IS_VALID = eINSTANCE.getQualityAnnotation_IsValid();

		/**
		 * The meta object literal for the '<em><b>For Service Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ANNOTATION__FOR_SERVICE_SPECIFICATION = eINSTANCE.getQualityAnnotation_ForServiceSpecification();

		/**
		 * The meta object literal for the '<em><b>Stipulated RE Precisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ANNOTATION__STIPULATED_RE_PRECISIONS = eINSTANCE.getQualityAnnotation_StipulatedREPrecisions();

		/**
		 * The meta object literal for the '<em><b>Internal State Influence Analysis Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ANNOTATION__INTERNAL_STATE_INFLUENCE_ANALYSIS_RESULT = eINSTANCE.getQualityAnnotation_InternalStateInfluenceAnalysisResult();

		/**
		 * The meta object literal for the '<em><b>Valid For Parameter Partitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ANNOTATION__VALID_FOR_PARAMETER_PARTITIONS = eINSTANCE.getQualityAnnotation_ValidForParameterPartitions();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.ServiceSpecificationImpl <em>Service Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.ServiceSpecificationImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getServiceSpecification()
		 * @generated
		 */
		EClass SERVICE_SPECIFICATION = eINSTANCE.getServiceSpecification();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SPECIFICATION__CHECKSUM = eINSTANCE.getServiceSpecification_Checksum();

		/**
		 * The meta object literal for the '<em><b>Quality Annotation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPECIFICATION__QUALITY_ANNOTATION = eINSTANCE.getServiceSpecification_QualityAnnotation();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.RequiredElementImpl <em>Required Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.RequiredElementImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getRequiredElement()
		 * @generated
		 */
		EClass REQUIRED_ELEMENT = eINSTANCE.getRequiredElement();

		/**
		 * The meta object literal for the '<em><b>Number Of Calls Deviation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION = eINSTANCE.getRequiredElement_NumberOfCallsDeviation();

		/**
		 * The meta object literal for the '<em><b>Child REs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT__CHILD_RES = eINSTANCE.getRequiredElement_ChildREs();

		/**
		 * The meta object literal for the '<em><b>Parent RE</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT__PARENT_RE = eINSTANCE.getRequiredElement_ParentRE();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT__PRECISION = eINSTANCE.getRequiredElement_Precision();

		/**
		 * The meta object literal for the '<em><b>Quality Annotation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT__QUALITY_ANNOTATION = eINSTANCE.getRequiredElement_QualityAnnotation();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.NumberOfCallsDeviationImpl <em>Number Of Calls Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.NumberOfCallsDeviationImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getNumberOfCallsDeviation()
		 * @generated
		 */
		EClass NUMBER_OF_CALLS_DEVIATION = eINSTANCE.getNumberOfCallsDeviation();

		/**
		 * The meta object literal for the '<em><b>Internal State Influence Analysis Aggregation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_OF_CALLS_DEVIATION__INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION = eINSTANCE.getNumberOfCallsDeviation_InternalStateInfluenceAnalysisAggregation();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_OF_CALLS_DEVIATION__MAXIMUM = eINSTANCE.getNumberOfCallsDeviation_Maximum();

		/**
		 * The meta object literal for the '<em><b>Required Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_OF_CALLS_DEVIATION__REQUIRED_ELEMENT = eINSTANCE.getNumberOfCallsDeviation_RequiredElement();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.InternalStateInfluenceAnalysisAggregationImpl <em>Internal State Influence Analysis Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.InternalStateInfluenceAnalysisAggregationImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getInternalStateInfluenceAnalysisAggregation()
		 * @generated
		 */
		EClass INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION = eINSTANCE.getInternalStateInfluenceAnalysisAggregation();

		/**
		 * The meta object literal for the '<em><b>Quality Annotation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION__QUALITY_ANNOTATION = eINSTANCE.getInternalStateInfluenceAnalysisAggregation_QualityAnnotation();

		/**
		 * The meta object literal for the '<em><b>Call Parameter Deviation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION__CALL_PARAMETER_DEVIATION = eINSTANCE.getInternalStateInfluenceAnalysisAggregation_CallParameterDeviation();

		/**
		 * The meta object literal for the '<em><b>Number Of Calls Deviation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION__NUMBER_OF_CALLS_DEVIATION = eINSTANCE.getInternalStateInfluenceAnalysisAggregation_NumberOfCallsDeviation();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.REPrecisionImpl <em>RE Precision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.REPrecisionImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getREPrecision()
		 * @generated
		 */
		EClass RE_PRECISION = eINSTANCE.getREPrecision();

		/**
		 * The meta object literal for the '<em><b>Default Precision Number Of Calls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RE_PRECISION__DEFAULT_PRECISION_NUMBER_OF_CALLS = eINSTANCE.getREPrecision_DefaultPrecisionNumberOfCalls();

		/**
		 * The meta object literal for the '<em><b>Default Precision Call Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RE_PRECISION__DEFAULT_PRECISION_CALL_PARAMETER = eINSTANCE.getREPrecision_DefaultPrecisionCallParameter();

		/**
		 * The meta object literal for the '<em><b>Required Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RE_PRECISION__REQUIRED_ELEMENT = eINSTANCE.getREPrecision_RequiredElement();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PrecisionImpl <em>Precision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PrecisionImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPrecision()
		 * @generated
		 */
		EClass PRECISION = eINSTANCE.getPrecision();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMParameterPartitionImpl <em>PCM Parameter Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMParameterPartitionImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMParameterPartition()
		 * @generated
		 */
		EClass PCM_PARAMETER_PARTITION = eINSTANCE.getPCMParameterPartition();

		/**
		 * The meta object literal for the '<em><b>Characerised Parameter Partitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_PARAMETER_PARTITION__CHARACERISED_PARAMETER_PARTITIONS = eINSTANCE.getPCMParameterPartition_CharacerisedParameterPartitions();

		/**
		 * The meta object literal for the '<em><b>Parameter Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_PARAMETER_PARTITION__PARAMETER_REFERENCE = eINSTANCE.getPCMParameterPartition_ParameterReference();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionImpl <em>Characterised PCM Parameter Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getCharacterisedPCMParameterPartition()
		 * @generated
		 */
		EClass CHARACTERISED_PCM_PARAMETER_PARTITION = eINSTANCE.getCharacterisedPCMParameterPartition();

		/**
		 * The meta object literal for the '<em><b>For Characterisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISED_PCM_PARAMETER_PARTITION__FOR_CHARACTERISATION = eINSTANCE.getCharacterisedPCMParameterPartition_ForCharacterisation();

		/**
		 * The meta object literal for the '<em><b>Pcm Parameter Partition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISED_PCM_PARAMETER_PARTITION__PCM_PARAMETER_PARTITION = eINSTANCE.getCharacterisedPCMParameterPartition_PcmParameterPartition();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionIntervalImpl <em>Characterised PCM Parameter Partition Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionIntervalImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getCharacterisedPCMParameterPartitionInterval()
		 * @generated
		 */
		EClass CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL = eINSTANCE.getCharacterisedPCMParameterPartitionInterval();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL__FROM = eINSTANCE.getCharacterisedPCMParameterPartitionInterval_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL__TO = eINSTANCE.getCharacterisedPCMParameterPartitionInterval_To();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionRangeImpl <em>Characterised PCM Parameter Partition Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionRangeImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getCharacterisedPCMParameterPartitionRange()
		 * @generated
		 */
		EClass CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE = eINSTANCE.getCharacterisedPCMParameterPartitionRange();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__VALUES = eINSTANCE.getCharacterisedPCMParameterPartitionRange_Values();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.ExactlyAsSpecifiedPrecisionImpl <em>Exactly As Specified Precision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.ExactlyAsSpecifiedPrecisionImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getExactlyAsSpecifiedPrecision()
		 * @generated
		 */
		EClass EXACTLY_AS_SPECIFIED_PRECISION = eINSTANCE.getExactlyAsSpecifiedPrecision();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.LimitedDeviationPrecisionImpl <em>Limited Deviation Precision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.LimitedDeviationPrecisionImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getLimitedDeviationPrecision()
		 * @generated
		 */
		EClass LIMITED_DEVIATION_PRECISION = eINSTANCE.getLimitedDeviationPrecision();

		/**
		 * The meta object literal for the '<em><b>Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMITED_DEVIATION_PRECISION__ABSOLUTE = eINSTANCE.getLimitedDeviationPrecision_Absolute();

		/**
		 * The meta object literal for the '<em><b>Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMITED_DEVIATION_PRECISION__RELATIVE = eINSTANCE.getLimitedDeviationPrecision_Relative();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.NoPrecisionImpl <em>No Precision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.NoPrecisionImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getNoPrecision()
		 * @generated
		 */
		EClass NO_PRECISION = eINSTANCE.getNoPrecision();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMRECategoryImpl <em>PCMRE Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMRECategoryImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMRECategory()
		 * @generated
		 */
		EClass PCMRE_CATEGORY = eINSTANCE.getPCMRECategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCMRE_CATEGORY__CATEGORY = eINSTANCE.getPCMRECategory_Category();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREImpl <em>PCMRE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMREImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMRE()
		 * @generated
		 */
		EClass PCMRE = eINSTANCE.getPCMRE();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREInterfaceImpl <em>PCMRE Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMREInterfaceImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMREInterface()
		 * @generated
		 */
		EClass PCMRE_INTERFACE = eINSTANCE.getPCMREInterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCMRE_INTERFACE__INTERFACE = eINSTANCE.getPCMREInterface_Interface();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMRERoleImpl <em>PCMRE Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMRERoleImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMRERole()
		 * @generated
		 */
		EClass PCMRE_ROLE = eINSTANCE.getPCMRERole();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCMRE_ROLE__ROLE = eINSTANCE.getPCMRERole_Role();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMRESignatureImpl <em>PCMRE Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMRESignatureImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMRESignature()
		 * @generated
		 */
		EClass PCMRE_SIGNATURE = eINSTANCE.getPCMRESignature();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCMRE_SIGNATURE__SIGNATURE = eINSTANCE.getPCMRESignature_Signature();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMServiceSpecificationImpl <em>PCM Service Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMServiceSpecificationImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMServiceSpecification()
		 * @generated
		 */
		EClass PCM_SERVICE_SPECIFICATION = eINSTANCE.getPCMServiceSpecification();

		/**
		 * The meta object literal for the '<em><b>Resource Demanding SEFF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_SERVICE_SPECIFICATION__RESOURCE_DEMANDING_SEFF = eINSTANCE.getPCMServiceSpecification_ResourceDemandingSEFF();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREResourceInterfaceImpl <em>PCMRE Resource Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMREResourceInterfaceImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMREResourceInterface()
		 * @generated
		 */
		EClass PCMRE_RESOURCE_INTERFACE = eINSTANCE.getPCMREResourceInterface();

		/**
		 * The meta object literal for the '<em><b>Resource Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCMRE_RESOURCE_INTERFACE__RESOURCE_INTERFACE = eINSTANCE.getPCMREResourceInterface_ResourceInterface();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREResourceSignatureImpl <em>PCMRE Resource Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMREResourceSignatureImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMREResourceSignature()
		 * @generated
		 */
		EClass PCMRE_RESOURCE_SIGNATURE = eINSTANCE.getPCMREResourceSignature();

		/**
		 * The meta object literal for the '<em><b>Resource Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCMRE_RESOURCE_SIGNATURE__RESOURCE_SIGNATURE = eINSTANCE.getPCMREResourceSignature_ResourceSignature();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREResourceImpl <em>PCMRE Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMREResourceImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMREResource()
		 * @generated
		 */
		EClass PCMRE_RESOURCE = eINSTANCE.getPCMREResource();

		/**
		 * The meta object literal for the '<em><b>Processing Resource Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCMRE_RESOURCE__PROCESSING_RESOURCE_TYPE = eINSTANCE.getPCMREResource_ProcessingResourceType();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.impl.PCMREResourceRoleImpl <em>PCMRE Resource Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.impl.PCMREResourceRoleImpl
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMREResourceRole()
		 * @generated
		 */
		EClass PCMRE_RESOURCE_ROLE = eINSTANCE.getPCMREResourceRole();

		/**
		 * The meta object literal for the '<em><b>Resource Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCMRE_RESOURCE_ROLE__RESOURCE_ROLE = eINSTANCE.getPCMREResourceRole_ResourceRole();

		/**
		 * The meta object literal for the '{@link de.fzi.se.quality.qualityannotation.PCMRERequestCategory <em>PCMRE Request Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fzi.se.quality.qualityannotation.PCMRERequestCategory
		 * @see de.fzi.se.quality.qualityannotation.impl.QualityAnnotationPackageImpl#getPCMRERequestCategory()
		 * @generated
		 */
		EEnum PCMRE_REQUEST_CATEGORY = eINSTANCE.getPCMRERequestCategory();

	}

} //QualityAnnotationPackage