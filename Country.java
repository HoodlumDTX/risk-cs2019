import java.util.ArrayList;

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
	
	public ArrayList<Integer> getFriendlyNeighbors(){
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for (Integer var : touchingCountries){
			if (var == countryNum){
				returnList.add(var);
			}
		}
		return returnList;
	}
	
	public ArrayList<Integer> getEnemyNeighbors(){
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for (Integer var : touchingCountries){
			if (var != countryNum){
				returnList.add(var);
			}
		}
		return returnList;
	}
	
	public ArrayList<Integer> getTouchingCountries(){
		return touchingCountries;
	}
	
	public int getCountryNum(){
		return countryNum;
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
}
