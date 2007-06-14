/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 *
 * $Id$
 */
package de.uka.ipd.sdq.context.usage.provider;


import de.uka.ipd.sdq.context.usage.LoopIteration;
import de.uka.ipd.sdq.context.usage.UsagePackage;

import de.uka.ipd.sdq.pcm.parameter.ParameterFactory;

import de.uka.ipd.sdq.pcm.qosannotations.QosannotationsFactory;

import de.uka.ipd.sdq.pcm.seff.SeffFactory;

import de.uka.ipd.sdq.pcm.usagemodel.UsagemodelFactory;

import de.uka.ipd.sdq.stoex.StoexFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.context.usage.LoopIteration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopIterationItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopIterationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLoopaction_LoopIterationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Loopaction Loop Iteration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopaction_LoopIterationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoopIteration_loopaction_LoopIteration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoopIteration_loopaction_LoopIteration_feature", "_UI_LoopIteration_type"),
				 UsagePackage.Literals.LOOP_ITERATION__LOOPACTION_LOOP_ITERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LoopIteration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LoopIteration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_LoopIteration_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LoopIteration.class)) {
			case UsagePackage.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION,
				 ParameterFactory.eINSTANCE.createVariableCharacterisation()));

		newChildDescriptors.add
			(createChildParameter
				(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION,
				 SeffFactory.eINSTANCE.createParametricResourceDemand()));

		newChildDescriptors.add
			(createChildParameter
				(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION,
				 SeffFactory.eINSTANCE.createIterationCount()));

		newChildDescriptors.add
			(createChildParameter
				(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION,
				 SeffFactory.eINSTANCE.createBranchCondition()));

		newChildDescriptors.add
			(createChildParameter
				(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION,
				 QosannotationsFactory.eINSTANCE.createSystemSpecifiedExecutionTime()));

		newChildDescriptors.add
			(createChildParameter
				(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION,
				 QosannotationsFactory.eINSTANCE.createComponentSpecifiedExecutionTime()));

		newChildDescriptors.add
			(createChildParameter
				(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION,
				 UsagemodelFactory.eINSTANCE.createInterArrivalTime()));

		newChildDescriptors.add
			(createChildParameter
				(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION,
				 UsagemodelFactory.eINSTANCE.createLoopIterations()));

		newChildDescriptors.add
			(createChildParameter
				(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION,
				 UsagemodelFactory.eINSTANCE.createThinkTime()));

		newChildDescriptors.add
			(createChildParameter
				(UsagePackage.Literals.LOOP_ITERATION__ITERATIONS_LOOP_ITERATION,
				 StoexFactory.eINSTANCE.createRandomVariable()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return ContextEditPlugin.INSTANCE;
	}

}
