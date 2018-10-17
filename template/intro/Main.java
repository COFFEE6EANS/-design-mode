package com.zmj.design.template.intro;

public class Main {
public static void main(String[] args) {
	/**引入模板方法应用场景**/
	/**造公交车**/
	MakeCar bus = new MakeBus();
	bus.makeHead();
	bus.makeBody();
	bus.makeTail();
	/**造Jepp车**/
	MakeCar jeep = new MakeJeep();
	jeep.makeHead();
	jeep.makeBody();
	jeep.makeTail();
	/**从上面一点我们可以看出：存在多个具有同样操作步骤的应用场景，但它们的具体
	 * 操作的细节却各不相同**/
}
}
