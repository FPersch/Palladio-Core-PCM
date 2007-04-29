package de.uka.ipd.sdq.pcmsolver.handler;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.context.allocation.ActualAllocationContext;
import de.uka.ipd.sdq.context.allocation.AllocationFactory;
import de.uka.ipd.sdq.context.usage.UsageContext;
import de.uka.ipd.sdq.context.usage.UsageFactory;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyConnector;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.parameter.ParameterFactory;
import de.uka.ipd.sdq.pcm.parameter.VariableCharacterisation;
import de.uka.ipd.sdq.pcm.parameter.VariableUsage;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.Interface;
import de.uka.ipd.sdq.pcm.repository.Signature;
import de.uka.ipd.sdq.pcm.seff.ExternalCallAction;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;
import de.uka.ipd.sdq.pcm.seff.util.SeffSwitch;
import de.uka.ipd.sdq.pcmsolver.models.Context;
import de.uka.ipd.sdq.pcmsolver.visitors.EMFHelper;
import de.uka.ipd.sdq.pcmsolver.visitors.ExpressionHelper;
import de.uka.ipd.sdq.pcmsolver.visitors.SeffVisitor;
import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.NamespaceReference;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.VariableReference;

public class ExternalCallActionHandler {
	
	private SeffVisitor visitor;
	
	private UsageFactory usageFactory = UsageFactory.eINSTANCE;
	
	private AllocationFactory actualAllocationFactory = AllocationFactory.eINSTANCE;
	
	private ParameterFactory parameterFactory = ParameterFactory.eINSTANCE;
	
	private static Logger logger = Logger.getLogger(ExternalCallActionHandler.class.getName());
	
	public ExternalCallActionHandler(SeffVisitor seffVisitor){
		visitor=seffVisitor;
	}
	
	/**
	 * @param call
	 */
	public void handle(ExternalCallAction call) {
		Signature serviceToBeCalled = call.getCalledService_ExternalService();
		Interface requiredInterface = (Interface) serviceToBeCalled
				.eContainer();
		
		EList<VariableUsage> parametricParameterUsages = 
			call.getParameterUsage_ExternalCallAction();
			
		AssemblyConnector foundAssemblyConnector = 
			findAssemblyConnector(requiredInterface);
		
		if (foundAssemblyConnector == null) {
			//logger.debug("Found System External Call");
			// TODO: handle system external call
		} else {
			//logger.debug("Found Assembly Connector");
			SeffVisitor nextVisitor = visitNextSeff(serviceToBeCalled, 
					parametricParameterUsages, 
					foundAssemblyConnector);
			storeOutputParametersToUsageContext(call, nextVisitor);
		}
	}
	
	private void storeOutputParametersToUsageContext(ExternalCallAction call, SeffVisitor nextVisitor) {
		UsageContext uc = visitor.getMyContext().getUsageContext();
		String returnName = call.getCalledService_ExternalService().getServiceName() + ".RETURN";

		EList outputParamsProducedByExtCall = nextVisitor.getMyContext().getUsageContext().getActualParameterUsage_UsageContext();
		for (Object o : outputParamsProducedByExtCall){
			VariableUsage vu = (VariableUsage)o;
			String paramName = getFullParameterName(vu.getNamedReference_VariableUsage());
		//	if (paramName.toUpperCase().equals(returnName.toUpperCase())){
			if (paramName.toUpperCase().equals(returnName.toUpperCase()) ||
				paramName.toUpperCase().equals(returnName.toUpperCase()+".INNER")){
				copySolvedVariableUsageToUsageContext(uc, vu);
				//uc.getActualParameterUsage_UsageContext().add(vu);
			} else if (paramName.toUpperCase().endsWith("OUT")){
				//TODO
			}
		}
		
		EList<VariableUsage> outputParamsDeclaredInSeff = call.getOutputVariableUsage_ExternalCallAction();
		for (VariableUsage vu : outputParamsDeclaredInSeff){
			copySolvedVariableUsageToUsageContext(uc, vu);
		}
		
	}

