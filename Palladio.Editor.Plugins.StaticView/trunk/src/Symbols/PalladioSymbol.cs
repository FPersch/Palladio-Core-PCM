using System;

using Syncfusion.Windows.Forms.Diagram;

namespace Palladio.Editor.Plugins.StaticView.Symbols
{
	/// <summary>
	/// Zusammenfassung f�r PalladioSymbol.
	/// </summary>
	public class PalladioSymbol : Symbol
	{
		private object _tag;
		private PalladioSymbol _parentSymbol;

		public PalladioSymbol()
		{
			//
			// TODO: F�gen Sie hier die Konstruktorlogik hinzu
			//
		}

		public object Tag
		{
			get
			{
				return this._tag;
			}
			set
			{
				this._tag = value;
			}
		}

		public PalladioSymbol ParentSymbol
		{
			get
			{
				return this._parentSymbol;
			}
			set
			{
				this._parentSymbol = value;
			}
		}
	}
}
