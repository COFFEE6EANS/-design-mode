package com.zmj.design.mediator;


public class Mediator {
private Person man;
private Person woman;
public Person getMan() {
	return man;
}
public void setMan(Person man) {
	this.man = man;
}
public Person getWoman() {
	return woman;
}
public void setWoman(Person woman) {
	this.woman = woman;
}
public void getPartner(Person person){
	if(person instanceof Man){
		this.setMan(person);
	}else{
		this.setWoman(person);
	}
	if(man == null || woman == null){
		System.out.println("你想搞同性恋啊？？？？不合适吧");
	}else{
		
		if(man.getCondition() == woman.getCondition()){
			System.out.println("我们很合适");
		}
		else{
			System.out.println("我们不合适");
		}
	}
}
}
