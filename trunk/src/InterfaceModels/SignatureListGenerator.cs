//------------------------------------------------------------------------------
// <autogenerated>
//     This code was generated by CodeSmith.
//     Version: 2.5.14.0
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </autogenerated>
//------------------------------------------------------------------------------
using System;
using System.Collections;
using Palladio.Attributes;
using Palladio.Identifier;
using Palladio.Utils.Collections;
using ReflectionBasedVisitor;

namespace Palladio.ComponentModel.InterfaceModels
{
	#region DefaultSignatureList
	/// <summary>
	/// A SignatureList is the simplest form of an IInterfaceModel, just
	/// containing a set of signatures.
	/// </summary>
	internal class DefaultSignatureList : ISignatureList , ICloneable
	{
		#region Properties
		
		/// <summary>
		/// Signatures of the interface.
		/// </summary>
		public ISignature[] Signatures 
		{
			get
			{
				return (ISignature[]) signatures.ToArray(typeof(ISignature));
			}
		}

		/// <summary>
		/// Indexer to access the sigantures easily.
		/// </summary>
		public ISignature this[int index]
		{
			get { return (ISignature) signatures[index]; }
		}

		/// <summary>
		/// A list of attributes attached an object. 
		/// </summary>
		public IAttributeHash Attributes 
		{ 
			get { return attributes; }
		}
		#endregion
		
		#region Methods
		
		/// <summary>
		/// Adds an array of signatures to the interface.
		/// </summary>
		/// <param name="aSigArray">Signatures to add.</param>
		public void AddSignatures( params ISignature[] aSigArray )
		{
			foreach (ISignature s in aSigArray)
			{
				if (SignatureListChangeEvent != null)
					SignatureListChangeEvent(this,new SignatureListChangeEventArgs(s, ChangeTimeEnum.BEFORE,ChangeTypeEnum.ADD));
			}
			signatures.AddRange(aSigArray);
			foreach (ISignature s in aSigArray)
			{
				if (SignatureListChangeEvent != null)
					SignatureListChangeEvent(this,new SignatureListChangeEventArgs(s, ChangeTimeEnum.AFTER,ChangeTypeEnum.ADD));
			}
		}

		/// <summary>
		/// Deletes a set of signatures from the interface.
		/// </summary>
		/// <param name="aSigArray">Signatures to delete.</param>
		public void DeleteSignatures( params ISignature[] aSigArray )
		{
			foreach (ISignature s in aSigArray)
			{
				if (SignatureListChangeEvent != null)
					SignatureListChangeEvent(this,new SignatureListChangeEventArgs(s, ChangeTimeEnum.BEFORE,ChangeTypeEnum.DELETE));
			}
			foreach (ISignature sig in aSigArray)
			{
				signatures.Remove(sig);
			}
			foreach (ISignature s in aSigArray)
			{
				if (SignatureListChangeEvent != null)
					SignatureListChangeEvent(this,new SignatureListChangeEventArgs(s, ChangeTimeEnum.AFTER,ChangeTypeEnum.DELETE));
			}
		}

		public bool ContainsSignature( ISignature aSignature )
		{
			return signatures.Contains(aSignature);
		}

		public ISignature[] GetSignaturesByID( IIdentifier aName )
		{
			ArrayList result = new ArrayList();
			foreach (ISignature s in signatures)
			{
				if (s.Name.Equals(aName.ToString()))
					result.Add(s);
			}
			return (ISignature[])result.ToArray(typeof(ISignature));
		}

		
		/// <summary>
		/// This method is called by the <see cref="ReflectionBasedVisitor"/> to allow data
		/// structure driven visiting of the structure.<br></br>
		/// Leave this method's body empty if you don't need data structure driven visiting.
		/// </summary>
		/// <param name="visitor">The visitor to accept</param>
		public void AcceptVisitor (IVisitor visitor)
		{
		}

		/// <summary>
		/// Creates a copy of the current instance.
		/// </summary>
		/// <returns>A new object with the same values as the current instance.</returns>
		public object Clone()
		{
			return new DefaultSignatureList(this);
		}
		
