package com.design.pattern.singleton;

/**
 * @author uisftech
 * @date 2018��1��26��
 * @description �󳼣����ʵ����Ķ���
 */
public class Minister {
	public static void main(String[] args) throws InterruptedException {
		/*// ��һ��
		Emperor emperor1 = Emperor.getInstance();
		emperor1.emperorInfo();

		System.out.println(emperor1.hashCode());
		// �ڶ���
		Emperor emperor2 = Emperor.getInstance();
		emperor2.emperorInfo();*/
		
	//	System.out.println(emperor2.hashCode());
		
		for (int i = 0; i < 10; i++) {
			EmperorRunnable runnable=new  EmperorRunnable();
			Thread thread = new Thread(runnable);
			thread.start();
		}
	}

}