	private String getFullParameterName(AbstractNamedReference ref) {
		String name = ""; 
		while (ref instanceof NamespaceReference){
			NamespaceReference nsRef = (NamespaceReference)ref;
			name += nsRef.getReferenceName() + ".";
			ref = nsRef.getInnerReference_NamespaceReference();
		}
		return name += ref.getReferenceName();
	}
	
	
	/**
	 * @param requiredRole
	 * @return
	 */
	private AssemblyConnector findAssemblyConnector(
			Interface requiredRole) {
		Iterator connectorIterator = visitor.getMyContext().getSystem()
				.getCompositeAssemblyConnectors_ComposedStructure().iterator();

		AssemblyConnector result = null;

		while (result == null && connectorIterator.hasNext()) {
			AssemblyConnector connector = (AssemblyConnector) connectorIterator
					.next();
			if (connector
					.getRequiringChildComponentContext_CompositeAssemblyConnector()
					.getId().equals(
							visitor.getMyContext().getDerivedAssemblyContext().getId())
					&& connector.getRequiredRole_CompositeAssemblyConnector()
							.getRequiredInterface__RequiredRole().getId()
							.equals(requiredRole.getId())) {
				result = connector;
			}
		}
		return result;
	}
	
	/**
	 * @param serviceToBeCalled
	 * @param parametricParameterUsages TODO
	 * @param foundAssemblyConnector
	 */
	private SeffVisitor visitNextSeff(Signature serviceToBeCalled,
			EList<VariableUsage> parametricParameterUsages, 
			AssemblyConnector foundAssemblyConnector) {

		Context callContext = createCallContext(foundAssemblyConnector, 
				parametricParameterUsages);

		SeffVisitor seffVisitor = new SeffVisitor(visitor.getPcmInstance(), callContext);
		
		ResourceDemandingSEFF b = getTargetBehaviourFromAssemblyConnector(
				foundAssemblyConnector, serviceToBeCalled);
		
		seffVisitor.doSwitch(b);
		
		return seffVisitor;
	}

	/**
	 * @param foundAssemblyConnector
	 * @param newParam TODO
	 * @return
	 */
	private Context createCallContext(
			AssemblyConnector foundAssemblyConnector, 
			EList<VariableUsage> parametricParameterUsages) {
		
		Context myContext = visitor.getMyContext();
		Context callContext = getCallContext(foundAssemblyConnector, myContext);
		
		UsageContext uc = getUsageContext(foundAssemblyConnector, parametricParameterUsages);
		callContext.setUsageContext(uc);

		ActualAllocationContext aac = actualAllocationFactory
				.createActualAllocationContext();
		aac.setUsageContext_ActualAllocationContext(uc);
		callContext.setActualAllocationContext(aac);

		callContext.setCurrentEvaluatedBranchConditions(myContext
				.getCurrentEvaluatedBranchConditions());
		callContext.setCurrentLoopIterationNumber(myContext
				.getCurrentLoopIterationNumber());

		return callContext;
	}

	/**
	 * @param foundAssemblyConnector
	 * @param parametricParameterUsages
	 * @return
	 */
	private UsageContext getUsageContext(AssemblyConnector foundAssemblyConnector, EList<VariableUsage> parametricParameterUsages) {
		UsageContext uc = usageFactory.createUsageContext();

		AssemblyContext assCtx = foundAssemblyConnector.getProvidingChildComponentContext_CompositeAssemblyConnector();
		//BasicComponent bc = (BasicComponent)assCtx.getEncapsulatedComponent_ChildComponentContext();
		EList<VariableUsage> internalParameterUsages = assCtx.getComponentParameterUsage_AssemblyContext();
 		parametricParameterUsages.addAll(internalParameterUsages);
 		
 		for (VariableUsage oldUsage : parametricParameterUsages){
			copySolvedVariableUsageToUsageContext(uc, oldUsage);
		}
		
 		return uc;
	}

