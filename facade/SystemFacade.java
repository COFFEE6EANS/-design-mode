package com.zmj.design.facade;

public class SystemFacade {
	private SystemA systemA;
	private SystemB systemB;
	private SystemC systemC;
	public SystemFacade() {
		systemA = new SystemA();
		systemB = new SystemB();
		systemC = new SystemC();
	}
	/**
	 * 做ABC系统的的事情
	 */
	public void doABC(){
		systemA.doSomething();
		systemB.doSomething();
		systemC.doSomething();
	}
	/**
	 * 做AB系统的事情
	 */
	public void doAB(){
		systemA.doSomething();
		systemB.doSomething();
	}
}
