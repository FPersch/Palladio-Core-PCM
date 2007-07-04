package de.uka.ipd.sdq.pcmbench.propertytabs;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

import de.uka.ipd.sdq.dialogs.stoex.StochasticExpressionEditDialog;
import de.uka.ipd.sdq.pcm.parameter.VariableCharacterisation;
import de.uka.ipd.sdq.pcm.repository.Parameter;
import de.uka.ipd.sdq.pcm.seff.AbstractResourceDemandingAction;
import de.uka.ipd.sdq.pcm.seff.ParametricResourceDemand;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.pcm.stochasticexpressions.PCMStoExPrettyPrintVisitor;
import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

public class PalladioAdapterFactoryContentProvider extends
		AdapterFactoryContentProvider {

	public PalladioAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource) {
	    if (object instanceof RandomVariable)
	    {
	    	return getRandomVariablePropertySheet(object, itemPropertySource);
	    }
	    else
	    	return super.createPropertySource(object, itemPropertySource);
	}

	private IPropertySource getRandomVariablePropertySheet(Object object,IItemPropertySource itemPropertySource) {
		return new PropertySource(object, itemPropertySource) {

			@Override
			protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
				if (itemPropertyDescriptor.getDisplayName(object).equals("Specification")) {
					return getDescriptorWithStoExParser(object,itemPropertyDescriptor);
				} else {
					return super.createPropertyDescriptor(itemPropertyDescriptor);
				}
			}
			
		};
	}

	private IPropertyDescriptor getDescriptorWithStoExParser(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
		return new PropertyDescriptor(object,itemPropertyDescriptor) {

			@Override
			public CellEditor createPropertyEditor(Composite composite) {
				
				CellEditor result = new ExtendedDialogCellEditor(composite, new AdapterFactoryLabelProvider(adapterFactory)) {

					@Override
					protected Object openDialogBox(Control cellEditorWindow) {
						RandomVariable randVar = (RandomVariable) object;
						StochasticExpressionEditDialog dialog = null;
						ResourceDemandingSEFF seff = findSEFF(randVar);
						if (seff != null) {
							Parameter[] parameters = new Parameter[]{};
							if (seff.getDescribedService__SEFF() != null && seff.getDescribedService__SEFF().getParameters__Signature() != null)
								parameters = (Parameter[]) seff.getDescribedService__SEFF().getParameters__Signature().toArray();
							dialog = new StochasticExpressionEditDialog(cellEditorWindow.getShell(),getExpectedType(randVar),parameters);
						} else {
							dialog = new StochasticExpressionEditDialog(cellEditorWindow.getShell(),getExpectedType(randVar));
						}
						dialog.setInitialExpression(randVar);
						dialog.open();
						if (dialog.getResult() != null) {
							String result = new PCMStoExPrettyPrintVisitor().prettyPrint(dialog.getResult());
							return result;
						}
						return null;
					}

					private ResourceDemandingSEFF findSEFF(
							RandomVariable randVar) {
						EObject container = randVar;
						while (!(container instanceof ResourceDemandingSEFF) && container != null)
							container = container.eContainer();
						ResourceDemandingSEFF seff = (ResourceDemandingSEFF) container;
						return seff;
					}

				};
				return result;
			}
		};
	}

	protected TypeEnum getExpectedType(RandomVariable rv) {
		TypeEnum expectedType = TypeEnum.ANY; 
		if (rv instanceof VariableCharacterisation){
			expectedType = StochasticExpressionEditDialog.getTypeFromVariableCharacterisation((VariableCharacterisation) rv);
		}
		return expectedType;
	}	
}
