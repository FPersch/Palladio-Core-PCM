#region info
///////////////////////////////////////////////////////////////////////////////
// This software has been developed as a part of the diploma thesis 
// "Einfluss von Generatorkonfiguration auf die QoS-Vorhersage f�r 
// Komponentenadapter" ("Influence of the configuration of a generator on the 
// prediction of the QoS of component adaptors")
// at the 
// University of Oldenburg
// Department of Computing Science
// Software Engineering Group
// Palladio Research Group
// (http://se.informatik.uni-oldenburg.de/research/projects/Palladio)
// 
// Development period: July 2005 - January 2006
// 
// Author: Niels Streekmann
// E-mail: niels.streekmann@informatik.uni-oldenburg.de
///////////////////////////////////////////////////////////////////////////////
#endregion

using System;
using System.Collections;
using System.Globalization;
using antlr.collections;
using QmlParser;

namespace Palladio.QoSAdaptor.QMLComparison.QmlSpecification
{
	/// <summary>
	/// Zusammenfassung f�r QMLPercentileAspect.
	/// </summary>
	public class QMLPercentileAspect : IQMLStatConstraint
	{
		#region data
		// Type value is specified in QMLParser.QMLTokenTypes
		private int type; 
		private double percentile;
		private int numericOperator;
		private double value;
		#endregion	

		#region constructor 
		/// <summary>
		/// Constructor that takes an AST and constructs a new 
		/// QMLPercentileAspect containing the same information as the AST.
		/// </summary>
		/// <param name="percentileAspect">AST representing a QML percentile 
		/// aspect.</param>
		public QMLPercentileAspect(AST percentileAspect)
		{
			if (percentileAspect.Type != QMLTokenTypes.PERCENTILE_CONTR)
				throw new QMLSpecificationConstructionException
					("Illegal argument in QMLPercentileAspect constructor. "+
					"Invalid aspect type: "+percentileAspect.Type);

			this.type = percentileAspect.Type;
			AST child = percentileAspect.getFirstChild();
			this.percentile = Double.Parse(child.getText(), 
													new CultureInfo("en-US"));

			child = child.getNextSibling();
			if (child.Type == QMLParser.NUMOP_EQUAL ||
				child.Type == QMLParser.NUMOP_GTE ||
				child.Type == QMLParser.NUMOP_GTHAN ||
				child.Type == QMLParser.NUMOP_LTE ||
				child.Type == QMLParser.NUMOP_LTHAN)
				this.numericOperator = child.Type;
			else 
				throw new QMLSpecificationConstructionException
					("Error in QMLPercentileAspect constructor. "+
					"Unknown numeric operator.");

			child = child.getNextSibling();
			this.value = Double.Parse(child.getText(), 
													new CultureInfo("en-US"));
		}
		#endregion

		#region Properties
		/// <summary>
		/// Returns the value of the percentile field of this 
		/// QMLPercentileAspect
		/// </summary>
		public double Percentile
		{
			get
			{
				return this.percentile;
			}
		}

		/// <summary>
		/// Returns the numeric operator belonging to this QMLPercentileAspect.
		/// </summary>
		public int NumericOperator
		{
			get
			{
				return this.numericOperator;
			}
		}

		/// <summary>
		/// Returns the value belonging to this QMLPercentileAspect.
		/// </summary>
		public double Value
		{
			get
			{
				return this.value;
			}
		}
		#endregion

		#region public methods
		/// <summary>
		/// Returns a new QML percentile aspect string containing all 
		/// information in this QMLPercentileAspect which is compatible to the 
		/// grammar accepted by the QMLParser by Lars Karg.
		/// </summary>
		/// <returns>QML percentile aspect.</returns>
		public override string ToString()
		{
			string s = "percentile "+this.percentile+" ";
			switch (this.numericOperator)
			{
				case QMLParser.NUMOP_GTE:
					s += ">=";
					break;
				case QMLParser.NUMOP_GTHAN:
					s += ">";
					break;
				case QMLParser.NUMOP_LTHAN:
					s += "<";
					break;
				case QMLParser.NUMOP_LTE:
					s += "<=";
					break;
				case QMLParser.NUMOP_EQUAL:
					s += "==";
					break;
			}
			s += " "+this.value+";";
			return s;
		}

		/// <summary>
		/// Getter for the aspect type. Not implemented as property, because
		/// properties are not allowed in interfaces.
		/// </summary>
		/// <returns>The type of this aspect. The value is specified in 
		/// QMLParser.QMLTokenTypes.</returns>
		public int Type()
		{
			return this.type;
		}

		/// <summary>
		/// Checks if this QMLPercentileAspect matches the given aspect.
		/// I.e. is better or equal to the given aspect. 
		/// As part of a mismatch search this aspect should be part of the
		/// provided specification while the given aspect should be part of the
		/// required specification.
		/// 
		/// Note: This method is implemented here, because it is part of the
		/// IQMLStatInterface. The method is not used in the mismatch search 
		/// at the moment.
		/// </summary>
		/// <param name="requiredAspect">QMLPercentileAspect that is part of 
		/// the required specification.</param>
		/// <returns>True if this aspect matches the given aspect, 
		/// else false.</returns>
		public bool Matches (IQMLStatConstraint requiredAspect)
		{
			if (this.type != requiredAspect.Type())
				return false;

			// TODO: implement
			return true;
		}

		/// <summary>
		/// Compares this QMLPercentileAspect to another QMLPercentileAspect.
		/// Only the percentiles are taken into consideration. The numeric 
		/// operators and values are not looked at.
		/// </summary>
		/// <param name="aspect">A QMLPercentileAspect</param>
		/// <returns>An int smaller than 0 if this.percentile is smaller than 
		/// aspect.Percentile. 0 if they are equal and a value greater than 0
		/// if this.percentile is bigger than aspect.Percentile.</returns>
		public int Compare (QMLPercentileAspect aspect)
		{
			if (this.percentile < aspect.Percentile)
				return -1;
			else if (this.percentile > aspect.Percentile)
				return 1;
			return 0;
		}
		#endregion
	}
}
