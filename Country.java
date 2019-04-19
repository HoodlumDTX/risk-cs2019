import java.awt.List;
import java.util.ArrayList;
public class Country {
	
	private int countryNum;
	private ArrayList<Integer> touchingCountries;
	private Player p;
	private Armies a;
	
	public Country(){
		countryNum = 0;
		touchingCountries = new ArrayList<Integer>();
		p = new Player();
		a = new Armies();
	}
	
	public Country(int cN, Player iP, Armies iA, ArrayList<Integer> tC){
		countryNum = cN;
		p = iP;
		a = iA;
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
	
	public void setPlayer(Player var){
		p = var;
	}
	
	public void setArmies(Armies var){
		a = var;
	}
	
	public Player getPlayer(){
		return p;
	}
	
	public Armies getArmies(){
		return a;
	}
	
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
	
}

/* 
public Player getRandomPlayer(){
	//implementation not shown, probably just make an array or arraylist of all
	//the players at the start of the game then use a random num from min to max num of players 
	//to pick one at random then return it, should be in the Game Class 
}

public Armies getStartArmies(){
	//not sure how this works, so I leave it blank, also should probably be in the game class.
}

//bc# = border countries # (# is the number of the country that is being bordered)
//c# = country #



ArrayList<Integer> bc1 = new ArrayList<Integer>();
ArrayList<Integer> bc2 = new ArrayList<Integer>();
ArrayList<Integer> bc3 = new ArrayList<Integer>();
ArrayList<Integer> bc4 = new ArrayList<Integer>();
ArrayList<Integer> bc5 = new ArrayList<Integer>();
ArrayList<Integer> bc6 = new ArrayList<Integer>();
ArrayList<Integer> bc7 = new ArrayList<Integer>();
ArrayList<Integer> bc8 = new ArrayList<Integer>();
ArrayList<Integer> bc9 = new ArrayList<Integer>();
ArrayList<Integer> bc10 = new ArrayList<Integer>();
ArrayList<Integer> bc11 = new ArrayList<Integer>();
ArrayList<Integer> bc12 = new ArrayList<Integer>();
ArrayList<Integer> bc13 = new ArrayList<Integer>();
ArrayList<Integer> bc14 = new ArrayList<Integer>();
ArrayList<Integer> bc15 = new ArrayList<Integer>();
ArrayList<Integer> bc16 = new ArrayList<Integer>();
ArrayList<Integer> bc17 = new ArrayList<Integer>();
ArrayList<Integer> bc18 = new ArrayList<Integer>();
ArrayList<Integer> bc19 = new ArrayList<Integer>();
ArrayList<Integer> bc20 = new ArrayList<Integer>();
ArrayList<Integer> bc21 = new ArrayList<Integer>();
ArrayList<Integer> bc22 = new ArrayList<Integer>();
ArrayList<Integer> bc23 = new ArrayList<Integer>();
ArrayList<Integer> bc24 = new ArrayList<Integer>();
ArrayList<Integer> bc25 = new ArrayList<Integer>();
ArrayList<Integer> bc26 = new ArrayList<Integer>();
ArrayList<Integer> bc27 = new ArrayList<Integer>();
ArrayList<Integer> bc28 = new ArrayList<Integer>();
ArrayList<Integer> bc29 = new ArrayList<Integer>();
ArrayList<Integer> bc30 = new ArrayList<Integer>();
ArrayList<Integer> bc31 = new ArrayList<Integer>();
ArrayList<Integer> bc32 = new ArrayList<Integer>();
ArrayList<Integer> bc33 = new ArrayList<Integer>();
ArrayList<Integer> bc34 = new ArrayList<Integer>();
ArrayList<Integer> bc35 = new ArrayList<Integer>();
ArrayList<Integer> bc36 = new ArrayList<Integer>();
ArrayList<Integer> bc37 = new ArrayList<Integer>();
ArrayList<Integer> bc38 = new ArrayList<Integer>();
ArrayList<Integer> bc39 = new ArrayList<Integer>();
ArrayList<Integer> bc40 = new ArrayList<Integer>();
ArrayList<Integer> bc41 = new ArrayList<Integer>();
ArrayList<Integer> bc42 = new ArrayList<Integer>();

bc1.addAll(Arrays.asList(2, 4, 30));
bc2.addAll(Arrays.asList(1, 4, 5, 3));
bc3.addAll(Arrays.asList(2, 5, 6, 20));
bc4.addAll(Arrays.asList(1, 2, 3, 5, 7));
bc5.addAll(Arrays.asList(2, 4, 7, 8, 6, 3));
bc6.addAll(Arrays.asList(5, 8, 3));
bc7.addAll(Arrays.asList(4, 5, 8, 9));
bc8.addAll(Arrays.asList(5, 6, 7, 9));
bc9.addAll(Arrays.asList(7, 8, 10));
bc10.addAll(Arrays.asList(9, 11, 12));
bc11.addAll(Arrays.asList(10, 12, 13));
bc12.addAll(Arrays.asList(10, 11, 13, 14));
bc13.addAll(Arrays.asList(11, 12));
bc14.addAll(Arrays.asList(12, 15, 16, 17, 23, 26));
bc15.addAll(Arrays.asList(14, 16, 26, 34));
bc16.addAll(Arrays.asList(15, 14, 17, 18, 19));
bc17.addAll(Arrays.asList(14, 16, 18));
bc18.addAll(Arrays.asList(17, 16, 19));
bc19.addAll(Arrays.asList(18, 16));
bc20.addAll(Arrays.asList(3, 21, 22));
bc21.addAll(Arrays.asList(20, 22, 23, 24));
bc22.addAll(Arrays.asList(20, 21, 24, 25));
bc23.addAll(Arrays.asList(21, 24, 26, 14));
bc24.addAll(Arrays.asList(23, 21, 22, 25, 26));
bc25.addAll(Arrays.asList(22, 24, 26, 34, 32, 27));
bc26.addAll(Arrays.asList(23, 24, 25, 34, 15, 14));
bc27.addAll(Arrays.asList(25, 32, 36, 28));
bc28.addAll(Arrays.asList(27, 36, 33, 31, 29));
bc29.addAll(Arrays.asList(28, 31, 30));
bc30.addAll(Arrays.asList(29, 31, 37, 1));
bc31.addAll(Arrays.asList(28, 29, 30, 33));
bc32.addAll(Arrays.asList(25, 34, 35, 36, 27));
bc33.addAll(Arrays.asList(36, 28, 31, 30, 37));
bc34.addAll(Arrays.asList(15, 26, 25, 32, 35));
bc35.addAll(Arrays.asList(34, 32, 36, 38));
bc36.addAll(Arrays.asList(35, 32, 27, 28, 33, 38));
bc37.addAll(Arrays.asList(33, 30));
bc38.addAll(Arrays.asList(35, 36, 39));
bc39.addAll(Arrays.asList(38, 40, 41));
bc40.addAll(Arrays.asList(39, 41, 42));
bc41.addAll(Arrays.asList(39, 40, 42));
bc42.addAll(Arrays.asList(40, 41));

Country c1 = new Country(1, getRandomPlayer(), getStartArmies(1), bc1);
Country c2 = new Country(2, getRandomPlayer(), getStartArmies(2), bc2);
Country c3 = new Country(3, getRandomPlayer(), getStartArmies(3), bc3);
Country c4 = new Country(4, getRandomPlayer(), getStartArmies(4), bc4);
Country c5 = new Country(5, getRandomPlayer(), getStartArmies(5), bc5);
Country c6 = new Country(6, getRandomPlayer(), getStartArmies(6), bc6);
Country c7 = new Country(7, getRandomPlayer(), getStartArmies(7), bc7);
Country c8 = new Country(8, getRandomPlayer(), getStartArmies(8), bc8);
Country c9 = new Country(9, getRandomPlayer(), getStartArmies(9), bc9);
Country c10 = new Country(10, getRandomPlayer(), getStartArmies(10), bc10);
Country c11 = new Country(11, getRandomPlayer(), getStartArmies(11), bc11);
Country c12 = new Country(12, getRandomPlayer(), getStartArmies(12), bc12);
Country c13 = new Country(13, getRandomPlayer(), getStartArmies(13), bc13);
Country c14 = new Country(14, getRandomPlayer(), getStartArmies(14), bc14);
Country c15 = new Country(15, getRandomPlayer(), getStartArmies(15), bc15);
Country c16 = new Country(16, getRandomPlayer(), getStartArmies(16), bc16);
Country c17 = new Country(17, getRandomPlayer(), getStartArmies(17), bc17);
Country c18 = new Country(18, getRandomPlayer(), getStartArmies(18), bc18);
Country c19 = new Country(19, getRandomPlayer(), getStartArmies(19), bc19);
Country c20 = new Country(20, getRandomPlayer(), getStartArmies(20), bc20);
Country c21 = new Country(21, getRandomPlayer(), getStartArmies(21), bc21);
Country c22 = new Country(22, getRandomPlayer(), getStartArmies(22), bc22);
Country c23 = new Country(23, getRandomPlayer(), getStartArmies(23), bc23);
Country c24 = new Country(24, getRandomPlayer(), getStartArmies(24), bc24);
Country c25 = new Country(25, getRandomPlayer(), getStartArmies(25), bc25);
Country c26 = new Country(26, getRandomPlayer(), getStartArmies(26), bc26);
Country c27 = new Country(27, getRandomPlayer(), getStartArmies(27), bc27);
Country c28 = new Country(28, getRandomPlayer(), getStartArmies(28), bc28);
Country c29 = new Country(29, getRandomPlayer(), getStartArmies(29), bc29);
Country c30 = new Country(30, getRandomPlayer(), getStartArmies(30), bc30);
Country c31 = new Country(31, getRandomPlayer(), getStartArmies(31), bc31);
Country c32 = new Country(32, getRandomPlayer(), getStartArmies(32), bc32);
Country c33 = new Country(33, getRandomPlayer(), getStartArmies(33), bc33);
Country c34 = new Country(34, getRandomPlayer(), getStartArmies(34), bc34);
Country c35 = new Country(35, getRandomPlayer(), getStartArmies(35), bc35);
Country c36 = new Country(36, getRandomPlayer(), getStartArmies(36), bc36);
Country c37 = new Country(37, getRandomPlayer(), getStartArmies(37), bc37);
Country c38 = new Country(38, getRandomPlayer(), getStartArmies(38), bc38);
Country c39 = new Country(39, getRandomPlayer(), getStartArmies(39), bc39);
Country c40 = new Country(40, getRandomPlayer(), getStartArmies(40), bc40);
Country c41 = new Country(41, getRandomPlayer(), getStartArmies(41), bc41);
Country c42 = new Country(42, getRandomPlayer(), getStartArmies(42), bc42);

*/
