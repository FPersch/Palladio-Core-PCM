package edu.kit.ipd.sdq.simcomp.middleware;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import de.uka.ipd.sdq.probespec.framework.BlackboardFactory;
import de.uka.ipd.sdq.probespec.framework.ISampleBlackboard;
import de.uka.ipd.sdq.probespec.framework.ProbeSpecContext;
import de.uka.ipd.sdq.probespec.framework.ProbeType;
import de.uka.ipd.sdq.probespec.framework.RequestContext;
import de.uka.ipd.sdq.probespec.framework.garbagecollection.IRegionBasedGarbageCollector;
import de.uka.ipd.sdq.probespec.framework.probes.ProbeStrategyRegistry;
import de.uka.ipd.sdq.simulation.AbstractSimulationConfig;
import de.uka.ipd.sdq.simulation.IStatusObserver;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimEngineFactory;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimulationControl;
import de.uka.ipd.sdq.simulation.preferences.SimulationPreferencesHelper;
import edu.kit.ipd.sdq.simcomp.component.AbstractSimulationContext;
import edu.kit.ipd.sdq.simcomp.component.IPCMModel;
import edu.kit.ipd.sdq.simcomp.component.ISimulationComponent;
import edu.kit.ipd.sdq.simcomp.component.ISimulationMiddleware;
import edu.kit.ipd.sdq.simcomp.component.meta.IContextFieldValueProvider;
import edu.kit.ipd.sdq.simcomp.component.meta.SimulationComponentMeta;
import edu.kit.ipd.sdq.simcomp.component.meta.SimulationComponentType;
import edu.kit.ipd.sdq.simcomp.component.meta.SimulationContextField;
import edu.kit.ipd.sdq.simcomp.config.ISimulationConfiguration;
import edu.kit.ipd.sdq.simcomp.config.ISimulatorCompositonRule;
import edu.kit.ipd.sdq.simcomp.events.IEventHandler;
import edu.kit.ipd.sdq.simcomp.events.SimulationEvent;
import edu.kit.ipd.sdq.simcomp.events.SimulationFinalizeEvent;
import edu.kit.ipd.sdq.simcomp.events.SimulationStopEvent;
import edu.kit.ipd.sdq.simcomp.middleware.probespec.CalculatorFactory;
import edu.kit.ipd.sdq.simcomp.middleware.probespec.SimCompGarbageCollector;
import edu.kit.ipd.sdq.simcomp.middleware.probespec.probes.TakeSimulatedTimeStrategy;
import edu.kit.ipd.sdq.simcomp.middleware.simulation.MaxMeasurementsStopCondition;
import edu.kit.ipd.sdq.simcomp.middleware.simulation.SimulationModel;
import edu.kit.ipd.sdq.simcomp.middleware.simulation.config.SimulationConfiguration;

/**
 * The simulation middleware is the central point of the simulation component
 * based simulation. This component is activated in the simulator launch
 * configuration.
 * 
 * @author Christoph Föhrdes
 */
public class SimulationMiddleware implements ISimulationMiddleware {

	private static final Logger logger = Logger.getLogger(SimulationMiddleware.class);

	private Activator middlewareActivator;
	private SimulationModel simModel;
	private ISimulationControl simControl;
	private ISimulationConfiguration simConfig;
	private IPCMModel pcmModel;
	private EventAdmin eventAdmin;
	private ProbeSpecContext probeSpecContext;
	private int measurementCount;
	private List<ServiceRegistration<?>> eventHandlerRegistry;

	public SimulationMiddleware() {
		this.eventHandlerRegistry = new ArrayList<ServiceRegistration<?>>();
	}

