package org.palladiosimulator.protocom

import de.uka.ipd.sdq.workflow.jobs.JobFailedException
import org.apache.log4j.Logger
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.resources.ICommand
import org.eclipse.core.resources.IProjectDescription
import org.eclipse.jdt.core.JavaCore
import de.uka.ipd.sdq.workflow.pcm.configurations.AbstractCodeGenerationWorkflowRunConfiguration
import org.palladiosimulator.protocom.constants.ProtoComConstants;
import org.eclipse.core.runtime.CoreException
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.core.runtime.IPath
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.jdt.core.JavaModelException
import org.eclipse.pde.core.plugin.PluginRegistry
import org.eclipse.pde.internal.core.ClasspathComputer
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.resources.IMarker
import java.util.List
import org.eclipse.pde.core.plugin.IPluginModelBase

/**
 * TODO Modify JavaDoc
 * 
 * @author Sebastian Lehrig, Daria Giacinto
 */
class ProtoComProject {
	/** Logger for this class. */
	private static Logger logger = Logger.getLogger(ProtoComProject)
	
	private val IProgressMonitor monitor = new NullProgressMonitor()
	
	private val String projectURI
	private val String filePath
	private val IProject iProject
		
	private val AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice projectType
	private val String[] natures
	private val String[] builders
	
	private val IProjectDescription description
	
	
	new(String projectURI, String filePath, AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice projectType) {		
		this.projectURI = projectURI
		this.filePath = filePath
		this.iProject = createProject(projectURI, this.monitor)		
		this.projectType = projectType
		this.natures = createNatures()
		this.builders = createBuilders()
		
		this.description = createDescription()		
		try {
			iProject.setDescription(this.description, this.monitor);
		} catch (CoreException e) {
			throw new JobFailedException("Failed setting Java and PDE nature and builders",e);
		}
	}		
	
	def getIProject() {
		iProject
	}	
	
	def public void compile(IProgressMonitor monitor){
		makeJavaProject();
		setClasspath();
		refreshPluginInWorkspace();		
		buildProject();
		checkForErrors();
	}
	
	def private IProject createProject(String projectURI, IProgressMonitor monitor)
			throws JobFailedException {
		val iProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectURI);		
		
		if (iProject.exists())
			throw new JobFailedException(
					"Tried to create an existing project. Preceeding cleanup failed");

		if(logger.isDebugEnabled())
			logger.debug("Creating Eclipse workspace project " + this.iProject.getName());
		iProject.create(monitor);
		iProject.open(monitor);
		
		return iProject;
	}
	
	private def String[] createNatures() {
		if ( this.projectType == AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice.PROTO || 
			this.projectType == AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice.POJO
			 )
		{
			return ProtoComConstants.JAVA_SE_NATURE;			
		} else if (this.projectType == AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice.EJB3){
			return ProtoComConstants.JAVA_EE_NATURE;	
		} else {
			throw new RuntimeException("No suitable project natures found (project type is \""+this.projectType+"\")");
		}
	}
	
	private def String[] createBuilders() {
		if ( this.projectType == AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice.PROTO || 
			this.projectType == AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice.POJO
			 )
		{
			return ProtoComConstants.JAVA_SE_BUILDERS;			
		} else if (this.projectType == AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice.EJB3){
			return ProtoComConstants.JAVA_EE_BUILDERS;	
		} else {
			throw new RuntimeException("No suitable project builders found (project type is \""+this.projectType+"\")");
		}
	}
	
	/**
	 * Create a project description and set the JavaCore.NATURE_ID and
	 * PDE.PLUGIN_NATURE
	 */
	private def IProjectDescription createDescription()
			throws JobFailedException {
		val description = ResourcesPlugin.getWorkspace().newProjectDescription(iProject.getName());
		description.setNatureIds(natures);
		description.setLocation(null);
		
		val List<ICommand> buildCommands = newArrayList
		for(String builder : this.builders) {			
			val command = description.newCommand()
			command.setBuilderName(builder)
			buildCommands.add(command)
		}
		description.setBuildSpec(buildCommands)
		
		return description
	}
	
	/**
	 * Create the Java-Project from IProject and set "src", "bin" folder to
	 * classpath
	 */
	def private void makeJavaProject()
			throws JobFailedException {
		val IJavaProject javaProject = JavaCore.create(this.iProject);
		val IPath srcPath = javaProject.getPath().append("src");
		val IPath binPath = javaProject.getPath().append("bin");
		val IClasspathEntry[] buildPath = #[ JavaCore.newSourceEntry(srcPath),
				JavaRuntime.getDefaultJREContainerEntry() ]
		try {
			javaProject.setRawClasspath(buildPath, binPath, this.monitor);
		} catch (JavaModelException e) {
			throw new JobFailedException("Failed setting up JDT project",e);
		}
	}
	
	/* (non-Javadoc)
	 * @See org.eclipse.pde.internal.ui.wizards.plugin.ClasspathComputer.setClasspath(IProject)
	 */
	def private void setClasspath() {
		val IPluginModelBase pluginModelBase = PluginRegistry.findModel(this.iProject)
		
		if(pluginModelBase == null) {
			throw new JobFailedException("Failed to find plugin project \""+this.iProject.name+"\". Either MANIFEST.MF is corrupt or the project is not declared as plugin project.");
		}
		
		try {			
			ClasspathComputer.setClasspath(this.iProject, pluginModelBase);
		} catch (CoreException e) {
			throw new JobFailedException("Failed to set JDT classpath",e);
		}
	}
	
	/**
	 * @throws JobFailedException
	 */
	def private void refreshPluginInWorkspace() {
		try {
			this.iProject.refreshLocal(IResource.DEPTH_INFINITE, this.monitor);
		} catch (Exception e) {
			throw new JobFailedException("Refreshing plugin project failed", e);
		}
	}
	
	/**
	 * @throws JobFailedException
	 */
	def private void buildProject() {
		try {
			this.iProject.build(IncrementalProjectBuilder.FULL_BUILD, this.monitor);
		} catch (Exception e) {
			throw new JobFailedException("Building plugin project failed", e);
		}
	}
	
	/**
	 * @throws JobFailedException
	 */
	def private void checkForErrors() {
		try {
			if (this.iProject.findMarkers(IMarker.PROBLEM, true,
					IResource.DEPTH_INFINITE).length > 0) {
				var failed = false;
				var IMarker[] markers = this.iProject.findMarkers(IMarker.PROBLEM, true,
						IResource.DEPTH_INFINITE);
				var errorList = "";
				for (marker : markers) {
					if ((marker.getAttribute(IMarker.SEVERITY)) == IMarker.SEVERITY_ERROR) {
						errorList = errorList + marker.getAttribute(IMarker.MESSAGE)
								+ "\n";
						failed = true;
					}
				}
				if (failed)
					throw new JobFailedException(
							"Unable to build the simulation plugin. Failure Messages: "
									+ errorList);
			}
		} catch (CoreException e) {
			throw new JobFailedException(
					"Compile Plugin failed. Error finding project markers.", e);
		}
	}
}