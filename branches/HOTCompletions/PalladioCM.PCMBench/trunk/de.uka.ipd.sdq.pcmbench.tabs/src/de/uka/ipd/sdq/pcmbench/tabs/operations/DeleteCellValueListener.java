/**
 * 
 */
package de.uka.ipd.sdq.pcmbench.tabs.operations;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import de.uka.ipd.sdq.pcm.repository.Signature;
import de.uka.ipd.sdq.pcmbench.tabs.generic.SelectionChangedListener;

/**
 * @author Roman Andrej
 */
public class DeleteCellValueListener extends SelectionChangedListener implements SelectionListener {


	private TableViewer viewer;
	
	/** Constructor */
	public DeleteCellValueListener(TableViewer viewer) {
		this.viewer = viewer;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	public void widgetSelected(SelectionEvent e) {
		
		final Signature signature = (Signature) getSelectedElement();
		
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(signature);

		RecordingCommand recCommand = new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				signature.setReturntype__Signature(null);
			}
		};

		recCommand.setDescription("Set void return type signature");
		editingDomain.getCommandStack().execute(recCommand);
		
		viewer.refresh();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	public void widgetDefaultSelected(SelectionEvent e) {
		// The implementation is not necessary.
	}
}
