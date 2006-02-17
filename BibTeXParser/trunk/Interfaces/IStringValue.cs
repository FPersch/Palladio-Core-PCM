using System;
using ReflectionBasedVisitor;

namespace BibTeX.Parser.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r IStringValue.
	/// </summary>
	public interface IStringValue : IVisitable
	{
		StringValueType Type
		{
			get; set;
		}

		string InnerValue
		{
			get; set;
		}
	}
}
