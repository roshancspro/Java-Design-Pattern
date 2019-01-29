package org.corejava.design_pattern.chain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.corejava.design_pattern.chain.Chain;
import org.corejava.design_pattern.chain.NegativeProcessor;
import org.corejava.design_pattern.chain.NumbersVal;
import org.corejava.design_pattern.chain.PositiveProcessor;
import org.corejava.design_pattern.chain.ZeroProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Sample Chain example
 * @author Roshan
 *
 */
public class TestChain {
	
	//Starts with negative chain as initial
	private Chain chain;
	
	@BeforeEach
	public void setup() {
		chain = new NegativeProcessor();
		Chain zeroChain = new ZeroProcessor();
		Chain positiveChain = new PositiveProcessor();
		
		chain.nextChain(zeroChain);
		zeroChain.nextChain(positiveChain);
	}
	
	@Test
	public void testPositiveChain() {
		NumbersVal val = new NumbersVal(90);
		assertEquals(1, chain.process(val).getNumber());
	}
	
	@Test
	public void testZeroChain() {
		NumbersVal val = new NumbersVal(0);
		assertEquals(0, chain.process(val).getNumber());
	}
	
	@Test
	public void testNegativeChain() {
		NumbersVal val = new NumbersVal(-90);
		assertEquals(-1, chain.process(val).getNumber());
	}

}
