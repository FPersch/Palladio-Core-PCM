using System;
using System.Collections;

namespace Palladio.ComponentModel 
{
	/// <summary>
	/// A Component is a set of provides and requires interfaces.
	/// </summary>
	public interface IComponent : ICloneable 
	{
		
		/// <summary>
		/// Interfaces provided by the component to its environment.
		/// </summary>
		/// <returns>
		/// A list of ProvidesInterface objects.
		/// </returns>
		IList GetProvidesIFaceList();

		/// <summary>
		/// Interfaces required by the component from its environment.
		/// </summary>
		/// <returns>
		/// A list of RequiresInterface objects.
		/// </returns>
		IList GetRequiresIFaceList();

		/// <summary>
		/// Interfaces provided by the component constrained by its environment.
		/// </summary>
		/// <param name="aProvIFaceList">
		/// List of ProvidesInterface objects provided to the component.
		/// </param>
		/// <returns>
		/// A list of ProvidesInterface objects.
		/// </returns>
		IList GetProvidesIFaceList( IList aProvIFaceList );

		/// <summary>
		/// Interfaces required by the component adapted to the requirements
		/// of the environment.
		/// </summary>
		/// <param name="aReqIFaceList">
		/// List of RequiresInterface objects required from the component.
		/// </param>
		/// <returns>
		/// A List of RequireInterface objects.
		/// </returns>
		IList GetRequiresIFaceList( IList aReqIFaceList );

		//		void AddProvidesIFace( ProvidesInterface aProvIFace );
		//
		//		void AddProvidesIFaceList( IList aProvIFaceList );
		//		
		//		void RemoveProvidesIFace( ProvidesInterface aProvIFace );
		//
		//		void RemoveProvidesIFaceList( IList aProvIFaceList );
		//		
		//		void ClearProvidesIFaceList();
		//
		//		void AddRequiresIFace( RequiresInterface aReqIFace );
		//
		//		void AddRequiresIFaceList( IList aReqIFaceList );
		//
		//		void RemoveRequiresIFace( RequiresInterface aReqIFace );
		//
		//		void RemoveRequiresIFaceList( IList aReqIFaceList );
		//		
		//		void ClearRequiresIFaceList();
	}
}
