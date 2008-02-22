package de.uka.ipd.sdq.codegen.simucontroller;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleException;
import org.osgi.framework.BundleListener;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

import ch.ethz.iks.r_osgi.RemoteOSGiService;
import ch.ethz.iks.r_osgi.URI;
import ch.ethz.iks.r_osgi.service_discovery.ServiceDiscoveryHandler;
import de.uka.ipd.sdq.codegen.simucontroller.gui.DockModel;

/**
 * The activator class controls the plug-in life cycle
 */
public class SimuControllerPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.uka.ipd.sdq.codegen.simucontroller";

	// The shared instance
	private static SimuControllerPlugin plugin;

	private static DockModel dockModel = null;;
	
	/**
	 * The constructor
	 */
	public SimuControllerPlugin() {
		plugin = this;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		
		context.addBundleListener(new BundleListener(){

			public void bundleChanged(BundleEvent event) {
				if (event.getType() == BundleEvent.INSTALLED){
					
				}
			}
		});
		super.start(context);
		
		ensurePluginLoaded(context,"org.eclipse.equinox.event");
		ensurePluginLoaded(context,"org.eclipse.equinox.log");
		ensurePluginLoaded(context, "ch.ethz.iks.slp");
		ensurePluginLoaded(context,"ch.ethz.iks.r_osgi.remote");
		ensurePluginLoaded(context,"ch.ethz.iks.r_osgi.service_discovery.slp");
		
		dockModel = new DockModel(context);	
	}

	private void ensurePluginLoaded(BundleContext context, String bundleName) {
		for (Bundle b : context.getBundles()) {
			if (b.getSymbolicName().equals(bundleName)) {
				if (b.getState() != Bundle.ACTIVE){
					try {
						b.start();
						while (b.getState() != Bundle.ACTIVE){
							try {
								Thread.sleep(50);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					} catch (BundleException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		//extCache.shutdown();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 */
	public static SimuControllerPlugin getDefault() {
		return plugin;
	}

	public static void log(int severity, String message){
		plugin.getLog().log(new Status(severity,PLUGIN_ID,message));
	}

	public static DockModel getDockModel() {
		return dockModel;
	}

}
