package de.uka.ipd.sdq.measurements.driver.common.tasks;

import java.util.ArrayList;
import java.util.List;

import de.uka.ipd.sdq.measurements.rmi.tasks.RmiAbstractTask;
import de.uka.ipd.sdq.measurements.rmi.tasks.RmiLoopTask;
import de.uka.ipd.sdq.measurements.rmi.tasks.RmiParallelTask;
import de.uka.ipd.sdq.measurements.rmi.tasks.RmiSequenceTask;

public class TaskExecuterFactory implements TaskExecuterFactoryInterface{
	
	private static TaskExecuterFactory instance = null;
	
	public static TaskExecuterFactory getInstance() {
		if (instance == null) {
			instance = new TaskExecuterFactory();
		}
		return instance;
	}
	
	private TaskExecuterFactory() {
		subFactories = new ArrayList<TaskExecuterFactoryInterface>();
	}
	
	private List<TaskExecuterFactoryInterface> subFactories = null;
	
	/**
	 * Convert the task into a corresponding TaskExecuter object.
	 * If the TaskExecuterFactory does not know how to create certain executers,
	 * the corresponding factory method of the registered subfactories are called
	 * (Chain of Responsibility pattern)
	 */
	public AbstractTaskExecuter convertTask(RmiAbstractTask rmiTask, int numberOfTaskIterations, TaskFinishIndicator finishIndicator) {
		if (rmiTask.getClass().equals(RmiSequenceTask.class)) {
			SequenceTaskExecuter sequenceTaskExecuter = new SequenceTaskExecuter((RmiSequenceTask)rmiTask, numberOfTaskIterations, finishIndicator);
			//sequenceTaskExecuter.prepare();
			return sequenceTaskExecuter;
		} else if (rmiTask.getClass().equals(RmiParallelTask.class)) {
			ParallelTaskExecuter parallelTaskExecuter = new ParallelTaskExecuter((RmiParallelTask)rmiTask, numberOfTaskIterations, finishIndicator);
			//parallelTaskExecuter.prepare();
			return parallelTaskExecuter;

		} else if (rmiTask.getClass().equals(RmiLoopTask.class)) {
			LoopTaskExecuter loopTaskExecuter = new LoopTaskExecuter((RmiLoopTask)rmiTask, numberOfTaskIterations, finishIndicator);
			//loopTaskExecuter.prepare();
			return loopTaskExecuter;
		}
		// We cannot convert the task. Look if a subfactory can convert the task.
		for (TaskExecuterFactoryInterface factory : subFactories) {
			AbstractTaskExecuter executer = factory.convertTask(rmiTask, numberOfTaskIterations, finishIndicator);
			if (executer != null) {
				// We found a factory that converted the task.
				return executer;
			}
		}
		return null;
	}
	
	public void registerSubFactory(TaskExecuterFactoryInterface factory) {
		subFactories.add(factory);
	}
	
	public void unregisterSubFactory(TaskExecuterFactoryInterface factory) {
		subFactories.remove(factory);
	}

}
