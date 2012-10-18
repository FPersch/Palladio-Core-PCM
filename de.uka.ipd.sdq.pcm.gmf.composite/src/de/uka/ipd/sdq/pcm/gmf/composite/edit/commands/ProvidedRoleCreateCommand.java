/*
 *Copyright 2007, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.composite.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uka.ipd.sdq.pcm.core.entity.InterfaceProvidingEntity;
import de.uka.ipd.sdq.pcm.repository.ProvidedRole;
import de.uka.ipd.sdq.pcm.repository.RepositoryFactory;

// TODO: decide whether this file is obsolete

/**
 * @generated
 */
public class ProvidedRoleCreateCommand extends EditElementCommand {

    /**
     * @generated
     */
    public ProvidedRoleCreateCommand(CreateElementRequest req) {
        super(req.getLabel(), null, req);
    }

    /**
     * @generated
     */
    protected EObject getElementToEdit() {
        EObject container = ((CreateElementRequest) getRequest()).getContainer();
        if (container instanceof View) {
            container = ((View) container).getElement();
        }
        return container;
    }

    /**
     * @generated
     */
    public boolean canExecute() {
        return true;

    }

    /**
     * @generated not
     */
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
        ProvidedRole newElement = RepositoryFactory.eINSTANCE.createOperationProvidedRole(); // change
                                                                                             // createProvidedRole
                                                                                             // to
                                                                                             // OperationProvidedRole
                                                                                             // to

        InterfaceProvidingEntity owner = (InterfaceProvidingEntity) getElementToEdit();
        owner.getProvidedRoles_InterfaceProvidingEntity().add(newElement);

        doConfigure(newElement, monitor, info);

        ((CreateElementRequest) getRequest()).setNewElement(newElement);
        return CommandResult.newOKCommandResult(newElement);
    }

    /**
     * @generated
     */
    protected void doConfigure(ProvidedRole newElement, IProgressMonitor monitor, IAdaptable info)
            throws ExecutionException {
        IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
        ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
        configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
        configureRequest.addParameters(getRequest().getParameters());
        ICommand configureCommand = elementType.getEditCommand(configureRequest);
        if (configureCommand != null && configureCommand.canExecute()) {
            configureCommand.execute(monitor, info);
        }
    }

}
