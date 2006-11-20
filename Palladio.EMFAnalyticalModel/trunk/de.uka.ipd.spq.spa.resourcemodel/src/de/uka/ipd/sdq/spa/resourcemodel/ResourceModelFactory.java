/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.spa.resourcemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.spa.resourcemodel.ResourceModelPackage
 * @generated
 */
public interface ResourceModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceModelFactory eINSTANCE = de.uka.ipd.sdq.spa.resourcemodel.impl.ResourceModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Processing Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Resource Usage</em>'.
	 * @generated
	 */
	ProcessingResourceUsage createProcessingResourceUsage();

	/**
	 * Returns a new object of class '<em>Processing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Resource</em>'.
	 * @generated
	 */
	ProcessingResource createProcessingResource();

	/**
	 * Returns a new object of class '<em>Delay Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Resource Usage</em>'.
	 * @generated
	 */
	DelayResourceUsage createDelayResourceUsage();

	/**
	 * Returns a new object of class '<em>Delay Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Resource</em>'.
	 * @generated
	 */
	DelayResource createDelayResource();

	/**
	 * Returns a new object of class '<em>Passive Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Resource</em>'.
	 * @generated
	 */
	PassiveResource createPassiveResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourceModelPackage getResourceModelPackage();

} //ResourceModelFactory
