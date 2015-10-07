//package edu.kit.ipd.sdq.eventsim.workload.probespec.commands;
//
//import java.util.Set;
//
//import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
//import org.palladiosimulator.pcm.usagemodel.UsageScenario;
//
//import edu.kit.ipd.sdq.eventsim.command.ICommandExecutor;
//import edu.kit.ipd.sdq.eventsim.command.IPCMCommand;
//import edu.kit.ipd.sdq.eventsim.interpreter.listener.ITraversalListener;
//import edu.kit.ipd.sdq.eventsim.workload.command.usage.FindSystemCallsOfScenario;
//import edu.kit.ipd.sdq.eventsim.workload.interpreter.usage.UsageInterpreterConfiguration;
//import edu.kit.ipd.sdq.simcomp.component.IPCMModel;
//import edu.kit.ipd.sdq.simcomp.component.ISimulationMiddleware;
//import edu.kit.ipd.sdq.simcomp.persistence.factory.CalculatorBuilder;
//
///**
// * This command registers a {@link ITraversalListener} before and after each
// * {@link EntryLevelSystemCall}. The listeners take a {@link ProbeType#CURRENT_TIME} sample before
// * and after a call in order to enable the calculation of the call's response time.
// * 
// * @author Philipp Merkle
// * @author Christoph Föhrdes
// * 
// */
//public class MountSystemCallProbes implements IPCMCommand<Void> {
//
//    private final UsageInterpreterConfiguration interpreterConfig;
//	private ISimulationMiddleware middleware;
//    
//    public MountSystemCallProbes(UsageInterpreterConfiguration interpreterConfig, ISimulationMiddleware middleware) {
//        this.interpreterConfig = interpreterConfig;
//        this.middleware = middleware;
//    }
//    
//    /**
//     * {@inheritDoc}
//     */
//    @Override
//    public Void execute(IPCMModel pcm, ICommandExecutor<IPCMModel> executor) {
//        for (UsageScenario s : pcm.getUsageModel().getUsageScenario_UsageModel()) {
//            Set<EntryLevelSystemCall> calls = executor.execute(new FindSystemCallsOfScenario(s));
//            for (final EntryLevelSystemCall c : calls) {
//            	// //////////////////
//    			UsageProbeFactory f = new UsageProbeFactory(interpreterConfig);
//    			CalculatorBuilder.createBinary(new ResponseTimeCalculatorElsc()).from(f.probeFor(c, "before"))
//    					.to(f.probeFor(c, "after"));
//    			// //////////////////
//            	
//            	
////                this.interpreterConfig.addTraversalListener(c, new IUsageTraversalListener() {
////
////                    @Override
////                    public void before(AbstractUserAction action, User u, UserState state) {
////                        // take current time sample
////                        ProbeSpecContext probeSpecContext = middleware.getProbeSpecContext();
////                        probeSpecContext.getSampleBlackboard().addSample(
////                                ProbeSpecUtils.buildProbeSetSample(probeSpecContext.getProbeStrategyRegistry()
////                                        .getProbeStrategy(ProbeType.CURRENT_TIME, null).takeSample(c.getId(),
////                                                u.getModel().getSimulationControl()), u.getRequestContext(), c.getId(),
////                                        probeSpecContext.obtainProbeSetId(c.getId() + "_start")));
////                    }
////
////                    @Override
////                    public void after(AbstractUserAction action, User u, UserState state) {
////                        // take current time sample
////                        ProbeSpecContext probeSpecContext = middleware.getProbeSpecContext();
////                        probeSpecContext.getSampleBlackboard().addSample(
////                                ProbeSpecUtils.buildProbeSetSample(probeSpecContext.getProbeStrategyRegistry()
////                                        .getProbeStrategy(ProbeType.CURRENT_TIME, null).takeSample(c.getId(),
////                                                u.getModel().getSimulationControl()), u.getRequestContext(), c.getId(),
////                                        probeSpecContext.obtainProbeSetId(c.getId() + "_end")));
////                    }
////                });
//            }
//        }
//
//        // this command is not supposed to return a value
//        return null;
//    }
//
//    /**
//     * {@inheritDoc}
//     */
//    @Override
//    public boolean cachable() {
//        return false;
//    }
//
//}
