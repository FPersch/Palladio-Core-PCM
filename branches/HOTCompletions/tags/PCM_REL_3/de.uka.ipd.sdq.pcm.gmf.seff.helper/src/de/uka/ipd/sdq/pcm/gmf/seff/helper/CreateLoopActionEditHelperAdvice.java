/**
 * 
 */
package de.uka.ipd.sdq.pcm.gmf.seff.helper;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import de.uka.ipd.sdq.pcm.core.CoreFactory;
import de.uka.ipd.sdq.pcm.core.PCMRandomVariable;
import de.uka.ipd.sdq.pcm.seff.LoopAction;
import de.uka.ipd.sdq.pcm.seff.SeffPackage;

/**
 * The Class define a edit helper to create a empty loop action.
 * 
 * @author Roman Andrej
 */
public class CreateLoopActionEditHelperAdvice extends
		AbstractCreateRandomVariableEditHelperAdvice implements IEditHelperAdvice {
	
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest)
	 */
	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		PCMRandomVariable randomVariable = CoreFactory.eINSTANCE
				.createPCMRandomVariable();

		randomVariable.setSpecification("1");

		SetRequest setRequest = new SetRequest(
				(LoopAction) request.getElementToConfigure(),
				SeffPackage.eINSTANCE.getLoopAction_IterationCount_LoopAction(),
				randomVariable);

		return new SetValueCommand(setRequest);
	}
}
