using System;
using System.Collections;
using Palladio.Utils.Collections;
using System.Reflection;

namespace Palladio.ComponentModel
{
	/// <summary>
	/// IParameter contains the information describing a parameter
	/// of a signature. It consists of a name, a type and a modifier.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.1  2005/02/21 13:50:51  joemal
	/// initial import
	///
	///
	/// </pre>
	/// </remarks>
	public interface IParameter : ICloneable 
	{
		#region Properties
		/// <summary>
		/// Name of the parameter.
		/// </summary>
		string Name { get; }

		/// <summary>
		/// Type of the parameter.
		/// </summary>
		IType Type { get; }

		/// <summary>
		/// Modifier of the parameter. A modifier specifices the way of passing the
		/// parameter to the method body.
		/// </summary>
		ParameterModifierEnum Modifier { get; }

		#endregion
	}

	/// <summary>
	/// Specifies the way how a parameter is passed to the method body.
	/// </summary>
	public enum ParameterModifierEnum
	{
		/// <summary>
		/// Parameter is unmodified
		/// </summary>
		NONE, 
		/// <summary>
		/// Parameter can be modified by the service
		/// </summary>
		OUT, 
		/// <summary>
		/// A value type is passed as reference instead of being passed by value
		/// </summary>
		REF
	}
}
