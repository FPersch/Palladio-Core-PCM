/**
 * 
 */
package de.uka.ipd.sdq.pcm.gmf.system;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

/**
 * @author Snowball
 *
 */
public class RotatingBorderItemLocator extends BorderItemLocator {

	public RotatingBorderItemLocator(IFigure parentFigure) {
		super(parentFigure);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator#setCurrentSideOfParent(int)
	 */
	@Override
	public void setCurrentSideOfParent(int side) {
		super.setCurrentSideOfParent(side);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator#relocate(org.eclipse.draw2d.IFigure)
	 */
	@Override
	public void relocate(IFigure borderItem) {
		Dimension dim = borderItem.getBounds().getSize().getCopy();
		int oldSide = getCurrentSideOfParent();
		super.relocate(borderItem);
		int side = getCurrentSideOfParent();
		if (oldSide != side) {
			if (oldSide == PositionConstants.WEST || oldSide == PositionConstants.EAST)
			{
				if (side == PositionConstants.NORTH || side == PositionConstants.SOUTH)
					dim.transpose();
			}
			else
			{
				if (side == PositionConstants.EAST || side == PositionConstants.WEST)
					dim.transpose();
			}	
			borderItem.setSize(dim);
			super.relocate(borderItem);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator#getValidLocation(org.eclipse.draw2d.geometry.Rectangle, org.eclipse.draw2d.IFigure)
	 */
	@Override
	public Rectangle getValidLocation(Rectangle proposedLocation, IFigure borderItem) {
		Rectangle originalResult = super.getValidLocation(proposedLocation, borderItem);
		Rectangle result = new Rectangle(originalResult);
		int side = findClosestSideOfParent(originalResult, getParentBorder());
		if (getCurrentSideOfParent() == PositionConstants.WEST || getCurrentSideOfParent() == PositionConstants.EAST)
		{
			switch (side) {
			case PositionConstants.NORTH:
				result.height = originalResult.width;
				result.width = originalResult.height;
				result.y = result.y - (originalResult.width - originalResult.height);
				break;
			case PositionConstants.SOUTH:
				result.height = originalResult.width;
				result.width = originalResult.height;
				break;
			}
		}
		else
		{
			switch (side) {
			case PositionConstants.EAST:
				result.height = originalResult.width;
				result.width = originalResult.height;
				break;
			case PositionConstants.WEST:
				result.height = originalResult.width;
				result.width = originalResult.height;
				result.x = result.x + (originalResult.width - originalResult.height);
				break;
			}
		}	
		return result;
	}
}
