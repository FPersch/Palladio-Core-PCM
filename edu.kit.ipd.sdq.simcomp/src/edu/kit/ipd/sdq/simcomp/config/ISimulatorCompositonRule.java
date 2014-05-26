package edu.kit.ipd.sdq.simcomp.config;

import java.util.Map;

import edu.kit.ipd.sdq.simcomp.component.meta.SimulationComponentMeta;
import edu.kit.ipd.sdq.simcomp.component.meta.SimulationComponentType;
import edu.kit.ipd.sdq.simcomp.component.meta.SimulationContextField;

/**
 * Represents a rules for the dynamic simulation component composition
 * 
 * @author Christoph Föhrdes
 *
 */
public interface ISimulatorCompositonRule {
	
	public static String ANY_VALUE = "*";

	public SimulationComponentType getComponentType();

	public Map<SimulationContextField, String> getFieldValues();

	public SimulationComponentMeta getComponent();
}
