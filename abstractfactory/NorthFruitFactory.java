package com.zmj.design.abstractfactory;

/**
 * 描述： 北方产水果的工厂
 * @author 张谋江
 * @version 1.0 2017年4月21日 
 * @since 1.0
 */
public class NorthFruitFactory implements FruitFactory {
	@Override
	public Fruit getApple() {
		return new NorthApple();
	}

	@Override
	public Fruit getBanana() {
		return new NorthBanana();
	}


}
