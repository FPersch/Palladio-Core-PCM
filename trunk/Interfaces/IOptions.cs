using System;

namespace Options.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r IOptions.
	/// </summary>
	public interface IOptions : ICloneable
	{
		object this[string optionID]
		{
			get; set;
		}
	}
}
