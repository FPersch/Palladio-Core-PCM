/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.repository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a data type that can be stored in a repository and used for specification and modeling of interface signatures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.DataType#getRepository_DataType <em>Repository Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getDataType()
 * @model abstract="true"
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Repository Data Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uka.ipd.sdq.pcm.repository.Repository#getDatatypes_Repository <em>Datatypes Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Data Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the repository to which this data type belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository Data Type</em>' container reference.
	 * @see #setRepository_DataType(Repository)
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getDataType_Repository_DataType()
	 * @see de.uka.ipd.sdq.pcm.repository.Repository#getDatatypes_Repository
	 * @model opposite="datatypes_Repository" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Repository getRepository_DataType();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.repository.DataType#getRepository_DataType <em>Repository Data Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Data Type</em>' container reference.
	 * @see #getRepository_DataType()
	 * @generated
	 */
	void setRepository_DataType(Repository value);

} // DataType
