using System;
using Palladio.Webserver.ConfigReader;
using Palladio.Webserver.Request;
using Palladio.Webserver.WebserverMonitor;

namespace Palladio.Webserver.RequestParser
{
	/// <summary>
	/// ErrorRequestParser. Usually this class should be used at the end of the Chain Of Responsibility
	/// to catch errors on getting a fitting parser for the delivered stream.
	/// </summary>
	public class DefaultRequestParser : IRequestParser
	{

		private IWebserverMonitor webserverMonitor;
		private IWebserverConfiguration webserverConfiguration;

		public DefaultRequestParser(IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration)
		{
			this.webserverMonitor = webserverMonitor;
			this.webserverConfiguration = webserverConfiguration;
		}

		public void HandleRequest (IRequest request)
		{
			throw new NotImplementedException ();
		}
	}
}
