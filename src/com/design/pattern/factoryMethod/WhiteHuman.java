package com.design.pattern.factoryMethod;

/**
 * @author 		uisftech
 * @date   		2018��1��30��
 * @description 
 */
public class WhiteHuman implements Human {

	/**
	 * 
	 * @author 		uisftech
	 * @date   		2018��1��30��
	 * @description 
	 */
	@Override
	public void laugh() {
		System.out.println("YellowHuman laugh run!");

	}

	/**
	 * 
	 * @author 		uisftech
	 * @date   		2018��1��30��
	 * @description 
	 */
	@Override
	public void cry() {
		System.out.println("YellowHuman cry run!");

	}

	/**
	 * 
	 * @author 		uisftech
	 * @date   		2018��1��30��
	 * @description 
	 */
	@Override
	public void talk() {
		System.out.println("YellowHuman talk run!");

	}

}
