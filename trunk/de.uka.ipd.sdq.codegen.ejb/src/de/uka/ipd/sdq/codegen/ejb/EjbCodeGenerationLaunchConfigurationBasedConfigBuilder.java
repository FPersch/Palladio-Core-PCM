package de.uka.ipd.sdq.codegen.ejb;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.launchconfig.ConstantsContainer;
import de.uka.ipd.sdq.workflow.pcm.configurations.AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice;
import de.uka.ipd.sdq.workflow.pcm.runconfig.SensitivityAnalysisConfiguration;

public class EjbCodeGenerationLaunchConfigurationBasedConfigBuilder 
extends
		AbstractWorkflowConfigurationBuilder {

	public EjbCodeGenerationLaunchConfigurationBasedConfigBuilder(
			ILaunchConfiguration configuration, String mode) throws CoreException {
		super(configuration,mode);
	}

	@Override
	public void fillConfiguration(AbstractWorkflowBasedRunConfiguration configuration) throws CoreException {
		EjbCodeGenerationConfiguration config = (EjbCodeGenerationConfiguration) configuration;
		
		config.setDebug(this.isDebug);

		config.setCleanupCode(getBooleanAttribute(ConstantsContainer.DELETE_PLUGIN));
		config.setPluginID(getStringAttribute(ConstantsContainer.PLUGIN_ID));
		
		config.setSensitivityAnalysisEnabled(
				hasValidSensitvityVariableAttribute(ConstantsContainer.VARIABLE_TEXT));
		if (config.isSensitivityAnalysisEnabled()) {
			SensitivityAnalysisConfiguration sensitivityConfig = 
				new SensitivityAnalysisConfiguration(
						"EJB Sensitivity",
						getStringAttribute(ConstantsContainer.VARIABLE_TEXT), 
						getDoubleAttribute(ConstantsContainer.MINIMUM_TEXT), 
						getDoubleAttribute(ConstantsContainer.MAXIMUM_TEXT), 
						getDoubleAttribute(ConstantsContainer.STEP_WIDTH_TEXT));
			config.setSensitivityAnalysisConfiguration(sensitivityConfig);
		}
		
		String modelToCodeTarget = getStringAttribute(ConstantsContainer.MODEL_TO_TEXT_CHOICE);
		if (ConstantsContainer.MODEL_TO_TEXT_TARGET_PROTO.equals(modelToCodeTarget)){
			config.setCodeGenerationAdvicesFile(CodeGenerationAdvice.PROTO);
		} else {
			config.setCodeGenerationAdvicesFile(CodeGenerationAdvice.EJB3);
		}
		
		
	}
	
	private boolean hasValidSensitvityVariableAttribute(String attribute) throws CoreException {
		if (!configuration.hasAttribute(attribute))
			return false;
		Object value = getStringAttribute(attribute);
		//Anne: I sometimes get a "NO ELEMENT SELECTED" result from the LaunchConfig even if I deleted the string from the field
		//I have no idea how to fix it directly, so I need to catch it here. 
		//It seems to only appear in the Design Space Exploration tab. 
		return value instanceof String && !value.equals("") && !value.equals("NO ELEMENT SELECTED");
	}
	
}
