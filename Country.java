import java.util.ArrayList;
import java.util.Arrays;

public class Country {
	
	private int countryNum;
	private ArrayList<Integer> touchingCountries;
	private String name;
	
	public Country(){
		countryNum = 0;
		touchingCountries = new ArrayList<Integer>();
		name = "";
	}
	
	public Country(int cN, ArrayList<Integer> tC, String n){
		countryNum = cN;
		touchingCountries = tC;
		name = n;
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
		
	public Country[] initializeCountries(){return new Country[]{new Country(1, new ArrayList<Integer>(Arrays.asList(2, 4, 30)), "Alaska"), new Country(2, new ArrayList<Integer>(Arrays.asList(1, 4, 5, 3)), "Northwest Territiory"), new Country(3, new ArrayList<Integer>(Arrays.asList(2, 5, 6, 20)), "Greenland"), new Country(4, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 7)), "Alberta"), new Country(5, new ArrayList<Integer>(Arrays.asList(2, 4, 7, 8, 6, 3)), "Ontario"), new Country(6, new ArrayList<Integer>(Arrays.asList(5, 8, 3)), "Quebec"), new Country(7, new ArrayList<Integer>(Arrays.asList(4, 5, 8, 9)), "Western United States"), new Country(8, new ArrayList<Integer>(Arrays.asList(5, 6, 7, 9)), "Eastern United States"), new Country(9, new ArrayList<Integer>(Arrays.asList(7, 8, 10)), "Central America"), new Country(10, new ArrayList<Integer>(Arrays.asList(9, 11, 12)), "Venezuela"), new Country(11, new ArrayList<Integer>(Arrays.asList(10, 12, 13)), "Peru"), new Country(12, new ArrayList<Integer>(Arrays.asList(10, 11, 13, 14)), "Brazil"), new Country(13, new ArrayList<Integer>(Arrays.asList(11, 12)), "Argentina"), new Country(14, new ArrayList<Integer>(Arrays.asList(12, 15, 16, 17, 23, 26)), "North Africa"), new Country(15, new ArrayList<Integer>(Arrays.asList(14, 16, 26, 34)), "Egypt"), new Country(16, new ArrayList<Integer>(Arrays.asList(15, 14, 17, 18, 19)), "East Africa"), new Country(17, new ArrayList<Integer>(Arrays.asList(14, 16, 18)), "Congo"), new Country(18, new ArrayList<Integer>(Arrays.asList(17, 16, 19)), "South Africa"), new Country(19, new ArrayList<Integer>(Arrays.asList(18, 16)), "Madagascar"), new Country(20, new ArrayList<Integer>(Arrays.asList(3, 21, 22)), "Iceland"), new Country(21, new ArrayList<Integer>(Arrays.asList(20, 22, 23, 24)), "Great Britain"), new Country(22, new ArrayList<Integer>(Arrays.asList(20, 21, 24, 25)), "Scandinavia"), new Country(23, new ArrayList<Integer>(Arrays.asList(21, 24, 26, 14)), "Western Europe"), new Country(24, new ArrayList<Integer>(Arrays.asList(23, 21, 22, 25, 26)), "Northern Europe"), new Country(25, new ArrayList<Integer>(Arrays.asList(22, 24, 26, 34, 32, 27)), "Ukraine"), new Country(26, new ArrayList<Integer>(Arrays.asList(23, 24, 25, 34, 15, 14)), "Southern Europe"), new Country(27, new ArrayList<Integer>(Arrays.asList(25, 32, 36, 28)), "Ural"), new Country(28, new ArrayList<Integer>(Arrays.asList(27, 36, 33, 31, 29)), "Siberia"), new Country(29, new ArrayList<Integer>(Arrays.asList(28, 31, 30)), "Yakutsk"), new Country(30, new ArrayList<Integer>(Arrays.asList(29, 31, 37, 1)), "Kamchatka"), new Country(31, new ArrayList<Integer>(Arrays.asList(28, 29, 30, 33)), "Irkutsk"), new Country(32, new ArrayList<Integer>(Arrays.asList(25, 34, 35, 36, 27)), "Afghanistan"), new Country(33, new ArrayList<Integer>(Arrays.asList(36, 28, 31, 30, 37)), "Mongolia"), new Country(34, new ArrayList<Integer>(Arrays.asList(15, 26, 25, 32, 35)), "Middle East"), new Country(35, new ArrayList<Integer>(Arrays.asList(34, 32, 36, 38)), "India"), new Country(36, new ArrayList<Integer>(Arrays.asList(35, 32, 27, 28, 33, 38)), "China"), new Country(37, new ArrayList<Integer>(Arrays.asList(33, 30)), "Japan"), new Country(38, new ArrayList<Integer>(Arrays.asList(35, 36, 39)), "Sidin"), new Country(39, new ArrayList<Integer>(Arrays.asList(38, 40, 41)), "Indonesia"), new Country(40, new ArrayList<Integer>(Arrays.asList(39, 41, 42)), "New Guinea"), new Country(41, new ArrayList<Integer>(Arrays.asList(39, 40, 42)), "Western Australia"), new Country(42, new ArrayList<Integer>(Arrays.asList(40, 41)), "Eastern Australia")};}
	
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
