import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int sum=0;
        int jari[]=new int[3];
        for(int i=1;i<=n;i++) {
        	if(i<100)
        		sum++;
        	else {
        		jari[0]=i/100;
        		jari[1]=(i-(jari[0]*100))/10;
        		jari[2]=(i-(jari[0]*100)-(jari[1]*10));
        		if(jari[1]-jari[0]==jari[2]-jari[1])
        			sum++;
        		}
        }
    System.out.print(sum);
	}
}
