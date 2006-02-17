using System;
using System.Net.Sockets;
using Request;
using ThreadedRequestProzessor;

namespace RequestParserForLateThread
{
	/// <summary>
	/// Zusammenfassung f�r RequestHandler.
	/// </summary>
	public class ErrorHandler : IHandler
	{
		IHandler successor;
		public void HandleRequest(DateTime arrival,ref ThreadedRequestProzessor.ThreadedRequestProzessorComponent pro, TcpClient d)
		{
			Console.WriteLine(" An errror occured ");
		}

		public IHandler Successor
		{
			set{this.successor=value;}
			get{return this.successor;}
		}
	}
}