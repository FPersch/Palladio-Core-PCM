using System;
using ReflectionBasedVisitor;

namespace BibTeX.Parser.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r IRegularEntry.
	/// </summary>
	public interface IRegularEntry : IEntry, IVisitable
	{
		string Label
		{
			get; set;
		}
		IFieldArray Fields
		{
			get;
		}
		string TypeDescriptor
		{
			get; set;
		}
	}
}
