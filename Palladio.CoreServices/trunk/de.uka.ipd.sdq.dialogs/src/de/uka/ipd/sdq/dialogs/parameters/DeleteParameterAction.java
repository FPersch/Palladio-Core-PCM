package de.uka.ipd.sdq.dialogs.parameters;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import de.uka.ipd.sdq.pcm.repository.Parameter;
import de.uka.ipd.sdq.pcm.repository.Signature;

/** @author roman */
public class DeleteParameterAction extends EditorContentsSelectionAction
		implements SelectionListener {

	private Signature parentSignature;

	/**
	 * The transactional editing domain which is used to get the commands and
	 * alter the model
	 */
	protected TransactionalEditingDomain editingDomain = null;

	/**
	 * @param editingDomain
	 */
	public DeleteParameterAction(Signature signature) {
		this.parentSignature = signature;
		this.editingDomain = TransactionUtil.getEditingDomain(signature);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	public void widgetSelected(SelectionEvent e) {
		final Parameter selectedParameter = (Parameter) getSelectedDeclaration();
		final EList<Parameter> parameters = parentSignature.getParameters__Signature();

		RecordingCommand recCommand = new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				parameters.remove(selectedParameter);
			}
		};

		recCommand.setDescription("Delete ...");
		editingDomain.getCommandStack().execute(recCommand);
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
