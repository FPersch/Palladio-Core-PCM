using System;
using System.Collections;
using Palladio.Attributes;
using Palladio.Utils.Collections;
using ReflectionBasedVisitor;
using Palladio.Identifier;

namespace Palladio.ComponentModel.Connections
{
	/// <summary>
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.1  2005/02/21 13:48:18  joemal
	/// initial import
	///
	/// 
	/// </pre>
	/// </remarks>
	internal class DefaultConnection : IConnection
	{

		#region Properties

		/// <summary>
		/// A list of attributes attached this component. 
		/// </summary>
		public AttributeHash Attributes 
		{ 
			get { return attributes; }
		}

		public IIdentifier ID
		{
			get
			{
				return IdentifiableFactory.CreateStringID(this.GetHashCode().ToString());
			}
		}

		public IRole ProvidingRole
		{
			get { return providingRole; }
			set { providingRole = value; }
		}

		public IRole RequiringRole
		{
			get { return requiringRole;}
			set { requiringRole = value; }
		}

		#endregion

		#region Methods

		/// <summary>
		/// Creates a copy of the current instance.
		/// </summary>
		/// <returns>A new object with the same values as the current instance.</returns>
		public virtual object Clone()
		{
			return new DefaultConnection(this);
		}

		public override bool Equals(object obj)
		{
			if (!(obj is IConnection)) return false;
			if ((object)this == obj) return true;
			IConnection myConnection = (IConnection)obj;
			return (
				providingRole.Equals(myConnection.ProvidingRole) &&
				requiringRole.Equals(myConnection.RequiringRole)
			);
		}

		public override int GetHashCode()
		{
			return (
				requiringRole.GetHashCode() ^
				providingRole.GetHashCode()
			);
		}
		
		public override string ToString()
		{
			return requiringRole.ToString() + " ---> " + providingRole.ToString();
		}

		public virtual void AcceptVisitor(IVisitor v){}

		public virtual void Serialize(System.Xml.XmlTextWriter writer) {}
		public virtual void Deserialize(System.Xml.XmlNode element) {}
		#endregion

		#region Constructors

		protected DefaultConnection(AttributeHash anAttHash)
		{
			attributes = (AttributeHash)anAttHash.Clone();
		}

		protected DefaultConnection(AttributeHash anAttHash, IRole aReqRole, IRole aProvRole) : this (anAttHash)
		{
			providingRole = aProvRole;
			requiringRole = aReqRole;
		}

		protected DefaultConnection(DefaultConnection aConnection) : 
			this (aConnection.Attributes, aConnection.providingRole, aConnection.requiringRole)
		{
		}


		#endregion

		#region Data

		protected IRole providingRole;
		protected IRole requiringRole;
		private   AttributeHash attributes;
		#endregion
	}
}
