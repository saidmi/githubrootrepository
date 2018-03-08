package com.design.pattern.proxy;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description
 */
public class TestProxyPattern {

	/**
	 * @param args
	 * @author uisftech
	 * @date 2018年1月29日
	 * @description
	 */
	public static void main(String[] args) {
		// 动态代理测试
		TestProxyFactory();
		// 静态代理测试
		//TestAgirl();
	}

	// 静态代理
	static void TestAgirl() {

		// 目标对象创建
		Agirl agirl = new Agirl();

		// 代理对象
		AgirlProxy proxy = new AgirlProxy(agirl);

		// 用户通过代理对象调用目标对象行为
		proxy.makeEyesWithMan();

		proxy.happyWithMan();

	}

	// 动态代理
	static void TestProxyFactory() {
		// 创建目标对象
		KindWomen women = new Agirl();
		// 原始类型class
		System.out.println("women=" + women.getClass());

		// 给目标对象创建代理对象
		KindWomen proxyWomen = (KindWomen) new ProxyFactory(women).getProxyInstance();
		// 内存中动态生成的代理对象
		System.out.println("proxyWomen=" + proxyWomen.getClass());
		// 执行动态代理方法
		proxyWomen.happyWithMan();
		proxyWomen.makeEyesWithMan();
	}
}
