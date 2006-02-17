using System;
using Palladio.Identifier;

namespace Palladio.Editor.Common.Exceptions
{
	/// <summary>
	/// Zusammenfassung f�r IDNotFoundException.
	/// </summary>
	public class IDNotFoundException : Exception
	{
		public IDNotFoundException(IIdentifier id) : base( "ID " + id.ToString() + " not found!")
		{
		}
	}
}
