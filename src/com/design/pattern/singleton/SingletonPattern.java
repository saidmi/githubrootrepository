package com.design.pattern.singleton;

/**
 * @author uisftech
 * @date 2018��1��26��
 * @description ͨ�õİ�ȫ����ģʽ
 */
public class SingletonPattern {
	private static final SingletonPattern singleton = new SingletonPattern();

	private SingletonPattern() {
	};

	public synchronized static  SingletonPattern getInstance() {
		return singleton;
	}
}
