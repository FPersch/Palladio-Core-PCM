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
using System.Drawing.Design;

namespace Palladio.Editor.Common.EntityProxies.UITypeEditors
{
	/// <summary>
	/// Zusammenfassung f�r RoleProxyCollectionTypeEditor.
	/// </summary>
	public class RoleProxyCollectionTypeEditor : UITypeEditor
	{
		public override object EditValue(System.ComponentModel.ITypeDescriptorContext context, IServiceProvider provider, object value)
		{
			Dialogs.RoleProxyCollectionForm dialog = null;
			if ( context.PropertyDescriptor.DisplayName.Equals("ProvidedRoles") )
				dialog = new Dialogs.RoleProxyCollectionForm(context.Instance as CompositeComponentProxy, false);
			else if ( context.PropertyDescriptor.DisplayName.Equals("RequiredRoles") )
				dialog = new Dialogs.RoleProxyCollectionForm(context.Instance as CompositeComponentProxy, true);
			else
				return value;
			dialog.ShowDialog();
			return value;
		}

		public override UITypeEditorEditStyle GetEditStyle(System.ComponentModel.ITypeDescriptorContext context)
		{
			return UITypeEditorEditStyle.Modal;
		}
	}
}
