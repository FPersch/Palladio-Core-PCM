//
// HandledFileTypesType.cs.cs
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
	public class HandledFileTypesType : Altova.Xml.Node
	{
		#region Forward constructors
		public HandledFileTypesType() : base() { SetCollectionParents(); }
		public HandledFileTypesType(XmlDocument doc) : base(doc) { SetCollectionParents(); }
		public HandledFileTypesType(XmlNode node) : base(node) { SetCollectionParents(); }
		public HandledFileTypesType(Altova.Xml.Node node) : base(node) { SetCollectionParents(); }
		#endregion // Forward constructors

		public override void AdjustPrefix()
		{

			for (int i = 0; i < DomChildCount(NodeType.Element, "", "File"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Element, "", "File", i);
				InternalAdjustPrefix(DOMNode, false);
				new FileType(DOMNode).AdjustPrefix();
			}
		}


		#region File accessor methods
		public int GetFileMinCount()
		{
			return 0;
		}

		public int FileMinCount
		{
			get
			{
				return 0;
			}
		}

		public int GetFileMaxCount()
		{
			return Int32.MaxValue;
		}

		public int FileMaxCount
		{
			get
			{
				return Int32.MaxValue;
			}
		}

		public int GetFileCount()
		{
			return DomChildCount(NodeType.Element, "", "File");
		}

		public int FileCount
		{
			get
			{
				return DomChildCount(NodeType.Element, "", "File");
			}
		}

		public bool HasFile()
		{
			return HasDomChild(NodeType.Element, "", "File");
		}

		public FileType GetFileAt(int index)
		{
			return new FileType(GetDomChildAt(NodeType.Element, "", "File", index));
		}

		public FileType GetFile()
		{
			return GetFileAt(0);
		}

		public FileType File
		{
			get
			{
				return GetFileAt(0);
			}
		}

		public void RemoveFileAt(int index)
		{
			RemoveDomChildAt(NodeType.Element, "", "File", index);
		}

		public void RemoveFile()
		{
			while (HasFile())
				RemoveFileAt(0);
		}

		public void AddFile(FileType newValue)
		{
			AppendDomElement("", "File", newValue);
		}

		public void InsertFileAt(FileType newValue, int index)
		{
			InsertDomElementAt("", "File", index, newValue);
		}

		public void ReplaceFileAt(FileType newValue, int index)
		{
			ReplaceDomElementAt("", "File", index, newValue);
		}
		#endregion // File accessor methods

		#region File collection
        public FileCollection	MyFiles = new FileCollection( );

        public class FileCollection: IEnumerable
        {
            HandledFileTypesType parent;
            public HandledFileTypesType Parent
			{
				set
				{
					parent = value;
				}
			}
			public FileEnumerator GetEnumerator() 
			{
				return new FileEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class FileEnumerator: IEnumerator 
        {
			int nIndex;
			HandledFileTypesType parent;
			public FileEnumerator(HandledFileTypesType par) 
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
				return(nIndex < parent.FileCount );
			}
			public FileType  Current 
			{
				get 
				{
					return(parent.GetFileAt(nIndex));
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

        #endregion // File collection

        private void SetCollectionParents()
        {
            MyFiles.Parent = this; 
	}
}
}