	/**
	 * @param foundAssemblyConnector
	 * @param myContext
	 * @return
	 */
	private Context getCallContext(AssemblyConnector foundAssemblyConnector, Context myContext) {
		Context callContext = new Context();
		callContext.setSystem(myContext.getSystem());
		callContext.setAllocation(myContext.getAllocation());
		callContext
				.setDerivedAssemblyContext(foundAssemblyConnector
						.getProvidingChildComponentContext_CompositeAssemblyConnector());
		callContext.setCurrentEvaluatedBranchConditions(myContext
				.getCurrentEvaluatedBranchConditions());
		callContext.setCurrentLoopIterationNumber(myContext
				.getCurrentLoopIterationNumber());
		return callContext;
	}

	private AbstractNamedReference getReferenceCopy(AbstractNamedReference anr){
		if (anr instanceof NamespaceReference){
			NamespaceReference nr = (NamespaceReference)anr;
			NamespaceReference newRef = StoexFactory.eINSTANCE.createNamespaceReference();
			newRef.setReferenceName(nr.getReferenceName());
			newRef.setInnerReference_NamespaceReference(getReferenceCopy(nr.getInnerReference_NamespaceReference()));
			return newRef;
		} else if (anr instanceof VariableReference){
			VariableReference vr = (VariableReference)anr;
			VariableReference varRef = StoexFactory.eINSTANCE.createVariableReference();
			varRef.setReferenceName(vr.getReferenceName());
			return varRef;
		} else 
			return null;
	}
	
	/**
	 * @param uc
	 * @param oldUsage
	 */
	private void copySolvedVariableUsageToUsageContext(UsageContext uc, VariableUsage oldUsage) {
		VariableUsage newUsage = parameterFactory.createVariableUsage();
		
		newUsage.setNamedReference_VariableUsage(getReferenceCopy(oldUsage.getNamedReference_VariableUsage()));
		//newUsage.setNamedReference_VariableUsage(oldUsage.getNamedReference_VariableUsage());

		EList<VariableCharacterisation> characterisations = oldUsage.getVariableCharacterisation_VariableUsage();
		for (VariableCharacterisation oldCharacterisation : characterisations){
			String specification = oldCharacterisation.getSpecification();
			String solvedSpecification = ExpressionHelper
					.getSolvedExpressionAsString(specification, visitor.getMyContext()); 

			VariableCharacterisation solvedCharacterisation = parameterFactory
					.createVariableCharacterisation();
			solvedCharacterisation.setType(oldCharacterisation.getType());
			solvedCharacterisation.setSpecification(solvedSpecification);
			
			newUsage.getVariableCharacterisation_VariableUsage().add(solvedCharacterisation);
			
		}
		uc.getActualParameterUsage_UsageContext().add(newUsage);
	}

	/**
	 * @param connector
	 * @param targetMethod
	 * @return
	 */
	private ResourceDemandingSEFF getTargetBehaviourFromAssemblyConnector(
			AssemblyConnector connector, Signature targetMethod) {
		BasicComponent targetBasicComponent = (BasicComponent) connector
				.getProvidingChildComponentContext_CompositeAssemblyConnector()
				.getEncapsulatedComponent_ChildComponentContext();
			
		// TODO: �ber Interfaces suchen...
		ServiceEffectSpecification seff = (ServiceEffectSpecification) EMFHelper
				.executeOCLQuery(
						targetBasicComponent,
						"self.serviceEffectSpecifications__BasicComponent->select(seff|seff.describedService__SEFF.serviceName = '"
								+ targetMethod.getServiceName()
								+ "')->asOrderedSet()->first()");
	
		return (ResourceDemandingSEFF) seff;
	}


	
}
