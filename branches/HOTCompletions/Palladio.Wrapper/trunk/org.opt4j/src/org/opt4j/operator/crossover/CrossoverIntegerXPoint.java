/**
 * Opt4J is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Opt4J is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with Opt4J. If not, see http://www.gnu.org/licenses/. 
 */

package org.opt4j.operator.crossover;

import java.util.Random;

import org.opt4j.genotype.IntegerGenotype;
import org.opt4j.start.Constant;

import com.google.inject.Inject;

/**
 * The {@code CrossoverIntegerXPoint} is the {@link CrossoverListXPoint} for the
 * {@link IntegerGenotype}.
 * 
 * @author lukasiewycz
 * 
 */
public class CrossoverIntegerXPoint extends CrossoverListXPoint implements
		CrossoverInteger {

	/**
	 * Constructs a {@code CrossoverIntegerXPoint}.
	 * 
	 * @param x
	 *            the number of crossover points
	 * @param random
	 *            the random number generator
	 */
	@Inject
	public CrossoverIntegerXPoint(
			@Constant(value = "x", namespace = CrossoverIntegerXPoint.class) int x,
			Random random) {
		super(x, random);
	}

}
