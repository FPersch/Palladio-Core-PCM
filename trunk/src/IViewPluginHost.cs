using System;
using Palladio.ComponentModel;

namespace Palladio.Editor.Common
{
	/// <summary>
	/// Zusammenfassung f�r IViewPluginHost.
	/// </summary>
	public interface IViewPluginHost : IPluginHost
	{
		ICompositeComponent GetComponentModel();
	}
}
