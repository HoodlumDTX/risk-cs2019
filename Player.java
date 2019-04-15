import java.util.*;
public class Player {
	private ArrayList<Armies> a;
	private int playerNum;
	public Player(int p){
		a = new ArrayList<Armies>();
		playerNum=p;
	}
	public int getTroopsPerTurn(){
		int tot=3;
		tot+=a.size()/3;
		//for loop to check for ownership of continents
	}
	public int getPlayerNum(){
		return playerNum;
	}
	public ArrayList<Armies> getArmies(){
		return a;
	}
	public void attack(int battlefield, Armies attacker, int attackForceSize, Player defender){
		
	}
	public void editArmies(int armyLocation, int numChange){
		
	}
	//fortify method
	
}
