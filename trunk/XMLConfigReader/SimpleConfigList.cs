using System;
using System.Collections;

namespace XMLConfigReader
{
	/// <summary>
	/// Zusammenfassung f�r SimpleConfigList.
	/// </summary>
	public class SimpleConfigList : ConfigList
	{
		public SimpleConfigList() : base()
		{
			//
			// TODO: F�gen Sie hier die Konstruktorlogik hinzu
			//
		}

		public bool ContainsParts(object o)
		{
			if(!(o is string))
			{
				return false;
			}
			string requested = (string) o;
			IEnumerator item = base.GetKeyEnumerator();
			while(item.MoveNext())
			{

				if(((string) item.Current).IndexOf(requested) != -1 || (string) item.Current == requested)
					return true;
			}
			return false;

		}
	}
}
