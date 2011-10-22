package de.uka.ipd.sdq.edp2.visualization;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.ui.IPersistableElement;

import de.uka.ipd.sdq.edp2.models.ExperimentData.MeasurementsRange;

/**
 * Provides a default implementation of a transformation. Should be subclassed
 * by all transformations.
 * 
 * @author Dominik Ernst, Roland Richter
 */
public abstract class AbstractTransformation extends IDataSource implements
		IDataSink {

	/**
	 * The previous element in a chain of {@link IDataFlow} elements.
	 */
	protected IDataSource source;
	/**
	 * Key under which this class' name is stored in the properties.
	 */
	protected static final String ELEMENT_KEY = "elementName";

	/**
	 * Default, empty constructor.
	 */
	public AbstractTransformation() {
		super();
	}

	/**
	 * A constructor implementation, which keeps the reference on the original
	 * {@link MeasurementsRange} reference alive.
	 * 
	 * @param source
	 *            The source attached to this {@link AbstractTransformation}.
	 */

	public AbstractTransformation(IDataSource source) {
		setSource(source);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.uka.ipd.sdq.edp2.visualization.IDataSink#getSource()
	 */
	@Override
	public IDataSource getSource() {
		return source;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uka.ipd.sdq.edp2.visualization.IDataSink#setSource(de.uka.ipd.sdq.
	 * edp2.visualization.IDataSource)
	 */
	@Override
	public void setSource(IDataSource source) {
		if (this.source != null)
			getSource().deleteObserver(this);
		this.source = source;
		source.addObserver(this);
		setOriginalMeasurementsRange(source.getOriginalMeasurementsRange());
		transformData();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	@Override
	public boolean exists() {
		return source != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#getPersistable()
	 */
	@Override
	public IPersistableElement getPersistable() {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 */
	@Override
	public String getToolTipText() {
		return "noTooltip";
	}

	/**
	 * Method which should contain the transformation logic of Filters or
	 * Adapters.
	 */
	public abstract void transformData();

	/**
	 * @param originalMeasurementsRange
	 *            the originalMeasurementsRange to set
	 */
	private void setOriginalMeasurementsRange(
			MeasurementsRange originalMeasurementsRange) {
		this.originalMeasurementsRange = originalMeasurementsRange;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org
	 * .eclipse.core.runtime.IConfigurationElement, java.lang.String,
	 * java.lang.Object)
	 */
	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		// TODO Auto-generated method stub
		// as long as it has no relevance, the empty method is added here to
		// avoid unnecessary implementation
		// or misunderstandings
	}

}
