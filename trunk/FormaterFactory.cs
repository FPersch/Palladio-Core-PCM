using System;
using BibTeX.Formater.Interfaces;

namespace BibTeX.Formater
{
	/// <summary>
	/// Zusammenfassung f�r FormaterFactory.
	/// </summary>
	public class FormaterFactory
	{
		public static IBibTeXFormater GetASCIIFormater()
		{
			return new ASCIIFormater();
		}
	}
}
