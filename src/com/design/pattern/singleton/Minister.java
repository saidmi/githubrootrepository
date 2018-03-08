package com.design.pattern.singleton;

/**
 * @author uisftech
 * @date 2018年1月26日
 * @description 大臣，访问单例的对象
 */
public class Minister {
	public static void main(String[] args) throws InterruptedException {
		/*// 第一天
		Emperor emperor1 = Emperor.getInstance();
		emperor1.emperorInfo();

		System.out.println(emperor1.hashCode());
		// 第二天
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
