package com.palladio_simulator.protocom.tech.rmi

import de.uka.ipd.sdq.pcm.repository.ProvidedRole
import de.uka.ipd.sdq.pcm.repository.OperationProvidedRole
import de.uka.ipd.sdq.pcm.repository.InfrastructureProvidedRole
import com.palladio_simulator.protocom.lang.java.impl.JField
import com.palladio_simulator.protocom.lang.java.util.JavaNames
import com.palladio_simulator.protocom.lang.java.impl.JMethod
import com.palladio_simulator.protocom.lang.java.util.PcmCommons
import com.palladio_simulator.protocom.lang.java.util.JavaConstants

class PojoComposedStructurePortClass extends PojoClass<ProvidedRole> {
	
	new(ProvidedRole pcmEntity) {
		super(pcmEntity)
	}
	
	override superClass() {
		JavaConstants::RMI_REMOTE_OBJECT_CLASS
	}
	
	override fields() {
		#[
			new JField()
				.withName("myCompositeComponent")
				.withType(JavaNames::fqnInterface(pcmEntity.providingEntity_ProvidedRole)),
			new JField()
				.withName("myInnerPort")
				.withType(JavaNames::fqn((pcmEntity as OperationProvidedRole).providedInterface__OperationProvidedRole))
		]
	}
	
	override packageName() {
		JavaNames::fqnPortPackage(pcmEntity)
	}
	
	override compilationUnitName() {
		JavaNames::portClassName(pcmEntity)
	}
	
	override interfaces() {
		#[ 
			"com.palladio_simulator.protocom.framework.port.IPort<" + JavaNames::fqnInterface(pcmEntity.providingEntity_ProvidedRole) + ">",
			JavaNames::fqn((pcmEntity as OperationProvidedRole).providedInterface__OperationProvidedRole),
			JavaConstants::RMI_REMOTE_INTERFACE, 
			JavaConstants::SERIALIZABLE_INTERFACE
		]
	}
	
	override constructors() {
		#[
			new JMethod()
				.withParameters(JavaNames::fqn((pcmEntity as OperationProvidedRole).providedInterface__OperationProvidedRole) + " myInnerPort, " + JavaNames::fqnInterface(pcmEntity.providingEntity_ProvidedRole) + " myComponent, String assemblyContext")
				.withThrows(JavaConstants::RMI_REMOTE_EXCEPTION)
				.withImplementation('''
					this.myInnerPort = myInnerPort;
					this.myCompositeComponent = myComponent;
					com.palladio_simulator.protocom.framework.registry.RmiRegistry.registerPort(com.palladio_simulator.protocom.framework.registry.RmiRegistry.getRemoteAddress(),
					com.palladio_simulator.protocom.framework.registry.RmiRegistry.getRegistryPort(), this, "«JavaNames::portClassName(pcmEntity)»_" + assemblyContext);
					''')
		]
	}

	override methods() {
		val results = newLinkedList
		
		results += providedRoleMethods(pcmEntity)
		
		results += #[
			
			new JMethod()
				.withName("setContext")
				.withParameters("Object myContext")
				.withThrows(JavaConstants::RMI_REMOTE_EXCEPTION)
				.withImplementation("myCompositeComponent.setContext(myContext);"),
				
			new JMethod()
				.withName("setComponentFrame")
				.withParameters(PcmCommons::stackframeParameterList)
				.withThrows(JavaConstants::RMI_REMOTE_EXCEPTION)
				.withImplementation(""),
				
			new JMethod()
				.withName("getComponent")
				.withReturnType(JavaNames::fqnInterface(pcmEntity.providingEntity_ProvidedRole))
				.withThrows(JavaConstants::RMI_REMOTE_EXCEPTION)
				.withImplementation("return myCompositeComponent;")
			
		]
		
		results
		
	}
	
	
	
	override filePath() {
		JavaNames::fqnToDirectoryPath(JavaNames::fqnPortPackage(pcmEntity)) + "/" + JavaNames::portClassName(pcmEntity) + ".java"
	}
	
	
	def dispatch providedRoleMethods(OperationProvidedRole role) {

		role.providedInterface__OperationProvidedRole.signatures__OperationInterface.map[
			
			new JMethod()
				.withName(JavaNames::javaSignature(it))
				.withReturnType(PcmCommons::stackframeType)
				.withParameters(PcmCommons::stackContextParameterList)
				.withImplementation("return myInnerPort." + JavaNames::javaSignature(it) + "(ctx);")
				.withThrows(JavaConstants::RMI_REMOTE_EXCEPTION)
			
		] 

	}
	
	def dispatch providedRoleMethods(InfrastructureProvidedRole role) {

		role.providedInterface__InfrastructureProvidedRole.infrastructureSignatures__InfrastructureInterface.map[
			
			new JMethod()
				.withName(JavaNames::javaSignature(it))
				.withReturnType(PcmCommons::stackframeType)
				.withParameters(PcmCommons::stackContextParameterList)
				.withImplementation("return null;")
				.withThrows(JavaConstants::RMI_REMOTE_EXCEPTION)
			
		] 
		
	}
	
	
}