using System;
using System.Collections;

namespace ComponentModel {
	/// <summary>
	/// </summary>
	public interface IComponent {
		IList GetProvidesIFaceList( IList aProvIFaceList );

		IList GetRequiresIFaceList( IList aReqIFaceList );

		IList GetProvidesIFaceList();

		IList GetRequiresIFaceList();
	}
}
