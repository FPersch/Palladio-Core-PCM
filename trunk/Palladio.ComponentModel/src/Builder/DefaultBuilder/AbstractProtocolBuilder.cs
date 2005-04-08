using System;
using Palladio.ComponentModel.Identifier;
using Palladio.ComponentModel.ModelDataManagement;
using Palladio.ComponentModel.ModelEntities;

namespace Palladio.ComponentModel.Builder.DefaultBuilder
{
	/// <summary>
	/// Abstract implementation of the Protocol builder - methods that are available at all levels.
	/// <summary>
	/// 
	/// </summary>
	/// <remarks>
	/// Currently the protocols can not be created using a builder.
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.1  2005/04/08 16:50:31  kelsaka
	/// - added interface builder implementation
	///
	/// </pre>
	/// </remarks>
	public abstract class AbstractProtocolBuilder : IProtocolBuilder
	{
		private ILowLevelBuilder lowLevelBuilder;
		private IProtocol protocol;


		/// <summary>
		/// Initializes the Builder. Has to be called by implementing members at construction time.
		/// </summary>
		/// <param name="lowLevelBuilder">The model data management.</param>
		/// <param name="protocol">The protocol to build.</param>
		public void Init(ILowLevelBuilder lowLevelBuilder, IProtocol protocol)
		{
			this.lowLevelBuilder = lowLevelBuilder;
			this.protocol = protocol;
		}

		/// <summary>
		/// Returns the <see cref="IProtocolIdentifier"/> of the actual protocol.
		/// </summary>
		public IProtocolIdentifier ProtocolID
		{
			get { return this.protocol.ProtocolID; }
		}
	}
}
