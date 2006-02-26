using System;
using System.Collections;
using System.IO;
using System.Net.Sockets;
using System.Text;
using System.Web;
using Palladio.Webserver.ConfigReader;
using Palladio.Webserver.Request;
using Palladio.Webserver.WebserverMonitor;

namespace Palladio.Webserver.HTTPRequestProcessorTools
{
	/// <summary>
	/// DefaultHTTPRequestProcessorTools. The default implementation.
	/// This implementation should be the last entry in pipe and filter architecture as it
	/// sends content to the client.
	/// </summary>
	/// 
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.1  2005/05/01 17:23:26  kelsaka
	/// - added further documentation
	/// - extracted IHTTPRequestProcessorTools as own project
	/// - made server name configureable by config files
	///
	/// Revision 1.9  2005/05/01 10:41:05  kelsaka
	/// - added gzip file compression
	///
	/// Revision 1.8  2005/04/30 12:38:24  kelsaka
	/// - extended cvs ignore lists
	/// - added first version of zip compressing request processor tools
	///
	/// Revision 1.7  2005/01/29 21:47:44  kelsaka
	/// Added continuous use of NetworkStream (instead of Socket)
	///
	/// Revision 1.6  2004/12/15 00:32:33  sliver
	/// Thread handling changed:
	///   Instead of calling the Thread.Abort() method, each
	///   thread instance contains a variable IsRunning which is
	///   checked after each iteration through the loop.
	///   If it is set to false, the tread terminates. This has been introduced to
	///   establish a clean thread exit. The call of the Abort () method causes
	///   an exeption in the aborted thread. This execption is forwarded through
	///   the whole call stack, even if it is catched. So, every method on the stack
	///   is informed about the thread exit. However, this causes some trouble
	///   for the logging of the Webserver behaviour. Furthermore, the
	///   Thread.Abort() and Thread.Interrupt() methods do not terminate
	///   threads that are blocked. The call of the method TcpListener.AcceptSocket()
	///   blocks the thread until a new connection is opened. So, the running
	///   threads are not aborted until a new connection is opened.
	///
	///  Now, we proceed as follows to terminate the Webserver. For all
	///  listening treads, we set the IsRunning variable to false. Next, we need
	///  to unblock the threads. Therfore, we open a dummy connection to the
	///  IP and port the tread is listening on. When re-iterating the the loop, the
	///  check of the IsRunning variable causes the thread to terminate.
	///
	/// ListeningTread war renamed to PortListener
	/// interfaces 'IPortListener' and IBibTexDB' added
	///
	/// Revision 1.5  2004/11/05 16:17:01  kelsaka
	/// Added support for simple dynamic content (SimpleTemplateFileProvider). For this added a new xml-config-file and auto-generated XML-classes.
	/// Code refactoring.
	///
	/// Revision 1.4  2004/10/31 16:30:40  kelsaka
	/// preparing parsing of post-requests
	///
	/// Revision 1.3  2004/10/30 15:24:39  kelsaka
	/// webserverMonitor-Output on console; documentation (doc) update
	///
	/// Revision 1.2  2004/10/30 11:42:08  kelsaka
	/// Added full support for static websites using the get-method; added several test-documents; changed CoR for HTTP-Processing: dynamic files are delivered first
	///
	/// </pre>
	/// </remarks>
	public class DefaultHTTPRequestProcessorTools : IHTTPRequestProcessorTools
	{

		private IWebserverConfiguration webserverConfiguration;
		private IWebserverMonitor webserverMonitor;
		private String headerExtensionsString;
		private Hashtable headerExtensionsTable;

		/// <summary>
		/// Default constructor.
		/// </summary>
		/// <param name="webserverMonitor">monitor to use.</param>
		/// <param name="webserverConfiguration">the actual webserver configuration.</param>
		public DefaultHTTPRequestProcessorTools(IWebserverMonitor webserverMonitor, IWebserverConfiguration webserverConfiguration)
		{
			this.webserverConfiguration = webserverConfiguration;
			this.webserverMonitor = webserverMonitor;

			Init ();
		}

