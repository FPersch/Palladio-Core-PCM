using System;
using System.Collections;
using Palladio.Attributes;
using ReflectionBasedVisitor;

namespace Palladio.ComponentModel 
{
	/// <summary>
	/// A Component is a set of Provides- and RequiresInterfaces.
	/// </summary>
	public interface IBasicComponent : IComponent, IVisitable
	{
		/// <summary>
		/// Get the service effect specification associated with aSig.
		/// </summary>
		/// <param name="aSig">A signature provided in a role of this component.</param>
		/// <returns>The service effect specification of aSig.</returns>
		ISignatureList GetServiceEffectSpecification(ISignature aSig);

		void ChangeServiceEffectSpecification(IService aServEffSpec);

		void ChangeServiceEffectSpecification(ISignature aSignature, ISignatureList aServEffSpec);

		void AddProvidesInterface(ISignatureList aProvInterface, params IService[] aServEffSpecArray);

		void DeleteProvidesInterfaces(params ISignatureList[] aProvArray);

		void AddRequiresInterfaces(params ISignatureList[] aReqArray);

		void DeleteRequiresInterfaces(params ISignatureList[] aReqArray);

	}
}
