using System;

namespace BibTeX.Parser.Modifier
{
	/// <summary>
	/// Zusammenfassung f�r ModifierException.
	/// </summary>
	public class ModifierException : Exception
	{
		public ModifierException(string text, Exception ex) : base (text,ex)
		{
			//
			// TODO: F�gen Sie hier die Konstruktorlogik hinzu
			//
		}
	}
}
