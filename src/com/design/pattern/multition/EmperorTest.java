package com.design.pattern.multition;

import junit.framework.TestCase;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description
 */
public class EmperorTest extends TestCase {

	/**
	 * @throws java.lang.Exception
	 * @author uisftech
	 * @date 2018年1月29日
	 * @description
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test method for {@link com.design.pattern.multition.Emperor#getInstance()}.
	 */
	public void testGetInstance() {
		for (int i = 0; i < 30; i++) {
			Emperor emperor = Emperor.getInstance();
			System.out.println("第" + i + "个" + ","+emperor.hashCode());
			Emperor.emperorInfo();
		}
	}

	/**
	 * Test method for {@link com.design.pattern.multition.Emperor#emperorInfo()}.
	 */
	public void testEmperorInfo() {

	}

}
