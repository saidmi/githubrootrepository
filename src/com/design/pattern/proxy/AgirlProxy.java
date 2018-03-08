package com.design.pattern.proxy;

/**
 * @author uisftech
 * @date 2018��1��29��
 * @description �������.��������Ƕ�Ŀ��������չ,�������Ŀ�����
 */
public class AgirlProxy implements KindWomen {
	//����Ŀ�����
	private KindWomen women;

	// Ĭ��һ��Ŀ�����
	public AgirlProxy() {
		this.women = new Agirl();
	}

	// ������ͬһ���͵���������
	public AgirlProxy(KindWomen women) {
		this.women = women;
	}

	/**
	 * 
	 * @author uisftech
	 * @date 2018��1��29��
	 * @description
	 */
	@Override
	public void makeEyesWithMan() {
		this.women.makeEyesWithMan();// ����Ŀ�������Ϊ
	}

	/**
	 * 
	 * @author uisftech
	 * @date 2018��1��29��
	 * @description
	 */
	@Override
	public void happyWithMan() {
		this.women.happyWithMan();// ����Ŀ�������Ϊ
	}

}
