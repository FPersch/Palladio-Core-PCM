package com.palladio_simulator.protocom.lang.java.util

import de.uka.ipd.sdq.pcm.core.entity.Entity
import java.util.List
import de.uka.ipd.sdq.pcm.parameter.VariableUsage
import de.uka.ipd.sdq.pcm.repository.OperationSignature
import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure
import de.uka.ipd.sdq.pcm.repository.ProvidedRole
import de.uka.ipd.sdq.pcm.core.composition.ProvidedDelegationConnector
import de.uka.ipd.sdq.pcm.core.composition.Connector
import de.uka.ipd.sdq.pcm.repository.RequiredRole
import de.uka.ipd.sdq.pcm.core.composition.RequiredDelegationConnector
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext

/**
 * Common PCM stuff.
 * 
 * TODO: write something ingenious to justify this class here. 
 */
class PcmCommons {
	
	static def String stackframeType() {
		'''de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>'''
	}
	
	static def String stackframeParameterList() {
		'''de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame'''
	}
		
	static def String stackContextParameterList() {
		'''de.uka.ipd.sdq.simucomframework.variables.StackContext ctx'''
	}
	
	static def String stackContextClass() {
		'''de.uka.ipd.sdq.simucomframework.variables.StackContext'''
	}
	
	static def String stackContextParameterUsageList() {
		'''ctx'''
	}


	// from call.xpt
	static def String call(OperationSignature signature, Entity call, String prefix, List<VariableUsage> parameterUsages, List<VariableUsage> outParameterUsages) {
//	�EXPAND PreCallTM(call, prefix, parameterUsages) FOR this�
   		
   		prefix + JavaNames::javaSignature(signature) + "(" + "ctx" + ");"
   		
   		
   	
//   		�prefix��JavaNames::javaSignature()�
////	   	(�EXPAND m2t_transforms::java_core::ParameterUsageListTM FOR this�);
//		
//	//	�EXPAND PostCallTM(call, prefix, outParameterUsages) FOR this�		
		
	}
	
	
	static def ProvidedDelegationConnector getProvidedDelegationConnector(ComposedStructure s, ProvidedRole p) {
		s.connectors__ComposedStructure.filter[ProvidedDelegationConnector.isInstance(it)].filter[(it as ProvidedDelegationConnector).outerProvidedRole_ProvidedDelegationConnector == p].toList.get(0)	as ProvidedDelegationConnector
	}
	
	static def List<Connector> getProvidedDelegationConnector(ComposedStructure s) {
		s.connectors__ComposedStructure.filter[ProvidedDelegationConnector.isInstance(it)].toList as List<Connector>
	}
	
	static def RequiredDelegationConnector getRequiredDelegationConnector(ComposedStructure s, RequiredRole p) {
		s.connectors__ComposedStructure.filter[RequiredDelegationConnector.isInstance(it)].filter[(it as RequiredDelegationConnector).outerRequiredRole_RequiredDelegationConnector == p].toList.get(0)	as RequiredDelegationConnector
	}
	
	static def List<Connector> getRequiredDelegationConnector(ComposedStructure s) {
		s.connectors__ComposedStructure.filter[RequiredDelegationConnector.isInstance(it)].toList as List<Connector>
	}
	
	static def boolean hasConnector(ComposedStructure s, AssemblyContext ctx, RequiredRole r) {
   		PcmCalls::connectors(s).filter[con| PcmCalls::test(con,ctx,r)].size == 1
    }

	static def getConnector(ComposedStructure s, AssemblyContext ctx, RequiredRole r) {
   		PcmCalls::connectors(s).filter[con| PcmCalls::test(con,ctx,r)].get(0);
    }
   
	
	
	
}

//	�DEFINE Call(Entity call, String prefix, List[VariableUsage] parameterUsages, List[VariableUsage] outParameterUsages) FOR OperationSignature�
//	�EXPAND PreCallTM(call, prefix, parameterUsages) FOR this�
//   	�prefix��this.javaSignature()�
//	   	(�EXPAND m2t_transforms::java_core::ParameterUsageListTM FOR this�);
//	�EXPAND PostCallTM(call, prefix, outParameterUsages) FOR this�
//�ENDDEFINE�
//
//�DEFINE Call(Entity call) FOR InfrastructureCall�
// 	{ //CALL SCOPE: this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
//	    long numberOfCalls = ctx.evaluate("�this.numberOfCalls__InfrastructureCall.specification.specificationString()�",Double.class).longValue();
//		for (long callNumber = 0; callNumber < numberOfCalls; callNumber++) {
// 	�LET "myContext.getRole"+this.requiredRole__InfrastructureCall.javaName()+"()." AS prefix�
//		�EXPAND PreCallTM(call, prefix, this.inputVariableUsages__CallAction) FOR this.signature__InfrastructureCall�
//	   	�prefix��this.signature__InfrastructureCall.javaSignature()�
//		   	(�EXPAND m2t_transforms::java_core::ParameterUsageListTM FOR this.signature__InfrastructureCall�);
//		�EXPAND PostCallTM(call, prefix) FOR this.signature__InfrastructureCall�
//	�ENDLET�
//		}
//	} // END CALL SCOPE
//�ENDDEFINE�
//}