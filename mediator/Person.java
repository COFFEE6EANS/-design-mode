package com.zmj.design.mediator;

public abstract class Person {
	private String name;//名字
	private  int condition;//条件
	private Mediator mediator;
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	public Mediator getMediator() {
		return mediator;
	}
	public Person(String name,int condition,Mediator mediator) {
		this.name = name;
		this.condition = condition;
		this.mediator = mediator;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int  condition) {
		this.condition = condition;
	}

	/**
	 * 找对象
	 */
	public abstract void getPartner(Person person);
}
