/*
 *Copyright 2006 SDQ Research Group, University of Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.seff.navigator;

import de.uka.ipd.sdq.identifier.Identifier;

import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AbstractActionSuccessor_AbstractActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AquireAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AquireActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AquireActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AquireActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.GuardedBranchTransitionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.GuardedBranchTransitionIdEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.LoopAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.LoopActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.LoopActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.LoopActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ParametricResourceDemandEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ProbabilisticBranchTransitionBranchProbabilityEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ProbabilisticBranchTransitionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ReleaseAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ReleaseActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ReleaseActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ReleaseActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviour2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviour3EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviour4EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviour5EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviourEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingSEFFEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StartAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StartActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StopAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StopActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableCharacterisation2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableCharacterisation3EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableCharacterisationEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsage2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsage3EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsageEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsageReferenceLabel2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsageReferenceLabel3EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsageReferenceLabelEditPart;

import de.uka.ipd.sdq.pcm.gmf.seff.part.PalladioComponentModelSeffDiagramEditorPlugin;
import de.uka.ipd.sdq.pcm.gmf.seff.part.PalladioComponentModelVisualIDRegistry;

import de.uka.ipd.sdq.pcm.gmf.seff.providers.PalladioComponentModelElementTypes;

import de.uka.ipd.sdq.pcm.gmf.seff.providers.PalladioComponentModelParserProvider;
import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;

import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;

import org.eclipse.swt.graphics.Image;

import org.eclipse.ui.IMemento;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class PalladioComponentModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?InvalidElement",
						ImageDescriptor.getMissingImageDescriptor());
		PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?UnknownElement",
						ImageDescriptor.getMissingImageDescriptor());
		PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?ImageNotFound",
						ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PalladioComponentModelNavigatorItem
				&& !isOwnView(((PalladioComponentModelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof PalladioComponentModelNavigatorGroup) {
			PalladioComponentModelNavigatorGroup group = (PalladioComponentModelNavigatorGroup) element;
			return PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof PalladioComponentModelNavigatorItem) {
			PalladioComponentModelNavigatorItem navigatorItem = (PalladioComponentModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (PalladioComponentModelVisualIDRegistry.getVisualID(view)) {
		case StartActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?StartAction",
					PalladioComponentModelElementTypes.StartAction_2001);
		case StopActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?StopAction",
					PalladioComponentModelElementTypes.StopAction_2002);
		case ExternalCallActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ExternalCallAction",
					PalladioComponentModelElementTypes.ExternalCallAction_2003);
		case LoopActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?LoopAction",
					PalladioComponentModelElementTypes.LoopAction_2004);
		case BranchAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?BranchAction",
					PalladioComponentModelElementTypes.BranchAction_2005);
		case InternalAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?InternalAction",
					PalladioComponentModelElementTypes.InternalAction_2006);
		case CollectionIteratorAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?CollectionIteratorAction",
					PalladioComponentModelElementTypes.CollectionIteratorAction_2007);
		case SetVariableAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?SetVariableAction",
					PalladioComponentModelElementTypes.SetVariableAction_2008);
		case AquireAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?AquireAction",
					PalladioComponentModelElementTypes.AquireAction_2009);
		case ReleaseAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ReleaseAction",
					PalladioComponentModelElementTypes.ReleaseAction_2010);
		case ForkAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ForkAction",
					PalladioComponentModelElementTypes.ForkAction_2011);
		case VariableUsageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/Parameter/1.0?VariableUsage",
					PalladioComponentModelElementTypes.VariableUsage_3001);
		case VariableCharacterisationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/Parameter/1.0?VariableCharacterisation",
					PalladioComponentModelElementTypes.VariableCharacterisation_3002);
		case VariableUsage2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/Parameter/1.0?VariableUsage",
					PalladioComponentModelElementTypes.VariableUsage_3022);
		case VariableCharacterisation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/Parameter/1.0?VariableCharacterisation",
					PalladioComponentModelElementTypes.VariableCharacterisation_3016);
		case ResourceDemandingBehaviourEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ResourceDemandingBehaviour",
					PalladioComponentModelElementTypes.ResourceDemandingBehaviour_3003);
		case StartAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?StartAction",
					PalladioComponentModelElementTypes.StartAction_3004);
		case StopAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?StopAction",
					PalladioComponentModelElementTypes.StopAction_3005);
		case LoopAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?LoopAction",
					PalladioComponentModelElementTypes.LoopAction_3006);
		case InternalActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?InternalAction",
					PalladioComponentModelElementTypes.InternalAction_3007);
		case ParametricResourceDemandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ParametricResourceDemand",
					PalladioComponentModelElementTypes.ParametricResourceDemand_3008);
		case BranchActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?BranchAction",
					PalladioComponentModelElementTypes.BranchAction_3009);
		case ProbabilisticBranchTransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ProbabilisticBranchTransition",
					PalladioComponentModelElementTypes.ProbabilisticBranchTransition_3010);
		case ResourceDemandingBehaviour2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ResourceDemandingBehaviour",
					PalladioComponentModelElementTypes.ResourceDemandingBehaviour_3011);
		case ExternalCallAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ExternalCallAction",
					PalladioComponentModelElementTypes.ExternalCallAction_3012);
		case AquireActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?AquireAction",
					PalladioComponentModelElementTypes.AquireAction_3019);
		case ReleaseActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ReleaseAction",
					PalladioComponentModelElementTypes.ReleaseAction_3020);
		case ForkActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ForkAction",
					PalladioComponentModelElementTypes.ForkAction_3023);
		case ResourceDemandingBehaviour3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ResourceDemandingBehaviour",
					PalladioComponentModelElementTypes.ResourceDemandingBehaviour_3021);
		case CollectionIteratorActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?CollectionIteratorAction",
					PalladioComponentModelElementTypes.CollectionIteratorAction_3013);
		case ResourceDemandingBehaviour4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ResourceDemandingBehaviour",
					PalladioComponentModelElementTypes.ResourceDemandingBehaviour_3014);
		case SetVariableActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?SetVariableAction",
					PalladioComponentModelElementTypes.SetVariableAction_3024);
		case VariableUsage3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/Parameter/1.0?VariableUsage",
					PalladioComponentModelElementTypes.VariableUsage_3015);
		case VariableCharacterisation3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/Parameter/1.0?VariableCharacterisation",
					PalladioComponentModelElementTypes.VariableCharacterisation_3025);
		case GuardedBranchTransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?GuardedBranchTransition",
					PalladioComponentModelElementTypes.GuardedBranchTransition_3017);
		case ResourceDemandingBehaviour5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ResourceDemandingBehaviour",
					PalladioComponentModelElementTypes.ResourceDemandingBehaviour_3018);
		case ResourceDemandingSEFFEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?ResourceDemandingSEFF",
					PalladioComponentModelElementTypes.ResourceDemandingSEFF_1000);
		case AbstractActionSuccessor_AbstractActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/1.0?AbstractAction?successor_AbstractAction",
					PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		default:
			return getImage("Navigator?UnknownElement", null);
		}
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PalladioComponentModelSeffDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& PalladioComponentModelElementTypes
						.isKnownElementType(elementType)) {
			image = PalladioComponentModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound");
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof PalladioComponentModelNavigatorGroup) {
			PalladioComponentModelNavigatorGroup group = (PalladioComponentModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PalladioComponentModelNavigatorItem) {
			PalladioComponentModelNavigatorItem navigatorItem = (PalladioComponentModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PalladioComponentModelVisualIDRegistry.getVisualID(view)) {
		case StartActionEditPart.VISUAL_ID:
			return getStartAction_2001Text(view);
		case StopActionEditPart.VISUAL_ID:
			return getStopAction_2002Text(view);
		case ExternalCallActionEditPart.VISUAL_ID:
			return getExternalCallAction_2003Text(view);
		case LoopActionEditPart.VISUAL_ID:
			return getLoopAction_2004Text(view);
		case BranchAction2EditPart.VISUAL_ID:
			return getBranchAction_2005Text(view);
		case InternalAction2EditPart.VISUAL_ID:
			return getInternalAction_2006Text(view);
		case CollectionIteratorAction2EditPart.VISUAL_ID:
			return getCollectionIteratorAction_2007Text(view);
		case SetVariableAction2EditPart.VISUAL_ID:
			return getSetVariableAction_2008Text(view);
		case AquireAction2EditPart.VISUAL_ID:
			return getAquireAction_2009Text(view);
		case ReleaseAction2EditPart.VISUAL_ID:
			return getReleaseAction_2010Text(view);
		case ForkAction2EditPart.VISUAL_ID:
			return getForkAction_2011Text(view);
		case VariableUsageEditPart.VISUAL_ID:
			return getVariableUsage_3001Text(view);
		case VariableCharacterisationEditPart.VISUAL_ID:
			return getVariableCharacterisation_3002Text(view);
		case VariableUsage2EditPart.VISUAL_ID:
			return getVariableUsage_3022Text(view);
		case VariableCharacterisation2EditPart.VISUAL_ID:
			return getVariableCharacterisation_3016Text(view);
		case ResourceDemandingBehaviourEditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3003Text(view);
		case StartAction2EditPart.VISUAL_ID:
			return getStartAction_3004Text(view);
		case StopAction2EditPart.VISUAL_ID:
			return getStopAction_3005Text(view);
		case LoopAction2EditPart.VISUAL_ID:
			return getLoopAction_3006Text(view);
		case InternalActionEditPart.VISUAL_ID:
			return getInternalAction_3007Text(view);
		case ParametricResourceDemandEditPart.VISUAL_ID:
			return getParametricResourceDemand_3008Text(view);
		case BranchActionEditPart.VISUAL_ID:
			return getBranchAction_3009Text(view);
		case ProbabilisticBranchTransitionEditPart.VISUAL_ID:
			return getProbabilisticBranchTransition_3010Text(view);
		case ResourceDemandingBehaviour2EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3011Text(view);
		case ExternalCallAction2EditPart.VISUAL_ID:
			return getExternalCallAction_3012Text(view);
		case AquireActionEditPart.VISUAL_ID:
			return getAquireAction_3019Text(view);
		case ReleaseActionEditPart.VISUAL_ID:
			return getReleaseAction_3020Text(view);
		case ForkActionEditPart.VISUAL_ID:
			return getForkAction_3023Text(view);
		case ResourceDemandingBehaviour3EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3021Text(view);
		case CollectionIteratorActionEditPart.VISUAL_ID:
			return getCollectionIteratorAction_3013Text(view);
		case ResourceDemandingBehaviour4EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3014Text(view);
		case SetVariableActionEditPart.VISUAL_ID:
			return getSetVariableAction_3024Text(view);
		case VariableUsage3EditPart.VISUAL_ID:
			return getVariableUsage_3015Text(view);
		case VariableCharacterisation3EditPart.VISUAL_ID:
			return getVariableCharacterisation_3025Text(view);
		case GuardedBranchTransitionEditPart.VISUAL_ID:
			return getGuardedBranchTransition_3017Text(view);
		case ResourceDemandingBehaviour5EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3018Text(view);
		case ResourceDemandingSEFFEditPart.VISUAL_ID:
			return getResourceDemandingSEFF_1000Text(view);
		case AbstractActionSuccessor_AbstractActionEditPart.VISUAL_ID:
			return getAbstractActionSuccessor_AbstractAction_4001Text(view);
		default:
			return getUnknownElementText(view);
		}
	}

	/**
	 * @generated
	 */
	private String getStartAction_2001Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identifier) domainModelElement).getId();
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getStopAction_2002Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identifier) domainModelElement).getId();
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getExternalCallAction_2003Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.ExternalCallAction_2003,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(ExternalCallActionEntityNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getLoopAction_2004Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.LoopAction_2004, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(LoopActionEntityName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getBranchAction_2005Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.BranchAction_2005, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(BranchActionEntityName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInternalAction_2006Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.InternalAction_2006, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(InternalActionEntityName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getCollectionIteratorAction_2007Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.CollectionIteratorAction_2007,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(CollectionIteratorActionEntityName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getSetVariableAction_2008Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.SetVariableAction_2008,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(SetVariableActionEntityName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5023);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getAquireAction_2009Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.AquireAction_2009, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(AquireActionEntityName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5021);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getReleaseAction_2010Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.ReleaseAction_2010, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(ReleaseActionEntityName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5022);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getForkAction_2011Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.ForkAction_2011, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(ForkActionEntityName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5024);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getVariableUsage_3001Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.VariableUsage_3001, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(VariableUsageReferenceLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getVariableCharacterisation_3002Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.VariableCharacterisation_3002,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(VariableCharacterisationEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getVariableUsage_3022Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.VariableUsage_3022,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(VariableUsageReferenceLabel2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5025);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResourceDemandingBehaviour_3003Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getStartAction_3004Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identifier) domainModelElement).getId();
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getStopAction_3005Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identifier) domainModelElement).getId();
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getLoopAction_3006Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.LoopAction_3006, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(LoopActionEntityNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInternalAction_3007Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.InternalAction_3007, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(InternalActionEntityNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getParametricResourceDemand_3008Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.ParametricResourceDemand_3008,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(ParametricResourceDemandEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getBranchAction_3009Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.BranchAction_3009, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(BranchActionEntityNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getProbabilisticBranchTransition_3010Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.ProbabilisticBranchTransition_3010,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(ProbabilisticBranchTransitionBranchProbabilityEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResourceDemandingBehaviour_3011Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getExternalCallAction_3012Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.ExternalCallAction_3012,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(ExternalCallActionEntityName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getAquireAction_3019Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.AquireAction_3019, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(AquireActionEntityNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5019);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getReleaseAction_3020Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.ReleaseAction_3020, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(ReleaseActionEntityNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5020);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getForkAction_3023Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.ForkAction_3023, (view
						.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(ForkActionEntityNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5026);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getGuardedBranchTransition_3017Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.GuardedBranchTransition_3017,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(GuardedBranchTransitionIdEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5018);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResourceDemandingBehaviour_3018Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getCollectionIteratorAction_3013Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.CollectionIteratorAction_3013,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(CollectionIteratorActionEntityNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResourceDemandingBehaviour_3014Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getSetVariableAction_3024Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.SetVariableAction_3024,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(SetVariableActionEntityNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getVariableUsage_3015Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.VariableUsage_3015,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(VariableUsageReferenceLabel3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getVariableCharacterisation_3025Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.VariableCharacterisation_3025,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(VariableCharacterisation3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3025);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getVariableCharacterisation_3016Text(View view) {
		IAdaptable hintAdapter = new PalladioComponentModelParserProvider.HintAdapter(
				PalladioComponentModelElementTypes.VariableCharacterisation_3016,
				(view.getElement() != null ? view.getElement() : view),
				PalladioComponentModelVisualIDRegistry
						.getType(VariableCharacterisation2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3016);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getResourceDemandingBehaviour_3021Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getResourceDemandingSEFF_1000Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identifier) domainModelElement).getId();
		} else {
			PalladioComponentModelSeffDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getAbstractActionSuccessor_AbstractAction_4001Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">";
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">";
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ResourceDemandingSEFFEditPart.MODEL_ID
				.equals(PalladioComponentModelVisualIDRegistry.getModelID(view));
	}

}
