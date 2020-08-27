import java.util.*;

public class Main {
	public static long GCD(long a, long b) {
        long r = 0;
        while (true) {
            r = a % b;
            if (r == 0) {
                break;
            }
            a = b;
            b = r;
        }
        return b;
    }

	
    public static void main(String[] args) {
    	
    	Scanner sca=new Scanner(System.in);
    	 long a=sca.nextLong();
    	 long b=sca.nextLong();
    	 int result=0;
    	 for(long i=0;;i++) {
    		 long i2 = i*i;
    	        if(i2 > b) break;
    	        if(i2 > a) result++;
    	 }
    	 long c=b-a;
    	 long divideNum = GCD(result, c);
    
    	 if(result==0)
    		 System.out.print("0");
    	 else
    		 System.out.print(result/divideNum+"/"+c/divideNum);
     }
}
