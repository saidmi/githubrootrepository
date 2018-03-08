package com.design.pattern.proxy;

/**
 * @author uisftech
 * @date 2018年1月29日
 * @description 代理对象，.代理对象是对目标对象的扩展,并会调用目标对象
 */
public class AgirlProxy implements KindWomen {
	//保存目标对象
	private KindWomen women;

	// 默认一个目标对象
	public AgirlProxy() {
		this.women = new Agirl();
	}

	// 可以是同一类型的其它对象
	public AgirlProxy(KindWomen women) {
		this.women = women;
	}

	/**
	 * 
	 * @author uisftech
	 * @date 2018年1月29日
	 * @description
	 */
	@Override
	public void makeEyesWithMan() {
		this.women.makeEyesWithMan();// 调用目标对象行为
	}

	/**
	 * 
	 * @author uisftech
	 * @date 2018年1月29日
	 * @description
	 */
	@Override
	public void happyWithMan() {
		this.women.happyWithMan();// 调用目标对象行为
	}

}
