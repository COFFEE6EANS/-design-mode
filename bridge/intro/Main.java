package com.zmj.design.bridge.intro;

import org.junit.Test;
public class Main {
	/**引入桥接模式的应用场景**/
	/**当不同汽车相同的引擎加入时或者相同汽车装不同引擎加入时，需要不断的创建类，类的数量就成几何形增长**/
	@Test
	public void brige1(){
		Car c1 = new  Jeep2001();
		c1.instalEngine();
		Car c2 = new Jeep2000();
		c2.instalEngine();
		Car c3 = new Bus2001();
		Car c4 = new Bus2000();
		c3.instalEngine();
		c4.instalEngine();
	}
}
