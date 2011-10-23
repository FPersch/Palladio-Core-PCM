/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.seff.seff_reliability;

import de.uka.ipd.sdq.pcm.seff.AbstractInternalControlFlowAction;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recovery Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Recover block actions are a generic failure handling technique. A recovery block consists of a a primary algorithm and one
 * or more alternatives that can be used in case of failure. If the primary algorithm fails, the next alternative is chosen.
 * Here the alternatives also support failure types. Alternatives may specify which kind of failures they can handle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.seff_reliability.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.seff.seff_reliability.Seff_reliabilityPackage#getRecoveryAction()
 * @model
 * @generated
 */
public interface RecoveryAction extends AbstractInternalControlFlowAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Recovery Action Behaviours Recovery Action</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.seff.seff_reliability.RecoveryActionBehaviour}.
	 * It is bidirectional and its opposite is '{@link de.uka.ipd.sdq.pcm.seff.seff_reliability.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recovery Action Behaviours Recovery Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Action Behaviours Recovery Action</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.seff.seff_reliability.Seff_reliabilityPackage#getRecoveryAction_RecoveryActionBehaviours__RecoveryAction()
	 * @see de.uka.ipd.sdq.pcm.seff.seff_reliability.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour
	 * @model opposite="recoveryAction__RecoveryActionBehaviour" containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<RecoveryActionBehaviour> getRecoveryActionBehaviours__RecoveryAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recoveryActionBehaviours__RecoveryAction->isUnique(s: RecoveryActionBehaviour | s.nextAlternative__RecoveryActionBehaviour) and
	 * self.recoveryActionBehaviours__RecoveryAction->forAll(x:RecoveryActionBehaviour| x <> x.nextAlternative__RecoveryActionBehaviour)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recoveryActionBehaviours__RecoveryAction->isUnique(s: RecoveryActionBehaviour | s.nextAlternative__RecoveryActionBehaviour) and\r\nself.recoveryActionBehaviours__RecoveryAction->forAll(x:RecoveryActionBehaviour| x <> x.nextAlternative__RecoveryActionBehaviour)\r\n'"
	 * @generated
	 */
	boolean Alternativesformachain(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RecoveryAction
