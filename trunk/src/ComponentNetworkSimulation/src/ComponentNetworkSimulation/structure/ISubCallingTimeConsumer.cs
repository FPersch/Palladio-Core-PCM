using System;

namespace ComponentNetworkSimulation.Structure
{
	/// <summary>
	/// Zusammenfassung f�r ISubCallingTimeConsumer.
	/// </summary>
	public interface ISubCallingTimeConsumer : ITimeConsumer
	{
		ITimeConsumer NextTimeConsumerAfterReturn 
		{
			get;
		}
	}
}
