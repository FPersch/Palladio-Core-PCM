using System;
using System.Collections;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Windows.Forms;

namespace Palladio.Editor.Forms
{
	/// <summary>
	/// Zusammenfassung f�r ToolBoxControl.
	/// </summary>
	public class ToolBoxControl : System.Windows.Forms.UserControl
	{
		/// <summary> 
		/// Erforderliche Designervariable.
		/// </summary>
		private System.ComponentModel.Container components = null;

		public ToolBoxControl()
		{
			// Dieser Aufruf ist f�r den Windows Form-Designer erforderlich.
			InitializeComponent();

			// TODO: Initialisierungen nach dem Aufruf von InitializeComponent hinzuf�gen

		}

		/// <summary> 
		/// Die verwendeten Ressourcen bereinigen.
		/// </summary>
		protected override void Dispose( bool disposing )
		{
			if( disposing )
			{
				if(components != null)
				{
					components.Dispose();
				}
			}
			base.Dispose( disposing );
		}

		#region Vom Komponenten-Designer generierter Code
		/// <summary> 
		/// Erforderliche Methode f�r die Designerunterst�tzung. 
		/// Der Inhalt der Methode darf nicht mit dem Code-Editor ge�ndert werden.
		/// </summary>
		private void InitializeComponent()
		{
			components = new System.ComponentModel.Container();
		}
		#endregion
	}
}
