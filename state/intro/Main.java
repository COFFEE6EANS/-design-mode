package com.zmj.design.state.intro;

public class Main {
	/**状态模式的引入场景**/
	/**通过改变对象的状态，来改变对象的某种行为**/
	/**当控制一个对象状态转换条件表达式过于复杂时的情况，把状态
	 * 的判断逻辑转译到表现不同状态的一系列类当中
	 * 可以把复杂的判断逻辑简化**/
	public static void main(String[] args) {
		Person person = new Person();
		person.setHour(12);
		person.eat();
		person.setHour(123);
		person.eat();
		person.setHour(18);
		person.eat();
	}
}
