/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.core.entity.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.mdsdprofiles.StereotypableElement;

import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.core.entity.ComposedProvidingRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.core.entity.EntityPackage;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceProvidingEntity;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceProvidingRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.NamedElement;
import de.uka.ipd.sdq.pcm.core.entity.ResourceInterfaceProvidingEntity;
import de.uka.ipd.sdq.pcm.core.entity.ResourceInterfaceProvidingRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.ResourceInterfaceRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.ResourceProvidedRole;
import de.uka.ipd.sdq.pcm.core.entity.ResourceRequiredRole;
import de.uka.ipd.sdq.pcm.repository.Role;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see de.uka.ipd.sdq.pcm.core.entity.EntityPackage
 * @generated
 */
public class EntitySwitch<T> {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static EntityPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EntitySwitch() {
        if (modelPackage == null) {
            modelPackage = EntityPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        } else {
            final List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case EntityPackage.RESOURCE_PROVIDED_ROLE: {
            final ResourceProvidedRole resourceProvidedRole = (ResourceProvidedRole) theEObject;
            T result = this.caseResourceProvidedRole(resourceProvidedRole);
            if (result == null) {
                result = this.caseRole(resourceProvidedRole);
            }
            if (result == null) {
                result = this.caseEntity(resourceProvidedRole);
            }
            if (result == null) {
                result = this.caseIdentifier(resourceProvidedRole);
            }
            if (result == null) {
                result = this.caseNamedElement(resourceProvidedRole);
            }
            if (result == null) {
                result = this.caseStereotypableElement(resourceProvidedRole);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY: {
            final InterfaceProvidingRequiringEntity interfaceProvidingRequiringEntity = (InterfaceProvidingRequiringEntity) theEObject;
            T result = this.caseInterfaceProvidingRequiringEntity(interfaceProvidingRequiringEntity);
            if (result == null) {
                result = this.caseInterfaceProvidingEntity(interfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseInterfaceRequiringEntity(interfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseResourceInterfaceRequiringEntity(interfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseEntity(interfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseIdentifier(interfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseNamedElement(interfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseStereotypableElement(interfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case EntityPackage.INTERFACE_PROVIDING_ENTITY: {
            final InterfaceProvidingEntity interfaceProvidingEntity = (InterfaceProvidingEntity) theEObject;
            T result = this.caseInterfaceProvidingEntity(interfaceProvidingEntity);
            if (result == null) {
                result = this.caseEntity(interfaceProvidingEntity);
            }
            if (result == null) {
                result = this.caseIdentifier(interfaceProvidingEntity);
            }
            if (result == null) {
                result = this.caseNamedElement(interfaceProvidingEntity);
            }
            if (result == null) {
                result = this.caseStereotypableElement(interfaceProvidingEntity);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case EntityPackage.INTERFACE_REQUIRING_ENTITY: {
            final InterfaceRequiringEntity interfaceRequiringEntity = (InterfaceRequiringEntity) theEObject;
            T result = this.caseInterfaceRequiringEntity(interfaceRequiringEntity);
            if (result == null) {
                result = this.caseResourceInterfaceRequiringEntity(interfaceRequiringEntity);
            }
            if (result == null) {
                result = this.caseEntity(interfaceRequiringEntity);
            }
            if (result == null) {
                result = this.caseIdentifier(interfaceRequiringEntity);
            }
            if (result == null) {
                result = this.caseNamedElement(interfaceRequiringEntity);
            }
            if (result == null) {
                result = this.caseStereotypableElement(interfaceRequiringEntity);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case EntityPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY: {
            final ResourceInterfaceRequiringEntity resourceInterfaceRequiringEntity = (ResourceInterfaceRequiringEntity) theEObject;
            T result = this.caseResourceInterfaceRequiringEntity(resourceInterfaceRequiringEntity);
            if (result == null) {
                result = this.caseEntity(resourceInterfaceRequiringEntity);
            }
            if (result == null) {
                result = this.caseIdentifier(resourceInterfaceRequiringEntity);
            }
            if (result == null) {
                result = this.caseNamedElement(resourceInterfaceRequiringEntity);
            }
            if (result == null) {
                result = this.caseStereotypableElement(resourceInterfaceRequiringEntity);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case EntityPackage.RESOURCE_REQUIRED_ROLE: {
            final ResourceRequiredRole resourceRequiredRole = (ResourceRequiredRole) theEObject;
            T result = this.caseResourceRequiredRole(resourceRequiredRole);
            if (result == null) {
                result = this.caseRole(resourceRequiredRole);
            }
            if (result == null) {
                result = this.caseEntity(resourceRequiredRole);
            }
            if (result == null) {
                result = this.caseIdentifier(resourceRequiredRole);
            }
            if (result == null) {
                result = this.caseNamedElement(resourceRequiredRole);
            }
            if (result == null) {
                result = this.caseStereotypableElement(resourceRequiredRole);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case EntityPackage.RESOURCE_INTERFACE_PROVIDING_ENTITY: {
            final ResourceInterfaceProvidingEntity resourceInterfaceProvidingEntity = (ResourceInterfaceProvidingEntity) theEObject;
            T result = this.caseResourceInterfaceProvidingEntity(resourceInterfaceProvidingEntity);
            if (result == null) {
                result = this.caseEntity(resourceInterfaceProvidingEntity);
            }
            if (result == null) {
                result = this.caseIdentifier(resourceInterfaceProvidingEntity);
            }
            if (result == null) {
                result = this.caseNamedElement(resourceInterfaceProvidingEntity);
            }
            if (result == null) {
                result = this.caseStereotypableElement(resourceInterfaceProvidingEntity);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY: {
            final ComposedProvidingRequiringEntity composedProvidingRequiringEntity = (ComposedProvidingRequiringEntity) theEObject;
            T result = this.caseComposedProvidingRequiringEntity(composedProvidingRequiringEntity);
            if (result == null) {
                result = this.caseComposedStructure(composedProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseInterfaceProvidingRequiringEntity(composedProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseInterfaceProvidingEntity(composedProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseInterfaceRequiringEntity(composedProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseIdentifier(composedProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseNamedElement(composedProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseResourceInterfaceRequiringEntity(composedProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseEntity(composedProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseStereotypableElement(composedProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case EntityPackage.NAMED_ELEMENT: {
            final NamedElement namedElement = (NamedElement) theEObject;
            T result = this.caseNamedElement(namedElement);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case EntityPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY: {
            final ResourceInterfaceProvidingRequiringEntity resourceInterfaceProvidingRequiringEntity = (ResourceInterfaceProvidingRequiringEntity) theEObject;
            T result = this.caseResourceInterfaceProvidingRequiringEntity(resourceInterfaceProvidingRequiringEntity);
            if (result == null) {
                result = this.caseResourceInterfaceRequiringEntity(resourceInterfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseResourceInterfaceProvidingEntity(resourceInterfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseEntity(resourceInterfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseIdentifier(resourceInterfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseNamedElement(resourceInterfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.caseStereotypableElement(resourceInterfaceProvidingRequiringEntity);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case EntityPackage.ENTITY: {
            final Entity entity = (Entity) theEObject;
            T result = this.caseEntity(entity);
            if (result == null) {
                result = this.caseIdentifier(entity);
            }
            if (result == null) {
                result = this.caseNamedElement(entity);
            }
            if (result == null) {
                result = this.caseStereotypableElement(entity);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Resource Provided Role</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Resource Provided Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceProvidedRole(final ResourceProvidedRole object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(final NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Resource Interface Providing Requiring Entity</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Resource Interface Providing Requiring Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceInterfaceProvidingRequiringEntity(final ResourceInterfaceProvidingRequiringEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Interface Providing Entity</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Interface Providing Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterfaceProvidingEntity(final InterfaceProvidingEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Interface Providing Requiring Entity</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Interface Providing Requiring Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterfaceProvidingRequiringEntity(final InterfaceProvidingRequiringEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Interface Requiring Entity</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Interface Requiring Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterfaceRequiringEntity(final InterfaceRequiringEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Resource Interface Requiring Entity</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Resource Interface Requiring Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceInterfaceRequiringEntity(final ResourceInterfaceRequiringEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Resource Required Role</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Resource Required Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceRequiredRole(final ResourceRequiredRole object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Composed Providing Requiring Entity</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Composed Providing Requiring Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComposedProvidingRequiringEntity(final ComposedProvidingRequiringEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Resource Interface Providing Entity</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Resource Interface Providing Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceInterfaceProvidingEntity(final ResourceInterfaceProvidingEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of ' <em>Entity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of ' <em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(final Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Stereotypable Element</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Stereotypable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStereotypableElement(final StereotypableElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of ' <em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of ' <em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of ' <em>Role</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of ' <em>Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRole(final Role object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Composed Structure</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Composed Structure</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComposedStructure(final ComposedStructure object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of ' <em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of ' <em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(final EObject object) {
        return null;
    }

} // EntitySwitch
