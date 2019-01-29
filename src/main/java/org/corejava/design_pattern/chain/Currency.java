package org.corejava.design_pattern.chain;

/**
 * Courtesy : journaldev(https://www.journaldev.com/1617/
 * chain-of-responsibility-design-pattern-in-java)
 * @author Roshan
 *
 */
public class Currency {
	
private int amount;
	
	public Currency(int amt){
		this.amount=amt;
	}
	
	public int getAmount(){
		return this.amount;
	}

}
