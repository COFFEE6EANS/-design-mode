package com.zmj.design.state.intro;

public class Person {
	private int hour;
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getHour() {
		return hour;
	}
	public void eat(){
		if(hour == 6 ){
			System.out.println("吃早餐");
		}else if(hour == 12){
			System.out.println("吃午饭");
		}else if (hour == 18){
			System.out.println("吃晚饭");
		}else{
			System.out.println("为定义");
		}
	}
}
