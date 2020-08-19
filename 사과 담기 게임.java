import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sca=new Scanner(System.in);
    	int result=0;
    	int N=sca.nextInt();
    	int M=sca.nextInt();
    	
    	int J=sca.nextInt();
    	int left=0;
    	int right=M;
    	int[]apple=new int[J];
    	for(int i=0; i<J;i++) {
    		apple[i]=sca.nextInt();
    	}
    	for(int i=0;i<J;i++) {
    		if(right<apple[i]) {
    			result+=apple[i]-right;
    			right=apple[i];
    			left=right-M;
    		}
    		if(left>=apple[i]) {
    			result+=left-apple[i]+1;
    			left=apple[i]-1;
    			right=left+M;
    		}
    	}
    	
    	System.out.print(result);
    	
    }
}
