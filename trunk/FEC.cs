using System;
using System.Collections;

namespace FSM
{
	/// <summary>
	/// This class allows to minimize and compares FSM
	/// </summary>
	public class FEC : FSM
	{
		protected FSM fsm;
		protected bool debug = !true;
		protected bool createsFsmDebug = !true;
		protected ArrayList groups;
		protected int zaehler;
		protected FSM minimized;
		protected int counterForNumberOfGroups;
		protected int actualGroupCounter;
		protected ArrayList mini;

		/// <summary>
		/// A temp Konstruktor
		/// </summary>
		public FEC()
		{
		}
		/// <summary>
		/// A temp Konstruktor
		/// </summary>
		/// <param name="notMin">A not minimized FSM, witch should be minimized</param>
		public FEC(FSM notMin)
		{
			this.fsm = notMin;
			this.groups = new ArrayList();
			this.Minimize(notMin);

			
			
			this.createNewFsm();
			Console.WriteLine("the new FSM");
			this.minimized.DisplayOnConsole();
//			if(this.debug)
//			{
				Console.WriteLine("After Minmasation the follwing groups exzits:");
				this.printGroups();
//			}
		}
		/// <summary>
		/// Compares two FSM and checks if they are equal
		/// Erstmal wird die Funktion nur alleine benutzt, ohne auf die Minimierung 
		/// zur�ck zu kommen. Deswegen wird auch zu Beginn der this.fsm verwendet.
		/// </summary>
		/// <param name="o"></param>
		/// <returns>true if they are equal</returns>
//		public bool Equal(Object o)
//		{
////			if(!(o is FSM || o is FEC))
////				return false;
//			FSM d = (FSM) o;
//			if(!(d.getInputAl().Equals(this.fsm)))
//				return false;
//			return true;
//		}
		/// <summary>
		/// Creates the minimized FSM
		/// </summary>
		protected void createNewFsm()
		{
			
			this.minimized = new FSM();
			int counter =0;
			State temp;
			ArrayList statesOfMini = new ArrayList();
			ArrayList oldStates = new ArrayList();
			foreach(ArrayList al in this.mini)
			{
				
				temp = (State) al[0];
				State state = new State("state_"+counter,temp.getStart(),temp.getFinal());
				statesOfMini.Add(state);
				oldStates.Add((State) al[0]);
				counter++;
			}
			statesOfMini.TrimToSize();
			if(this.createsFsmDebug)
			{
				Console.WriteLine("The states of the minimized FSM: ");
				foreach(State s in statesOfMini)
					Console.WriteLine(s.ToString());
				Console.WriteLine("-------------------------");
			}
			for(int i = 0;i<statesOfMini.Count; i++)
			{
				IEnumerator oldFsmInputIter = (IEnumerator)this.fsm.getInputAl().GetEnumerator();
				while(oldFsmInputIter.MoveNext())
				{
					State toState  = (State) this.fsm.getNextState((State)oldStates[i],
						(Input)oldFsmInputIter.Current);
		
					if(toState.Equals(fsm.getErrorState()))
						continue;
					ArrayList newGroups = this.inGroup(toState,this.groups);
					int indexOfStateToState = this.mini.IndexOf((ArrayList) 
						this.inGroup(toState,this.mini));
					this.minimized.setTransition((State) statesOfMini[i],
						(Input)oldFsmInputIter.Current,
						(State) statesOfMini[indexOfStateToState]);
				}
			}		
		}
		protected void RemoveErrorGroup(ArrayList g)
		{
			ArrayList erroG = new ArrayList();
			erroG.Add(this.fsm.getErrorState());
			erroG.TrimToSize();
			foreach(ArrayList al in g)
			{
				al.TrimToSize();
				foreach(State t in al)
				{
					if(t.Equals(fsm.getErrorState()))
					{
						g.Remove(al);
						return;
					}
				}
			}
					
		}
		/// <summary>
		/// Minimizes a FSM 
		/// </summary>
		/// <param name="fsm">The FSM witch should be minimized</param>
		protected  void Minimize(FSM fsm)
		{	
			this.initateGroups(fsm);
			bool furtherIteration = false;
			this.actualGroupCounter = 0;
			while(this.actualGroupCounter< this.groups.Count || furtherIteration)
			{
				furtherIteration = false;
				if(this.debug)
				{
					Console.WriteLine("Number of Groups: "
						+this.counterForNumberOfGroups.ToString());
					Console.WriteLine("this.actualGroupCounter is : "
						+this.actualGroupCounter.ToString());
					//this.printGroups();
				}
				State first = new State();
				State next = new State();
				ArrayList newGroup = new ArrayList();
				ArrayList actualGroup = (ArrayList) this.groups[this.actualGroupCounter];
				if(actualGroup.Count == 1)
				{
					this.actualGroupCounter++;
					continue;
				}
				actualGroup.TrimToSize();
				int lengthOfActualGroup = actualGroup.Count;
				first = (State) actualGroup[0];
				if(this.debug)
				{
					Console.WriteLine("First is : "+first.ToString());
				}
				for(int i=1; i< lengthOfActualGroup; i++)
				{
					next = (State) actualGroup[i];
					if(this.debug)
						Console.WriteLine("Next is : "+next.ToString());
					IEnumerator InputIter = fsm.getInputAl().GetEnumerator();
					//for each charakter
					while(InputIter.MoveNext())
					{
						Input currentInput = (Input) InputIter.Current;
						if(this.debug)
						{
							Console.WriteLine("Reached states: ");
							Console.WriteLine("Current Input: "+currentInput.ToString());
							Console.WriteLine("first leads to: "+
								fsm.getNextState(first,currentInput));
							Console.WriteLine("Next leads to: "+
								fsm.getNextState(next,currentInput));
						}
						if(!sameGroup(fsm.getNextState(first,currentInput),
							fsm.getNextState(next,currentInput),newGroup))
						{
							if(this.debug)
							{
								Console.WriteLine("States are not in the same Group");
							}
							if(!newGroup.Contains(next))
							{
								newGroup.Add(next);
								furtherIteration = true;
							}
							newGroup.TrimToSize();

						}
//						//for debuging
//						if(sameGroup(fsm.getNextState(first,currentInput),
//							fsm.getNextState(next,currentInput),newGroup))
//						{
//							
//						}
					}
				}
					//move elements
					if(newGroup.Count >0)
					{
						if(this.debug)
						{
							Console.WriteLine("A new group has been created, it contains: ");
							//this.printGroup(newGroup);
						}
						this.counterForNumberOfGroups++;
						this.groups.Add(newGroup);
						this.groups.TrimToSize();
						foreach(State s  in newGroup)
						{
							if(actualGroup.Contains(s))
							{
								actualGroup.Remove(s);
							}
						}
						actualGroup.TrimToSize();
						this.groups.Remove(this.actualGroupCounter);

						//the problem: that doesn't work!!
						//if(!this.groups.Contains(actualGroup))
							this.groups.Insert(this.actualGroupCounter,actualGroup);
					}
					this.actualGroupCounter++;
			}
			this.tidyUp();
		}
		/// <summary>
		/// A method for debugging, desplays all elements of this.groups on the console
		/// </summary>
		protected void printGroups()
		{
			foreach(ArrayList al in this.groups)
				this.printGroup(al);
		}

