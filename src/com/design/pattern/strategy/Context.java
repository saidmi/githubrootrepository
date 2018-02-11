package com.design.pattern.strategy;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description 存放策略
 */
public class Context {
	// 构造函数,初始化使用哪个策略,持有一个策略类的引用，最终给客户端调用
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	// 调用策略
	public void operate() {
		this.strategy.operate();
	}
}
