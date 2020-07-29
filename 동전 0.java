import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num= sca.nextInt();
        int Rmoney=sca.nextInt();
        int coin[]=new int[num];
        int result=0;
        for(int i=0;i<num;i++) {
        	coin[i]=sca.nextInt();        	
        }
        for(int i=num-1;i>=0;i--) {
        	if(Rmoney<coin[i])
        		continue;
        	else {
        		Rmoney-=coin[i];
        		result++;
        		i++;
        	}
        }
        System.out.print(result);
    }
}
