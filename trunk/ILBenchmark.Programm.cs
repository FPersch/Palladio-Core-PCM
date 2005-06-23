using System;

namespace ILBenchmark
{
	/// <summary>
	/// Zusammenfassung f�r Class1.
	/// </summary>
	class Programm
	{
		/// <summary>
		/// Der Haupteinstiegspunkt f�r die Anwendung.
		/// </summary>
		[STAThread]
		static void Main(string[] args)
		{
			//Hier Auswertung der Kommandozeileneingabe
			BenchmarkSuiteInit init = new BenchmarkSuiteInit();
			BenchmarkSuite suite = init.getStandart();
			//BenchmarkSuite suite = init.getAllInMSCoreLib();
			BenchmarkContainer container = new BenchmarkContainer(1000000);
			container.Timer = new StandartTimer();
			container.Output = new ConsoleOutput();
			container.Execute(suite);
			Console.ReadLine();
		}
	}
}
