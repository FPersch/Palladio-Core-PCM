package de.uka.ipd.sdq.pcm2regex;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.dsolver.EMFHelper;
import de.uka.ipd.sdq.dsolver.SeffVisitor;
import de.uka.ipd.sdq.dsolver.UsageModelVisitor;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.core.composition.ProvidedDelegationConnector;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.ProvidedRole;
import de.uka.ipd.sdq.pcm.repository.ProvidesComponentType;
import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;
import de.uka.ipd.sdq.pcm.repository.Signature;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingBehaviour;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;
import de.uka.ipd.sdq.pcm.usagemodel.Branch;
import de.uka.ipd.sdq.pcm.usagemodel.BranchTransition;
import de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall;
import de.uka.ipd.sdq.pcm.usagemodel.Loop;
import de.uka.ipd.sdq.pcm.usagemodel.ScenarioBehaviour;
import de.uka.ipd.sdq.pcm.usagemodel.Start;
import de.uka.ipd.sdq.pcm.usagemodel.Stop;
import de.uka.ipd.sdq.pcm.usagemodel.util.UsagemodelSwitch;
import de.uka.ipd.sdq.pcmsolver.models.Context;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;
import de.uka.ipd.sdq.probfunction.math.IProbabilityFunctionFactory;
import de.uka.ipd.sdq.spa.expression.Alternative;
import de.uka.ipd.sdq.spa.expression.Expression;
import de.uka.ipd.sdq.spa.expression.ExpressionFactory;
import de.uka.ipd.sdq.spa.expression.Option;
import de.uka.ipd.sdq.spa.expression.Sequence;
import de.uka.ipd.sdq.spa.expression.Symbol;
import de.uka.ipd.sdq.stoex.RandomVariable;

public class TransformUsageModelVisitor extends UsagemodelSwitch {
	
	private static Logger logger = Logger.getLogger(TransformUsageModelVisitor.class.getName());
	
	private ExpressionFactory expFactory = ExpressionFactory.eINSTANCE;
	private IProbabilityFunctionFactory pfFactory = IProbabilityFunctionFactory.eINSTANCE;
	
	private PCMInstance pcmInstance;
	
	public TransformUsageModelVisitor(PCMInstance pcm){
		pcmInstance = pcm;
	}

	@Override
	public Object caseBranch(Branch object) {
		Alternative alt = expFactory.createAlternative();

		BranchTransition bt1 = (BranchTransition) object.getBranchTransitions_Branch().get(0);
		Option opt1 = expFactory.createOption();
		opt1.setProbability(bt1.getBranchProbability());
		Expression leftExpr = (Expression)doSwitch(bt1.getBranchedBehaviour_BranchTransition());
		opt1.setRegexp(leftExpr);
		alt.setLeftOption(opt1);
		
		BranchTransition bt2 = (BranchTransition) object.getBranchTransitions_Branch().get(1);
		Option opt2 = expFactory.createOption();
		opt2.setProbability(bt2.getBranchProbability());
		Expression rightExpr = (Expression)doSwitch(bt2.getBranchedBehaviour_BranchTransition());
		opt2.setRegexp(rightExpr);
		alt.setRightOption(opt2);
		
		Sequence seq = expFactory.createSequence();
		seq.setLeftRegExp(alt);
		seq.setRightRegExp((Expression)doSwitch(object.getSuccessor()));
		
		return seq;
	}

	@Override
	public Object caseLoop(Loop object) {
		de.uka.ipd.sdq.spa.expression.Loop loop = expFactory.createLoop();
		RandomVariable iterations = (RandomVariable)object.getIterations_Loop();
		loop.setIterationsString(iterations.getSpecification());
		loop.setRegExp((Expression)doSwitch(object.getBodyBehaviour_Loop()));
		
		Sequence seq = expFactory.createSequence();		
		seq.setLeftRegExp(loop);
		seq.setRightRegExp((Expression)doSwitch(object.getSuccessor()));
		
		return seq;
	}

	@Override
	public Object caseScenarioBehaviour(ScenarioBehaviour object) {
		return doSwitch(getStartAction(object));
	}

	@Override
	public Object caseEntryLevelSystemCall(EntryLevelSystemCall object) {
		Signature signature = object.getSignature_EntryLevelSystemCall();
		ProvidedRole role = object.getProvidedRole_EntryLevelSystemCall();
		ProvidedDelegationConnector delegationConnector = getDelegationConnector(role);
		
		AssemblyContext assCtx = delegationConnector.getChildComponentContext_ProvidedDelegationConnector();
		
		ProvidesComponentType offeringComponent = delegationConnector
				.getChildComponentContext_ProvidedDelegationConnector()
				.getEncapsulatedComponent_ChildComponentContext();

		Expression expr = null;
		if (offeringComponent instanceof BasicComponent){
			ServiceEffectSpecification seff = getSeff(signature, (BasicComponent)offeringComponent);

			TransformSeffVisitor seffVisitor = new TransformSeffVisitor(pcmInstance, assCtx);
			try {
				expr = (Expression)seffVisitor.doSwitch((ResourceDemandingSEFF) seff);
			} catch (Exception e) {
				logger.error("Error while visiting RDSEFF");
				e.printStackTrace();
			}
		} else {
			logger.error("Composite Component type not yet supported.");
			System.exit(-1);
		}
		
		Sequence seq = expFactory.createSequence();
		seq.setLeftRegExp(expr);
		seq.setRightRegExp((Expression)doSwitch(object.getSuccessor()));
		
		return seq;
	}

	@Override
	public Object caseStart(Start object) {
		Symbol sym = expFactory.createSymbol();
		sym.setName("Start");

		Sequence seq = expFactory.createSequence();
		seq.setLeftRegExp(sym);
		seq.setRightRegExp((Expression)doSwitch(object.getSuccessor()));

		return seq;
	}


	@Override
	public Object caseStop(Stop object) {
		Symbol sym = expFactory.createSymbol();
		sym.setName("Stop");
		return sym;
	}

	private Start getStartAction(ScenarioBehaviour object) {
		Start startAction = (Start) EMFHelper.getObjectByType(object
				.getActions_ScenarioBehaviour(), Start.class);
		return startAction;
	}

	
	private ProvidedDelegationConnector getDelegationConnector(
			ProvidedRole role) {
		ProvidedDelegationConnector delegationConnector = 
			(ProvidedDelegationConnector) EMFHelper
				.executeOCLQuery(
						pcmInstance.getSystem(),
						"self.providedDelegationConnectors_ComposedStructure->select(dc|dc.outerProvidedRole_ProvidedDelegationConnector.providedInterface__ProvidedRole.id = '"
								+ role.getProvidedInterface__ProvidedRole()
										.getId()
								+ "')->asOrderedSet()->first()");
		return delegationConnector;
		
	}
	
	/**
	 * @param method
	 * @param basicComponent
	 * @return
	 */
	private ServiceEffectSpecification getSeff(Signature method,
			BasicComponent basicComponent) {
		ServiceEffectSpecification seff = (ServiceEffectSpecification) EMFHelper
				.executeOCLQuery(
						basicComponent,
						"self.serviceEffectSpecifications__BasicComponent->select(seff|seff.describedService__SEFF.serviceName = '"
								+ method.getServiceName()
								+ "')->asOrderedSet()->first()");
		return seff;
	}
}
