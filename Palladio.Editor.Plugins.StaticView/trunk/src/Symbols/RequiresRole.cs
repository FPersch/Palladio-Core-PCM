using System;

namespace Palladio.Editor.Plugins.StaticView.Symbols
{
	/// <summary>
	/// Zusammenfassung f�r RequiresRole.
	/// </summary>
	public class RequiresRole : PalladioSymbol
	{
		PalladioSymbol interfaceSymbol;

		public RequiresRole()
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
