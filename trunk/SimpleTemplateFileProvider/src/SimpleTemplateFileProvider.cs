using System;
using System.Collections;
using System.Diagnostics;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using Altova.Xml;
using Palladio.Webserver.ConfigReader;
using Palladio.Webserver.HTTPRequestProcessor;
using Palladio.Webserver.Request;
using Palladio.Webserver.WebserverMonitor;
using SimpleTemplateFileProviderXML;

namespace Palladio.Webserver.SimpleTemplateFileProvider
{
	/// <summary>
	/// SimpleTemplateFileProvider. Using the variables-names of the request (POST and GET) this component replaces
	/// all occurences of the variables-names surrounded by defined delimiters (definition in SimpleTemplateFileProvider.xml)
	/// by their given values.
	/// This component only handles the requests for the file-types specified in its config-xml-file. Other requests are
	/// passed to the COR-Successor.
	/// </summary>
	/// 
	/// 
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.2  2004/11/06 18:09:28  kelsaka
	/// Changed handling of delimiters for variables in template-files.
	///
	/// Revision 1.1  2004/11/05 16:17:01  kelsaka
	/// Added support for simple dynamic content (SimpleTemplateFileProvider). For this added a new xml-config-file and auto-generated XML-classes.
	/// Code refactoring.
	///
	/// </pre>
	/// </remarks>
	public class SimpleTemplateFileProvider : IHTTPRequestProcessor
	{
		private IWebserverConfiguration webserverConfiguration;
		private IWebserverMonitor webserverMonitor;
		private IHTTPRequestProcessor corSuccessor;
		private SimpleTemplateFileProviderConfiguration simpleTemplateConfiguration;
		private IHTTPRequestProcessorTools requestProcessorTools;

		/// <summary>
		/// (Relative) Path to the xml-config-file. All other settings should be read out from the xml-file.
		/// </summary>
		private const string DEFAULT_XML_CONFIGURATION_FILE = "SimpleTemplateFileProviderXML.xml";
		

		public SimpleTemplateFileProvider(IHTTPRequestProcessor corSuccessor, IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration)
		{
			this.corSuccessor = corSuccessor;
			this.webserverMonitor = webserverMonitor;
			this.webserverConfiguration = webserverConfiguration;
			this.simpleTemplateConfiguration = readConfiguration();
			this.requestProcessorTools = new DefaultHTTPRequestProcessorTools(webserverMonitor, webserverConfiguration);
		}





		/// <summary>
		/// Proceeds on creating a answer to the httpRequest.
		/// </summary>
		/// <param name="httpRequest">The HTTP-Request.</param>
		public void handleRequest (IHTTPRequest httpRequest)
		{
			if (!HasRequestFileTypeToBeHandled(httpRequest))
			{
				// As the extension (indentified by the file-type (e. g. ".html")) shall not be handled
				// by the SimpleTemplateProvider - Call the COR-Successor.
				corSuccessor.handleRequest(httpRequest);
				return;
			}


			// Path to the requestedFile:
			string completePath = requestProcessorTools.BuildCompletePath(httpRequest.RequestedDirectoyName);
			if(!Directory.Exists(completePath))
			{	
				corSuccessor.handleRequest(httpRequest);
				return;
			}



			// The filename effectively requested by the client.
			// E. g. if only a directoy is specified this is the default filename:
			if(!File.Exists(completePath + httpRequest.RequestedFileName))
			{	
				corSuccessor.handleRequest(httpRequest);
				return;
			}

			webserverMonitor.WriteLogEntry("Full filename and path effectively requested: " + completePath + httpRequest.RequestedFileName);

			// The MimeType of the requested File.
			string fileMimeType = requestProcessorTools.GetFileMimeTypeFor(httpRequest.RequestedFileType);
			webserverMonitor.WriteLogEntry("Mime Type found: " + fileMimeType);






			// Open and read the source-file:
			byte[] fileContent = requestProcessorTools.OpenFile (completePath, httpRequest.RequestedFileName);
			string fileContentString = Encoding.ASCII.GetString(fileContent);

	
			// create the response-content and send it to the client:
			CreateDynamicContentAndDeliverFile (fileContentString, httpRequest, fileMimeType);


		}


