using System;
using System.Collections;

namespace FSM
{
	/// <summary>
	/// Zusammendfassende Beschreibung f�r Setters.
	/// </summary>
	public class Setters
	{	

		protected Hashtable transitions;
		protected Set inputAl;
		
		public Setters()
		{
			this.transitions = new Hashtable();
			this.inputAl = new Set();
			
		}

		public void setTransition(Transition tr)
		{	
			
			if(this.transitions[tr.fromState.GetHashCode()] == null)
			{	
				this.transitions.Add(tr.fromState.GetHashCode(), tr);
				this.inputAl.AddE(tr.input);
				//Console.WriteLine(tr.input.ToString() +" zu inputAl hinzugef�gt");
			}
			else
			{
				int store = tr.fromState.GetHashCode();
				Set help = new Set();
				Object tmp = this.transitions[tr.fromState.GetHashCode()];
				if(tmp is Transition)
				{
					help.AddE(tmp);
					help.AddE(tr);
					//Dann sp�ter besser beim Suchen
					help.Sort();
					this.transitions.Remove(store);
					this.transitions.Add(store, help);
					//Console.WriteLine("Habe ein Set angelegt und transition hinzugef�gt!");
				}
					//ist schon menge
				else if(tmp is Set)
				{
					help = (Set) tmp;
					help.AddE(tr);
					//Console.WriteLine("Habe Set gefunden und Transition hinzugef�gt");
				}
				else
					throw new ProgrammingErrorException();
				//inputAl pflegen
				this.inputAl.AddE(tr.input);
				//Console.WriteLine(tr.input.ToString()+ " hinzugef�gt in inputAl");
				this.inputAl.Sort();
			}
					
			
		}
		public void setTransitions(Transition[] tr)
		{	
			foreach (Transition t in tr)
				this.setTransition(t);
		}
	
		public Hashtable getTransitions()
		{
			return this.transitions;
		}

		public Set getInputAl()
		{
			return this.inputAl;
		}
	}
}
