#region Universit�t Oldenburg
//////////////////////////////////////////////////////////////////////////
//	Universit�t Oldenburg
//	Department f�r Informatik, Software Engineering
//	-----------------------------------------------------------------
//	Master-Arbeit "Entwicklung eines Editors f�r die modellgetriebene
//	Konstruktion komponentenbasierter Software-Architekturen"
//	Autor: Matthias Uflacker, 2004
//	eMail: matthias.uflacker@informatik.uni-oldenburg.de
//////////////////////////////////////////////////////////////////////////
#endregion

using System;

namespace Palladio.Editor.Common.Commands
{
	/// <summary>
	/// Zusammenfassung f�r ICommand.
	/// </summary>
	public interface ICommand
	{
		/// <summary>
		/// Performs the command.
		/// </summary>
		/// <returns>true if successful, otherwise false</returns>
		bool Execute();

		/// <summary>
		/// Indicates whether or not the command supports undo.
		/// </summary>
		bool CanUndo
		{
			get;
		}

		/// <summary>
		/// Reverses the command.
		/// </summary>
		/// <returns>true if successful; otherwise false</returns>
		bool Undo();

		/// <summary>
		/// 
		/// </summary>
		Palladio.Editor.Common.EntityProxies.EventArgs EventArgs
		{
			get;
		}

		/// <summary>
		/// Returns the receiver of the command
		/// </summary>
		object Receiver
		{
			get;
		}
	}
}
