package com.zmj.design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
	private Map<String, MyCharacter> pools;
	public CharacterFactory() {
		pools = new HashMap<>();
	}
	public MyCharacter getMyCharacter(String c){
		MyCharacter myCharacter = pools.get(c);
		if(myCharacter == null){
			myCharacter = new MyCharacter(c);
			pools.put(c, myCharacter);
		}
		return myCharacter;
	}
}
