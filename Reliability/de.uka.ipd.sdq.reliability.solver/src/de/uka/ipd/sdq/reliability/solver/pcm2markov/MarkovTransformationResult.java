package de.uka.ipd.sdq.reliability.solver.pcm2markov;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.markov.MarkovChain;
import de.uka.ipd.sdq.markov.State;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.pcmsolver.runconfig.PCMSolverWorkflowRunConfiguration;
import de.uka.ipd.sdq.reliability.core.MarkovEvaluationType;
import de.uka.ipd.sdq.reliability.core.MarkovFailureType;

/**
 * Aggregates the results of a PCM2MarkovTransformation.
 * 
 * @author brosch
 * 
 */
public class MarkovTransformationResult {

	/**
	 * A logger to give detailed information about the PCM instance
	 * transformation.
	 */
	private static Logger logger = Logger
			.getLogger(MarkovTransformationResult.class.getName());

	/**
	 * Configuration options of the transformation.
	 */
	private PCMSolverWorkflowRunConfiguration configuration;

	/**
	 * Overall failure type probabilities, accumulated over all considered
	 * physical system states.
	 */
	private Map<MarkovFailureType, Double> cumulatedFailureTypeProbabilities = new HashMap<MarkovFailureType, Double>();

	/**
	 * Overall physical state probability, accumulated over all considered
	 * physical system states.
	 */
	private double cumulatedPhysicalStateProbability;

	/**
	 * Overall success probability, accumulated over all considered physical
	 * system states.
	 */
	private double cumulatedSuccessProbability;

	/**
	 * A helper class providing functionality for Markov chains.
	 */
	private MarkovBuilder markovBuilder;

	/**
	 * Holds state information required during the PCM2MarkovTransformation.
	 */
	private MarkovTransformationSource markovSource;

	/**
	 * Indicates the number of physical system states (which is n^2 for n
	 * resources).
	 */
	private long numberOfPhysicalSystemStates;

	/**
	 * Counts the evaluated physical system states.
	 */
	private long physicalStateEvaluationCount;

	/**
	 * Holds the Makov chain that results from the transformation.
	 */
	private MarkovChain resultChain;

	/**
	 * The usage scenario which has been evaluated.
	 */
	private UsageScenario scenario;

	/**
	 * The list of potential failure types.
	 */
	private List<MarkovFailureType> failureTypes;

	/**
	 * Creates a new Markov results aggregator.
	 * 
	 * @param configuration
	 *            configuration options of the transformation
	 * @param markovSource
	 *            the Markov state holder
	 * @param scenario
	 *            the usage scenario to evaluate
	 * @param failureTypes
	 *            the list of potential failure types
	 */
	public MarkovTransformationResult(
			final PCMSolverWorkflowRunConfiguration configuration,
			final MarkovTransformationSource markovSource,
			final UsageScenario scenario,
			final List<MarkovFailureType> failureTypes) {
		this.configuration = configuration;
		this.cumulatedPhysicalStateProbability = 0.0;
		this.cumulatedSuccessProbability = 0.0;
		this.markovBuilder = new MarkovBuilder(false);
		this.markovSource = markovSource;
		this.physicalStateEvaluationCount = 0;
		this.numberOfPhysicalSystemStates = (long) Math.pow(2, markovSource
				.getUnreliableResourceDescriptors().size());
		this.resultChain = null;
		this.scenario = scenario;
		this.failureTypes = failureTypes;
	}

	/**
	 * Gets the overall failure type probabilities, accumulated over all considered
	 * physical system states.
	 * @return the overall failure type probabilities
	 */
	public Map<MarkovFailureType, Double> getCumulatedFailureTypeProbabilities() {
		return cumulatedFailureTypeProbabilities;
	}

	/**
	 * Gets the overall physical state probability, accumulated over all considered
	 * physical system states.
	 * @return the overall physical state probability
	 */
	public double getCumulatedPhysicalStateProbability() {
		return cumulatedPhysicalStateProbability;
	}

	/**
	 * Gets the usage scenario which has been evaluated
	 * @return the usage scenario
	 */
	public UsageScenario getScenario() {
		return scenario;
	}

