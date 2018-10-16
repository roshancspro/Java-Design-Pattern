package org.corejava.design_pattern.singleton;

import org.apache.log4j.Logger;

public class ClassicSingleton {

	private static ClassicSingleton instance = null;
	private static Logger logger = Logger.getLogger(ClassicSingleton.class);
	
	private static boolean firstThread = true;

	
	//Setting up private constructor to make sure
	//no instances got created.
	private ClassicSingleton() {
		// Exists only to defeat instantiation.
	}
	
	/**
	 * Create an instance for the application
	 * @return the new instance if not created 
	 * earlier else the existing instance is returned.
	 */
	protected static ClassicSingleton getInstance() {
		if(instance == null) {
			//To create deadlock 
			simulateRandomActivity();
			return new ClassicSingleton();
		}
		
		return instance;
	}
	
	//Invoked for threads
	private static void simulateRandomActivity() {
		try {
		if(firstThread) {
				Thread.currentThread().sleep(50);
				firstThread = false;
			}
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				logger.warn("Sleep interrupted");
			}
		}
		
	
}
