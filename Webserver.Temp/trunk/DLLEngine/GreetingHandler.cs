using System;
using System.Collections;
using DBAcesses;
using Greeting;
using Request;

namespace DLLEngine
{
	/// <summary>
	/// Zusammenfassung f�r GreetingHandler.
	/// </summary>
	public class GreetingHandler : IDLL
	{
		private IDLL sucessor;
		private Hashtable userInput;
		private string result;

		public GreetingHandler()
		{
		}

		public IDLL DeliverDll(HttpRequest request, Hashtable userInput, ref DBAcessComponent db)
		{
			if (Responseable(request))
			{
				Console.WriteLine("Grreting Responsable");
				this.userInput = userInput;
				ComputeResult();
				return this;
			}
			else
			{
				return this.sucessor.DeliverDll(request, userInput, ref db);
			}
		}

		public void ComputeResult()
		{
			Greet greet = new Greet(this.userInput);
			this.result = greet.Result();
		}

		internal bool Responseable(HttpRequest r)
		{
			if (r.URI.IndexOf("greeting.htm") != -1 && r.RequestedMethod == "GET")
			{
				return true;
			}
			return false;
		}

		public IDLL Sucessor
		{
			get { return this.sucessor; }
			set { this.sucessor = value; }

		}

		public string Result()
		{
			return this.result;
		}


	}
}