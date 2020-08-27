import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sca=new Scanner(System.in);
    	ArrayList<Long> arr=new ArrayList<Long>();
    	arr.add((long) 0);
    	arr.add((long) 1);
    	for(int i=2;i<=90;i++) {
    		arr.add(arr.get(i-1)+arr.get(i-2));
    	}
    	int num=sca.nextInt();
    	System.out.print(arr.get(num));
    }
}
