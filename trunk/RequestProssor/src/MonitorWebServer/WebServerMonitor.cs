using System;
using System.Collections;
using System.IO;
using DBAcesses;

namespace RequestProssor.MonitorWebServer
{
	/// <summary>
	/// Zusammenfassung f�r TestingEventListener.
	/// </summary>
	public class WebServerMonitor
	{
		private int LogFileCounter;
		private int requestToWrite;
		private int FileCount;
		private string log;
		private IList tempLog;
		private DBAcessComponent db;

		public WebServerMonitor()
		{
			this.LogFileCounter = 0;
			this.FileCount = 0;
			this.requestToWrite = 10000;
			this.log = "";
			this.tempLog = new ArrayList();
			this.db = new DBAcessComponent();
		}

		public void ServedRequestReciver(Monitor sender, RequestServedEventArgs e)
		{
			Console.WriteLine("habe ein Event bekommen!");

			TimeSpan duration = ComputeRoundTripTime(e.ServedRequest.ArrivalTime);
			WriteText(e.ServedRequest.URI + ";" + e.ServedRequest.FileExtension + ";" + duration.Seconds + "," + duration.Milliseconds + ";" + e.ServedResponse.FileSize);
			//			WriteText(DateTime.Now+";"+e.ServedRequest.URI+";"+duration.ToString());

			//AddCurrentRequestToTempLog(e.ServedRequest.URI,e.ServedRequest.FileExtension,duration.Seconds+","+duration.Milliseconds,e.ServedResponse.FileSize);
		}

		public void AddCurrentRequestToTempLog(string uri, string fileEx, string time, int fileSize)
		{
			ArrayList temp = new ArrayList(4);
			temp.Add(uri);
			temp.Add(fileEx);
			temp.Add(time);
			temp.Add(fileSize.ToString());
			this.tempLog.Add(temp);
			this.LogFileCounter++;
			if (this.LogFileCounter == this.requestToWrite)
			{
				WriteToDB();
			}
		}

		protected void WriteToDB()
		{
			IList log = this.tempLog;
			foreach (string s in log)
			{
				Hashtable ht = new Hashtable();
				string[] al = s.Split(';');
				ht.Add("uri", al[0].ToString());
				ht.Add("filetype", al[1].ToString());
				ht.Add("roundtriptime", al[2].ToString());
				ht.Add("filesize", al[3].ToString());
				ht.Add("dateTime", DateTime.Now.ToString());
				db.InsertRow("UserStatistics", ht, "db", "ddsddd");
			}
			this.LogFileCounter = 0;
		}

		internal TimeSpan ComputeRoundTripTime(DateTime arrival)
		{
			DateTime now = DateTime.Now;

			int days = now.Day - arrival.Day;
			int hour = now.Hour - arrival.Hour;
			int min = now.Minute - arrival.Minute;
			int sec = now.Second - arrival.Second;
			int mil = now.Millisecond - arrival.Millisecond;

			TimeSpan da = new TimeSpan(days, hour, min, sec, mil);
			Console.WriteLine(da.Duration());

			return new TimeSpan(days, hour, min, sec, mil).Duration();
		}

		internal string NowToString()
		{
			string da = DateTime.Now.Hour + "-" + DateTime.Now.Minute + "-" + DateTime.Now.Second;
			return da;
		}

		public void ServerShutdown(Monitor sender)
		{
			StreamWriter writer = new StreamWriter(NowToString() + "logLastLogs.csv");
			writer.WriteLine(log);
			writer.Flush();
			writer.Close();
			Console.WriteLine("Logs written - Server can be closed ....................");
		}


		internal void WriteText(string s)
		{
			this.tempLog.Add(s);
			this.LogFileCounter++;
			if (this.LogFileCounter >= this.requestToWrite)
				this.WriteToDB();
			try
			{
				StreamWriter w = File.AppendText("LoggingMonitor.csv");


				Log(s, w);
				// Close the writer and underlying file.
				w.Close();
			}
			catch (Exception)
			{
				Console.WriteLine("Log Lost");
			}
		}

		public static void Log(String logMessage, TextWriter w)
		{
			w.WriteLine(logMessage);
			// Update the underlying file.
			w.Flush();
		}

		internal void StoreLog()
		{
			string text = this.log;
			this.log = "";

			StreamWriter writer = new StreamWriter("log" + this.FileCount + ".csv");
			writer.WriteLine("URI;Fileextension;Servetime;Size in Bytes");
			writer.WriteLine(text);
			writer.Flush();
			writer.Close();
			this.LogFileCounter = 0;
			this.FileCount++;
		}

		public static void DumpLog(StreamReader r)
		{
			// While not at the end of the file, read and write lines.
			String line;
			while ((line = r.ReadLine()) != null)
			{
				Console.WriteLine(line);
			}
			r.Close();
		}

	}
}