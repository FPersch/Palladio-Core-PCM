using System;

namespace BibTeX.Parser.Modifier
{
	/// <summary>
	/// Zusammenfassung f�r EntryModifierException.
	/// </summary>
	public class EntryModifierException : ModifierException
	{
		public EntryModifierException(String text, Exception ex) : base (text,ex)
		{
			//
			// TODO: F�gen Sie hier die Konstruktorlogik hinzu
			//
		}
	}
}
