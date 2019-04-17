
public class Armies {
Country Location;
int Size;

	public Armies(Country Loc, int s){
		Location=Loc;
		Size=s;
	}

	public int getLoc(){
		return Location.getCountryNum();
	}
	
	public int getSize(){
		return Size;
	}
	
	public void EditTroopSize(int num){
		if(Size-num>0){
			Size=Size-num;
		}
		else{
			Size=0;
		}
	}
}

