using System;
using Palladio.Webserver.Dispatcher;
using Palladio.Webserver.FTPRequestProcessor;
using Palladio.Webserver.Request;
using Palladio.Webserver.RequestParser;
using Palladio.Webserver.WebserverMonitor;
using Palladio.Webserver.ConfigReader;
using Palladio.Webserver.HTTPRequestProcessor;

namespace Palladio.Webserver.WebserverFactory
{
	/// <summary>
	/// IWebserverFactory.
	/// </summary>
	/// 
	/// 
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.10  2004/12/06 05:20:21  sliver
	/// - RequestFactory added
	/// - Create Methods for IHTTPRequestProcessorTools and IWebserverConfiguration added to the WebserverFactory
	/// - WebserverConfigurator added
	///
	/// Revision 1.9  2004/11/21 17:10:04  kelsaka
	/// Added BibTeX-Component; added enumerator for request-types; added test-html-documents
	///
	/// Revision 1.8  2004/11/05 16:17:01  kelsaka
	/// Added support for simple dynamic content (SimpleTemplateFileProvider). For this added a new xml-config-file and auto-generated XML-classes.
	/// Code refactoring.
	///
	/// Revision 1.7  2004/10/27 05:52:49  kelsaka
	/// fixed xml-parsing for defaultFiles; monitor-functions available; usable webserverconfiguration
	///
	/// Revision 1.6  2004/10/25 06:35:51  kelsaka
	/// added XML-reading-abilities
	///
	/// Revision 1.5  2004/10/23 11:55:08  kelsaka
	/// added some parts of the building process
	///
	/// Revision 1.4  2004/10/22 16:19:56  kelsaka
	/// even more interface changes; configuration-alternative on loading the webserver
	///
	/// Revision 1.3  2004/10/22 14:18:17  kelsaka
	/// interface-update
	///
	/// Revision 1.2  2004/10/22 12:55:56  kelsaka
	/// Actualised the UML-componentview; defined the webserverfactory-interface, therefore added some new interfaces
	///
	/// Revision 1.1  2004/10/17 17:25:09  kelsaka
	/// initial cvs-version; added general project structure
	///
	///
	/// </pre>
	/// </remarks>
	public interface IWebserverFactory
	{


		#region Dispatcher

		/// <summary>
		/// Creates the DefaultDispatcher.
		/// </summary>
		/// <param name="requestParser">A component that fullfills the required-interface.</param>
		/// <returns>IDispatcher, using the services from the reqestParser.</returns>
		IDispatcher CreateDispatcher(IRequestParser requestParser, IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration, IRequestFactory requestFactory);

		#endregion

		#region WebserverMonitor

		/// <summary>
		/// Creates a WebserverMonitor: a component for logging- and debuggin-features. 
		/// </summary>
		/// <returns></returns>
		IWebserverMonitor CreateWebserverMonitor(IWebserverConfiguration webserverConfiguration);

		#endregion

		#region ConfigReader

		/// <summary>
		/// Creates a ConfigReader to get settings for the webserver.
		/// </summary>
		/// <returns></returns>
		IConfigReader CreateConfigReader();


		#endregion

		#region RequestParsers

		/// <summary>
		/// Creates a HTTPRequestParser. This component can handle requests in a Chain Of Responsibility (COR).
		/// </summary>
		/// <param name="requestProcessor">The component used as HTTPRequestProcessor.</param>
		/// <param name="CorSuccessor">The successor in the COR to handle requests by using the IRequestParser-Interface.</param>
		/// <returns>HTTPRequestParser</returns>
		IRequestParser CreateHTTPRequestParser(IHTTPRequestProcessor requestProcessor, IRequestParser CorSuccessor,
			IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration, IRequestFactory requestFactory);


		/// <summary>
		/// Creates a FTPRequestParser. This component can handle requests in a Chain Of Responsibility (COR).
		/// </summary>
		/// <param name="requestProcessor">The component used as FTPRequestProcessor.</param>
		/// <param name="CorSuccessor">The successor in the COR to handle requests by using the IRequestParser-Interface.</param>
		/// <returns>FTPRequestParser</returns>
		IRequestParser CreateFTPRequestParser(IFTPRequestProcessor requestProcessor, IRequestParser CorSuccessor, 
			IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration);


