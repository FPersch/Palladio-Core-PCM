//
// configType.cs.cs
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

namespace WebserverXML
{
	public class configType : Altova.Xml.Node
	{
		#region Forward constructors
		public configType() : base() { SetCollectionParents(); }
		public configType(XmlDocument doc) : base(doc) { SetCollectionParents(); }
		public configType(XmlNode node) : base(node) { SetCollectionParents(); }
		public configType(Altova.Xml.Node node) : base(node) { SetCollectionParents(); }
		#endregion // Forward constructors

		public override void AdjustPrefix()
		{

			for (int i = 0; i < DomChildCount(NodeType.Attribute, "", "xmlns:xsi"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Attribute, "", "xmlns:xsi", i);
				InternalAdjustPrefix(DOMNode, false);
			}

			for (int i = 0; i < DomChildCount(NodeType.Attribute, "", "xsi:noNamespaceSchemaLocation"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Attribute, "", "xsi:noNamespaceSchemaLocation", i);
				InternalAdjustPrefix(DOMNode, false);
			}

			for (int i = 0; i < DomChildCount(NodeType.Element, "", "documentRoot"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Element, "", "documentRoot", i);
				InternalAdjustPrefix(DOMNode, false);
				new documentRootType(DOMNode).AdjustPrefix();
			}

			for (int i = 0; i < DomChildCount(NodeType.Element, "", "LogFile"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Element, "", "LogFile", i);
				InternalAdjustPrefix(DOMNode, false);
				new LogFileType(DOMNode).AdjustPrefix();
			}

			for (int i = 0; i < DomChildCount(NodeType.Element, "", "DebugFile"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Element, "", "DebugFile", i);
				InternalAdjustPrefix(DOMNode, false);
				new DebugFileType(DOMNode).AdjustPrefix();
			}

			for (int i = 0; i < DomChildCount(NodeType.Element, "", "ports"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Element, "", "ports", i);
				InternalAdjustPrefix(DOMNode, false);
				new portsType(DOMNode).AdjustPrefix();
			}

			for (int i = 0; i < DomChildCount(NodeType.Element, "", "MimeTypes"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Element, "", "MimeTypes", i);
				InternalAdjustPrefix(DOMNode, false);
				new MimeTypesType(DOMNode).AdjustPrefix();
			}

			for (int i = 0; i < DomChildCount(NodeType.Element, "", "DefaultFiles"); i++)
			{
				XmlNode DOMNode = GetDomChildAt(NodeType.Element, "", "DefaultFiles", i);
				InternalAdjustPrefix(DOMNode, false);
				new DefaultFilesType(DOMNode).AdjustPrefix();
			}
		}


		#region xmlns_xsi accessor methods
		public int Getxmlns_xsiMinCount()
		{
			return 1;
		}

		public int xmlns_xsiMinCount
		{
			get
			{
				return 1;
			}
		}

		public int Getxmlns_xsiMaxCount()
		{
			return 1;
		}

		public int xmlns_xsiMaxCount
		{
			get
			{
				return 1;
			}
		}

		public int Getxmlns_xsiCount()
		{
			return DomChildCount(NodeType.Attribute, "", "xmlns:xsi");
		}

		public int xmlns_xsiCount
		{
			get
			{
				return DomChildCount(NodeType.Attribute, "", "xmlns:xsi");
			}
		}

		public bool Hasxmlns_xsi()
		{
			return HasDomChild(NodeType.Attribute, "", "xmlns:xsi");
		}

		public SchemaString Getxmlns_xsiAt(int index)
		{
			return new SchemaString(GetDomNodeValue(GetDomChildAt(NodeType.Attribute, "", "xmlns:xsi", index)));
		}

		public SchemaString Getxmlns_xsi()
		{
			return Getxmlns_xsiAt(0);
		}

		public SchemaString xmlns_xsi
		{
			get
			{
				return Getxmlns_xsiAt(0);
			}
		}

		public void Removexmlns_xsiAt(int index)
		{
			RemoveDomChildAt(NodeType.Attribute, "", "xmlns:xsi", index);
		}

		public void Removexmlns_xsi()
		{
			while (Hasxmlns_xsi())
				Removexmlns_xsiAt(0);
		}

