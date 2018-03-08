package com.design.pattern.singleton;

/**
 * @author uisftech
 * @date 2018年1月26日
 * @description
 */
public class SingletonPatternRunnable implements Runnable {

	/**
	 * 
	 * @date		2018年1月26日
	 * @description   
	 */
	@Override
	public void run() {
		SingletonPattern singleton=SingletonPattern.getInstance();
		System.out.println(Thread.currentThread().getName()+","+singleton.hashCode());
	}

}
