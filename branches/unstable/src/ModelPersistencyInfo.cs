using System;

namespace Palladio.ComponentModel
{
	/// <summary>
	/// Zusammenfassung f�r ModelPersistencyInfo.
	/// </summary>
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
