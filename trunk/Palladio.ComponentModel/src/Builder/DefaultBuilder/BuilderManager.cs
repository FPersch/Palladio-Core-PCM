using System;
using Palladio.ComponentModel.Builder.DefaultBuilder.TypeLevelBuilder;
using Palladio.ComponentModel.Builder.TypeLevelBuilder;
using Palladio.ComponentModel.BuilderConstraints;
using Palladio.ComponentModel.ModelDataManagement;

namespace Palladio.ComponentModel.Builder.DefaultBuilder
{
	/// <summary>
	/// The default implementation of the builder manager.
	/// Reduces the usable interface for external users of the builder. Limits the use
	/// to removing / adding constraints and accessing the root builder.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.4  2005/04/23 14:56:44  kelsaka
	/// - enhanced constraints management
	///
	/// Revision 1.3  2005/04/23 11:00:44  kelsaka
	/// - removed Init-Methods from AbstractBuilder - created constructors
	///
	/// Revision 1.2  2005/04/20 21:02:35  kelsaka
	/// - added first methods for constraints
	///
	/// Revision 1.1  2005/04/20 19:54:22  kelsaka
	/// - Example and CM-Environment are now using the IBuilderManager
	///
	/// </pre>
	/// </remarks>
	internal class BuilderManager : IBuilderManager
	{
		private IModelDataManager modelDataManager;
		private IBuilderFactory builderFactory;
		private IRootTypeLevelBuilder rootBuilder;

		/// <summary>
		/// The default constructor.
		/// </summary>
		/// <param name="modelDataManager">Model data management.</param>
		public BuilderManager(IModelDataManager modelDataManager)
		{
			this.modelDataManager = modelDataManager;
			Init ();
		}

		/// <summary>
		/// Initialisation.
		/// </summary>
		private void Init ()
		{
			this.builderFactory = new BuilderFactory(modelDataManager);

		}

		#region constraint-methods

		/// <summary>
		/// Adds the given builder constraint to the list of constraints for
		/// this builder.
		/// </summary>
		/// <param name="builderConstraint">A constraint for this builder.</param>
		public void AddBuilderConstraint (IBasicComponentTypeLevelBuilder builderConstraint)
		{
			this.builderFactory.AddBuilderConstraint(builderConstraint);
		}

		/// <summary>
		/// Removes the given constraints from the list of constraints applied to this builder.
		/// </summary>
		/// <param name="builderConstraint">The constraint to remove.</param>
		public void RemoveBuilderConstraint (IBasicComponentTypeLevelBuilder builderConstraint)
		{
			this.builderFactory.RemoveBuilderConstraint(builderConstraint);
		}

		#endregion

		#region properties

		/// <summary>
		/// The root builder of the actual component model. Root builder for the type level.
		/// Use this builder to set up the static structure of the component model.
		/// </summary>
		public IRootTypeLevelBuilder RootBuilder
		{
			get
			{	
				return rootBuilder;
			}			
		}

		#endregion
	}
}
