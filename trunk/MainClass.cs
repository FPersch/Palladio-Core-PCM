using System;
using Palladio.ComponentModel;

namespace Palladio.CM.Example
{
	/// <summary>
	/// Zusammenfassung f�r Class1.
	/// </summary>
	class Class1
	{
		/// <summary>
		/// Der Haupteinstiegspunkt f�r die Anwendung.
		/// </summary>
		[STAThread]
		static void Main(string[] args)
		{
			ICompositeComponent example = (ICompositeComponent)CMBuilder.CreateCompositeComponent();
			CompositeComponentVisitor visitor = new CompositeComponentVisitor(example,"P1");
			Console.ReadLine();
		}
	}
}
