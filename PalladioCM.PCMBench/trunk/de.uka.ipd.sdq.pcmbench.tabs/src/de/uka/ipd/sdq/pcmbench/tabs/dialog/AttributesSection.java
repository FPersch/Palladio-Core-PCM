package de.uka.ipd.sdq.pcmbench.tabs.dialog;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import de.uka.ipd.sdq.pcm.repository.Signature;
import de.uka.ipd.sdq.pcm.repository.provider.RepositoryItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcmbench.tabs.table.OperationsTabViewer;

/**
 * @author admin
 *
 */
public class AttributesSection extends DialogCellEditor {

	private String property;
	
	private OperationsTabViewer operationsTabViewer;
	private ComposedAdapterFactory adapterFactory;
	private TableViewer tableViewer;


	/**
	 * @param parent
	 */
	public AttributesSection(Composite parent, String property, OperationsTabViewer oTabViewer) {
		super(parent);
		this.property = property;
		this.operationsTabViewer = oTabViewer;
		
	}	
		
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.DialogCellEditor#openDialogBox(org.eclipse.swt.widgets.Control)
	 */
	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		
		Signature parentSignature = operationsTabViewer.getSelectedSignature();
		
		AttributesViewer dialog = new AttributesViewer(
				cellEditorWindow.getShell(), property, parentSignature);
		dialog.create();
		
		tableViewer = dialog.getTableViewer();
		
		adapterFactory = new ComposedAdapterFactory();
		adapterFactory
			.addAdapterFactory(new RepositoryItemProviderAdapterFactory());
		
		tableViewer.setContentProvider(new AdapterFactoryContentProvider(
				adapterFactory));
		tableViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				new AttributesItemProviderAdapterFactory(adapterFactory)));
		tableViewer.setInput(parentSignature);
		
		return dialog.open();
	}

}
