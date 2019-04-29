//this is the risk dice roller
public class DICEROLLER {
	/*
public class DICEROLLER {
	public int roll(){
		return (int)(Math.random()*6) + 1;
	}
}
*/
	private int value;
	
	public DICEROLLER(){
		value = (int)(Math.random()*6) + 1;
	}
	
	public DICEROLLER(int x){
		value = x;
	}

	public int getValue(){
		return value;
	}
	
}
