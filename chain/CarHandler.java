package com.zmj.design.chain;

public abstract class CarHandler {
	protected CarHandler carHandler;
	public CarHandler setNextCarHandler(CarHandler next){
		this.carHandler = next;
		return carHandler;
	}
	public abstract void handCar();
}
