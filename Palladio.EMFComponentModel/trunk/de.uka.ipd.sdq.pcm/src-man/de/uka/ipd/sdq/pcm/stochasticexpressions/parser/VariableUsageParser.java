// $ANTLR : "expandedvariableusage.g" -> "VariableUsageParser.java"$
  
	package de.uka.ipd.sdq.pcm.stochasticexpressions.parser;
	import de.uka.ipd.sdq.pcm.core.stochastics.*;
	import de.uka.ipd.sdq.probfunction.*;
	import de.uka.ipd.sdq.pcm.parameter.*;
	import java.util.ArrayList;
	import de.uka.ipd.sdq.pcm.stochasticexpressions.StoExPrettyPrintVisitor;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;
@SuppressWarnings({"unused"})
public class VariableUsageParser extends antlr.LLkParser       implements VariableUsageParserTokenTypes
 {

protected VariableUsageParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public VariableUsageParser(TokenBuffer tokenBuf) {
  this(tokenBuf,2);
}

protected VariableUsageParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public VariableUsageParser(TokenStream lexer) {
  this(lexer,2);
}

public VariableUsageParser(ParserSharedInputState state) {
  super(state,2);
  tokenNames = _tokenNames;
}

	public final VariableUsage  variable_usage() throws RecognitionException, TokenStreamException {
		VariableUsage vu;
		
		vu = null; AbstractNamedReference id; VariableCharacterisation vc;
		
		id=scoped_id();
		match(DOT);
		vc=variable_characterisation();
		vu = ParameterFactory.eINSTANCE.createVariableUsage();
				vu.setNamedReference_VariableUsage(id);
				vu.getVariableCharacterisation_VariableUsage().add(vc);
				
		return vu;
	}
	
	public final AbstractNamedReference  scoped_id() throws RecognitionException, TokenStreamException {
		AbstractNamedReference ref;
		
		Token  id1 = null;
		Token  id2 = null;
		ref = null;
		ArrayList<String> nameParts = new ArrayList<String>();
		
		id1 = LT(1);
		match(ID);
		nameParts.add(id1.getText());
		{
		_loop2252:
		do {
			if ((LA(1)==DOT) && (LA(2)==ID||LA(2)==LITERAL_INNER)) {
				match(DOT);
				{
				switch ( LA(1)) {
				case ID:
				{
					id2 = LT(1);
					match(ID);
					nameParts.add(id2.getText());
					break;
				}
				case LITERAL_INNER:
				{
					match(LITERAL_INNER);
					nameParts.add("INNER");
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
			}
			else {
				break _loop2252;
			}
			
		} while (true);
		}
		
			AbstractNamedReference firstNsRef=null;
			NamespaceReference lastNsRef = null;
			for (int i=0; i < nameParts.size()-1; i++)
			{
				NamespaceReference nsRef = ParameterFactory.eINSTANCE.createNamespaceReference();
				nsRef.setReferenceName(nameParts.get(i));
				if (lastNsRef != null)
					lastNsRef.setInnerReference_NamespaceReference(nsRef);
				if (i == 0)
				   	firstNsRef = nsRef;
				lastNsRef = nsRef;
			}
			VariableReference varRef = ParameterFactory.eINSTANCE.createVariableReference();
			varRef.setReferenceName(nameParts.get(nameParts.size()-1));
				if (lastNsRef != null) {
					lastNsRef.setInnerReference_NamespaceReference(varRef);
					ref = firstNsRef;
				}
				else
					ref = varRef;
			
		return ref;
	}
	
	public final VariableCharacterisation  variable_characterisation() throws RecognitionException, TokenStreamException {
		VariableCharacterisation vc;
		
		vc = ParameterFactory.eINSTANCE.createVariableCharacterisation();
			Expression ex; VariableCharacterisationType type;
		
		type=characterisation();
		ex=expression();
			vc.setType(type);
					String result = "= " + new StoExPrettyPrintVisitor().prettyPrint(ex);
					vc.setSpecification(result);
				
		return vc;
	}
	
	public final VariableCharacterisationType  characterisation() throws RecognitionException, TokenStreamException {
		VariableCharacterisationType ct;
		
		ct = null; String type="";
		
		type=characterisation_keywords();
		if(type.equals("TYPE"))
				ct = VariableCharacterisationType.DATATYPE_LITERAL;
			 else if(type.equals("BYTESIZE"))
				ct = VariableCharacterisationType.BYTESIZE_LITERAL;
			 else if(type.equals("NUMBER_OF_ELEMENTS"))
				ct = VariableCharacterisationType.NUMBER_OF_ELEMENTS_LITERAL;
			 else if(type.equals("VALUE"))
				ct = VariableCharacterisationType.VALUE_LITERAL;
			 else if(type.equals("STRUCTURE"))
				ct = VariableCharacterisationType.STRUCTURE_LITERAL;
			
		return ct;
	}
	
	public final Expression  expression() throws RecognitionException, TokenStreamException {
		Expression exp;
		
		exp = null;
		
		Comparison c;
		match(EQUAL);
		c=compareExpr();
		exp = c;
		return exp;
	}
	
	public final Comparison  compareExpr() throws RecognitionException, TokenStreamException {
		Comparison comp;
		
		comp = null;
		
		Term t1 = null, t2 = null;
		t1=sumExpr();
		comp = t1;
		{
		switch ( LA(1)) {
		case EQUAL:
		case GREATER:
		case LESS:
		case NOTEQUAL:
		case GREATEREQUAL:
		case LESSEQUAL:
		{
			CompareExpression compExp = StochasticsFactory.eINSTANCE.createCompareExpression();
			{
			switch ( LA(1)) {
			case GREATER:
			{
				match(GREATER);
				compExp.setOperation(CompareOperations.GREATER_LITERAL);
				break;
			}
			case LESS:
			{
				match(LESS);
				compExp.setOperation(CompareOperations.LESS_LITERAL);
				break;
			}
			case EQUAL:
			{
				match(EQUAL);
				compExp.setOperation(CompareOperations.EQUALS_LITERAL);
				break;
			}
			case NOTEQUAL:
			{
				match(NOTEQUAL);
				compExp.setOperation(CompareOperations.NOTEQUAL_LITERAL);
				break;
			}
			case GREATEREQUAL:
			{
				match(GREATEREQUAL);
				compExp.setOperation(CompareOperations.GREATEREQUAL_LITERAL);
				break;
			}
			case LESSEQUAL:
			{
				match(LESSEQUAL);
				compExp.setOperation(CompareOperations.LESSEQUAL_LITERAL);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			t2=sumExpr();
			compExp.setLeft(t1); compExp.setRight(t2); comp=compExp;
			break;
		}
		case EOF:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return comp;
	}
	
	public final Term  sumExpr() throws RecognitionException, TokenStreamException {
		Term t;
		
		t = null;
		
		Product p1 = null, p2 = null;
		p1=prodExpr();
		t = p1;
		{
		_loop2218:
		do {
			if ((LA(1)==PLUS||LA(1)==MINUS)) {
				TermExpression termExp = StochasticsFactory.eINSTANCE.createTermExpression();
				{
				switch ( LA(1)) {
				case PLUS:
				{
					match(PLUS);
					termExp.setOperation(TermOperations.ADD_LITERAL);
					break;
				}
				case MINUS:
				{
					match(MINUS);
					termExp.setOperation(TermOperations.SUB_LITERAL);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				p2=prodExpr();
				termExp.setLeft(t); termExp.setRight(p2); t = termExp;
			}
			else {
				break _loop2218;
			}
			
		} while (true);
		}
		return t;
	}
	
	public final Product  prodExpr() throws RecognitionException, TokenStreamException {
		Product p;
		
		p = null;
		
		Power pw1 = null, pw2 = null;
		pw1=powExpr();
		p = pw1;
		{
		_loop2222:
		do {
			if (((LA(1) >= MUL && LA(1) <= MOD))) {
				ProductExpression prodExp = StochasticsFactory.eINSTANCE.createProductExpression();
				{
				switch ( LA(1)) {
				case MUL:
				{
					match(MUL);
					prodExp.setOperation(ProductOperations.MULT_LITERAL);
					break;
				}
				case DIV:
				{
					match(DIV);
					prodExp.setOperation(ProductOperations.DIV_LITERAL);
					break;
				}
				case MOD:
				{
					match(MOD);
					prodExp.setOperation(ProductOperations.MOD_LITERAL);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				pw2=powExpr();
				prodExp.setLeft(p); prodExp.setRight(pw2); p = prodExp;
			}
			else {
				break _loop2222;
			}
			
		} while (true);
		}
		return p;
	}
	
	public final Power  powExpr() throws RecognitionException, TokenStreamException {
		Power pw;
		
		pw = null;
		
		Atom a1 = null, a2 = null;
		a1=atom();
		pw = a1;
		{
		switch ( LA(1)) {
		case POW:
		{
			match(POW);
			a2=atom();
			break;
		}
		case EOF:
		case EQUAL:
		case GREATER:
		case LESS:
		case NOTEQUAL:
		case GREATEREQUAL:
		case LESSEQUAL:
		case PLUS:
		case MINUS:
		case MUL:
		case DIV:
		case MOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return pw;
	}
	
	public final Atom  atom() throws RecognitionException, TokenStreamException {
		Atom a;
		
		Token  number = null;
		a = null;
		
		{
		switch ( LA(1)) {
		case NUMBER:
		{
			number = LT(1);
			match(NUMBER);
			
							String value = number.getText();
							if (value.indexOf('.') < 0)
							{
								IntLiteral il = StochasticsFactory.eINSTANCE.createIntLiteral();
								il.setValue(Integer.parseInt(value));
								a = il;
							}
							else
							{
								DoubleLiteral dl = StochasticsFactory.eINSTANCE.createDoubleLiteral();
								dl.setValue(Double.parseDouble(value));
								a = dl;
							}
						
			break;
		}
		case ID:
		{
			AbstractNamedReference id = null; VariableCharacterisationType type;
			id=scoped_id();
			match(DOT);
			type=characterisation();
			a = StochasticsFactory.eINSTANCE.createVariable();
					  	((Variable)a).setId_Variable(id);
					  	((Variable)a).setCharacterisationType(type);
					
			break;
		}
		case LITERAL_IntPMF:
		case LITERAL_DoublePMF:
		case LITERAL_EnumPMF:
		case LITERAL_DoublePDF:
		{
			a=definition();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return a;
	}
	
	public final ProbabilityFunctionLiteral  definition() throws RecognitionException, TokenStreamException {
		ProbabilityFunctionLiteral pfl;
		
		pfl = StochasticsFactory.eINSTANCE.createProbabilityFunctionLiteral();
			 ProbabilityFunction probFunction = null;
		
		switch ( LA(1)) {
		case LITERAL_IntPMF:
		{
			match(LITERAL_IntPMF);
			probFunction = ProbfunctionFactory.eINSTANCE.createProbabilityMassFunction();
							   pfl.setFunction_ProbabilityFunctionLiteral(probFunction);
			match(LPAREN);
			{
			Unit uunit = null;
			uunit=unit();
			probFunction.setUnit(uunit);
			}
			match(RPAREN);
			match(SQUARE_PAREN_L);
			{
			int _cnt2230=0;
			_loop2230:
			do {
				if ((LA(1)==LPAREN)) {
					Sample isample=null;
					isample=numeric_int_sample();
					((ProbabilityMassFunction)probFunction).getSamples().add(isample);
				}
				else {
					if ( _cnt2230>=1 ) { break _loop2230; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt2230++;
			} while (true);
			}
			match(SQUARE_PAREN_R);
			break;
		}
		case LITERAL_DoublePMF:
		{
			match(LITERAL_DoublePMF);
			probFunction = ProbfunctionFactory.eINSTANCE.createProbabilityMassFunction();
							   pfl.setFunction_ProbabilityFunctionLiteral(probFunction);
			match(LPAREN);
			{
			Unit uunit = null;
			uunit=unit();
			probFunction.setUnit(uunit);
			}
			match(RPAREN);
			match(SQUARE_PAREN_L);
			{
			int _cnt2233=0;
			_loop2233:
			do {
				if ((LA(1)==LPAREN)) {
					Sample rsample=null;
					rsample=numeric_real_sample();
					((ProbabilityMassFunction)probFunction).getSamples().add(rsample);
				}
				else {
					if ( _cnt2233>=1 ) { break _loop2233; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt2233++;
			} while (true);
			}
			match(SQUARE_PAREN_R);
			break;
		}
		case LITERAL_EnumPMF:
		{
			match(LITERAL_EnumPMF);
			probFunction = ProbfunctionFactory.eINSTANCE.createProbabilityMassFunction();
							   pfl.setFunction_ProbabilityFunctionLiteral(probFunction);
							   ((ProbabilityMassFunction)probFunction).setOrderedDomain(false);
							
			match(LPAREN);
			{
			Unit uunit = null;
			uunit=unit();
			probFunction.setUnit(uunit);
			}
			{
			switch ( LA(1)) {
			case SEMI:
			{
				match(SEMI);
				match(ORDERED_DEF);
				((ProbabilityMassFunction)probFunction).setOrderedDomain(true);
				break;
			}
			case RPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(RPAREN);
			match(SQUARE_PAREN_L);
			{
			int _cnt2237=0;
			_loop2237:
			do {
				if ((LA(1)==LPAREN)) {
					Sample ssample=null;
					ssample=stringsample();
					((ProbabilityMassFunction)probFunction).getSamples().add(ssample);
				}
				else {
					if ( _cnt2237>=1 ) { break _loop2237; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt2237++;
			} while (true);
			}
			match(SQUARE_PAREN_R);
			break;
		}
		case LITERAL_DoublePDF:
		{
			match(LITERAL_DoublePDF);
			probFunction = ProbfunctionFactory.eINSTANCE.createBoxedPDF();
							   pfl.setFunction_ProbabilityFunctionLiteral(probFunction);
			match(LPAREN);
			{
			Unit uunit = null;
			uunit=unit();
			probFunction.setUnit(uunit);
			}
			match(RPAREN);
			match(SQUARE_PAREN_L);
			{
			int _cnt2240=0;
			_loop2240:
			do {
				if ((LA(1)==LPAREN)) {
					ContinuousSample pdf_sample=null;
					pdf_sample=real_pdf_sample();
					((BoxedPDF)probFunction).getSamples().add(pdf_sample);
				}
				else {
					if ( _cnt2240>=1 ) { break _loop2240; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt2240++;
			} while (true);
			}
			match(SQUARE_PAREN_R);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return pfl;
	}
	
	public final Unit  unit() throws RecognitionException, TokenStreamException {
		Unit u;
		
		Token  str = null;
		u = null;
		
		match(LITERAL_unit);
		u = ProbfunctionFactory.eINSTANCE.createUnit();
		match(EQUAL);
		str = LT(1);
		match(STRING_LITERAL);
		u.setUnitName(str.getText().replace("\"",""));
		return u;
	}
	
	public final Sample  numeric_int_sample() throws RecognitionException, TokenStreamException {
		Sample s;
		
		Token  n = null;
		Token  n2 = null;
		s = null;
		
		match(LPAREN);
		s = ProbfunctionFactory.eINSTANCE.createSample();
		n = LT(1);
		match(NUMBER);
		s.setProbability(Double.parseDouble(n.getText()));
		match(SEMI);
		n2 = LT(1);
		match(NUMBER);
		s.setValue(Integer.parseInt(n2.getText()));
		match(RPAREN);
		return s;
	}
	
	public final Sample  numeric_real_sample() throws RecognitionException, TokenStreamException {
		Sample s;
		
		Token  n = null;
		Token  n2 = null;
		s = null;
		
		match(LPAREN);
		s = ProbfunctionFactory.eINSTANCE.createSample();
		n = LT(1);
		match(NUMBER);
		s.setProbability(Double.parseDouble(n.getText()));
		match(SEMI);
		n2 = LT(1);
		match(NUMBER);
		s.setValue(Double.parseDouble(n2.getText()));
		match(RPAREN);
		return s;
	}
	
	public final Sample  stringsample() throws RecognitionException, TokenStreamException {
		Sample s;
		
		Token  n = null;
		Token  str = null;
		s = null;
		
		match(LPAREN);
		s = ProbfunctionFactory.eINSTANCE.createSample();
		n = LT(1);
		match(NUMBER);
		s.setProbability(Double.parseDouble(n.getText()));
		match(SEMI);
		str = LT(1);
		match(STRING_LITERAL);
		s.setValue(str.getText().replace("\"",""));
		match(RPAREN);
		return s;
	}
	
	public final ContinuousSample  real_pdf_sample() throws RecognitionException, TokenStreamException {
		ContinuousSample s;
		
		Token  n = null;
		Token  n2 = null;
		s = null;
		
		match(LPAREN);
		s = ProbfunctionFactory.eINSTANCE.createContinuousSample();
		n = LT(1);
		match(NUMBER);
		s.setValue(Double.parseDouble(n.getText()));
		match(SEMI);
		n2 = LT(1);
		match(NUMBER);
		s.setProbability(Double.parseDouble(n2.getText()));
		match(RPAREN);
		return s;
	}
	
	public final String  characterisation_keywords() throws RecognitionException, TokenStreamException {
		String keyword;
		
		keyword = null;
		
		{
		switch ( LA(1)) {
		case LITERAL_BYTESIZE:
		{
			match(LITERAL_BYTESIZE);
			keyword="BYTESIZE";
			break;
		}
		case LITERAL_STRUCTURE:
		{
			match(LITERAL_STRUCTURE);
			keyword="STRUCTURE";
			break;
		}
		case LITERAL_NUMBER_OF_ELEMENTS:
		{
			match(LITERAL_NUMBER_OF_ELEMENTS);
			keyword="NUMBER_OF_ELEMENTS";
			break;
		}
		case LITERAL_TYPE:
		{
			match(LITERAL_TYPE);
			keyword="TYPE";
			break;
		}
		case LITERAL_VALUE:
		{
			match(LITERAL_VALUE);
			keyword="VALUE";
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return keyword;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"EQUAL",
		"GREATER",
		"LESS",
		"NOTEQUAL",
		"GREATEREQUAL",
		"LESSEQUAL",
		"PLUS",
		"MINUS",
		"MUL",
		"DIV",
		"MOD",
		"POW",
		"NUMBER",
		"DOT",
		"\"IntPMF\"",
		"LPAREN",
		"RPAREN",
		"SQUARE_PAREN_L",
		"SQUARE_PAREN_R",
		"\"DoublePMF\"",
		"\"EnumPMF\"",
		"SEMI",
		"ORDERED_DEF",
		"\"DoublePDF\"",
		"\"unit\"",
		"STRING_LITERAL",
		"\"BYTESIZE\"",
		"\"STRUCTURE\"",
		"\"NUMBER_OF_ELEMENTS\"",
		"\"TYPE\"",
		"\"VALUE\"",
		"ID",
		"\"INNER\"",
		"DIGIT",
		"ALPHA",
		"WS"
	};
	
	
	}
