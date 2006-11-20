/**
 * 
 */
package de.uka.ipd.sdq.probfunction.math.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import junit.framework.JUnit4TestAdapter;

import org.junit.Before;
import org.junit.Test;

import de.uka.ipd.sdq.probfunction.math.IBoxedPDF;
import de.uka.ipd.sdq.probfunction.math.IContinuousSample;
import de.uka.ipd.sdq.probfunction.math.IProbabilityDensityFunction;
import de.uka.ipd.sdq.probfunction.math.IProbabilityFunctionFactory;
import de.uka.ipd.sdq.probfunction.math.ISamplePDF;
import de.uka.ipd.sdq.probfunction.math.exception.DoubleSampleException;
import de.uka.ipd.sdq.probfunction.math.exception.FunctionNotInTimeDomainException;
import de.uka.ipd.sdq.probfunction.math.exception.FunctionsInDifferenDomainsException;
import de.uka.ipd.sdq.probfunction.math.exception.IncompatibleUnitsException;
import de.uka.ipd.sdq.probfunction.math.exception.UnknownPDFTypeException;
import de.uka.ipd.sdq.probfunction.math.exception.UnorderedDomainException;

/**
 * @author Ihssane
 * 
 */
public class BoxedPDFTest {
	private IBoxedPDF df1, df2;
	private IProbabilityFunctionFactory dfFactory = IProbabilityFunctionFactory.eINSTANCE;

	private IBoxedPDF createBoxedPDF(Double[] samples)
			throws DoubleSampleException {
		List<IContinuousSample> sList = new ArrayList<IContinuousSample>();
		for (int i = 0; i < samples.length; i += 2) {
			IContinuousSample s = dfFactory.createContinuousSample(samples[i],
					samples[i + 1]);
			sList.add(s);
		}
		return dfFactory.createBoxedPDF(sList, dfFactory.createDefaultUnit());
	}

	@Before
	public void setUp() throws DoubleSampleException {
		df1 = createBoxedPDF(new Double[]{3.0, 0.1, 2.1, 0.2, 4.3, 0.4, 1.5,
				0.3});
		df2 = createBoxedPDF(new Double[]{3.0, 0.0, 2.1, 0.2, 2.2, 0.1, 2.5,
				0.2, 4.3, 0.3});

	}

	@Test
	public void timeDomain() throws FunctionNotInTimeDomainException {
		Assert.assertTrue(df1.isInTimeDomain());
		Assert.assertTrue(df2.isInTimeDomain());
		Assert.assertFalse(df1.isInFrequencyDomain());
		IProbabilityDensityFunction pdf = df1.getFourierTransform();
		Assert.assertFalse(pdf.isInTimeDomain());
		Assert.assertTrue(pdf.isInFrequencyDomain());
	}

	@Test
	public void equals() throws DoubleSampleException {
		Assert.assertTrue(df1.equals(df1));

		IBoxedPDF df1copy = createBoxedPDF(new Double[]{3.0, 0.1, 2.1, 0.2,
				4.3, 0.4, 1.5, 0.3});
		Assert.assertTrue(df1.equals(df1copy));

		Assert.assertFalse(df2.equals(df1));
		IBoxedPDF df1WrongCopy = createBoxedPDF(new Double[]{2.1, 0.2, 3.0,
				0.1, 4.3, 0.4, 1.5, 0.3});
		Assert.assertTrue(df1.equals(df1WrongCopy));
	}

	@Test
	public void scale() throws DoubleSampleException {
		IProbabilityDensityFunction df1scale = df1.scale(0.1);
		IBoxedPDF spdf = createBoxedPDF(new Double[]{3.0, 0.01, 2.1, 0.02, 4.3,
				0.04, 1.5, 0.03});
		Assert.assertEquals(spdf, df1scale);
	}

	@Test
	public void add() throws DoubleSampleException,
			FunctionsInDifferenDomainsException, UnknownPDFTypeException,
			IncompatibleUnitsException {
		IProbabilityDensityFunction sum = df1.add(df1);
		IBoxedPDF sumExpected = createBoxedPDF(new Double[]{3.0, 0.2, 2.1, 0.4,
				4.3, 0.8, 1.5, 0.6});
		Assert.assertEquals(dfFactory.transformToSamplePDF(sumExpected),
				(ISamplePDF) sum);

	}

	@Test
	public void mult() throws FunctionsInDifferenDomainsException,
			UnknownPDFTypeException, IncompatibleUnitsException,
			DoubleSampleException {
		IProbabilityDensityFunction prod = df1.mult(df1);
		IBoxedPDF expected = createBoxedPDF(new Double[]{3.0, 0.01, 2.1, 0.04,
				4.3, 0.16, 1.5, 0.09});
		ISamplePDF sExpexted = dfFactory.transformToSamplePDF(expected);
		System.out.println(sExpexted);
		System.out.println(prod);
		Assert.assertEquals(sExpexted, (ISamplePDF) prod);
	}
	
	@Test
	public void percentile() throws IndexOutOfBoundsException,
			UnorderedDomainException {
		Assert.assertEquals(0.3, df1.getPercentile(10)); 
		Assert.assertEquals(0.2, df1.getPercentile(40)); 
		Assert.assertEquals(0.1, df1.getPercentile(50)); 
		Assert.assertEquals(0.4, df1.getPercentile(99)); 
	}

	@Test
	public void getMedian() throws UnorderedDomainException {
		Assert.assertEquals(0.1, df1.getMedian());
	}
	
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(BoxedPDFTest.class);
	}
}
