using System.Collections;
using DBAcesses;
using Request;

namespace DLLEngine
{
	/// <summary>
	/// Zusammenfassung f�r IDLLInterface.
	/// </summary>
	public interface IDLL
	{
		IDLL DeliverDll(HttpRequest r, Hashtable t, ref DBAcessComponent db);

		string Result();

		IDLL Sucessor { set; get; }
	}
}