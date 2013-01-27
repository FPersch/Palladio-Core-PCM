/*
 * Copyright 2009, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.resource.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.allocation.provider.AllocationItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.core.composition.provider.CompositionItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.core.entity.provider.EntityItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.core.provider.CoreItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.gmf.resource.edit.policies.PalladioComponentModelBaseItemSemanticEditPolicy;
import de.uka.ipd.sdq.pcm.gmf.resource.providers.ElementInitializers;
import de.uka.ipd.sdq.pcm.parameter.provider.ParameterItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.protocol.provider.ProtocolItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.provider.PcmItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.qosannotations.provider.QosannotationsItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.reliability.provider.ReliabilityItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.repository.provider.RepositoryItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.resourceenvironment.provider.ResourceenvironmentItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.resourcetype.provider.ResourcetypeItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.seff.provider.SeffItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.subsystem.provider.SubsystemItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.system.provider.SystemItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcm.usagemodel.provider.UsagemodelItemProviderAdapterFactory;
import de.uka.ipd.sdq.pcmbench.ui.provider.PalladioItemProviderAdapterFactory;
import de.uka.ipd.sdq.probfunction.provider.ProbfunctionItemProviderAdapterFactory;
import de.uka.ipd.sdq.stoex.provider.StoexItemProviderAdapterFactory;
import de.uka.ipd.sdq.units.provider.UnitsItemProviderAdapterFactory;

/**
 * @generated
 */
public class PalladioComponentModelDiagramEditorPlugin extends AbstractUIPlugin {

    /**
     * @generated
     */
    public static final String ID = "de.uka.ipd.sdq.pcm.gmf.resource"; //$NON-NLS-1$

    /**
     * @generated
     */
    public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(ID);

    /**
     * @generated
     */
    private static PalladioComponentModelDiagramEditorPlugin instance;

    /**
     * @generated not
     */
    private AdapterFactory adapterFactory;

    /**
     * @generated
     */
    private PalladioComponentModelDocumentProvider documentProvider;

    /**
     * @generated
     */
    private PalladioComponentModelBaseItemSemanticEditPolicy.LinkConstraints linkConstraints;

    /**
     * @generated
     */
    private ElementInitializers initializers;

    /**
     * @generated
     */
    public PalladioComponentModelDiagramEditorPlugin() {
    }

    /**
     * @generated
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        instance = this;
        PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT, getPreferenceStore());
        adapterFactory = createAdapterFactory();
    }

    /**
     * @generated not
     * @param context
     *            a BundleContext
     * @throws Exception
     *             some Exception
     */
    public void stop(BundleContext context) throws Exception {
        ((PalladioItemProviderAdapterFactory) adapterFactory).dispose();
        adapterFactory = null;
        instance = null;
        super.stop(context);
    }

    /**
     * @generated
     */
    public static PalladioComponentModelDiagramEditorPlugin getInstance() {
        return instance;
    }

    /**
     * @generated not
     * 
     * @return a PalladioItemProviderAdapterFactory
     */
    protected AdapterFactory createAdapterFactory() {
        List factories = new ArrayList();
        fillItemProviderFactories(factories);
        ComposedAdapterFactory caf = new ComposedAdapterFactory(factories) {

            @Override
            public ComposeableAdapterFactory getRootAdapterFactory() {
                // TODO Auto-generated method stub
                return (PalladioItemProviderAdapterFactory) adapterFactory;
            }

        };
        return new PalladioItemProviderAdapterFactory(caf);
    }

