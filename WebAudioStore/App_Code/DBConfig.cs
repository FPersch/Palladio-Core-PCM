using System;

namespace WebAudioStore
{
	/// <summary>
	/// Zusammenfassung f�r DBConfig.
	/// </summary>
	public class DBConfig
	{
		public DBConfig()
		{
			//
			// TODO: F�gen Sie hier die Konstruktorlogik hinzu
			//
		}

		public static String GetConnectionString()
		{
			return	"data source=141.3.52.17;" + 
					"database=WebAudioStore;" +
					"user id=audioweb;"+
					"password=webaudio;";
		}
	}
}
