import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sca=new Scanner(System.in);
    	ArrayList<Integer> arr=new ArrayList<Integer>();
    	arr.add(0);
    	arr.add(1);
    	for(int i=2;i<=45;i++) {
    		arr.add(arr.get(i-1)+arr.get(i-2));
    	}
    	int num=sca.nextInt();
    	System.out.print(arr.get(num));
    }
}
