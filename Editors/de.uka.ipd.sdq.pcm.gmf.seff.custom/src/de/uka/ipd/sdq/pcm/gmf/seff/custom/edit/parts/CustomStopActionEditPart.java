/*
 * Copyright 2006 SDQ Research Group, University of Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.seff.custom.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StopActionEditPart;

/**
 * The customized stop action edit part class.
 */
public class CustomStopActionEditPart extends StopActionEditPart {

    /**
     * Instantiates a new customized stop action edit part.
     * 
     * @param view
     *            the view
     */
    public CustomStopActionEditPart(final View view) {
        super(view);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StopActionEditPart#createNodePlate()
     */
    /**
     * Creates the node plate.
     * 
     * @return the node figure
     * @see de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StopActionEditPart#createNodePlate()
     */
    @Override
    protected NodeFigure createNodePlate() {
        final DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(this.getMapMode().DPtoLP(30), this.getMapMode()
                .DPtoLP(20)) {

            @Override
            protected ConnectionAnchor createDefaultAnchor() {
                return new EllipseAnchor(this);
            }
        };
        return result;
    }

}
