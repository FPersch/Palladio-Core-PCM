package de.uka.ipd.sdq.pcmsolver.transformations.pcm2lqn;

import java.math.BigInteger;

import org.antlr.runtime.RecognitionException;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import LqnCore.ActivityDefType;
import LqnCore.ActivityMakingCallType;
import LqnCore.ActivityOrType;
import LqnCore.ActivityType;
import LqnCore.EntryType;
import LqnCore.PrecedenceType;
import LqnCore.ProcessorType;
import LqnCore.TaskSchedulingType;
import LqnCore.TaskType;
import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.core.PCMRandomVariable;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.ProvidesComponentType;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;
import de.uka.ipd.sdq.pcm.usagemodel.Branch;
import de.uka.ipd.sdq.pcm.usagemodel.BranchTransition;
import de.uka.ipd.sdq.pcm.usagemodel.ClosedWorkload;
import de.uka.ipd.sdq.pcm.usagemodel.Delay;
import de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall;
import de.uka.ipd.sdq.pcm.usagemodel.Loop;
import de.uka.ipd.sdq.pcm.usagemodel.OpenWorkload;
import de.uka.ipd.sdq.pcm.usagemodel.ScenarioBehaviour;
import de.uka.ipd.sdq.pcm.usagemodel.Start;
import de.uka.ipd.sdq.pcm.usagemodel.Stop;
import de.uka.ipd.sdq.pcm.usagemodel.UsageModel;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.pcm.usagemodel.util.UsagemodelSwitch;
import de.uka.ipd.sdq.pcmsolver.transformations.ContextWrapper;
import de.uka.ipd.sdq.pcmsolver.visitors.EMFHelper;
import de.uka.ipd.sdq.probfunction.math.ManagedPMF;
import de.uka.ipd.sdq.probfunction.math.exception.StringNotPDFException;

public class UsageModel2Lqn extends UsagemodelSwitch {

	private static Logger logger = Logger.getLogger(UsageModel2Lqn.class
			.getName());

	private ContextWrapper contextWrapper;
	private LqnBuilder lqnBuilder;

	public UsageModel2Lqn(LqnBuilder aLqnBuilder, ContextWrapper ctxWrp) {
		lqnBuilder = aLqnBuilder;
		contextWrapper = ctxWrp;
	}

	@Override
	public Object caseUsageModel(UsageModel usageModel) {
		EList<UsageScenario> scenList = usageModel
				.getUsageScenario_UsageModel();
		for (UsageScenario us : scenList) {
			doSwitch(us);
		}
		return null;
	}

	@Override
	public Object caseUsageScenario(UsageScenario object) {
		doSwitch(object.getWorkload_UsageScenario());
		doSwitch(object.getScenarioBehaviour_UsageScenario());

		// Generating a reply leads to an error, therefore commented out:				
		//		ReplyActivityType rat = lqnFactory.createReplyActivityType();
		//		rat.setName((String)doSwitch(object.getScenarioBehaviour_UsageScenario()));
		//
		//		ReplyEntryType ret = lqnFactory.createReplyEntryType();
		//		ret.setName(object.getEntityName()+"_Entry"); // TODO
		//		ret.getReplyActivity().add(rat);
		//		
		//		taskActivityGraph.getReplyEntry().add(ret);

		return null;
	}

	@Override
	public Object caseClosedWorkload(ClosedWorkload closedWorkload) {
		UsageScenario us = (UsageScenario) closedWorkload.eContainer();
		String id = Pcm2LqnHelper.getIdForUsageScenario(us);
		
		ProcessorType pt = lqnBuilder.addProcessor(id);

		TaskType tt = lqnBuilder.addTask(id,pt);
		String population = new Integer(closedWorkload.getPopulation())
				.toString();
		PCMRandomVariable thinkTime = closedWorkload
				.getThinkTime_ClosedWorkload();
		tt.setMultiplicity(new BigInteger(population));
		tt.setThinkTime(thinkTime.getSpecification());
		tt.setScheduling(TaskSchedulingType.REF);

		EntryType et = lqnBuilder.addEntry(id,tt);
		lqnBuilder.addOutputEntryDistributionType(et);
		lqnBuilder.addTaskActivityGraph(tt);

		return null;
	}

	@Override
	public Object caseOpenWorkload(OpenWorkload openWorkload) {
		UsageScenario us = (UsageScenario) openWorkload.eContainer();
		String id = Pcm2LqnHelper.getIdForUsageScenario(us);
		
		ProcessorType pt = lqnBuilder.addProcessor(id);
		TaskType tt = lqnBuilder.addTask(id,pt);

		EntryType et = lqnBuilder.addEntry(id,tt);
		String arrivalRate = openWorkload.getInterArrivalTime_OpenWorkload()
				.getSpecification();
		et.setOpenArrivalRate(arrivalRate);

		lqnBuilder.addTaskActivityGraph(tt);

		return null;
	}

	@Override
	public Object caseScenarioBehaviour(ScenarioBehaviour object) {
		return doSwitch(getStartAction(object));
	}

	@Override
	public Object caseStart(Start object) {
		String id = Pcm2LqnHelper.getId(object, contextWrapper);
		String entryId = "";
		
		if (object.eContainer().eContainer() instanceof UsageScenario) {
			UsageScenario us = (UsageScenario) object.eContainer().eContainer();
			ActivityDefType adt = lqnBuilder.addActivityDef(id);
			entryId = Pcm2LqnHelper.getIdForUsageScenario(us)+"_Entry";
			adt.setBoundToEntry(entryId);
		} else if (object.eContainer().eContainer() instanceof Loop){
			Loop loop = (Loop)object.eContainer().eContainer();
			ActivityDefType adt = lqnBuilder.addActivityDef(id);
			entryId = Pcm2LqnHelper.getId(loop, contextWrapper)+"_Entry";
			adt.setBoundToEntry(entryId);
		} else { //nested scenario behaviour
			lqnBuilder.addActivityDef(id);
		}

		String successorId = (String) doSwitch(object.getSuccessor());
		lqnBuilder.addSequencePrecedence(id, successorId);

		if (entryId.equals("")) return id;
		else return entryId;
	}

