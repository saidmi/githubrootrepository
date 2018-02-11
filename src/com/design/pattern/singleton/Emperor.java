package com.design.pattern.singleton;

/**
 * @author uisftech
 * @date 2018年1月26日
 * @description 提供单例对象，并发时容易造成假象，emperor并不是同一个单例
 */
public class Emperor {
	// 私有静态变量
	private static Emperor emperor = null;

	// 构造函数
	private Emperor() {
	};

	// 公共方法,提供单例
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
		System.out.println("我就是皇帝。。。" + Thread.currentThread().getName());
	}
}
