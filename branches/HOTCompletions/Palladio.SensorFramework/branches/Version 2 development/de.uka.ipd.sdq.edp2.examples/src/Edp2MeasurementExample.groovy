import de.uka.ipd.sdq.edp2.models.emfmodel.DataSeriesimport com.sun.org.apache.xalan.internal.xsltc.compiler.ForEachimport de.uka.ipd.sdq.edp2.models.emfmodel.MetricSetDescriptionimport de.uka.ipd.sdq.edp2.models.emfmodel.BaseMetricDescriptionimport de.uka.ipd.sdq.edp2.models.emfmodel.Monotonicimport de.uka.ipd.sdq.edp2.models.emfmodel.CaptureTypeimport de.uka.ipd.sdq.edp2.models.emfmodel.CaptureTypeimport de.uka.ipd.sdq.edp2.models.emfmodel.Scaleimport de.uka.ipd.sdq.edp2.models.emfmodel.CaptureTypeimport de.uka.ipd.sdq.edp2.models.emfmodel.CaptureTypeimport de.uka.ipd.sdq.edp2.models.emfmodel.Measurementimport de.uka.ipd.sdq.edp2.DaoRegistryimport javax.measure.Measureimport de.uka.ipd.sdq.edp2.StorageFactoryimport de.uka.ipd.sdq.edp2.models.emfmodel.RawMeasurementsimport de.uka.ipd.sdq.edp2.util.StorageUtilityimport de.uka.ipd.sdq.edp2.models.emfmodel.OrdinalMeasureimport de.uka.ipd.sdq.edp2.models.emfmodel.NominalMeasureimport javax.measure.unit.BaseUnitimport javax.measure.unit.NonSIimport javax.measure.quantity.Dimensionlessimport javax.measure.unit.SIimport javax.measure.unit.Unitimport de.uka.ipd.sdq.edp2.models.emfmodel.EmfmodelPackageimport org.eclipse.emf.common.util.URIimport java.util.Randomimport org.eclipse.emf.ecore.util.EcoreUtilimport javax.measure.quantity.Durationimport de.uka.ipd.sdq.edp2.models.emfmodel.ExperimentGroupimport org.eclipse.emf.ecore.resource.Resourceimport de.uka.ipd.sdq.edp2.models.emfmodel.Descriptionsimport de.uka.ipd.sdq.edp2.file.impl.EmfModelResourceImplimport de.uka.ipd.sdq.edp2.file.impl.EmfModelResourceImplimport de.uka.ipd.sdq.edp2.models.emfmodel.PersistenceKindOptionsimport de.uka.ipd.sdq.edp2.models.emfmodel.EmfmodelFactoryimport net.dinkla.emf.EMFBuilder


/**This class demonstrates the use of EDP2 for storing measurements and creating descriptions. * The implementation uses the EMF Builders and is written in Groovy to also demonstrate  * the application of Groovy for creating EMF models.  * The implemented example follows the EDP2 creation steps:  * <li> * <ul/>Step 1: Build ExperimentSetting * <ul/>Step 2: Prepare Experiment Run (Add Raw Measurements, AggregationFunctions) * <ul/>Step 3: Run the experiment and generate measurements * <ul/>Step 4: Calculate offline data (Statistics, Aggregation Functions) * </li> * All Measurements are stored in a Measurements directory. * Additionally, all standard descriptions are created and save to a file.
 * @author groenda
 */
