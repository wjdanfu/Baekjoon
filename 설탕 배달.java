import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sca=new Scanner(System.in);
    	int sugal=sca.nextInt();
    	int bongji5=0;
    	int bongji3=0;
    	while(sugal>0) {
    		if(sugal%5==0) {
    			bongji5+=sugal/5;
    			break;
    		}
    		else {
    			sugal-=3;
    			if(sugal<0) {
    				sugal=-1;
    				break;
    			}
    			bongji3++;
    		}
    		
    	}
    	int sum=bongji3+bongji5;
    	if(sugal!=-1)
    		System.out.print(sum);
    	else
    		System.out.print(sugal);
    }
}
