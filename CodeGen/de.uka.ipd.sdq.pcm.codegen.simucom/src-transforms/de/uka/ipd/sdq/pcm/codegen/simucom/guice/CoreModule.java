package de.uka.ipd.sdq.pcm.codegen.simucom.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import de.uka.ipd.sdq.pcm.codegen.simucom.helper.M2TFileSystemAccess;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.AllocationXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.BuildXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.CalculatorsXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.CallsXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.CompletionsXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.ComposedStructureXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.ContextPatternXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.DataTypesXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.DelegatorClassXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.DummiesXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.JavaCoreXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.JavaNamesExt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.PCMext;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.ProvidedPortsXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.RepositoryXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.ResourcesXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.SEFFBodyXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.SensorsExt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.SensorsXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.SystemXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.UsageXpt;
import de.uka.ipd.sdq.pcm.codegen.simucom.transformations.UserActionsXpt;

public class CoreModule extends AbstractModule {
    private M2TFileSystemAccess fsa;

    public CoreModule(String rootDirectory) {
        this.fsa = new M2TFileSystemAccess(rootDirectory);
    }

    @Override
    protected void configure() {
        bind(M2TFileSystemAccess.class).toInstance(fsa);

        /*
         * These two bindings are not used in the current version of the xtend transformations.
         * TracingAPI and ModuleFactore are classes from edu.kit.ipd.sdq.xtend2m which cover the use
         * of active annotations such as @ModelIn or @TransformationInterface If you wan to use
         * those annotations, add the project to the Manifest and remove "//" for the following two
         * bindings
         */
        // Bind modules needed for active annotations first
        // bind(TracingAPI.class).toInstance(TracingAPI.INSTANCE);
        // bind(ModuleFactory.class).to(MultiplePackageFactory.class);

        // load all the base classes of the modules
        bind(AllocationXpt.class).in(Singleton.class);
        bind(BuildXpt.class).in(Singleton.class);
        bind(CalculatorsXpt.class).in(Singleton.class);
        bind(CallsXpt.class).in(Singleton.class);
        bind(CompletionsXpt.class).in(Singleton.class);
        bind(ComposedStructureXpt.class).in(Singleton.class);
        bind(ContextPatternXpt.class).in(Singleton.class);
        bind(DataTypesXpt.class).in(Singleton.class);
        bind(DelegatorClassXpt.class).in(Singleton.class);
        bind(DummiesXpt.class).in(Singleton.class);
        bind(JavaCoreXpt.class).in(Singleton.class);
        bind(JavaNamesExt.class).in(Singleton.class);
        bind(PCMext.class).in(Singleton.class);
        bind(ProvidedPortsXpt.class).in(Singleton.class);
        bind(RepositoryXpt.class).in(Singleton.class);
        bind(ResourcesXpt.class).in(Singleton.class);
        bind(SEFFBodyXpt.class).in(Singleton.class);
        bind(SensorsExt.class).in(Singleton.class);
        bind(SensorsXpt.class).in(Singleton.class);
        bind(SystemXpt.class).in(Singleton.class);
        bind(UsageXpt.class).in(Singleton.class);
        bind(UserActionsXpt.class).in(Singleton.class);
    }
}
