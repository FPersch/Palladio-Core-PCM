using System;

namespace Options.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r IOption.
	/// </summary>
	public interface IOption
	{
		string ID
		{
			get;
		}

		string Description
		{
			get;
		}
		
		object Value
		{
			get; set;
		}

		OptionType Type
		{
			get;
		}
	}
}
