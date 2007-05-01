package de.uka.ipd.sdq.pcm.gmf.seff.edit.policies;

import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.pcm.seff.LoopAction;
import de.uka.ipd.sdq.stoex.RandomVariable;

// Manually written open policy to open the StoEx Dialog. It's
// called via a CustomBehaviour in the genmap
public class OpenLoopIterationsDialog extends OpenStoExDialog {

	
	@Override
	protected RandomVariable getRandomVariable(EObject parent) {
		LoopAction loop = (LoopAction) parent;
		RandomVariable rv = loop.getIterations_LoopAction();
		return rv;
	}
}
