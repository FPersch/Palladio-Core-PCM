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

using Palladio.ComponentModel;
using Palladio.Editor.Common;
using Palladio.Editor.Common.EntityProxies;


namespace Palladio.Editor.Core.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r IPluginCoordinator.
	/// </summary>
	internal interface IPluginCoordinator
	{
		// events for parent agents
		event SelectionChangedHandler SelectionChanged;

		// events for child agents
		event EntityChangedHandler EntityChanged;
		event ComponentModelChangedHandler ComponentModelChanged;

		// called by parent agent
		void Initialize();
		void ShowPluginControlDialog();

		// called by child agents
		void PluginAttached(IPlugin plugin);
		void PluginDetached(string pluginType);
		CompositeComponentProxy GetComponentModel();
	}
}
