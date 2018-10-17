package com.zmj.design.bridge;

public class Jeep extends Car{
	public Jeep(Engine engine) {
		super(engine);
	}

	@Override
	public void installEngine() {
		this.getEngine().installEngin();
	}


}
