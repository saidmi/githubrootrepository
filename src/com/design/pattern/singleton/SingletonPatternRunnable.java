package com.design.pattern.singleton;

/**
 * @author uisftech
 * @date 2018��1��26��
 * @description
 */
public class SingletonPatternRunnable implements Runnable {

	/**
	 * 
	 * @date		2018��1��26��
	 * @description   
	 */
	@Override
	public void run() {
		SingletonPattern singleton=SingletonPattern.getInstance();
		System.out.println(Thread.currentThread().getName()+","+singleton.hashCode());
	}

}
