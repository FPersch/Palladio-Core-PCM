package de.uka.ipd.sdq.codegen.simucontroller.runconfig;


import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;


/**
 * @author admin
 * 
 */
public class oAWConfigurationTab extends AbstractLaunchConfigurationTab {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getImage()
	 */
	public Image getImage() {
		return ResourceManagerTab.getConfigurationImage();
	}

	/**
	 * TODO
	 */
	private String workspace_location = ResourcesPlugin.getWorkspace()
			.getRoot().getLocation().toString();
	private String GENERATE_PLUGIN_PATH = workspace_location
			+ "/de.uka.ipd.sdq.codegen.simucominstance/src";
	private String outputPath = "OUTPUT_PATH";
	/**
	 * The default value for the 'height' Layout attribute.
	 */
	private final int LAYOUT_WIDTH = 554;

	private Text outputPathField;
	private Label locationLabel;
	private Button workspaceButton;
	private Button fileSystemButton;

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		
		final ModifyListener modifyListener = new ModifyListener(){

			public void modifyText(ModifyEvent e) {
				oAWConfigurationTab.this.setDirty(true);
				oAWConfigurationTab.this.updateLaunchConfigurationDialog();
			}
		};
		
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout());

		// Create outPath section
		final Group outputPathGroup = new Group(container, SWT.NONE);
		outputPathGroup.setText("Output Path");
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		outputPathGroup.setLayout(gridLayout);
		outputPathGroup.setLayoutData(new GridData(LAYOUT_WIDTH, 80));

		final Button defaultLocationButton = new Button(outputPathGroup,
				SWT.CHECK);
		final GridData gridData_1 = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1);
		defaultLocationButton.setLayoutData(gridData_1);
		defaultLocationButton.setText("Use default location");
		defaultLocationButton.setSelection(true);
		defaultLocationButton.addSelectionListener(new SelectionAdapter() {

			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				setElementsEnabled(false);
				outputPathField.setText(GENERATE_PLUGIN_PATH);

				if (!defaultLocationButton.getSelection()) {
					setElementsEnabled(true);
					outputPathField.setText("");

				}
			}
		});
		new Label(outputPathGroup, SWT.NONE);

		locationLabel = new Label(outputPathGroup, SWT.NONE);
		locationLabel.setLayoutData(new GridData(48, SWT.DEFAULT));
		locationLabel.setText("Location:");

		outputPathField = new Text(outputPathGroup, SWT.BORDER);
		final GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1);
		gridData.widthHint = 456;
		outputPathField.setLayoutData(gridData);
		outputPathField.setText(GENERATE_PLUGIN_PATH);
		outputPathField.addModifyListener(modifyListener);
		new Label(outputPathGroup, SWT.NONE);

		workspaceButton = new Button(outputPathGroup, SWT.NONE);
		workspaceButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true,
				false));
		workspaceButton.setText("Workspace...");
		workspaceButton.addSelectionListener(new SelectionAdapter() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				String pluginPath = openResourceDialog(e);
				outputPathField.setText(workspace_location + pluginPath);
				ResourceManagerTab.setGeneretePluginPath(pluginPath);
			}
		});

		fileSystemButton = new Button(outputPathGroup, SWT.NONE);
		fileSystemButton.setLayoutData(new GridData());
		fileSystemButton.setText("File System...");
		fileSystemButton.addSelectionListener(new SelectionAdapter() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				String pluginPath = openDirectoryDialog(e);
				outputPathField.setText(pluginPath);
				ResourceManagerTab.setGeneretePluginPath(pluginPath);
			}
		});

		// --- setEnabled(false) ---
		setElementsEnabled(false);

	}

	/**
	 * TODO
	 * 
	 * @param enable
	 */
	private void setElementsEnabled(boolean enable) {
		locationLabel.setEnabled(enable);
		outputPathField.setEnabled(enable);
		workspaceButton.setEnabled(enable);
		fileSystemButton.setEnabled(enable);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return "Configuration";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			outputPathField.setText(configuration.getAttribute(ResourceManagerTab.OUTPUT_PATH, GENERATE_PLUGIN_PATH));
		} catch (CoreException e) {
			outputPathField.setText("CoreException e -> " + outputPath);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(ResourceManagerTab.OUTPUT_PATH, outputPathField.getText());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}
	
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);

		if (outputPathField.getText().equals("")){
			setErrorMessage("The output path location is not specified!");
			return false;
		}
		return true;
	}

	/**
	 * The function calls the DirectoryDialog and give back absolute path to the
	 * directory as String
	 * 
	 * @return absolute path to ordner
	 */
	private String openDirectoryDialog(SelectionEvent e) {

		String directoryname = "";

		DirectoryDialog dialog = new DirectoryDialog(
				e.display.getActiveShell(), SWT.OPEN | SWT.SAVE);
		dialog.setText("Select Directory");

		if (dialog.open() != null)
			directoryname = dialog.getFilterPath(); // + File.separatorChar;

		return directoryname;
	}

	/**
	 * The function calls the ContainerSelectionDialog and give back relative to
	 * the workspace
	 * 
	 * @return relative path to ordner
	 */
	private String openResourceDialog(SelectionEvent e) {
		String message = "Choose a location relative to the workspace: "; // openResourceDialog(e);

		String resourceName = "";

		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				e.display.getActiveShell(), null, true, message);

		dialog.open();

		Object[] result = dialog.getResult();

		if (result[0] instanceof IPath) {
			IPath path = (IPath) result[0];
			resourceName = path.toPortableString();

		}
		return resourceName;
	}
}