		/// <summary>
		/// The Equals method determines whether the specified 
		/// System.Object is equal to the current System.Object.
		/// </summary>
		/// <param name="obj">Contains the Object to compare with 
		/// the current object.</param>
		/// <returns>Returns true if the specified object is equal 
		/// to the current objector or false if the obejcts 
		/// are not equal.</returns>
		public override bool Equals(object obj)
		{
			if (obj is DefaultSignatureList)
			{
				DefaultSignatureList sigList = (DefaultSignatureList)obj;
				return (
					sigList.signatures.Equals(this.signatures)
				);
			}
			return false;
		}

		/// <summary>
		/// The GetHashCode method serves as a hash function 
		/// for a particular type, suitable for use in hashing 
		/// algorithms and data structures like a hash table.
		/// </summary>
		/// <returns>A hash value for the current object.</returns>
		public override int GetHashCode()
		{
			int result = 0;
			
			foreach (ISignature s in signatures)
			{
				result ^= s.GetHashCode();
			}
			return result;
		}

		/// <summary>
		/// Retrieves a string representation of the object.
		/// </summary>
		/// <returns>String representation of the object.</returns>
		public override string ToString()
		{
			string result = ">>";
			
			foreach (ISignature s in signatures)
			{
				result += s.ToString()+" ";
			}
			return result + "<<";
		}

		/// <summary>
		/// This event is raised before and after a change of the signatures in this list
		/// </summary>
		public event SignatureListChangeEventHandler SignatureListChangeEvent;
		#endregion

		#region Constructors

		/// <summary>
		/// Creates a SignaturesList.
		/// </summary>
		/// <param name="anAttHash">Attributes.</param>
		/// <param name="aSigArray">Signatures contained by the interface.</param>
		public DefaultSignatureList(IAttributeHash anAttHash, params ISignature[] aSigArray)
		{
			attributes = anAttHash;
			signatures = new Set();
			AddSignatures(aSigArray);
		}

		/// <summary>
		/// Copy constructor.
		/// </summary>
		/// <param name="aSigList">SignatureList to copy.</param>
		public DefaultSignatureList(DefaultSignatureList aSigList) :
			this( aSigList.Attributes, aSigList.Signatures ) {}

		#endregion
		
		#region Data
		
		private IAttributeHash attributes;
		private Set signatures;
		#endregion
	}
	#endregion
	
	#region DefaultExternalSignatureList
	/// <summary>
	/// A SignatureList is the simplest form of an IInterfaceModel, just
	/// containing a set of signatures.
	/// </summary>
	internal class DefaultExternalSignatureList : IExternalSignatureList , ICloneable
	{
		#region Properties
		
		/// <summary>
		/// Signatures of the interface.
		/// </summary>
		public IExternalSignature[] Signatures 
		{
			get
			{
				return (IExternalSignature[]) signatures.ToArray(typeof(IExternalSignature));
			}
		}

		/// <summary>
		/// Indexer to access the sigantures easily.
		/// </summary>
		public IExternalSignature this[int index]
		{
			get { return (IExternalSignature) signatures[index]; }
		}

		/// <summary>
		/// A list of attributes attached an object. 
		/// </summary>
		public IAttributeHash Attributes 
		{ 
			get { return attributes; }
		}
		#endregion
		
		#region Methods
		
		/// <summary>
		/// Adds an array of signatures to the interface.
		/// </summary>
		/// <param name="aSigArray">Signatures to add.</param>
		public void AddSignatures( params IExternalSignature[] aSigArray )
		{
			foreach (IExternalSignature s in aSigArray)
			{
				if (SignatureListChangeEvent != null)
					SignatureListChangeEvent(this,new ExternalSignatureListChangeEventArgs(s, ChangeTimeEnum.BEFORE,ChangeTypeEnum.ADD));
			}
			signatures.AddRange(aSigArray);
			foreach (IExternalSignature s in aSigArray)
			{
				if (SignatureListChangeEvent != null)
					SignatureListChangeEvent(this,new ExternalSignatureListChangeEventArgs(s, ChangeTimeEnum.AFTER,ChangeTypeEnum.ADD));
			}
		}

