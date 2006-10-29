package de.uka.ipd.sdq.probfunction.math;

import java.util.List;

import de.uka.ipd.sdq.probfunction.math.exception.DoubleSampleException;

/**
 * 
 * A BoxedPDF is an approximation of an actual probability density function. It
 * seperates the function in a set of arbitrary, but non-overlapping intervals
 * (boxes). For each such interval [a,b), the probability of a sample lying in
 * that interval (F(b) - F(a)) is stored in a BoxedPDF. <br>
 * 
 * A BoxedPDF consists of an ordered set of ContinuousSamples, wich contains the
 * x and y coordinates of the upper right coner of a box. The lower left corner
 * is given by the x coordinate of its left neighbour and the y coordinate is
 * set to zero. This allows us to easily construct a sequence of boxes. The
 * lower left corner of the leftmost box is always (0,0).
 * 
 * @author ihssane, jens
 * 
 */
public interface IBoxedPDF extends IProbabilityDensityFunction {

	/**
	 * Ordered list of ContinuousSamples, which define the sequence of boxes.
	 * 
	 * @return ContinuousSamples approximating the probability density function.
	 */
	List<IContinuousSample> getSamples();

	/**
	 * Resets the boxes of a probability density function. The incoming set of
	 * samples might be unorderd. It will be sorted by this function.<br>
	 * 
	 * If the probabilities in the samples do not sum up to one a ProbabilitiesNotOneException is thrown.
	 * 
	 * @param samples List of sampling points describing a probability density function.
	 * @throws DoubleSampleException 
	 */
	void setSamples(List<IContinuousSample> samples) throws DoubleSampleException;

}
