package de.uka.ipd.sdq.pcmbench.tabs.parameters;

import java.util.Observable;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import de.uka.ipd.sdq.pcm.dialogs.stoex.StochasticExpressionEditDialog;
import de.uka.ipd.sdq.pcm.parameter.VariableCharacterisation;
import de.uka.ipd.sdq.pcm.stochasticexpressions.PCMStoExPrettyPrintVisitor;
import de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection;
import de.uka.ipd.sdq.pcmbench.tabs.generic.ObservableCellModifier;
import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

/**
 * @author Roman Andrej
 */
public class ComponentParametersEditorSection extends EditorSection {
	
	public static final int ICON_COLUMN_INDEX = 0;
	public static final int VARIABLE_COLUMN_INDEX = 1;
	public static final int STOEX_COLUMN_INDEX = 2;
	
	/**
	 * Columns of a table, which is used into operations table
	 */
	public final static String PARAMETERS_ICON_COLUMN	= "";
	public final static String VARIABLE_COLUMN 			= "Variable Name";
	public final static String STOEX_COLUMN 			= "Specification";
	
	/** Set column names of Tabele. */
	public static String[] columnNames = new String[] { PARAMETERS_ICON_COLUMN,
			VARIABLE_COLUMN, STOEX_COLUMN };
	
	/** Define the CellModifier. */
	private ComponentParametersCellModifier parametersCellModifier;
	
	public ComponentParametersEditorSection(Composite composite) {
		super(composite);
	}
	
	/* (non-Javadoc)
	 * TODO! remove....
	 * @see de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection#createAddButtonActionListener(java.lang.Object)
	 */
	@Override
	protected SelectionListener createAddButtonActionListener() {
		return new AddComponentParameterAction();
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection#createDeleteButtonListener()
	 */
	@Override
	protected SelectionListener createDeleteButtonListener() {
		DeleteComponentParameterAction deleteButtonListener = new DeleteComponentParameterAction();
		deleteButtonListener.addObserver(this);
		return deleteButtonListener;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection#createTableColumns(org.eclipse.swt.widgets.Table)
	 */
	@Override
	protected void createTableColumns(Table table) {
		final TableColumn iconColumn = new TableColumn(table, SWT.NONE);
		iconColumn.setWidth(25);
		iconColumn.setText(PARAMETERS_ICON_COLUMN);

		final TableColumn variableColumn = new TableColumn(table, SWT.NONE);
		variableColumn.setWidth(240);
		variableColumn.setText(VARIABLE_COLUMN);

		final TableColumn stoexColumn = new TableColumn(table, SWT.CENTER);
		stoexColumn.setWidth(100);
		stoexColumn.setText(STOEX_COLUMN);
	}
	
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection#createViewerCellEditors(org.eclipse.swt.widgets.Table)
	 */
	@Override
	protected CellEditor[] createViewerCellEditors(Table table) {
		// create CellEditors
		CellEditor[] editors = new CellEditor[columnNames.length];

		editors[VARIABLE_COLUMN_INDEX] = new TextCellEditor(table);
		
		editors[STOEX_COLUMN_INDEX] = new DialogCellEditor(table) {

			/* (non-Javadoc)
			 * @see org.eclipse.jface.viewers.DialogCellEditor#openDialogBox(org.eclipse.swt.widgets.Control)
			 */
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				Assert.isNotNull(getSelectedVariableUsage());
				EList<VariableCharacterisation> characterisations = getSelectedVariableUsage()
						.getVariableUsage()
						.getVariableCharacterisation_VariableUsage();
				RandomVariable randVar = (RandomVariable) characterisations
						.get(0).getSpecification_VariableCharacterisation();
				StochasticExpressionEditDialog dialog = new StochasticExpressionEditDialog(
						cellEditorWindow.getShell(), getExpectedType(randVar),
						randVar);
				dialog.setInitialExpression(randVar);
				dialog.open();
				if (dialog.getReturnCode() == Dialog.OK) {
					return new PCMStoExPrettyPrintVisitor().prettyPrint(dialog
							.getResult());
				}

				return null;
			}
		};
		return editors;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection#getTableColumnNames()
	 */
	@Override
	protected String[] getTableColumnNames() {
		return columnNames;
	}

	/**
	 * @return the selectedVariableUsage
	 */
	public VariableUsageWrapper getSelectedVariableUsage() {
		return (VariableUsageWrapper) getSelectedObject();
	}
	
	protected TypeEnum getExpectedType(RandomVariable rv) {
		TypeEnum expectedType = TypeEnum.ANY; 
		if (rv instanceof VariableCharacterisation){
			expectedType = StochasticExpressionEditDialog.getTypeFromVariableCharacterisation((VariableCharacterisation) rv);
		}
		return expectedType;
	}
	
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection#createViewerCellModifier()
	 */
	@Override
	protected ObservableCellModifier createViewerCellModifier() {
		parametersCellModifier = new ComponentParametersCellModifier();
		return parametersCellModifier;
	}
	
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection#canAddButonCreated()
	 */
	@Override
	protected boolean canAddButonCreated() {
		return false;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection#canDeleteButonCreated()
	 */
	@Override
	protected boolean canDeleteButonCreated() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection#inputValidation(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected boolean inputValidation(EObject object) {
		if (object instanceof VariableUsageWrapper) {
			VariableUsageWrapper wrapper = (VariableUsageWrapper) object;
			return wrapper.isEdited();
		}
		
		return false;
	}
	
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.pcmbench.tabs.generic.EditorSection#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		super.update(o, arg);

		if (arg instanceof VariableUsageWrapper && viewer != null) {
			VariableUsageWrapper wrapper = (VariableUsageWrapper) arg;

			if (!wrapper.isEdited()) {
				// set gray color for removed table item
				TableItem[] items = viewer.getTable().getItems();

				for (int i = 0; i < items.length; i++) {
					TableItem item = items[i];

					VariableUsageWrapper data = (VariableUsageWrapper) item
							.getData();

					if (wrapper.equals(data)) {
						item.setForeground(item.getDisplay().getSystemColor(
								SWT.COLOR_GRAY));
					}

				}
			}

			// set viewer selection if for Enable/Disable of Delete-Button
			// relevant
			viewer.setSelection(new StructuredSelection(
					new Object[] { wrapper }));

		}
	}

	/**
	 * @return the addButtonListener
	 */
	public ComponentParametersCellModifier getCellModifier() {
		return parametersCellModifier;
	}
}