		/// <summary>
		/// Uses the template-replacing for the variables names to create the dynamic content. Searches for all 
		/// occurences of [VariablesNameDelimiter][VariablesName][VariablesNameDelimiter] an replaces them by variables-values.
		/// </summary>
		/// <param name="fileContentString">String representing the file content.</param>
		/// <param name="httpRequest">The HTTPRequest.</param>
		/// <param name="fileMimeType">The recognized mime-type.</param>
		private void CreateDynamicContentAndDeliverFile (string fileContentString, IHTTPRequest httpRequest, string fileMimeType)
		{
			string searchString;
			string key;
			string value;
			IEnumerator enumer = httpRequest.POSTHashtable.GetEnumerator();

			// iterates over all variables-names and replaces the keys by their values.			
			while(enumer.MoveNext())
			{
				key = (string)((DictionaryEntry)enumer.Current).Key;
				value = (string)((DictionaryEntry)enumer.Current).Value;
				
				//TODO: unescape value-chars from URI-Encoding.
/*
				Encoding encoding = Encoding.ASCII;
				Encoder encoder = encoding.GetEncoder();

				string tt = "asd wie geht es �belkeit? 22^3.";
				Console.WriteLine(tt + " |||| " + Regex.Escape(tt) + " |||| " + Regex.Unescape(tt));

				
				Console.WriteLine(" unescpaed- "  + Regex.Unescape(value)); */
				//Console.WriteLine(" unescpaed- "  + Encoding.UTF8.GetString(b));

				searchString = simpleTemplateConfiguration.VariablesNameDelimiter + key + simpleTemplateConfiguration.VariablesNameDelimiter;
				fileContentString = fileContentString.Replace(searchString, value);
			}
	
	
	
			requestProcessorTools.SendHTTPHeader(httpRequest.HttpVersion, fileMimeType, fileContentString.Length, "200 OK", httpRequest.Socket);
			requestProcessorTools.SendContentToClient(fileContentString, httpRequest.Socket);
			webserverMonitor.WriteLogEntry("Successfully sent response to client.");
		}



		/// <summary>
		/// Checks the file-extensions that are associated to this component and compares it with the file-type
		/// of the request.
		/// </summary>
		/// <param name="httpRequest">httpRequest containing the file-extensions.</param>
		/// <returns>true, if extension has to be handled; false else.</returns>
		private bool HasRequestFileTypeToBeHandled (IHTTPRequest httpRequest)
		{
			for(int x = 0; x < simpleTemplateConfiguration.HandledFileExtensions.Length; x++)
			{
				if(simpleTemplateConfiguration.HandledFileExtensions[x] == httpRequest.RequestedFileType)
				{
					return true;
				}				
			}
			return false;
		}


		/// <summary>
		/// Reads the configuration at the specified path and creates a SimpleTemplateFileProviderConfiguration out of the
		/// information read.
		/// </summary>
		/// <returns></returns>
		private SimpleTemplateFileProviderConfiguration readConfiguration ()
		{
			SimpleTemplateFileProviderXMLDoc doc = new SimpleTemplateFileProviderXMLDoc();
			doc.SetRootElementName("", "Config");

			ConfigType root = new ConfigType();

			try 
			{
				root = new ConfigType(doc.Load(webserverConfiguration.ConfigFilesPath + DEFAULT_XML_CONFIGURATION_FILE));
			}
			catch (FileNotFoundException e)
			{
				webserverMonitor.WriteDebugMessage(e.ToString(), 1);
			}
			catch (XmlException e)
			{
				webserverMonitor.WriteDebugMessage(e.ToString(), 1);
			}

			return new SimpleTemplateFileProviderConfiguration(root);
		}


	}
}
