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
			return	"data source=134.106.27.36;" + 
					"database=WebAudioStore;" +
					"user id=root;"+
					"password=myonjupsql17;";
		}
	}
}