		/// <summary>
		/// This parser does not use other components as it catches errors on parsing the request in the COR. This
		/// means that it is a error-handler of streams that cannot be parsed. It should be the last link in the COR.
		/// </summary>
		/// <returns>ErrorRequestParser</returns>
		IRequestParser CreateDefaultRequestParser(IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration);

		#endregion

		#region RequestProcessors


		/// <summary>
		/// Creates a BibTeXProvider. This component makes a bibtex-db accessible.
		/// </summary>
		/// <param name="CorSuccessor">COR-Successor to process HTTPRequest.</param>
		/// <param name="webserverMonitor">Writes Log-Information to this monitor.</param>
		/// <param name="webserverConfiguration">The Configuration of the actual webserver.</param>
		/// <returns>BibTeXProvider</returns>
		IHTTPRequestProcessor CreateBibTeXProvider(IHTTPRequestProcessor CorSuccessor, IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration, IHTTPRequestProcessorTools requestProcessorTools);


		/// <summary>
		/// Creates a SimpleTemplateFileProvider.
		/// </summary>
		/// <param name="CorSuccessor">COR-Successor to process HTTPRequest.</param>
		/// <param name="webserverMonitor">Writes Log-Information to this monitor.</param>
		/// <param name="webserverConfiguration">The Configuration of the actual webserver.</param>
		/// <returns>SimpleTemplateFileProvider</returns>
		IHTTPRequestProcessor CreateSimpleTemplateFileProvider(IHTTPRequestProcessor CorSuccessor, IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration, IHTTPRequestProcessorTools requestProcessorTools);


		/// <summary>
		/// Creates a StaticFileProvider.
		/// </summary>
		/// <param name="CorSuccessor">COR-Successor to process HTTPRequest.</param>
		/// <param name="webserverMonitor">Writes Log-Information to this monitor.</param>
		/// <param name="webserverConfiguration">The Configuration of the actual webserver.</param>
		/// <returns>StaticFileProvider</returns>
		IHTTPRequestProcessor CreateStaticFileProvider(IHTTPRequestProcessor CorSuccessor, IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration, IHTTPRequestProcessorTools requestProcessorTools);


		/// <summary>
		/// Creates a StaticFileProvider.
		/// </summary>
		/// <param name="webserverMonitor">Writes Log-Information to this monitor.</param>
		/// <param name="webserverConfiguration">The Configuration of the actual webserver.</param>
		/// <param name="CorSuccessor">COR-Successor to process HTTPRequest.</param>
		/// <returns>StaticFileProvider</returns>
		IHTTPRequestProcessor CreateDynamicFileProvider(IHTTPRequestProcessor CorSuccessor, IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration, IHTTPRequestProcessorTools requestProcessorTools);


		/// <summary>
		/// This processor does not use other components as it catches errors on processing the request in the COR. This
		/// means that it is a error-handler of streams that cannot be processed. It should be the last link in the COR.
		/// </summary>
		/// <param name="webserverMonitor">Writes Log-Information to this monitor.</param>
		/// <param name="webserverConfiguration">The Configuration of the actual webserver.</param>
		/// <returns>DefaultRequestProcessor</returns>
		IHTTPRequestProcessor CreateDefaultRequestProcessor(IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration, IHTTPRequestProcessorTools requestProcessorTools);

		#endregion

		#region HTTPRequestProcessorTools

		/// <summary>
		/// Creates new <c>IHTTPRequestProcessorTools</c>.
		/// </summary>
		/// <param name="webserverMonitor"></param>
		/// <param name="webserverConfiguration"></param>
		/// <returns></returns>
		IHTTPRequestProcessorTools CreateRequestProcessorTools(IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration);

		#endregion

		#region WebserverConfiguration

		/// <summary>
		/// Creates new <c>IWebserverConfiguration</c>.
		/// </summary>
		/// <param name="configReader"></param>
		/// <param name="pathToConfigFile"></param>
		/// <param name="xmlConfigFile"></param>
		/// <returns></returns>
		IWebserverConfiguration CreateWebserverConfiguration(IConfigReader configReader, string pathToConfigFile, string xmlConfigFile);

		#endregion

	}
}
