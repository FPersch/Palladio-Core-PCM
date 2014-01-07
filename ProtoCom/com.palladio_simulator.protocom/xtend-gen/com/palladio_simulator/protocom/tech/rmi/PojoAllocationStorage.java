package com.palladio_simulator.protocom.tech.rmi;

import com.google.common.collect.Lists;
import com.palladio_simulator.protocom.lang.java.IJMethod;
import com.palladio_simulator.protocom.lang.java.impl.JMethod;
import com.palladio_simulator.protocom.lang.java.util.JavaNames;
import com.palladio_simulator.protocom.tech.rmi.PojoClass;
import de.uka.ipd.sdq.pcm.allocation.Allocation;
import de.uka.ipd.sdq.pcm.allocation.AllocationContext;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import java.util.Collection;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PojoAllocationStorage extends PojoClass<Allocation> {
  public PojoAllocationStorage(final Allocation pcmEntity) {
    super(pcmEntity);
  }
  
  public String superClass() {
    return "com.palladio_simulator.protocom.framework.AbstractAllocationStorage";
  }
  
  public String packageName() {
    return "ProtoComBootstrap";
  }
  
  public String compilationUnitName() {
    return "AllocationStorage";
  }
  
  public Collection<? extends IJMethod> methods() {
    JMethod _jMethod = new JMethod();
    JMethod _withName = _jMethod.withName("initContainerTemplate");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String container;");
    _builder.newLine();
    _builder.append("String containerId;");
    _builder.newLine();
    _builder.append("Class<?> component;");
    _builder.newLine();
    _builder.append("String assemblyContext;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<AllocationContext> _allocationContexts_Allocation = this.pcmEntity.getAllocationContexts_Allocation();
      for(final AllocationContext context : _allocationContexts_Allocation) {
        _builder.append("containerId = \"");
        ResourceContainer _resourceContainer_AllocationContext = context.getResourceContainer_AllocationContext();
        String _id = _resourceContainer_AllocationContext.getId();
        _builder.append(_id, "");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("container = \"");
        ResourceContainer _resourceContainer_AllocationContext_1 = context.getResourceContainer_AllocationContext();
        String _entityName = _resourceContainer_AllocationContext_1.getEntityName();
        _builder.append(_entityName, "");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("component = ");
        AssemblyContext _assemblyContext_AllocationContext = context.getAssemblyContext_AllocationContext();
        RepositoryComponent _encapsulatedComponent__AssemblyContext = _assemblyContext_AllocationContext.getEncapsulatedComponent__AssemblyContext();
        String _fqn = JavaNames.fqn(_encapsulatedComponent__AssemblyContext);
        _builder.append(_fqn, "");
        _builder.append(".class;");
        _builder.newLineIfNotEmpty();
        _builder.append("assemblyContext = \"");
        AssemblyContext _assemblyContext_AllocationContext_1 = context.getAssemblyContext_AllocationContext();
        String _id_1 = _assemblyContext_AllocationContext_1.getId();
        _builder.append(_id_1, "");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("saveContainerComponent(containerId, container, component, assemblyContext);");
        _builder.newLine();
      }
    }
    JMethod _withImplementation = _withName.withImplementation(_builder.toString());
    return Collections.<JMethod>unmodifiableList(Lists.<JMethod>newArrayList(_withImplementation));
  }
  
  public String filePath() {
    return "ProtoComBootstrap/AllocationStorage.java";
  }
}
