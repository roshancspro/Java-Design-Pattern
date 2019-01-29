package org.corejava.design_pattern.chain;

/**
 * Courtesy: GeekForGeeks
 * https://www.geeksforgeeks.org/chain-responsibility-design-pattern/
 * @author Roshan
 *
 */
public interface Chain {
	
	public void nextChain(Chain chain);
	
	public NumbersVal process(NumbersVal number);
	
}
