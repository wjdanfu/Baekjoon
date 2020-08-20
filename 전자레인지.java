import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sca=new Scanner(System.in);
    	int T=sca.nextInt();
    	int press300s=0;
    	int press60s=0;
    	int press10s=0;
    	while(T>0) {
    		if(T%300==0) {
    			press300s+=T/300;
    			break;
    		}
    		else if(T%60==0) {
    			press60s+=1;
    			T-=60;
    		}
    		else {
    			press10s+=1;
    			T-=10;
    		}
    		if(T<0) {
    			T=-1;
    		}
      	}
    	if(T==-1)
    		System.out.print(T);
    	else
    		System.out.print(press300s+" "+press60s+" "+press10s);
    }
}
