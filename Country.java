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
	
	public Country(Player iP, Armies iA, ArrayList<Integer> tC){
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
	
}