	@Override
	public Object caseStop(Stop object) {
		String id = Pcm2LqnHelper.getId(object, contextWrapper);
		lqnBuilder.addActivityDef(id);
		return id;
	}

	@Override
	public Object caseEntryLevelSystemCall(EntryLevelSystemCall object) {
		String id = Pcm2LqnHelper.getId(object, contextWrapper);
		
		contextWrapper = contextWrapper.getContextWrapperFor(object);

		ProvidesComponentType offeringComponent = contextWrapper.getAssCtx()
				.getEncapsulatedComponent_ChildComponentContext();

		String entryId = "";
		if (offeringComponent instanceof BasicComponent) {
			ServiceEffectSpecification seff = contextWrapper
					.getNextSEFF(object);
			Rdseff2Lqn seffVisitor = new Rdseff2Lqn(lqnBuilder, contextWrapper);
			try {
				entryId = (String) seffVisitor
						.doSwitch((ResourceDemandingSEFF) seff);
			} catch (Exception e) {
				logger.error("Error while visiting RDSEFF");
				e.printStackTrace();
			}
		} else {
			logger.error("Composite Component type not yet supported.");
			throw new UnsupportedOperationException();
		}

		lqnBuilder.addActivityDef(id);
		lqnBuilder.addActivityMakingCall(id, entryId);

		String successorId = (String) doSwitch(object.getSuccessor());
		lqnBuilder.addSequencePrecedence(id, successorId);

		return id;
	}

	@Override
	public Object caseDelay(Delay object) {
		String id = Pcm2LqnHelper.getId(object, contextWrapper);
		
		ActivityDefType adt = lqnBuilder.addActivityDef(id);
		adt.setThinkTime(object.getTimeSpecification_Delay()
						.getSpecification());

		String successorId = (String) doSwitch(object.getSuccessor());
		lqnBuilder.addSequencePrecedence(id, successorId);

		return id;
	}

	public Object caseBranch(Branch object) {
		String id = Pcm2LqnHelper.getId(object, contextWrapper);
		
		lqnBuilder.addActivityDef(id);
		PrecedenceType ptBegin = lqnBuilder.addBeginBranchPrecedence(id);
		PrecedenceType ptEnd = lqnBuilder.addEndBranchPrecedence();

		EList<BranchTransition> btList = object.getBranchTransitions_Branch();
		for (BranchTransition bt : btList) {
			ScenarioBehaviour sb = bt.getBranchedBehaviour_BranchTransition();

			String startId = (String) doSwitch(sb);
			String branchProb = new Double(bt.getBranchProbability())
					.toString();
			lqnBuilder.addActivityOrType(startId,branchProb,ptBegin);

			String stopId = Pcm2LqnHelper.getId(getStopAction(sb), contextWrapper);
			lqnBuilder.addActivityType(stopId, ptEnd);
		}

		String successorId = (String) doSwitch(object.getSuccessor());
		ptEnd.getPost().getActivity().setName(successorId);

		return id;
	}

	@Override
	public Object caseLoop(Loop object) {
		String id = Pcm2LqnHelper.getId(object, contextWrapper);
		
		String startId = handleLoopBody(object,id); // creates a new task/processor

		lqnBuilder.addActivityDef(id); // for the loop action
		// makes an external call to the task representing the loop body:
		ActivityMakingCallType amct = lqnBuilder.addActivityMakingCall(id,
				startId);
		amct.setCallsMean(getLoopIterations(object));

		String successorId = (String) doSwitch(object.getSuccessor());
		lqnBuilder.addSequencePrecedence(id, successorId);

		return id;
	}

	private String handleLoopBody(Loop loop, String id) {
		ProcessorType pt = lqnBuilder.addProcessor(id);
		TaskType tt = lqnBuilder.addTask(id,pt);
		//tt.setScheduling(TaskSchedulingType.INF);
		
		EntryType et = lqnBuilder.addEntry(id,tt);
		lqnBuilder.addTaskActivityGraph(tt);

		ScenarioBehaviour sb = loop.getBodyBehaviour_Loop();
		String startId = (String) doSwitch(getStartAction(sb));
		String stopId = Pcm2LqnHelper.getId(getStopAction(sb), contextWrapper);
		lqnBuilder.addReplyActivity(id, startId, stopId);
		
		lqnBuilder.restoreFormerTaskActivityGraph();
		
		return startId;
	}

	private String getLoopIterations(Loop object) {
		ManagedPMF pmf = null;
		try {
			pmf = ManagedPMF.createFromString(object.getLoopIteration_Loop()
					.getSpecification());
		} catch (StringNotPDFException e) {
			e.printStackTrace();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		if (pmf != null) {
			return pmf.getExpectedValue().toString();
		} else {
			return "0.0";
		}
	}

	private Stop getStopAction(ScenarioBehaviour object) {
		Stop stopAction = (Stop) EMFHelper.getObjectByType(object
				.getActions_ScenarioBehaviour(), Stop.class);
		return stopAction;
	}

	private Start getStartAction(ScenarioBehaviour object) {
		Start startAction = (Start) EMFHelper.getObjectByType(object
				.getActions_ScenarioBehaviour(), Start.class);
		return startAction;
	}
}
