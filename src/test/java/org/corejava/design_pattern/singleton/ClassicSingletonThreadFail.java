package org.corejava.design_pattern.singleton;

import org.apache.log4j.Logger;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ClassicSingletonThreadFail extends TestCase{
	
	private static ClassicSingleton singleton = null;
	private static Logger logger = Logger.getLogger(ClassicSingletonTest.class);
	
	public ClassicSingletonThreadFail(String name) {
		super(name);
	}
	
	public void setUp() {
	   singleton = null;   
	   }
	
	//Simple Instantiation works as expected
	public void testUnique() throws InterruptedException {
	      logger.info("checking singletons for equality");
	      Thread threadOne = new Thread(new ClassicSingletonTestRunnable());
	      Thread threadTwo = new Thread(new ClassicSingletonTestRunnable());
	      
	      threadOne.start();
	      threadTwo.start();
	      threadOne.join();
	      threadTwo.join();
	}
	
	private static class ClassicSingletonTestRunnable implements Runnable{

		public void run() {
			// TODO Auto-generated method stub
			
			ClassicSingleton s = ClassicSingleton.getInstance();
			
			synchronized (ClassicSingletonThreadFail.class) {
				if(singleton == null) {
					singleton = s;
			}
				
			}
			
			//Local reference should be equal
			Assert.assertEquals(true, s==singleton);
			
		}
		
	}

}
