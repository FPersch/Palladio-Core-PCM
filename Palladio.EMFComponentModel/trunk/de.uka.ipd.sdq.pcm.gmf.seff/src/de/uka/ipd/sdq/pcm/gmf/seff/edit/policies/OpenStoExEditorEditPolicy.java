/**
 * 
 */
package de.uka.ipd.sdq.pcm.gmf.seff.edit.policies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import de.uka.ipd.sdq.dialogs.selection.StochasticExpressionEditDialog;
import de.uka.ipd.sdq.pcm.core.stochastics.RandomVariable;
import de.uka.ipd.sdq.pcm.core.stochastics.StochasticsPackage;
import de.uka.ipd.sdq.stoex.analyser.visitors.StoExPrettyPrintVisitor;

/**
 * @author Snowball
 *
 */
public class OpenStoExEditorEditPolicy extends OpenEditPolicy {

	private RandomVariable randVar;

	/**
	 * 
	 */
	public OpenStoExEditorEditPolicy(RandomVariable randVar) {
		this.randVar = randVar;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy#getOpenCommand(org.eclipse.gef.Request)
	 */
	@Override
	protected Command getOpenCommand(Request request) {
		StochasticExpressionEditDialog dialog = new StochasticExpressionEditDialog(getHost().getRoot().getViewer().getControl().getShell());
		dialog.setInitialExpression(randVar.getSpecification_RandomVariable());
		dialog.open();
		if (dialog.getResult() != null) {
			String result = "= " + new StoExPrettyPrintVisitor().prettyPrint(dialog.getResult());
			SetValueCommand cmd = new SetValueCommand(
					new SetRequest(randVar, StochasticsPackage.eINSTANCE.getRandomVariable_Specification(), result)) {

						/* (non-Javadoc)
						 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecute(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
						 */
						@Override
						protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
							IStatus s = super.doExecute(monitor, info);
							getHost().refresh();
							return s;
						}
				
			};
			return new ICommandProxy(cmd);
		}
		return null;
	}
}
