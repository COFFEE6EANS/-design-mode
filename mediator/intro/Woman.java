package com.zmj.design.mediator.intro;

public class Woman extends Person{
	public Woman(String name, int condition) {
		super(name, condition);
	}

	@Override
	public void getPartner(Person person) {
		if(person instanceof Woman){
			System.out.println(person.getName() +"说: 我不是同性恋");
		}else{
			if(this.getCondition() == person.getCondition()){
				System.out.println(person.getName() + "说：我们结婚吧");
			}else{
				System.out.println(person.getName() + "说：我们不合适");
			}
		}
		
	}

}
