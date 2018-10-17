package com.zmj.design.abstractfactory;

public class MainClass {
	public static void main(String[] args) {
		FruitFactory southFactory = new SouthFruitFactory();
		Fruit apple = southFactory.getApple();
		Fruit banana = southFactory.getBanana();
		apple.getFruit();
		banana.getFruit();
	}
}
