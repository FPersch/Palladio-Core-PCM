/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.system.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.mdsdprofiles.ProfileableElement;
import org.palladiosimulator.mdsdprofiles.StereotypableElement;

import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.core.entity.ComposedProvidingRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceProvidingEntity;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceProvidingRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.NamedElement;
import de.uka.ipd.sdq.pcm.core.entity.ResourceInterfaceRequiringEntity;
import de.uka.ipd.sdq.pcm.system.SystemPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see de.uka.ipd.sdq.pcm.system.SystemPackage
 * @generated
 */
public class SystemSwitch<T> {

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
    protected static SystemPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SystemSwitch() {
        if (modelPackage == null) {
            modelPackage = SystemPackage.eINSTANCE;
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
        case SystemPackage.SYSTEM: {
            final de.uka.ipd.sdq.pcm.system.System system = (de.uka.ipd.sdq.pcm.system.System) theEObject;
            T result = this.caseSystem(system);
            if (result == null) {
                result = this.caseProfileableElement(system);
            }
            if (result == null) {
                result = this.caseComposedProvidingRequiringEntity(system);
            }
            if (result == null) {
                result = this.caseIdentifier(system);
            }
            if (result == null) {
                result = this.caseNamedElement(system);
            }
            if (result == null) {
                result = this.caseComposedStructure(system);
            }
            if (result == null) {
                result = this.caseInterfaceProvidingRequiringEntity(system);
            }
            if (result == null) {
                result = this.caseStereotypableElement(system);
            }
            if (result == null) {
                result = this.caseInterfaceProvidingEntity(system);
            }
            if (result == null) {
                result = this.caseInterfaceRequiringEntity(system);
            }
            if (result == null) {
                result = this.caseResourceInterfaceRequiringEntity(system);
            }
            if (result == null) {
                result = this.caseEntity(system);
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
     * Returns the result of interpreting the object as an instance of ' <em>System</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of ' <em>System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystem(final de.uka.ipd.sdq.pcm.system.System object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Profileable Element</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Profileable Element</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProfileableElement(final ProfileableElement object) {
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

} // SystemSwitch
