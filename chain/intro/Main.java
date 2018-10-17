package com.zmj.design.chain.intro;

public class Main {
	/**职责链模式的应用场景**/
	/**以组装车的场景来引入，组装一辆车的过程：组装车头--》组装车身---》组装车尾**/
	/**缺点:客户端必须手动的去调用组装每个部位的方法**/
	public static void main(String[] args) {
		CarHandler c1 = new CarHeadHandler();
		CarHandler c2 = new CarBodyHandler();
		CarHandler c3 = new CarTailHandler();
		c1.handCar();
		c2.handCar();
		c3.handCar();
	}
}
