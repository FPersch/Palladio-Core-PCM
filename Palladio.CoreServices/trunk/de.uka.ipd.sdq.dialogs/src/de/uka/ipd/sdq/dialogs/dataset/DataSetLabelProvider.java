/**
 * 
 */
package de.uka.ipd.sdq.dialogs.dataset;

import org.eclipse.jface.viewers.LabelProvider;

import de.uka.ipd.sdq.sensorfactory.entities.dao.IDAOFactory;

/**
 * @author roman
 *
 */
public class DataSetLabelProvider extends LabelProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof IDAOFactory) {
			IDAOFactory factory = (IDAOFactory) element;
			return factory.getName() + " [" + factory.getID()+ "]";
		}
		return super.getText(element);
	}

}
