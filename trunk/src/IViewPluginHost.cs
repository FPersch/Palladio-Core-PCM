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
	/// Zusammenfassung f�r IViewPluginHost.
	/// </summary>
	public interface IViewPluginHost : IPluginHost
	{
		/// <summary>
		/// </summary>
		event ComponentModelChangedHandler ComponentModelChanged;

		/// <summary>
		/// </summary>
		event EntityChangedHandler EntityChanged;

		/// <summary>
		/// </summary>
		/// <returns></returns>
		EntityProxies.CompositeComponentProxy GetComponentModel();
	}
}
