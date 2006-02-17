using System;

namespace BibTeX.Parser.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r ILogOutput.
	/// </summary>
	public interface ILogOutput
	{
		void LogMessage(LogType type, string message);
	}
}
