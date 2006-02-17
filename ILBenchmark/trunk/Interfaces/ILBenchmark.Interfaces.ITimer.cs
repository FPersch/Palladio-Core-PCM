using System;

namespace ILBenchmark.Interfaces
{
	/// <summary>
	/// Zusammenfassung f�r ITimer.
	/// </summary>
	public interface ITimer
	{
		void Start();
		void Stop();
		long getElapsedTime
		{
			get;
		}
	}
}
