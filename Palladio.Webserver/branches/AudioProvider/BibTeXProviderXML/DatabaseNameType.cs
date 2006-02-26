//
// DatabaseNameType.cs.cs
//
// This file was generated by XMLSPY 2004 Enterprise Edition.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the XMLSPY Documentation for further details.
// http://www.altova.com/xmlspy
//


using System;
using System.Collections;
using System.Xml;
using Altova.Types;

namespace BibTeXProviderXML
{
	public class DatabaseNameType : Altova.Xml.Node
	{
		#region Forward constructors
		public DatabaseNameType() : base() { SetCollectionParents(); }
		public DatabaseNameType(XmlDocument doc) : base(doc) { SetCollectionParents(); }
		public DatabaseNameType(XmlNode node) : base(node) { SetCollectionParents(); }
		public DatabaseNameType(Altova.Xml.Node node) : base(node) { SetCollectionParents(); }
		#endregion // Forward constructors

		public override void AdjustPrefix()
		{

			for (int i = 0; i < DomChildCount(NodeType.Attribute, "", "Name"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Attribute, "", "Name", i);
				InternalAdjustPrefix(DOMNode, false);
			}
		}


		#region Name accessor methods
		public int GetNameMinCount()
		{
			return 1;
		}

		public int NameMinCount
		{
			get
			{
				return 1;
			}
		}

		public int GetNameMaxCount()
		{
			return 1;
		}

		public int NameMaxCount
		{
			get
			{
				return 1;
			}
		}

		public int GetNameCount()
		{
			return DomChildCount(NodeType.Attribute, "", "Name");
		}

		public int NameCount
		{
			get
			{
				return DomChildCount(NodeType.Attribute, "", "Name");
			}
		}

		public bool HasName()
		{
			return HasDomChild(NodeType.Attribute, "", "Name");
		}

		public SchemaString GetNameAt(int index)
		{
			return new SchemaString(GetDomNodeValue(GetDomChildAt(NodeType.Attribute, "", "Name", index)));
		}

		public SchemaString GetName()
		{
			return GetNameAt(0);
		}

		public SchemaString Name
		{
			get
			{
				return GetNameAt(0);
			}
		}

		public void RemoveNameAt(int index)
		{
			RemoveDomChildAt(NodeType.Attribute, "", "Name", index);
		}

		public void RemoveName()
		{
			while (HasName())
				RemoveNameAt(0);
		}

		public void AddName(SchemaString newValue)
		{
			AppendDomChild(NodeType.Attribute, "", "Name", newValue.ToString());
		}

		public void InsertNameAt(SchemaString newValue, int index)
		{
			InsertDomChildAt(NodeType.Attribute, "", "Name", index, newValue.ToString());
		}

		public void ReplaceNameAt(SchemaString newValue, int index)
		{
			ReplaceDomChildAt(NodeType.Attribute, "", "Name", index, newValue.ToString());
		}
		#endregion // Name accessor methods

		#region Name collection
        public NameCollection	MyNames = new NameCollection( );

        public class NameCollection: IEnumerable
        {
            DatabaseNameType parent;
            public DatabaseNameType Parent
			{
				set
				{
					parent = value;
				}
			}
			public NameEnumerator GetEnumerator() 
			{
				return new NameEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class NameEnumerator: IEnumerator 
        {
			int nIndex;
			DatabaseNameType parent;
			public NameEnumerator(DatabaseNameType par) 
			{
				parent = par;
				nIndex = -1;
			}
			public void Reset() 
			{
				nIndex = -1;
			}
			public bool MoveNext() 
			{
				nIndex++;
				return(nIndex < parent.NameCount );
			}
			public SchemaString  Current 
			{
				get 
				{
					return(parent.GetNameAt(nIndex));
				}
			}
			object IEnumerator.Current 
			{
				get 
				{
					return(Current);
				}
			}
    	}

        #endregion // Name collection

        private void SetCollectionParents()
        {
            MyNames.Parent = this; 
	}
}
}
