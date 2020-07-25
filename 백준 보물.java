import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
			A[i]=scan.nextInt();
		Integer B[]=new Integer[n];
		for(int i=0;i<n;i++)
			B[i]=scan.nextInt();
        Arrays.sort(A);
        Arrays.sort(B,Collections.reverseOrder());
        int sum=0;
        int result=0;
        for(int i=0;i<n;i++) {
        	sum=A[i]*B[i];
        	result+=sum;
        }
        System.out.print(result);
        
	}
}