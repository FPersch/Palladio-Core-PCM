using System;
using ReflectionBasedVisitor;

namespace BibTeX.Parser.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r IPreambleEntry.
	/// </summary>
	public interface IPreambleEntry : IEntry, IVisitable
	{
		IStringValue[] Value
		{
			get; set;
		}
	}
}
