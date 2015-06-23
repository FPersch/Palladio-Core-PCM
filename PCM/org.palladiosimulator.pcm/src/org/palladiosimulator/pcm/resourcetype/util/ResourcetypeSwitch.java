/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package org.palladiosimulator.pcm.resourcetype.util;

import de.uka.ipd.sdq.identifier.Identifier;

import de.uka.ipd.sdq.units.UnitCarryingElement;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.core.entity.ResourceInterfaceProvidingEntity;

import org.palladiosimulator.pcm.resourcetype.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.resourcetype.ResourcetypePackage
 * @generated
 */
public class ResourcetypeSwitch<T> {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ResourcetypePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourcetypeSwitch() {
        if (modelPackage == null) {
            modelPackage = ResourcetypePackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        } else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case ResourcetypePackage.RESOURCE_SIGNATURE: {
            ResourceSignature resourceSignature = (ResourceSignature) theEObject;
            T result = caseResourceSignature(resourceSignature);
            if (result == null)
                result = caseEntity(resourceSignature);
            if (result == null)
                result = caseIdentifier(resourceSignature);
            if (result == null)
                result = caseNamedElement(resourceSignature);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ResourcetypePackage.PROCESSING_RESOURCE_TYPE: {
            ProcessingResourceType processingResourceType = (ProcessingResourceType) theEObject;
            T result = caseProcessingResourceType(processingResourceType);
            if (result == null)
                result = caseResourceType(processingResourceType);
            if (result == null)
                result = caseUnitCarryingElement(processingResourceType);
            if (result == null)
                result = caseResourceInterfaceProvidingEntity(processingResourceType);
            if (result == null)
                result = caseEntity(processingResourceType);
            if (result == null)
                result = caseIdentifier(processingResourceType);
            if (result == null)
                result = caseNamedElement(processingResourceType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ResourcetypePackage.RESOURCE_TYPE: {
            ResourceType resourceType = (ResourceType) theEObject;
            T result = caseResourceType(resourceType);
            if (result == null)
                result = caseUnitCarryingElement(resourceType);
            if (result == null)
                result = caseResourceInterfaceProvidingEntity(resourceType);
            if (result == null)
                result = caseEntity(resourceType);
            if (result == null)
                result = caseIdentifier(resourceType);
            if (result == null)
                result = caseNamedElement(resourceType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ResourcetypePackage.RESOURCE_REPOSITORY: {
            ResourceRepository resourceRepository = (ResourceRepository) theEObject;
            T result = caseResourceRepository(resourceRepository);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ResourcetypePackage.SCHEDULING_POLICY: {
            SchedulingPolicy schedulingPolicy = (SchedulingPolicy) theEObject;
            T result = caseSchedulingPolicy(schedulingPolicy);
            if (result == null)
                result = caseEntity(schedulingPolicy);
            if (result == null)
                result = caseIdentifier(schedulingPolicy);
            if (result == null)
                result = caseNamedElement(schedulingPolicy);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ResourcetypePackage.COMMUNICATION_LINK_RESOURCE_TYPE: {
            CommunicationLinkResourceType communicationLinkResourceType = (CommunicationLinkResourceType) theEObject;
            T result = caseCommunicationLinkResourceType(communicationLinkResourceType);
            if (result == null)
                result = caseResourceType(communicationLinkResourceType);
            if (result == null)
                result = caseUnitCarryingElement(communicationLinkResourceType);
            if (result == null)
                result = caseResourceInterfaceProvidingEntity(communicationLinkResourceType);
            if (result == null)
                result = caseEntity(communicationLinkResourceType);
            if (result == null)
                result = caseIdentifier(communicationLinkResourceType);
            if (result == null)
                result = caseNamedElement(communicationLinkResourceType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ResourcetypePackage.RESOURCE_INTERFACE: {
            ResourceInterface resourceInterface = (ResourceInterface) theEObject;
            T result = caseResourceInterface(resourceInterface);
            if (result == null)
                result = caseEntity(resourceInterface);
            if (result == null)
                result = caseIdentifier(resourceInterface);
            if (result == null)
                result = caseNamedElement(resourceInterface);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Signature</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Signature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceSignature(ResourceSignature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processing Resource Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processing Resource Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessingResourceType(ProcessingResourceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceType(ResourceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Repository</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceRepository(ResourceRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scheduling Policy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scheduling Policy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchedulingPolicy(SchedulingPolicy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Communication Link Resource Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Communication Link Resource Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommunicationLinkResourceType(CommunicationLinkResourceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Interface</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Interface</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceInterface(ResourceInterface object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unit Carrying Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unit Carrying Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnitCarryingElement(UnitCarryingElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Interface Providing Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Interface Providing Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceInterfaceProvidingEntity(ResourceInterfaceProvidingEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //ResourcetypeSwitch
