package de.uka.ipd.sdq.simucomframework.variables.stoexvisitor;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.probfunction.ProbabilityDensityFunction;
import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.math.IProbabilityDensityFunction;
import de.uka.ipd.sdq.probfunction.math.IProbabilityFunction;
import de.uka.ipd.sdq.probfunction.math.IProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.util.ProbfunctionSwitch;
import de.uka.ipd.sdq.simucomframework.variables.cache.StoExCacheEntry;

/**
 * Visitor to visit probfunctions and evaluate them to return a sample
 * 
 * @author Steffen Becker
 *
 */
public class PCMProbfunctionEvaluationVisitor extends ProbfunctionSwitch<Object> {
    private static final Logger LOGGER = Logger.getLogger(PCMProbfunctionEvaluationVisitor.class.getName());

    private final StoExCacheEntry stoexCacheEntry;

    public PCMProbfunctionEvaluationVisitor(StoExCacheEntry stoexCacheEntry) {
        this.stoexCacheEntry = stoexCacheEntry;
    }

    @Override
    public Object caseProbabilityDensityFunction(ProbabilityDensityFunction object) {
        IProbabilityFunction pdf = stoexCacheEntry.getProbFunction(object);
        Object result = drawSample(pdf);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Draw Sample returned " + result);
        }
        return result;
    }

    @Override
    public Object caseProbabilityMassFunction(ProbabilityMassFunction object) {
        IProbabilityFunction pdf = stoexCacheEntry.getProbFunction(object);
        Object result = drawSample(pdf);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Draw Sample returned " + result);
        }
        return result;
    }

    private Object drawSample(IProbabilityFunction f) {
        if (f == null) {
            throw new RuntimeException("Probability function in drawSample() must be != null");
        }
        if (f instanceof IProbabilityMassFunction) {
            return ((IProbabilityMassFunction) f).drawSample();
        }
        if (f instanceof IProbabilityDensityFunction) {
            return ((IProbabilityDensityFunction) f).drawSample();
        }
        throw new RuntimeException("Should never be here. Unknown Probfunction found!");
    }
}
