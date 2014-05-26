/**
 */
package org.palladiosimulator.pcmmeasuringpoint.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmmeasuringpointXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PcmmeasuringpointXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        PcmmeasuringpointPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the PcmmeasuringpointResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new PcmmeasuringpointResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new PcmmeasuringpointResourceFactoryImpl());
        }
        return registrations;
    }

} //PcmmeasuringpointXMLProcessor