		/// <summary>
		/// checks if two states are in the same group
		/// </summary>
		/// <param name="first">the first state</param>
		/// <param name="next">the other state</param>
		/// <param name="newGroup">the new group, witch has been initatited during 
		/// group Iteration. The elements witch will be moved into the new group.
		/// </param>
		/// <returns>true, if the two given states are in the same group</returns>
		protected bool sameGroup(State first, State next, ArrayList newGroup)
		{
			if(inGroup(first,newGroup)==inGroup(next,newGroup))
				return true;
			return false;	
		}
		/// <summary>
		/// Delivers the group in witch a state is in
		/// </summary>
		/// <param name="state">the state witch group should be found</param>
		/// <param name="groups">a group witch has not jet been added to this.groups.
		/// it's the newGroup.
		/// <returns>A ArrayList from this.groups witch contains state</returns>
		protected ArrayList inGroup(State state, ArrayList groups)
		{
			if(groups.Contains(state))
				return groups;
//			if(groups.Contains(fsm.getErrorState()))
//			{
//				Console.WriteLine("in group has found ErrorState");
//				return groups;
//			}
			foreach(ArrayList al in this.groups)
			{
				foreach(State s in al)
					if(s.Equals(state))
						return al;
			}
			throw new ProgrammingErrorException();
		}

