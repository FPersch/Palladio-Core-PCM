using System;
using System.Collections;

namespace ILBenchmark
{
	/// <summary>
	/// Die Klasse BenchmarkSuite enth�lt die auszuf�hrenden Benchmarks. Sie wird an einen 
	/// BenchmarkContainer zur Ausf�hrung �bergeben.
	/// </summary>
	public class BenchmarkSuite
	{
		private ArrayList _bench;

		/// <summary>
		/// Standartkonstruktor
		/// </summary>
		public BenchmarkSuite()
		{
			_bench = new ArrayList();
		}
		/// <summary>
		/// F�gt einen Benchmark zur Suite hinzu
		/// </summary>
		/// <param name="b">Der Benchmark der hinzugef�gt werden soll.</param>
		public void Add(Benchmark b)
		{
			_bench.Add(b);
		}
		/// <summary>
		/// Entfernt den angegebenen Benchmark aus der Suite.
		/// </summary>
		/// <param name="b">Der Benchmark der entfernt werden soll.</param>
		public void Remove(Benchmark b)
		{
			_bench.Remove(b);
		}
		/// <summary>
		/// Gibt die Anzahl der Benchmarks in der Suite zur�ck
		/// </summary>
		public int Count
		{
			get { return _bench.Count; }
		}
		/// <summary>
		/// Standarteigenschaft. Gibt den Benchmark am angegebenen Index zur�ck.
		/// </summary>
		public Benchmark this[int index]
		{
			get { return (Benchmark)_bench[index]; }
			set { _bench[index] = value; }
		}

	}
}