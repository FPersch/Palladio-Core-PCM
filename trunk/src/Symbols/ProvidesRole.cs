using System;

namespace Palladio.Editor.Plugins.StaticView.Symbols
{
	/// <summary>
	/// Zusammenfassung f�r ProvidesRole.
	/// </summary>
	public class ProvidesRole : PalladioSymbol
	{
		PalladioSymbol interfaceSymbol;

		public ProvidesRole()
		{
			//
			// TODO: F�gen Sie hier die Konstruktorlogik hinzu
			//
		}

		public PalladioSymbol InterfaceSymbol
		{
			get
			{
				return this.interfaceSymbol;
			}
			set
			{
				this.interfaceSymbol = value;
			}
		}
	}
}
