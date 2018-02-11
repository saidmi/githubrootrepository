package com.design.pattern.singleton;

import junit.framework.TestCase;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description
 */
public class SingletonPatternTestTest extends TestCase {

	/**
	 * @throws java.lang.Exception
	 * @author uisftech
	 * @date 2018年1月29日
	 * @description
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void test() throws InterruptedException {
		for (int i = 0; i < 30; i++) {
			SingletonPatternRunnable runnable = new SingletonPatternRunnable();
			Thread thread = new Thread(runnable);
			//thread.sleep(1000);
			thread.start();
		}
	}

}
