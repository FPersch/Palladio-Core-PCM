using System;
using ReflectionBasedVisitor;

namespace BibTeX.Parser.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r IField.
	/// </summary>
	public interface IField : IVisitable
	{
		string ID
		{
			get; set;
		}

		IStringValue[] Value
		{
			get; set;
		}

		string FlatValue
		{
			get; set;
		}

		string[] StringValues
		{
			get;
		}
	}
}
