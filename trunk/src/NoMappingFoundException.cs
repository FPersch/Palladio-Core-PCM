using System;

namespace Palladio.ComponentModel
{
	/// <summary>
	/// Zusammenfassung f�r NoMappingFoundException.
	/// </summary>
	public class NoMappingFoundException : Exception
	{
		public NoMappingFoundException(AbstractComponentInterface aCompIface) : 
			base ("No binding found for: "+aCompIface.Name)
		{
		}	
	}
}