public class Edp2GroovyMeasurementExample {	static def String dataFilePath = 'Measurements'	static def String defaultFileName = dataFilePath + File.separator + 'Example.edp2eg'	static def String descriptionFileName = '_hREukCUKEd6q2eGuPXTvDQ.edp2desc'		static def builder = new EMFBuilder(EmfmodelFactory)	// Initialize	static def EmfmodelPackage emfp = EmfmodelPackage.eINSTANCE;	def Unit timeUnit = SI.SECOND	def Unit numberUnit = new BaseUnit<Dimensionless>("Threads")		static def Resource loadResourceFromFile(String fileName) {		def fileURI = URI.createURI(fileName)		def resource = new EmfModelResourceImpl(fileURI)		assert resource != null		resource.load(null)		return resource	}	 static def Resource save(String fileName, object) {		def fileURI = URI.createURI(fileName)		def resource = new EmfModelResourceImpl(fileURI)		assert resource != null		resource.contents << object		resource.save(null)		return resource	}		static def File createDirectory(String path) {		File file = new File(path)		if (!file.mkdir()) {			println "Could not create directory: " + path		}		return file	}	 	public def runExample() {		//builder.debug = true;		def storageFactory = StorageFactory.INSTANCE;		def daoFactory = storageFactory.createFileDaoFactory(createDirectory(dataFilePath));				// Load descriptions		def resource = loadResourceFromFile(descriptionFileName)		def descriptions = (Descriptions) resource.contents[0]				// Step 1: Build ExperimentSetting		def serviceCallA		def cpuA		def expSetting1		def experimentGroup = builder.ExperimentGroup() {			measure {				serviceCallA = OrdinalMeasure( 						persistencyKind : PersistenceKindOptions.BINARY_PREFERRED ,						measuredObject : 'Service Call A',						metric : descriptions.description.find{it.uuid == '_MenvIiUREd6gmLudJva2Dw'}	// Response Time (Simulated)						)				cpuA = OrdinalMeasure( 						persistencyKind : PersistenceKindOptions.BINARY_PREFERRED ,						measuredObject : 'CPU A',						metric : descriptions.description.find{it.uuid == '_M3ynoiUSEd6gmLudJva2Dw'}	// Assigned Threads (Simulated)						)			}			experimentSettings {				expSetting1 = ExperimentSetting(experimentName: 'Experiment Setting 1') {					measure {						serviceCallA						cpuA					}				}			}		}				// Step 2: Prepare Experiment Run (Add Raw Measurements, AggregationFunctions)		def start = Duration		def measurementServiceCallA		def experimentRun = builder.ExperimentRun() {			measurement {				measurementServiceCallA = Measurement(measure : serviceCallA) {}			}		}		expSetting1.experimentRuns.add(experimentRun)		def measurementRange = StorageUtility.addMeasurementRange(measurementServiceCallA, daoFactory)		measurementRange.rawMeasurements = builder.RawMeasurements() {}		StorageUtility.addDataSeries(measurementRange.rawMeasurements, daoFactory)		// Step 3: Run the experiment and generate measurements		experimentRun.startTime = new Date()		def Object[] data		def Random random = new Random()		for (i in 0..1000) {			data = [Measure.valueOf(i, timeUnit), Measure.valueOf(random.nextDouble() * 10.0, timeUnit)]			StorageUtility.storeMeasurement(measurementServiceCallA, data, storageFactory.getDaoRegistry())		}		// close all open experiment DAOs		for (ds in experimentRun.measurement.measurementRange.rawMeasurements.dataSeries.get(0).get(0)) {			storageFactory.getDaoRegistry().getEdp2Dao(ds.valuesUuid).close()		}				// Step 4: Calculate offline data (Statistics, Aggregation Functions)				// Save Model		save(defaultFileName, experimentGroup)				println "Storing measurements finished."	}		public def createDescription() {		def Unit timeUnit = SI.SECOND		def BaseMetricDescription SimTime		def BaseMetricDescription ResponseTime		def BaseMetricDescription DemandedTime		def BaseMetricDescription WaitingTime		def BaseMetricDescription AssignedThreads		def MetricSetDescription ResponseTimeSimulated		def MetricSetDescription DemandedTimeSimulated		def MetricSetDescription WaitingTimeSimulated		def MetricSetDescription AssignedThreadsSimulated		def Test		def description = builder.Descriptions() {			description {				SimTime = BaseMetricDescription(						uuid:'_38mSASUPEd6gmLudJva2Dw',						name:'Simulation Time',						textualDescription:'Time passed within a simulation. Starting with 0.0.',						captureType:CaptureType.RealNumber,						scale:Scale.Interval,						defaultUnit:timeUnit,						monotonic:Monotonic.Yes)				ResponseTime = BaseMetricDescription(						uuid:'_QC3ucCUQEd6gmLudJva2Dw',						name:'Response Time',						textualDescription:'Response Time, for example of a service call.',						captureType:CaptureType.RealNumber,						scale:Scale.Interval,						defaultUnit:timeUnit,						monotonic:Monotonic.No)				DemandedTime = BaseMetricDescription(						uuid:'_fvNrgCUQEd6gmLudJva2Dw',						name:'Demanded Time',						textualDescription:'Time demanded at an resource for processing.',						captureType:CaptureType.RealNumber,						scale:Scale.Interval,						defaultUnit:timeUnit,						monotonic:Monotonic.No)				WaitingTime = BaseMetricDescription(						uuid:'_nU2AICUQEd6gmLudJva2Dw',						name:'Waiting Time',						textualDescription:'Overall time spend waiting during a single resource demand.',						captureType:CaptureType.RealNumber,						scale:Scale.Interval,						defaultUnit:timeUnit,						monotonic:Monotonic.No)				AssignedThreads = BaseMetricDescription(						uuid:'_0xrYsCUQEd6gmLudJva2Dw',						name:'Assigned Threads',						textualDescription:'Number of threads assigned to a processor. This includes active as well as waiting threads.',						captureType:CaptureType.NaturalNumber,						scale:Scale.Interval,						defaultUnit:numberUnit,						monotonic:Monotonic.No)				ResponseTimeSimulated = MetricSetDescription(						uuid:'_MenvIiUREd6gmLudJva2Dw',						name:'Response Time (Simulated)',						textualDescription:'Response time determined in a simulation. Consists of the simulation time when the response time began and the response time itself.') {					subsumedMetrics {						SimTime						ResponseTime					}				}				DemandedTimeSimulated = MetricSetDescription(						uuid:'_tUkRciUREd6gmLudJva2Dw',						name:'Demanded Time (Simulated)',						textualDescription:'Demanded time determined in a simulation. Consists of the simulation time when the time was demanded and the demanded time itself.') {					subsumedMetrics {						SimTime						DemandedTime					}				}				WaitingTimeSimulated = MetricSetDescription(						uuid:'_3cXn4iUREd6gmLudJva2Dw',						name:'Waiting Time (Simulated)',						textualDescription:'Waiting time determined in a simulation. Consists of the simulation time when the waiting time is stored and the waiting time itself.') {					subsumedMetrics {						SimTime						WaitingTime					}				}				AssignedThreadsSimulated = MetricSetDescription(						uuid:'_M3ynoiUSEd6gmLudJva2Dw',						name:'Assigned Threads (Simulated)',						textualDescription:'Number of threads assigned to a processor within a simulation. Consists of the time when the number has changed and the new number of assigned threads itself.') {					subsumedMetrics {						SimTime						AssignedThreads					}				}			}		}		// test why this is necessary		ResponseTimeSimulated.subsumedMetrics.add(SimTime)		ResponseTimeSimulated.subsumedMetrics.add(ResponseTime)		DemandedTimeSimulated.subsumedMetrics.add(SimTime)		DemandedTimeSimulated.subsumedMetrics.add(DemandedTime)		WaitingTimeSimulated.subsumedMetrics.add(SimTime)		WaitingTimeSimulated.subsumedMetrics.add(WaitingTime)		AssignedThreadsSimulated.subsumedMetrics.add(SimTime)		AssignedThreadsSimulated.subsumedMetrics.add(AssignedThreads)		save(descriptionFileName, description)		println "Descriptions created."	}		public static void main(def args) {		def testGroovy = new Edp2GroovyMeasurementExample()		testGroovy.createDescription()		testGroovy.runExample()	}
}			