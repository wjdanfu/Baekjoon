import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num=1000-sca.nextInt();
        int result=0;
        while(true) {
        	if(num>500) {
        		num-=500;
        		result++;
        	}
        	else if(num<500&&num>=100) {
        		num-=100;
        		result++;
        	}
        	else if(num<100&&num>=50) {
        		num-=50;
        		result++;
        	}
        	else if(num<50&&num>=10) {
        		num-=10;
        		result++;
        	}
        	else if(num<10&&num>=5) {
        		num-=5;
        		result++;
        	}
        	else if(num<5&&num>0){
        		num-=1;
        		result++;
        	}
        	else
        		break;
        }
        System.out.print(result);
    }
}