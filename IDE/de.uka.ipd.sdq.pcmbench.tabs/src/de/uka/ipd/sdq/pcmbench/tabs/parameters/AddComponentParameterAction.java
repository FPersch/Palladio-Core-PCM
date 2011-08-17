/**
 * 
 */
package de.uka.ipd.sdq.pcmbench.tabs.parameters;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import de.uka.ipd.sdq.pcm.core.CoreFactory;
import de.uka.ipd.sdq.pcm.core.PCMRandomVariable;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.parameter.ParameterFactory;
import de.uka.ipd.sdq.pcm.parameter.VariableCharacterisation;
import de.uka.ipd.sdq.pcm.parameter.VariableUsage;
import de.uka.ipd.sdq.stoex.NamespaceReference;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.VariableReference;

/**
 * @author Roman Andrej
 *
 */
public class AddComponentParameterAction extends SelectionAdapter {

	private AssemblyContext context;
	
	/**
	 * The transactional editing domain which is used to get the commands and
	 * alter the model
	 */
	private TransactionalEditingDomain editingDomain = null;
	

	/* (non-Javadoc)
	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	@Override
	public void widgetSelected(SelectionEvent e) {
		editingDomain = TransactionUtil.getEditingDomain(context);

		RecordingCommand recCommand = new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				NamespaceReference namespaceReference = StoexFactory.eINSTANCE
						.createNamespaceReference();
				namespaceReference.setReferenceName("ReferenceName");

				VariableReference variableReference = StoexFactory.eINSTANCE
						.createVariableReference();
				variableReference.setReferenceName("INNER");

				namespaceReference
						.setInnerReference_NamespaceReference(variableReference);
				VariableUsage variableUsage = ParameterFactory.eINSTANCE
						.createVariableUsage();
				variableUsage
						.setNamedReference__VariableUsage(namespaceReference);

				PCMRandomVariable randomVariable = CoreFactory.eINSTANCE
						.createPCMRandomVariable();
				randomVariable.setSpecification("0");

				VariableCharacterisation characterisation = ParameterFactory.eINSTANCE
						.createVariableCharacterisation();

				characterisation
						.setSpecification_VariableCharacterisation(randomVariable);
				variableUsage.getVariableCharacterisation_VariableUsage().add(
						characterisation);

				context.getConfigParameterUsages_AssemblyContext().add(
						variableUsage);
			}
		};

		recCommand.setDescription("Add new VariableUsage");
		editingDomain.getCommandStack().execute(recCommand);
	}


	/**
	 * @param context the context to set
	 */
	public void setContext(AssemblyContext context) {
		this.context = context;
	}
}
