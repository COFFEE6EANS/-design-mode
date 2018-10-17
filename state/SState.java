package com.zmj.design.state;

public class SState extends State {
	@Override
	public void eat(Person person) {
			if(person.getHour() == 18){
				System.out.println("吃晚餐");
			}else{
				System.out.println("未定义...");
			}
	}

}
