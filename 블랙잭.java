import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sca=new Scanner(System.in);
    	int N=sca.nextInt();
    	int M=sca.nextInt();
    	int cards[]=new int[N];
    	for(int i=0;i<N;i++) {
    		cards[i]=sca.nextInt();
    	}
    	
    	Arrays.sort(cards);
    	
    	int temp=0;
    	int max=0;
    	for(int i=0;i<N-2;i++) {
    		for(int j=i+1;j<N-1;j++) {
    			for(int k=j+1;k<N;k++) {		
    				temp = cards[i]+cards[j]+cards[k];
    				if(temp<=M&&temp>max) {	
    								
    					max = temp;	//m에 가까운 최대값이 저장				
    				}	
    			}
    		}
    	}
    	System.out.println(max);
    }
}
