using System;
using System.Collections;
using Request;

namespace DLL_Engin
{
	/// <summary>
	/// Zusammenfassung f�r IDLLInterface.
	/// </summary>
	public interface IDLL
	{
		
		IDLL DeliverDll(HttpRequest r,Hashtable t);

		string Result();

		IDLL Sucessor{set;get;}
	}
}
