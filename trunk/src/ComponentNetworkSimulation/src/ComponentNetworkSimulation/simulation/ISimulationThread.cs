namespace ComponentNetworkSimulation.Simulation
{
	/// <summary>
	/// This interface defines all methods, properties and events provided by a SimulationThread.
	/// </summary>
	public interface ISimulationThread
	{
		#region events

		/// <summary>
		/// This event is fired, if the TimeConsumer has changed to next one
		/// </summary>
		event NextTCEventHandler NextTCEvent;

		#endregion events

		#region properties

		/// <summary>
		/// the current TimeConsumer
		/// </summary>
		ComponentNetworkSimulation.structure.ITimeConsumer CurrentTimeConsumer
		{
			get;
		}

		/// <summary>
		/// this time contains the difference between the simulation time and the threads current state time.
		/// </summary>
		long TimeInFuture 
		{
			get;
		}

		/// <summary>
		/// is true, if the thread already has any following TimeConsumer 
		/// </summary>
		bool IsAlive 
		{
			get;
		}

		/// <summary>
		/// the id of the thread
		/// </summary>
		int ThreadID
		{
			get;
		}

		#endregion

		#region methods

		/// <summary>
		/// called to move the timeline of the thread.
		/// </summary>
		/// <param name="time">The timestep to be moved.</param>
		void TimeMoved(long time);

		#endregion
	}
}
//EOF
