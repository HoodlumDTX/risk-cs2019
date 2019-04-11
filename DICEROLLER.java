
public class DICEROLLER {

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
