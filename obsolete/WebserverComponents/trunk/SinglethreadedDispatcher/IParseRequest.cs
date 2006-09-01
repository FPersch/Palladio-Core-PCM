using System;
using System.Net.Sockets;

namespace SinglethreadedDispatcher
{
	/// <summary>
	/// Zusammenfassung f�r IParseRequest.
	/// </summary>
	public interface IParseRequest
	{
		void ParseRequest(string request, DateTime now, Socket clientSocket);
	}
}
