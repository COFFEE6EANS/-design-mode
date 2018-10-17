package com.zmj.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{
private String name;
private int age;
private String sex;
private List<String> friends;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public List<String> getFriends() {
	return friends;
}
public void setFriends(List<String> friends) {
	this.friends = friends;
}

public Person clone(){
	try {
		/**1.此方式属于浅度的克隆，对于该对象类变量属于引用变量类型只进行地址的克隆(除去String类型)**/
		//return (Person)super.clone();
		/**2.此方式属于深度的克隆，对于该对象类变量属于引用变量类型的也进行复制(也就是说重新开辟一块内存堆)**/
		Person clone = (Person)super.clone();
		 List<String> newFriends = new ArrayList<>();
		 for(String friend : this.friends){
			 newFriends.add(friend);
		 }
		 clone.setFriends(newFriends);
		return clone;
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
		return null;
	}
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", friends=" + friends + "]";
}

}
