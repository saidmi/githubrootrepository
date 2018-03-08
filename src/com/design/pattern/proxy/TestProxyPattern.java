package com.design.pattern.proxy;

/**
 * @author uisftech
 * @date 2018��1��29��
 * @description
 */
public class TestProxyPattern {

	/**
	 * @param args
	 * @author uisftech
	 * @date 2018��1��29��
	 * @description
	 */
	public static void main(String[] args) {
		// ��̬�������
		TestProxyFactory();
		// ��̬�������
		//TestAgirl();
	}

	// ��̬����
	static void TestAgirl() {

		// Ŀ����󴴽�
		Agirl agirl = new Agirl();

		// �������
		AgirlProxy proxy = new AgirlProxy(agirl);

		// �û�ͨ������������Ŀ�������Ϊ
		proxy.makeEyesWithMan();

		proxy.happyWithMan();

	}

	// ��̬����
	static void TestProxyFactory() {
		// ����Ŀ�����
		KindWomen women = new Agirl();
		// ԭʼ����class
		System.out.println("women=" + women.getClass());

		// ��Ŀ����󴴽��������
		KindWomen proxyWomen = (KindWomen) new ProxyFactory(women).getProxyInstance();
		// �ڴ��ж�̬���ɵĴ������
		System.out.println("proxyWomen=" + proxyWomen.getClass());
		// ִ�ж�̬������
		proxyWomen.happyWithMan();
		proxyWomen.makeEyesWithMan();
	}
}
