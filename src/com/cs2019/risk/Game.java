package com.cs2019.risk;
import java.util.ArrayList;
import java.util.Scanner;


public class Game {
	Scanner scan = new Scanner(System.in);
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
				Player P1=new Player(1);
				PS.add(P1);
			}
			if(i==2){
				Turn.add(p2);
				Divi.add(p2);
				Player P2=new Player(2);
				PS.add(P2);
			}
			if(i==3){
				Turn.add(p3);
				Divi.add(p3);
				Player P3=new Player(3);
				PS.add(P3);
			}
			if(i==4){
				Turn.add(p4);
				Divi.add(p4);
				Player P4=new Player(4);
				PS.add(P4);
			}
			if(i==5){
				Turn.add(p5);
				Divi.add(p5);
				Player P5=new Player(5);
				PS.add(P5);
			}
			if(i==6){
				Turn.add(p6);
				Divi.add(p6);
				Player P6=new Player(6);
				PS.add(P6);
			}
		}
		this.DivinciCode();
	}
	@SuppressWarnings("unused")
	public void DivinciCode(){ //gives countries
		ArrayList<Integer> numbs=new ArrayList<Integer>();
		ArrayList<Armies> A1=new ArrayList<Armies>();
		ArrayList<Armies> A2=new ArrayList<Armies>();
		ArrayList<Armies> A3=new ArrayList<Armies>();
		ArrayList<Armies> A4=new ArrayList<Armies>();
		ArrayList<Armies> A5=new ArrayList<Armies>();
		ArrayList<Armies> A6=new ArrayList<Armies>();
		for(int i=1;i<=42;i++){
			numbs.add(i);
		}
		int remain=42%PlayerCount;
		if(remain==0){
			for(int j=1;j<=(42/PlayerCount);j++){
				for(int k=0;k<PlayerCount;k++){
					int Tim=(int) (Math.random()*numbs.size());
					Armies a=new Armies(Tim, 1);
					PS.get(k).addArmy(a);
				}
			}
		}
		else{
			for(int j=1;j<=((42/PlayerCount)+1);j++){
				for(int k=0;k<PlayerCount;k++){
					int Tim=(int) (Math.random()*numbs.size());
					Armies a=new Armies(Tim, 1);
					PS.get(k).addArmy(a);
					if(numbs.size()==0&&remain>0){
					    int addArm = 0;
						ArrayList <Armies> TPA=PS.get(k).getArmies();
						boolean has=false;
						int found=-1;
						while(has==false){
						    addArm = scan.nextInt();
							for(int x=0;x<TPA.size();x++){
								if(TPA.get(x).getLoc()==addArm&&has==false){
									has=true;
									found=x;
								}
							}
						}
						PS.get(k).editArmies(addArm, 1);
					}
				}
			}
		}
	}


}
