package com.design.pattern.strategy;

/**
 * @author uisftech
 * @date 2018��1��29��
 * @description
 */
public class GiveGreenLight implements Strategy {

	/**
	 * 
	 * @author uisftech
	 * @date 2018��1��29��
	 * @description ����ʵ����,��װ����ص��㷨����Ϊ��
	 */
	@Override
	public void operate() {
		System.out.println("GiveGreenLight operate");
	}

}
