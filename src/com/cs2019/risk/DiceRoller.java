package com.cs2019.risk;
//this is the risk dice roller
public class DiceRoller {
	/*
public class DiceRoller {
	public int roll(){
		return (int)(Math.random()*6) + 1;
	}
}
*/
	private int value;

	public DiceRoller(){
		value = (int)(Math.random()*6) + 1;
	}

	public DiceRoller(int x){
		value = x;
	}

	public int getValue(){
		return value;
	}

}
