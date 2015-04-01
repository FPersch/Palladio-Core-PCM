/*
 * generated by Xtext
 */
package org.palladiosimulator.pcm.pcmstoex.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.palladiosimulator.pcm.pcmstoex.ui.internal.PCMStoExActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PCMStoExExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PCMStoExActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PCMStoExActivator.getInstance().getInjector(PCMStoExActivator.ORG_PALLADIOSIMULATOR_PCM_PCMSTOEX);
	}
	
}
