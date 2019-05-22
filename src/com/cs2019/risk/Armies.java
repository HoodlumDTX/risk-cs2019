package com.cs2019.risk;
public class Armies {
int Location;
int Size;

	public Armies(int Loc, int s){
		Location=Loc;
		Size=s;
	}

	public int getLoc(){
		return Location;
	}
	
	public int getSize(){
		return Size;
	}
	
	public void editTroopSize(int num){
		if(Size-num>0){
			Size=Size-num;
		}
		else{
			Size=0;
		}
	}
}

