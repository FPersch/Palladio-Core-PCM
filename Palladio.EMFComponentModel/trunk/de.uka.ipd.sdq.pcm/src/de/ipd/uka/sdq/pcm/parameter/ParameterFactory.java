/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.ipd.uka.sdq.pcm.parameter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.ipd.uka.sdq.pcm.parameter.ParameterPackage
 * @generated
 */
public interface ParameterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterFactory eINSTANCE = de.ipd.uka.sdq.pcm.parameter.impl.ParameterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Primitive Parameter Characterisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Parameter Characterisation</em>'.
	 * @generated
	 */
	PrimitiveParameterCharacterisation createPrimitiveParameterCharacterisation();

	/**
	 * Returns a new object of class '<em>Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage</em>'.
	 * @generated
	 */
	ParameterUsage createParameterUsage();

	/**
	 * Returns a new object of class '<em>Composite Parameter Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Parameter Usage</em>'.
	 * @generated
	 */
	CompositeParameterUsage createCompositeParameterUsage();

	/**
	 * Returns a new object of class '<em>Collection Parameter Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Parameter Usage</em>'.
	 * @generated
	 */
	CollectionParameterUsage createCollectionParameterUsage();

	/**
	 * Returns a new object of class '<em>Collection Parameter Characterisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Parameter Characterisation</em>'.
	 * @generated
	 */
	CollectionParameterCharacterisation createCollectionParameterCharacterisation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParameterPackage getParameterPackage();

} //ParameterFactory
