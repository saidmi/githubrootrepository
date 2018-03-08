package com.design.pattern.strategy;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description 策略执行者
 */
public class CallContext {
	public static void main(String[] args) {
		Context context;
		// 策略执行
		context = new Context(new BackDoor());
		context.operate();

		context = new Context(new GiveGreenLight());
		context.operate();

		context = new Context(new BlockEnemy());
		context.operate();

	}
}
