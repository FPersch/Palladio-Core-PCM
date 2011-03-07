/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourceenvironment;

import de.uka.ipd.sdq.pcm.core.PCMRandomVariable;

import de.uka.ipd.sdq.pcm.resourcetype.ProcessingResourceType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Performance specification of processing resources (e.g. processing rate, scheduling policy)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getMTTR <em>MTTR</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getMTTF <em>MTTF</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification <em>Active Resource Type Active Resource Specification</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getProcessingRate_ProcessingResourceSpecification <em>Processing Rate Processing Resource Specification</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getNumberOfReplicas <em>Number Of Replicas</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification <em>Resource Container Processing Resource Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification()
 * @model
 * @generated
 */
public interface ProcessingResourceSpecification extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>MTTR</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Mean Time To Repair (MTTR) of a physical resource is the expected timespan from breakdown of this physical resource to its repair or replacement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MTTR</em>' attribute.
	 * @see #setMTTR(double)
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification_MTTR()
	 * @model default="0.0" required="true" ordered="false"
	 * @generated
	 */
	double getMTTR();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getMTTR <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTTR</em>' attribute.
	 * @see #getMTTR()
	 * @generated
	 */
	void setMTTR(double value);

	/**
	 * Returns the value of the '<em><b>MTTF</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Mean Time To Failure (MTTF) of a physical resource is the expected timespan from the start of its usage until breakdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MTTF</em>' attribute.
	 * @see #setMTTF(double)
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification_MTTF()
	 * @model default="0.0" required="true" ordered="false"
	 * @generated
	 */
	double getMTTF();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getMTTF <em>MTTF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTTF</em>' attribute.
	 * @see #getMTTF()
	 * @generated
	 */
	void setMTTF(double value);

	/**
	 * Returns the value of the '<em><b>Scheduling Policy</b></em>' attribute.
	 * The default value is <code>"FCFS"</code>.
	 * The literals are from the enumeration {@link de.uka.ipd.sdq.pcm.resourceenvironment.SchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Policy</em>' attribute.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.SchedulingPolicy
	 * @see #setSchedulingPolicy(SchedulingPolicy)
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification_SchedulingPolicy()
	 * @model default="FCFS" required="true" ordered="false"
	 * @generated
	 */
	SchedulingPolicy getSchedulingPolicy();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Policy</em>' attribute.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.SchedulingPolicy
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	void setSchedulingPolicy(SchedulingPolicy value);

	/**
	 * Returns the value of the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Resource Type Active Resource Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Resource Type Active Resource Specification</em>' reference.
	 * @see #setActiveResourceType_ActiveResourceSpecification(ProcessingResourceType)
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessingResourceType getActiveResourceType_ActiveResourceSpecification();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification <em>Active Resource Type Active Resource Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Resource Type Active Resource Specification</em>' reference.
	 * @see #getActiveResourceType_ActiveResourceSpecification()
	 * @generated
	 */
	void setActiveResourceType_ActiveResourceSpecification(ProcessingResourceType value);

	/**
	 * Returns the value of the '<em><b>Processing Rate Processing Resource Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uka.ipd.sdq.pcm.core.PCMRandomVariable#getProcessingResourceSpecification_processingRate_PCMRandomVariable <em>Processing Resource Specification processing Rate PCM Random Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Rate Processing Resource Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Rate Processing Resource Specification</em>' containment reference.
	 * @see #setProcessingRate_ProcessingResourceSpecification(PCMRandomVariable)
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification()
	 * @see de.uka.ipd.sdq.pcm.core.PCMRandomVariable#getProcessingResourceSpecification_processingRate_PCMRandomVariable
	 * @model opposite="processingResourceSpecification_processingRate_PCMRandomVariable" containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getProcessingRate_ProcessingResourceSpecification();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getProcessingRate_ProcessingResourceSpecification <em>Processing Rate Processing Resource Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Rate Processing Resource Specification</em>' containment reference.
	 * @see #getProcessingRate_ProcessingResourceSpecification()
	 * @generated
	 */
	void setProcessingRate_ProcessingResourceSpecification(PCMRandomVariable value);

	/**
	 * Returns the value of the '<em><b>Number Of Replicas</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     Specifies the actual number of processors of the processing resource.
	 * </p>
	 * <p>
	 *     In terms of the queueing theory, the number of processors corresponds to the number of servers&nbsp;of a service
	 *     center. Thus, the attribute allows to specify a&nbsp;multi-server queue, i.e., one queue with multiple servers.<br />
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Replicas</em>' attribute.
	 * @see #setNumberOfReplicas(int)
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification_NumberOfReplicas()
	 * @model default="1" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfReplicas();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getNumberOfReplicas <em>Number Of Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Replicas</em>' attribute.
	 * @see #getNumberOfReplicas()
	 * @generated
	 */
	void setNumberOfReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Resource Container Processing Resource Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Container Processing Resource Specification</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container Processing Resource Specification</em>' container reference.
	 * @see #setResourceContainer_ProcessingResourceSpecification(ResourceContainer)
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification()
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer#getActiveResourceSpecifications_ResourceContainer
	 * @model opposite="activeResourceSpecifications_ResourceContainer" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ResourceContainer getResourceContainer_ProcessingResourceSpecification();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification <em>Resource Container Processing Resource Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container Processing Resource Specification</em>' container reference.
	 * @see #getResourceContainer_ProcessingResourceSpecification()
	 * @generated
	 */
	void setResourceContainer_ProcessingResourceSpecification(ResourceContainer value);

} // ProcessingResourceSpecification
