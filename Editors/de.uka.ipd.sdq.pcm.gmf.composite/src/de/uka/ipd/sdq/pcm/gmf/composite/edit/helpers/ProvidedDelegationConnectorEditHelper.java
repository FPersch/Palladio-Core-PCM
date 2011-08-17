/*
 *Copyright 2007, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.composite.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import de.uka.ipd.sdq.pcm.core.composition.ProvidedDelegationConnector;
import de.uka.ipd.sdq.pcm.core.entity.EntityPackage;

/**
 * @generated not
 */
public class ProvidedDelegationConnectorEditHelper extends
		PalladioComponentModelBaseEditHelper {

	@Override
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		ProvidedDelegationConnector con = (ProvidedDelegationConnector) req
				.getElementToConfigure();
		String name = "ProvDelegation ";
		name += con.getOuterProvidedRole_ProvidedDelegationConnector() == null ? ""
				: con.getOuterProvidedRole_ProvidedDelegationConnector()
						.getEntityName();
		name += " -> ";
		name += con.getInnerProvidedRole_ProvidedDelegationConnector() == null ? ""
				: con.getInnerProvidedRole_ProvidedDelegationConnector()
						.getEntityName();

		ICommand cmd2 = new SetValueCommand(new SetRequest(req
				.getElementToConfigure(), EntityPackage.eINSTANCE
				.getNamedElement_EntityName(), name));
		return cmd2;
	}
}