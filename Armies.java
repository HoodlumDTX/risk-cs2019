
public class Armies {
Country Location;
int Size;


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

