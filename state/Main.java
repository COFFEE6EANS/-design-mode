package com.zmj.design.state;

public class Main {
	/**状态模式：
	 * 主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况
	 * 把状态的判断逻辑转译到表现不同状态的一系列类当中，可以把复杂
	 * 的判断逻辑简化 **/
	public static void main(String[] args) {
		Person person = new Person();
		person.setHour(18);
		person.eat();
		person.setHour(6);
		person.eat();
	}
}
