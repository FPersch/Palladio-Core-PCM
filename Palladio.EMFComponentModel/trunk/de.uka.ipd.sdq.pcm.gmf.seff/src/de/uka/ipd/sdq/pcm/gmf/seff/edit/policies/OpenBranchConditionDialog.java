package de.uka.ipd.sdq.pcm.gmf.seff.edit.policies;

import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.dialogs.stoex.StochasticExpressionEditDialog;
import de.uka.ipd.sdq.pcm.repository.Parameter;
import de.uka.ipd.sdq.pcm.seff.AbstractResourceDemandingAction;
import de.uka.ipd.sdq.pcm.seff.GuardedBranchTransition;
import de.uka.ipd.sdq.pcm.seff.LoopAction;
import de.uka.ipd.sdq.pcm.seff.ParametricResourceDemand;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.pcm.stochasticexpressions.PCMStoExPrettyPrintVisitor;
import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.StoexPackage;

// Manually written open policy to open the StoEx Dialog. It's
// called via a CustomBehaviour in the genmap
public class OpenBranchConditionDialog extends OpenStoExDialog {

	
	@Override
	protected RandomVariable getRandomVariable(EObject parent) {
		GuardedBranchTransition transition = (GuardedBranchTransition) parent;
		RandomVariable rv = transition.getBranchCondition_BranchTransition();
		return rv;
	}
}
