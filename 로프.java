import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num=sca.nextInt();
        int rope[]=new int[num];
        
        int sum=0;
        for(int i=0;i<num;i++) {
        	rope[i]=sca.nextInt();
        }
        Arrays.sort(rope);
        int result=rope[0]*num;
        for(int i=1;i<num;i++) {
        	sum=rope[i]*(num-i);
        	if(sum>result)
        		result=sum;
        }
        System.out.print(result);
    }
}
