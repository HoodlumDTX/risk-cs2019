import java.util.ArrayList;
import java.util.Arrays;

public class Country {
	
	private int countryNum;
	private ArrayList<Integer> touchingCountries;
	
	public Country(){
		countryNum = 0;
		touchingCountries = new ArrayList<Integer>();
	}
	
	public Country(int cN, ArrayList<Integer> tC){
		countryNum = cN;
		touchingCountries = tC;
	}
	
	public ArrayList<Integer> getTouchingCountries(){
		return touchingCountries;
	}
	
	public int getCountryNum(){
		return countryNum;
	}
		
	public Country[] initializeCountries(){return new Country[]{new Country(1, new ArrayList<Integer>(Arrays.asList(2, 4, 30))), new Country(2, new ArrayList<Integer>(Arrays.asList(1, 4, 5, 3))), new Country(3, new ArrayList<Integer>(Arrays.asList(2, 5, 6, 20))), new Country(4, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 7))), new Country(5, new ArrayList<Integer>(Arrays.asList(2, 4, 7, 8, 6, 3))), new Country(6, new ArrayList<Integer>(Arrays.asList(5, 8, 3))), new Country(7, new ArrayList<Integer>(Arrays.asList(4, 5, 8, 9))), new Country(8, new ArrayList<Integer>(Arrays.asList(5, 6, 7, 9))), new Country(9, new ArrayList<Integer>(Arrays.asList(7, 8, 10))), new Country(10, new ArrayList<Integer>(Arrays.asList(9, 11, 12))), new Country(11, new ArrayList<Integer>(Arrays.asList(10, 12, 13))), new Country(12, new ArrayList<Integer>(Arrays.asList(10, 11, 13, 14))), new Country(13, new ArrayList<Integer>(Arrays.asList(11, 12))), new Country(14, new ArrayList<Integer>(Arrays.asList(12, 15, 16, 17, 23, 26))), new Country(15, new ArrayList<Integer>(Arrays.asList(14, 16, 26, 34))), new Country(16, new ArrayList<Integer>(Arrays.asList(15, 14, 17, 18, 19))), new Country(17, new ArrayList<Integer>(Arrays.asList(14, 16, 18))), new Country(18, new ArrayList<Integer>(Arrays.asList(17, 16, 19))), new Country(19, new ArrayList<Integer>(Arrays.asList(18, 16))), new Country(20, new ArrayList<Integer>(Arrays.asList(3, 21, 22))), new Country(21, new ArrayList<Integer>(Arrays.asList(20, 22, 23, 24))), new Country(22, new ArrayList<Integer>(Arrays.asList(20, 21, 24, 25))), new Country(23, new ArrayList<Integer>(Arrays.asList(21, 24, 26, 14))), new Country(24, new ArrayList<Integer>(Arrays.asList(23, 21, 22, 25, 26))), new Country(25, new ArrayList<Integer>(Arrays.asList(22, 24, 26, 34, 32, 27))), new Country(26, new ArrayList<Integer>(Arrays.asList(23, 24, 25, 34, 15, 14))), new Country(27, new ArrayList<Integer>(Arrays.asList(25, 32, 36, 28))), new Country(28, new ArrayList<Integer>(Arrays.asList(27, 36, 33, 31, 29))), new Country(29, new ArrayList<Integer>(Arrays.asList(28, 31, 30))), new Country(30, new ArrayList<Integer>(Arrays.asList(29, 31, 37, 1))), new Country(31, new ArrayList<Integer>(Arrays.asList(28, 29, 30, 33))), new Country(32, new ArrayList<Integer>(Arrays.asList(25, 34, 35, 36, 27))), new Country(33, new ArrayList<Integer>(Arrays.asList(36, 28, 31, 30, 37))), new Country(34, new ArrayList<Integer>(Arrays.asList(15, 26, 25, 32, 35))), new Country(35, new ArrayList<Integer>(Arrays.asList(34, 32, 36, 38))), new Country(36, new ArrayList<Integer>(Arrays.asList(35, 32, 27, 28, 33, 38))), new Country(37, new ArrayList<Integer>(Arrays.asList(33, 30))), new Country(38, new ArrayList<Integer>(Arrays.asList(35, 36, 39))), new Country(39, new ArrayList<Integer>(Arrays.asList(38, 40, 41))), new Country(40, new ArrayList<Integer>(Arrays.asList(39, 41, 42))), new Country(41, new ArrayList<Integer>(Arrays.asList(39, 40, 42))), new Country(42, new ArrayList<Integer>(Arrays.asList(40, 41)))};}
	
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
}
