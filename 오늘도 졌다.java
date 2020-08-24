import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sca=new Scanner(System.in);
    	ArrayList<Integer> team1=new ArrayList<Integer>();
    	ArrayList<Integer> team2=new ArrayList<Integer>();
    	for(int i=0;i<9;i++) {
    		team1.add(sca.nextInt());
    	}
    	for(int i=0;i<9;i++) {
    		team2.add(sca.nextInt());
    	}
    	int team1sum=0;
    	int team2sum=0;
    	for(int i=0;i<9;i++) {
    		team1sum+=team1.get(i);
    		if(team1sum>team2sum) {
    			System.out.print("Yes");
    			team2sum=0;
    			break;
    		}
    		team2sum+=team2.get(i);
    	}
    	if(team2sum!=0)
    		System.out.print("No");
    			 
    }
}
