using System;
using System.Collections;
using Request;
using DBAcesses;

namespace DLL_Engin
{
	/// <summary>
	/// Zusammenfassung f�r IDLLInterface.
	/// </summary>
	public interface IDLL
	{
		
		IDLL DeliverDll(HttpRequest r,Hashtable t, ref DBAcessComponent db);

		string Result();

		IDLL Sucessor{set;get;}
	}
}