		/// <summary>
		/// After iteration there are double groups in this.groups and here this groups are removed
		/// </summary>
		protected void tidyUp()
		{
			ArrayList actualElement = new ArrayList();
			ArrayList newThisGroups = new ArrayList();
			ArrayList temp = new ArrayList();
			foreach(ArrayList al in this.groups)
			{
				if(!newThisGroups.Contains(al))
					newThisGroups.Add(al);
			}
			this.mini = newThisGroups;
			this.RemoveErrorGroup(this.mini);
			this.groups = this.mini;
		}
		/// <summary>
		/// Delivers the initail partions 
		/// </summary>
		public void initateGroups(FSM fsm)
		{

			ArrayList conclusion = new ArrayList();
			ArrayList final = new ArrayList();
			ArrayList notFinal = new ArrayList();

			//is uses when startstate == finalstate;
			ArrayList both = new ArrayList();

			//in the beginig of minimation there are  only 2 (3) partions, the acceptiong and non accepting.
			StateIterator iter = new StateIterator(fsm);
			State actualState = new State();
			while(iter.MoveNext())
			{
				both = null;
				actualState = (State) iter.Current;

//				//now useless
//				if(actualState.Equals(new State("ErrorState",false,false)))
//				{
//					if(debug)
//						Console.WriteLine("ErrorState in init found!");
//					
//				}
				if(actualState.getFinal())
				{
					if(actualState.getStart())
					{
						both = new ArrayList();
						both.Add(actualState);
						both.TrimToSize();
					}
					final.Add(actualState);
				}
				else
					notFinal.Add(actualState);
			}
			final.TrimToSize();
			conclusion.Add(final);
			notFinal.TrimToSize();
			conclusion.Add(notFinal);
			this.counterForNumberOfGroups = 2;
			if(both != null)
			{
				both.TrimToSize();
				conclusion.Add(both);
				this.counterForNumberOfGroups++;
			}
			this.groups = conclusion;
		}
		/// <summary>
		/// Another method for debugging, prints a elemenet of this.groups
		/// </summary>
		/// <param name="group">The group witch should be displayed on the console</param>
		protected void printGroup(ArrayList group)
		{
			IEnumerator iter = group.GetEnumerator();
			while(iter.MoveNext())
			{
				Console.WriteLine(iter.Current.ToString());
			}
			Console.WriteLine("---End of Group----");
		}



//		private bool testStates (FSM myMin, State myState,
//			FSM dMin, State dState, Input i,
//			Hashtable d2myStatesMap)
//		{
//			State dNextState;
//			State myNextState;
//			try 
//			{
//				dNextState = dMin.getNextState(dState, i);
//				myNextState = myMin.getNextState(myState, i);
//
//			}catch (Exception ) {
//				throw new ProgrammingErrorException();
//				}
//
//			if (d2myStatesMap.ContainsKey(dNextState)) 
//			{
//				if ((d2myStatesMap[dNextState].Equals(myNextState)))
//				{
//					return true;
//				} 
//				else 
//				{
//					return false;
//				}
//			}
//			d2myStatesMap.Add(dNextState,myNextState);
//			return true;
//		}
//
//		private void mapStates(FSM myMin, State myState,
//			FSM dMin, State dState,
//			Hashtable d2myStatesMap, Hashtable visited)
//		{
//			Transition temp;
//			Hashtable transitions = null;
//
//			if (visited.Contains(myState)) 
//			{
//				return;
//			}
//			visited.Add(myState,myState);
//
//			try 
//			{
//				transitions = myMin.getTransitionMap(myState);
//			}
//			catch (Exception) 
//			{
//
//				throw new ProgrammingErrorException();
//			}
//			//Iterrieren �ber SChl�ssel
//			IEnumerator myiIter = transitions.Keys.GetEnumerator();
//
//			while (myiIter.MoveNext()) 
//			{
//				temp = 	(Transition)myiIter.Current;
//				Input myInput = temp.input;
//
//				if (!testStates(myMin,myState,dMin,dState,myInput,
//					d2myStatesMap)) 
//				{
//					Console.WriteLine("Not Mappleable");
//					throw new Exception();
//				}
//				try 
//				{
//					mapStates(myMin,myMin.getNextState(myState, myInput),
//						dMin,dMin.getNextState(dState, myInput),
//						d2myStatesMap,visited);
//				}
//				catch (InvalidStateException ) 
//				{
//					Console.WriteLine("Not Mappleable");
//					throw new Exception();
//				}
//				catch (InvalidInputException) 
//				{
//					throw new ProgrammingErrorException();
//				}
//			}
//		}
//		protected Hashtable mapStates(FSM myMin, FSM dMin)
//		{
//			Hashtable d2myStatesMap = new Hashtable();
//			d2myStatesMap.Add(dMin.getStartState(),myMin.getStartState());
//			d2myStatesMap.Add(dMin.getErrorState(),myMin.getErrorState());
//			mapStates(myMin,myMin.getStartState(),
//				dMin, dMin.getStartState(),
//				d2myStatesMap,new Hashtable());
//			return d2myStatesMap;
//		}
//		protected bool _equal (FSM myMin, FSM dMin, Hashtable d2myStatesMap)
//		{
//			if (!myMin.getStartState().Equals(
//				(State)d2myStatesMap[dMin.getStartState()]))
//			{
//				return false;
//			}
//
//
//			StateIterator stateSetIter = new StateIterator(dMin);
//			while (stateSetIter.MoveNext()) 
//			{
//				State currentState = (State) stateSetIter.Current;
//
//				State myState = (State) d2myStatesMap[currentState];
//
//				if (myState == null) 
//				{
//					return false;
//				}
//
//				if (currentState.getFinal()) 
//				{
//					if (!myState.getFinal()) 
//					{
//						return false;
//					}
//				}
//				else
//				{ // so !currentState.isFinalState()
//					if (myState.getFinal()) 
//					{
//						return false;
//					}
//				}
//			}
//			return true;
//		}
//
//		
//		public bool equals(Object o)
//		{
//			//Object testing
//			bool result = false;
//			try 
//			{
//				FSM d = (FSM) o;
//
//				if (!(getInputAl()).Equals(d.getInputAl())) 
//				{
//					return false;
//				}
//				FSM myMin = this.fsm;
//				FSM dMin = d;
////				FSM myMin = this.minimized;
////				FEC dnMin = new FEC(d);
////				FSM dMin = dnMin.minimized;
//				Hashtable d2myStatesMap = null;
//
//				try 
//				{
//					d2myStatesMap = (Hashtable) mapStates(myMin, dMin);
//				}
//				catch (Exception )
//				{
//					return false;
//				}
//
//				result = _equal(myMin, dMin, d2myStatesMap);
//			}
//			catch (Exception ){}
//			return result;
//		}
	}
}
