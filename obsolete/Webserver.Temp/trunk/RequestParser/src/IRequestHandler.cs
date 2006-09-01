using System;
using System.Net.Sockets;
using RequestProssor;

namespace RequestParser
{
	/// <summary>
	/// Zusammenfassung f�r RequestHandler.
	/// </summary>
	public interface IRequestHandler 
	{
		void HandleRequest(DateTime arrival, ref RequestProcessorComponent pro, TcpClient tcp);

		IRequestHandler Successor { set; get; }
	}
}