		public void Addxmlns_xsi(SchemaString newValue)
		{
			AppendDomChild(NodeType.Attribute, "", "xmlns:xsi", newValue.ToString());
		}

		public void Insertxmlns_xsiAt(SchemaString newValue, int index)
		{
			InsertDomChildAt(NodeType.Attribute, "", "xmlns:xsi", index, newValue.ToString());
		}

		public void Replacexmlns_xsiAt(SchemaString newValue, int index)
		{
			ReplaceDomChildAt(NodeType.Attribute, "", "xmlns:xsi", index, newValue.ToString());
		}
		#endregion // xmlns_xsi accessor methods

		#region xmlns_xsi collection
        public xmlns_xsiCollection	Myxmlns_xsis = new xmlns_xsiCollection( );

        public class xmlns_xsiCollection: IEnumerable
        {
            configType parent;
            public configType Parent
			{
				set
				{
					parent = value;
				}
			}
			public xmlns_xsiEnumerator GetEnumerator() 
			{
				return new xmlns_xsiEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class xmlns_xsiEnumerator: IEnumerator 
        {
			int nIndex;
			configType parent;
			public xmlns_xsiEnumerator(configType par) 
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
				return(nIndex < parent.xmlns_xsiCount );
			}
			public SchemaString  Current 
			{
				get 
				{
					return(parent.Getxmlns_xsiAt(nIndex));
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

        #endregion // xmlns_xsi collection

		#region xsi_noNamespaceSchemaLocation accessor methods
		public int Getxsi_noNamespaceSchemaLocationMinCount()
		{
			return 1;
		}

		public int xsi_noNamespaceSchemaLocationMinCount
		{
			get
			{
				return 1;
			}
		}

		public int Getxsi_noNamespaceSchemaLocationMaxCount()
		{
			return 1;
		}

		public int xsi_noNamespaceSchemaLocationMaxCount
		{
			get
			{
				return 1;
			}
		}

		public int Getxsi_noNamespaceSchemaLocationCount()
		{
			return DomChildCount(NodeType.Attribute, "", "xsi:noNamespaceSchemaLocation");
		}

		public int xsi_noNamespaceSchemaLocationCount
		{
			get
			{
				return DomChildCount(NodeType.Attribute, "", "xsi:noNamespaceSchemaLocation");
			}
		}

		public bool Hasxsi_noNamespaceSchemaLocation()
		{
			return HasDomChild(NodeType.Attribute, "", "xsi:noNamespaceSchemaLocation");
		}

		public SchemaString Getxsi_noNamespaceSchemaLocationAt(int index)
		{
			return new SchemaString(GetDomNodeValue(GetDomChildAt(NodeType.Attribute, "", "xsi:noNamespaceSchemaLocation", index)));
		}

		public SchemaString Getxsi_noNamespaceSchemaLocation()
		{
			return Getxsi_noNamespaceSchemaLocationAt(0);
		}

		public SchemaString xsi_noNamespaceSchemaLocation
		{
			get
			{
				return Getxsi_noNamespaceSchemaLocationAt(0);
			}
		}

		public void Removexsi_noNamespaceSchemaLocationAt(int index)
		{
			RemoveDomChildAt(NodeType.Attribute, "", "xsi:noNamespaceSchemaLocation", index);
		}

		public void Removexsi_noNamespaceSchemaLocation()
		{
			while (Hasxsi_noNamespaceSchemaLocation())
				Removexsi_noNamespaceSchemaLocationAt(0);
		}

		public void Addxsi_noNamespaceSchemaLocation(SchemaString newValue)
		{
			AppendDomChild(NodeType.Attribute, "", "xsi:noNamespaceSchemaLocation", newValue.ToString());
		}

		public void Insertxsi_noNamespaceSchemaLocationAt(SchemaString newValue, int index)
		{
			InsertDomChildAt(NodeType.Attribute, "", "xsi:noNamespaceSchemaLocation", index, newValue.ToString());
		}

		public void Replacexsi_noNamespaceSchemaLocationAt(SchemaString newValue, int index)
		{
			ReplaceDomChildAt(NodeType.Attribute, "", "xsi:noNamespaceSchemaLocation", index, newValue.ToString());
		}
		#endregion // xsi_noNamespaceSchemaLocation accessor methods

		#region xsi_noNamespaceSchemaLocation collection
        public xsi_noNamespaceSchemaLocationCollection	Myxsi_noNamespaceSchemaLocations = new xsi_noNamespaceSchemaLocationCollection( );

        public class xsi_noNamespaceSchemaLocationCollection: IEnumerable
        {
            configType parent;
            public configType Parent
			{
				set
				{
					parent = value;
				}
			}
			public xsi_noNamespaceSchemaLocationEnumerator GetEnumerator() 
			{
				return new xsi_noNamespaceSchemaLocationEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class xsi_noNamespaceSchemaLocationEnumerator: IEnumerator 
        {
			int nIndex;
			configType parent;
			public xsi_noNamespaceSchemaLocationEnumerator(configType par) 
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
				return(nIndex < parent.xsi_noNamespaceSchemaLocationCount );
			}
			public SchemaString  Current 
			{
				get 
				{
					return(parent.Getxsi_noNamespaceSchemaLocationAt(nIndex));
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

        #endregion // xsi_noNamespaceSchemaLocation collection

		#region documentRoot accessor methods
		public int GetdocumentRootMinCount()
		{
			return 1;
		}

		public int documentRootMinCount
		{
			get
			{
				return 1;
			}
		}

		public int GetdocumentRootMaxCount()
		{
			return 1;
		}

		public int documentRootMaxCount
		{
			get
			{
				return 1;
			}
		}

		public int GetdocumentRootCount()
		{
			return DomChildCount(NodeType.Element, "", "documentRoot");
		}

		public int documentRootCount
		{
			get
			{
				return DomChildCount(NodeType.Element, "", "documentRoot");
			}
		}

		public bool HasdocumentRoot()
		{
			return HasDomChild(NodeType.Element, "", "documentRoot");
		}

		public documentRootType GetdocumentRootAt(int index)
		{
			return new documentRootType(GetDomChildAt(NodeType.Element, "", "documentRoot", index));
		}

		public documentRootType GetdocumentRoot()
		{
			return GetdocumentRootAt(0);
		}

		public documentRootType documentRoot
		{
			get
			{
				return GetdocumentRootAt(0);
			}
		}

		public void RemovedocumentRootAt(int index)
		{
			RemoveDomChildAt(NodeType.Element, "", "documentRoot", index);
		}

		public void RemovedocumentRoot()
		{
			while (HasdocumentRoot())
				RemovedocumentRootAt(0);
		}

		public void AdddocumentRoot(documentRootType newValue)
		{
			AppendDomElement("", "documentRoot", newValue);
		}

		public void InsertdocumentRootAt(documentRootType newValue, int index)
		{
			InsertDomElementAt("", "documentRoot", index, newValue);
		}

		public void ReplacedocumentRootAt(documentRootType newValue, int index)
		{
			ReplaceDomElementAt("", "documentRoot", index, newValue);
		}
		#endregion // documentRoot accessor methods

		#region documentRoot collection
        public documentRootCollection	MydocumentRoots = new documentRootCollection( );

        public class documentRootCollection: IEnumerable
        {
            configType parent;
            public configType Parent
			{
				set
				{
					parent = value;
				}
			}
			public documentRootEnumerator GetEnumerator() 
			{
				return new documentRootEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class documentRootEnumerator: IEnumerator 
        {
			int nIndex;
			configType parent;
			public documentRootEnumerator(configType par) 
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
				return(nIndex < parent.documentRootCount );
			}
			public documentRootType  Current 
			{
				get 
				{
					return(parent.GetdocumentRootAt(nIndex));
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

        #endregion // documentRoot collection

		#region LogFile accessor methods
		public int GetLogFileMinCount()
		{
			return 1;
		}

		public int LogFileMinCount
		{
			get
			{
				return 1;
			}
		}

		public int GetLogFileMaxCount()
		{
			return 1;
		}

		public int LogFileMaxCount
		{
			get
			{
				return 1;
			}
		}

		public int GetLogFileCount()
		{
			return DomChildCount(NodeType.Element, "", "LogFile");
		}

		public int LogFileCount
		{
			get
			{
				return DomChildCount(NodeType.Element, "", "LogFile");
			}
		}

		public bool HasLogFile()
		{
			return HasDomChild(NodeType.Element, "", "LogFile");
		}

		public LogFileType GetLogFileAt(int index)
		{
			return new LogFileType(GetDomChildAt(NodeType.Element, "", "LogFile", index));
		}

		public LogFileType GetLogFile()
		{
			return GetLogFileAt(0);
		}

		public LogFileType LogFile
		{
			get
			{
				return GetLogFileAt(0);
			}
		}

		public void RemoveLogFileAt(int index)
		{
			RemoveDomChildAt(NodeType.Element, "", "LogFile", index);
		}

		public void RemoveLogFile()
		{
			while (HasLogFile())
				RemoveLogFileAt(0);
		}

		public void AddLogFile(LogFileType newValue)
		{
			AppendDomElement("", "LogFile", newValue);
		}

		public void InsertLogFileAt(LogFileType newValue, int index)
		{
			InsertDomElementAt("", "LogFile", index, newValue);
		}

		public void ReplaceLogFileAt(LogFileType newValue, int index)
		{
			ReplaceDomElementAt("", "LogFile", index, newValue);
		}
		#endregion // LogFile accessor methods

		#region LogFile collection
        public LogFileCollection	MyLogFiles = new LogFileCollection( );

        public class LogFileCollection: IEnumerable
        {
            configType parent;
            public configType Parent
			{
				set
				{
					parent = value;
				}
			}
			public LogFileEnumerator GetEnumerator() 
			{
				return new LogFileEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class LogFileEnumerator: IEnumerator 
        {
			int nIndex;
			configType parent;
			public LogFileEnumerator(configType par) 
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
				return(nIndex < parent.LogFileCount );
			}
			public LogFileType  Current 
			{
				get 
				{
					return(parent.GetLogFileAt(nIndex));
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

        #endregion // LogFile collection

		#region DebugFile accessor methods
		public int GetDebugFileMinCount()
		{
			return 1;
		}

		public int DebugFileMinCount
		{
			get
			{
				return 1;
			}
		}

		public int GetDebugFileMaxCount()
		{
			return 1;
		}

		public int DebugFileMaxCount
		{
			get
			{
				return 1;
			}
		}

		public int GetDebugFileCount()
		{
			return DomChildCount(NodeType.Element, "", "DebugFile");
		}

		public int DebugFileCount
		{
			get
			{
				return DomChildCount(NodeType.Element, "", "DebugFile");
			}
		}

		public bool HasDebugFile()
		{
			return HasDomChild(NodeType.Element, "", "DebugFile");
		}

		public DebugFileType GetDebugFileAt(int index)
		{
			return new DebugFileType(GetDomChildAt(NodeType.Element, "", "DebugFile", index));
		}

		public DebugFileType GetDebugFile()
		{
			return GetDebugFileAt(0);
		}

		public DebugFileType DebugFile
		{
			get
			{
				return GetDebugFileAt(0);
			}
		}

		public void RemoveDebugFileAt(int index)
		{
			RemoveDomChildAt(NodeType.Element, "", "DebugFile", index);
		}

		public void RemoveDebugFile()
		{
			while (HasDebugFile())
				RemoveDebugFileAt(0);
		}

		public void AddDebugFile(DebugFileType newValue)
		{
			AppendDomElement("", "DebugFile", newValue);
		}

		public void InsertDebugFileAt(DebugFileType newValue, int index)
		{
			InsertDomElementAt("", "DebugFile", index, newValue);
		}

		public void ReplaceDebugFileAt(DebugFileType newValue, int index)
		{
			ReplaceDomElementAt("", "DebugFile", index, newValue);
		}
		#endregion // DebugFile accessor methods

		#region DebugFile collection
        public DebugFileCollection	MyDebugFiles = new DebugFileCollection( );

        public class DebugFileCollection: IEnumerable
        {
            configType parent;
            public configType Parent
			{
				set
				{
					parent = value;
				}
			}
			public DebugFileEnumerator GetEnumerator() 
			{
				return new DebugFileEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class DebugFileEnumerator: IEnumerator 
        {
			int nIndex;
			configType parent;
			public DebugFileEnumerator(configType par) 
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
				return(nIndex < parent.DebugFileCount );
			}
			public DebugFileType  Current 
			{
				get 
				{
					return(parent.GetDebugFileAt(nIndex));
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

        #endregion // DebugFile collection

		#region ports accessor methods
		public int GetportsMinCount()
		{
			return 1;
		}

		public int portsMinCount
		{
			get
			{
				return 1;
			}
		}

		public int GetportsMaxCount()
		{
			return 1;
		}

		public int portsMaxCount
		{
			get
			{
				return 1;
			}
		}

		public int GetportsCount()
		{
			return DomChildCount(NodeType.Element, "", "ports");
		}

		public int portsCount
		{
			get
			{
				return DomChildCount(NodeType.Element, "", "ports");
			}
		}

		public bool Hasports()
		{
			return HasDomChild(NodeType.Element, "", "ports");
		}

		public portsType GetportsAt(int index)
		{
			return new portsType(GetDomChildAt(NodeType.Element, "", "ports", index));
		}

		public portsType Getports()
		{
			return GetportsAt(0);
		}

		public portsType ports
		{
			get
			{
				return GetportsAt(0);
			}
		}

		public void RemoveportsAt(int index)
		{
			RemoveDomChildAt(NodeType.Element, "", "ports", index);
		}

		public void Removeports()
		{
			while (Hasports())
				RemoveportsAt(0);
		}

		public void Addports(portsType newValue)
		{
			AppendDomElement("", "ports", newValue);
		}

		public void InsertportsAt(portsType newValue, int index)
		{
			InsertDomElementAt("", "ports", index, newValue);
		}

		public void ReplaceportsAt(portsType newValue, int index)
		{
			ReplaceDomElementAt("", "ports", index, newValue);
		}
		#endregion // ports accessor methods

		#region ports collection
        public portsCollection	Myportss = new portsCollection( );

        public class portsCollection: IEnumerable
        {
            configType parent;
            public configType Parent
			{
				set
				{
					parent = value;
				}
			}
			public portsEnumerator GetEnumerator() 
			{
				return new portsEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class portsEnumerator: IEnumerator 
        {
			int nIndex;
			configType parent;
			public portsEnumerator(configType par) 
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
				return(nIndex < parent.portsCount );
			}
			public portsType  Current 
			{
				get 
				{
					return(parent.GetportsAt(nIndex));
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

        #endregion // ports collection

		#region MimeTypes accessor methods
		public int GetMimeTypesMinCount()
		{
			return 1;
		}

		public int MimeTypesMinCount
		{
			get
			{
				return 1;
			}
		}

		public int GetMimeTypesMaxCount()
		{
			return 1;
		}

		public int MimeTypesMaxCount
		{
			get
			{
				return 1;
			}
		}

		public int GetMimeTypesCount()
		{
			return DomChildCount(NodeType.Element, "", "MimeTypes");
		}

		public int MimeTypesCount
		{
			get
			{
				return DomChildCount(NodeType.Element, "", "MimeTypes");
			}
		}

		public bool HasMimeTypes()
		{
			return HasDomChild(NodeType.Element, "", "MimeTypes");
		}

		public MimeTypesType GetMimeTypesAt(int index)
		{
			return new MimeTypesType(GetDomChildAt(NodeType.Element, "", "MimeTypes", index));
		}

		public MimeTypesType GetMimeTypes()
		{
			return GetMimeTypesAt(0);
		}

		public MimeTypesType MimeTypes
		{
			get
			{
				return GetMimeTypesAt(0);
			}
		}

		public void RemoveMimeTypesAt(int index)
		{
			RemoveDomChildAt(NodeType.Element, "", "MimeTypes", index);
		}

		public void RemoveMimeTypes()
		{
			while (HasMimeTypes())
				RemoveMimeTypesAt(0);
		}

		public void AddMimeTypes(MimeTypesType newValue)
		{
			AppendDomElement("", "MimeTypes", newValue);
		}

		public void InsertMimeTypesAt(MimeTypesType newValue, int index)
		{
			InsertDomElementAt("", "MimeTypes", index, newValue);
		}

		public void ReplaceMimeTypesAt(MimeTypesType newValue, int index)
		{
			ReplaceDomElementAt("", "MimeTypes", index, newValue);
		}
		#endregion // MimeTypes accessor methods

		#region MimeTypes collection
        public MimeTypesCollection	MyMimeTypess = new MimeTypesCollection( );

        public class MimeTypesCollection: IEnumerable
        {
            configType parent;
            public configType Parent
			{
				set
				{
					parent = value;
				}
			}
			public MimeTypesEnumerator GetEnumerator() 
			{
				return new MimeTypesEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class MimeTypesEnumerator: IEnumerator 
        {
			int nIndex;
			configType parent;
			public MimeTypesEnumerator(configType par) 
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
				return(nIndex < parent.MimeTypesCount );
			}
			public MimeTypesType  Current 
			{
				get 
				{
					return(parent.GetMimeTypesAt(nIndex));
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

        #endregion // MimeTypes collection

		#region DefaultFiles accessor methods
		public int GetDefaultFilesMinCount()
		{
			return 1;
		}

		public int DefaultFilesMinCount
		{
			get
			{
				return 1;
			}
		}

		public int GetDefaultFilesMaxCount()
		{
			return 1;
		}

		public int DefaultFilesMaxCount
		{
			get
			{
				return 1;
			}
		}

		public int GetDefaultFilesCount()
		{
			return DomChildCount(NodeType.Element, "", "DefaultFiles");
		}

		public int DefaultFilesCount
		{
			get
			{
				return DomChildCount(NodeType.Element, "", "DefaultFiles");
			}
		}

		public bool HasDefaultFiles()
		{
			return HasDomChild(NodeType.Element, "", "DefaultFiles");
		}

		public DefaultFilesType GetDefaultFilesAt(int index)
		{
			return new DefaultFilesType(GetDomChildAt(NodeType.Element, "", "DefaultFiles", index));
		}

		public DefaultFilesType GetDefaultFiles()
		{
			return GetDefaultFilesAt(0);
		}

		public DefaultFilesType DefaultFiles
		{
			get
			{
				return GetDefaultFilesAt(0);
			}
		}

		public void RemoveDefaultFilesAt(int index)
		{
			RemoveDomChildAt(NodeType.Element, "", "DefaultFiles", index);
		}

		public void RemoveDefaultFiles()
		{
			while (HasDefaultFiles())
				RemoveDefaultFilesAt(0);
		}

		public void AddDefaultFiles(DefaultFilesType newValue)
		{
			AppendDomElement("", "DefaultFiles", newValue);
		}

		public void InsertDefaultFilesAt(DefaultFilesType newValue, int index)
		{
			InsertDomElementAt("", "DefaultFiles", index, newValue);
		}

		public void ReplaceDefaultFilesAt(DefaultFilesType newValue, int index)
		{
			ReplaceDomElementAt("", "DefaultFiles", index, newValue);
		}
		#endregion // DefaultFiles accessor methods

		#region DefaultFiles collection
        public DefaultFilesCollection	MyDefaultFiless = new DefaultFilesCollection( );

        public class DefaultFilesCollection: IEnumerable
        {
            configType parent;
            public configType Parent
			{
				set
				{
					parent = value;
				}
			}
			public DefaultFilesEnumerator GetEnumerator() 
			{
				return new DefaultFilesEnumerator(parent);
			}
		
			IEnumerator IEnumerable.GetEnumerator() 
			{
				return GetEnumerator();
			}
        }

        public class DefaultFilesEnumerator: IEnumerator 
        {
			int nIndex;
			configType parent;
			public DefaultFilesEnumerator(configType par) 
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
				return(nIndex < parent.DefaultFilesCount );
			}
			public DefaultFilesType  Current 
			{
				get 
				{
					return(parent.GetDefaultFilesAt(nIndex));
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

        #endregion // DefaultFiles collection

        private void SetCollectionParents()
        {
            Myxmlns_xsis.Parent = this; 
            Myxsi_noNamespaceSchemaLocations.Parent = this; 
            MydocumentRoots.Parent = this; 
            MyLogFiles.Parent = this; 
            MyDebugFiles.Parent = this; 
            Myportss.Parent = this; 
            MyMimeTypess.Parent = this; 
            MyDefaultFiless.Parent = this; 
	}
}
}
