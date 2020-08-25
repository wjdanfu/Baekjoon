import java.util.*;

public class Main {
	static int[] bows;
    public static void main(String[] args) {
    	 Scanner sca=new Scanner(System.in);
    	 int N=sca.nextInt();
    	 bows=new int[N];
    	 for(int i=0;i<N;i++) {
    		 bows[i]=sca.nextInt();
    	 }
    	 int max=bows[0];
    	 int sum=0;
    	 int count=0;
    	 int maxNum=0;
    	 for(int i=1;i<N;i++) {
    		 sum=bows[i];
    		 if(max>sum) {
    			 count++;
    			 if(maxNum<count)
    				 maxNum=count;
    		 }
    		 else if(max<sum) {
    			 max=sum;
    			 count=0;
    		 }
    	 }
    	 System.out.print(maxNum);
    	 
     }
    
}
