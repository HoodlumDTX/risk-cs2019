//getLoc, getSize, editTroopSize
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
		int c=0;
		for (int j=1;j<10;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getLoc()==j)
					c++;
		if (c==9)
			tot+=5;
		c=0;
		for (int j=10;j<14;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getLoc()==j)
					c++;
		if (c==4)
			tot+=2;
		c=0;
		for (int j=14;j<20;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getLoc()==j)
					c++;
		if (c==6)
			tot+=3;
		c=0;
		for (int j=20;j<27;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getLoc()==j)
					c++;
		if (c==7)
			tot+=5;
		c=0;
		for (int j=27;j<39;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getLoc()==j)
					c++;
		if (c==12)
			tot+=7;
		c=0;
		for (int j=39;j<43;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getLoc()==j)
					c++;
		if (c==4)
			tot+=2;
		return tot;
			
	}
	public int getPlayerNum(){
		return playerNum;
	}
	public ArrayList<Armies> getArmies(){
		return a;
	}
	
	public void attack(Country bf, Country attackingCountry, Armies attacker, int attackForceSize, Player defender){
		int battlefield=bf.getCountryNum();
		int lg1=0, lg2=0, at1=0,at2=0,at3=0, def1=0,def2=0;
		Armies defenseArmy = defender.getArmy(battlefield);
		
		
		at1 = (new DICEROLLER()).getValue();
		if (attackForceSize>1)
			at2 = (new DICEROLLER()).getValue();
		if (attackForceSize>2)
			at3 = (new DICEROLLER()).getValue();
		
		
		
		def1 = (new DICEROLLER()).getValue();
		if (defenseArmy.getSize()>1)
			def2 = (new DICEROLLER()).getValue();
		
		//attack with two defenders
		if (defenseArmy.getSize()>1){
			if (def2>def1){//makes def1 the larger
				int temp=def1;
				def1=def2;
				def2=temp;
			}
			if (attacker.getSize()==1)
				lg1=at1;
			else if (attacker.getSize()==2){
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
			if (attacker.getSize()==1){
				if (lg1>def1)
					defender.editArmies(battlefield, -1);
				else{
					editArmies(attacker.getLoc(), -1);
					attackForceSize-=1;}
			}
			else{
				if (lg1>def1)
					defender.editArmies(battlefield, -1);
				else{
					editArmies(attacker.getLoc(), -1);
					attackForceSize-=1;}
				if (lg2>def2)
					defender.editArmies(battlefield, -1);
				else{
					editArmies(attacker.getLoc(), -1);
					attackForceSize-=1;}
			}
		}
		
		//attack with one defender
		else{
			if (attacker.getSize()==1)
				lg1=at1;
			else if (attacker.getSize()==2){
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
				editArmies(attacker.getLoc(), -1);
				attackForceSize-=1;}
		}
		
		//battle has concluded
		//update numbers, not sure it actually needs to do this but I'm not taking any chances
		
		defenseArmy=defender.getArmy(battlefield);
		int defForceSize=defenseArmy.getSize();
		for (int i=0; i<a.size(); i++)
			if (a.get(i).getLoc()==attacker.getLoc())
				attacker=a.get(i);
		
		if (defForceSize==0){//for if the attacker wins

			defender.editArmies(battlefield, attackForceSize);
			editArmies(attacker.getLoc(), -1*attackForceSize);
			addArmy(defender.getArmy(defenseArmy.getLoc()));
			defender.removeArmies(defenseArmy.getLoc());
		}
		else if (attackForceSize==0){//for if the defender wins
			//I don't think anything else needs to be done but I'll leave it open
		}
		else
			attack(bf,attackingCountry, attacker, attackForceSize,defender);
			
	}
	public void removeArmies(int armyLocation){
		for (int i=0;i<a.size();i++)
			if (a.get(i).getLoc()==armyLocation)
				a.remove(i);
	}
	public void editArmies(int armyLocation, int numChange){
		for (int i=0;i<a.size();i++)
			if (a.get(i).getLoc()==armyLocation)
				a.get(i).editTroopSize(numChange);
	}
	public void destroyArmy(int armyLocation){
		for (int i=0;i<a.size();i++)
			if (a.get(i).getLoc()==armyLocation)
				a.remove(i);
	}
	public Armies getArmy(int armyLocation){
		for (int i=0;i<a.size();i++)
			if (a.get(i).getLoc()==armyLocation)
				return a.get(i);
		return null;
	}
	public void fortify(int startArmyLocation, int endArmyLocation, int amtChange){
		editArmies(startArmyLocation, -1*amtChange);
		editArmies(endArmyLocation, amtChange);
	}
	public void addArmy(Armies n){
		a.add(n);
	}
	
}
