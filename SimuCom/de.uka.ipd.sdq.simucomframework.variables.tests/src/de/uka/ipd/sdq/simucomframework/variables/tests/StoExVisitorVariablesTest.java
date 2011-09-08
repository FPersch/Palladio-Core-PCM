package de.uka.ipd.sdq.simucomframework.variables.tests;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import de.uka.ipd.sdq.probfunction.math.impl.DefaultRandomGenerator;
import de.uka.ipd.sdq.simucomframework.variables.StackContext;
import de.uka.ipd.sdq.simucomframework.variables.cache.StoExCache;
import de.uka.ipd.sdq.simucomframework.variables.exceptions.StochasticExpressionEvaluationFailedException;
import de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe;
import de.uka.ipd.sdq.simucomframework.variables.stoexvisitor.VariableMode;

public class StoExVisitorVariablesTest extends TestCase {
	/** Logger for this class. */
	@SuppressWarnings("unused")
	private static Logger logger = 
		Logger.getLogger(StoExVisitorTests.class.getName());
	private SimulatedStackframe<Object> stackFrame;

	public void setUp() {
		PatternLayout myLayout = new PatternLayout("%d{HH:mm:ss,SSS} [%t] %-5p %m [%c]%n");
		ConsoleAppender ca = new ConsoleAppender(myLayout);
		ca.setThreshold(Level.INFO);
		BasicConfigurator.resetConfiguration();
		BasicConfigurator.configure(ca);
		
		StoExCache.initialiseStoExCache(new DefaultRandomGenerator());
		stackFrame = new SimulatedStackframe<Object>();
		stackFrame.addValue("anInt.BYTESIZE", 10);
		stackFrame.addValue("anBoolean.VALUE", false);
		stackFrame.addValue("anDouble.VALUE", 10.0);
	}
	
	public void testStackEvaluate() {
		int i = (Integer)StackContext.evaluateStatic("anInt.BYTESIZE", stackFrame);
		Assert.assertEquals(i, 10);
		boolean b = (Boolean)StackContext.evaluateStatic("anBoolean.VALUE", stackFrame);
		Assert.assertEquals(b, false);
		double d = (Double)StackContext.evaluateStatic("anDouble.VALUE", stackFrame);
		Assert.assertEquals(d, 10.0);
	}
	
