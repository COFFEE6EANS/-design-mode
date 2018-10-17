package com.zmj.design.mediator.intro;

public class Man extends Person{

	public Man(String name, int condition) {
		super(name, condition);
	}

	public void getPartner(Person person) {
		if(person instanceof Man){
			System.out.println(person.getName() +"说: 我不是同性恋");
			
		}else{
			if(this.getCondition() == person.getCondition()){
				System.out.println(person.getName() + "说：我们结婚吧");
			}
		}
	}

}
