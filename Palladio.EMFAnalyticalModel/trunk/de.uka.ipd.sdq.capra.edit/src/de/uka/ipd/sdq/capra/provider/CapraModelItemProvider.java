/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.capra.provider;


import de.uka.ipd.sdq.capra.CapraFactory;
import de.uka.ipd.sdq.capra.CapraModel;
import de.uka.ipd.sdq.capra.CapraPackage;

import de.uka.ipd.sdq.capra.core.CoreFactory;

import de.uka.ipd.sdq.capra.extension.ExtensionFactory;

import de.uka.ipd.sdq.capra.measurement.MeasurementFactory;

import de.uka.ipd.sdq.capra.resources.ResourcesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.capra.CapraModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapraModelItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapraModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CapraPackage.Literals.CAPRA_MODEL__PROCESSES);
			childrenFeatures.add(CapraPackage.Literals.CAPRA_MODEL__RESOURCES);
			childrenFeatures.add(CapraPackage.Literals.CAPRA_MODEL__IDENTIFIERS);
			childrenFeatures.add(CapraPackage.Literals.CAPRA_MODEL__SENSORS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CapraModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CapraModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CapraModel_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CapraModel.class)) {
			case CapraPackage.CAPRA_MODEL__PROCESSES:
			case CapraPackage.CAPRA_MODEL__RESOURCES:
			case CapraPackage.CAPRA_MODEL__IDENTIFIERS:
			case CapraPackage.CAPRA_MODEL__SENSORS:
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
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__PROCESSES,
				 CapraFactory.eINSTANCE.createReplicatedProcess()));

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__RESOURCES,
				 ResourcesFactory.eINSTANCE.createProcessingResource()));

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__RESOURCES,
				 ResourcesFactory.eINSTANCE.createDelayResource()));

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__RESOURCES,
				 ExtensionFactory.eINSTANCE.createWeakSemaphore()));

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__RESOURCES,
				 ExtensionFactory.eINSTANCE.createStrongSemaphore()));

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__IDENTIFIERS,
				 CoreFactory.eINSTANCE.createCommunicationIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__IDENTIFIERS,
				 CoreFactory.eINSTANCE.createDemandIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__IDENTIFIERS,
				 CoreFactory.eINSTANCE.createSilentIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__SENSORS,
				 MeasurementFactory.eINSTANCE.createTimeSpanSensor()));

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__SENSORS,
				 MeasurementFactory.eINSTANCE.createStateSensor()));

		newChildDescriptors.add
			(createChildParameter
				(CapraPackage.Literals.CAPRA_MODEL__SENSORS,
				 MeasurementFactory.eINSTANCE.createCountingSensor()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CapraEditPlugin.INSTANCE;
	}

}
