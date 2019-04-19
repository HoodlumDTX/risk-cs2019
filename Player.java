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
	
	public void attack(Country bf, Country attackingCountry, Armies attacker, int attackForceSize, Player defender){
		int battlefied=bf.getCountryNum();
		int lg1, lg2, at1,at2,at3, def1,def2;
		
		at1 = (new DICEROLLER()).getValue();
		if (attackForceSize>1)
			at2 = (new DICEROLLER()).getValue();
		if (attackForceSize>2)
			at3 = (new DICEROLLER()).getValue();
		
		ArrayList<Armies> da = defender.getArmies();
		Armies defenseArmy;
		for (int i=0; i<da.size(); i++)
			if (da.get(i).getLOC()==battlefield)
				defenseArmy=da.get(i);
		
		def1 = (new DICEROLLER()).getValue();
		if (defenseArmy.getSIZE()>1)
			def2 = (new DICEROLLER()).getValue();
		
		//attack with two defenders
		if (defenseArmy.getSIZE>1){
			if (def2>def1){//makes def1 the larger
				int temp=def1;
				def1=def2;
				def2=temp;
			}
			if (attacker.getSIZE==1)
				lg1=at1;
			else if (attacker.getSIZE==2){
				if (at1>at2){
					lg1=at1;
					lg2=at2;}
				else{
					lg2=at1;
					lg1=at2;}
			}
			else{
				if (at1>at2){
					if (at3>at1){
						lg1=at3;
						lg2=at1;}
					else if (at3>at2){
						lg1=at1;
						lg2=at3;}
					else{
						lg1=at1;
						lg2=at2;}
						
				}
				else{
					if (at3>at2){
						lg1=at3;
						lg2=at2;}
					else if (at3>at1){
						lg1=at2;
						lg2=at3;}
					else{
						lg1=at2;
						lg2=at1;}
				}
			}
		//lg1 and lg2 should be filled
			if (attacker.getSIZE==1){
				if (lg1>def1)
					defender.editArmies(battlefield, -1);
				else{
					editArmies(attacker.getLOC(), -1);
					attackForceSize-=1;}
			}
			else{
				if (lg1>def1)
					defender.editArmies(battlefield, -1);
				else{
					editArmies(attacker.getLOC(), -1);
					attackForceSize-=1;}
				if (lg2>def2)
					defender.editArmies(battlefield, -1);
				else{
					editArmies(attacker.getLOC(), -1);
					attackForceSize-=1;}
			}
		}
		
		//attack with one defender
		else{
			if (attacker.getSIZE==1)
				lg1=at1;
			else if (attacker.getSIZE==2){
				if (at1>at2)
					lg1=at1;
				else
					lg2=at1;
			}
			else{
				if (at1>at2){
					if (at3>at1)
						lg1=at3;
					else if (at3>at2)
						lg1=at1;
					else
						lg1=at1;
						
				}
				else{
					if (at3>at2)
						lg1=at3;
					else if (at3>at1)
						lg1=at2;
					else
						lg1=at2;
				}
			}
		//lg1 and lg2 should be filled
			if (lg1>def1)
				defender.editArmies(battlefield, -1);
			else{
				editArmies(attacker.getLOC(), -1);
				attackForceSize-=1;}
		}
		
		//battle has concluded
		//update numbers, not sure it actually needs to do this but I'm not taking any chances
		da = defender.getArmies();
		for (int i=0; i<da.size(); i++)
			if (da.get(i).getLOC()==battlefield)
				defenseArmy=da.get(i);
		int defForceSize=defenseArmy.getSIZE();
		for (int i=0; i<a.size(); i++)
			if (a.get(i).getLOC()==attacker.getLOC())
				attacker=a.get(i);
		
		if (defForceSize==0){//for if the attacker wins
			bf.setPlayer(attackingCountry.getPlayer());
			defender.editArmies()
			editArmies()
			defender.removeArmies(defenseArmy.getLOC());//still working on this
		}
		else if (attackForceSize==0){//for if the defender wins
			//I don't think anything else needs to be done but I'll leave it open
		}
		else
			attack(bf,attackingCountry, attacker, attackForceSize,defender);
			
	}
	public void removeArmies(int armyLocation)//need to write this one still
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