	public void testStackEvaluateAutoTypeConversion() {
		// prepare stack with test values
		SimulatedStackframe<Object> stackFrame = new SimulatedStackframe<Object>();
		String CHAR_VALUE = "c.VALUE";
		String BYTE_VALUE = "b.VALUE";
		String SHORT_VALUE = "s.VALUE";
		String INTEGER_VALUE = "i.VALUE";
		String LONG_VALUE = "l.VALUE";
		String FLOAT_VALUE = "f.VALUE";
		String DOUBLE_VALUE = "d.VALUE";
		char c = 14;
		stackFrame.addValue(CHAR_VALUE, c);
		byte b = 15;
		stackFrame.addValue(BYTE_VALUE, b);
		short s = 16;
		stackFrame.addValue(SHORT_VALUE, s);
		int i = 17;
		stackFrame.addValue(INTEGER_VALUE, i);
		long l = 18;
		stackFrame.addValue(LONG_VALUE, l);
		float f = 19;
		stackFrame.addValue(FLOAT_VALUE, f);
		double d = 20;
		stackFrame.addValue(DOUBLE_VALUE, d);
		// test
		// byte/char
		Assert.assertEquals(Character.valueOf(c), StackContext.evaluateStatic(CHAR_VALUE, Character.class, stackFrame));
		Assert.assertEquals(Byte.valueOf(b), StackContext.evaluateStatic(BYTE_VALUE, Byte.class, stackFrame));
		// short
		Assert.assertEquals((Short) Byte.valueOf(b).shortValue(), 
				StackContext.evaluateStatic(BYTE_VALUE, Short.class, stackFrame));
		Assert.assertEquals((Short) Byte.valueOf((byte)Character.valueOf(c).charValue()).shortValue(), 
				StackContext.evaluateStatic(CHAR_VALUE, Short.class, stackFrame));
		// int
		Assert.assertEquals((Integer) Byte.valueOf(b).intValue(), 
				StackContext.evaluateStatic(BYTE_VALUE, Integer.class, stackFrame));
		Assert.assertEquals((Integer) Byte.valueOf((byte)Character.valueOf(c).charValue()).intValue(), 
				StackContext.evaluateStatic(CHAR_VALUE, Integer.class, stackFrame));
		Assert.assertEquals((Integer) Short.valueOf(s).intValue(), 
				StackContext.evaluateStatic(SHORT_VALUE, Integer.class, stackFrame));
		// long
		Assert.assertEquals((Long) Byte.valueOf(b).longValue(), 
				StackContext.evaluateStatic(BYTE_VALUE, Long.class, stackFrame));
		Assert.assertEquals((Long) Byte.valueOf((byte)Character.valueOf(c).charValue()).longValue(), 
				StackContext.evaluateStatic(CHAR_VALUE, Long.class, stackFrame));
		Assert.assertEquals((Long) Short.valueOf(s).longValue(), 
				StackContext.evaluateStatic(SHORT_VALUE, Long.class, stackFrame));
		Assert.assertEquals((Long) Integer.valueOf(i).longValue(), 
				StackContext.evaluateStatic(INTEGER_VALUE, Long.class, stackFrame));
		// float
		Assert.assertEquals(Byte.valueOf(b).floatValue(), 
				StackContext.evaluateStatic(BYTE_VALUE, Float.class, stackFrame));
		Assert.assertEquals(Byte.valueOf((byte)Character.valueOf(c).charValue()).floatValue(), 
				StackContext.evaluateStatic(CHAR_VALUE, Float.class, stackFrame));
		Assert.assertEquals(Short.valueOf(s).floatValue(), 
				StackContext.evaluateStatic(SHORT_VALUE, Float.class, stackFrame));
		Assert.assertEquals(Integer.valueOf(i).floatValue(), 
				StackContext.evaluateStatic(INTEGER_VALUE, Float.class, stackFrame));
		Assert.assertEquals(Long.valueOf(l).floatValue(), 
				StackContext.evaluateStatic(LONG_VALUE, Float.class, stackFrame));
		// double
		Assert.assertEquals(Byte.valueOf(b).doubleValue(), 
				StackContext.evaluateStatic(BYTE_VALUE, Double.class, stackFrame));
		Assert.assertEquals(Byte.valueOf((byte)Character.valueOf(c).charValue()).doubleValue(), 
				StackContext.evaluateStatic(CHAR_VALUE, Double.class, stackFrame));
		Assert.assertEquals(Short.valueOf(s).doubleValue(), 
				StackContext.evaluateStatic(SHORT_VALUE, Double.class, stackFrame));
		Assert.assertEquals(Integer.valueOf(i).doubleValue(), 
				StackContext.evaluateStatic(INTEGER_VALUE, Double.class, stackFrame));
		Assert.assertEquals(Long.valueOf(l).doubleValue(), 
				StackContext.evaluateStatic(LONG_VALUE, Double.class, stackFrame));
		Assert.assertEquals(Float.valueOf(f).doubleValue(), 
				StackContext.evaluateStatic(FLOAT_VALUE, Double.class, stackFrame));
	}
	
	public void testInvalidAccess() {
		try {
			StackContext.evaluateStatic("sssdffg.VALUE", stackFrame);
		} catch (Exception ex){
			Assert.assertEquals(StochasticExpressionEvaluationFailedException.class, ex.getClass());
			return;
		}
		Assert.fail("Parser error expected, but did not occur");
	}

	public void testPowVar() {
		double result3 = (Double)StackContext.evaluateStatic("10^(anInt.BYTESIZE)",stackFrame);
		Assert.assertEquals(Math.pow(10, 10), result3);
	}
	
	public void testReturnDefault() {
		int bs = (Integer)StackContext.evaluateStatic("a.BYTESIZE", stackFrame, VariableMode.RETURN_DEFAULT_ON_NOT_FOUND);
		Assert.assertEquals(bs, 0);
	}

}
