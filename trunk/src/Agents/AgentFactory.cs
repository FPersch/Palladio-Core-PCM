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

using Palladio.Editor.Common;
using Palladio.Editor.Core.Interfaces;

namespace Palladio.Editor.Core.Agents
{

	/// <summary>
	/// Zusammenfassung f�r AgentFactory.
	/// </summary>
	internal class AgentFactory
	{

		public static IRootAgent CreateRootAgent()
		{
			return new Root.Control();
		}

		public static IPluginCoordinator CreatePluginCoordinator(IRootAgent parent)
		{
			return new PluginCoordinator.Control(parent);
		}

		public static IViewCoordinator CreateViewCoordinator(IPluginCoordinator parent)
		{
			return new ViewCoordinator.Control(parent);
		}
	}
}
