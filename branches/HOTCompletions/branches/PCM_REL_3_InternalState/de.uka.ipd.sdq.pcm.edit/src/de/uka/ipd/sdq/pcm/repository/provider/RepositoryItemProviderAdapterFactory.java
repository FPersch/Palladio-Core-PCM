/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.repository.provider;

import de.uka.ipd.sdq.pcm.repository.util.RepositoryAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryItemProviderAdapterFactory extends RepositoryAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.PassiveResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassiveResourceItemProvider passiveResourceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.PassiveResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPassiveResourceAdapter() {
		if (passiveResourceItemProvider == null) {
			passiveResourceItemProvider = new PassiveResourceItemProvider(this);
		}

		return passiveResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.Signature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureItemProvider signatureItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignatureAdapter() {
		if (signatureItemProvider == null) {
			signatureItemProvider = new SignatureItemProvider(this);
		}

		return signatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.Repository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryItemProvider repositoryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryAdapter() {
		if (repositoryItemProvider == null) {
			repositoryItemProvider = new RepositoryItemProvider(this);
		}

		return repositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.ProvidesComponentType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidesComponentTypeItemProvider providesComponentTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.ProvidesComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidesComponentTypeAdapter() {
		if (providesComponentTypeItemProvider == null) {
			providesComponentTypeItemProvider = new ProvidesComponentTypeItemProvider(this);
		}

		return providesComponentTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.RequiredRole} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredRoleItemProvider requiredRoleItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.RequiredRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequiredRoleAdapter() {
		if (requiredRoleItemProvider == null) {
			requiredRoleItemProvider = new RequiredRoleItemProvider(this);
		}

		return requiredRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.Interface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceItemProvider interfaceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new InterfaceItemProvider(this);
		}

		return interfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.ExceptionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionTypeItemProvider exceptionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.ExceptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExceptionTypeAdapter() {
		if (exceptionTypeItemProvider == null) {
			exceptionTypeItemProvider = new ExceptionTypeItemProvider(this);
		}

		return exceptionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.CompleteComponentType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteComponentTypeItemProvider completeComponentTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.CompleteComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompleteComponentTypeAdapter() {
		if (completeComponentTypeItemProvider == null) {
			completeComponentTypeItemProvider = new CompleteComponentTypeItemProvider(this);
		}

		return completeComponentTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.CompositeComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentItemProvider compositeComponentItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.CompositeComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeComponentAdapter() {
		if (compositeComponentItemProvider == null) {
			compositeComponentItemProvider = new CompositeComponentItemProvider(this);
		}

		return compositeComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.BasicComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicComponentItemProvider basicComponentItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.BasicComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBasicComponentAdapter() {
		if (basicComponentItemProvider == null) {
			basicComponentItemProvider = new BasicComponentItemProvider(this);
		}

		return basicComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.PrimitiveDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveDataTypeItemProvider primitiveDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.PrimitiveDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveDataTypeAdapter() {
		if (primitiveDataTypeItemProvider == null) {
			primitiveDataTypeItemProvider = new PrimitiveDataTypeItemProvider(this);
		}

		return primitiveDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.CollectionDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionDataTypeItemProvider collectionDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.CollectionDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCollectionDataTypeAdapter() {
		if (collectionDataTypeItemProvider == null) {
			collectionDataTypeItemProvider = new CollectionDataTypeItemProvider(this);
		}

		return collectionDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.CompositeDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeDataTypeItemProvider compositeDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.CompositeDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeDataTypeAdapter() {
		if (compositeDataTypeItemProvider == null) {
			compositeDataTypeItemProvider = new CompositeDataTypeItemProvider(this);
		}

		return compositeDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.InnerDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerDeclarationItemProvider innerDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.InnerDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInnerDeclarationAdapter() {
		if (innerDeclarationItemProvider == null) {
			innerDeclarationItemProvider = new InnerDeclarationItemProvider(this);
		}

		return innerDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.ProvidedRole} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedRoleItemProvider providedRoleItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.ProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidedRoleAdapter() {
		if (providedRoleItemProvider == null) {
			providedRoleItemProvider = new ProvidedRoleItemProvider(this);
		}

		return providedRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.repository.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.repository.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (passiveResourceItemProvider != null) passiveResourceItemProvider.dispose();
		if (signatureItemProvider != null) signatureItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (repositoryItemProvider != null) repositoryItemProvider.dispose();
		if (providesComponentTypeItemProvider != null) providesComponentTypeItemProvider.dispose();
		if (requiredRoleItemProvider != null) requiredRoleItemProvider.dispose();
		if (interfaceItemProvider != null) interfaceItemProvider.dispose();
		if (exceptionTypeItemProvider != null) exceptionTypeItemProvider.dispose();
		if (completeComponentTypeItemProvider != null) completeComponentTypeItemProvider.dispose();
		if (compositeComponentItemProvider != null) compositeComponentItemProvider.dispose();
		if (basicComponentItemProvider != null) basicComponentItemProvider.dispose();
		if (primitiveDataTypeItemProvider != null) primitiveDataTypeItemProvider.dispose();
		if (collectionDataTypeItemProvider != null) collectionDataTypeItemProvider.dispose();
		if (compositeDataTypeItemProvider != null) compositeDataTypeItemProvider.dispose();
		if (innerDeclarationItemProvider != null) innerDeclarationItemProvider.dispose();
		if (providedRoleItemProvider != null) providedRoleItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
	}

}
