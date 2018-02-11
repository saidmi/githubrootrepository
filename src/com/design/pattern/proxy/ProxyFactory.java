package com.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description 创建动态代理，动态代理不需要实现接口，但是要指定接口类型 ;
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 */
public class ProxyFactory {
	// 维护一个目标对象
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	// 给目标对象生成代理对象
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("aaaa");
						// 执行目标对象方法
						Object returnValue = method.invoke(target, args);
						System.out.println("bbb");
						return returnValue;
					}
				});
	}
}
