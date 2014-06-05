package edu.kit.ipd.sdq.eventsim.workload.interpreter.usage.strategies;

import de.uka.ipd.sdq.pcm.usagemodel.Start;
import edu.kit.ipd.sdq.eventsim.core.palladio.state.UserState;
import edu.kit.ipd.sdq.eventsim.workload.entities.User;
import edu.kit.ipd.sdq.eventsim.workload.interpreter.usage.IUsageTraversalInstruction;
import edu.kit.ipd.sdq.eventsim.workload.interpreter.usage.IUsageTraversalStrategy;
import edu.kit.ipd.sdq.eventsim.workload.interpreter.usage.instructions.UsageTraversalInstructionFactory;

/**
 * This traversal strategy is responsible for {@link Start} actions.
 * 
 * @author Philipp Merkle
 * 
 */
public class StartTraversalStrategy implements IUsageTraversalStrategy<Start> {

    /**
     * {@inheritDoc}
     */
    @Override
    public IUsageTraversalInstruction traverse(final Start start, final User user, final UserState state) {
        return UsageTraversalInstructionFactory.traverseNextAction(start.getSuccessor());
    }

}