	@Override
	public List<SimulationComponentType> getSimulationComponentMetaData() {
		return SimulationComponentMetaCollector.buildComponentMetaData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initialize(ISimulationConfiguration config, IPCMModel pcmModel) {
		this.pcmModel = pcmModel;
		this.simConfig = config;

		if (logger.isInfoEnabled()) {
			logger.info("Initializing middleware");
		}

		// Create the simulation model (this model is control and not the
		// subject of the simulation)
		ISimEngineFactory factory = SimulationPreferencesHelper.getPreferredSimulationEngine();
		if (factory == null) {
			throw new RuntimeException("There is no simulation engine available. Install at least one engine.");
		}

		this.simModel = new SimulationModel(factory, this);
		factory.setModel(simModel);
		this.simControl = simModel.getSimulationControl();

		// Prepare event admin service
		BundleContext bundleContext = Activator.getContext();
		ServiceReference<EventAdmin> eventAdminServiceReference = bundleContext.getServiceReference(EventAdmin.class);
		this.eventAdmin = bundleContext.getService(eventAdminServiceReference);

		this.initPropeFramework();

		this.registerEventHandler();

		this.setupStopConditions(config);
	}

	/**
	 * Initialize probe framework
	 */
	private void initPropeFramework() {
		// initialize probe specification context
		probeSpecContext = new ProbeSpecContext();

		// create a blackboard of the specified type
		AbstractSimulationConfig config = (AbstractSimulationConfig) this.getSimulationConfiguration();
		ISampleBlackboard blackboard = BlackboardFactory.createBlackboard(config.getBlackboardType(), probeSpecContext.getThreadManager());

		// initialize ProbeSpecification context
		probeSpecContext.initialise(blackboard, new ProbeStrategyRegistry(), new CalculatorFactory(this));

		// install garbage collector which removes samples when they become
		// obsolete
		IRegionBasedGarbageCollector<RequestContext> garbageCollector = new SimCompGarbageCollector(blackboard);
		probeSpecContext.setBlackboardGarbageCollector(garbageCollector);

		// register simulation time strategy
		probeSpecContext.getProbeStrategyRegistry().registerProbeStrategy(new TakeSimulatedTimeStrategy(), ProbeType.CURRENT_TIME, null);
	}

	/**
	 * Register event handler to react on specific simulation events.
	 */
	private void registerEventHandler() {

		// setup system processed request event listener
		this.registerEventHandler(SimulationFinalizeEvent.EVENT_ID, new IEventHandler<SimulationFinalizeEvent>() {

			@Override
			public void handle(SimulationFinalizeEvent event) {
				finalise();
			}

		});

	}

	/**
	 * Setup the simulation stop conditions based on the simulation
	 * configuration.
	 * 
	 * @param config
	 *            A simulation configuration
	 */
	private void setupStopConditions(ISimulationConfiguration simConfig) {

		this.measurementCount = 1;
		SimulationConfiguration config = (SimulationConfiguration) simConfig;
		long maxMeasurements = config.getMaxMeasurementsCount();
		long maxSimulationTime = config.getSimuTime();

		if (maxMeasurements <= 0 && maxSimulationTime <= 0) {
			if (logger.isDebugEnabled()) {
				logger.debug("Deactivating maximum simulation time stop condition per user request");
			}
			this.getSimulationControl().setMaxSimTime(0);
		} else {
			if (logger.isDebugEnabled()) {
				logger.debug("Enabling simulation stop condition at maximum simulation time of " + maxSimulationTime);
			}

			if (maxSimulationTime > 0) {
				this.getSimulationControl().setMaxSimTime(maxSimulationTime);
			}
		}

		this.getSimulationControl().addStopCondition(new MaxMeasurementsStopCondition(this));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ISimulationComponent getSimulationComponent(Class<? extends ISimulationComponent> componentType, List<? extends ISimulationComponent> componentList, AbstractSimulationContext context) {

		// lookup by context has highest priority
		if (context != null) {

			// TODO (SimComp): cache matches in map context -> component

			List<ISimulatorCompositonRule> compositionRules = this.simConfig.getCompositionRulesForComponentType(componentType);
			// iterate in reverse order
			for (int i = 0; i < compositionRules.size(); i++) {
				ISimulatorCompositonRule compositonRule = compositionRules.get(compositionRules.size() - 1 - i);
				boolean match = true;
				// iterate fields and check for match
				Map<SimulationContextField, String> fieldValues = compositonRule.getFieldValues();
				for (SimulationContextField ruleContextField : fieldValues.keySet()) {
					String ruleValue = fieldValues.get(ruleContextField);
					String ctxValue = context.getValue(ruleContextField.getId());
					if (!ruleValue.equals(ISimulatorCompositonRule.ANY_VALUE) && !ruleValue.equals(ctxValue)) {
						match = false;
					}
				}

				// all fields matched the provided context values
				if (match) {
					return getComponentForComponentMeta(compositonRule.getComponent(), componentList);
				}
			}
		}

		// context-based lookup was not successful return default component
		SimulationComponentMeta defaultComponentMeta = this.simConfig.getDefaultComponentForComponentType(componentType);

		return getComponentForComponentMeta(defaultComponentMeta, componentList);
	}

	/**
	 * Searches for a simulation component matching the provided meta data in
	 * the given list of components.
	 * 
	 * @param componentMeta
	 *            Meta data of a simulation component
	 * @param componentList
	 *            List of components to search in
	 * @return A simulation component instance or null if could not be found
	 */
	private ISimulationComponent getComponentForComponentMeta(SimulationComponentMeta componentMeta, List<? extends ISimulationComponent> componentList) {
		for (ISimulationComponent component : componentList) {
			if (componentMeta.getComponentClass().equals(component.getClass().getName())) {
				return component;
			}
		}

		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void startSimulation(final IStatusObserver statusObserver) {
		if (logger.isInfoEnabled()) {
			logger.info("Simulation Started");
		}

		// set up an observer for the simulation progress
		final SimulationConfiguration config = (SimulationConfiguration) this.getSimulationConfiguration();
		final long simStopTime = config.getSimuTime();
		this.simControl.addTimeObserver(new Observer() {

			public void update(final Observable clock, final Object data) {

				int timePercent = (int) (getSimulationControl().getCurrentSimulationTime() * 100 / simStopTime);
				int measurementsPercent = (int) (getMeasurementCount() * 100 / config.getMaxMeasurementsCount());

				if (timePercent < measurementsPercent) {
					statusObserver.updateStatus(measurementsPercent, (int) getSimulationControl().getCurrentSimulationTime(), getMeasurementCount());
				} else {
					statusObserver.updateStatus(timePercent, (int) getSimulationControl().getCurrentSimulationTime(), getMeasurementCount());
				}

			}

		});

		this.simControl.start();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void stopSimulation() {
		// trigger the simulation stop event
		this.triggerEvent(new SimulationStopEvent());

		this.simControl.stop();
	}

	/**
	 * Called after a simulation run to perform some clean up.
	 */
	private void finalise() {
		if (logger.isDebugEnabled()) {
			logger.debug("Cleaning up...");
		}

		this.probeSpecContext.finish();

		if (logger.isEnabledFor(Level.INFO)) {
			logger.info("Simulation took " + this.getSimulationControl().getCurrentSimulationTime() + " simulation seconds");
		}
	}

	@Override
	public void triggerEvent(SimulationEvent event) {
		if (logger.isInfoEnabled()) {
			logger.info("Event triggered (" + event.getEventId() + ")");
		}

		// we delegate the event to the OSGi event admin service
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(SimulationEvent.SIMCOMP_EVENT_PROPERTY, event);
		eventAdmin.sendEvent(new Event(event.getEventId(), properties));

	}

	@Override
	@SuppressWarnings("rawtypes")
	public void registerEventHandler(String eventId, final IEventHandler handler) {

		// we delegate the event handling to the OSGi event admin service
		BundleContext bundleContext = Activator.getContext();
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EventConstants.EVENT_TOPIC, eventId);
		ServiceRegistration<?> handlerService = bundleContext.registerService(EventHandler.class.getName(), new EventHandler() {

			@Override
			@SuppressWarnings("unchecked")
			public void handleEvent(Event event) {
				SimulationEvent simulationEvent = (SimulationEvent) event.getProperty(SimulationEvent.SIMCOMP_EVENT_PROPERTY);
				handler.handle(simulationEvent);
			}

		}, properties);

		// store service reference for later cleanup
		this.eventHandlerRegistry.add(handlerService);
	}

	/**
	 * Gives access to the simulation configuration of the current simulation
	 * run.
	 * 
	 * @return A simulation configuration
	 */
	public ISimulationConfiguration getSimulationConfiguration() {
		return this.simConfig;
	}

	/**
	 * Returns the PCM model to be simulated. If it has not been loaded before,
	 * this methods loads the PCM model from the bundle.
	 * 
	 * @return a PCM model instance
	 */
	@Override
	public IPCMModel getPCMModel() {
		return this.pcmModel;
	}

	@Override
	public void increaseMeasurementCount() {
		logger.info(measurementCount);
		measurementCount++;
	}

	@Override
	public int getMeasurementCount() {
		return measurementCount;
	}

	@Override
	public ProbeSpecContext getProbeSpecContext() {
		return probeSpecContext;
	}

	@Override
	public SimulationModel getSimulationModel() {
		return simModel;
	}

	@Override
	public ISimulationControl getSimulationControl() {
		return simControl;
	}

	/**
	 * Declarative service lifecycle method called when the middleware component
	 * is activated.
	 * 
	 * @param context
	 */
	public void activate(ComponentContext context) {
		System.out.println("SimulationMiddleware activated");

		this.middlewareActivator = Activator.getDefault();
		this.middlewareActivator.bindSimulationMiddleware(this);
	}

	/**
	 * Declarative service lifecycle method called when the middleware component
	 * is deactivated.
	 * 
	 * @param context
	 */
	public void deactivate(ComponentContext context) {
		System.out.println("SimulationMiddleware deactivated");

		this.middlewareActivator.unbindSimulationMiddleware();
		this.middlewareActivator = null;
	}

	@Override
	public IContextFieldValueProvider getValueProviderForContextField(SimulationContextField field) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint(SimulationComponentMetaCollector.SIMCOMP_TYPE_EXTENSION_POINT);
		IConfigurationElement[] elements = point.getConfigurationElements();

		for (IConfigurationElement configurationElement : elements) {
			String id = configurationElement.getAttribute("id");
			if (field.getComponentType().getId().equals(id)) {

				IConfigurationElement[] fieldElements = configurationElement.getChildren("simulation_context_field");
				for (IConfigurationElement fieldElement : fieldElements) {

					String fieldId = fieldElement.getAttribute("id");
					if (field.getId().equals(fieldId)) {
						Object valueProvider = null;
						try {
							valueProvider = fieldElement.createExecutableExtension("value_provider");
						} catch (CoreException e) {
							e.printStackTrace();
						}
						if (!(valueProvider instanceof IContextFieldValueProvider)) {
							throw new IllegalArgumentException("No valid context field value provider for field " + id);
						}

						return (IContextFieldValueProvider) valueProvider;
					}
				}
			}
		}

		return null;
	}

}