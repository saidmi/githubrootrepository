package com.design.pattern.singleton;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description
 */
public class EmperorRunnable implements Runnable {

	/**
	 * 
	 * @author uisftech
	 * @date 2018年1月29日
	 * @description
	 */
	@Override
	public void run() {
		Emperor emperor = Emperor.getInstance();
		System.out.println(Thread.currentThread().getName()+","+emperor.hashCode());
	}

}