		/// <summary>
		/// Sets the default header information.
		/// </summary>
		private void Init ()
		{
			this.headerExtensionsString = String.Empty;
			this.headerExtensionsTable = new Hashtable();

			// default header settings
			AppendToHeader("Server", webserverConfiguration.ServerName); //the servers name
			AppendToHeader("Accept-Ranges", "bytes");
		}

		#region http header and content

		#region extra header information

		/// <summary>
		/// Append the given key value pair to the HTTP-header. Only extra information is allowed
		/// as a default header is already set. See <a href="http://www.faqs.org/rfcs/rfc2616.html">RFC</a>
		/// for more information.
		/// </summary>
		/// <param name="key">The key to use.</param>
		/// <param name="value">The value to set.</param>
		/// <remarks>Appends a line like "key: value". If a key already exists it will be overwritten.</remarks>
		public void AppendToHeader(string key, string value)
		{
			if(headerExtensionsTable.ContainsKey(key))
			{
				headerExtensionsTable.Remove(key);
			}
			headerExtensionsTable.Add(key, value);
		}

		/// <summary>
		/// Removes a key value pair from the HTTP header.
		/// </summary>
		/// <param name="key">The key of the key value pair to remove.</param>
		public void RemoveFromHeader(string key)
		{
			headerExtensionsTable.Remove(key);
		}

		/// <summary>
		/// builds a string of key value pairs for the http header.
		/// </summary>
		private string HeaderExtensions
		{
			get
			{
				this.headerExtensionsString = "";
				foreach(DictionaryEntry e in headerExtensionsTable)
				{
					this.headerExtensionsString += e.Key + ": " + e.Value + "\r\n";
				}
				this.headerExtensionsString += "\r\n"; //required to end header
				return this.headerExtensionsString;
			}
		}

		#endregion

		/// <summary>
		/// Generates a standard HTTP-Error and sends it to the client.
		/// </summary>
		/// <param name="httpRequest">From the Client-Request.</param>
		/// <param name="errorMessage">The error Message to display to the client.</param>
		/// <param name="errorCode">The HTTP-Error-Code</param>
		public void SendHTTPError(IHTTPRequest httpRequest, string errorMessage, string errorCode)
		{
			webserverMonitor.WriteLogEntry("HTTP-Error Code " + errorCode + " | " + errorMessage);

			//Format The Message
			SendHTTPHeader(httpRequest.HttpVersion, "", errorMessage.Length, errorCode, httpRequest.NetworkStream);

			//Send to the browser
			SendContentToClient(errorMessage, httpRequest.HttpVersion, GetFileMimeTypeFor(""), httpRequest.NetworkStream);
		}

		/// <summary>
		/// Sends the data to the client.
		/// </summary>
		/// <param name="contentData">String that contains the answer to the client request.</param>
		/// <param name="httpVersion">HTTP Version</param>
		/// <param name="mimeType">Mime Type of the content</param>
		/// <param name="networkStream">NetworkStream reference</param>
		public void SendContentToClient (string contentData, string httpVersion, string mimeType, Stream networkStream)
		{
			// convert string into byte-array so that it can be sent.			
			SendContentToClient(Encoding.ASCII.GetBytes(contentData), httpVersion, mimeType, networkStream);
		}

		/// <summary>
		/// Sends the data to the client. The byte-array might be used for binary data.
		/// </summary>
		/// <param name="contentDataBytes">Byte-array that contains the answer to the client request.</param>
		/// <param name="httpVersion">HTTP Version</param>
		/// <param name="mimeType">Mime Type of the content</param>
		/// <param name="networkStream">NetworkStream reference</param>
		public void SendContentToClient (byte[] contentDataBytes, string httpVersion, string mimeType, Stream networkStream)
		{				
			this.SendHTTPHeader(httpVersion, mimeType, contentDataBytes.Length, "200 OK", networkStream);
			SendDataToClient (contentDataBytes, networkStream);
		}

