using System;
using Palladio.Identifier;

namespace ComponentNetworkSimulation.Structure.Builder
{
	/// <summary>
	/// This interface defines a observer for basiccomponentbuilders. Implementing classes are notified, when a
	/// service was added to the component.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	/// 
	/// $Log$
	/// Revision 1.1  2004/06/28 10:50:51  joemal
	/// initial class creation
	///
	/// 
	/// </pre>	
	/// </remarks>
	public interface IBasicComponentObserver : IComponentObserver
	{
		/// <summary>
		/// called, when a service was added to the observing basic component.
		/// </summary>
		/// <param name="componentID">the id of the observing component</param>
		/// <param name="provIfaceID">the id of the provides interface, to which the signature of the service is added</param>
		/// <param name="signatureID">the id of the signature</param>
		void OnServiceAdded(string componentID, IIdentifier provIfaceID,IIdentifier signatureID);
	}
}
//EOF