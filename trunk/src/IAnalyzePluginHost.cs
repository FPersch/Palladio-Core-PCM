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

namespace Palladio.Editor.Common
{
	/// <summary>
	/// This is the host interface for analysis plugins.
	/// </summary>
	public interface IAnalyzePluginHost : IPluginHost
	{
		/// <summary>
		/// Returns the open component model.
		/// </summary>
		/// <returns>A proxy object for the current component model.</returns>
		EntityProxies.CompositeComponentProxy GetComponentModel();
	}
}
