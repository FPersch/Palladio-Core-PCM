using System;
using ComponentNetworkSimulation;
using ComponentNetworkSimulation.Structure;
using ComponentNetworkSimulation.Structure.Visitor;

namespace ComponentNetworkSimulation.Simulation
{
	/// <summary>
	/// This class extends SimulationThread in order to provide periodic threads. A periodic thread notifies the scheduler,
	/// when the periodlength is reached. The notified scheduler has to create a new periodic thread. All threads, created
	/// from one periodic thread, contains the same periodID, to identify them.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// $Log$
	/// Revision 1.5  2004/06/23 16:32:59  joemal
	/// - add a properties for the observer
	///
	/// Revision 1.4  2004/06/19 16:02:28  joemal
	/// - now the threads work with new visitors
	///
	/// Revision 1.3  2004/05/26 16:28:12  joemal
	/// threads now use the visitor to walk through the architecture
	///
	/// 
	/// </pre>
	/// </remarks>
	public class DefaultPeriodicSimulationThread : DefaultSimulationThread,IPeriodicSimulationThread
	{
		#region events
		
		/// <summary>
		/// this event is fired, when the timeline of the thread reached the periodlength.
		/// </summary>
		public event EventHandler NewPeriodicThreadEvent;

		#endregion
		
		#region data
		
		/// <summary>
		/// Holds the startingpoint of the thread in order to create new threads starting at the same one.
		/// </summary>
		protected IThreadStartingPoint startingPoint;

		/// <summary>
		/// this field holds the length of the period in order to create new threads with the same period.
		/// </summary>
		protected long periodLength;

		/// <summary>
		/// this fields identifies all threads, which have been created from one periodic thread.
		/// </summary>
		protected int periodID;

		/// <summary>
		/// this field contains the current periodic time, the thread has still to wait, until a 
		/// new thread has to be created.
		/// </summary>
		private long currentPeriodTime;

		#endregion

		#region constructors

		/// <summary>
		/// constructs a new periodic thread.
		/// </summary>
		/// <param name="periodLength">the length of the period, until a new thread has to be created.</param>
		/// <param name="periodID">the id of the period threads</param>
		/// <param name="id">the id of this thread</param>
		/// <param name="start">the startingpoint of this thread</param>
		/// <param name="visitor">the visitor used by this thread to walk through the architecture</param>
		/// <param name="type">the type of the thread</param>
		public DefaultPeriodicSimulationThread(long periodLength, int periodID, int id, IThreadStartingPoint start,
			IComponentVisitor visitor, SimulationThreadType type) : base(id,visitor,type)
		{
			this.startingPoint = start;
			this.periodLength = periodLength;
			this.periodID = periodID;
			this.currentPeriodTime = periodLength;
		}

		/// <summary>
		/// constructs a new periodic thread observered by given observer.
		/// </summary>
		/// <param name="periodLength">the length of the period, until a new thread has to be created.</param>
		/// <param name="periodID">the id of the period threads</param>
		/// <param name="id">the id of this thread</param>
		/// <param name="start">the startingpoint of this thread</param>
 		/// <param name="visitor">the visitor used by this thread to walk through the architecture</param>
		/// <param name="type">the type of the thread</param>
		/// <param name="observer">the observer</param>
		public DefaultPeriodicSimulationThread(long periodLength, int periodID, int id, IThreadStartingPoint start,
			IComponentVisitor visitor,SimulationThreadType type, IThreadObserver observer) : base (id, visitor,type,observer)
		{
			this.startingPoint = start;
			this.periodLength = periodLength;
			this.periodID = periodID;
			this.currentPeriodTime = periodLength;
		}

		#endregion

		#region properties

		/// <summary>
		/// return the length of the periodlength of this thread
		/// </summary>
		public virtual long PeriodLength 
		{
			get{ return this.periodLength;}
		}

		/// <summary>
		/// return the periodID of this thread.
		/// </summary>
		public int PeriodID 
		{
			get{ return this.periodID;}
		}

		/// <summary>
		/// is true, if the thread is alive. This method is overriden in order to also mark a thread alive, when the
		/// periodLength not has been reached.
		/// </summary>
		public override bool IsAlive
		{
			get
			{
				return base.IsAlive || this.currentPeriodTime > 0;
			}
		}

		
		/// <summary>
		/// return the TimeInFuture. This property is overriden from base class in order to insert a new timestep,
		/// when this thread has to notify the scheduler to create a new thread because the time reached the periodlength.
		/// </summary>
		public override long TimeInFuture
		{
			get
			{
				if (this.currentPeriodTime > 0 && (this.currentPeriodTime < this.timeInFuture || !HasAnyTimeConsumer()))
					return this.currentPeriodTime;
				else
					return this.timeInFuture;
			}
		}

		/// <summary>
		/// return the startingpoint of this thread in order to create new one from the same one.
		/// </summary>
		public IThreadStartingPoint StartingPoint
		{
			get
			{
				return this.startingPoint;
			}
		}

		/// <summary>
		/// return the observer of this thread.
		/// </summary>
		public IThreadObserver Observer
		{
			get
			{
				return this.observer;
			}
		}

		#endregion

		#region methods

		/// <summary>
		/// move the timeline of this thread. This method is overridden in order to move the currentPeriodTime. If this time
		/// reached zero, an event is fired to create a new thread. CurrentPeriodTime is left to zero in order only to fire
		/// a event one time in whole lifetime of the thread.
		/// </summary>
		/// <param name="time">the timstep to be moved</param>
		public override void TimeMoved(long time)
		{
			if (currentPeriodTime > 0)
			{
				currentPeriodTime -= time;
				if (currentPeriodTime <= 0) NotifyNewPeriodicThreadEvent();
			}

			base.TimeMoved (time);	
		}

		/// <summary>
		/// called by MoveTime(...) to fire an event, when the timeline of the thread reached the periodlength.
		/// </summary>
		protected virtual void NotifyNewPeriodicThreadEvent()
		{
			if (NewPeriodicThreadEvent != null)
				NewPeriodicThreadEvent(this,EventArgs.Empty);
		}

		#endregion
	}
}
//EOF