package de.uka.ipd.sdq.dsolver.handler;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.context.usage.BranchProbability;
import de.uka.ipd.sdq.context.usage.UsageFactory;
import de.uka.ipd.sdq.dsolver.SeffVisitor;
import de.uka.ipd.sdq.pcm.seff.AbstractBranchTransition;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingBehaviour;

public abstract class AbstractBranchTransitionHandler {

	private static Logger logger = Logger.getLogger(AbstractBranchTransitionHandler.class.getName());

	protected UsageFactory usageFactory = UsageFactory.eINSTANCE;

	protected SeffVisitor visitor;

	/**
	 * @param context
	 * @param _visitor
	 * @param nextHandler
	 */
	public AbstractBranchTransitionHandler(SeffVisitor seffVisitor) {
		visitor = seffVisitor;
	}
	
	/**
	 * @param bt
	 */
	protected void visitChildBehaviour(AbstractBranchTransition bt) {
		ResourceDemandingBehaviour rdb = bt
				.getBranchBehaviour_BranchTransition();
		if (rdb != null){
			visitor.doSwitch(rdb);
		}
	}

	/**
	 * @param bt
	 * @param solvedBranchProb
	 */
	protected void storeToUsageContext(AbstractBranchTransition bt, double solvedBranchProb) {
		BranchProbability prob = usageFactory.createBranchProbability();
		prob.setBranchtransition_BranchProbability(bt);
		prob.setProbability(solvedBranchProb);

		visitor.getMyContext().getUsageContext()
				.getBranchprobabilities_UsageContext().add(prob);
	}
}