    /**
     * @generated
     */
    protected void fillItemProviderFactories(List<AdapterFactory> factories) {
        factories.add(new PcmItemProviderAdapterFactory());
        factories.add(new CoreItemProviderAdapterFactory());
        factories.add(new EntityItemProviderAdapterFactory());
        factories.add(new CompositionItemProviderAdapterFactory());
        factories.add(new UsagemodelItemProviderAdapterFactory());
        factories.add(new RepositoryItemProviderAdapterFactory());
        factories.add(new ResourcetypeItemProviderAdapterFactory());
        factories.add(new ProtocolItemProviderAdapterFactory());
        factories.add(new ParameterItemProviderAdapterFactory());
        factories.add(new ReliabilityItemProviderAdapterFactory());
        factories.add(new SeffItemProviderAdapterFactory());
        factories
                .add(new de.uka.ipd.sdq.pcm.seff.seff_performance.provider.SeffPerformanceItemProviderAdapterFactory());
        factories
                .add(new de.uka.ipd.sdq.pcm.seff.seff_reliability.provider.SeffReliabilityItemProviderAdapterFactory());
        factories.add(new QosannotationsItemProviderAdapterFactory());
        factories
                .add(new de.uka.ipd.sdq.pcm.qosannotations.qos_performance.provider.QosPerformanceItemProviderAdapterFactory());
        factories
                .add(new de.uka.ipd.sdq.pcm.qosannotations.qos_reliability.provider.QosReliabilityItemProviderAdapterFactory());
        factories.add(new SystemItemProviderAdapterFactory());
        factories.add(new ResourceenvironmentItemProviderAdapterFactory());
        factories.add(new AllocationItemProviderAdapterFactory());
        factories.add(new SubsystemItemProviderAdapterFactory());
        factories.add(new IdentifierItemProviderAdapterFactory());
        factories.add(new ProbfunctionItemProviderAdapterFactory());
        factories.add(new StoexItemProviderAdapterFactory());
        factories.add(new UnitsItemProviderAdapterFactory());
        factories.add(new ResourceItemProviderAdapterFactory());
        factories.add(new ReflectiveItemProviderAdapterFactory());
    }

    /**
     * @generated
     */
    public AdapterFactory getItemProvidersAdapterFactory() {
        return adapterFactory;
    }

    /**
     * @generated
     */
    public ImageDescriptor getItemImageDescriptor(Object item) {
        IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(item, IItemLabelProvider.class);
        if (labelProvider != null) {
            return ExtendedImageRegistry.getInstance().getImageDescriptor(labelProvider.getImage(item));
        }
        return null;
    }

    /**
     * @generated
     */
    public static ImageDescriptor getBundledImageDescriptor(String path) {
        return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
    }

    /**
     * @generated
     */
    public static ImageDescriptor findImageDescriptor(String path) {
        final IPath p = new Path(path);
        if (p.isAbsolute() && p.segmentCount() > 1) {
            return AbstractUIPlugin.imageDescriptorFromPlugin(p.segment(0), p.removeFirstSegments(1).makeAbsolute()
                    .toString());
        } else {
            return getBundledImageDescriptor(p.makeAbsolute().toString());
        }
    }

    /**
     * @generated
     */
    public Image getBundledImage(String path) {
        Image image = getImageRegistry().get(path);
        if (image == null) {
            getImageRegistry().put(path, getBundledImageDescriptor(path));
            image = getImageRegistry().get(path);
        }
        return image;
    }

    /**
     * @generated
     */
    public static String getString(String key) {
        return Platform.getResourceString(getInstance().getBundle(), "%" + key); //$NON-NLS-1$
    }

    /**
     * @generated
     */
    public PalladioComponentModelDocumentProvider getDocumentProvider() {
        if (documentProvider == null) {
            documentProvider = new PalladioComponentModelDocumentProvider();
        }
        return documentProvider;
    }

    /**
     * @generated
     */
    public PalladioComponentModelBaseItemSemanticEditPolicy.LinkConstraints getLinkConstraints() {
        return linkConstraints;
    }

    /**
     * @generated
     */
    public void setLinkConstraints(PalladioComponentModelBaseItemSemanticEditPolicy.LinkConstraints lc) {
        this.linkConstraints = lc;
    }

    /**
     * @generated
     */
    public ElementInitializers getElementInitializers() {
        return initializers;
    }

    /**
     * @generated
     */
    public void setElementInitializers(ElementInitializers i) {
        this.initializers = i;
    }

    /**
     * @generated
     */
    public void logError(String error) {
        logError(error, null);
    }

    /**
     * @generated
     */
    public void logError(String error, Throwable throwable) {
        if (error == null && throwable != null) {
            error = throwable.getMessage();
        }
        getLog().log(
                new Status(IStatus.ERROR, PalladioComponentModelDiagramEditorPlugin.ID, IStatus.OK, error, throwable));
        debug(error, throwable);
    }

    /**
     * @generated
     */
    public void logInfo(String message) {
        logInfo(message, null);
    }

    /**
     * @generated
     */
    public void logInfo(String message, Throwable throwable) {
        if (message == null && throwable != null) {
            message = throwable.getMessage();
        }
        getLog().log(
                new Status(IStatus.INFO, PalladioComponentModelDiagramEditorPlugin.ID, IStatus.OK, message, throwable));
        debug(message, throwable);
    }

    /**
     * @generated
     */
    private void debug(String message, Throwable throwable) {
        if (!isDebugging()) {
            return;
        }
        if (message != null) {
            System.err.println(message);
        }
        if (throwable != null) {
            throwable.printStackTrace();
        }
    }
}
