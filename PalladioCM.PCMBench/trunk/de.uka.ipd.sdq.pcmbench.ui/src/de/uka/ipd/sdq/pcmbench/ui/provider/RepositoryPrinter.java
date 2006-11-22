package de.uka.ipd.sdq.pcmbench.ui.provider;

import de.uka.ipd.sdq.pcm.repository.Interface;
import de.uka.ipd.sdq.pcm.repository.Parameter;
import de.uka.ipd.sdq.pcm.repository.Signature;
import de.uka.ipd.sdq.pcm.repository.util.RepositorySwitch;

public class RepositoryPrinter extends RepositorySwitch {

	public RepositoryPrinter() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.pcm.repository.util.RepositorySwitch#caseParameter(de.uka.ipd.sdq.pcm.repository.Parameter)
	 */
	@Override
	public Object caseParameter(Parameter object) {
		String result = "";
		result += object.getParameterName();
		result = ((Signature)object.eContainer()).getServiceName() + "." +result;
		result = ((Interface)object.eContainer().eContainer()).getEntityName() + "." +result;
		return result;
	}

}
