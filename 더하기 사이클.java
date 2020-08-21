import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sca=new Scanner(System.in);
    	int N=sca.nextInt();//26
    	int ten=N/10;//2
    	int one=N%10;//6
    	int sum=0;
    	int i=0;
    	while(true) {
    		sum=ten+one;//08 14
    		int newNum=one*10+sum%10;//68 84
    		one=newNum%10;//8
    		ten=newNum/10;//6
    		i++;
    		if(newNum==N)
    			break;
    	}
    	System.out.print(i);
    }
}
