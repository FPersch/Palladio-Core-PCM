/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.provider;

import de.uka.ipd.sdq.stoex.util.StoexAdapterFactory;

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
public class StoexItemProviderAdapterFactory extends StoexAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, SDQ, IPD, U Karlsruhe (TH)";

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
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoexItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);		
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.VariableReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableReferenceItemProvider variableReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.VariableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVariableReferenceAdapter() {
		if (variableReferenceItemProvider == null) {
			variableReferenceItemProvider = new VariableReferenceItemProvider(this);
		}

		return variableReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.NamespaceReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceReferenceItemProvider namespaceReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.NamespaceReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createNamespaceReferenceAdapter() {
		if (namespaceReferenceItemProvider == null) {
			namespaceReferenceItemProvider = new NamespaceReferenceItemProvider(this);
		}

		return namespaceReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.TermExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermExpressionItemProvider termExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.TermExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTermExpressionAdapter() {
		if (termExpressionItemProvider == null) {
			termExpressionItemProvider = new TermExpressionItemProvider(this);
		}

		return termExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.RandomVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomVariableItemProvider randomVariableItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.RandomVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRandomVariableAdapter() {
		if (randomVariableItemProvider == null) {
			randomVariableItemProvider = new RandomVariableItemProvider(this);
		}

		return randomVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.ProductExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductExpressionItemProvider productExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.ProductExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createProductExpressionAdapter() {
		if (productExpressionItemProvider == null) {
			productExpressionItemProvider = new ProductExpressionItemProvider(this);
		}

		return productExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilityFunctionLiteralItemProvider probabilityFunctionLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createProbabilityFunctionLiteralAdapter() {
		if (probabilityFunctionLiteralItemProvider == null) {
			probabilityFunctionLiteralItemProvider = new ProbabilityFunctionLiteralItemProvider(this);
		}

		return probabilityFunctionLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.Parantesis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParantesisItemProvider parantesisItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.Parantesis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createParantesisAdapter() {
		if (parantesisItemProvider == null) {
			parantesisItemProvider = new ParantesisItemProvider(this);
		}

		return parantesisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.IntLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntLiteralItemProvider intLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.IntLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIntLiteralAdapter() {
		if (intLiteralItemProvider == null) {
			intLiteralItemProvider = new IntLiteralItemProvider(this);
		}

		return intLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.DoubleLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleLiteralItemProvider doubleLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.DoubleLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDoubleLiteralAdapter() {
		if (doubleLiteralItemProvider == null) {
			doubleLiteralItemProvider = new DoubleLiteralItemProvider(this);
		}

		return doubleLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.stoex.CompareExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareExpressionItemProvider compareExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.stoex.CompareExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCompareExpressionAdapter() {
		if (compareExpressionItemProvider == null) {
			compareExpressionItemProvider = new CompareExpressionItemProvider(this);
		}

		return compareExpressionItemProvider;
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
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
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
		if (variableReferenceItemProvider != null) variableReferenceItemProvider.dispose();
		if (namespaceReferenceItemProvider != null) namespaceReferenceItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (termExpressionItemProvider != null) termExpressionItemProvider.dispose();
		if (randomVariableItemProvider != null) randomVariableItemProvider.dispose();
		if (productExpressionItemProvider != null) productExpressionItemProvider.dispose();
		if (probabilityFunctionLiteralItemProvider != null) probabilityFunctionLiteralItemProvider.dispose();
		if (parantesisItemProvider != null) parantesisItemProvider.dispose();
		if (intLiteralItemProvider != null) intLiteralItemProvider.dispose();
		if (doubleLiteralItemProvider != null) doubleLiteralItemProvider.dispose();
		if (compareExpressionItemProvider != null) compareExpressionItemProvider.dispose();
	}

}
