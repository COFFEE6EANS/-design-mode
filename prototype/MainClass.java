package com.zmj.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：原型模式(创建型模式)
 *      分为两种：1、浅度克隆  2、深度克隆
 */
public class MainClass {
	public static void main(String[] args) {
		/***引入克隆模式的介绍****/
		/**当创建两个person对象的时候，属性中只有名字发生了改变其他的属性没有改变的情况下，以下代码就可以进行优化**/
		Person p1 = new Person();
		p1.setAge(12);
		p1.setName("张某将");
		p1.setSex("男");
		Person p2 = new Person();
		p2.setAge(12);
		p2.setName("张金福");
		p2.setSex("男");
		
		/**1.克隆模式(浅度克隆)***/
		List<String> friends = new ArrayList<>();
		friends.add("八戒程序猿");
		friends.add("Kobe");
		Person p3 = new Person();
		p3.setAge(12);
		p3.setName("张某将");
		p3.setSex("男");
		p3.setFriends(friends);
		
		Person p4 = p3.clone();
		p3.setAge(14);//修改p3年龄
		p3.getFriends().add("Jmes");
		p4.setName("张金福");
		System.out.println("p3 对象" + p3);
		System.out.println("p4 对象" + p4);
		/**2.克隆模式(深度克隆)**/
	}
}
