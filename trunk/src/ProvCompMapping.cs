using System;

namespace Palladio.ComponentModel
{
	/// <summary>
	/// Zusammenfassung f�r ProvCompMapping.
	/// </summary>
	public class ProvCompMapping : IMapping
	{
		private IComponent innerComp;
		private IComponent outerComp;
		private ProvIFaceMapping[] ifaceMappings;

		public IComponent InnerComp
		{
			get { return innerComp; }
		}

		public IComponent OuterComp
		{
			get { return OuterComp; }
		}

		public ProvIFaceMapping[] Mappings
		{
			get { return ifaceMappings; }
		}

		public ProvCompMapping(IComponent anInnerComp, IComponent anOuterComp)
		{
			innerComp = anInnerComp;
			outerComp = anOuterComp;
			ifaceMappings = GenerateMappings();
		}

		public ProvCompMapping(IComponent anInnerComp, IComponent anOuterComp, IList aMappingList)
		{
			innerComp = anInnerComp;
			outerComp = anOuterComp;
			ifaceMappings = new ProvIFaceMapping[aMappingList.Count];
			aMappingList.CopyTo(ifaceMappings,0);
		}


		private ProvIFaceMapping[] GenerateMappings()
		{
			IList mappingList = new ArrayList();
			foreach ( ProvuiresInterface reqOuter in outerComp.GetProvuiresIFaceList() )
			{
				bool found = false;
				foreach( ProvuiresInterface reqInner in innerComp.GetProvuiresIFaceList() )
				{
					if (reqOuter.Name.Equals(reqInner.Name))
					{
						found = true;
						mappingList.Add( new ProvIFaceMapping(reqInner,reqOuter) );
						break;
					}
				}
				if (!found)
					throw new NoMappingFoundException(reqInner);
			}
			ProvIFaceMapping[] result = new ProvIFaceMapping[mappingList.Count];
			mappingList.CopyTo(result,0);
			return result;
		}

		#region IMapping Member

		public bool IsSubType(out System.Collections.IList anErrorList)
		{
			// TODO:  Implementierung von ProvCompMapping.IsSubType hinzuf�gen
			anErrorList = null;
			return false;
		}

		bool Palladio.ComponentModel.IMapping.IsSubType()
		{
			// TODO:  Implementierung von ProvCompMapping.Palladio.ComponentModel.IMapping.IsSubType hinzuf�gen
			return false;
		}

		#endregion

		#region IConnection Member

		public IInterfaceModel GetIntersection()
		{
			// TODO:  Implementierung von ProvCompMapping.GetIntersection hinzuf�gen
			return null;
		}

		#endregion

		#region ICloneable Member

		public object Clone()
		{
			// TODO:  Implementierung von ProvCompMapping.Clone hinzuf�gen
			return null;
		}

		#endregion
	}
}
