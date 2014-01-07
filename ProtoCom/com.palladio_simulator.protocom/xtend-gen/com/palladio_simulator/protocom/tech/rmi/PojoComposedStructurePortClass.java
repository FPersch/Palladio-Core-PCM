package com.palladio_simulator.protocom.tech.rmi;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.palladio_simulator.protocom.lang.java.IJField;
import com.palladio_simulator.protocom.lang.java.IJMethod;
import com.palladio_simulator.protocom.lang.java.impl.JField;
import com.palladio_simulator.protocom.lang.java.impl.JMethod;
import com.palladio_simulator.protocom.lang.java.util.JavaConstants;
import com.palladio_simulator.protocom.lang.java.util.JavaNames;
import com.palladio_simulator.protocom.lang.java.util.PcmCommons;
import com.palladio_simulator.protocom.tech.rmi.PojoClass;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceProvidingEntity;
import de.uka.ipd.sdq.pcm.repository.InfrastructureInterface;
import de.uka.ipd.sdq.pcm.repository.InfrastructureProvidedRole;
import de.uka.ipd.sdq.pcm.repository.InfrastructureSignature;
import de.uka.ipd.sdq.pcm.repository.OperationInterface;
import de.uka.ipd.sdq.pcm.repository.OperationProvidedRole;
import de.uka.ipd.sdq.pcm.repository.OperationSignature;
import de.uka.ipd.sdq.pcm.repository.ProvidedRole;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class PojoComposedStructurePortClass extends PojoClass<ProvidedRole> {
  public PojoComposedStructurePortClass(final ProvidedRole pcmEntity) {
    super(pcmEntity);
  }
  
  public String superClass() {
    return JavaConstants.RMI_REMOTE_OBJECT_CLASS;
  }
  
  public Collection<? extends IJField> fields() {
    JField _jField = new JField();
    JField _withName = _jField.withName("myCompositeComponent");
    InterfaceProvidingEntity _providingEntity_ProvidedRole = this.pcmEntity.getProvidingEntity_ProvidedRole();
    String _fqnInterface = JavaNames.fqnInterface(_providingEntity_ProvidedRole);
    JField _withType = _withName.withType(_fqnInterface);
    JField _jField_1 = new JField();
    JField _withName_1 = _jField_1.withName("myInnerPort");
    OperationInterface _providedInterface__OperationProvidedRole = ((OperationProvidedRole) this.pcmEntity).getProvidedInterface__OperationProvidedRole();
    String _fqn = JavaNames.fqn(_providedInterface__OperationProvidedRole);
    JField _withType_1 = _withName_1.withType(_fqn);
    return Collections.<JField>unmodifiableList(Lists.<JField>newArrayList(_withType, _withType_1));
  }
  
  public String packageName() {
    String _fqnPortPackage = JavaNames.fqnPortPackage(this.pcmEntity);
    return _fqnPortPackage;
  }
  
  public String compilationUnitName() {
    String _portClassName = JavaNames.portClassName(this.pcmEntity);
    return _portClassName;
  }
  
  public Collection<String> interfaces() {
    InterfaceProvidingEntity _providingEntity_ProvidedRole = this.pcmEntity.getProvidingEntity_ProvidedRole();
    String _fqnInterface = JavaNames.fqnInterface(_providingEntity_ProvidedRole);
    String _plus = ("com.palladio_simulator.protocom.framework.port.IPort<" + _fqnInterface);
    String _plus_1 = (_plus + ">");
    OperationInterface _providedInterface__OperationProvidedRole = ((OperationProvidedRole) this.pcmEntity).getProvidedInterface__OperationProvidedRole();
    String _fqn = JavaNames.fqn(_providedInterface__OperationProvidedRole);
    return Collections.<String>unmodifiableList(Lists.<String>newArrayList(_plus_1, _fqn, JavaConstants.RMI_REMOTE_INTERFACE, JavaConstants.SERIALIZABLE_INTERFACE));
  }
  
  public Collection<? extends IJMethod> constructors() {
    JMethod _jMethod = new JMethod();
    OperationInterface _providedInterface__OperationProvidedRole = ((OperationProvidedRole) this.pcmEntity).getProvidedInterface__OperationProvidedRole();
    String _fqn = JavaNames.fqn(_providedInterface__OperationProvidedRole);
    String _plus = (_fqn + " myInnerPort, ");
    InterfaceProvidingEntity _providingEntity_ProvidedRole = this.pcmEntity.getProvidingEntity_ProvidedRole();
    String _fqnInterface = JavaNames.fqnInterface(_providingEntity_ProvidedRole);
    String _plus_1 = (_plus + _fqnInterface);
    String _plus_2 = (_plus_1 + " myComponent, String assemblyContext");
    JMethod _withParameters = _jMethod.withParameters(_plus_2);
    JMethod _withThrows = _withParameters.withThrows(JavaConstants.RMI_REMOTE_EXCEPTION);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.myInnerPort = myInnerPort;");
    _builder.newLine();
    _builder.append("this.myCompositeComponent = myComponent;");
    _builder.newLine();
    _builder.append("com.palladio_simulator.protocom.framework.registry.RmiRegistry.registerPort(com.palladio_simulator.protocom.framework.registry.RmiRegistry.getRemoteAddress(),");
    _builder.newLine();
    _builder.append("com.palladio_simulator.protocom.framework.registry.RmiRegistry.getRegistryPort(), this, \"");
    String _portClassName = JavaNames.portClassName(this.pcmEntity);
    _builder.append(_portClassName, "");
    _builder.append("_\" + assemblyContext);");
    _builder.newLineIfNotEmpty();
    JMethod _withImplementation = _withThrows.withImplementation(_builder.toString());
    return Collections.<JMethod>unmodifiableList(Lists.<JMethod>newArrayList(_withImplementation));
  }
  
  public Collection<? extends IJMethod> methods() {
    LinkedList<JMethod> _xblockexpression = null;
    {
      final LinkedList<JMethod> results = CollectionLiterals.<JMethod>newLinkedList();
      List<JMethod> _providedRoleMethods = this.providedRoleMethods(this.pcmEntity);
      Iterables.<JMethod>addAll(results, _providedRoleMethods);
      JMethod _jMethod = new JMethod();
      JMethod _withName = _jMethod.withName("setContext");
      JMethod _withParameters = _withName.withParameters("Object myContext");
      JMethod _withThrows = _withParameters.withThrows(JavaConstants.RMI_REMOTE_EXCEPTION);
      JMethod _withImplementation = _withThrows.withImplementation("myCompositeComponent.setContext(myContext);");
      JMethod _jMethod_1 = new JMethod();
      JMethod _withName_1 = _jMethod_1.withName("setComponentFrame");
      String _stackframeParameterList = PcmCommons.stackframeParameterList();
      JMethod _withParameters_1 = _withName_1.withParameters(_stackframeParameterList);
      JMethod _withThrows_1 = _withParameters_1.withThrows(JavaConstants.RMI_REMOTE_EXCEPTION);
      JMethod _withImplementation_1 = _withThrows_1.withImplementation("");
      JMethod _jMethod_2 = new JMethod();
      JMethod _withName_2 = _jMethod_2.withName("getComponent");
      InterfaceProvidingEntity _providingEntity_ProvidedRole = this.pcmEntity.getProvidingEntity_ProvidedRole();
      String _fqnInterface = JavaNames.fqnInterface(_providingEntity_ProvidedRole);
      JMethod _withReturnType = _withName_2.withReturnType(_fqnInterface);
      JMethod _withThrows_2 = _withReturnType.withThrows(JavaConstants.RMI_REMOTE_EXCEPTION);
      JMethod _withImplementation_2 = _withThrows_2.withImplementation("return myCompositeComponent;");
      Iterables.<JMethod>addAll(results, Collections.<JMethod>unmodifiableList(Lists.<JMethod>newArrayList(_withImplementation, _withImplementation_1, _withImplementation_2)));
      _xblockexpression = (results);
    }
    return _xblockexpression;
  }
  
  public String filePath() {
    String _fqnPortPackage = JavaNames.fqnPortPackage(this.pcmEntity);
    String _fqnToDirectoryPath = JavaNames.fqnToDirectoryPath(_fqnPortPackage);
    String _plus = (_fqnToDirectoryPath + "/");
    String _portClassName = JavaNames.portClassName(this.pcmEntity);
    String _plus_1 = (_plus + _portClassName);
    String _plus_2 = (_plus_1 + ".java");
    return _plus_2;
  }
  
  protected List<JMethod> _providedRoleMethods(final OperationProvidedRole role) {
    OperationInterface _providedInterface__OperationProvidedRole = role.getProvidedInterface__OperationProvidedRole();
    EList<OperationSignature> _signatures__OperationInterface = _providedInterface__OperationProvidedRole.getSignatures__OperationInterface();
    final Function1<OperationSignature,JMethod> _function = new Function1<OperationSignature,JMethod>() {
        public JMethod apply(final OperationSignature it) {
          JMethod _jMethod = new JMethod();
          String _javaSignature = JavaNames.javaSignature(it);
          JMethod _withName = _jMethod.withName(_javaSignature);
          String _stackframeType = PcmCommons.stackframeType();
          JMethod _withReturnType = _withName.withReturnType(_stackframeType);
          String _stackContextParameterList = PcmCommons.stackContextParameterList();
          JMethod _withParameters = _withReturnType.withParameters(_stackContextParameterList);
          String _javaSignature_1 = JavaNames.javaSignature(it);
          String _plus = ("return myInnerPort." + _javaSignature_1);
          String _plus_1 = (_plus + "(ctx);");
          JMethod _withImplementation = _withParameters.withImplementation(_plus_1);
          JMethod _withThrows = _withImplementation.withThrows(JavaConstants.RMI_REMOTE_EXCEPTION);
          return _withThrows;
        }
      };
    List<JMethod> _map = ListExtensions.<OperationSignature, JMethod>map(_signatures__OperationInterface, _function);
    return _map;
  }
  
  protected List<JMethod> _providedRoleMethods(final InfrastructureProvidedRole role) {
    InfrastructureInterface _providedInterface__InfrastructureProvidedRole = role.getProvidedInterface__InfrastructureProvidedRole();
    EList<InfrastructureSignature> _infrastructureSignatures__InfrastructureInterface = _providedInterface__InfrastructureProvidedRole.getInfrastructureSignatures__InfrastructureInterface();
    final Function1<InfrastructureSignature,JMethod> _function = new Function1<InfrastructureSignature,JMethod>() {
        public JMethod apply(final InfrastructureSignature it) {
          JMethod _jMethod = new JMethod();
          String _javaSignature = JavaNames.javaSignature(it);
          JMethod _withName = _jMethod.withName(_javaSignature);
          String _stackframeType = PcmCommons.stackframeType();
          JMethod _withReturnType = _withName.withReturnType(_stackframeType);
          String _stackContextParameterList = PcmCommons.stackContextParameterList();
          JMethod _withParameters = _withReturnType.withParameters(_stackContextParameterList);
          JMethod _withImplementation = _withParameters.withImplementation("return null;");
          JMethod _withThrows = _withImplementation.withThrows(JavaConstants.RMI_REMOTE_EXCEPTION);
          return _withThrows;
        }
      };
    List<JMethod> _map = ListExtensions.<InfrastructureSignature, JMethod>map(_infrastructureSignatures__InfrastructureInterface, _function);
    return _map;
  }
  
  public List<JMethod> providedRoleMethods(final ProvidedRole role) {
    if (role instanceof InfrastructureProvidedRole) {
      return _providedRoleMethods((InfrastructureProvidedRole)role);
    } else if (role instanceof OperationProvidedRole) {
      return _providedRoleMethods((OperationProvidedRole)role);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(role).toString());
    }
  }
}