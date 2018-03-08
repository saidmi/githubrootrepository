package com.design.pattern.multition;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description
 */
@SuppressWarnings("unchecked")
public class Emperor {
	/**
	 * @param string
	 * @description 初始化 信息列表
	 */
	private Emperor(String string) {
		emperorInfoList.add(string);
	}

	// 构造函数
	private Emperor() {
	};

	// 最多实例变量
	private static int max = 2;
	// 实例列表
	private static ArrayList emperorList = new ArrayList(max);
	// 实例信息列表
	private static ArrayList emperorInfoList = new ArrayList(max);
	// 当前实例编号
	private static int count = 0;

	// 初始化实例变量
	static {
		for (int i = 0; i < max; i++) {
			emperorList.add(new Emperor("皇帝" + (i + 1)));
		}
	}

	// 向外提供实例对象
	public static Emperor getInstance() {
		Random random = new Random();
		// 获取随机对象编号
		count = random.nextInt(max);
		return (Emperor) emperorList.get(count);
	}

	// 提供对象信息列表
	public static void emperorInfo() {
		System.out.println(Thread.currentThread().getName() + "," + emperorInfoList.get(count));
	}
}
