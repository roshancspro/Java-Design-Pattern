package org.corejava.design_pattern.singleton;

import org.apache.log4j.Logger;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ClassicSingletonTest extends TestCase {
	
	private ClassicSingleton sOne = null, sTwo = null;
	private static Logger logger = Logger.getLogger(ClassicSingletonTest.class);
	
	public ClassicSingletonTest(String name) {
		 super(name);
	}
	
	public void setUp() {
	      logger.info("getting singleton...");
	      sOne = ClassicSingleton.getInstance();
	      logger.info("...got singleton: " + sOne);
	      logger.info("getting singleton...");
	      sTwo = ClassicSingleton.getInstance();
	      logger.info("...got singleton: " + sTwo);
	   }
	
	//Simple Instantiation works as expected
	public void testUnique() {
	      logger.info("checking singletons for equality");
	      Assert.assertEquals(true, sOne == sTwo);
	}
	
	

	

}
