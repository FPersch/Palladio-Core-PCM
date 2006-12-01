
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.seff;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.BranchTransition#getBranchBehaviour_BranchTransition <em>Branch Behaviour Branch Transition</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.BranchTransition#getBranchCondition_BranchTransition <em>Branch Condition Branch Transition</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.BranchTransition#getBranchProbability <em>Branch Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.seff.SeffPackage#getBranchTransition()
 * @model
 * @generated
 */
public interface BranchTransition extends Identifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(c) by SDQ, IPD, U Karlsruhe (TH), 2006";

	/**
	 * Returns the value of the '<em><b>Branch Behaviour Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Behaviour Branch Transition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Behaviour Branch Transition</em>' containment reference.
	 * @see #setBranchBehaviour_BranchTransition(ResourceDemandingBehaviour)
	 * @see de.uka.ipd.sdq.pcm.seff.SeffPackage#getBranchTransition_BranchBehaviour_BranchTransition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ResourceDemandingBehaviour getBranchBehaviour_BranchTransition();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.seff.BranchTransition#getBranchBehaviour_BranchTransition <em>Branch Behaviour Branch Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Behaviour Branch Transition</em>' containment reference.
	 * @see #getBranchBehaviour_BranchTransition()
	 * @generated
	 */
	void setBranchBehaviour_BranchTransition(ResourceDemandingBehaviour value);

	/**
	 * Returns the value of the '<em><b>Branch Condition Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Condition Branch Transition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Condition Branch Transition</em>' containment reference.
	 * @see #setBranchCondition_BranchTransition(BranchCondition)
	 * @see de.uka.ipd.sdq.pcm.seff.SeffPackage#getBranchTransition_BranchCondition_BranchTransition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BranchCondition getBranchCondition_BranchTransition();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.seff.BranchTransition#getBranchCondition_BranchTransition <em>Branch Condition Branch Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Condition Branch Transition</em>' containment reference.
	 * @see #getBranchCondition_BranchTransition()
	 * @generated
	 */
	void setBranchCondition_BranchTransition(BranchCondition value);

	/**
	 * Returns the value of the '<em><b>Branch Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Probability</em>' attribute.
	 * @see #setBranchProbability(double)
	 * @see de.uka.ipd.sdq.pcm.seff.SeffPackage#getBranchTransition_BranchProbability()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getBranchProbability();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.seff.BranchTransition#getBranchProbability <em>Branch Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Probability</em>' attribute.
	 * @see #getBranchProbability()
	 * @generated
	 */
	void setBranchProbability(double value);

} // BranchTransition