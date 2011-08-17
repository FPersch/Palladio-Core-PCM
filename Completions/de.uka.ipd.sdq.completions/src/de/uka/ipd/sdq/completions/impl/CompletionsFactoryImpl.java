/**
 * Copyright SDQ, IPD, U Karlsruhe, 2007
 *
 * $Id$
 */
package de.uka.ipd.sdq.completions.impl;

import de.uka.ipd.sdq.completions.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.completions.Completion;
import de.uka.ipd.sdq.completions.CompletionRepository;
import de.uka.ipd.sdq.completions.CompletionsFactory;
import de.uka.ipd.sdq.completions.CompletionsPackage;
import de.uka.ipd.sdq.completions.DelegatingExternalCallAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompletionsFactoryImpl extends EFactoryImpl implements CompletionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompletionsFactory init() {
		try {
			CompletionsFactory theCompletionsFactory = (CompletionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://sdq.ipd.uka.de/Completions/1.0"); 
			if (theCompletionsFactory != null) {
				return theCompletionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompletionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CompletionsPackage.COMPLETION: return createCompletion();
			case CompletionsPackage.COMPLETION_REPOSITORY: return createCompletionRepository();
			case CompletionsPackage.DELEGATING_EXTERNAL_CALL_ACTION: return createDelegatingExternalCallAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Completion createCompletion() {
		CompletionImpl completion = new CompletionImpl();
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionRepository createCompletionRepository() {
		CompletionRepositoryImpl completionRepository = new CompletionRepositoryImpl();
		return completionRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegatingExternalCallAction createDelegatingExternalCallAction() {
		DelegatingExternalCallActionImpl delegatingExternalCallAction = new DelegatingExternalCallActionImpl();
		return delegatingExternalCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionsPackage getCompletionsPackage() {
		return (CompletionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompletionsPackage getPackage() {
		return CompletionsPackage.eINSTANCE;
	}

} //CompletionsFactoryImpl
