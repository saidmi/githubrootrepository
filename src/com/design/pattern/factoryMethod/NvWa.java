package com.design.pattern.factoryMethod;

/**
 * @author uisftech
 * @date 2018年1月30日
 * @description
 */
public class NvWa {
	public static void main(String[] args) {
		System.out.println(WhiteHuman.class);
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.cry();
		whiteHuman.laugh();

		System.out.println(BlackHuman.class.getName());
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();

		System.out.println(YellowHuman.class.getTypeName()+","+YellowHuman.class.hashCode());
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.cry();
		yellowHuman.laugh();
		
		System.out.println(YellowHuman.class.getTypeName()+","+YellowHuman.class.hashCode());
		Human yellowHuman1 = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.cry();
		yellowHuman.laugh();
/*
		for (int i = 0; i < 3; i++) {
			System.out.println("随机产生实例");
			Human human = HumanFactory.createHuman();
			human.cry();
			human.laugh();
			human.talk();
		}*/
	}
}
