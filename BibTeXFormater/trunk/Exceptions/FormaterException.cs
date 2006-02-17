using System;

namespace BibTeX.Formater.Exceptions
{
	/// <summary>
	/// Zusammenfassung f�r FormaterException.
	/// </summary>
	public class FormaterException : Exception
	{
		public FormaterException(string message) : base (message) {}
	}
}
