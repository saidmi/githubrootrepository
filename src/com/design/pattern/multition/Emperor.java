package com.design.pattern.multition;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author uisftech
 * @date 2018��1��29��
 * @description
 */
@SuppressWarnings("unchecked")
public class Emperor {
	/**
	 * @param string
	 * @description ��ʼ�� ��Ϣ�б�
	 */
	private Emperor(String string) {
		emperorInfoList.add(string);
	}

	// ���캯��
	private Emperor() {
	};

	// ���ʵ������
	private static int max = 2;
	// ʵ���б�
	private static ArrayList emperorList = new ArrayList(max);
	// ʵ����Ϣ�б�
	private static ArrayList emperorInfoList = new ArrayList(max);
	// ��ǰʵ�����
	private static int count = 0;

	// ��ʼ��ʵ������
	static {
		for (int i = 0; i < max; i++) {
			emperorList.add(new Emperor("�ʵ�" + (i + 1)));
		}
	}

	// �����ṩʵ������
	public static Emperor getInstance() {
		Random random = new Random();
		// ��ȡ���������
		count = random.nextInt(max);
		return (Emperor) emperorList.get(count);
	}

	// �ṩ������Ϣ�б�
	public static void emperorInfo() {
		System.out.println(Thread.currentThread().getName() + "," + emperorInfoList.get(count));
	}
}
