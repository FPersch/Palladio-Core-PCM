package de.uka.ipd.sdq.pcm.gmf.allocation.helper;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.dialogs.selection.PalladioSelectEObjectDialog;
import de.uka.ipd.sdq.pcm.allocation.AllocationPackage;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;

public class AllocationContextEditHelperAdvice
	extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		EObject resource = null;

		ArrayList<Object> filterList = new ArrayList<Object>();
		filterList.add(de.uka.ipd.sdq.pcm.system.System.class);
		filterList.add(AssemblyContext.class);

		ArrayList<Object> additionalReferences = new ArrayList<Object>();
		PalladioSelectEObjectDialog dialog = new PalladioSelectEObjectDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				filterList, 
				additionalReferences,
				request.getElementToConfigure().eResource().getResourceSet());
		dialog.setProvidedService(AssemblyContext.class);
		dialog.open();
		if (dialog.getResult() == null)
			return new CanceledCommand();
		if (!(dialog.getResult() instanceof AssemblyContext))
			return new CanceledCommand();
		resource = (AssemblyContext) dialog.getResult();
		
		ICommand cmd = new SetValueCommand(
				new SetRequest(
						request.getElementToConfigure(), 
						AllocationPackage.eINSTANCE.getAllocationContext_AssemblyContext_AllocationContext(),
						resource));
		return cmd;
	}
}
