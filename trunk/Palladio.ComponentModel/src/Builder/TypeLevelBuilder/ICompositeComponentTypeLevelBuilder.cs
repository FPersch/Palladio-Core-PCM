using System;
using Palladio.ComponentModel.Builder.ImplementationLevelBuilder;
using Palladio.ComponentModel.ModelEntities;

namespace Palladio.ComponentModel.Builder.TypeLevelBuilder
{

	/// <summary>
	/// Builder interface for type-level specific methods of composite components.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.5  2005/05/27 10:30:12  kelsaka
	/// - updated some documentation
	///
	/// Revision 1.4  2005/04/24 14:50:14  kelsaka
	/// - added full support for constraints
	/// - added typed lists for builders
	/// - removed protocol builder
	///
	/// Revision 1.3  2005/04/20 21:02:35  kelsaka
	/// - added first methods for constraints
	///
	/// Revision 1.2  2005/04/12 12:32:39  kelsaka
	/// - removed property to access typed IDs directly from the builders
	/// - renamed the property from 'SignaturID' to 'SignatureID' in ISignature
	///
	/// Revision 1.1  2005/04/08 10:41:18  kelsaka
	/// - added return of IDs
	/// - added implementation of defined interfaces
	/// - redefined interfaces for builder-context
	/// - added CC-levels
	///
	/// </pre>
	/// </remarks>
	public interface ICompositeComponentTypeLevelBuilder : ICompositeComponentBuilder
	{

		/// <summary>
		/// Offers a possibility to change the model-level at which the actual entity is created.
		/// </summary>
		ICompositeComponentImplementationLevelBuilder ImplementationLevelBuilder
		{
			get;
		}

		#region constraint-management

		/// <summary>
		/// The child builder to call for each method defined in the builder interface.
		/// </summary>
		/// <remarks>This property should only be used for constraints management. Constraints
		/// in the component model are organized as an kind of pipe and filter architecture.
		/// For this the ChildBuilder property allows to set the successor (child) that is
		/// called after executing the acutal constraint. If there is no violation of a constraint
		/// each constraint-class delegates the request to its child; otherwise exceptions
		/// will be thrown.</remarks>
		ICompositeComponentTypeLevelBuilder ChildBuilder
		{
			set;
		}

		/// <summary>
		/// Clones the actual builder / constraints instance except the created / supervised
		/// component model entity.
		/// </summary>
		/// <param name="component">The component model entity that has to be builder /
		/// supervised.</param>
		/// <returns>A copy of the actual builder / constraint.</returns>
		/// <remarks>This method should only be used for constraints management.</remarks>
		ICompositeComponentTypeLevelBuilder Clone(IComponent component);

		#endregion
	}
}
