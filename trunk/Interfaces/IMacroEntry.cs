using System;
using ReflectionBasedVisitor;

namespace BibTeX.Parser.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r IMacroEntry.
	/// </summary>
	public interface IMacroEntry : IEntry, IVisitable
	{
		IFieldArray Fields
		{
			get;
		}
	}
}
