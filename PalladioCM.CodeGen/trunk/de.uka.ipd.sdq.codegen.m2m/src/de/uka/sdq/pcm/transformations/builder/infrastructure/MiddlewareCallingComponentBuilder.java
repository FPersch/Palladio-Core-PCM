package de.uka.sdq.pcm.transformations.builder.infrastructure;

import de.uka.ipd.sdq.pcm.core.CoreFactory;
import de.uka.ipd.sdq.pcm.parameter.ParameterFactory;
import de.uka.ipd.sdq.pcm.parameter.VariableCharacterisation;
import de.uka.ipd.sdq.pcm.parameter.VariableCharacterisationType;
import de.uka.ipd.sdq.pcm.parameter.VariableUsage;
import de.uka.ipd.sdq.pcm.repository.Interface;
import de.uka.ipd.sdq.pcm.repository.Signature;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.VariableReference;
import de.uka.sdq.pcm.transformations.builder.seff.DelegatorComponentSeffBuilder;
import de.uka.sdq.pcm.transformations.builder.seff.MiddlewareComponentSeffBuilder;
import de.uka.sdq.pcm.transformations.builder.seff.SetVariableActionDescriptor;
import de.uka.sdq.pcm.transformations.builder.util.PCMAndCompletionModelHolder;

public class MiddlewareCallingComponentBuilder extends
		BasicMiddlewareComponentBuilder {

	private Signature preSignature;
	private Signature postSignature;
	
	public MiddlewareCallingComponentBuilder(
			PCMAndCompletionModelHolder models, 
			Interface providedIf,
			Interface requiredIf, 
			Interface middlewareInterface,
			ResourceContainer container,
			String preServiceName,
			String postServiceName) {
		super(models, providedIf, requiredIf, middlewareInterface, container);
		this.preSignature = findService(middlewareInterface,preServiceName);
		this.postSignature = findService(middlewareInterface,postServiceName);
	}

	@Override
	protected DelegatorComponentSeffBuilder getSeffBuilder() {
		MiddlewareComponentSeffBuilder builder = (MiddlewareComponentSeffBuilder) super.getSeffBuilder();
		builder.appendPreMiddlewareCall(
				preSignature);
		builder.appendPostMiddlewareCall(
				postSignature);
		builder.appendPostAction(new SetVariableActionDescriptor(
				createVariableUsage("stream", VariableCharacterisationType.BYTESIZE, "stream.BYTESIZE")));

		return builder;
	}

	private Signature findService(Interface middlewareInterface,
			String preServiceName) {
		for (Signature sig : middlewareInterface.getSignatures__Interface()){
			if (sig.getServiceName().equals(preServiceName))
				return sig;
		}
		throw new RuntimeException("Required middleware service not found in middleware interface");
	}

	protected VariableUsage createVariableUsage(String variableName, VariableCharacterisationType type, String spec) {
		VariableUsage usage = ParameterFactory.eINSTANCE.createVariableUsage();
		VariableCharacterisation characterisation = ParameterFactory.eINSTANCE.createVariableCharacterisation();
		VariableReference name = StoexFactory.eINSTANCE.createVariableReference();
		name.setReferenceName(variableName);
		characterisation.setSpecification_VariableCharacterisation(CoreFactory.eINSTANCE.createPCMRandomVariable());
		characterisation.getSpecification_VariableCharacterisation().setSpecification(spec);
		characterisation.setType(type);
		usage.setNamedReference_VariableUsage(name);
		usage.getVariableCharacterisation_VariableUsage().add(characterisation);
		
		return usage;
	}	
}
