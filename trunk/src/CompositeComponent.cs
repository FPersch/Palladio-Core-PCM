using System;
using System.Collections;

namespace Palladio.ComponentModel 
{
	/// <summary>
	/// Component assembled of wired components.
	/// </summary>
	public class CompositeComponent : ICompositeComponent 
	{

		private IList componentList;
		private IList bindingList;
		private IList provMappingList;
		private IList reqMappingList;

		/// <summary>
		/// List of IComponent objects assembled by the CompositComponent.
		/// </summary>
		public IList ComponentList 
		{ 
			get { return componentList; }
		}

		/// <summary>
		/// List of Binding objects which represent 
		/// the wiring of the internal components.
		/// </summary>
		public IList BindingList 
		{ 
			get { return bindingList; }
		}

		/// <summary>
		/// List of ProvidesMapping objects mapping the provides interfaces
		/// of the internal components onto the provides interfaces of the
		/// CompositeComponent.
		/// </summary>
		public IList ProvMappingList 
		{ 
			get { return provMappingList; }
		}

		/// <summary>
		/// List of RequiresMapping objects mapping the requires interfaces
		/// of the internal components onto the requires interfaces of the
		/// CompositeComponent.
		/// </summary>
		public IList ReqMappingList 
		{ 
			get { return reqMappingList; }
		}

		public IList MappingList 
		{
			get { 
				ArrayList resultList = new ArrayList(ReqMappingList);
				resultList.AddRange(ProvMappingList);
				return resultList;
			}
		}

		public CompositeComponent() 
		{
		}

		public IList GetProvidesIFaceList(IList aProvIFaceList) 
		{
			return null;
		}

		public IList GetRequiresIFaceList(IList aReqIFaceList) 
		{
			return null;
		}

		public IList GetProvidesIFaceList() 
		{
			return null;
		}

		public IList GetRequiresIFaceList() 
		{
			return null;
		}

		public bool IsSubTypeOf( IComponent aSuperType )
		{
			return false;
		}

		public bool IsSubTypeOf( IComponent aSuperType, out IList anErrorList)
		{
			anErrorList = new ArrayList();
			return false;
		}

	}
}
