import java.util.ArrayList;
import java.util.Scanner;


public class Game{
	Scanner scan = new Scanner(System.in);
	private int PlayerCount;
	private ArrayList<Boolean> Turn=new ArrayList<Boolean>(); //return position of player
	private ArrayList<Boolean> Divi=new ArrayList<Boolean>();
	private ArrayList<Player> PS=new ArrayList<Player>();
		public ExperimentClass(int numPlay){
		PlayerCount=numPlay;
		boolean[] playerBooleanArray = new boolean[] {true, false, false, false, false, false};
		Player[] playerArray = new Player[] {new Player(1), new Player(1), new Player(3), new Player(4), new Player(5), new Player(6)};
		for(int i=1;i<=numPlay;i++){
			//player.addArmy
			Turn.add(playerBooleanArray[i-1]);
			Divi.add(playerBooleanArray[i-1]);
			PS.add(playerArray[i-1]);
		}
		this.DivinciCode();
	}
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
						ArrayList <Armies> TPA=PS.get(k).getArmies();
						boolean has=false;
						int found=-1;
						while(has==false){
							int addArm = scan.nextInt();
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
