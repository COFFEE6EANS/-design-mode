package com.zmj.design.bridge;

import org.junit.Test;


public class Main {
	/**桥接模式的应用**/
	/**出于上述的原因，类的数量多了，于是我们就把对象的方法installEngine（） 抽象出来一个具体的对象。Engine接口。**/
	/**来和任何车的类型的特有的功能进行桥接**/
	@Test
	public void brige2(){
		Engine engine1 = new Engine2000();
		com.zmj.design.bridge.Car jeep1 = new Jeep(engine1);
		jeep1.installEngine();
		Engine engine2 = new Engine2001();
		com.zmj.design.bridge.Car jeep2 = new Jeep(engine2);
		jeep2.installEngine();
	}
}
