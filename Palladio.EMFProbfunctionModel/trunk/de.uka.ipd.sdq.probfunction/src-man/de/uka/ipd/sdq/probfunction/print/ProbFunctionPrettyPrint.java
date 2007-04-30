package de.uka.ipd.sdq.probfunction.print;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

import de.uka.ipd.sdq.probfunction.BoxedPDF;
import de.uka.ipd.sdq.probfunction.ContinuousSample;
import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.Sample;
import de.uka.ipd.sdq.probfunction.util.ProbfunctionSwitch;

public class ProbFunctionPrettyPrint extends ProbfunctionSwitch {

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.uka.ipd.sdq.probfunction.util.ProbfunctionSwitch#caseBoxedPDF(de.uka.ipd.sdq.probfunction.BoxedPDF)
	 */
	@Override
	public Object caseBoxedPDF(BoxedPDF object) {
		String sampleString = "";
		for (ContinuousSample s : (List<ContinuousSample>) object.getSamples()) {
			double value = s.getProbability();
			double precision = 0.00001;
			
			value *= 1 / precision;
			long temp = Math.round(value);
			double prob = temp * precision;
			DecimalFormat df = new DecimalFormat("0.00000000", new DecimalFormatSymbols(Locale.US));
			
			sampleString += " (" + s.getValue() + "; " + df.format(prob)
					+ ")";
		}
		
		if (object.getUnit() != null && 
		  !(object.getUnit().getUnitName().equals(""))){
			return "DoublePDF"+ "(unit=\""+object.getUnit().getUnitName() + "\")[" + sampleString + " ]";
		} else {
			return "DoublePDF[" + sampleString + " ]";
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.uka.ipd.sdq.probfunction.util.ProbfunctionSwitch#caseProbabilityMassFunction(de.uka.ipd.sdq.probfunction.ProbabilityMassFunction)
	 */
	@Override
	public Object caseProbabilityMassFunction(ProbabilityMassFunction object) {
		Sample sample = (Sample)object.getSamples().get(0);
		
		String pmfType = detectType(sample);
		String sampleString = "";
		String leftSeparator = "; ";
		String rightSeparator = ")";
		
		if (object.getUnit() != null && 
		  !(object.getUnit().getUnitName().equals(""))){
			pmfType += "(unit=\""+object.getUnit().getUnitName() + "\"";
			
			if ( sample.getValue() instanceof String) {
				leftSeparator = "; \"";
				rightSeparator = "\")";
				if (object.isOrderedDomain()){
					pmfType += "; ordered";
				}
			}
			
			pmfType += ")";
		}
		
		for (Sample s : (List<Sample>) object.getSamples()) {
			sampleString += " (" + s.getValue() + leftSeparator
			+ s.getProbability() + rightSeparator;
		}
		return pmfType + "[" + sampleString + " ]";
	}

	private String detectType(Sample object) {
		if (object.getValue() instanceof Integer)
			return "IntPMF";
		if (object.getValue() instanceof Double)
			return "DoublePMF";
		if (object.getValue().equals("true") || object.getValue().equals("false"))
			return "BoolPMF";
		if (object.getValue() instanceof String)
			return "EnumPMF";
		throw new UnsupportedOperationException("Unknown PMF found!");
	}

}
