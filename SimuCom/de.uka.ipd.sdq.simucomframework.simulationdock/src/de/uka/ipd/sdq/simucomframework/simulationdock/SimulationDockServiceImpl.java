package de.uka.ipd.sdq.simucomframework.simulationdock;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.util.tracker.ServiceTracker;

import de.uka.ipd.sdq.simucomframework.ISimuComControl;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.simucomframework.SimuComResult;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimuComStatus;

public class SimulationDockServiceImpl implements SimulationDockService {

	public static final String SIMTIME_TOTAL = "SIMTIMETOTAL";

	protected static Logger logger = 
		Logger.getLogger(SimulationDockServiceImpl.class.getName());
	
	private BundleContext context;
	private String myID = EcoreUtil.generateUUID();
	private ServiceTracker service;
	private ServiceTracker eventService;
	private EventAdmin eventAdmin;

	private DebugObserver debugObserver;

	public SimulationDockServiceImpl(BundleContext context) {
		this.context = context;
		ServiceReference eventServiceRef = context.getServiceReference(EventAdmin.class.getName());
		eventService = new ServiceTracker(context,eventServiceRef,null);
		eventService.open();
		eventAdmin = (EventAdmin)eventService.getService();
		
		logger.addAppender(new ConsoleAppender(new PatternLayout(),ConsoleAppender.SYSTEM_OUT));
		logger.debug("Simulation Dock Started");
	}
	
	@Override
	protected void finalize() throws Throwable {
		eventService.close();
		super.finalize();
	}

	public void simulate(SimuComConfig config, byte[] simulationBundle, boolean isRemoteRun) {
		sendEvent("de/uka/ipd/sdq/simucomframework/simucomdock/DOCK_BUSY");

		if (config.isDebug()) {
			this.debugObserver = new DebugObserver(eventAdmin,this);
		} else {
			this.debugObserver = null;
		}

		ensurePluginLoaded(context, "org.eclipse.equinox.event");
		unloadPluginIfExists(context, "de.uka.ipd.sdq.codegen.simucominstance");
		try {
			loadAndSimulateBundle(config, simulationBundle, eventAdmin, isRemoteRun);
		} catch (Exception e) {
			throw new RuntimeException("Simulation failed",e);
		} finally {
			unloadPluginIfExists(context, "de.uka.ipd.sdq.codegen.simucominstance");
			sendEvent("de/uka/ipd/sdq/simucomframework/simucomdock/DOCK_IDLE");
		}
	}

	private void loadAndSimulateBundle(SimuComConfig config,
			byte[] simulationBundle, EventAdmin eventAdmin, boolean isRemoteRun) {
		String bundleLocation = persistBundleInTempDir(simulationBundle);
		Bundle simulationBundleRef = null;
		try {
			simulationBundleRef = context.installBundle(new File(bundleLocation).toURI().toString());
			simulationBundleRef.start();
			
			simulate(config, simulationBundleRef, eventAdmin, isRemoteRun);
		} catch (BundleException e) {
			throw new RuntimeException("OSGi failure",e);
		} finally {
			if (simulationBundleRef != null) {
				try {
					if (simulationBundleRef.getState() == Bundle.ACTIVE)
						simulationBundleRef.stop();

					simulationBundleRef.uninstall();
				} catch (BundleException e) {
					throw new RuntimeException("OSGi failure",e);
				}
			}
		}
	}

	private void simulate(final SimuComConfig config, Bundle simulationBundleRef, final EventAdmin eventAdmin, boolean isRemoteRun) {
		ServiceReference[] services = simulationBundleRef.getRegisteredServices();
		assert services.length == 1;
		long start = -1;
		
		service = new ServiceTracker(context,services[0],null);
		service.open();
		try {
			DispatchingSimulationObserver simulationObservers = new DispatchingSimulationObserver();
			simulationObservers.addObserver(new SimulationProgressReportingObserver(config,eventAdmin,this));
			if (debugObserver != null) {
				simulationObservers.addObserver(debugObserver);
			}
			
			start = System.nanoTime();
			sendEvent("de/uka/ipd/sdq/simucomframework/simucomdock/SIM_STARTED");
			SimuComResult result = ((ISimuComControl)service.getService()).startSimulation(
					config, simulationObservers, isRemoteRun);
			
			if (result == SimuComResult.ERROR) {
				throw new RuntimeException("Simulation failed.",((ISimuComControl)service.getService()).getErrorThrowable());
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		} finally {
			service.close();
			Hashtable<String, Object> eventData = new Hashtable<String, Object>();
			eventData.put(SIMTIME_TOTAL, System.nanoTime()-start);
			sendEvent("de/uka/ipd/sdq/simucomframework/simucomdock/SIM_STOPPED",eventData);
		}
	}

	public void suspend() {
		if (debugObserver == null)
			throw new IllegalStateException("Suspend only available in debug mode");
		debugObserver.suspend();
	}

	public void resume() {
		if (debugObserver == null)
			throw new IllegalStateException("Suspend only available in debug mode");
		debugObserver.resume();
	}

	private void sendEvent(String topic) {
		sendEvent(topic, new Hashtable());
	}
	
	private void sendEvent(String topic, Hashtable newProperties) {
		Hashtable properties = new Hashtable();
		properties.put("DOCK_ID", SimulationDockServiceImpl.this.getDockId());
		properties.putAll(newProperties);
		Event event = new Event(topic, (Map)properties);
		eventAdmin.sendEvent(event);
	}
	
	private String persistBundleInTempDir(byte[] simulationBundle) {
		File tempFile = null;
		try {
			tempFile = File.createTempFile("simucominstance", ".jar");
			tempFile.deleteOnExit();
			FileOutputStream fos = new FileOutputStream(tempFile);
			fos.write(simulationBundle);
			fos.close();
		} catch (IOException e) {
			throw new RuntimeException("OSGi failure",e);
		}
		return tempFile.getAbsolutePath();
	}

	public String getDockId() {
		return myID;
	}

	private void unloadPluginIfExists(BundleContext context, String bundleName) {
		for (Bundle b : context.getBundles()) {
			if (b.getSymbolicName() != null && b.getSymbolicName().equals(bundleName)) {
				try {
					if (b.getState() == Bundle.ACTIVE){
						b.stop();
					}
					b.uninstall();
				} catch (BundleException e) {
					throw new RuntimeException("OSGi failure",e);
				}
			}
		}
	}
	
	private void ensurePluginLoaded(BundleContext context, String bundleName) {
		for (Bundle b : context.getBundles()) {
			if (b.getSymbolicName() != null && b.getSymbolicName().equals(bundleName)) {
				if (b.getState() != Bundle.ACTIVE){
					try {
						b.start();
					} catch (BundleException e) {
						throw new RuntimeException("OSGi failure",e);
					}
				}
			}
		}
	}

	public void stopSimulation() {
		((ISimuComControl)service.getService()).stopSimulation();
		if (debugObserver != null) {
			debugObserver.resume();
		}
	}

	public void step() {
		if (debugObserver == null)
			throw new IllegalStateException("Stepping only available in debug mode");
		debugObserver.step();
	}

	public SimuComStatus getSimuComStatus() {
		return ((ISimuComControl)service.getService()).getStatus();
	}
}