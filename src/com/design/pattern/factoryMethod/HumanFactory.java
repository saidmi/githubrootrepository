package com.design.pattern.factoryMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author uisftech
 * @date 2018年1月30日
 * @description 工厂方法创建实例对象
 */

public class HumanFactory {
	// lazy initialalization
	private static Map<String, Human> humans = new HashMap<String, Human>();

	// 创建实例方法
	@SuppressWarnings("rawtypes")
	public static Human createHuman(Class c) {

		Human human = null;
		try {
			// 如果map中有，则直接取
			if (humans.containsKey(c.getSimpleName())) {
				human = humans.get(c.getSimpleName());
			} else {
				human = (Human) Class.forName(c.getName()).newInstance();
				// 放到Map中
				humans.put(c.getSimpleName(), human);
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return human;
	}

	// 查找实现类，随机创建实例
	public static Human createHuman() {
		// 定义实例对象昂
		Human human = null;

		// 获取实现类
		List<Class> createHumanList = ClassUtils.getAllClassByInterface(Human.class);

		// 产生随机实例类型
		int random = new Random().nextInt(createHumanList.size());

		human = createHuman(createHumanList.get(random));

		return human;

	}
}
