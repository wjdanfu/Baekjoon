import java.util.*;

public class Main {
    public static void main(String[] args) {
    	int i=1;
    	Scanner sca=new Scanner(System.in);
    	while(true) {
    		int L=sca.nextInt();
    		if(L==0)
    			break;
    		int P=sca.nextInt();
    		int V=sca.nextInt();
    		int sum=0;
    		while(true) {
    			sum+=L;
    			V-=P;//5 12 10 4 
    			if(V<L&&V>0) {
    				sum+=V;
    				System.out.println("Case "+i+": "+sum);
    				i++;
    				break;
    			}
    			else if(V<L){
    				System.out.println("Case "+i+": "+sum);
    				i++;
    				break;
    			}
    		}
    	}
    }
}
