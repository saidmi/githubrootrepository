package com.design.pattern.singleton;

/**
 * @author uisftech
 * @date 2018��1��29��
 * @description
 */
public class EmperorRunnable implements Runnable {

	/**
	 * 
	 * @author uisftech
	 * @date 2018��1��29��
	 * @description
	 */
	@Override
	public void run() {
		Emperor emperor = Emperor.getInstance();
		System.out.println(Thread.currentThread().getName()+","+emperor.hashCode());
	}

}
