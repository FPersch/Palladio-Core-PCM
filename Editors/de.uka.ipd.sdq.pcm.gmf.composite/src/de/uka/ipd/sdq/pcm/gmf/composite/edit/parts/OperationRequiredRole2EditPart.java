/*
 * Copyright 2007, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.composite.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import de.uka.ipd.sdq.pcm.gmf.composite.SocketFigure;
import de.uka.ipd.sdq.pcm.gmf.composite.AbstractBorderFigure.POSITION_TYPE;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.policies.OperationRequiredRole2ItemSemanticEditPolicy;
import de.uka.ipd.sdq.pcm.gmf.composite.part.PalladioComponentModelVisualIDRegistry;
import de.uka.ipd.sdq.pcm.gmf.composite.providers.PalladioComponentModelElementTypes;

/**
 * Operation Required Role Edit Part for outer system operation required roles.
 * 
 * For assembly context operation required roles
 * @see OperationRequiredRoleEditPart
 * 
 * @generated
 */
public class OperationRequiredRole2EditPart extends BorderedBorderItemEditPart {

	/**
	 * size of the figure in LP
	 * 
	 * @generated not
	 */
	private static final int FIGURE_LOGICAL_SIZE = 60;

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3012;

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
	public OperationRequiredRole2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OperationRequiredRole2ItemSemanticEditPolicy());
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
				View childView = (View) child.getModel();
				switch (PalladioComponentModelVisualIDRegistry
						.getVisualID(childView)) {
				case OperationRequiredRoleEntityName2EditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle(
									(GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
				}
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
		OperationRequiredRoleFigure figure = new OperationRequiredRoleFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public OperationRequiredRoleFigure getPrimaryShape() {
		return (OperationRequiredRoleFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof OperationRequiredRoleEntityName2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated not
	 */
	protected NodeFigure createNodePlate() {
		//DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
		//		.DPtoLP(20), getMapMode().DPtoLP(20));

		SocketFigure result = new SocketFigure(getMapMode().DPtoLP(
				FIGURE_LOGICAL_SIZE), POSITION_TYPE.POS_EXTERNAL);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated not
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		//figure.setLayoutManager(new StackLayout());
		//IFigure shape = createNodeShape();
		//figure.add(shape);
		//contentPane = setupContentPane(shape);

		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
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
				.getType(OperationRequiredRoleEntityName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(PalladioComponentModelElementTypes.AssemblyConnector_4004);
		types
				.add(PalladioComponentModelElementTypes.RequiredDelegationConnector_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof OperationProvidedRoleEditPart) {
			types
					.add(PalladioComponentModelElementTypes.AssemblyConnector_4004);
		}
		if (targetEditPart instanceof OperationProvidedRole2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.AssemblyConnector_4004);
		}
		if (targetEditPart instanceof OperationRequiredRoleEditPart) {
			types
					.add(PalladioComponentModelElementTypes.RequiredDelegationConnector_4005);
		}
		if (targetEditPart instanceof de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.OperationRequiredRole2EditPart) {
			types
					.add(PalladioComponentModelElementTypes.RequiredDelegationConnector_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == PalladioComponentModelElementTypes.AssemblyConnector_4004) {
			types
					.add(PalladioComponentModelElementTypes.OperationProvidedRole_3007);
		}
		if (relationshipType == PalladioComponentModelElementTypes.AssemblyConnector_4004) {
			types
					.add(PalladioComponentModelElementTypes.OperationProvidedRole_3011);
		}
		if (relationshipType == PalladioComponentModelElementTypes.RequiredDelegationConnector_4005) {
			types
					.add(PalladioComponentModelElementTypes.OperationRequiredRole_3008);
		}
		if (relationshipType == PalladioComponentModelElementTypes.RequiredDelegationConnector_4005) {
			types
					.add(PalladioComponentModelElementTypes.OperationRequiredRole_3012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types
				.add(PalladioComponentModelElementTypes.RequiredDelegationConnector_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == PalladioComponentModelElementTypes.RequiredDelegationConnector_4005) {
			types
					.add(PalladioComponentModelElementTypes.OperationRequiredRole_3008);
		}
		if (relationshipType == PalladioComponentModelElementTypes.RequiredDelegationConnector_4005) {
			types
					.add(PalladioComponentModelElementTypes.OperationRequiredRole_3012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class OperationRequiredRoleFigure extends Ellipse {

		/**
		 * @generated
		 */
		public OperationRequiredRoleFigure() {
			this.setLineWidth(1);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setLocation(new Point(getMapMode().DPtoLP(50), getMapMode()
					.DPtoLP(50)));
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