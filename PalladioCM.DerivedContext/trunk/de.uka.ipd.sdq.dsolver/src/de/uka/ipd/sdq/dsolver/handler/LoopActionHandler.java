/**
 * 
 */
package de.uka.ipd.sdq.dsolver.handler;

import java.io.StringBufferInputStream;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import de.uka.ipd.sdq.context.usage.LoopIteration;
import de.uka.ipd.sdq.context.usage.UsageFactory;
import de.uka.ipd.sdq.dsolver.Context;
import de.uka.ipd.sdq.dsolver.helper.ExpressionHelper;
import de.uka.ipd.sdq.dsolver.visitors.SeffVisitor;
import de.uka.ipd.sdq.pcm.seff.LoopAction;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingBehaviour;
import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.Sample;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.IntLiteral;
import de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.parser.StochasticExpressionsLexer;
import de.uka.ipd.sdq.stoex.parser.StochasticExpressionsParser;

/**
 * @author Koziolek
 *
 */
public class LoopActionHandler extends AbstractHandler {
	
	private static Logger logger = Logger.getLogger(LoopActionHandler.class.getName());

	private UsageFactory usageFactory = UsageFactory.eINSTANCE;

	private SeffVisitor visitor;

	private Context myContext;
	
	/**
	 * @param context
	 * @param _visitor
	 * @param nextHandler
	 */
	public LoopActionHandler(Context context, SeffVisitor _visitor,
			AbstractHandler nextHandler) {
		myContext = context;
		visitor = _visitor;
		successor = nextHandler;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.uka.ipd.sdq.dsolver.handler.AbstractHandler#handle(org.eclipse.emf.ecore.EObject)
	 */
	public void handle(EObject object) {
		if (object instanceof LoopAction) {
			handle((LoopAction) object);
		} else {
			if (successor != null)
				successor.handle(object);
		}
	}
	
	/**
	 * @param loop
	 */
	private void handle(LoopAction loop) {
		String specification = loop.getIterations_LoopAction()
				.getSpecification();
		String solvedSpecification = ExpressionHelper
				.getSolvedExpressionAsString(specification, myContext);

		createLoopIteration(loop, solvedSpecification);
		
		visitLoopBody(loop, solvedSpecification);
	}

	/**
	 * @param loop
	 * @param solvedSpecification
	 */
	private void createLoopIteration(LoopAction loop, String solvedSpecification) {
		LoopIteration loopIteration = usageFactory.createLoopIteration();
		loopIteration.setLoopaction_LoopIteration(loop);
		loopIteration.setSpecification(solvedSpecification);
		
		myContext.getUsageContext().getLoopiterations_UsageContext().add(loopIteration);
	}

	/**
	 * @param loop
	 * @param solvedIterationCountExpr
	 */
	private void visitLoopBody(LoopAction loop, String iterationCountSpecification) {
		Expression solvedIterationCountExpr = ExpressionHelper
				.parseToExpression(iterationCountSpecification);
		
		int lowerBound = 0;
		int upperBound = getUpperBound(solvedIterationCountExpr);
		
		myContext.getCurrentLoopIterationNumber().add(lowerBound);
		
		ResourceDemandingBehaviour loopBody = loop.getBodyBehaviour_Loop();
		for (int i=lowerBound; i<upperBound; i++){
			logger.debug("Loop Execution Number "+i);
			ArrayList curLoop = myContext.getCurrentLoopIterationNumber();
			curLoop.remove(curLoop.size()-1); // delete last element
			curLoop.add(i); // add current loop iteration number to scope
			
			visitor.doSwitch(loopBody); // is this really necessary? (TODO)
			// The loop body gets visited as many times as the loop count specifies.
			// This implies that a usage context will be created for each number
			// of loop iteration (if there's an external call within the loop), 
			// which might lead to a huge number of contexts 
			// for large iteration numbers and thus memory problems.
		}
		ArrayList curLoop = myContext.getCurrentLoopIterationNumber();
		curLoop.remove(curLoop.size()-1);
	}

	/**
	 * @param solvedLoopCountExpr
	 * @param upperBound
	 * @return
	 */
	private int getUpperBound(Expression solvedLoopCountExpr) {
		int upperBound = 0;
		if (solvedLoopCountExpr instanceof IntLiteral) {
			IntLiteral loopInt = (IntLiteral) solvedLoopCountExpr;
			upperBound = loopInt.getValue();
		} else if (solvedLoopCountExpr instanceof ProbabilityFunctionLiteral) {
			ProbabilityFunctionLiteral loopProbLiteral = (ProbabilityFunctionLiteral) solvedLoopCountExpr;
			if (loopProbLiteral.getFunction_ProbabilityFunctionLiteral() instanceof ProbabilityMassFunction){
				ProbabilityMassFunction loopPMF = (ProbabilityMassFunction) loopProbLiteral
						.getFunction_ProbabilityFunctionLiteral();
				EList sampleList = loopPMF.getSamples();
				Sample lastSample = (Sample) sampleList.get(sampleList.size() - 1);
				if (lastSample.getValue() instanceof Integer){
					upperBound = ((Integer) lastSample.getValue()).intValue();
				} else {
					logger.error("Could not determine upper bound for executing loop " +
							"(PMF for loop count does not contain integer values). " +
					"Skipping execution of loop body.");
				}
			} else {
				logger.error("Could not determine upper bound for executing loop " +
						"(loop count is prob function, but not PMF)." +
				"Skipping execution of loop body.");
			}
		} else {
			logger.error("Could not determine upper bound for executing loop " +
					"(loop count neither Integer nor PMF). " +
					"Skipping execution of loop body.");
		}
		return upperBound;
	}

}
