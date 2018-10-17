package com.zmj.design.abstractfactory;

/**
 * 描述： 南方产水果的工厂
 * @author 张谋江
 * @version 1.0 2017年4月21日 
 * @since 1.0
 */
public class SouthFruitFactory implements FruitFactory {
	@Override
	public Fruit getApple() {
		return new SouthApple();
	}

	@Override
	public Fruit getBanana() {
		return new SouthBanana();
	}


}
