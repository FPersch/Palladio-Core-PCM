using System;
using System.IO;
using Request;
using Delivery;
using System.Text;

namespace StaticFileProvider
{
	/// <summary>
	/// Zusammenfassung f�r Class1.
	/// </summary>
	public class StaticFileProviderComponent : IResponseHandler
	{
		IResponseHandler sucessor;
		HttpRequest request;
		string path;
		int fileSize;
		byte[] response;
		private string statusCode;

		public byte[] GetResponse
		{
			get
			{
				return this.response;
			}
		}

		public int GetFileSize
		{
			get
			{
				return this.fileSize;
			}
		}

		public StaticFileProviderComponent()
		{
			statusCode = " 200 OK ";
		}


		public IResponseHandler GetResponsibleHandler(HttpRequest r,string path)
		{
			this.request = r;
			this.path = path;
			if(IsResponsible(this.request,this.path))
			{
				GetResponseByte();
				return this;
			}
			else 
			{
				return this.sucessor.GetResponsibleHandler(r,path);
			}
		}

		public Stream GetResponseStream()
		{
			FileStream fs = new FileStream(this.path, FileMode.Open, 	FileAccess.Read, FileShare.Read);
			return fs;
		}

		public byte[] GetFile(string tempPath)
		{
			FileStream fs = new FileStream(tempPath, FileMode.Open, 	FileAccess.Read, FileShare.Read);
			string 	sResponse="";
			int iTotBytes=0;
			BinaryReader reader = new BinaryReader(fs);
			byte[] bytes = new byte[fs.Length];
			int read;
			while((read = reader.Read(bytes, 0, bytes.Length)) != 0) 
			{
				// Read from the file and write the data to the network
				sResponse = sResponse + Encoding.ASCII.GetString(bytes,0,read);
				iTotBytes = iTotBytes + read;
			}
			reader.Close(); 
			fs.Close();
			return bytes;
		}
		protected void GetResponseByte()
		{
			
			FileStream fs = new FileStream(this.path, FileMode.Open, 	FileAccess.Read, FileShare.Read);
			
			// Create a reader that can read bytes from the FileStream.

			string 	sResponse="";
			int iTotBytes=0;
			BinaryReader reader = new BinaryReader(fs);
			byte[] bytes = new byte[fs.Length];
			int read;
			while((read = reader.Read(bytes, 0, bytes.Length)) != 0) 
			{
				// Read from the file and write the data to the network
				sResponse = sResponse + Encoding.ASCII.GetString(bytes,0,read);
				iTotBytes = iTotBytes + read;
			}
			reader.Close(); 
			fs.Close();
		
			this.response = bytes;
			this.fileSize = iTotBytes;
						
			//mySocket.Send(bytes, bytes.Length,0);

		}



		public DateTime LastModified()
		{
			return DateTime.Now;
		}

		public IResponseHandler Sucessor
		{
			get{ return this.sucessor;}
			set{ this.sucessor = value;}
		}

		public string StatusCode
		{
			get { return statusCode; }
		}

		private bool IsResponsible(HttpRequest r,string path)
		{
			return ((r.RequestedMethod=="GET") && (r.UserInput==null) && File.Exists(path));
		}
	}
}
