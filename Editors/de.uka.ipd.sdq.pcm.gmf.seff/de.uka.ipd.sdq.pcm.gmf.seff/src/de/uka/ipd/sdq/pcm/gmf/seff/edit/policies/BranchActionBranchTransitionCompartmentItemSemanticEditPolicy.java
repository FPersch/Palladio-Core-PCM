/*
 *Copyright 2006 SDQ Research Group, University of Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.seff.edit.policies;

import de.uka.ipd.sdq.pcm.gmf.seff.edit.commands.GuardedBranchTransitionCreateCommand;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.commands.ProbabilisticBranchTransitionCreateCommand;

import de.uka.ipd.sdq.pcm.gmf.seff.providers.PalladioComponentModelElementTypes;

import de.uka.ipd.sdq.pcm.seff.SeffPackage;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class BranchActionBranchTransitionCompartmentItemSemanticEditPolicy
		extends PalladioComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PalladioComponentModelElementTypes.ProbabilisticBranchTransition_3010 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(SeffPackage.eINSTANCE
						.getBranchAction_Branches_Branch());
			}
			return getGEFWrapper(new ProbabilisticBranchTransitionCreateCommand(
					req));
		}
		if (PalladioComponentModelElementTypes.GuardedBranchTransition_3017 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(SeffPackage.eINSTANCE
						.getBranchAction_Branches_Branch());
			}
			return getGEFWrapper(new GuardedBranchTransitionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
