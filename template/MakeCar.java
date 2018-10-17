package com.zmj.design.template;

public abstract class MakeCar {
	public abstract void makeHead();
	public abstract void makeBody();
	public abstract void makeTail();
	public void make(){
		this.makeHead();
		this.makeBody();
		this.makeTail();
	}
}
