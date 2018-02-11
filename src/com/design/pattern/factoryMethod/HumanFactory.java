package com.design.pattern.factoryMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author uisftech
 * @date 2018��1��30��
 * @description ������������ʵ������
 */

public class HumanFactory {
	// lazy initialalization
	private static Map<String, Human> humans = new HashMap<String, Human>();

	// ����ʵ������
	@SuppressWarnings("rawtypes")
	public static Human createHuman(Class c) {

		Human human = null;
		try {
			// ���map���У���ֱ��ȡ
			if (humans.containsKey(c.getSimpleName())) {
				human = humans.get(c.getSimpleName());
			} else {
				human = (Human) Class.forName(c.getName()).newInstance();
				// �ŵ�Map��
				humans.put(c.getSimpleName(), human);
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return human;
	}

	// ����ʵ���࣬�������ʵ��
	public static Human createHuman() {
		// ����ʵ������
		Human human = null;

		// ��ȡʵ����
		List<Class> createHumanList = ClassUtils.getAllClassByInterface(Human.class);

		// �������ʵ������
		int random = new Random().nextInt(createHumanList.size());

		human = createHuman(createHumanList.get(random));

		return human;

	}
}
