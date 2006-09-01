using System;

namespace ILBenchmark.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r IOutput.
	/// </summary>
	public interface IOutput
	{
		void Init();
		void WriteResult(string Name, long Result);
		void WriteMissingParameter(string Name);
		void WriteSkip(string Name);
		void Save();
	}
}
