package org.corejava.design_pattern.callback;

/**
 * Template method class for CallBacks
 * @author Roshan
 *
 */
public abstract class Task {
	
	public abstract void execute();
	
	public void executeWith(CallBack c) {
		execute();
		
		if(c != null)
			c.call();
	}
	
	

}
