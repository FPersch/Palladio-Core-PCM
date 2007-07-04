package de.uka.ipd.sdq.pcm.gmf.seff.helper;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.dialogs.selection.PalladioSelectEObjectDialog;
import de.uka.ipd.sdq.dialogs.stoex.StochasticExpressionEditDialog;
import de.uka.ipd.sdq.pcm.repository.Parameter;
import de.uka.ipd.sdq.pcm.resourcetype.ProcessingResourceType;
import de.uka.ipd.sdq.pcm.resourcetype.ResourceRepository;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.pcm.seff.SeffPackage;
import de.uka.ipd.sdq.pcm.stochasticexpressions.PCMStoExPrettyPrintVisitor;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

/** @author roman */
public class ParametricResourceDemandConfigureCommand extends
		ConfigureElementCommand {

	private ConfigureRequest request = null;
	
	public ParametricResourceDemandConfigureCommand(ConfigureRequest request){
		super(request);
		this.request = request;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {

		CommandResult commandResult = setRequiredResource_ParametricResourceDemand(
				monitor, info);
		if (!isOK(commandResult)) {
			return CommandResult
					.newErrorCommandResult("Set RequiredResource for the ParametricResourceDemand failed!");
		}
		commandResult = setSpecifikation_ParametricResourceDemand(monitor, info);
//		if (!isOK(commandResult)) {
//			return CommandResult
//					.newErrorCommandResult("Set Action for the ParametricResourceDemand failed!");
//		}
		return CommandResult.newOKCommandResult();
	}

	private CommandResult setRequiredResource_ParametricResourceDemand(
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {

		EObject resource = null;
		ArrayList<Object> filterList = new ArrayList<Object>();
		filterList.add(ResourceRepository.class);
		filterList.add(ProcessingResourceType.class);

		ArrayList<Object> additionalReferences = new ArrayList<Object>();
		PalladioSelectEObjectDialog dialog = new PalladioSelectEObjectDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				filterList, additionalReferences, request.getEditingDomain()
						.getResourceSet());
		dialog.setProvidedService(ProcessingResourceType.class);
		dialog.open();
		if (dialog.getResult() == null)
			return CommandResult.newCancelledCommandResult();
		if (!(dialog.getResult() instanceof ProcessingResourceType))
			return CommandResult.newCancelledCommandResult();
		resource = (ProcessingResourceType) dialog.getResult();
		
		ICommand cmd = new SetValueCommand(
				new SetRequest(
						request.getElementToConfigure(),
						SeffPackage.eINSTANCE
								.getParametricResourceDemand_RequiredResource_ParametricResourceDemand(),
						resource));
		cmd.execute(monitor, info);

		return cmd.getCommandResult();
	}

	private CommandResult setSpecifikation_ParametricResourceDemand(
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {

		StochasticExpressionEditDialog dialog = new StochasticExpressionEditDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				TypeEnum.DOUBLE, getContext(request.getElementToConfigure()));
		dialog.open();

		if (dialog.getResult() == null)
			return CommandResult.newCancelledCommandResult();

		ICommand cmd = new SetValueCommand(new SetRequest(request
				.getElementToConfigure(), StoexPackage.eINSTANCE
				.getRandomVariable_Specification(),
				new PCMStoExPrettyPrintVisitor()
						.prettyPrint(dialog.getResult())));
		cmd.execute(monitor, info);

		return cmd.getCommandResult();
	}
	
	private Parameter[] getContext(EObject rv) {
		Parameter[] parameters = new Parameter[]{};

		ResourceDemandingSEFF seff = getSEFF(
				rv);

		if (seff != null && seff.getDescribedService__SEFF() != null && seff.getDescribedService__SEFF().getParameters__Signature() != null)
			parameters = (Parameter[]) seff.getDescribedService__SEFF().getParameters__Signature().toArray();

		return parameters;
	}

	private ResourceDemandingSEFF getSEFF(EObject a) {
		EObject container = a;
		while (!(container instanceof ResourceDemandingSEFF))
			container = container.eContainer();
		if (!(container instanceof ResourceDemandingSEFF)) 
			return null;
		ResourceDemandingSEFF seff = (ResourceDemandingSEFF) container;
		return seff;
	}
}
