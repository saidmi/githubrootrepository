package com.design.pattern.proxy;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description 具体代理实现类
 */
public class Agirl implements KindWomen {

	/**
	 * 
	 * @author uisftech
	 * @date 2018年1月29日
	 * @description
	 */
	@Override
	public void makeEyesWithMan() {
		System.out.println("Agirl makeEyesWithMan run");
	}

	/**
	 * 
	 * @author uisftech
	 * @date 2018年1月29日
	 * @description
	 */
	@Override
	public void happyWithMan() {
		System.out.println("Agirl happyWithMan run");
	}

}
