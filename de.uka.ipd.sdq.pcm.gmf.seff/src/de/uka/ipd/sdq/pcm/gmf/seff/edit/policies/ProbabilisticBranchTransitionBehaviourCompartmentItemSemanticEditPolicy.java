/*
 *Copyright 2006 SDQ Research Group, University of Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.seff.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.uka.ipd.sdq.pcm.gmf.seff.edit.commands.ResourceDemandingBehaviour2CreateCommand;
import de.uka.ipd.sdq.pcm.gmf.seff.providers.PalladioComponentModelElementTypes;
import de.uka.ipd.sdq.pcm.seff.SeffPackage;

/**
 * @generated
 */
public class ProbabilisticBranchTransitionBehaviourCompartmentItemSemanticEditPolicy
		extends PalladioComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PalladioComponentModelElementTypes.ResourceDemandingBehaviour_3011 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(SeffPackage.eINSTANCE
								.getAbstractBranchTransition_BranchBehaviour_BranchTransition());
			}
			return getMSLWrapper(new ResourceDemandingBehaviour2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}
}
