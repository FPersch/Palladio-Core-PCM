/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.sensorframework;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see de.uka.ipd.sdq.sensorframework.SensorframeworkFactory
 * @model kind="package"
 * @generated
 */
public interface SensorframeworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sensorframework";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/SensorFramework/2.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.uka.ipd.sdq.sensorframework";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensorframeworkPackage eINSTANCE = de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.IdentifiableImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.AggregatedMeasurementsImpl <em>Aggregated Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.AggregatedMeasurementsImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getAggregatedMeasurements()
	 * @generated
	 */
	int AGGREGATED_MEASUREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Measurement Range</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distinct Values Before Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__DISTINCT_VALUES_BEFORE_AGGREGATION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distinct Values After Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__DISTINCT_VALUES_AFTER_AGGREGATION = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregation Characterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__AGGREGATION_CHARACTERIZATION = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Aggregated Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.MeasurementRangeImpl <em>Measurement Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.MeasurementRangeImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getMeasurementRange()
	 * @generated
	 */
	int MEASUREMENT_RANGE = 2;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RANGE__RAW_MEASUREMENTS = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RANGE__END_TIME = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RANGE__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>Collected Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RANGE__COLLECTED_DATA = 3;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS = 4;

	/**
	 * The number of structural features of the '<em>Measurement Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RANGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.RawMeasurementsImpl <em>Raw Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.RawMeasurementsImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getRawMeasurements()
	 * @generated
	 */
	int RAW_MEASUREMENTS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MEASUREMENTS__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Raw XValues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MEASUREMENTS__RAW_XVALUES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raw YValues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MEASUREMENTS__RAW_YVALUES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurement Range</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MEASUREMENTS__MEASUREMENT_RANGE = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Raw Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MEASUREMENTS_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.RawXValuesImpl <em>Raw XValues</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.RawXValuesImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getRawXValues()
	 * @generated
	 */
	int RAW_XVALUES = 4;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_XVALUES__RAW_MEASUREMENTS = 0;

	/**
	 * The number of structural features of the '<em>Raw XValues</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_XVALUES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.RawYValuesImpl <em>Raw YValues</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.RawYValuesImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getRawYValues()
	 * @generated
	 */
	int RAW_YVALUES = 5;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_YVALUES__STATISTICS = 0;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_YVALUES__AGGREGATED_MEASUREMENTS = 1;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_YVALUES__RAW_MEASUREMENTS = 2;

	/**
	 * The number of structural features of the '<em>Raw YValues</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_YVALUES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.StatisticsImpl <em>Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.StatisticsImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getStatistics()
	 * @generated
	 */
	int STATISTICS = 6;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__MINIMUM = 0;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__MEAN = 1;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__MAXIMUM = 2;

	/**
	 * The feature id for the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__SUM = 3;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__COUNT = 4;

	/**
	 * The feature id for the '<em><b>Raw YValues</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__RAW_YVALUES = 5;

	/**
	 * The number of structural features of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.FixedWidthAggregationImpl <em>Fixed Width Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.FixedWidthAggregationImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getFixedWidthAggregation()
	 * @generated
	 */
	int FIXED_WIDTH_AGGREGATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATION__ID = AGGREGATED_MEASUREMENTS__ID;

	/**
	 * The feature id for the '<em><b>Measurement Range</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATION__MEASUREMENT_RANGE = AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE;

	/**
	 * The feature id for the '<em><b>Distinct Values Before Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATION__DISTINCT_VALUES_BEFORE_AGGREGATION = AGGREGATED_MEASUREMENTS__DISTINCT_VALUES_BEFORE_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Distinct Values After Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATION__DISTINCT_VALUES_AFTER_AGGREGATION = AGGREGATED_MEASUREMENTS__DISTINCT_VALUES_AFTER_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Aggregation Characterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATION__AGGREGATION_CHARACTERIZATION = AGGREGATED_MEASUREMENTS__AGGREGATION_CHARACTERIZATION;

	/**
	 * The feature id for the '<em><b>Raw XValues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATION__RAW_XVALUES = AGGREGATED_MEASUREMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raw YValues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATION__RAW_YVALUES = AGGREGATED_MEASUREMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Width Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATION_FEATURE_COUNT = AGGREGATED_MEASUREMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.IntervalsImpl <em>Intervals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.IntervalsImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getIntervals()
	 * @generated
	 */
	int INTERVALS = 8;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALS__RAW_MEASUREMENTS = RAW_XVALUES__RAW_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALS__LOWER_BOUND = RAW_XVALUES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALS__WIDTH = RAW_XVALUES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Intervals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALS__NUMBER_OF_INTERVALS = RAW_XVALUES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALS__AGGREGATED_MEASUREMENTS = RAW_XVALUES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Intervals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALS_FEATURE_COUNT = RAW_XVALUES_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.PropertyableImpl <em>Propertyable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.PropertyableImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getPropertyable()
	 * @generated
	 */
	int PROPERTYABLE = 10;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYABLE__ADDITIONAL_INFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Propertyable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.CollectedDataImpl <em>Collected Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.CollectedDataImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getCollectedData()
	 * @generated
	 */
	int COLLECTED_DATA = 9;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTED_DATA__ADDITIONAL_INFORMATION = PROPERTYABLE__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Sensor Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTED_DATA__SENSOR_DECLARATION = PROPERTYABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Experiment Run</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTED_DATA__EXPERIMENT_RUN = PROPERTYABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurement Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTED_DATA__MEASUREMENT_RANGE = PROPERTYABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collected Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTED_DATA_FEATURE_COUNT = PROPERTYABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.EStringtoEObjectMapEntryImpl <em>EStringto EObject Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.EStringtoEObjectMapEntryImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEStringtoEObjectMapEntry()
	 * @generated
	 */
	int ESTRINGTO_EOBJECT_MAP_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRINGTO_EOBJECT_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRINGTO_EOBJECT_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EStringto EObject Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRINGTO_EOBJECT_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.SensorDeclarationImpl <em>Sensor Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorDeclarationImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getSensorDeclaration()
	 * @generated
	 */
	int SENSOR_DECLARATION = 12;

	/**
	 * The feature id for the '<em><b>Experiment Setting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DECLARATION__EXPERIMENT_SETTING = 0;

	/**
	 * The feature id for the '<em><b>Measure Characterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DECLARATION__MEASURE_CHARACTERIZATION = 1;

	/**
	 * The feature id for the '<em><b>Persistency Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DECLARATION__PERSISTENCY_KIND = 2;

	/**
	 * The number of structural features of the '<em>Sensor Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.ExperimentSettingImpl <em>Experiment Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.ExperimentSettingImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getExperimentSetting()
	 * @generated
	 */
	int EXPERIMENT_SETTING = 13;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING__ADDITIONAL_INFORMATION = PROPERTYABLE__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Experiment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING__EXPERIMENT_NAME = PROPERTYABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Experiment Runs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING__EXPERIMENT_RUNS = PROPERTYABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING__SENSORS = PROPERTYABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Experiment Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING_FEATURE_COUNT = PROPERTYABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.ExperimentRunImpl <em>Experiment Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.ExperimentRunImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getExperimentRun()
	 * @generated
	 */
	int EXPERIMENT_RUN = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__ADDITIONAL_INFORMATION = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collected Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__COLLECTED_DATA = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__START_TIME = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__DURATION = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Experiment Setting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__EXPERIMENT_SETTING = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Experiment Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.MeasureCharacterizationImpl <em>Measure Characterization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.MeasureCharacterizationImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getMeasureCharacterization()
	 * @generated
	 */
	int MEASURE_CHARACTERIZATION = 15;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CHARACTERIZATION__ADDITIONAL_INFORMATION = PROPERTYABLE__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Measured Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CHARACTERIZATION__MEASURED_OBJECT = PROPERTYABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CHARACTERIZATION__METRIC = PROPERTYABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensor Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CHARACTERIZATION__SENSOR_DECLARATION = PROPERTYABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Measure Characterization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CHARACTERIZATION_FEATURE_COUNT = PROPERTYABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.AggregationCharacterizationImpl <em>Aggregation Characterization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.AggregationCharacterizationImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getAggregationCharacterization()
	 * @generated
	 */
	int AGGREGATION_CHARACTERIZATION = 16;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_CHARACTERIZATION__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_CHARACTERIZATION__AGGREGATED_MEASUREMENTS = 1;

	/**
	 * The number of structural features of the '<em>Aggregation Characterization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_CHARACTERIZATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.LongBinaryMeasurementsImpl <em>Long Binary Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.LongBinaryMeasurementsImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getLongBinaryMeasurements()
	 * @generated
	 */
	int LONG_BINARY_MEASUREMENTS = 17;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__STATISTICS = RAW_YVALUES__STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__AGGREGATED_MEASUREMENTS = RAW_YVALUES__AGGREGATED_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__RAW_MEASUREMENTS = RAW_YVALUES__RAW_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__VALUES = RAW_YVALUES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__UNIT = RAW_YVALUES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Long Binary Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS_FEATURE_COUNT = RAW_YVALUES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.StateImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getState()
	 * @generated
	 */
	int STATE = 18;

	/**
	 * The feature id for the '<em><b>State Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_LITERAL = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.StateMeasurementsImpl <em>State Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.StateMeasurementsImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getStateMeasurements()
	 * @generated
	 */
	int STATE_MEASUREMENTS = 19;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MEASUREMENTS__STATISTICS = RAW_YVALUES__STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MEASUREMENTS__AGGREGATED_MEASUREMENTS = RAW_YVALUES__AGGREGATED_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MEASUREMENTS__RAW_MEASUREMENTS = RAW_YVALUES__RAW_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Observed States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MEASUREMENTS__OBSERVED_STATES = RAW_YVALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MEASUREMENTS_FEATURE_COUNT = RAW_YVALUES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.StateSensorImpl <em>State Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.StateSensorImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getStateSensor()
	 * @generated
	 */
	int STATE_SENSOR = 20;

	/**
	 * The feature id for the '<em><b>Experiment Setting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SENSOR__EXPERIMENT_SETTING = SENSOR_DECLARATION__EXPERIMENT_SETTING;

	/**
	 * The feature id for the '<em><b>Measure Characterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SENSOR__MEASURE_CHARACTERIZATION = SENSOR_DECLARATION__MEASURE_CHARACTERIZATION;

	/**
	 * The feature id for the '<em><b>Persistency Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SENSOR__PERSISTENCY_KIND = SENSOR_DECLARATION__PERSISTENCY_KIND;

	/**
	 * The feature id for the '<em><b>Defined Sensor States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SENSOR__DEFINED_SENSOR_STATES = SENSOR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SENSOR__INITIAL_STATE = SENSOR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SENSOR_FEATURE_COUNT = SENSOR_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.DoubleBinaryMeasurementsImpl <em>Double Binary Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.DoubleBinaryMeasurementsImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getDoubleBinaryMeasurements()
	 * @generated
	 */
	int DOUBLE_BINARY_MEASUREMENTS = 21;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__STATISTICS = RAW_YVALUES__STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__AGGREGATED_MEASUREMENTS = RAW_YVALUES__AGGREGATED_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__RAW_MEASUREMENTS = RAW_YVALUES__RAW_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__VALUES = RAW_YVALUES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__UNIT = RAW_YVALUES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Double Binary Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS_FEATURE_COUNT = RAW_YVALUES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.ExperimentGroupImpl <em>Experiment Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.ExperimentGroupImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getExperimentGroup()
	 * @generated
	 */
	int EXPERIMENT_GROUP = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_GROUP__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_GROUP__ADDITIONAL_INFORMATION = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Experiment Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_GROUP__EXPERIMENT_SETTINGS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Experiment Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_GROUP_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.MeasurableSensorImpl <em>Measurable Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.MeasurableSensorImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getMeasurableSensor()
	 * @generated
	 */
	int MEASURABLE_SENSOR = 23;

	/**
	 * The feature id for the '<em><b>Experiment Setting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_SENSOR__EXPERIMENT_SETTING = SENSOR_DECLARATION__EXPERIMENT_SETTING;

	/**
	 * The feature id for the '<em><b>Measure Characterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_SENSOR__MEASURE_CHARACTERIZATION = SENSOR_DECLARATION__MEASURE_CHARACTERIZATION;

	/**
	 * The feature id for the '<em><b>Persistency Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_SENSOR__PERSISTENCY_KIND = SENSOR_DECLARATION__PERSISTENCY_KIND;

	/**
	 * The feature id for the '<em><b>Unit Of Measurements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_SENSOR__UNIT_OF_MEASUREMENTS = SENSOR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurable Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_SENSOR_FEATURE_COUNT = SENSOR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.JSXmlMeasurementsImpl <em>JS Xml Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.JSXmlMeasurementsImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getJSXmlMeasurements()
	 * @generated
	 */
	int JS_XML_MEASUREMENTS = 24;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS__STATISTICS = RAW_YVALUES__STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS__AGGREGATED_MEASUREMENTS = RAW_YVALUES__AGGREGATED_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS__RAW_MEASUREMENTS = RAW_YVALUES__RAW_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS__VALUES = RAW_YVALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JS Xml Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS_FEATURE_COUNT = RAW_YVALUES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.EventTimeAggregationImpl <em>Event Time Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.EventTimeAggregationImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEventTimeAggregation()
	 * @generated
	 */
	int EVENT_TIME_AGGREGATION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIME_AGGREGATION__ID = FIXED_WIDTH_AGGREGATION__ID;

	/**
	 * The feature id for the '<em><b>Measurement Range</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIME_AGGREGATION__MEASUREMENT_RANGE = FIXED_WIDTH_AGGREGATION__MEASUREMENT_RANGE;

	/**
	 * The feature id for the '<em><b>Distinct Values Before Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIME_AGGREGATION__DISTINCT_VALUES_BEFORE_AGGREGATION = FIXED_WIDTH_AGGREGATION__DISTINCT_VALUES_BEFORE_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Distinct Values After Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIME_AGGREGATION__DISTINCT_VALUES_AFTER_AGGREGATION = FIXED_WIDTH_AGGREGATION__DISTINCT_VALUES_AFTER_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Aggregation Characterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIME_AGGREGATION__AGGREGATION_CHARACTERIZATION = FIXED_WIDTH_AGGREGATION__AGGREGATION_CHARACTERIZATION;

	/**
	 * The feature id for the '<em><b>Raw XValues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIME_AGGREGATION__RAW_XVALUES = FIXED_WIDTH_AGGREGATION__RAW_XVALUES;

	/**
	 * The feature id for the '<em><b>Raw YValues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIME_AGGREGATION__RAW_YVALUES = FIXED_WIDTH_AGGREGATION__RAW_YVALUES;

	/**
	 * The number of structural features of the '<em>Event Time Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIME_AGGREGATION_FEATURE_COUNT = FIXED_WIDTH_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.ValueAggregationImpl <em>Value Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.ValueAggregationImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getValueAggregation()
	 * @generated
	 */
	int VALUE_AGGREGATION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_AGGREGATION__ID = FIXED_WIDTH_AGGREGATION__ID;

	/**
	 * The feature id for the '<em><b>Measurement Range</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_AGGREGATION__MEASUREMENT_RANGE = FIXED_WIDTH_AGGREGATION__MEASUREMENT_RANGE;

	/**
	 * The feature id for the '<em><b>Distinct Values Before Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_AGGREGATION__DISTINCT_VALUES_BEFORE_AGGREGATION = FIXED_WIDTH_AGGREGATION__DISTINCT_VALUES_BEFORE_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Distinct Values After Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_AGGREGATION__DISTINCT_VALUES_AFTER_AGGREGATION = FIXED_WIDTH_AGGREGATION__DISTINCT_VALUES_AFTER_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Aggregation Characterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_AGGREGATION__AGGREGATION_CHARACTERIZATION = FIXED_WIDTH_AGGREGATION__AGGREGATION_CHARACTERIZATION;

	/**
	 * The feature id for the '<em><b>Raw XValues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_AGGREGATION__RAW_XVALUES = FIXED_WIDTH_AGGREGATION__RAW_XVALUES;

	/**
	 * The feature id for the '<em><b>Raw YValues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_AGGREGATION__RAW_YVALUES = FIXED_WIDTH_AGGREGATION__RAW_YVALUES;

	/**
	 * The number of structural features of the '<em>Value Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_AGGREGATION_FEATURE_COUNT = FIXED_WIDTH_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.IncreasingMeasurableSensorImpl <em>Increasing Measurable Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.IncreasingMeasurableSensorImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getIncreasingMeasurableSensor()
	 * @generated
	 */
	int INCREASING_MEASURABLE_SENSOR = 27;

	/**
	 * The feature id for the '<em><b>Experiment Setting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREASING_MEASURABLE_SENSOR__EXPERIMENT_SETTING = MEASURABLE_SENSOR__EXPERIMENT_SETTING;

	/**
	 * The feature id for the '<em><b>Measure Characterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREASING_MEASURABLE_SENSOR__MEASURE_CHARACTERIZATION = MEASURABLE_SENSOR__MEASURE_CHARACTERIZATION;

	/**
	 * The feature id for the '<em><b>Persistency Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREASING_MEASURABLE_SENSOR__PERSISTENCY_KIND = MEASURABLE_SENSOR__PERSISTENCY_KIND;

	/**
	 * The feature id for the '<em><b>Unit Of Measurements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREASING_MEASURABLE_SENSOR__UNIT_OF_MEASUREMENTS = MEASURABLE_SENSOR__UNIT_OF_MEASUREMENTS;

	/**
	 * The number of structural features of the '<em>Increasing Measurable Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREASING_MEASURABLE_SENSOR_FEATURE_COUNT = MEASURABLE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.AdvancedStatisticsImpl <em>Advanced Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.AdvancedStatisticsImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getAdvancedStatistics()
	 * @generated
	 */
	int ADVANCED_STATISTICS = 28;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_STATISTICS__MINIMUM = STATISTICS__MINIMUM;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_STATISTICS__MEAN = STATISTICS__MEAN;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_STATISTICS__MAXIMUM = STATISTICS__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_STATISTICS__SUM = STATISTICS__SUM;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_STATISTICS__COUNT = STATISTICS__COUNT;

	/**
	 * The feature id for the '<em><b>Raw YValues</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_STATISTICS__RAW_YVALUES = STATISTICS__RAW_YVALUES;

	/**
	 * The feature id for the '<em><b>Median</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_STATISTICS__MEDIAN = STATISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_STATISTICS__VARIANCE = STATISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_STATISTICS__STANDARD_DEVIATION = STATISTICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Advanced Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_STATISTICS_FEATURE_COUNT = STATISTICS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.impl.DoubleEventTimesImpl <em>Double Event Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.impl.DoubleEventTimesImpl
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getDoubleEventTimes()
	 * @generated
	 */
	int DOUBLE_EVENT_TIMES = 29;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EVENT_TIMES__RAW_MEASUREMENTS = RAW_XVALUES__RAW_MEASUREMENTS;

	/**
	 * The number of structural features of the '<em>Double Event Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EVENT_TIMES_FEATURE_COUNT = RAW_XVALUES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link javax.measure.quantity.Duration <em>IJS Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Duration
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getIJSDuration()
	 * @generated
	 */
	int IJS_DURATION = 30;

	/**
	 * The number of structural features of the '<em>IJS Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IJS_DURATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link javax.measure.quantity.Quantity <em>IJS Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Quantity
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getIJSQuantity()
	 * @generated
	 */
	int IJS_QUANTITY = 31;

	/**
	 * The number of structural features of the '<em>IJS Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IJS_QUANTITY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.sensorframework.PersistenceKindOptions <em>Persistence Kind Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.PersistenceKindOptions
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getPersistenceKindOptions()
	 * @generated
	 */
	int PERSISTENCE_KIND_OPTIONS = 32;

	/**
	 * The meta object id for the '<em>EJS Measure</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.Measure
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEJSMeasure()
	 * @generated
	 */
	int EJS_MEASURE = 33;

	/**
	 * The meta object id for the '<em>EJS Duration Measure</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.Measure
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEJSDurationMeasure()
	 * @generated
	 */
	int EJS_DURATION_MEASURE = 34;

	/**
	 * The meta object id for the '<em>EBackground List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.sensorframework.storage.lists.BackgroundMemoryList
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEBackgroundList()
	 * @generated
	 */
	int EBACKGROUND_LIST = 35;

	/**
	 * The meta object id for the '<em>EJS Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.unit.Unit
	 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEJSUnit()
	 * @generated
	 */
	int EJS_UNIT = 36;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.AggregatedMeasurements <em>Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AggregatedMeasurements
	 * @generated
	 */
	EClass getAggregatedMeasurements();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.AggregatedMeasurements#getMeasurementRange <em>Measurement Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Measurement Range</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AggregatedMeasurements#getMeasurementRange()
	 * @see #getAggregatedMeasurements()
	 * @generated
	 */
	EReference getAggregatedMeasurements_MeasurementRange();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.AggregatedMeasurements#getDistinctValuesBeforeAggregation <em>Distinct Values Before Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct Values Before Aggregation</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AggregatedMeasurements#getDistinctValuesBeforeAggregation()
	 * @see #getAggregatedMeasurements()
	 * @generated
	 */
	EAttribute getAggregatedMeasurements_DistinctValuesBeforeAggregation();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.AggregatedMeasurements#getDistinctValuesAfterAggregation <em>Distinct Values After Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct Values After Aggregation</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AggregatedMeasurements#getDistinctValuesAfterAggregation()
	 * @see #getAggregatedMeasurements()
	 * @generated
	 */
	EAttribute getAggregatedMeasurements_DistinctValuesAfterAggregation();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.sensorframework.AggregatedMeasurements#getAggregationCharacterization <em>Aggregation Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregation Characterization</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AggregatedMeasurements#getAggregationCharacterization()
	 * @see #getAggregatedMeasurements()
	 * @generated
	 */
	EReference getAggregatedMeasurements_AggregationCharacterization();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.MeasurementRange <em>Measurement Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Range</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasurementRange
	 * @generated
	 */
	EClass getMeasurementRange();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.sensorframework.MeasurementRange#getRawMeasurements <em>Raw Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raw Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasurementRange#getRawMeasurements()
	 * @see #getMeasurementRange()
	 * @generated
	 */
	EReference getMeasurementRange_RawMeasurements();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.MeasurementRange#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasurementRange#getEndTime()
	 * @see #getMeasurementRange()
	 * @generated
	 */
	EAttribute getMeasurementRange_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.MeasurementRange#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasurementRange#getStartTime()
	 * @see #getMeasurementRange()
	 * @generated
	 */
	EAttribute getMeasurementRange_StartTime();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.MeasurementRange#getCollectedData <em>Collected Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collected Data</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasurementRange#getCollectedData()
	 * @see #getMeasurementRange()
	 * @generated
	 */
	EReference getMeasurementRange_CollectedData();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.sensorframework.MeasurementRange#getAggregatedMeasurements <em>Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregated Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasurementRange#getAggregatedMeasurements()
	 * @see #getMeasurementRange()
	 * @generated
	 */
	EReference getMeasurementRange_AggregatedMeasurements();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.RawMeasurements <em>Raw Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.RawMeasurements
	 * @generated
	 */
	EClass getRawMeasurements();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.sensorframework.RawMeasurements#getRawXValues <em>Raw XValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raw XValues</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.RawMeasurements#getRawXValues()
	 * @see #getRawMeasurements()
	 * @generated
	 */
	EReference getRawMeasurements_RawXValues();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.sensorframework.RawMeasurements#getRawYValues <em>Raw YValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raw YValues</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.RawMeasurements#getRawYValues()
	 * @see #getRawMeasurements()
	 * @generated
	 */
	EReference getRawMeasurements_RawYValues();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.RawMeasurements#getMeasurementRange <em>Measurement Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Measurement Range</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.RawMeasurements#getMeasurementRange()
	 * @see #getRawMeasurements()
	 * @generated
	 */
	EReference getRawMeasurements_MeasurementRange();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.RawXValues <em>Raw XValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw XValues</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.RawXValues
	 * @generated
	 */
	EClass getRawXValues();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.RawXValues#getRawMeasurements <em>Raw Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Raw Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.RawXValues#getRawMeasurements()
	 * @see #getRawXValues()
	 * @generated
	 */
	EReference getRawXValues_RawMeasurements();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.RawYValues <em>Raw YValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw YValues</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.RawYValues
	 * @generated
	 */
	EClass getRawYValues();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.sensorframework.RawYValues#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistics</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.RawYValues#getStatistics()
	 * @see #getRawYValues()
	 * @generated
	 */
	EReference getRawYValues_Statistics();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.RawYValues#getAggregatedMeasurements <em>Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregated Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.RawYValues#getAggregatedMeasurements()
	 * @see #getRawYValues()
	 * @generated
	 */
	EReference getRawYValues_AggregatedMeasurements();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.RawYValues#getRawMeasurements <em>Raw Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Raw Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.RawYValues#getRawMeasurements()
	 * @see #getRawYValues()
	 * @generated
	 */
	EReference getRawYValues_RawMeasurements();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.Statistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistics</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Statistics
	 * @generated
	 */
	EClass getStatistics();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.Statistics#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Statistics#getMinimum()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.Statistics#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Statistics#getMean()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Mean();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.Statistics#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Statistics#getMaximum()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.Statistics#getSum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Statistics#getSum()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Sum();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.Statistics#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Statistics#getCount()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Count();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.Statistics#getRawYValues <em>Raw YValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Raw YValues</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Statistics#getRawYValues()
	 * @see #getStatistics()
	 * @generated
	 */
	EReference getStatistics_RawYValues();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.FixedWidthAggregation <em>Fixed Width Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Width Aggregation</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.FixedWidthAggregation
	 * @generated
	 */
	EClass getFixedWidthAggregation();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.sensorframework.FixedWidthAggregation#getRawXValues <em>Raw XValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raw XValues</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.FixedWidthAggregation#getRawXValues()
	 * @see #getFixedWidthAggregation()
	 * @generated
	 */
	EReference getFixedWidthAggregation_RawXValues();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.sensorframework.FixedWidthAggregation#getRawYValues <em>Raw YValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raw YValues</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.FixedWidthAggregation#getRawYValues()
	 * @see #getFixedWidthAggregation()
	 * @generated
	 */
	EReference getFixedWidthAggregation_RawYValues();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.Intervals <em>Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervals</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Intervals
	 * @generated
	 */
	EClass getIntervals();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.Intervals#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Intervals#getLowerBound()
	 * @see #getIntervals()
	 * @generated
	 */
	EAttribute getIntervals_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.Intervals#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Intervals#getWidth()
	 * @see #getIntervals()
	 * @generated
	 */
	EAttribute getIntervals_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.Intervals#getNumberOfIntervals <em>Number Of Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Intervals</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Intervals#getNumberOfIntervals()
	 * @see #getIntervals()
	 * @generated
	 */
	EAttribute getIntervals_NumberOfIntervals();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.Intervals#getAggregatedMeasurements <em>Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregated Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Intervals#getAggregatedMeasurements()
	 * @see #getIntervals()
	 * @generated
	 */
	EReference getIntervals_AggregatedMeasurements();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.CollectedData <em>Collected Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collected Data</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.CollectedData
	 * @generated
	 */
	EClass getCollectedData();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.sensorframework.CollectedData#getSensorDeclaration <em>Sensor Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor Declaration</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.CollectedData#getSensorDeclaration()
	 * @see #getCollectedData()
	 * @generated
	 */
	EReference getCollectedData_SensorDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.CollectedData#getExperimentRun <em>Experiment Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Experiment Run</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.CollectedData#getExperimentRun()
	 * @see #getCollectedData()
	 * @generated
	 */
	EReference getCollectedData_ExperimentRun();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.sensorframework.CollectedData#getMeasurementRange <em>Measurement Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement Range</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.CollectedData#getMeasurementRange()
	 * @see #getCollectedData()
	 * @generated
	 */
	EReference getCollectedData_MeasurementRange();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.Propertyable <em>Propertyable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propertyable</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Propertyable
	 * @generated
	 */
	EClass getPropertyable();

	/**
	 * Returns the meta object for the map '{@link de.uka.ipd.sdq.sensorframework.Propertyable#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Additional Information</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.Propertyable#getAdditionalInformation()
	 * @see #getPropertyable()
	 * @generated
	 */
	EReference getPropertyable_AdditionalInformation();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EStringto EObject Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStringto EObject Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true" keyOrdered="false"
	 *        valueDataType="org.eclipse.emf.ecore.EJavaObject" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getEStringtoEObjectMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringtoEObjectMapEntry()
	 * @generated
	 */
	EAttribute getEStringtoEObjectMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringtoEObjectMapEntry()
	 * @generated
	 */
	EAttribute getEStringtoEObjectMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.SensorDeclaration <em>Sensor Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Declaration</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.SensorDeclaration
	 * @generated
	 */
	EClass getSensorDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.SensorDeclaration#getExperimentSetting <em>Experiment Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Experiment Setting</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.SensorDeclaration#getExperimentSetting()
	 * @see #getSensorDeclaration()
	 * @generated
	 */
	EReference getSensorDeclaration_ExperimentSetting();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.sensorframework.SensorDeclaration#getMeasureCharacterization <em>Measure Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Characterization</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.SensorDeclaration#getMeasureCharacterization()
	 * @see #getSensorDeclaration()
	 * @generated
	 */
	EReference getSensorDeclaration_MeasureCharacterization();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.SensorDeclaration#getPersistencyKind <em>Persistency Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistency Kind</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.SensorDeclaration#getPersistencyKind()
	 * @see #getSensorDeclaration()
	 * @generated
	 */
	EAttribute getSensorDeclaration_PersistencyKind();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.ExperimentSetting <em>Experiment Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Setting</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentSetting
	 * @generated
	 */
	EClass getExperimentSetting();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.ExperimentSetting#getExperimentName <em>Experiment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experiment Name</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentSetting#getExperimentName()
	 * @see #getExperimentSetting()
	 * @generated
	 */
	EAttribute getExperimentSetting_ExperimentName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.sensorframework.ExperimentSetting#getExperimentRuns <em>Experiment Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiment Runs</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentSetting#getExperimentRuns()
	 * @see #getExperimentSetting()
	 * @generated
	 */
	EReference getExperimentSetting_ExperimentRuns();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.sensorframework.ExperimentSetting#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentSetting#getSensors()
	 * @see #getExperimentSetting()
	 * @generated
	 */
	EReference getExperimentSetting_Sensors();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.ExperimentRun <em>Experiment Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Run</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentRun
	 * @generated
	 */
	EClass getExperimentRun();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.sensorframework.ExperimentRun#getCollectedData <em>Collected Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collected Data</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentRun#getCollectedData()
	 * @see #getExperimentRun()
	 * @generated
	 */
	EReference getExperimentRun_CollectedData();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.ExperimentRun#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentRun#getStartTime()
	 * @see #getExperimentRun()
	 * @generated
	 */
	EAttribute getExperimentRun_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.ExperimentRun#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentRun#getDuration()
	 * @see #getExperimentRun()
	 * @generated
	 */
	EAttribute getExperimentRun_Duration();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.ExperimentRun#getExperimentSetting <em>Experiment Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Experiment Setting</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentRun#getExperimentSetting()
	 * @see #getExperimentRun()
	 * @generated
	 */
	EReference getExperimentRun_ExperimentSetting();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.MeasureCharacterization <em>Measure Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Characterization</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasureCharacterization
	 * @generated
	 */
	EClass getMeasureCharacterization();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.MeasureCharacterization#getMeasuredObject <em>Measured Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measured Object</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasureCharacterization#getMeasuredObject()
	 * @see #getMeasureCharacterization()
	 * @generated
	 */
	EAttribute getMeasureCharacterization_MeasuredObject();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.MeasureCharacterization#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasureCharacterization#getMetric()
	 * @see #getMeasureCharacterization()
	 * @generated
	 */
	EAttribute getMeasureCharacterization_Metric();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.MeasureCharacterization#getSensorDeclaration <em>Sensor Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sensor Declaration</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasureCharacterization#getSensorDeclaration()
	 * @see #getMeasureCharacterization()
	 * @generated
	 */
	EReference getMeasureCharacterization_SensorDeclaration();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.AggregationCharacterization <em>Aggregation Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Characterization</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AggregationCharacterization
	 * @generated
	 */
	EClass getAggregationCharacterization();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.AggregationCharacterization#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AggregationCharacterization#getFunction()
	 * @see #getAggregationCharacterization()
	 * @generated
	 */
	EAttribute getAggregationCharacterization_Function();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.sensorframework.AggregationCharacterization#getAggregatedMeasurements <em>Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregated Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AggregationCharacterization#getAggregatedMeasurements()
	 * @see #getAggregationCharacterization()
	 * @generated
	 */
	EReference getAggregationCharacterization_AggregatedMeasurements();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.LongBinaryMeasurements <em>Long Binary Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Binary Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.LongBinaryMeasurements
	 * @generated
	 */
	EClass getLongBinaryMeasurements();

	/**
	 * Returns the meta object for the attribute list '{@link de.uka.ipd.sdq.sensorframework.LongBinaryMeasurements#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.LongBinaryMeasurements#getValues()
	 * @see #getLongBinaryMeasurements()
	 * @generated
	 */
	EAttribute getLongBinaryMeasurements_Values();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.LongBinaryMeasurements#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.LongBinaryMeasurements#getUnit()
	 * @see #getLongBinaryMeasurements()
	 * @generated
	 */
	EAttribute getLongBinaryMeasurements_Unit();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.State#getStateLiteral <em>State Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Literal</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.State#getStateLiteral()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_StateLiteral();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.StateMeasurements <em>State Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.StateMeasurements
	 * @generated
	 */
	EClass getStateMeasurements();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.sensorframework.StateMeasurements#getObservedStates <em>Observed States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Observed States</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.StateMeasurements#getObservedStates()
	 * @see #getStateMeasurements()
	 * @generated
	 */
	EReference getStateMeasurements_ObservedStates();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.StateSensor <em>State Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Sensor</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.StateSensor
	 * @generated
	 */
	EClass getStateSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.sensorframework.StateSensor#getDefinedSensorStates <em>Defined Sensor States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defined Sensor States</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.StateSensor#getDefinedSensorStates()
	 * @see #getStateSensor()
	 * @generated
	 */
	EReference getStateSensor_DefinedSensorStates();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.sensorframework.StateSensor#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.StateSensor#getInitialState()
	 * @see #getStateSensor()
	 * @generated
	 */
	EReference getStateSensor_InitialState();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.DoubleBinaryMeasurements <em>Double Binary Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Binary Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.DoubleBinaryMeasurements
	 * @generated
	 */
	EClass getDoubleBinaryMeasurements();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.DoubleBinaryMeasurements#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.DoubleBinaryMeasurements#getValues()
	 * @see #getDoubleBinaryMeasurements()
	 * @generated
	 */
	EAttribute getDoubleBinaryMeasurements_Values();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.DoubleBinaryMeasurements#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.DoubleBinaryMeasurements#getUnit()
	 * @see #getDoubleBinaryMeasurements()
	 * @generated
	 */
	EAttribute getDoubleBinaryMeasurements_Unit();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.ExperimentGroup <em>Experiment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Group</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentGroup
	 * @generated
	 */
	EClass getExperimentGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.sensorframework.ExperimentGroup#getExperimentSettings <em>Experiment Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiment Settings</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ExperimentGroup#getExperimentSettings()
	 * @see #getExperimentGroup()
	 * @generated
	 */
	EReference getExperimentGroup_ExperimentSettings();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.MeasurableSensor <em>Measurable Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurable Sensor</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasurableSensor
	 * @generated
	 */
	EClass getMeasurableSensor();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.MeasurableSensor#getUnitOfMeasurements <em>Unit Of Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.MeasurableSensor#getUnitOfMeasurements()
	 * @see #getMeasurableSensor()
	 * @generated
	 */
	EAttribute getMeasurableSensor_UnitOfMeasurements();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.JSXmlMeasurements <em>JS Xml Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JS Xml Measurements</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.JSXmlMeasurements
	 * @generated
	 */
	EClass getJSXmlMeasurements();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.JSXmlMeasurements#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.JSXmlMeasurements#getValues()
	 * @see #getJSXmlMeasurements()
	 * @generated
	 */
	EAttribute getJSXmlMeasurements_Values();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.EventTimeAggregation <em>Event Time Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Time Aggregation</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.EventTimeAggregation
	 * @generated
	 */
	EClass getEventTimeAggregation();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.ValueAggregation <em>Value Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Aggregation</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.ValueAggregation
	 * @generated
	 */
	EClass getValueAggregation();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.IncreasingMeasurableSensor <em>Increasing Measurable Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increasing Measurable Sensor</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.IncreasingMeasurableSensor
	 * @generated
	 */
	EClass getIncreasingMeasurableSensor();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.AdvancedStatistics <em>Advanced Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advanced Statistics</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AdvancedStatistics
	 * @generated
	 */
	EClass getAdvancedStatistics();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.AdvancedStatistics#getMedian <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Median</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AdvancedStatistics#getMedian()
	 * @see #getAdvancedStatistics()
	 * @generated
	 */
	EAttribute getAdvancedStatistics_Median();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.AdvancedStatistics#getVariance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variance</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AdvancedStatistics#getVariance()
	 * @see #getAdvancedStatistics()
	 * @generated
	 */
	EAttribute getAdvancedStatistics_Variance();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.sensorframework.AdvancedStatistics#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.AdvancedStatistics#getStandardDeviation()
	 * @see #getAdvancedStatistics()
	 * @generated
	 */
	EAttribute getAdvancedStatistics_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.sensorframework.DoubleEventTimes <em>Double Event Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Event Times</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.DoubleEventTimes
	 * @generated
	 */
	EClass getDoubleEventTimes();

	/**
	 * Returns the meta object for class '{@link javax.measure.quantity.Duration <em>IJS Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IJS Duration</em>'.
	 * @see javax.measure.quantity.Duration
	 * @model instanceClass="javax.measure.quantity.Duration"
	 * @generated
	 */
	EClass getIJSDuration();

	/**
	 * Returns the meta object for class '{@link javax.measure.quantity.Quantity <em>IJS Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IJS Quantity</em>'.
	 * @see javax.measure.quantity.Quantity
	 * @model instanceClass="javax.measure.quantity.Quantity"
	 * @generated
	 */
	EClass getIJSQuantity();

	/**
	 * Returns the meta object for enum '{@link de.uka.ipd.sdq.sensorframework.PersistenceKindOptions <em>Persistence Kind Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Kind Options</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.PersistenceKindOptions
	 * @generated
	 */
	EEnum getPersistenceKindOptions();

	/**
	 * Returns the meta object for data type '{@link javax.measure.Measure <em>EJS Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJS Measure</em>'.
	 * @see javax.measure.Measure
	 * @model instanceClass="javax.measure.Measure"
	 * @generated
	 */
	EDataType getEJSMeasure();

	/**
	 * Returns the meta object for data type '{@link javax.measure.Measure <em>EJS Duration Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJS Duration Measure</em>'.
	 * @see javax.measure.Measure
	 * @model instanceClass="javax.measure.Measure"
	 * @generated
	 */
	EDataType getEJSDurationMeasure();

	/**
	 * Returns the meta object for data type '{@link de.uka.ipd.sdq.sensorframework.storage.lists.BackgroundMemoryList <em>EBackground List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBackground List</em>'.
	 * @see de.uka.ipd.sdq.sensorframework.storage.lists.BackgroundMemoryList
	 * @model instanceClass="de.uka.ipd.sdq.sensorframework.storage.lists.BackgroundMemoryList"
	 * @generated
	 */
	EDataType getEBackgroundList();

	/**
	 * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>EJS Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJS Unit</em>'.
	 * @see javax.measure.unit.Unit
	 * @model instanceClass="javax.measure.unit.Unit"
	 * @generated
	 */
	EDataType getEJSUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SensorframeworkFactory getSensorframeworkFactory();

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
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.AggregatedMeasurementsImpl <em>Aggregated Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.AggregatedMeasurementsImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getAggregatedMeasurements()
		 * @generated
		 */
		EClass AGGREGATED_MEASUREMENTS = eINSTANCE.getAggregatedMeasurements();

		/**
		 * The meta object literal for the '<em><b>Measurement Range</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE = eINSTANCE.getAggregatedMeasurements_MeasurementRange();

		/**
		 * The meta object literal for the '<em><b>Distinct Values Before Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_MEASUREMENTS__DISTINCT_VALUES_BEFORE_AGGREGATION = eINSTANCE.getAggregatedMeasurements_DistinctValuesBeforeAggregation();

		/**
		 * The meta object literal for the '<em><b>Distinct Values After Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_MEASUREMENTS__DISTINCT_VALUES_AFTER_AGGREGATION = eINSTANCE.getAggregatedMeasurements_DistinctValuesAfterAggregation();

		/**
		 * The meta object literal for the '<em><b>Aggregation Characterization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_MEASUREMENTS__AGGREGATION_CHARACTERIZATION = eINSTANCE.getAggregatedMeasurements_AggregationCharacterization();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.IdentifiableImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.MeasurementRangeImpl <em>Measurement Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.MeasurementRangeImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getMeasurementRange()
		 * @generated
		 */
		EClass MEASUREMENT_RANGE = eINSTANCE.getMeasurementRange();

		/**
		 * The meta object literal for the '<em><b>Raw Measurements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_RANGE__RAW_MEASUREMENTS = eINSTANCE.getMeasurementRange_RawMeasurements();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_RANGE__END_TIME = eINSTANCE.getMeasurementRange_EndTime();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_RANGE__START_TIME = eINSTANCE.getMeasurementRange_StartTime();

		/**
		 * The meta object literal for the '<em><b>Collected Data</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_RANGE__COLLECTED_DATA = eINSTANCE.getMeasurementRange_CollectedData();

		/**
		 * The meta object literal for the '<em><b>Aggregated Measurements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS = eINSTANCE.getMeasurementRange_AggregatedMeasurements();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.RawMeasurementsImpl <em>Raw Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.RawMeasurementsImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getRawMeasurements()
		 * @generated
		 */
		EClass RAW_MEASUREMENTS = eINSTANCE.getRawMeasurements();

		/**
		 * The meta object literal for the '<em><b>Raw XValues</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_MEASUREMENTS__RAW_XVALUES = eINSTANCE.getRawMeasurements_RawXValues();

		/**
		 * The meta object literal for the '<em><b>Raw YValues</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_MEASUREMENTS__RAW_YVALUES = eINSTANCE.getRawMeasurements_RawYValues();

		/**
		 * The meta object literal for the '<em><b>Measurement Range</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_MEASUREMENTS__MEASUREMENT_RANGE = eINSTANCE.getRawMeasurements_MeasurementRange();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.RawXValuesImpl <em>Raw XValues</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.RawXValuesImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getRawXValues()
		 * @generated
		 */
		EClass RAW_XVALUES = eINSTANCE.getRawXValues();

		/**
		 * The meta object literal for the '<em><b>Raw Measurements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_XVALUES__RAW_MEASUREMENTS = eINSTANCE.getRawXValues_RawMeasurements();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.RawYValuesImpl <em>Raw YValues</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.RawYValuesImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getRawYValues()
		 * @generated
		 */
		EClass RAW_YVALUES = eINSTANCE.getRawYValues();

		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_YVALUES__STATISTICS = eINSTANCE.getRawYValues_Statistics();

		/**
		 * The meta object literal for the '<em><b>Aggregated Measurements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_YVALUES__AGGREGATED_MEASUREMENTS = eINSTANCE.getRawYValues_AggregatedMeasurements();

		/**
		 * The meta object literal for the '<em><b>Raw Measurements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_YVALUES__RAW_MEASUREMENTS = eINSTANCE.getRawYValues_RawMeasurements();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.StatisticsImpl <em>Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.StatisticsImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getStatistics()
		 * @generated
		 */
		EClass STATISTICS = eINSTANCE.getStatistics();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__MINIMUM = eINSTANCE.getStatistics_Minimum();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__MEAN = eINSTANCE.getStatistics_Mean();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__MAXIMUM = eINSTANCE.getStatistics_Maximum();

		/**
		 * The meta object literal for the '<em><b>Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__SUM = eINSTANCE.getStatistics_Sum();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__COUNT = eINSTANCE.getStatistics_Count();

		/**
		 * The meta object literal for the '<em><b>Raw YValues</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICS__RAW_YVALUES = eINSTANCE.getStatistics_RawYValues();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.FixedWidthAggregationImpl <em>Fixed Width Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.FixedWidthAggregationImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getFixedWidthAggregation()
		 * @generated
		 */
		EClass FIXED_WIDTH_AGGREGATION = eINSTANCE.getFixedWidthAggregation();

		/**
		 * The meta object literal for the '<em><b>Raw XValues</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_WIDTH_AGGREGATION__RAW_XVALUES = eINSTANCE.getFixedWidthAggregation_RawXValues();

		/**
		 * The meta object literal for the '<em><b>Raw YValues</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_WIDTH_AGGREGATION__RAW_YVALUES = eINSTANCE.getFixedWidthAggregation_RawYValues();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.IntervalsImpl <em>Intervals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.IntervalsImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getIntervals()
		 * @generated
		 */
		EClass INTERVALS = eINSTANCE.getIntervals();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVALS__LOWER_BOUND = eINSTANCE.getIntervals_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVALS__WIDTH = eINSTANCE.getIntervals_Width();

		/**
		 * The meta object literal for the '<em><b>Number Of Intervals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVALS__NUMBER_OF_INTERVALS = eINSTANCE.getIntervals_NumberOfIntervals();

		/**
		 * The meta object literal for the '<em><b>Aggregated Measurements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVALS__AGGREGATED_MEASUREMENTS = eINSTANCE.getIntervals_AggregatedMeasurements();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.CollectedDataImpl <em>Collected Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.CollectedDataImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getCollectedData()
		 * @generated
		 */
		EClass COLLECTED_DATA = eINSTANCE.getCollectedData();

		/**
		 * The meta object literal for the '<em><b>Sensor Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTED_DATA__SENSOR_DECLARATION = eINSTANCE.getCollectedData_SensorDeclaration();

		/**
		 * The meta object literal for the '<em><b>Experiment Run</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTED_DATA__EXPERIMENT_RUN = eINSTANCE.getCollectedData_ExperimentRun();

		/**
		 * The meta object literal for the '<em><b>Measurement Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTED_DATA__MEASUREMENT_RANGE = eINSTANCE.getCollectedData_MeasurementRange();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.PropertyableImpl <em>Propertyable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.PropertyableImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getPropertyable()
		 * @generated
		 */
		EClass PROPERTYABLE = eINSTANCE.getPropertyable();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTYABLE__ADDITIONAL_INFORMATION = eINSTANCE.getPropertyable_AdditionalInformation();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.EStringtoEObjectMapEntryImpl <em>EStringto EObject Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.EStringtoEObjectMapEntryImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEStringtoEObjectMapEntry()
		 * @generated
		 */
		EClass ESTRINGTO_EOBJECT_MAP_ENTRY = eINSTANCE.getEStringtoEObjectMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRINGTO_EOBJECT_MAP_ENTRY__KEY = eINSTANCE.getEStringtoEObjectMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRINGTO_EOBJECT_MAP_ENTRY__VALUE = eINSTANCE.getEStringtoEObjectMapEntry_Value();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.SensorDeclarationImpl <em>Sensor Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorDeclarationImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getSensorDeclaration()
		 * @generated
		 */
		EClass SENSOR_DECLARATION = eINSTANCE.getSensorDeclaration();

		/**
		 * The meta object literal for the '<em><b>Experiment Setting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DECLARATION__EXPERIMENT_SETTING = eINSTANCE.getSensorDeclaration_ExperimentSetting();

		/**
		 * The meta object literal for the '<em><b>Measure Characterization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_DECLARATION__MEASURE_CHARACTERIZATION = eINSTANCE.getSensorDeclaration_MeasureCharacterization();

		/**
		 * The meta object literal for the '<em><b>Persistency Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DECLARATION__PERSISTENCY_KIND = eINSTANCE.getSensorDeclaration_PersistencyKind();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.ExperimentSettingImpl <em>Experiment Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.ExperimentSettingImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getExperimentSetting()
		 * @generated
		 */
		EClass EXPERIMENT_SETTING = eINSTANCE.getExperimentSetting();

		/**
		 * The meta object literal for the '<em><b>Experiment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_SETTING__EXPERIMENT_NAME = eINSTANCE.getExperimentSetting_ExperimentName();

		/**
		 * The meta object literal for the '<em><b>Experiment Runs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_SETTING__EXPERIMENT_RUNS = eINSTANCE.getExperimentSetting_ExperimentRuns();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_SETTING__SENSORS = eINSTANCE.getExperimentSetting_Sensors();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.ExperimentRunImpl <em>Experiment Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.ExperimentRunImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getExperimentRun()
		 * @generated
		 */
		EClass EXPERIMENT_RUN = eINSTANCE.getExperimentRun();

		/**
		 * The meta object literal for the '<em><b>Collected Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_RUN__COLLECTED_DATA = eINSTANCE.getExperimentRun_CollectedData();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_RUN__START_TIME = eINSTANCE.getExperimentRun_StartTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_RUN__DURATION = eINSTANCE.getExperimentRun_Duration();

		/**
		 * The meta object literal for the '<em><b>Experiment Setting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_RUN__EXPERIMENT_SETTING = eINSTANCE.getExperimentRun_ExperimentSetting();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.MeasureCharacterizationImpl <em>Measure Characterization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.MeasureCharacterizationImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getMeasureCharacterization()
		 * @generated
		 */
		EClass MEASURE_CHARACTERIZATION = eINSTANCE.getMeasureCharacterization();

		/**
		 * The meta object literal for the '<em><b>Measured Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_CHARACTERIZATION__MEASURED_OBJECT = eINSTANCE.getMeasureCharacterization_MeasuredObject();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_CHARACTERIZATION__METRIC = eINSTANCE.getMeasureCharacterization_Metric();

		/**
		 * The meta object literal for the '<em><b>Sensor Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_CHARACTERIZATION__SENSOR_DECLARATION = eINSTANCE.getMeasureCharacterization_SensorDeclaration();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.AggregationCharacterizationImpl <em>Aggregation Characterization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.AggregationCharacterizationImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getAggregationCharacterization()
		 * @generated
		 */
		EClass AGGREGATION_CHARACTERIZATION = eINSTANCE.getAggregationCharacterization();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_CHARACTERIZATION__FUNCTION = eINSTANCE.getAggregationCharacterization_Function();

		/**
		 * The meta object literal for the '<em><b>Aggregated Measurements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_CHARACTERIZATION__AGGREGATED_MEASUREMENTS = eINSTANCE.getAggregationCharacterization_AggregatedMeasurements();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.LongBinaryMeasurementsImpl <em>Long Binary Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.LongBinaryMeasurementsImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getLongBinaryMeasurements()
		 * @generated
		 */
		EClass LONG_BINARY_MEASUREMENTS = eINSTANCE.getLongBinaryMeasurements();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_BINARY_MEASUREMENTS__VALUES = eINSTANCE.getLongBinaryMeasurements_Values();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_BINARY_MEASUREMENTS__UNIT = eINSTANCE.getLongBinaryMeasurements_Unit();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.StateImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>State Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__STATE_LITERAL = eINSTANCE.getState_StateLiteral();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.StateMeasurementsImpl <em>State Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.StateMeasurementsImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getStateMeasurements()
		 * @generated
		 */
		EClass STATE_MEASUREMENTS = eINSTANCE.getStateMeasurements();

		/**
		 * The meta object literal for the '<em><b>Observed States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MEASUREMENTS__OBSERVED_STATES = eINSTANCE.getStateMeasurements_ObservedStates();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.StateSensorImpl <em>State Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.StateSensorImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getStateSensor()
		 * @generated
		 */
		EClass STATE_SENSOR = eINSTANCE.getStateSensor();

		/**
		 * The meta object literal for the '<em><b>Defined Sensor States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SENSOR__DEFINED_SENSOR_STATES = eINSTANCE.getStateSensor_DefinedSensorStates();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SENSOR__INITIAL_STATE = eINSTANCE.getStateSensor_InitialState();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.DoubleBinaryMeasurementsImpl <em>Double Binary Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.DoubleBinaryMeasurementsImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getDoubleBinaryMeasurements()
		 * @generated
		 */
		EClass DOUBLE_BINARY_MEASUREMENTS = eINSTANCE.getDoubleBinaryMeasurements();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BINARY_MEASUREMENTS__VALUES = eINSTANCE.getDoubleBinaryMeasurements_Values();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BINARY_MEASUREMENTS__UNIT = eINSTANCE.getDoubleBinaryMeasurements_Unit();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.ExperimentGroupImpl <em>Experiment Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.ExperimentGroupImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getExperimentGroup()
		 * @generated
		 */
		EClass EXPERIMENT_GROUP = eINSTANCE.getExperimentGroup();

		/**
		 * The meta object literal for the '<em><b>Experiment Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_GROUP__EXPERIMENT_SETTINGS = eINSTANCE.getExperimentGroup_ExperimentSettings();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.MeasurableSensorImpl <em>Measurable Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.MeasurableSensorImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getMeasurableSensor()
		 * @generated
		 */
		EClass MEASURABLE_SENSOR = eINSTANCE.getMeasurableSensor();

		/**
		 * The meta object literal for the '<em><b>Unit Of Measurements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURABLE_SENSOR__UNIT_OF_MEASUREMENTS = eINSTANCE.getMeasurableSensor_UnitOfMeasurements();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.JSXmlMeasurementsImpl <em>JS Xml Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.JSXmlMeasurementsImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getJSXmlMeasurements()
		 * @generated
		 */
		EClass JS_XML_MEASUREMENTS = eINSTANCE.getJSXmlMeasurements();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JS_XML_MEASUREMENTS__VALUES = eINSTANCE.getJSXmlMeasurements_Values();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.EventTimeAggregationImpl <em>Event Time Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.EventTimeAggregationImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEventTimeAggregation()
		 * @generated
		 */
		EClass EVENT_TIME_AGGREGATION = eINSTANCE.getEventTimeAggregation();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.ValueAggregationImpl <em>Value Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.ValueAggregationImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getValueAggregation()
		 * @generated
		 */
		EClass VALUE_AGGREGATION = eINSTANCE.getValueAggregation();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.IncreasingMeasurableSensorImpl <em>Increasing Measurable Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.IncreasingMeasurableSensorImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getIncreasingMeasurableSensor()
		 * @generated
		 */
		EClass INCREASING_MEASURABLE_SENSOR = eINSTANCE.getIncreasingMeasurableSensor();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.AdvancedStatisticsImpl <em>Advanced Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.AdvancedStatisticsImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getAdvancedStatistics()
		 * @generated
		 */
		EClass ADVANCED_STATISTICS = eINSTANCE.getAdvancedStatistics();

		/**
		 * The meta object literal for the '<em><b>Median</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVANCED_STATISTICS__MEDIAN = eINSTANCE.getAdvancedStatistics_Median();

		/**
		 * The meta object literal for the '<em><b>Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVANCED_STATISTICS__VARIANCE = eINSTANCE.getAdvancedStatistics_Variance();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVANCED_STATISTICS__STANDARD_DEVIATION = eINSTANCE.getAdvancedStatistics_StandardDeviation();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.impl.DoubleEventTimesImpl <em>Double Event Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.impl.DoubleEventTimesImpl
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getDoubleEventTimes()
		 * @generated
		 */
		EClass DOUBLE_EVENT_TIMES = eINSTANCE.getDoubleEventTimes();

		/**
		 * The meta object literal for the '{@link javax.measure.quantity.Duration <em>IJS Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Duration
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getIJSDuration()
		 * @generated
		 */
		EClass IJS_DURATION = eINSTANCE.getIJSDuration();

		/**
		 * The meta object literal for the '{@link javax.measure.quantity.Quantity <em>IJS Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Quantity
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getIJSQuantity()
		 * @generated
		 */
		EClass IJS_QUANTITY = eINSTANCE.getIJSQuantity();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.sensorframework.PersistenceKindOptions <em>Persistence Kind Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.PersistenceKindOptions
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getPersistenceKindOptions()
		 * @generated
		 */
		EEnum PERSISTENCE_KIND_OPTIONS = eINSTANCE.getPersistenceKindOptions();

		/**
		 * The meta object literal for the '<em>EJS Measure</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.Measure
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEJSMeasure()
		 * @generated
		 */
		EDataType EJS_MEASURE = eINSTANCE.getEJSMeasure();

		/**
		 * The meta object literal for the '<em>EJS Duration Measure</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.Measure
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEJSDurationMeasure()
		 * @generated
		 */
		EDataType EJS_DURATION_MEASURE = eINSTANCE.getEJSDurationMeasure();

		/**
		 * The meta object literal for the '<em>EBackground List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.sensorframework.storage.lists.BackgroundMemoryList
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEBackgroundList()
		 * @generated
		 */
		EDataType EBACKGROUND_LIST = eINSTANCE.getEBackgroundList();

		/**
		 * The meta object literal for the '<em>EJS Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.unit.Unit
		 * @see de.uka.ipd.sdq.sensorframework.impl.SensorframeworkPackageImpl#getEJSUnit()
		 * @generated
		 */
		EDataType EJS_UNIT = eINSTANCE.getEJSUnit();

	}

} //SensorframeworkPackage
