using System;
using System.Collections;

namespace Greeting
{
	/// <summary>
	/// Zusammenfassung f�r Class1.
	/// </summary>
	public class Greet
	{
		Hashtable userData;
		public Greet(Hashtable ud)
		{
			this.userData = ud;
		}

		public string Result()
		{
			return "<H1> Hallo "+this.userData["nameFeld"].ToString()+" !";
		}
	}
}
