package com.design.pattern.strategy;

/**
 * @author uisftech
 * @date 2018��1��29��
 * @description ����ִ����
 */
public class CallContext {
	public static void main(String[] args) {
		Context context;
		// ����ִ��
		context = new Context(new BackDoor());
		context.operate();

		context = new Context(new GiveGreenLight());
		context.operate();

		context = new Context(new BlockEnemy());
		context.operate();

	}
}
