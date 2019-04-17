//getLOC, getSIZE, editTroopSize
import java.util.*;
public class Player {
	private ArrayList<Armies> a;
	private int playerNum;
	public Player(int p){
		a = new ArrayList<Armies>();
		playerNum=p;
	}
	public Player(){
		a = new ArrayList<Armies>();
		playerNum=-1;
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
		int at1 = (new DICEROLLER()).getValue();
		if (attackForceSize>1)
			int at2 = (new DICEROLLER()).getValue();
		if (attackForceSize>2)
			int at3 = (new DICEROLLER()).getValue();
		
		ArrayList<Armies> da = defender.getArmies();
		Armies defenseArmy;
		for (int i=0; i<da.size(); i++)
			if (da.get(i).getLOC()==battlefield)
				defenseArmy=da.get(i);
		
		int def1 = (new DICEROLLER()).getValue();
		if (defenseArmy.getSIZE()>1)
			int def2 = (new DICEROLLER()).getValue();
		
		if (defenseArmy.getSIZE)
	}
	public void editArmies(int armyLocation, int numChange){
		for (int i=0;i<a.size();i++)
			if (a.get(i).getLOC()==armyLocation)
				a.get(i).editTroopSize(numChange);
	}
	public void destroyArmy(int armyLocation){
		for (int i=0;i<a.size();i++)
			if (a.get(i).getLOC()==armyLocation)
				a.remove(i);
	}
	public void fortify(int startArmyLocation, int endArmyLocation, int amtChange){
		editArmies(startArmyLocation, -1*amtChange);
		editArmies(endArmyLocation, amtChange);
	}
	public void addArmy(Armies n){
		a.add(n);
	}
	
}
