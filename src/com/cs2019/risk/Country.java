package com.cs2019.risk;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.scene.control.Button;

public class Country extends Button{

	private int countryNum;
	private ArrayList<Integer> touchingCountries;
	private String name;
	private Armies army;

	public Country(){
		countryNum = 0;
		touchingCountries = new ArrayList<Integer>();
		name = "";
		army = new Armies();
	}

	public Country(int cN){
		countryNum = cN;
		touchingCountries = getTouchingCountries(cN);
		name = getName(cN);
		army = new Armies(cN, 1);
	}

	public ArrayList<Integer> getTouchingCountries(){
		return touchingCountries;
	}

	public int getCountryNum(){
		return countryNum;
	}

	public String getName(){
		return name;
	}

	public Armies getArmy(){
	    return army;
	}

	private String getName(int cN){
	    	switch(cN){
	    		case 1: return "Alaska";
	    		case 2: return "NorthwestTerritiory";
			case 3: return "Greenland";
			case 4: return "Alberta";
			case 5: return "Ontario";
			case 6: return "Quebec";
			case 7: return "WesternUnited States";
			case 8: return "EasternUnited States";
			case 9: return "CentralAmerica";
			case 10: return "Venezuela";
			case 11: return "Peru";
			case 12: return "Brazil";
			case 13: return "Argentina";
			case 14: return "NorthAfrica";
			case 15: return "Egypt";
			case 16: return "EastAfrica";
			case 17: return "Congo";
			case 18: return "SouthAfrica";
			case 19: return "Madagascar";
			case 20: return "Iceland";
			case 21: return "GreatBritain";
			case 22: return "Scandinavia";
			case 23: return "WesternEurope";
			case 24: return "NorthernEurope";
			case 25: return "Ukraine";
			case 26: return "SouthernEurope";
			case 27: return "Ural";
			case 28: return "Siberia";
			case 29: return "Yakustk";
			case 30: return "Kamchatka";
			case 31: return "Irkutsk";
			case 32: return "Afganistan";
			case 33: return "Mongolia";
			case 34: return "MiddleEast";
			case 35: return "India";
			case 36: return "China";
			case 37: return "Japan";
			case 38: return "Sidin";
			case 39: return "Indonesia";
			case 40: return "New Guinea";
			case 41: return "WesternAustrailia";
			case 42: return "EasternAustrailia";
	    }
	    return null;
	}

