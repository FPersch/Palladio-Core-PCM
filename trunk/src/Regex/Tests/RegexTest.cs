/*
 * $Id$
 * 
 * $Log$
 * Revision 1.1  2004/11/04 08:52:14  sliver
 * added regular expressions
 *
 */

#if TEST

using System;
using NUnit.Framework;
using Palladio.FiniteStateMachines;

namespace Palladio.Reliability.Regex.Tests
{
	[TestFixture]
	public class RegexTest
	{
		[Test]
		public void TestFactory()
		{
			IFiniteStateMachine fsm = TestBuilder.CreateTestRegexFSMSimple();
			IRegex regex = RegexFactory.GetRegularExpressionFromFSM(fsm);
			Assert.AreEqual("(a|b)*c",regex.ToString());
		}

		[Test]
		public void TestSymbol()
		{
			IInput symbol = FSMFactory.CreateDefaultInput("a");
			ISymbol regex = RegexFactory.Symbol(symbol);
			Assert.AreEqual(symbol, regex.InputSymbol);
			Assert.AreEqual("a",regex.ToString());
		}

		[Test]
		public void TestLoop()
		{
			IInput symbol = FSMFactory.CreateDefaultInput("a");
			ISymbol regexSymbol = RegexFactory.Symbol(symbol);
			ILoop regex = RegexFactory.Loop(regexSymbol);
			Assert.AreEqual(regexSymbol, regex.InnerExpression);
			Assert.AreEqual("a*",regex.ToString());
		}

		[Test]
		public void TestSequence()
		{
			InputSymbolHash sh = FSMFactory.CreateInputFromList("a","b");
			ISymbol a = RegexFactory.Symbol(sh["a"]);
			ISymbol b = RegexFactory.Symbol(sh["b"]);
			ISequence regex = RegexFactory.Sequence(a,b);
			Assert.AreEqual(a, regex.Predecessor);
			Assert.AreEqual(b, regex.Successor);
			Assert.AreEqual("ab",regex.ToString());
		}

		[Test]
		public void TestAlternative()
		{
			InputSymbolHash sh = FSMFactory.CreateInputFromList("a","b");
			ISymbol a = RegexFactory.Symbol(sh["a"]);
			ISymbol b = RegexFactory.Symbol(sh["b"]);
			IAlternative regex = RegexFactory.Alternative(a,b);
			Assert.AreEqual(a, regex.AlternativeOne);
			Assert.AreEqual(b, regex.AlternativeTwo);
			Assert.AreEqual("a|b",regex.ToString());
		}

		[Test]
		public void TestComplexExpression()
		{
			ISequence abcLd = GenerateComplexExpression();
			Assert.AreEqual("((a|b)c)*d",abcLd.ToString());
		}

		[Test]
		public void TestEquals()
		{
			ISequence s1 = GenerateComplexExpression();
			ISequence s2 = GenerateComplexExpression();
			Assert.AreEqual(s1, s2);
		}

		private static ISequence GenerateComplexExpression()
		{
			InputSymbolHash sh = FSMFactory.CreateInputFromList("a","b","c","d");
			ISymbol a = RegexFactory.Symbol(sh["a"]);
			ISymbol b = RegexFactory.Symbol(sh["b"]);
			ISymbol c = RegexFactory.Symbol(sh["c"]);
			ISymbol d = RegexFactory.Symbol(sh["d"]);
			IAlternative ab = RegexFactory.Alternative(a,b);
			ISequence abc = RegexFactory.Sequence(ab,c);
			ILoop abcL = RegexFactory.Loop(abc);
			return RegexFactory.Sequence(abcL,d);
		}

		[Test]
		public void TestCreateGNFA()
		{
			IFiniteStateMachine fsm = TestBuilder.CreateTestMarkovModel();
			IFiniteStateMachine gnfa = RegexFactory.CreateGNFA(fsm);
			foreach (ITransition transition in fsm.Transitions)
			{
				IInput gnfaInput = RegexFactory.Symbol(transition.InputSymbol);
				ITransition gnfaTransition = gnfa.GetNextTransition(transition.SourceState, gnfaInput);
				Assert.AreEqual(transition.SourceState, gnfaTransition.SourceState);
				Assert.AreEqual(transition.DestinationState, gnfaTransition.DestinationState);
				Assert.AreEqual(transition.InputSymbol.ToString(), gnfaTransition.InputSymbol.ToString());
			}
			ITransition[] outgoing = gnfa.GetOutgoingTransitions(gnfa.StartState);
			Assert.AreEqual(1, outgoing.Length);
			Assert.AreEqual(fsm.StartState, outgoing[0].DestinationState);
			Assert.AreEqual(1, gnfa.FinalStates.Length);
			foreach (IState finalState in fsm.FinalStates)
			{
				Assert.IsFalse(gnfa.IsFinalState(finalState));
				bool toFinal = false;
				foreach (ITransition outgoingTransition in gnfa.GetOutgoingTransitions(finalState))
				{
					if (gnfa.IsFinalState(outgoingTransition.DestinationState))
					{
						toFinal = true;
						break;
					}
				}
				Assert.IsTrue(toFinal);
			}
		}

		[Test]
		public void TestMelting()
		{
			IFiniteStateMachine fsm = TestBuilder.CreateTestMeltingFSM();

			IEditableFiniteStateMachine gnfa = RegexFactory.CreateGNFA(fsm);
			RegexFactory.MeltTransitions(ref gnfa);

			ITransition[] outgoing = gnfa.GetOutgoingTransitions(fsm.StartState);
			Console.WriteLine(gnfa);
			Assert.AreEqual(2, outgoing.Length );
			foreach (ITransition transition in outgoing)
			{
				if (transition.DestinationState.ToString().Equals("2"))
				{
					Assert.AreEqual("a|b|c",transition.InputSymbol.ToString());
				}
				if (transition.DestinationState.ToString().Equals("3"))
				{
					Assert.AreEqual("d|e",transition.InputSymbol.ToString());
				}
			}
		}


		[TestFixtureSetUp]
		public void Init()
		{
		}
	}
}

#endif