//
// portType.cs.cs
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

namespace webserverXML
{
	public class portType : Altova.Xml.Node
	{
		#region Forward constructors
		public portType() : base() { SetCollectionParents(); }
		public portType(XmlDocument doc) : base(doc) { SetCollectionParents(); }
		public portType(XmlNode node) : base(node) { SetCollectionParents(); }
		public portType(Altova.Xml.Node node) : base(node) { SetCollectionParents(); }
		#endregion // Forward constructors

		public override void AdjustPrefix()
		{

			for (int i = 0; i < DomChildCount(NodeType.Attribute, "", "number"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Attribute, "", "number", i);
				InternalAdjustPrefix(DOMNode, false);
			}
		}


		#region number accessor methods
		public int GetnumberMinCount()
		{
			return 1;
		}

		public int numberMinCount
		{
			get
			{
				return 1;
			}
		}

		public int GetnumberMaxCount()
		{
			return 1;
		}

		public int numberMaxCount
		{
			get
			{
				return 1;
			}
		}

		public int GetnumberCount()
		{
			return DomChildCount(NodeType.Attribute, "", "number");
		}

		public int numberCount
		{
			get
			{
				return DomChildCount(NodeType.Attribute, "", "number");
			}
		}

		public bool Hasnumber()
		{
			return HasDomChild(NodeType.Attribute, "", "number");
		}

		public SchemaString GetnumberAt(int index)
		{
			return new SchemaString(GetDomNodeValue(GetDomChildAt(NodeType.Attribute, "", "number", index)));
		}

		public SchemaString Getnumber()
		{
			return GetnumberAt(0);
		}

		public SchemaString number
		{
			get
			{
				return GetnumberAt(0);
			}
		}

		public void RemovenumberAt(int index)
		{
			RemoveDomChildAt(NodeType.Attribute, "", "number", index);
		}

		public void Removenumber()
		{
			while (Hasnumber())
				RemovenumberAt(0);
		}

		public void Addnumber(SchemaString newValue)
		{
			AppendDomChild(NodeType.Attribute, "", "number", newValue.ToString());
		}

		public void InsertnumberAt(SchemaString newValue, int index)
		{
			InsertDomChildAt(NodeType.Attribute, "", "number", index, newValue.ToString());
		}

		public void ReplacenumberAt(SchemaString newValue, int index)
		{
			ReplaceDomChildAt(NodeType.Attribute, "", "number", index, newValue.ToString());
		}
		#endregion // number accessor methods

		#region number collection
        public numberCollection	Mynumbers = new numberCollection( );

        public class numberCollection: IEnumerable
        {
            portType parent;
            public portType Parent
			{
				set
				{
					parent = value;
				}
			}
			public numberEnumerator GetEnumerator() 
			{
				return new numberEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class numberEnumerator: IEnumerator 
        {
			int nIndex;
			portType parent;
			public numberEnumerator(portType par) 
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
				return(nIndex < parent.numberCount );
			}
			public SchemaString  Current 
			{
				get 
				{
					return(parent.GetnumberAt(nIndex));
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

        #endregion // number collection

        private void SetCollectionParents()
        {
            Mynumbers.Parent = this; 
	}
}
}
