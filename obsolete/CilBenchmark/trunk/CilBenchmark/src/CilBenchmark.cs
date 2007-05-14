using System;

namespace CilBenchmark
{
	/// <summary>
	/// Zusammenfassung f�r Main.
	/// </summary>
	public class CilBenchmark
	{
		[STAThread]
		static void Main(string[] args)
		{
			try
			{
				Program prog = new Program();
				prog.Start(args);

			} catch (Exception e)
			{
				Console.WriteLine("Fatal Error: " + e.Message);
			} finally
			{
				Console.ReadLine();				
			}
		}
	}
}
