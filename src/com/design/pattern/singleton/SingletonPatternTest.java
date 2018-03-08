package com.design.pattern.singleton;

import org.junit.Before;

import junit.framework.TestCase;

/**
 * @author 		uisftech
 * @date   		2018年1月29日
 * @description 
 */
public class SingletonPatternTest extends TestCase {

	/**
	 * @throws java.lang.Exception
	 * @author 		uisftech
	 * @date   		2018年1月29日
	 * @description 
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.design.pattern.singleton.SingletonPattern#getInstance()}.
	 */
	
	public void testGetInstance() {
		for (int i = 0; i < 30; i++) {
			SingletonPatternRunnable runnable = new SingletonPatternRunnable();
			Thread thread = new Thread(runnable);
			thread.start();
		}
	}

}
