using System;
using System.Net.Sockets;
using RequestParser;
using RequestProssor;

namespace Dispatcher
{
	/// <summary>
	/// Zusammenfassung f�r DispatcherComponent.
	/// </summary>
	public class DispatcherComponent
	{
		HTTPAcceptor acceptor;
		DispatcherThread current;

		RequestProzessorComponent sendsResponse;
		RequestParserComponent parsesRequest;
		protected bool shutdownRequested;

		public DispatcherComponent()
		{
			
		}

		public void StartServer(int port,ref RequestParserComponent parserComp, ref RequestProzessorComponent sender )
		{
			this.shutdownRequested = false;
			this.sendsResponse = sender;
			this.parsesRequest = parserComp;
			this.acceptor = new HTTPAcceptor(port);
			Running();
		}

		public void Running()
		{
			TcpClient dada =null;//=null;
			try
			{

				
				while(!this.shutdownRequested)
				{
					Console.WriteLine("ich warte");
					dada = acceptor.portListener.AcceptTcpClient();
					this.current = new DispatcherThread(dada, DateTime.Now, ref this.parsesRequest, ref this.sendsResponse);
				}
				if(this.shutdownRequested)
				{
					Console.WriteLine("Jetzt geht es zu ende");
					this.sendsResponse.ShutDown();
				}
			}
			catch(Exception e)
			{
				Console.WriteLine(e.Message);
				Console.WriteLine("Beende Verbindung");
				dada.Close();
				
			}


		}

		public void Shutdown()
		{
			this.shutdownRequested = true;
			Console.WriteLine("Tue alles was m�glich ist");

		}

		public bool RequestRead()
		{
			return this.current.RequestRead;
		}
		
		public TcpClient Socket
		{
			get{ return this.current.ClientSocket;}
		}

		public string Request
		{
			get{return this.current.Request;}
		}

		public DateTime TimeConnected
		{
			get{return this.current.ArrivalTime;}
		}

	}
}
