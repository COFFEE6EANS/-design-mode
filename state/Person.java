package com.zmj.design.state;

public class Person {
	private int hour;
	private State state;
	public Person() {
		state = new MState();//给对象初始化为一个最初的对象
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getHour() {
		return hour;
	} 
	public void eat(){
		state.eat(this);
		//复位对象的状态
		state = new MState();
	}
}
