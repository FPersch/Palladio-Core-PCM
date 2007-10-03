package de.uka.ipd.sdq.prototype.framework.strategies;

import java.util.HashMap;

import de.uka.ipd.sdq.measurement.strategies.activeresource.IDemandStrategy;
import de.uka.ipd.sdq.measurement.strategies.activeresource.ResourceTypeEnum;

public class DemandConsumerStrategiesRegistry {

	private HashMap<ResourceTypeEnum,IDemandStrategy> strategiesHash = new HashMap<ResourceTypeEnum, IDemandStrategy>();
	private static DemandConsumerStrategiesRegistry singletonInstance = new DemandConsumerStrategiesRegistry();
	
	private DemandConsumerStrategiesRegistry() {
	}

	public static DemandConsumerStrategiesRegistry singleton() {
		return singletonInstance;
	}
	
	public void registerStrategyFor(ResourceTypeEnum resourceType, IDemandStrategy strategy){
		strategiesHash.put(resourceType, strategy);
	}
	
	public IDemandStrategy getStrategyFor(ResourceTypeEnum resource) {
		if(!strategiesHash.containsKey(resource))
			throw new RuntimeException("Requested Resourcestrategy >"+resource+"< is not registered!");
		
		return strategiesHash.get(resource);
	}
}
