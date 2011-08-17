/**
 * 
 */
package de.uka.ipd.sdq.pcm.gmf.seff.helper;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.pcm.dialogs.selection.PalladioSelectEObjectDialog;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.EventGroup;
import de.uka.ipd.sdq.pcm.repository.EventType;
import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;
import de.uka.ipd.sdq.pcm.repository.SourceRole;

/**
 * Edit helper for the EmitEventAction.
 * Features are:
 * - Open EventType selection dialog when EmitEventAction is created
 * 
 * @author Benjamin Klatt
 * 
 */
public class EmitEventActionEditHelperAdvice extends
		AbstractEditHelperAdvice implements IEditHelperAdvice {

	/**
	 * When an EmitEventAction is created:
	 * - Open the dialog to select an EventType this action is able to emit
	 * - Get the selected EventType and store it in the action
	 * 
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest)
	 */
	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		EObject eObject = searchBasicComponent(request.getElementToConfigure());
		SourceRole sourceRole = null;
		
		// define the filter list
		ArrayList<Object> filterList = new ArrayList<Object>();
		filterList.add(SourceRole.class);
		filterList.add(EventGroup.class);
		filterList.add(EventType.class);
		
		// define the additional references
		ArrayList<EReference> additionalReferences = new ArrayList<EReference>();
		additionalReferences.add(RepositoryPackage.eINSTANCE
				.getSourceRole_EventGroup__SourceRole());
		
		// create the dialog
		PalladioSelectEObjectDialog dialog = new PalladioSelectEObjectDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				filterList, additionalReferences, eObject);
		dialog.setProvidedService(EventType.class);
		dialog.open();
		if (dialog.getResult() == null)
			return new CanceledCommand();
		if (!(dialog.getResult() instanceof EventType))
			return new CanceledCommand();
		
		// set the EventType for EmitEventAction 
		EventType eventType = (EventType) dialog.getResult();
		
		// set the required role for EmitEventAction 
		if (dialog.getViewerRootElement() instanceof SourceRole) {
			sourceRole = (SourceRole) dialog.getRootOfResult();
		}

		// create and execute the EmitEventActionConfigureCommand command
		return new EmitEventActionConfigureCommand(request, eventType,
				sourceRole);
	}

	private EObject searchBasicComponent(EObject elementToConfigure) {
		EObject o = elementToConfigure;
		while (!(o instanceof BasicComponent))
			o = o.eContainer();
		return o;
	}
}