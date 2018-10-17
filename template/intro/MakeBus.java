package com.zmj.design.template.intro;

public class MakeBus extends MakeCar{
	@Override
	public void makeHead() {
		System.out.println("组装车身头");
	}
	@Override
	public void makeBody() {
		System.out.println("组装车身子");
	}
	@Override
	public void makeTail() {
		System.out.println("组装车头");
	}

}
