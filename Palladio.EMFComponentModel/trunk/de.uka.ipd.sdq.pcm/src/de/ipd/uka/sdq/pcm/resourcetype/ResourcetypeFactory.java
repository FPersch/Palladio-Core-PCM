/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.ipd.uka.sdq.pcm.resourcetype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.ipd.uka.sdq.pcm.resourcetype.ResourcetypePackage
 * @generated
 */
public interface ResourcetypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcetypeFactory eINSTANCE = de.ipd.uka.sdq.pcm.resourcetype.impl.ResourcetypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Repository</em>'.
	 * @generated
	 */
	ResourceRepository createResourceRepository();

	/**
	 * Returns a new object of class '<em>Passive Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Resource Type</em>'.
	 * @generated
	 */
	PassiveResourceType createPassiveResourceType();

	/**
	 * Returns a new object of class '<em>Communication Link Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Link Resource Type</em>'.
	 * @generated
	 */
	CommunicationLinkResourceType createCommunicationLinkResourceType();

	/**
	 * Returns a new object of class '<em>Processing Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Resource Type</em>'.
	 * @generated
	 */
	ProcessingResourceType createProcessingResourceType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcetypePackage getResourcetypePackage();

} //ResourcetypeFactory
