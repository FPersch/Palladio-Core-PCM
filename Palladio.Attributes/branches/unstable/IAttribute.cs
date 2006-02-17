using System;

namespace Palladio.Attributes
{
	/// <summary>
	/// Zusammenfassung f�r IAttribute.
	/// </summary>
	public interface IAttribute
	{
		void Serialize(System.Xml.XmlTextWriter writer);
		void Deserialize(System.Xml.XmlNode element);
	}
}
