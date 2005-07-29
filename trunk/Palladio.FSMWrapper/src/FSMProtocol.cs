using System;
using Palladio.ComponentModel;
using Palladio.ComponentModel.Identifier;
using Palladio.ComponentModel.ModelEntities;
using Palladio.FiniteStateMachines;
using Palladio.Identifier;

namespace Palladio.FSMWrapper
{
	/// <summary>
	/// This is the wrapper class that supports FSMs to be used as componentmodels interface protocols.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.1  2005/07/29 15:59:16  joemal
	/// initial creation
	///
	///
	///
	/// </pre>
	/// </remarks>
	internal class FSMProtocol : IProtocol
	{
		#region data
		
		//the type id of the wrapper
		private static IProtocolTypeIdentifier PROTTYPEID=
			ComponentModelIdentifier.CreateProtocolTypeID("F0D7D670-AA37-4cdf-A094-E5547198E469");

		//holds the fsm
		private IFiniteStateMachine fsm;

		//the id of the protocol
		private IProtocolIdentifier protId;

		#endregion

		#region constructor 

		/// <summary>
		/// called to create the protocol wrapper.
		/// </summary>
		/// <param name="fsm">the fsm</param>
		public FSMProtocol(IFiniteStateMachine fsm)
		{
			this.fsm = fsm;
			this.protId = ComponentModelIdentifier.CreateProtocolID(Guid.NewGuid().ToString());
		}

		/// <summary>
		/// called to create the protocol wrapper using the given id.
		/// </summary>
		/// <param name="fsm">the fsm</param>
		/// <param name="protId">the protocolId</param>
		public FSMProtocol(IFiniteStateMachine fsm, IProtocolIdentifier protId)
		{
			this.fsm = fsm;
			this.protId = protId;
		}

		#endregion

		#region properties

		/// <summary>
		/// called to return the fsm that is used to specify the interface protocol.
		/// </summary>
		public IFiniteStateMachine FiniteStateMachine
		{
			get { return fsm; }
		}

		#endregion

		/// <summary>
		/// returns the typed id of the protocol
		/// </summary>
		public IProtocolIdentifier ProtocolID
		{
			get { return this.protId; }
		}

		/// <summary>
		/// returns the id of the type of protocol (fsm, ...)
		/// </summary>
		public IProtocolTypeIdentifier ProtocolTypeID
		{
			get { return FSMProtocol.PROTTYPEID; }
		}

		/// <summary>
		/// The Identifier describing the identified object
		/// </summary>
		public IIdentifier ID
		{
			get { return this.protId; }
		}
	}
}
