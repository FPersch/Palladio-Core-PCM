//
// SearchedBibTeXFieldNamesType.cs.cs
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
	public class SearchedBibTeXFieldNamesType : Altova.Xml.Node
	{
		#region Forward constructors
		public SearchedBibTeXFieldNamesType() : base() { SetCollectionParents(); }
		public SearchedBibTeXFieldNamesType(XmlDocument doc) : base(doc) { SetCollectionParents(); }
		public SearchedBibTeXFieldNamesType(XmlNode node) : base(node) { SetCollectionParents(); }
		public SearchedBibTeXFieldNamesType(Altova.Xml.Node node) : base(node) { SetCollectionParents(); }
		#endregion // Forward constructors

		public override void AdjustPrefix()
		{

			for (int i = 0; i < DomChildCount(NodeType.Element, "", "FieldName"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Element, "", "FieldName", i);
				InternalAdjustPrefix(DOMNode, false);
				new FieldNameType(DOMNode).AdjustPrefix();
			}
		}


		#region FieldName accessor methods
		public int GetFieldNameMinCount()
		{
			return 1;
		}

		public int FieldNameMinCount
		{
			get
			{
				return 1;
			}
		}

		public int GetFieldNameMaxCount()
		{
			return Int32.MaxValue;
		}

		public int FieldNameMaxCount
		{
			get
			{
				return Int32.MaxValue;
			}
		}

		public int GetFieldNameCount()
		{
			return DomChildCount(NodeType.Element, "", "FieldName");
		}

		public int FieldNameCount
		{
			get
			{
				return DomChildCount(NodeType.Element, "", "FieldName");
			}
		}

		public bool HasFieldName()
		{
			return HasDomChild(NodeType.Element, "", "FieldName");
		}

		public FieldNameType GetFieldNameAt(int index)
		{
			return new FieldNameType(GetDomChildAt(NodeType.Element, "", "FieldName", index));
		}

		public FieldNameType GetFieldName()
		{
			return GetFieldNameAt(0);
		}

		public FieldNameType FieldName
		{
			get
			{
				return GetFieldNameAt(0);
			}
		}

		public void RemoveFieldNameAt(int index)
		{
			RemoveDomChildAt(NodeType.Element, "", "FieldName", index);
		}

		public void RemoveFieldName()
		{
			while (HasFieldName())
				RemoveFieldNameAt(0);
		}

		public void AddFieldName(FieldNameType newValue)
		{
			AppendDomElement("", "FieldName", newValue);
		}

		public void InsertFieldNameAt(FieldNameType newValue, int index)
		{
			InsertDomElementAt("", "FieldName", index, newValue);
		}

		public void ReplaceFieldNameAt(FieldNameType newValue, int index)
		{
			ReplaceDomElementAt("", "FieldName", index, newValue);
		}
		#endregion // FieldName accessor methods

		#region FieldName collection
        public FieldNameCollection	MyFieldNames = new FieldNameCollection( );

        public class FieldNameCollection: IEnumerable
        {
            SearchedBibTeXFieldNamesType parent;
            public SearchedBibTeXFieldNamesType Parent
			{
				set
				{
					parent = value;
				}
			}
			public FieldNameEnumerator GetEnumerator() 
			{
				return new FieldNameEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class FieldNameEnumerator: IEnumerator 
        {
			int nIndex;
			SearchedBibTeXFieldNamesType parent;
			public FieldNameEnumerator(SearchedBibTeXFieldNamesType par) 
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
				return(nIndex < parent.FieldNameCount );
			}
			public FieldNameType  Current 
			{
				get 
				{
					return(parent.GetFieldNameAt(nIndex));
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

        #endregion // FieldName collection

        private void SetCollectionParents()
        {
            MyFieldNames.Parent = this; 
	}
}
}
