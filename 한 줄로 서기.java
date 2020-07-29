import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] tall=new int[n+1];
        
        for(int i=1;i<=n;i++) {
        	tall[i]=sc.nextInt();
        
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=n;i>=1;i--) {
        	list.add(tall[i],i);
        }
        for(int i:list) {
        	System.out.print(i+" ");
        }
        
    }
}
