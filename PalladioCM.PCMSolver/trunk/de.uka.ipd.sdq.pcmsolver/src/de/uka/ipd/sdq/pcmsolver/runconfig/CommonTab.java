package de.uka.ipd.sdq.pcmsolver.runconfig;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;

public class CommonTab extends AbstractLaunchConfigurationTab {

	private Button checkVerboseLogging = null;
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout());
		
		
		final GridLayout analysisGL = new GridLayout();
		analysisGL.numColumns = 1;
		
		final Group group = new Group(container, SWT.NONE);
		group.setLayout(analysisGL);
		group.setText("Logging");
		group.setLayoutData(new GridData(500, SWT.DEFAULT));
		
		checkVerboseLogging = new Button(group, SWT.CHECK);
		checkVerboseLogging.setText("Enable verbose logging");
		checkVerboseLogging.setSelection(false);
		checkVerboseLogging.addListener (SWT.Selection, new Listener () {
			public void handleEvent (Event event) {
				updateLaunchConfigurationDialog();
			}
		});
	}

	@Override
	public String getName() {
		return "Common";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try{
			checkVerboseLogging.setSelection(configuration.getAttribute(
					MessageStrings.VERBOSE_LOGGING, false));
		}catch(CoreException e){
			checkVerboseLogging.setSelection(false);
		}
		
		updateLaunchConfigurationDialog();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(MessageStrings.VERBOSE_LOGGING, checkVerboseLogging.getSelection());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}


}
