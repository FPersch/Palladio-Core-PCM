using System;
using Palladio.Webserver.WebserverMonitor;
using Palladio.Webserver.RequestParser;

namespace Palladio.Webserver.Dispatcher
{
	/// <summary>
	/// DefaultDispatcher.
	/// </summary>
	/// 
	/// 
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.1  2004/10/17 17:25:09  kelsaka
	/// initial cvs-version; added general project structure
	///
	///
	/// </pre>
	/// </remarks>
	public class DefaultDispatcher : IDispatcher
	{

		
		private IRequestParser requestParser;


		/// <summary>
		/// Default constructor.
		/// </summary>
		/// <param name="requestParser">The delegate that is used as the proceeding component (RequestParser)
		/// on processing the client-request.</param>
		public DefaultDispatcher(IRequestParser requestParser)
		{
			this.requestParser = requestParser;
		}


		public void Run ()
		{
			throw new NotImplementedException ();
		}

		public void Stop ()
		{
			throw new NotImplementedException ();
		}

	}
}