		/// <summary>
		/// Deletes a set of signatures from the interface.
		/// </summary>
		/// <param name="aSigArray">Signatures to delete.</param>
		public void DeleteSignatures( params IExternalSignature[] aSigArray )
		{
			foreach (IExternalSignature s in aSigArray)
			{
				if (SignatureListChangeEvent != null)
					SignatureListChangeEvent(this,new ExternalSignatureListChangeEventArgs(s, ChangeTimeEnum.BEFORE,ChangeTypeEnum.DELETE));
			}
			foreach (IExternalSignature sig in aSigArray)
			{
				signatures.Remove(sig);
			}
			foreach (IExternalSignature s in aSigArray)
			{
				if (SignatureListChangeEvent != null)
					SignatureListChangeEvent(this,new ExternalSignatureListChangeEventArgs(s, ChangeTimeEnum.AFTER,ChangeTypeEnum.DELETE));
			}
		}

		public bool ContainsSignature( IExternalSignature aSignature )
		{
			return signatures.Contains(aSignature);
		}

		public IExternalSignature[] GetSignaturesByID( IIdentifier aName )
		{
			ArrayList result = new ArrayList();
			foreach (IExternalSignature s in signatures)
			{
				if (s.Signature.Name.Equals(aName.ToString()))
					result.Add(s);
			}
			return (IExternalSignature[])result.ToArray(typeof(IExternalSignature));
		}

		
		/// <summary>
		/// This method is called by the <see cref="ReflectionBasedVisitor"/> to allow data
		/// structure driven visiting of the structure.<br></br>
		/// Leave this method's body empty if you don't need data structure driven visiting.
		/// </summary>
		/// <param name="visitor">The visitor to accept</param>
		public void AcceptVisitor (IVisitor visitor)
		{
		}

		/// <summary>
		/// Creates a copy of the current instance.
		/// </summary>
		/// <returns>A new object with the same values as the current instance.</returns>
		public object Clone()
		{
			return new DefaultExternalSignatureList(this);
		}
		
		/// <summary>
		/// The Equals method determines whether the specified 
		/// System.Object is equal to the current System.Object.
		/// </summary>
		/// <param name="obj">Contains the Object to compare with 
		/// the current object.</param>
		/// <returns>Returns true if the specified object is equal 
		/// to the current objector or false if the obejcts 
		/// are not equal.</returns>
		public override bool Equals(object obj)
		{
			if (obj is DefaultExternalSignatureList)
			{
				DefaultExternalSignatureList sigList = (DefaultExternalSignatureList)obj;
				return (
					sigList.signatures.Equals(this.signatures)
				);
			}
			return false;
		}

		/// <summary>
		/// The GetHashCode method serves as a hash function 
		/// for a particular type, suitable for use in hashing 
		/// algorithms and data structures like a hash table.
		/// </summary>
		/// <returns>A hash value for the current object.</returns>
		public override int GetHashCode()
		{
			int result = 0;
			
			foreach (IExternalSignature s in signatures)
			{
				result ^= s.GetHashCode();
			}
			return result;
		}

		/// <summary>
		/// Retrieves a string representation of the object.
		/// </summary>
		/// <returns>String representation of the object.</returns>
		public override string ToString()
		{
			string result = ">>";
			
			foreach (IExternalSignature s in signatures)
			{
				result += s.ToString()+" ";
			}
			return result + "<<";
		}

		/// <summary>
		/// This event is raised before and after a change of the signatures in this list
		/// </summary>
		public event ExternalSignatureListChangeEventHandler SignatureListChangeEvent;
		#endregion

		#region Constructors

		/// <summary>
		/// Creates a SignaturesList.
		/// </summary>
		/// <param name="anAttHash">Attributes.</param>
		/// <param name="aSigArray">Signatures contained by the interface.</param>
		public DefaultExternalSignatureList(IAttributeHash anAttHash, params IExternalSignature[] aSigArray)
		{
			attributes = anAttHash;
			signatures = new Set();
			AddSignatures(aSigArray);
		}

		/// <summary>
		/// Copy constructor.
		/// </summary>
		/// <param name="aSigList">SignatureList to copy.</param>
		public DefaultExternalSignatureList(DefaultExternalSignatureList aSigList) :
			this( aSigList.Attributes, aSigList.Signatures ) {}

		#endregion
		
		#region Data
		
		private IAttributeHash attributes;
		private Set signatures;
		#endregion
	}
	#endregion
}
