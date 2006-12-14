package de.uka.ipd.sdq.simucomframework.cache;

import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import de.uka.ipd.sdq.pcm.stochasticexpressions.parser.PCMStoExParser;
import de.uka.ipd.sdq.probfunction.math.IProbabilityFunction;
import de.uka.ipd.sdq.simucomframework.stoexvisitor.SimulationExpressionInferTypeVisitor;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.analyser.visitors.ExpressionInferTypeVisitor;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;
import de.uka.ipd.sdq.stoex.parser.StochasticExpressionsLexer;

public class StoExCacheEntry {

	private String spec;
	private Expression parsedExpression;
	private ExpressionInferTypeVisitor typeInferer;
	private ProbFunctionCache probFunctionCache;

	public StoExCacheEntry(String spec) {
		this.spec = spec;
		StochasticExpressionsLexer lexer = new StochasticExpressionsLexer(
				new StringReader(spec));
		Expression formula = null;
		try {
			formula = new PCMStoExParser(lexer).expression();
			typeInferer = new SimulationExpressionInferTypeVisitor();
			typeInferer.doSwitch(formula);
		} catch (RecognitionException e) {
			e.printStackTrace();
			throw new RuntimeException("Expression not parsable "+spec);
		} catch (TokenStreamException e) {
			e.printStackTrace();
			throw new RuntimeException("Expression not parsable "+spec);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Expression not parsable "+spec);
		}
		this.parsedExpression = formula;
		this.probFunctionCache = new ProbFunctionCache(formula);
	}

	public Expression getParsedExpression() {
		return parsedExpression;
	}

	public String getSpec() {
		return spec;
	}

	public ExpressionInferTypeVisitor getTypeInferer() {
		return typeInferer;
	}

	public TypeEnum getInferedType(Expression e) {
		return typeInferer.getType(e);
	}

	public ProbFunctionCache getProbFunctionCache() {
		return probFunctionCache;
	}

	public IProbabilityFunction getProbFunction(EObject e) {
		return probFunctionCache.getProbFunction(e);
	}
}
