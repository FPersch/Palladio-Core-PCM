using System;

namespace Palladio.FiniteStateMachines {

	/// <summary>
	///		Class representing the abstract type of a state.
	///		
	///		author: JH
	/// </summary>
	public abstract class AbstractState : IState {
		
		/// <summary>
		///		Denotes this state as a start state of the
		///		finite state machine it belongs to.
		/// </summary>
		public abstract bool IsStartState { get; }

		
		/// <summary>
		///		Denotes this state as a final state of the
		///		finite state machine it belongs to.
		/// </summary>
		public abstract bool IsFinalState { get; }

		
		/// <summary>
		///		The name of the state.
		/// </summary>
		public abstract string Name { get; }

		
		/// <summary>
		///		Default implementation of ToString().
		/// </summary>
		/// <returns>
		///		The name of the State.
		///	</returns>
		public override string ToString() {
			return this.Name;
		}

		
		/// <summary>
		///		Default implementation of GetHashCode(). 
		///		Refers to the hashcode of name.
		/// </summary>
		/// <returns>
		///		Hashcode of Name
		///	</returns>
		public override int GetHashCode() {
			return Name.GetHashCode();
		}

		
		/// <summary>
		///		Default implementation of Equals.
		/// </summary>
		/// <param name="obj">
		///		The other object.
		///	</param>
		/// <returns>
		///		True, if Name, IsStartState and
		///		IsFinalState are Equal; false otherwise.
		///	</returns>
		public override bool Equals(object obj) {
			IState state;
			if (obj is IState) { 
				state = (IState)obj;
				return ((Name == state.Name) && 
					(IsStartState == state.IsStartState) &&
					(IsFinalState == state.IsFinalState));
			}
			return false;
		}

		
		/// <summary>
		///		Default comparison of two states based on the 
		///		implementation of Equals.
		/// </summary>
		/// <returns>
		///		True, if stateOne.Equals(stateTwo); false otherwise
		///	</returns>
		public static bool operator == (AbstractState one, AbstractState two){
			bool result = false;
			if ( (object)one != null ) {
				result = one.Equals(two);
			} else if ( (object)two != null ) {
				result = false;
			} else {
				result = true; // both null
			}
			return result;
		}

		
		/// <summary>
		///		Default comparison of two states based on the 
		///		implementation of Equals.
		/// </summary>
		/// <returns>
		///		True if _NOT_ stateOne.Equals(stateTwo); false otherwise.
		///	</returns>
		public static bool operator != (AbstractState one, AbstractState two){
			return !(one == two);
		}
	}
}