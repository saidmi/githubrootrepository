package com.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author uisftech
 * @date 2018��1��29��
 * @description ������̬������̬������Ҫʵ�ֽӿڣ�����Ҫָ���ӿ����� ;
 * ���������Ҫʵ�ֽӿ�,����Ŀ�����һ��Ҫʵ�ֽӿ�,�������ö�̬����
 */
public class ProxyFactory {
	// ά��һ��Ŀ�����
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	// ��Ŀ��������ɴ������
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("aaaa");
						// ִ��Ŀ����󷽷�
						Object returnValue = method.invoke(target, args);
						System.out.println("bbb");
						return returnValue;
					}
				});
	}
}
