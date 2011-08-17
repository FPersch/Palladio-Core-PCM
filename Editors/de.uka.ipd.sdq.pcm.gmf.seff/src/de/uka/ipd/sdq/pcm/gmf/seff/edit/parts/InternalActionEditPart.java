/*
 * Copyright 2006 SDQ Research Group, University of Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.seff.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import de.uka.ipd.sdq.pcm.gmf.seff.edit.policies.InternalActionItemSemanticEditPolicy;
import de.uka.ipd.sdq.pcm.gmf.seff.part.PalladioComponentModelVisualIDRegistry;
import de.uka.ipd.sdq.pcm.gmf.seff.providers.PalladioComponentModelElementTypes;

/**
 * @generated
 */
public class InternalActionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public InternalActionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InternalActionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		InternalActionFigure figure = new InternalActionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public InternalActionFigure getPrimaryShape() {
		return (InternalActionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InternalActionEntityNameEditPart) {
			((InternalActionEntityNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureInternalActionFigureNameLabel());
			return true;
		}
		if (childEditPart instanceof InternalActionResourceDemand2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureInternalActionCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InternalActionResourceDemand2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof InternalActionFailureOccurrenceDescriptions2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureInternalActionCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((InternalActionFailureOccurrenceDescriptions2EditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof InternalActionInfrastructureCallsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureInternalActionCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((InternalActionInfrastructureCallsCompartment2EditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InternalActionEntityNameEditPart) {
			return true;
		}
		if (childEditPart instanceof InternalActionResourceDemand2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureInternalActionCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((InternalActionResourceDemand2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof InternalActionFailureOccurrenceDescriptions2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureInternalActionCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((InternalActionFailureOccurrenceDescriptions2EditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof InternalActionInfrastructureCallsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureInternalActionCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((InternalActionInfrastructureCallsCompartment2EditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof InternalActionResourceDemand2EditPart) {
			return getPrimaryShape().getFigureInternalActionCompartment();
		}
		if (editPart instanceof InternalActionFailureOccurrenceDescriptions2EditPart) {
			return getPrimaryShape().getFigureInternalActionCompartment();
		}
		if (editPart instanceof InternalActionInfrastructureCallsCompartment2EditPart) {
			return getPrimaryShape().getFigureInternalActionCompartment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(PalladioComponentModelVisualIDRegistry
				.getType(InternalActionEntityNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types
				.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof StartActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof StopActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof ExternalCallActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof EmitEventActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof LoopActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof BranchActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof CollectionIteratorActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof SetVariableActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof AcquireActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof ReleaseActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof ForkActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof RecoveryBlockActionEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof StartAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof StopAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof LoopAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof InternalAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof BranchAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof ExternalCallAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof EmitEventAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof AcquireAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof ReleaseAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof ForkAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof CollectionIteratorAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof RecoveryBlockAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		if (targetEditPart instanceof SetVariableAction2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.StartAction_2001);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.StopAction_2002);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.ExternalCallAction_2003);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.EmitEventAction_2013);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.LoopAction_2004);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.BranchAction_2005);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.InternalAction_2006);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.CollectionIteratorAction_2007);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.SetVariableAction_2008);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.AcquireAction_2012);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.ReleaseAction_2010);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.ForkAction_2011);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.RecoveryBlockAction_2015);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.StartAction_3004);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.StopAction_3005);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.LoopAction_3006);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.InternalAction_3007);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.BranchAction_3009);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.ExternalCallAction_3012);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.EmitEventAction_3046);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.AcquireAction_3026);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.ReleaseAction_3020);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.ForkAction_3023);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.CollectionIteratorAction_3013);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.RecoveryBlockAction_3056);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.SetVariableAction_3024);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types
				.add(PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.StartAction_2001);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.StopAction_2002);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.ExternalCallAction_2003);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.EmitEventAction_2013);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.LoopAction_2004);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.BranchAction_2005);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.InternalAction_2006);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.CollectionIteratorAction_2007);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.SetVariableAction_2008);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.AcquireAction_2012);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.ReleaseAction_2010);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.ForkAction_2011);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.RecoveryBlockAction_2015);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.StartAction_3004);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.StopAction_3005);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.LoopAction_3006);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.InternalAction_3007);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.BranchAction_3009);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.ExternalCallAction_3012);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.EmitEventAction_3046);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.AcquireAction_3026);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.ReleaseAction_3020);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types.add(PalladioComponentModelElementTypes.ForkAction_3023);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.CollectionIteratorAction_3013);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.RecoveryBlockAction_3056);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001) {
			types
					.add(PalladioComponentModelElementTypes.SetVariableAction_3024);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == PalladioComponentModelElementTypes.ParametricResourceDemand_3051) {
				return getChildBySemanticHint(PalladioComponentModelVisualIDRegistry
						.getType(InternalActionResourceDemand2EditPart.VISUAL_ID));
			}
			if (type == PalladioComponentModelElementTypes.InternalFailureOccurrenceDescription_3050) {
				return getChildBySemanticHint(PalladioComponentModelVisualIDRegistry
						.getType(InternalActionFailureOccurrenceDescriptions2EditPart.VISUAL_ID));
			}
			if (type == PalladioComponentModelElementTypes.InfrastructureCall_3053) {
				return getChildBySemanticHint(PalladioComponentModelVisualIDRegistry
						.getType(InternalActionInfrastructureCallsCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class InternalActionFigure extends RoundedRectangle {
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInternalActionFigureNameLabel;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureInternalActionCompartment;

		/**
		 * @generated
		 */
		public InternalActionFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 0;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(1);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel internalActionStereotypeLabelFigure0 = new WrappingLabel();
			internalActionStereotypeLabelFigure0.setText("<<InternalAction>>");
			internalActionStereotypeLabelFigure0.setBorder(new MarginBorder(
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(0)));

			GridData constraintInternalActionStereotypeLabelFigure0 = new GridData();
			constraintInternalActionStereotypeLabelFigure0.verticalAlignment = GridData.CENTER;
			constraintInternalActionStereotypeLabelFigure0.horizontalAlignment = GridData.CENTER;
			constraintInternalActionStereotypeLabelFigure0.horizontalIndent = 0;
			constraintInternalActionStereotypeLabelFigure0.horizontalSpan = 1;
			constraintInternalActionStereotypeLabelFigure0.verticalSpan = 1;
			constraintInternalActionStereotypeLabelFigure0.grabExcessHorizontalSpace = false;
			constraintInternalActionStereotypeLabelFigure0.grabExcessVerticalSpace = false;
			this.add(internalActionStereotypeLabelFigure0,
					constraintInternalActionStereotypeLabelFigure0);

			fFigureInternalActionFigureNameLabel = new WrappingLabel();
			fFigureInternalActionFigureNameLabel.setText("<myName>");
			fFigureInternalActionFigureNameLabel.setBorder(new MarginBorder(
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(0)));

			GridData constraintFFigureInternalActionFigureNameLabel = new GridData();
			constraintFFigureInternalActionFigureNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureInternalActionFigureNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureInternalActionFigureNameLabel.horizontalIndent = 0;
			constraintFFigureInternalActionFigureNameLabel.horizontalSpan = 1;
			constraintFFigureInternalActionFigureNameLabel.verticalSpan = 1;
			constraintFFigureInternalActionFigureNameLabel.grabExcessHorizontalSpace = false;
			constraintFFigureInternalActionFigureNameLabel.grabExcessVerticalSpace = false;
			this.add(fFigureInternalActionFigureNameLabel,
					constraintFFigureInternalActionFigureNameLabel);

			fFigureInternalActionCompartment = new RectangleFigure();
			fFigureInternalActionCompartment.setFill(false);
			fFigureInternalActionCompartment.setOutline(false);
			fFigureInternalActionCompartment.setLineWidth(1);
			fFigureInternalActionCompartment.setMinimumSize(new Dimension(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			GridData constraintFFigureInternalActionCompartment = new GridData();
			constraintFFigureInternalActionCompartment.verticalAlignment = GridData.FILL;
			constraintFFigureInternalActionCompartment.horizontalAlignment = GridData.FILL;
			constraintFFigureInternalActionCompartment.horizontalIndent = 0;
			constraintFFigureInternalActionCompartment.horizontalSpan = 1;
			constraintFFigureInternalActionCompartment.verticalSpan = 1;
			constraintFFigureInternalActionCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureInternalActionCompartment.grabExcessVerticalSpace = true;
			this.add(fFigureInternalActionCompartment,
					constraintFFigureInternalActionCompartment);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInternalActionFigureNameLabel() {
			return fFigureInternalActionFigureNameLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInternalActionCompartment() {
			return fFigureInternalActionCompartment;
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