	/**
	 * Adds the results of the evaluation of a single physical system state
	 * during the PCM2Markov transformation.
	 * 
	 * @param resultChain
	 *            the Markov chain resulting from the evaluation of the physical
	 *            system state
	 * @param markovProbabilityMatrix
	 *            the matrix with the probabilities to get from state i to state
	 *            j in the Markov chain
	 * @param physicalStateProbability
	 *            the probability of the evaluated physical system state to
	 *            occur
	 */
	public void addPhysicalStateResults(final MarkovChain resultChain,
			final double[][] markovProbabilityMatrix,
			final double physicalStateProbability) {

		// Check plausibility of input parameters:
		if (physicalStateProbability < 0.0 || physicalStateProbability > 1.0) {
			throw new MarkovException("Illegal physical state probability ("
					+ physicalStateProbability
					+ "). The value must be in [0,1].");
		}

		// Store the first resulting Markov Chain:
		if (physicalStateEvaluationCount == 0) {
			this.resultChain = resultChain;
		}

		// Get the indices of the Start and Success States:
		int indexStart = markovBuilder.indexOf(resultChain, markovBuilder
				.getStartState(resultChain));
		int indexSuccess = markovBuilder.indexOf(resultChain, markovBuilder
				.getSuccessState(resultChain));

		// Check plausibility of Markov probabilities:
		double successProbability = markovProbabilityMatrix[indexStart][indexSuccess];
		if (successProbability < 0.0 || successProbability > 1.0) {
			throw new MarkovException("Illegal success probability ("
					+ successProbability + "). The value must be in [0,1].");
		}

		// Accumulate results:
		cumulatedPhysicalStateProbability += physicalStateProbability;
		cumulatedSuccessProbability += physicalStateProbability
				* successProbability;

		// Consider also the failure type probabilities:
		List<State> failureStates = markovBuilder.getFailureStates(resultChain);
		for (int i = 0; i < failureStates.size(); i++) {

			// Check plausibility of Markov probabilities:
			double failureTypeProbability = markovProbabilityMatrix[indexStart][markovBuilder
					.indexOf(resultChain, failureStates.get(i))];
			if (failureTypeProbability < 0.0 || failureTypeProbability > 1.0) {
				throw new MarkovException("Illegal failure type probability ("
						+ failureTypeProbability
						+ "). The value must be in [0,1].");
			}

			// Determine the failure type probability for this physical system
			// state:
			double failureTypeProbabilityDelta = physicalStateProbability
					* failureTypeProbability;

			// Add the failure type probability to the already existing value:
			String failureTypeId = markovBuilder.getFailureTypeId(failureStates
					.get(i));
			MarkovFailureType failureType = getFailureType(failureTypeId);
			cumulatedFailureTypeProbabilities.put(failureType,
					getFailureTypeProbability(failureType)
							+ failureTypeProbabilityDelta);
		}

		// Increase the counter of evaluated physical system states:
		physicalStateEvaluationCount++;

		// Do the logging:
		if (configuration.isPrintMarkovSingleResults()) {
			// yes - write output to log file
			BufferedWriter out = null;
			try {
				if (physicalStateEvaluationCount == 1) {
					File f = new File(configuration.getLogFile());
					// if the file exists, we will delete it and create a new,
					// empty one
					// (i.e., overwrite the existing file) once, and then
					// repeatedly append
					// to this file
					if (f.exists()) {
						f.delete(); // delete current ("old") file
						f.createNewFile(); // create a new, empty file
					}
					out = new BufferedWriter(new FileWriter(configuration
							.getLogFile(), true));
					logger
							.info("Logging results of all Markov transformation runs to: "
									+ configuration.getLogFile());
					out.append(getLogHeadings()
							+ System.getProperty("line.separator"));
					out.flush();
					out.close();
				}
				out = new BufferedWriter(new FileWriter(configuration
						.getLogFile(), true));
				out.append(getLogSingleResults(successProbability,
						physicalStateProbability)
						+ System.getProperty("line.separator"));
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (out != null) {
						out.flush();
						out.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Retrieves the failure type with the given id.
	 * 
	 * @param failureTypeId
	 *            the failure type id
	 * @return the failure type
	 */
	private MarkovFailureType getFailureType(String failureTypeId) {
		for (MarkovFailureType failureType : failureTypes) {
			if (failureType.getId().equals(failureTypeId)) {
				return failureType;
			}
		}
		throw new IllegalArgumentException(
				"MarkovTransformationResult: Failure type with ID \""
						+ failureTypeId + "\" not found!");
	}

	/**
	 * Retrieves the number of physical system states.
	 * 
	 * @return the number of physical system states
	 */
	public long getNumberOfPhysicalSystemStates() {
		return numberOfPhysicalSystemStates;
	}

	/**
	 * Retrieves the current number of evaluated physical system states.
	 * 
	 * @return the current number of evaluated physical system states
	 */
	public long getPhysicalStateEvaluationCount() {
		return physicalStateEvaluationCount;
	}

	/**
	 * Retrieves the Markov chain that results from the transformation.
	 * 
	 * @return the Markov chain that results from the transformation
	 */
	public MarkovChain getResultChain() {
		return resultChain;
	}

	/**
	 * Retrieves the overall success probability.
	 * 
	 * @return the success probability
	 */
	public double getSuccessProbability() {
		return cumulatedSuccessProbability;
	}

	/**
	 * Determines if the calculated success probability conforms to a given
	 * required accuracy.
	 * 
	 * @param requiredAccuracy
	 *            the required accuracy in decimal places
	 * @return true if the required accuracy has been reached
	 */
	public boolean hasRequiredAccuracy(final int requiredAccuracy) {

		// Create an approximation for the accumulated success probability:
		MarkovResultApproximation approximation = new MarkovResultApproximation(
				cumulatedSuccessProbability, cumulatedSuccessProbability
						+ (1.0 - cumulatedPhysicalStateProbability));

		// Check for the required accuracy:
		return approximation.hasRequiredAccuracy(requiredAccuracy);
	}

	/**
	 * Prints the results of the Markov transformation.
	 * 
	 * @param approximate
	 *            indicates if an approximation scheme shall be used for
	 *            printing of probabilities.
	 */
	@Deprecated
	public void print(final boolean approximate) {

		// Start result printing:
		logger.info("Reliability results for UsageScenario \""
				+ scenario.getEntityName() + "\" <" + scenario.getId() + ">:");

		// Get Printer:
		MarkovResultPrinter printer = new MarkovResultPrinter();

		// Only approximate if there are really physical system states left that
		// have not been evaluated:
		boolean doApproximate = (configuration
				.isIterationOverPhysicalSystemStatesEnabled())
				&& approximate
				&& (physicalStateEvaluationCount < Math.pow(markovSource
						.getUnreliableResourceDescriptors().size(), 2));

		// Print success probability:
		if (doApproximate) {
			printer.print("Success probability:", cumulatedSuccessProbability,
					cumulatedSuccessProbability
							+ (1.0 - cumulatedPhysicalStateProbability));
		} else {
			printer.print("Success probability:", cumulatedSuccessProbability);
		}

		// Print all failure probabilities:
		for (MarkovFailureType failureType : getFailureTypesSorted()) {
			double failureTypeProbability = getFailureTypeProbability(failureType);
			if (doApproximate) {
				printer.print(failureType.getName() + ":",
						failureTypeProbability, failureTypeProbability
								+ (1.0 - cumulatedPhysicalStateProbability));
			} else {
				printer.print(failureType.getName() + ":",
						failureTypeProbability);
			}
		}

		/*
		 * If (and only if) the Markov evaluation type is set to
		 * "POINTSOFFAILURE", we will print detailed information regarding
		 * failure probabilities of components and external services.
		 */
		if (MarkovEvaluationType.valueOf(configuration
				.getMarkovEvaluationMode()) == MarkovEvaluationType.POINTSOFFAILURE) {
			new MarkovReporting(cumulatedFailureTypeProbabilities,
					cumulatedPhysicalStateProbability, doApproximate).print(); // detailed
			// failure
			// probabilities
			// report
		}
	}

	/**
	 * Sorts the failure types alphabetically by name.
	 * 
	 * @return the sorted list of failure types
	 */
	private TreeSet<MarkovFailureType> getFailureTypesSorted() {
		TreeSet<MarkovFailureType> result = new TreeSet<MarkovFailureType>();
		for (MarkovFailureType failureType : cumulatedFailureTypeProbabilities
				.keySet()) {
			result.add(failureType);
		}
		return result;
	}

	/**
	 * Retrieves the failure probability of the given failure type.
	 * 
	 * @param failureType
	 *            the given failure type
	 * @return the failure probability
	 */
	private double getFailureTypeProbability(final MarkovFailureType failureType) {
		Double failureTypeProbability = cumulatedFailureTypeProbabilities
				.get(failureType);
		return (failureTypeProbability == null) ? 0.0 : failureTypeProbability;
	}

	/**
	 * Builds the headings string for Markov transformation logging.
	 * 
	 * @return the log headings string
	 */
	private String getLogHeadings() {

		// Build a result string:
		StringBuilder resultString = new StringBuilder();

		// Append state number heading:
		resultString.append("physical system state number;");

		// Append resource state headings:
		for (ProcessingResourceDescriptor descriptor : markovSource
				.getUnreliableResourceDescriptors()) {
			resultString.append(descriptor.getResourceContainerName() + " - "
					+ descriptor.getType().getName() + ";");
		}

		// Append success probability heading:
		resultString.append("success probability;");

		// Append state probability heading:
		resultString.append("physical state probability");

		// Return the result:
		return resultString.toString();
	}

	/**
	 * Builds the results string for Markov transformation logging.
	 * 
	 * @param successProbability
	 *            success probability of the current physical system state
	 * @param physicalStateProbability
	 *            occurrence probability of the current physical system state
	 * @return the results string
	 */
	private String getLogSingleResults(final double successProbability,
			final double physicalStateProbability) {

		// Build a result string:
		StringBuilder resultString = new StringBuilder();

		// Append state number:
		resultString.append(physicalStateEvaluationCount + ";");

		// Append resource states:
		for (ProcessingResourceDescriptor descriptor : markovSource
				.getUnreliableResourceDescriptors()) {
			resultString.append(descriptor.getDefaultState().name() + ";");
		}

		// Append success probability:
		resultString.append(successProbability + ";");

		// Append state probability:
		resultString.append(physicalStateProbability);

		// Return the result:
		return resultString.toString();
	}

	/**
	 * Returns the results of the Markov transformation as string list.
	 * @return results of the Markov transformation as string list
	 */
	@Deprecated
	public List<String> getTextualResults(final boolean approximate) {
		List<String> resultsList = new ArrayList<String>();

		resultsList.add("Reliability results for UsageScenario \""
				+ scenario.getEntityName() + "\" <" + scenario.getId() + ">:");

		// Only approximate if there are really physical system states left that
		// have not been evaluated:
		boolean doApproximate = (configuration
				.isIterationOverPhysicalSystemStatesEnabled())
				&& approximate
				&& (physicalStateEvaluationCount < Math.pow(markovSource
						.getUnreliableResourceDescriptors().size(), 2));

		// Add success probability:
		if (doApproximate) {
			MarkovResultApproximation approximation =
				new MarkovResultApproximation(cumulatedSuccessProbability,
					cumulatedSuccessProbability + (1.0 - cumulatedPhysicalStateProbability));
			int places = approximation.getAccuracy() + 1;
			resultsList.add(String.format("%1$-3s %2$." + places + "f - %3$."
					+ places + "f", "Success probability:", approximation.getAdjustedLowerBound(),
					approximation.getAdjustedUpperBound()));
		} else {
			resultsList.add(String.format("%1$-3s %2$.11f", "Success probability:",
					cumulatedSuccessProbability));
		}

		// Add all failure probabilities:
		for (MarkovFailureType failureType : getFailureTypesSorted()) {
			double failureTypeProbability = getFailureTypeProbability(failureType);
			if (doApproximate) {
				MarkovResultApproximation approximation = new MarkovResultApproximation(
						failureTypeProbability,
						failureTypeProbability + (1.0 - cumulatedPhysicalStateProbability));
				int places = approximation.getAccuracy() + 1;
				resultsList.add(String.format("%1$-3s %2$." + places + "f - %3$."
						+ places + "f", failureType.getName() + ":", failureTypeProbability,
						failureTypeProbability + (1.0 - cumulatedPhysicalStateProbability)));
			} else {
				resultsList.add(String.format("%1$-3s %2$.11f", failureType.getName() + ":",
						failureTypeProbability));
			}
		}

		/*
		 * If (and only if) the Markov evaluation type is set to
		 * "POINTSOFFAILURE", we will add detailed information regarding
		 * failure probabilities of components and external services.
		 */
		if (MarkovEvaluationType.valueOf(configuration
				.getMarkovEvaluationMode()) == MarkovEvaluationType.POINTSOFFAILURE) {
			resultsList.addAll(new MarkovReporting(cumulatedFailureTypeProbabilities,
					cumulatedPhysicalStateProbability, doApproximate).getTextualResults());
		}

		return resultsList;
	}
}
