package com.zmj.design.chain;

public class Main {
	/**使用职责链模式，来实现车的组装**/
	/**优点：**/
	/**1、责任的分担，每个类只需要处理自己该处理的工作**/
	/**不该处理的传递给下一个对象完成，明确各类的责任范围，符合**/
	/**类的最小封装原则**/
	/**2、可以根据需要自由组合工作流程，如工作流程发生改变，可以通过**/
	/**重新分配对象链便可适应新的工作流程**/
	/**3、类与类之间可以以松耦合的形式加以组织**/
	/***目前的应用案例：Servlet容器的过滤器框架的实现就是运用了该模式*/
	/****/
	public static void main(String[] args) {
		CarHandler cHead = new CarHeadHandler();
		CarHandler cBody = new CarBodyHandler();
		CarHandler cTail = new CarTailHandler();
		/**组装顺序：车头-车身-车尾**/
		cHead.setNextCarHandler(cBody).setNextCarHandler(cTail);
		cHead.handCar();
		
		/**组装顺序：车头-车尾-车身**/
		CarHandler cHead2 = new CarHeadHandler();
		CarHandler cBody2 = new CarBodyHandler();
		CarHandler cTail2 = new CarTailHandler();
		System.out.println("==================");
		cHead2.setNextCarHandler(cTail2).setNextCarHandler(cBody2);
		cHead2.handCar();
	}
}
