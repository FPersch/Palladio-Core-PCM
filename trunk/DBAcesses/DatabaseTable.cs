using System.Collections;

namespace DBAcesses
{
	/// <summary>
	/// Zusammenfassung f�r DatabaseTable.
	/// </summary>
	public class DatabaseTable
	{
		private string tableName;
		private IList entries;

		public DatabaseTable()
		{
			//
			// TODO: F�gen Sie hier die Konstruktorlogik hinzu
			//
		}

		public string TableName
		{
			get { return this.tableName; }
			set { this.tableName = value; }
		}

		public IList Entries
		{
			get { return this.entries; }
			set { this.entries = value; }
		}
	}

}