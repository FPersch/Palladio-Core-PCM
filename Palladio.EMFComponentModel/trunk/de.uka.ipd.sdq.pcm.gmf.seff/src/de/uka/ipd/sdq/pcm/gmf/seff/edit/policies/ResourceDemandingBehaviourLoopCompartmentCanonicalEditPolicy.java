/*
 *Copyright 2006 SDQ Research Group, University of Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.seff.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AquireActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.LoopAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ReleaseActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StartAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StopAction2EditPart;

import de.uka.ipd.sdq.pcm.gmf.seff.part.PalladioComponentModelVisualIDRegistry;

import de.uka.ipd.sdq.pcm.seff.ResourceDemandingBehaviour;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class ResourceDemandingBehaviourLoopCompartmentCanonicalEditPolicy
		extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((ResourceDemandingBehaviour) modelObject)
				.getSteps_Behaviour().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = PalladioComponentModelVisualIDRegistry.getNodeVisualID(
					viewObject, nextValue);
			switch (nodeVID) {
			case StartAction2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case StopAction2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case LoopAction2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case InternalActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case BranchActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case ExternalCallAction2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case CollectionIteratorActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case AquireActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case ReleaseActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case ForkActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case SetVariableActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			return view.isSetElement()
					&& (view.getElement() == null || view.getElement()
							.eIsProxy());
		}
		int nodeVID = PalladioComponentModelVisualIDRegistry.getVisualID(view);
		switch (nodeVID) {
		case StartAction2EditPart.VISUAL_ID:
		case StopAction2EditPart.VISUAL_ID:
		case LoopAction2EditPart.VISUAL_ID:
		case InternalActionEditPart.VISUAL_ID:
		case BranchActionEditPart.VISUAL_ID:
		case ExternalCallAction2EditPart.VISUAL_ID:
		case CollectionIteratorActionEditPart.VISUAL_ID:
		case AquireActionEditPart.VISUAL_ID:
		case ReleaseActionEditPart.VISUAL_ID:
		case ForkActionEditPart.VISUAL_ID:
		case SetVariableActionEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

}
