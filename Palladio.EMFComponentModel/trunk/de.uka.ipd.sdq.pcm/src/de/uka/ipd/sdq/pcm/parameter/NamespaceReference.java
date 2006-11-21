
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.parameter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.parameter.NamespaceReference#getInnerReference_NamespaceReference <em>Inner Reference Namespace Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.parameter.ParameterPackage#getNamespaceReference()
 * @model
 * @generated
 */
public interface NamespaceReference extends AbstractNamedReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(c) by SDQ, IPD, U Karlsruhe (TH), 2006";

	/**
	 * Returns the value of the '<em><b>Inner Reference Namespace Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Reference Namespace Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Reference Namespace Reference</em>' containment reference.
	 * @see #setInnerReference_NamespaceReference(AbstractNamedReference)
	 * @see de.uka.ipd.sdq.pcm.parameter.ParameterPackage#getNamespaceReference_InnerReference_NamespaceReference()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AbstractNamedReference getInnerReference_NamespaceReference();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.parameter.NamespaceReference#getInnerReference_NamespaceReference <em>Inner Reference Namespace Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Reference Namespace Reference</em>' containment reference.
	 * @see #getInnerReference_NamespaceReference()
	 * @generated
	 */
	void setInnerReference_NamespaceReference(AbstractNamedReference value);

} // NamespaceReference