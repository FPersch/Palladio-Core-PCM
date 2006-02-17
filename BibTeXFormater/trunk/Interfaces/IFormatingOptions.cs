using System;

namespace BibTeX.Formater.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r IFormatingOptions.
	/// </summary>
	public interface IFormatingOptions
	{
		void SetOption(IOption option, object val);
		Enum GetOption(string option);
		string[] GetAvailableOptions();
		string[] GetAvailableValues(string option);
	}
}
