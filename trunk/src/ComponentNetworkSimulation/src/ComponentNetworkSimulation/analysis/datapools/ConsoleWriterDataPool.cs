using System;
using System.IO;
using ComponentNetworkSimulation.Simulation;
using ComponentNetworkSimulation.structure;

namespace ComponentNetworkSimulation.Analysis.Datapools
{
	/// <summary>
	/// this class implements a datapool, that only writes all logs to the given writer.
	/// </summary>
	internal class TextWriterDataPool : ComponentNetworkSimulation.Analysis.DefaultDataPool
	{
		#region data

		/// <summary>
		/// the writer, the logs are written to
		/// </summary>
		protected TextWriter writer;

		#endregion

		#region constructors

		/// <summary>
		/// constructs a new TextWriterDataPool
		/// </summary>
		/// <param name="simulationEnvironment">the simulationenvironment</param>
		/// <param name="writer">the writer used to write the logs to</param>
		public TextWriterDataPool(ISimulationEnvironment simulationEnvironment, TextWriter writer)
			: base (simulationEnvironment)
		{
			this.writer = writer;
		}

		#endregion

		#region methods

		/// <summary>
		/// Called, when the simulation was reseted 
		/// </summary>
		public override void Reset()
		{
			PrintLog("Simulation reseted");
		}

		/// <summary>
		/// called on incoming Clocklogs
		/// </summary>
		/// <param name="sender"></param>
		/// <param name="eventArgs"></param>
		protected override void OnClockEvent(object sender, ClockLogEventArgs eventArgs)
		{
			if (eventArgs.TheType == ClockLogEventArgs.EventType.CLOCK_RESET)
				PrintLog("ClockLog -> reset");
			else if (eventArgs.TheType == ClockLogEventArgs.EventType.CLOCK_STEP)
				PrintLog("ClockLog timeStep -> Stepsize = "+eventArgs.TimeStep);
			else if (eventArgs.TheType == ClockLogEventArgs.EventType.CLOCK_REACHED_MAXTIME)
				PrintLog("ClockLog -> maxtime reached");
			else if (eventArgs.TheType == ClockLogEventArgs.EventType.CLOCK_NO_MORE_THREADS)
				PrintLog("ClockLog -> no more threads alive");
		}

		/// <summary>
		/// called on incoming ThreadLogs
		/// </summary>
		/// <param name="sender"></param>
		/// <param name="eventArgs"></param>
		protected override void OnThreadEvent(object sender, ThreadLogEventArgs eventArgs)
		{
			if (eventArgs.TheType == ThreadLogEventArgs.EventType.THREAD_CREATED) 
			{
				if (eventArgs.TheThread is IPeriodicSimulationThread)
					PrintLog("ThreadLog -> Periodic Thread("+eventArgs.TheThread.ThreadID+
						","+((IPeriodicSimulationThread)eventArgs.TheThread).PeriodID+") created.");
				else
					PrintLog("ThreadLog -> Thread("+eventArgs.TheThread.ThreadID+") created.");
			}
			else if (eventArgs.TheType == ThreadLogEventArgs.EventType.THREAD_REACHED_END) 
				PrintLog("ThreadLog -> Thread("+eventArgs.TheThread.ThreadID+") reached its end.");
			else if (eventArgs.TheType == ThreadLogEventArgs.EventType.THREAD_ENTERED_TIMECONSUMER) 
				PrintLog("ThreadLog -> Thread("+eventArgs.TheThread.ThreadID+") entered TimeConsumer "+
					eventArgs.TheTimeConsumer);
			else if (eventArgs.TheType == ThreadLogEventArgs.EventType.THREAD_EXITED_TIMECONSUMER) 
				PrintLog("ThreadLog -> Thread("+eventArgs.TheThread.ThreadID+") exited TimeConsumer "+eventArgs.TheTimeConsumer);
		}

		/// <summary>
		/// called on incoming unknown logs
		/// </summary>
		/// <param name="sender"></param>
		/// <param name="eventArgs"></param>
		protected override void OnUnknownEvent(object sender, BasicLogEventArgs eventArgs)
		{
			PrintLog("Unknown log event -> "+eventArgs.Message);
		}

		/// <summary>
		/// called to write a log with given message to the writer.
		/// </summary>
		/// <param name="message"></param>
		protected void PrintLog(String message)
		{
			writer.WriteLine("Log at time "+this.SimulationTime+": "+message);
		}

		#endregion
	}
}
//EOF