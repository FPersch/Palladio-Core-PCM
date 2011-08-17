package de.uka.ipd.sdq.simucomframework.calculator;

import de.uka.ipd.sdq.pipesandfilters.framework.MetaDataInit;
import de.uka.ipd.sdq.pipesandfilters.framework.PipesAndFiltersManager;
import de.uka.ipd.sdq.probespec.framework.calculator.Calculator;

public interface ISetupDataSinkStrategy {

	public PipesAndFiltersManager setupDataSink(Calculator calculator,
			MetaDataInit metaData);
	
}
