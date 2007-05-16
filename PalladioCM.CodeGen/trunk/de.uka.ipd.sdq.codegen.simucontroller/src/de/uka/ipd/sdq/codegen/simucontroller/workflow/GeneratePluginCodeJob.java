package de.uka.ipd.sdq.codegen.simucontroller.workflow;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.openarchitectureware.workflow.WorkflowRunner;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.ResourceManagerTab;

/**
 * Start the Workflow-Engine of oAW - Generator
 */
public class GeneratePluginCodeJob implements ISimulationJob {

	private final static String REPOSITORY_FILE = "codegen_repository.oaw";
	private final static String SYSTEM_FILE = "codegen_system.oaw";
	private final static String USAGE_FILE = "codegen_usage.oaw";
	private final static String TEMPLATE_METHODS = "simulation_template_methods";

	private final String[] myWorkflowFiles = { REPOSITORY_FILE, SYSTEM_FILE,
			USAGE_FILE };

	private ILaunchConfiguration myConfiguration;

	public GeneratePluginCodeJob(ILaunchConfiguration configuration) {
		myConfiguration = configuration;
	}

	public void execute() throws Exception {
		assert (myConfiguration != null);

		Map<String, String> properties = new HashMap<String, String>();
		Map<String, Object> slotContents = new HashMap<String, Object>();

		String workspaceLocation = null;

		try {
			workspaceLocation = ResourcesPlugin.getWorkspace().getRoot()
					.getRawLocationURI().getPath();
		} catch (Exception e) {
			throw new Exception("Getting workspace location failed", e);
		}

		try {
			properties.put("aop_templates", TEMPLATE_METHODS);
			properties.put("workspace_loc", workspaceLocation);

			properties.put(ResourceManagerTab.REPOSITORY_FILE, myConfiguration
					.getAttribute(ResourceManagerTab.REPOSITORY_FILE, ""));
			properties.put(ResourceManagerTab.SYSTEM_FILE, myConfiguration
					.getAttribute(ResourceManagerTab.SYSTEM_FILE, ""));
			properties.put(ResourceManagerTab.ALLOCATION_FILE, myConfiguration
					.getAttribute(ResourceManagerTab.ALLOCATION_FILE, ""));
			properties.put(ResourceManagerTab.USAGE_FILE, myConfiguration
					.getAttribute(ResourceManagerTab.USAGE_FILE, ""));
			properties.put(ResourceManagerTab.OUTPUT_PATH, myConfiguration
					.getAttribute(ResourceManagerTab.OUTPUT_PATH, ""));

		} catch (Exception e) {
			throw new Exception("Setting up properties failed", e);
		}

		for (String workflowFile : myWorkflowFiles) {
			try {
				WorkflowRunner runner = new WorkflowRunner();
				if (!runner
						.run(
								workflowFile,
								new org.openarchitectureware.workflow.monitor.NullProgressMonitor(),
								properties, slotContents)) {
					throw new Exception("oAW workflow returned false: "
							+ workflowFile);
				}
			} catch (Exception e) {
				throw new Exception("Running oAW workflow failed: "
						+ workflowFile, e);
			}
		}
	}

	public String getName() {
		return "Generate Plugin Code";
	}

	public void rollback() throws Exception {
	}
}