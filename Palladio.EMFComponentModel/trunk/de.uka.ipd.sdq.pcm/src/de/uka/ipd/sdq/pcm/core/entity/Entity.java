/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.core.entity;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Entity is a meta class high up the PCM meta class hierarchy and represents all entities of the PCM that have both an id (see meta class Identifier) and a name (see meta class NamedEntity).
 * <!-- end-model-doc -->
 *
 *
 * @see de.uka.ipd.sdq.pcm.core.entity.EntityPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends Identifier, NamedElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2008 by SDQ, IPD, University of Karlsruhe, Germany";

} // Entity
