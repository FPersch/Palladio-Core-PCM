using System;
using System.Reflection;
using System.Reflection.Emit;

namespace ILBenchmark
{
	/// <summary>
	/// Zusammenfassung f�r Benchmark.
	/// </summary>
	public abstract class Benchmark : MarshalByRefObject
	{
		protected TypeUndIL _til;
		protected string _name;
		protected Type _type;
		protected string _fullname;

		/// <summary>
		/// Standartkonstruktor
		/// </summary>
		public Benchmark()
		{
		}

		/// <summary>
		/// Die Methode stellt die Assembly per Reflection.Emit zusammen und setzt die interne Variable
		/// _type, so dass die Assembly von au�en aufgerufen werden kann.
		/// </summary>
		/// <returns>True, bei Erfolg, False falls es einem Fehler beim Erstellen des Codes gibt.</returns>
		public abstract bool AssembleCode();

		/// <summary>
		/// Gibt den Type, also quasi den Verweis auf den im Benchmark erstellten Typen zur�ck.
		/// Der Typ wird in der Routine AssembleCode erzeugt und an die interne Variable
		/// _type zugewiesen.
		/// </summary>
		/// <returns>Ein Type, der dann sp�ter aufgerufen werden kann.</returns>
		public Type getTypeForExecuting()
		{
			return _type;
		}
/// <summary>
/// Read Only, gibt den Namen der in diesem Benchmark verwendeten Assembly zur�ck.
/// </summary>
		public string Name
		{
			get { return _name; }
		}
		public string FullName
		{
			get { return _fullname; }
		}
/// <summary>
/// Speichert die im Speicher erzeugte Assembly.
/// </summary>
		public void Save()
		{
			try 
			{
				_til.AsmBuilder.Save(_name);
			} 
			catch (Exception e)
			{
				Console.WriteLine(e.Message);
			}
		}

	}
}
