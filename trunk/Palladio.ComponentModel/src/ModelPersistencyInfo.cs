using System;

namespace Palladio.ComponentModel
{
	/// <summary>
	/// Zusammenfassung f�r ModelPersistencyInfo.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.1  2005/02/21 13:50:51  joemal
	/// initial import
	///
	///
	/// </pre>
	/// </remarks>
	public class ModelPersistencyInfo
	{
		public static ModelPersistencyInfo ATTACHED = new ModelPersistencyInfo();

		private string repository;
		private string username;
		private string password;
		// ...


		public ModelPersistencyInfo()
		{
			//
			// TODO: F�gen Sie hier die Konstruktorlogik hinzu
			//
		}
	}
}