		/// <summary>
		/// This method sends the header information to the client.
		/// </summary>
		/// <param name="httpVersion">HTTP Version</param>
		/// <param name="mimeType">Mime Type of the content</param>
		/// <param name="totalBytes">Total Bytes to be sent in the body</param>
		/// <param name="httpStatusCode">Status Code of the HTTP-Answer.</param>
		/// <param name="networkStream">networkStream reference</param>
		private void SendHTTPHeader(string httpVersion, string mimeType, int totalBytes, string httpStatusCode, Stream networkStream)
		{
			// the default preamble - not a key value pair:
			if(httpStatusCode != "")
			{
				httpStatusCode = " " + httpStatusCode; //add space between httpVersion and httpStatusCode
			}
			string headerContent = "";
			headerContent += httpVersion + httpStatusCode + "\r\n";

			// put further content information to the header:
			AppendToHeader("Content-Type", mimeType);
			AppendToHeader("Content-Length", totalBytes.ToString());
			headerContent += HeaderExtensions;

			SendDataToClient(Encoding.ASCII.GetBytes(headerContent), networkStream);
		}

		/// <summary>
		/// Sends data to the client.
		/// </summary>
		/// <param name="contentDataBytes">The data to send.</param>
		/// <param name="networkStream">The stream to write on.</param>
		private void SendDataToClient (byte[] contentDataBytes, Stream networkStream)
		{
			if (networkStream.CanWrite)
			{
				try
				{
					// send data to client:
					networkStream.Write(contentDataBytes, 0, contentDataBytes.Length);
					webserverMonitor.WriteLogEntry("HIER: " + contentDataBytes.Length);
				}
				catch (IOException e)
				{
					webserverMonitor.WriteDebugMessage("Error: There is a failure while writing to the network: " + e, 1);	
				}
				catch (ObjectDisposedException e)
				{
					webserverMonitor.WriteDebugMessage("Error: The NetworkStream is closed. " + e, 1);	
				}
				catch (SocketException e)
				{
					webserverMonitor.WriteDebugMessage("Error: SocketException. " + e, e.ErrorCode);	
				}
				catch (Exception e)
				{
					webserverMonitor.WriteDebugMessage("Error: Error on sending data to client: " + e, 1);							
				}
			}
			else
			{
				webserverMonitor.WriteDebugMessage("Error: Can not write to NetworkStream.", 1);
			}
		}

		#endregion


		/// <summary>
		/// Build the path to the actually requested file, either a relative or absolute path.
		/// (Uses the documentRoot from the webserver-configuration to build the complete path.)
		/// </summary>
		/// <param name="requestedPath">Build the complete path for this part of the request.</param>
		/// <returns>Path to file / directory requested.</returns>
		public string BuildCompletePath(string requestedPath)
		{
			return webserverConfiguration.DocumentRoot + requestedPath;
		}

		/// <summary>
		/// Returns the the MimeType for the specified file-type.
		/// </summary>
		/// <param name="requestedFileType">For this filetype you get the mimetype.</param>
		/// <returns>The mimetype. If no fitting mimetype was found the default type is returned.</returns>
		public string GetFileMimeTypeFor (string requestedFileType)
		{
			string fileMimeType;
			// Get the MimeType
			try
			{
				fileMimeType = webserverConfiguration.GetMimeTypeFor(requestedFileType);	
			}
			catch (ExtensionNotFoundException)
			{
				fileMimeType = webserverConfiguration.DefaultMimeType; // default-mimetype from configuration.
			}
			return fileMimeType;
		}

		/// <summary>
		/// Opens the file given by the path and the filename.
		/// </summary>
		/// <param name="completePath">The complete path directing to the specified filename.</param>
		/// <param name="fileName">The Filename that shall be opened.</param>
		/// <returns>The file's content a byte-array.</returns>
		public byte[] OpenFile (string completePath, string fileName)
		{
			FileStream fileStream = new FileStream(completePath + fileName, FileMode.Open, FileAccess.Read, FileShare.Read);
	
			// Create a reader that can read bytes from the FileStream: especially required for binary-files.
			BinaryReader reader = new BinaryReader(fileStream);
			byte[] bytes = new byte[fileStream.Length];
			int read;
	
			while(true) 
			{
				read = reader.Read(bytes, 0, bytes.Length);

				if(read == 0) //file completely read - so break loop.
				{
					break;
				}
			}
			reader.Close(); 
			fileStream.Close();
			return bytes;
		}
	}
}
