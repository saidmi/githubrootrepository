package com.design.pattern.strategy;

/**
 * @author uisftech
 * @date 2018��1��29��
 * @description ��Ų���
 */
public class Context {
	// ���캯��,��ʼ��ʹ���ĸ�����,����һ������������ã����ո��ͻ��˵���
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	// ���ò���
	public void operate() {
		this.strategy.operate();
	}
}
