package com.cs2019.risk;
//getLoc, getSize, editTroopSize
import java.util.*;

import javafx.scene.paint.Color;
public class Player {
	private HashMap<Integer, Country> a;
	private int playerNum;
	private Color playerColor = Color.BLACK;
	public Player(int p, Color playerColor){
		a = new HashMap<Integer, Country>();
		playerNum=p;
		this.playerColor = playerColor;
	}
	public Player(){
		a = new HashMap<Integer, Country>();
		playerNum=-1;
	}
	/*
	//I'd like to suggest this alternate to getTroopsPerTurn()
	
	
		public int getTroopsPerTurn(){
		int tot=3;
		tot+=a.size()/3;
		//checking continent control
		int NACounter = 0, SACounter = 0, AFCounter = 0, EUCounter = 0, ASCounter = 0, AUCounter = 0;
		for (int i = 0; i < a.size(); i++){
			int s = a.get(i).getLoc();
			if (s > 0 && s < 10) NACounter++;
			else if (s > 9 && s < 14) SACounter++;
			else if (s > 13 && s < 20) AFCounter++;
			else if (s > 19 && s < 27) EUCounter++;
			else if (s > 26 && s < 39) ASCounter++;
			else if (s > 38 && s < 43) AUCounter++;
		}
		if (NACounter == 9) tot += 5;
		if (SACounter == 4) tot += 2;
		if (AFCounter == 6) tot += 3;
		if (EUCounter == 7) tot += 5;
		if (ASCounter == 12) tot += 7;
		if (AUCounter == 4) tot += 2;
		return tot;
	}
	
	
	*/
	public int getTroopsPerTurn(){
		int tot=3;
		tot+=a.size()/3;
		//for loop to check for ownership of continents
		int c=0;
		for (int j=1;j<10;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getArmy().getLoc()==j)
					c++;
		if (c==9)
			tot+=5;
		c=0;
		for (int j=10;j<14;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getArmy().getLoc()==j)
					c++;
		if (c==4)
			tot+=2;
		c=0;
		for (int j=14;j<20;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getArmy().getLoc()==j)
					c++;
		if (c==6)
			tot+=3;
		c=0;
		for (int j=20;j<27;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getArmy().getLoc()==j)
					c++;
		if (c==7)
			tot+=5;
		c=0;
		for (int j=27;j<39;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getArmy().getLoc()==j)
					c++;
		if (c==12)
			tot+=7;
		c=0;
		for (int j=39;j<43;j++)
			for (int i=0;i<a.size();i++)
				if (a.get(i).getArmy().getLoc()==j)
					c++;
		if (c==4)
			tot+=2;
		return tot;
			
	}
	
	public void attack(Country bf, Country attackingCountry, Armies attacker, int attackForceSize, Player defender){
		int battlefield=bf.getCountryNum();
		int lg1=0, lg2=0, at1=0,at2=0,at3=0, def1=0,def2=0;
		Armies defenseArmy = defender.getCountry(battlefield).getArmy();
		
		
		at1 = (new DiceRoller()).getValue();
		if (attackForceSize>1)
			at2 = (new DiceRoller()).getValue();
		if (attackForceSize>2)
			at3 = (new DiceRoller()).getValue();
		
		
		
		def1 = (new DiceRoller()).getValue();
		if (defenseArmy.getSize()>1)
			def2 = (new DiceRoller()).getValue();
		
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
					defender.editArmy(battlefield, -1);
				else{
					editArmy(attacker.getLoc(), -1);
					attackForceSize-=1;}
			}
			else{
				if (lg1>def1)
					defender.editArmy(battlefield, -1);
				else{
					editArmy(attacker.getLoc(), -1);
					attackForceSize-=1;}
				if (lg2>def2)
					defender.editArmy(battlefield, -1);
				else{
					editArmy(attacker.getLoc(), -1);
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
				defender.editArmy(battlefield, -1);
			else{
				editArmy(attacker.getLoc(), -1);
				attackForceSize-=1;}
		}
		
		//battle has concluded
		//update numbers, not sure it actually needs to do this but I'm not taking any chances
		
		defenseArmy=defender.getCountry(battlefield).getArmy();
		int defForceSize=defenseArmy.getSize();
		for (int i=0; i<a.size(); i++)
			if (a.get(i).getArmy().getLoc()==attacker.getLoc())
				attacker=a.get(i).getArmy();
		
		if (defForceSize==0){//for if the attacker wins

			defender.editArmy(battlefield, attackForceSize);
			editArmy(attacker.getLoc(), -1*attackForceSize);
			addCountry(defender.getCountry(defenseArmy.getLoc()));
			defender.removeCountry(defenseArmy.getLoc());
		}
		else if (attackForceSize==0){//for if the defender wins
			//I don't think anything else needs to be done but I'll leave it open
		}
		else
			attack(bf,attackingCountry, attacker, attackForceSize,defender);
			
	}
	
	public int getPlayerNum(){
		return playerNum;
	}
	
	public HashMap<Integer, Country> getCountries(){
		return a;
	}
	
	public void removeCountry(int armyLocation){
		for (int i=0;i<a.size();i++)
			if (a.get(i).getArmy().getLoc()==armyLocation)
				a.remove(i);
	}
	public void editArmy(int armyLocation, int numChange){
		for (int i=0;i<a.size();i++)
			if (a.get(i).getArmy().getLoc()==armyLocation)
			    a.get(i).getArmy().editTroopSize(numChange);
	}
	public void destroyCountry(int armyLocation){
		for (int i=0;i<a.size();i++)
			if (a.get(i).getArmy().getLoc()==armyLocation)
				a.remove(i);
	}
	public Country getCountry(int armyLocation){
			if (a.get(armyLocation).getCountryNum() == armyLocation)
				return a.get(armyLocation);
		return null;
	}
	public void fortify(int startArmyLocation, int endArmyLocation, int amtChange){
		editArmy(startArmyLocation, -1*amtChange);
		editArmy(endArmyLocation, amtChange);
	}
	
	public void addCountry(Country c){
		a.put(c.getCountryNum(), c);
	}
	
	public String getColorHex(){
	    if(playerColor == Color.RED) return "#ff0000";
	    if(playerColor == Color.ORANGE) return "#ffa500";
	    if(playerColor == Color.YELLOW) return "#ffff00";
	    if(playerColor == Color.GREEN) return "#008000";
	    if(playerColor == Color.BLUE) return "#0000FF";
	    if(playerColor == Color.PURPLE) return "#800080";
	    if(playerColor == Color.BLACK) return "#000000";
	    	return "#000000";
	}
}
