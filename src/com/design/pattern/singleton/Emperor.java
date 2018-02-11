package com.design.pattern.singleton;

/**
 * @author uisftech
 * @date 2018��1��26��
 * @description �ṩ�������󣬲���ʱ������ɼ���emperor������ͬһ������
 */
public class Emperor {
	// ˽�о�̬����
	private static Emperor emperor = null;

	// ���캯��
	private Emperor() {
	};

	// ��������,�ṩ����
	public static Emperor getInstance() {
		if (emperor == null) {
			System.out.println("emperor is null");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			emperor = new Emperor();
		}
		return emperor;
	}

	public void emperorInfo() {
		System.out.println("�Ҿ��ǻʵۡ�����" + Thread.currentThread().getName());
	}
}
