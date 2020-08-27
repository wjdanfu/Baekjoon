import java.util.*;

public class Main {
	static int cards[];
	static int sg[];
    public static void main(String[] args) {
    	 Scanner sca=new Scanner(System.in);
    	 int N=sca.nextInt();
    	 cards=new int[N];
    	 for(int i=0;i<N;i++) {
    		 cards[i]=sca.nextInt();
    	 }
    	 int M=sca.nextInt();
    	 sg=new int[M];
    	 for(int i=0;i<M;i++) {
    		 sg[i]=sca.nextInt();
    	 }
    	 Arrays.sort(cards);
    	 
    	 int i=0;
    	 while(i<M) {
    		 int mid=0;
        	 int left=0;
        	 int result=0;
        	 int right=N-1;
    		 while(left<=right) {
    			 mid=(right+left)/2;
    			 if(sg[i]==cards[mid]) {
    				 result++;
    				 break;
    			 }
    			 if(sg[i]>cards[mid])
    				left=mid+1;
    			 else
    				right=mid-1;
    		 }
    		 if(result==0)
    			 sg[i]=0;
    		 else
    			 sg[i]=1;
    		 i++;
    	 }
    	 for(int j=0;j<sg.length;j++)
    		 System.out.print(sg[j]+" ");
     }
    
}
