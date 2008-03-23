/**
 * 
 */
package de.uka.ipd.sdq.pcmbench.tabs.generic;

import java.util.Observable;

import org.eclipse.jface.viewers.ICellModifier;

/**
 * @author Roman Andrej
 */
public abstract class ObservableCellModifier extends Observable implements
		ICellModifier {

	/* (non-Javadoc)
	 * @see java.util.Observable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		setChanged();
		super.notifyObservers();
	}
}
