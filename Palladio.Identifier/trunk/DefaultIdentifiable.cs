using System;

namespace Palladio.Identifier
{
	/// <summary>
	/// Zusammenfassung f�r DefaultIdentifiable.
	/// </summary>
	internal class DefaultIdentifiable : IIdentifiable
	{
		protected StringIdentifier stringID;

		public IIdentifier ID
		{
			get
			{
				return stringID;
			}
		}

		public DefaultIdentifiable(string s)
		{
			stringID = s;
		}
	}
}
