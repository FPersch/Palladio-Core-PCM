package de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import de.uka.ipd.sdq.workflow.IJob;
import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.RollbackFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.workflow.pcm.configurations.AbstractCodeGenerationWorkflowRunConfiguration;
import de.uka.ipd.sdq.workflow.pcm.jobs.CreatePluginProjectJob;

public abstract class AbstractCreateMetaDataFilesJob {

	protected AbstractCodeGenerationWorkflowRunConfiguration configuration;
	public static final String F_MANIFEST = "MANIFEST.MF";
	public static final String F_MANIFEST_FP = "META-INF/" + F_MANIFEST;
	public static final String F_PLUGIN = "plugin.xml";
	public static final String F_FRAGMENT = "fragment.xml";
	public static final String F_PROPERTIES = ".properties";
	public static final String F_BUILD = "build" + F_PROPERTIES;

	public AbstractCreateMetaDataFilesJob() {
		super();
	}

	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
				IProject project = CreatePluginProjectJob.getProject(configuration.getStoragePluginID());
				
				try {
					createPluginXml(project);
					createManifestMf(project);
					createBuildProperties(project);
				} catch (CoreException e) {
					throw new JobFailedException("Failed to create plugin metadata files",e);
				}
			}

	public String getName() {
		return "Create SimuCom Metadata Files";
	}

	public void rollback(IProgressMonitor monitor) throws RollbackFailedException {
		// Nothing to do
	}

	private void createPluginXml(IProject project) throws CoreException {
	
		ByteArrayOutputStream baos;
		PrintStream out;
	
		baos = new ByteArrayOutputStream();
		out = new PrintStream(baos);
	
		
		writePluginXmlContent(out);
		
		out.close();
	
		IFile pluginXml = project.getFile(F_PLUGIN);
		if (!pluginXml.exists())
			pluginXml.create(new ByteArrayInputStream(baos.toByteArray()),
					true, null);
	}

	protected abstract void writePluginXmlContent(PrintStream out);

	private void createBuildProperties(IProject project) throws CoreException {
	
		ByteArrayOutputStream baos;
		PrintStream out;
	
		baos = new ByteArrayOutputStream();
		out = new PrintStream(baos);
	
		writeBuildPropertiesContent(out);
		
		out.close();
	
		IFile buildProperties = project.getFile(F_BUILD);
		if (!buildProperties.exists())
			buildProperties.create(
					new ByteArrayInputStream(baos.toByteArray()), true, null);
	}

	protected abstract void writeBuildPropertiesContent(PrintStream out);
	

	private void createManifestMf(IProject project) throws CoreException {
	
		ByteArrayOutputStream baos;
		PrintStream out;
	
		baos = new ByteArrayOutputStream();
		out = new PrintStream(baos);
	
		out.println("Manifest-Version: 1.0"); //$NON-NLS-1$
		out.println("Bundle-ManifestVersion: 2"); //$NON-NLS-1$
		out.println("Bundle-Name: SimuCom Instance Plug-in"); //$NON-NLS-1$
		out.println("Bundle-SymbolicName: " + project.getName() + ";singleton:=true"); //$NON-NLS-1$
		out.println("Bundle-Version: 1.0.0"); //$NON-NLS-1$
		out.println("Bundle-Activator: " + getBundleActivator());
		
		out.print("Require-Bundle: ");
		
		out.println(StringUtils.join(getRequiredBundles(), ",\n "));
		
	
		
		out.println("Eclipse-LazyStart: true"); //$NON-NLS-1$
		out.println("Bundle-ClassPath: bin/,");
		out.println(" .");
		//out.println("Export-Package: main");
		
		out.close();
	
		IFile manifestMf = project.getFile(F_MANIFEST_FP);
		if (!manifestMf.exists())
			manifestMf.create(new ByteArrayInputStream(baos.toByteArray()),
					true, null);
	}

	protected abstract String[] getRequiredBundles();
	
	protected abstract String getBundleActivator();

}