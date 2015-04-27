/*
 * generated by Xtext
 */
package org.palladiosimulator.pcm.pcmstoex.validation;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import de.uka.ipd.sdq.errorhandling.IIssue;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.FunctionLiteral;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.analyser.exceptions.ExpectedTypeMismatchIssue;
import de.uka.ipd.sdq.stoex.analyser.visitors.ExpressionInferTypeVisitor;
import de.uka.ipd.sdq.stoex.analyser.visitors.NonProbabilisticExpressionInferTypeVisitor;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeCheckVisitor;

/**
 * Custom validation rules.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
public class PCMStoExJavaValidator extends AbstractPCMStoExJavaValidator {

    /**
     * Checks if functionliteral is supported.
     * @param function
     */
    @Check 
    public void checkFunctionSupport(FunctionLiteral function){
        ExpressionInferTypeVisitor typeVisitor = new ExpressionInferTypeVisitor();
        try {
            typeVisitor.caseFunctionLiteral(function);
        } catch (UnsupportedOperationException e) {
            error(e.getMessage(),function,StoexPackage.eINSTANCE.getFunctionLiteral_Id());
        } catch (Exception e) {
            //Intentionally left empty
        }
    }
    
    /**
     * Checks the TypeInference of the expression.
     * @param expression
     */
    @Check
    public void checkTypeInference(Expression expression) {
        NonProbabilisticExpressionInferTypeVisitor typeVisitor = new NonProbabilisticExpressionInferTypeVisitor();
        try {
            typeVisitor.doSwitch(expression);
        } catch (Exception e) {
            // the fails should be catched by the validator below! we don't care!
            System.out.println("Exceptional greetings from validator: " + e);
        }
        for (ExpectedTypeMismatchIssue issue : checkTypes(expression, typeVisitor)) {
            if (issue.getObject() == null && issue.getFeature() != null) {
                error(issue.getMessage(), issue.getFeature());
            } else if (issue.getFeature() != null) {
                error(issue.getMessage(), issue.getObject(), issue.getFeature());
            } else {
                // can't handle this issue properly :/
                error(issue.getMessage(), expression, StoexPackage.eINSTANCE.eContainingFeature());
            }
        }
        
    }
    
    

    /**
     * Check types.
     * 
     * @param result
     *            the result
     * @param typeVisitor
     *            the type visitor
     * @return the collection
     */
    private Collection<ExpectedTypeMismatchIssue> checkTypes(EObject result,
            NonProbabilisticExpressionInferTypeVisitor typeVisitor) {
        TypeCheckVisitor typeChecker = new TypeCheckVisitor(typeVisitor);
        typeChecker.doSwitch(result);
        TreeIterator<EObject> iterator = result.eAllContents();
        for (; iterator.hasNext();) {
            EObject treeNode = iterator.next();
            typeChecker.doSwitch(treeNode);
        }
        Collection<IIssue> issues = typeChecker.getIssues();
        Collection<ExpectedTypeMismatchIssue> etmmi = new LinkedList<ExpectedTypeMismatchIssue>();
        for (IIssue issue : issues) {
            if (issue instanceof ExpectedTypeMismatchIssue) {
                etmmi.add((ExpectedTypeMismatchIssue) issue);
            }
        }
        return etmmi;
    }
}