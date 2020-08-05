import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<Integer>  list = new ArrayList<Integer>();
        int sum=0;
        for(int i=0;i<9;i++) {
        	list.add(sca.nextInt());
        	sum+=list.get(i);
        }
        Collections.sort(list);
        
        for(int i=0;i<list.size()-1;i++) {
        	for(int j=i+1;j<list.size();j++) {
        		if(sum-list.get(i)-list.get(j)==100) {
        			list.remove(j);
        			list.remove(i);
        			break;
        		}
        	}
        }
        for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));

        
    }
}
