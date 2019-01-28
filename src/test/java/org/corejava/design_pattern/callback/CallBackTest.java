package org.corejava.design_pattern.callback;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CallBackTest {
	
	Logger logger = Logger.getLogger(CallBackTest.class);
	
	//Defining counter as instance variable
	//as lambda accepts instance variable 
	// and not local variable
	private int counter = 0;
	Task task;
	
	@BeforeEach
	public void init() {
		task = new DesignTask();
	}
	
	@Test
	public void testSimpleCallBack() {
		CallBack c = () -> logger.info("Simple CallBack Demo");
		task.executeWith(c);
	}
	
	@Test
	public void testCallBackInFunction() {
		task.executeWith(() -> {logger.info("Calling within Function");});
		
	}
	
	@Test
	public void TestCounterCallBack() {	
		CallBack c = () -> counter++;
		task.executeWith(c);
		assertEquals(1, counter);
	}
	
	

}
