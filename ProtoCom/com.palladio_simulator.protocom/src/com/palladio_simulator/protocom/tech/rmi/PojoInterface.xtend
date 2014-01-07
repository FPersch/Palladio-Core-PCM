package com.palladio_simulator.protocom.tech.rmi

import de.uka.ipd.sdq.pcm.core.entity.Entity
import com.palladio_simulator.protocom.tech.ConceptMapping
import com.palladio_simulator.protocom.lang.java.IJInterface
import com.palladio_simulator.protocom.lang.java.util.JavaNames

/**
 * Common super type for all provider creating Java interfaces. Defines default values
 * for all templates.
 * 
 * @author Thomas Zolynski
 */
abstract class PojoInterface<E extends Entity> extends ConceptMapping<E> implements IJInterface {
	
	new(E pcmEntity) {
		super(pcmEntity)
	}

	override packageName() {
		JavaNames::implementationPackage(pcmEntity)
	}
	
	override compilationUnitName() {
		JavaNames::javaName(pcmEntity)
	}
	
	override filePath() {
		JavaNames::getFileName(pcmEntity)
	}
	
	override interfaces() {
		newLinkedList
	}
	
	override methods() {
		newLinkedList
	}
	
	override fields() {
		newLinkedList
	}
	
}