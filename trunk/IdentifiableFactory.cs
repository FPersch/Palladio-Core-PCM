using System;

namespace Palladio.Identifier
{
	/// <summary>
	/// Zusammenfassung f�r IDFactory.
	/// </summary>
	public class IdentifiableFactory
	{
		public static IIdentifier CreateStringID(string s)
		{
			return (StringIdentifier)s;
		}
	}
}
