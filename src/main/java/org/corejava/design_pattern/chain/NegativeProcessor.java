package org.corejava.design_pattern.chain;

import org.apache.log4j.Logger;

public class NegativeProcessor implements Chain {
	
	Logger logger = Logger.getLogger(this.getClass());

	Chain nextChain;
	@Override
	public void nextChain(Chain chain) {
		this.nextChain = chain;
	}

	@Override
	public NumbersVal process(NumbersVal number) {
		// TODO Auto-generated method stub
		
		if(number.getNumber() < 0) {
			logger.info("Negative number");
			return new NumbersVal(-1);
		}else {
			return nextChain.process(number);
			
		}

	}

}
