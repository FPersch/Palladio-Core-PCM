using System;
using ReflectionBasedVisitor;

namespace BibTeX.Parser.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r ICommentEntry.
	/// </summary>
	public interface ICommentEntry : IEntry, IVisitable
	{
		string Comment
		{
			get; set;
		}
	}
}
