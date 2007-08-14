package de.uka.ipd.sdq.pcm.dialogs.datatype;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.DecoratorAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemProviderDecorator;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;


/**
 * @author admin
 */
public class InnerDeclarationItemProviderAdapterFactory extends
		DecoratorAdapterFactory {

	public InnerDeclarationItemProviderAdapterFactory(AdapterFactory decoratedAdapterFactory) {
		super(decoratedAdapterFactory);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.DecoratorAdapterFactory#createItemProviderDecorator(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected IItemProviderDecorator createItemProviderDecorator(Object target,
			Object type) {
		IItemProviderDecorator decorator = new InnerDeclarationItemProvider(this);
		if (type == ITableItemLabelProvider.class) {
			decorator
					.setDecoratedItemProvider((IChangeNotifier) decoratedAdapterFactory
							.adapt(target, IItemLabelProvider.class));
		} else {
			decorator
					.setDecoratedItemProvider((IChangeNotifier) decoratedAdapterFactory
							.adapt(target, type));
		}
		return decorator;
	}
	
	@Override
	public Object adapt(Object target, Object type) {
		if (type == ITableItemLabelProvider.class)
			return createItemProviderDecorator(target, type);
		return super.adapt(target, type);
	}

}
