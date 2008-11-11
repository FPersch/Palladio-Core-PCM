/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.repository;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.protocol.Protocol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity models the interface as a set of signatures representing services provided or required by a component. An interface is an abstraction of piece of software (a software entity) which should contain a sufficient amount of information for a caller to understand and finally request the realised functionality from any entity claiming to offer the specified functionality. Note that this implies, that the specification of the interface also has to contain a sufficient amount of information for the implementer to actually implement the interface. Due to the inherent need of an interface to abstract the behaviour of the software entity not in all cases there is sufficient information provided to use or implement an interface in an unambiquious way.
 * 
 * Interfaces can exist on their own, i.e., without any entity requesting or implementing the specified functionality. Two roles can be identified a software entity can take relative to an interface. Any entity can either claim to implement the functionality specified in an interface or to request that functionality. This is reflected in the Palladio Component Model by a set of abstract meta-classes giving a conceptual view on interfaces, entities, and their relationships.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.Interface#getParentInterface__Interface <em>Parent Interface Interface</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.Interface#getAncestorInterfaces_Interface <em>Ancestor Interfaces Interface</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.Interface#getProtocols__Interface <em>Protocols Interface</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.Interface#getSignatures__Interface <em>Signatures Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends AbstractInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Parent Interface Interface</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Interface Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the interfaces from which this interface directly inherits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Interface Interface</em>' reference list.
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getInterface_ParentInterface__Interface()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getParentInterface__Interface();

	/**
	 * Returns the value of the '<em><b>Ancestor Interfaces Interface</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the set of all parent interfaces, from which this interface inherits. All means not just the direct one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ancestor Interfaces Interface</em>' reference list.
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getInterface_AncestorInterfaces_Interface()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getAncestorInterfaces_Interface();

	/**
	 * Returns the value of the '<em><b>Protocols Interface</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.protocol.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocols Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the protocol bound to this interfaces, i.e., the way, in the sense of the order, the services of this interfaces are allowed to be called.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocols Interface</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getInterface_Protocols__Interface()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Protocol> getProtocols__Interface();

	/**
	 * Returns the value of the '<em><b>Signatures Interface</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.repository.Signature}.
	 * It is bidirectional and its opposite is '{@link de.uka.ipd.sdq.pcm.repository.Signature#getInterface_Signature <em>Interface Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signatures Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the set of signatures of which the interface consists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatures Interface</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getInterface_Signatures__Interface()
	 * @see de.uka.ipd.sdq.pcm.repository.Signature#getInterface_Signature
	 * @model opposite="interface_Signature" containment="true" ordered="false"
	 * @generated
	 */
	EList<Signature> getSignatures__Interface();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.protocols__Interface->forAll(p1, p2 |
	 * p1.protocolTypeID <> p2.protocolTypeID)
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean NoProtocolTypeIDUsedTwice(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- full signature has to be unique 
	 * -- (use of ocl-tupels) #
	 * let sigs : Bag(
	 * 	-- parameters: Sequence of DataType, NOT name #
	 * 	-- exceptions have not to be considered #
	 * 	Tuple(returnType : DataType, serviceName : String, parameters : Sequence(DataType) ) 
	 * ) = 
	 * self.signatures__Interface->collect(sig : Signature |
	 * 	Tuple{
	 * 		returnType : DataType = sig.returntype__Signature,
	 * 		serviceName : String = sig.serviceName,
	 * 		parameters : Sequence(DataType) = sig.parameters__Signature.datatype__Parameter
	 * 	}
	 * )
	 * in
	 * sigs->isUnique(s|s)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean SignaturesHaveToBeUniqueForAnInterface(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Interface
