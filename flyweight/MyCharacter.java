package com.zmj.design.flyweight;

public class MyCharacter {
	private String value;
	public MyCharacter(String value) {
			this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	
	public String getValue() {
		return value;
	}
}
