package com.zmj.design.template;

public class Main {
	/**模板方法模式**/
	/**优点：它把具有特定步骤算法中的某些必要的处理**/
	/**委让给抽象方法，去确定执行的顺序通过子类集成对抽象**/
	/**方法的不同实现改变整个算法的行为**/
	/****/
	public static void main(String[] args) {
		MakeCar bus = new MakeBus();
		bus.make();
		MakeCar jeep = new MakeJeep();
		jeep.make();
	}
}