	private ArrayList<Integer> getTouchingCountries(int cN){
	    switch(cN){
		case 1: return new ArrayList<Integer>(Arrays.asList(2, 4, 30));
		case 2: return new ArrayList<Integer>(Arrays.asList(1, 4, 5, 3));
		case 3: return new ArrayList<Integer>(Arrays.asList(2, 5, 6, 20));
		case 4: return new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 7));
		case 5: return new ArrayList<Integer>(Arrays.asList(2, 4, 7, 8, 6, 3));
		case 6: return new ArrayList<Integer>(Arrays.asList(5, 8, 3));
		case 7: return new ArrayList<Integer>(Arrays.asList(4, 5, 8, 9));
		case 8: return new ArrayList<Integer>(Arrays.asList(5, 6, 7, 9));
		case 9: return new ArrayList<Integer>(Arrays.asList(7, 8, 10));
		case 10: return new ArrayList<Integer>(Arrays.asList(9, 11, 12));
		case 11: return new ArrayList<Integer>(Arrays.asList(10, 12, 13));
		case 12: return new ArrayList<Integer>(Arrays.asList(10, 11, 13, 14));
		case 13: return new ArrayList<Integer>(Arrays.asList(11, 12));
		case 14: return new ArrayList<Integer>(Arrays.asList(12, 15, 16, 17, 23, 26));
		case 15: return new ArrayList<Integer>(Arrays.asList(14, 16, 26, 34));
		case 16: return new ArrayList<Integer>(Arrays.asList(15, 14, 17, 18, 19));
		case 17: return new ArrayList<Integer>(Arrays.asList(14, 16, 18));
		case 18: return new ArrayList<Integer>(Arrays.asList(17, 16, 19));
		case 19: return new ArrayList<Integer>(Arrays.asList(18, 16));
		case 20: return new ArrayList<Integer>(Arrays.asList(3, 21, 22));
		case 21: return new ArrayList<Integer>(Arrays.asList(20, 22, 23, 24));
		case 22: return new ArrayList<Integer>(Arrays.asList(20, 21, 24, 25));
		case 23: return new ArrayList<Integer>(Arrays.asList(21, 24, 26, 14));
		case 24: return new ArrayList<Integer>(Arrays.asList(23, 21, 22, 25, 26));
		case 25: return new ArrayList<Integer>(Arrays.asList(22, 24, 26, 34, 32, 27));
		case 26: return new ArrayList<Integer>(Arrays.asList(23, 24, 25, 34, 15, 14));
		case 27: return new ArrayList<Integer>(Arrays.asList(25, 32, 36, 28));
		case 28: return new ArrayList<Integer>(Arrays.asList(27, 36, 33, 31, 29));
		case 29: return new ArrayList<Integer>(Arrays.asList(28, 31, 30));
		case 30: return new ArrayList<Integer>(Arrays.asList(29, 31, 37, 1));
		case 31: return new ArrayList<Integer>(Arrays.asList(28, 29, 30, 33));
		case 32: return new ArrayList<Integer>(Arrays.asList(25, 34, 35, 36, 27));
		case 33: return new ArrayList<Integer>(Arrays.asList(36, 28, 31, 30, 37));
		case 34: return new ArrayList<Integer>(Arrays.asList(15, 26, 25, 32, 35));
		case 35: return new ArrayList<Integer>(Arrays.asList(34, 32, 36, 38));
		case 36: return new ArrayList<Integer>(Arrays.asList(35, 32, 27, 28, 33, 38));
		case 37: return new ArrayList<Integer>(Arrays.asList(33, 30));
		case 38: return new ArrayList<Integer>(Arrays.asList(35, 36, 39));
		case 39: return new ArrayList<Integer>(Arrays.asList(38, 40, 41));
		case 40: return new ArrayList<Integer>(Arrays.asList(39, 41, 42));
		case 41: return new ArrayList<Integer>(Arrays.asList(39, 40, 42));
		case 42: return new ArrayList<Integer>(Arrays.asList(40, 41));
	    }
	    return null;
	}

public boolean equals(Country x){
    if(x.getCountryNum() == countryNum) return true;
    else return false;
}
}

	/*
	public ArrayList<Boolean> continentControl(Player p, ArrayList<Country> all){
		//order goes
		//0 = North America
		//1 = South America
		//2 = Africa
		//3 = Europe
		//4 = Asia
		//5 = Australia
		ArrayList<Boolean> returnArray = new ArrayList<Boolean>();
		for (int i = 0; i<6; i++){
			returnArray.add(false);
		}
		int NACounter = 0;
		int SACounter = 0;
		int AFCounter = 0;
		int EUCounter = 0;
		int ASCounter = 0;
		int AUCounter = 0;
		for (int i = 0; i < 8; i++){
			if (all.get(i).getPlayer().getPlayerNum() == all.get(i+1).getPlayer().getPlayerNum()){
				NACounter++;
			}
		}
		for (int i = 9; i < 12; i++){
			if (all.get(i).getPlayer().getPlayerNum() == all.get(i+1).getPlayer().getPlayerNum()){
				SACounter++;
			}
		}
		for (int i = 13; i < 18; i++){
			if (all.get(i).getPlayer().getPlayerNum() == all.get(i+1).getPlayer().getPlayerNum()){
				AFCounter++;
			}
		}
		for (int i = 19; i < 25; i++){
			if (all.get(i).getPlayer().getPlayerNum() == all.get(i+1).getPlayer().getPlayerNum()){
				EUCounter++;
			}
		}
		for (int i = 26; i < 36; i++){
			if (all.get(i).getPlayer().getPlayerNum() == all.get(i+1).getPlayer().getPlayerNum()){
				ASCounter++;
			}
		}
		for (int i = 37; i < 41; i++){
			if (all.get(i).getPlayer().getPlayerNum() == all.get(i+1).getPlayer().getPlayerNum()){
				AUCounter++;
			}
		}
		if (NACounter == 9)
			returnArray.set(0, true);
		if (SACounter == 4)
			returnArray.set(1, true);
		if (AFCounter == 6)
			returnArray.set(2, true);
		if (EUCounter == 7)
			returnArray.set(3, true);
		if (ASCounter == 12)
			returnArray.set(4, true);
		if (AUCounter == 4)
			returnArray.set(5, true);
		return returnArray;
	}
	*/

