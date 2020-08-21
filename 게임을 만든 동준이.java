import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sca=new Scanner(System.in);
    	int N=sca.nextInt();
    	int score[]=new int[N];
    	int result=0;
    	for(int i=0;i<N;i++) {
    		score[i]=sca.nextInt();
    	}
    	
    	for(int i=score.length-1;i>=1;i--) {
    		if(score[i]<=score[i-1]) {
    			score[i-1]--;
    			result++;
    			i++;
    		}
    	}
    	System.out.print(result);
    }
}
