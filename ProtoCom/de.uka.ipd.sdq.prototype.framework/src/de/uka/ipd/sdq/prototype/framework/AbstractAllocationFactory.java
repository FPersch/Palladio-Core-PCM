package de.uka.ipd.sdq.prototype.framework;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Manages the sets of container ID, name and allocated components
 * 
 * @author zolynski
 */
public abstract class AbstractAllocationFactory 
{
	protected static AbstractAllocationFactory singleton;
	
	private static Map<String, String> containerIdToName = new HashMap<String, String>();
	private static HashMap<String, Collection<Class<?>>> containerIdToComponents = new HashMap<String, Collection<Class<?>>>();

	private static String activeContainer;
	
	/**
	 * Stores a tuple of container ID, name and one component
	 * 
	 * @param containerId		key, can be used multiple times
	 * @param containerName		value
	 * @param component			value
	 */
	protected static void saveContainerComponent(String containerId, String containerName, Class<?> component)
	{
		if (!containerIdToName.containsKey(containerId)) {
			containerIdToName.put(containerId, containerName);
			containerIdToComponents.put(containerId, new LinkedList<Class<?>>());
		}
		
		containerIdToComponents.get(containerId).add(component);
	}
	
	public static String getContainerName(String containerId)
	{
		return containerIdToName.get(containerId);
	}
	
	/**
	 * FIXME: Possible source of errors if two container have the same name?
	 * 
	 * @param container
	 * @return
	 */
	public static String getContainerID(String container)
	{
		for (Entry<String, String> entry : containerIdToName.entrySet()) {
			if (entry.getValue().equals(container)) {
				return entry.getKey();
			}
		}
		return null; 
	}
	
	/**
	 * Returns a set of all container ids
	 * 
	 * @return Set of container ids
	 */
	public static Collection<String> getContainerIds()
	{
		return containerIdToName.keySet();
	}
	
	/**
	 * Returns a set of all container names
	 * 
	 * @return Set of container names
	 */
	public static Collection<String> getContainerNames()
	{
		return containerIdToName.values();	
	}
	
	/**
	 * Returns a collection of components to a given container id
	 * 
	 * @param 	containerId
	 * @return	collection of components
	 */
	public static Collection<Class<?>> getComponents(String containerId)
	{
		return containerIdToComponents.get(containerId);
	}

	protected abstract void initContainerTemplate();
	
	public static void initContainer() {
		singleton.initContainerTemplate();
	}
	
	public static void initSingleton(AbstractAllocationFactory instance) {
		singleton = instance;
	}

	public static void setActiveContainer(String containerId) {
		activeContainer = containerId;
	}
	
	public static String getActiveContainer() {
		return activeContainer;
	}



}