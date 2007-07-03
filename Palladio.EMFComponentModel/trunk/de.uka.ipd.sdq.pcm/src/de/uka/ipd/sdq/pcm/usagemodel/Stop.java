
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.usagemodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage#getStop()
 * @model
 * @generated
 */
public interface Stop extends AbstractUserAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.successor.oclIsUndefined()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Stophasnosuccessor(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Stop
