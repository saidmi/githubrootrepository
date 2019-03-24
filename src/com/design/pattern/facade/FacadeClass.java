package com.design.pattern.facade;

/**
 * @author uisftech 门面类：封装了子系统的实现，并且与客户进行交流
 */
public class FacadeClass {
	private Light light1, light2, light3;
	private Heater heater;
	private TV tv;

	public FacadeClass() {
		light1 = new Light();
		light2 = new Light();
		light3 = new Light();
		heater = new Heater();
		tv = new TV();
	}

	public void open() {
		light1.open();
		light2.open();
		light3.open();
		heater.open();
		tv.open();
	}
	
	
	
	
}
