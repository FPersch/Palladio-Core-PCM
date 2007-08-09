/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.seff;

import de.uka.ipd.sdq.pcm.resourcetype.ProcessingResourceType;

import de.uka.ipd.sdq.stoex.PCMRandomVariable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.ParametricResourceDemand#getRequiredResource_ParametricResourceDemand <em>Required Resource Parametric Resource Demand</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.ParametricResourceDemand#getAction_ParametricResourceDemand <em>Action Parametric Resource Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.seff.SeffPackage#getParametricResourceDemand()
 * @model
 * @generated
 */
public interface ParametricResourceDemand extends PCMRandomVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Required Resource Parametric Resource Demand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Resource Parametric Resource Demand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Resource Parametric Resource Demand</em>' reference.
	 * @see #setRequiredResource_ParametricResourceDemand(ProcessingResourceType)
	 * @see de.uka.ipd.sdq.pcm.seff.SeffPackage#getParametricResourceDemand_RequiredResource_ParametricResourceDemand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessingResourceType getRequiredResource_ParametricResourceDemand();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.seff.ParametricResourceDemand#getRequiredResource_ParametricResourceDemand <em>Required Resource Parametric Resource Demand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resource Parametric Resource Demand</em>' reference.
	 * @see #getRequiredResource_ParametricResourceDemand()
	 * @generated
	 */
	void setRequiredResource_ParametricResourceDemand(ProcessingResourceType value);

	/**
	 * Returns the value of the '<em><b>Action Parametric Resource Demand</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uka.ipd.sdq.pcm.seff.AbstractResourceDemandingAction#getResourceDemand_Action <em>Resource Demand Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Parametric Resource Demand</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Parametric Resource Demand</em>' container reference.
	 * @see #setAction_ParametricResourceDemand(AbstractResourceDemandingAction)
	 * @see de.uka.ipd.sdq.pcm.seff.SeffPackage#getParametricResourceDemand_Action_ParametricResourceDemand()
	 * @see de.uka.ipd.sdq.pcm.seff.AbstractResourceDemandingAction#getResourceDemand_Action
	 * @model opposite="resourceDemand_Action" required="true" transient="false" ordered="false"
	 * @generated
	 */
	AbstractResourceDemandingAction getAction_ParametricResourceDemand();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.seff.ParametricResourceDemand#getAction_ParametricResourceDemand <em>Action Parametric Resource Demand</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Parametric Resource Demand</em>' container reference.
	 * @see #getAction_ParametricResourceDemand()
	 * @generated
	 */
	void setAction_ParametricResourceDemand(AbstractResourceDemandingAction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.specification<>'' and not self.specification.oclIsUndefined()
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ParametricResourceDemandSpecificationMustNotBeNULL(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ParametricResourceDemand
