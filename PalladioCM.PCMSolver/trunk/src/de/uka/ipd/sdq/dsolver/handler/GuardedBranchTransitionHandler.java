/**
 * 
 */
package de.uka.ipd.sdq.dsolver.handler;

import java.util.List;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.context.usage.BranchProbability;
import de.uka.ipd.sdq.context.usage.UsageFactory;
import de.uka.ipd.sdq.dsolver.ExpressionHelper;
import de.uka.ipd.sdq.dsolver.SeffVisitor;
import de.uka.ipd.sdq.pcm.seff.GuardedBranchTransition;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingBehaviour;
import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.Sample;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral;

/**
 * @author Koziolek
 * 
 */
public class GuardedBranchTransitionHandler extends AbstractBranchTransitionHandler{

	private static Logger logger = Logger.getLogger(GuardedBranchTransitionHandler.class.getName());

	/**
	 * @param context
	 * @param _visitor
	 * @param nextHandler
	 */
	public GuardedBranchTransitionHandler(SeffVisitor seffVisitor) {
		super(seffVisitor);
	}

	public void handle(GuardedBranchTransition bt){
		double solvedBranchProb = getBranchProbFromExpression(bt);
		logger.debug("SolvedBranchProb:" + solvedBranchProb);
		
		storeToUsageContext(bt, solvedBranchProb);

		visitChildBehaviour(bt);
		
		int lastElement = visitor.getMyContext().getCurrentEvaluatedBranchConditions().size()-1;
		visitor.getMyContext().getCurrentEvaluatedBranchConditions().remove(lastElement);
	}
	
	/**
	 * @param bt
	 * @param solvedBranchProb
	 * @return
	 */
	private double getBranchProbFromExpression(GuardedBranchTransition bt) {
		String specification = bt.getBranchCondition_BranchTransition().getSpecification(); 
		Expression solvedExpression = ExpressionHelper.getSolvedExpression(specification,visitor.getMyContext());

		ProbabilityFunctionLiteral pfl = (ProbabilityFunctionLiteral)solvedExpression;
		ProbabilityMassFunction pmf = (ProbabilityMassFunction)pfl.getFunction_ProbabilityFunctionLiteral();

		double solvedBranchProb = 1.0;
		List<Sample> points = pmf.getSamples();
		for (Sample point : points) {
			String bool = (String) point.getValue();
			if (bool.toLowerCase().equals("true")) {
				solvedBranchProb = point.getProbability();
			}
		}

		// integrate already evaluated branch conditions
		solvedBranchProb = adjustToScope(solvedBranchProb);

		visitor.getMyContext().getCurrentEvaluatedBranchConditions().add(solvedBranchProb);
		return solvedBranchProb;
	}

	/**
	 * Include already evaluated branch conditions.
	 * 
	 * @param solvedBranchProb
	 * @return
	 */
	private double adjustToScope(double solvedBranchProb) {
		//TODO
//		ArrayList list = myContext.getCurrentEvaluatedBranchConditions(); 
//		for (Object o : list) solvedBranchProb /= (Double)o;
		return solvedBranchProb;
	}

}
