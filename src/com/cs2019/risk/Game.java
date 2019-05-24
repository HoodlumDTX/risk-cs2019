package com.cs2019.risk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;

public class Game {
	private int PlayerCount;
	private ArrayList<Boolean> Turn = new ArrayList<Boolean>(); //return position of player
	private ArrayList<Boolean> Divi = new ArrayList<Boolean>();
	public ArrayList<Player> PS = new ArrayList<Player>();
	public Game(int numPlay){
		PlayerCount = numPlay;
		boolean p1=true, p2=false, p3=false,p4=false,p5=false,p6=false;
		for(int i=1;i<=numPlay;i++){
			//player.addArmy
			if(i==1){
				Turn.add(p1);
				Divi.add(p1);
				Player P1=new Player(1, Color.BLUE);
				PS.add(P1);
			}
			if(i==2){
				Turn.add(p2);
				Divi.add(p2);
				Player P2=new Player(2, Color.PURPLE);
				PS.add(P2);
			}
			if(i==3){
				Turn.add(p3);
				Divi.add(p3);
				Player P3=new Player(3, Color.GREEN);
				PS.add(P3);
			}
			if(i==4){
				Turn.add(p4);
				Divi.add(p4);
				Player P4=new Player(4, Color.YELLOW);
				PS.add(P4);
			}
			if(i==5){
				Turn.add(p5);
				Divi.add(p5);
				Player P5=new Player(5, Color.RED);
				PS.add(P5);
			}
			if(i==6){
				Turn.add(p6);
				Divi.add(p6);
				Player P6=new Player(6, Color.ORANGE);
				PS.add(P6);
			}
		}
		this.DivinciCode();
	}
	@SuppressWarnings("unused")
	public void DivinciCode(){ //gives countries
		ArrayList<Integer> numbs=new ArrayList<Integer>(); //all countries 1- 42
		for(int i=1;i <= 42;i++){
		    	
			numbs.add(i);
		}
		int remain=42%PlayerCount;
		if(remain==0){
			for(int j=1;j<=(42/PlayerCount);j++){
				for(int k=0;k<PlayerCount;k++){
					int id=(int) (Math.random()*numbs.size()+ 1); //grabs random country
					System.out.println(id);
					numbs.remove(numbs.indexOf(id) + 1);
					System.out.println(new Country(id));
					PS.get(k).addCountry(new Country(id + 1));
				}
			}
		}
		else{ //if remain
			for(int j=0;j<((42/PlayerCount)+1);j++){
				for(int k=0;k<PlayerCount;k++){
					int id=(int) (Math.random()*numbs.size() + 1);
					
					numbs.remove(id);
					//PS.get(k).addCountry(new Country(id));
					if(numbs.size()==0&&remain>0){
					    	int addArm = 0;
						HashMap<Integer, Country> TPA = PS.get(k).getCountries();
						boolean has = false;
						int found = -1;
						while(has == false){
						    TextInputDialog dialog = new TextInputDialog();
						    dialog.setHeaderText("put in a number gosh darn it");
						    dialog.showAndWait();
						    addArm = Integer.parseInt(dialog.getResult());
							for(int x=0;x<TPA.size();x++){
								if(TPA.get(x).getArmy().getLoc() == addArm){
									has = true;
									found = x;
								}
							}
						}
						PS.get(k).editArmy(addArm, 1);
					}
				}
			}
		} for(int x = 0; x < PS.get(0).getCountries().size(); x++){
		    if(PS.get(0).getCountries().get(x) != null) System.out.println(PS.get(0).getCountries().get(x).getCountryNum());
		}
	}


}
