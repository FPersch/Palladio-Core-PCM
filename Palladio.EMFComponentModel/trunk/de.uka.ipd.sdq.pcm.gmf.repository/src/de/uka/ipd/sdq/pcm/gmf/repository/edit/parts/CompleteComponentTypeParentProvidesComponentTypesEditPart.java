/*
 * Copyright 2007, IPD, SDQ, University of Karlsruhe
 */
package de.uka.ipd.sdq.pcm.gmf.repository.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;

import de.uka.ipd.sdq.pcm.gmf.repository.edit.policies.CompleteComponentTypeParentProvidesComponentTypesItemSemanticEditPolicy;

/**
 * @generated
 */
public class CompleteComponentTypeParentProvidesComponentTypesEditPart extends
		ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4104;

	/**
	 * @generated
	 */
	public CompleteComponentTypeParentProvidesComponentTypesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new CompleteComponentTypeParentProvidesComponentTypesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProvidesParentStereotypeLabelEditPart) {
			((ProvidesParentStereotypeLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureProvidesParentStereotypeLabelFigure());
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
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected Connection createConnectionFigure() {
		return new ParentProvidesTypeFigure();
	}

	/**
	 * @generated
	 */
	public ParentProvidesTypeFigure getPrimaryShape() {
		return (ParentProvidesTypeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ParentProvidesTypeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrapLabel fFigureProvidesParentStereotypeLabelFigure;

		/**
		 * @generated
		 */
		public ParentProvidesTypeFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrapLabel providesParentStereotypeLabelFigure0 = new WrapLabel();
			providesParentStereotypeLabelFigure0.setText("<<conforms>>");

			this.add(providesParentStereotypeLabelFigure0);
			fFigureProvidesParentStereotypeLabelFigure = providesParentStereotypeLabelFigure0;

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureProvidesParentStereotypeLabelFigure() {
			return fFigureProvidesParentStereotypeLabelFigure;
		}

	}

}
