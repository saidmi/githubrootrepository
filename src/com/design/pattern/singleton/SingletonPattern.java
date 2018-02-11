package com.design.pattern.singleton;

/**
 * @author uisftech
 * @date 2018年1月26日
 * @description 通用的安全单例模式
 */
public class SingletonPattern {
	private static final SingletonPattern singleton = new SingletonPattern();

	private SingletonPattern() {
	};

	public synchronized static  SingletonPattern getInstance() {
		return singleton;
	}
}
