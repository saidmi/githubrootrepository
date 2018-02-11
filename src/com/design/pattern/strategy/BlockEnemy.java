package com.design.pattern.strategy;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description 策略实现类,包装了相关的算法和行为。
 */
public class BlockEnemy implements Strategy {

	/**
	 * 
	 * @author uisftech
	 * @date 2018年1月29日
	 * @description
	 */
	@Override
	public void operate() {
		System.out.println("BlockEnemy operate");
	}

}
