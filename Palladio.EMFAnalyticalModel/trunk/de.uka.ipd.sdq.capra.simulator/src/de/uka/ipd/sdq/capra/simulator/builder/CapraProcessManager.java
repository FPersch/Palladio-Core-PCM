package de.uka.ipd.sdq.capra.simulator.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import scheduler.configuration.ActiveResourceConfiguration;
import scheduler.configuration.ProcessConfiguration;
import de.uka.ipd.sdq.capra.ReplicatedProcess;
import de.uka.ipd.sdq.capra.simulator.expressions.SimCapraExpression;
import de.uka.ipd.sdq.capra.simulator.measurement.sensors.SimSensor;
import de.uka.ipd.sdq.capra.simulator.processes.SimProcessGroup;
import de.uka.ipd.sdq.scheduler.IActiveResource;
import de.uka.ipd.sdq.scheduler.IRunningProcess;
import de.uka.ipd.sdq.scheduler.ISchedulableProcess;
import de.uka.ipd.sdq.scheduler.ISchedulingFactory;

/**
 * Manages the processes in a system. Following the builder pattern.
 * 
 * @author jens
 * 
 */
public class CapraProcessManager {
	
	private ISchedulingFactory schedulingFactory = ISchedulingFactory.eINSTANCE;
	private Map<String, ProcessConfiguration> config_map = new Hashtable<String, ProcessConfiguration>();
	private List<SimProcessGroup> process_group_list = new ArrayList<SimProcessGroup>();
	private CapraExpressionFactory expressionFactory = new CapraExpressionFactory();
	private CapraExpressionTransformer expressionTransformer;
	private SensorManager sensorManager;
	private Map<String, List<IRunningProcess>> running_process_map = new Hashtable<String, List<IRunningProcess>>();
	
	public CapraProcessManager(ResourceManager resourceManager, SensorManager sensorManager) {
		expressionTransformer = new CapraExpressionTransformer(resourceManager, sensorManager, expressionFactory);
		this.sensorManager = sensorManager;
	}
	
	public void loadProcessConfigurations(
			EList<ProcessConfiguration> processConfigurationList) {
		for (ProcessConfiguration processConfiguration : processConfigurationList) {
			addProcessConfiguration(processConfiguration);
		}
	}

	public void loadProcesses(EList<ReplicatedProcess> processList) {
		for (ReplicatedProcess replicatedProcess : processList) {
			SimProcessGroup processGroup = createProcessGroup(replicatedProcess);
			addProcessGroup(processGroup);
		}
	}

	public void registerTo(IActiveResource resource, ActiveResourceConfiguration resource_config) {
		for (SimProcessGroup processGroup : process_group_list) {
			ProcessConfiguration process_config = getConfigFor(processGroup);
			for (ISchedulableProcess process : processGroup.getProcesses()) {
				IRunningProcess runningProcess = schedulingFactory.createRunningProcess(process, process_config, resource_config);
				resource.registerNewProcess(runningProcess);
				addRunningProcess(runningProcess, resource);
			}
		}
	}
	
	private void addRunningProcess(IRunningProcess runningProcess,
			IActiveResource resource) {
		List<IRunningProcess> process_list = running_process_map.get(resource.getName());
		if (process_list == null){
			process_list = new ArrayList<IRunningProcess>();
			running_process_map.put(resource.getName(), process_list);
		}
		process_list.add(runningProcess);
	}

	private SimProcessGroup createProcessGroup(
			ReplicatedProcess replicatedProcess) {
		ProcessConfiguration config = getConfigFor(replicatedProcess);
		SimCapraExpression behaviour = expressionTransformer.transformCapraExpression(replicatedProcess.getProcessvariable().getProcess());
		String name = config.getName();
		String id = config.getId();
		int numReplicas = config.getReplicas();
		Collection<SimSensor> sensorColl = sensorManager.getSensors();
		SimProcessGroup processGroup = new SimProcessGroup(behaviour,name, id, numReplicas, sensorColl );
		return processGroup;
	}


	private ProcessConfiguration getConfigFor(
			ReplicatedProcess replicatedProcess) {
		return config_map.get(replicatedProcess.getProcessvariable().getName());
	}

	private ProcessConfiguration getConfigFor(SimProcessGroup processGroup) {
		return config_map.get(processGroup.getName());
	}

	private void addProcessGroup(SimProcessGroup processGroup) {
		process_group_list.add(processGroup);
	}
	
	private void addProcessConfiguration(
			ProcessConfiguration processConfiguration) {
		config_map.put(processConfiguration.getName(), processConfiguration);
	}

	public void start() {
		for (SimProcessGroup processGroup : process_group_list) {
			processGroup.schedule(0);
		}
	}

	public int numberOfProcesses() {
		int result = 0;
		for (SimProcessGroup processGroup : process_group_list) {
			result += processGroup.getProcesses().length;
		}
		return result;
	}
}
