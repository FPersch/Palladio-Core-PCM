using System;
using System.Collections;
using Palladio.Attributes;

namespace Palladio.ComponentModel
{
	/// <summary>
	/// An IInterfaceModel is the description of an interface (of a component).
	/// In our case an interface is a set of signatures
	/// which can be somehow related to each other.
	/// </summary>
	public interface IServiceEffectSpecification : ICloneable, IAttributable
	{
		/// <summary>
		/// A list of signatures contained in this IServiceEffectSpecification
		/// </summary>
		IServiceList RequiredServicesList
		{
			get;
		}
		
		/// <summary>
		/// Additional specification data like FSMs, Petri Nets, ....
		/// </summary>
		IServiceInformation[] ServiceInformations
		{
			get;
		}
		
		/// <summary>
		/// Add a new specification aspect to this servce, like a fsm
		/// </summary>
		/// <param name="info">Additional specification data</param>
		void AddServiceInformation(IServiceInformation info);

		/// <summary>
		/// Get the additional service informations from given type
		/// </summary>
		/// <param name="type">Type of the additional information to retrieve</param>
		/// <returns>The requested information or an exception if the information is not
		/// available</returns>
		IServiceInformation GetServiceInformation(System.Type type);
	}
}
