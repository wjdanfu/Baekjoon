import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int line=sca.nextInt();
		int brand=sca.nextInt();
		int pakage[]=new int[brand];
		int natgae[]=new int[brand];
		for(int i=0;i<brand;i++) {
			pakage[i]=sca.nextInt();
			natgae[i]=sca.nextInt();
		}
		Arrays.sort(pakage);
		Arrays.sort(natgae);
		int sum=0;
		while(line>0) {
			if(natgae[0]>pakage[0]) {
				sum+=pakage[0];
				line-=6;
			}
			else if(natgae[0]*6<pakage[0]) {
				sum+=natgae[0];
				line--;
			}
			else {
				if(line>=6) {
					sum+=pakage[0];
					line-=6;}
					else if(line*natgae[0]>pakage[0]) {
						sum+=pakage[0];
						line=0;}
					else {
						sum+=line*natgae[0];
						line=0;}
					}
				
			
		}
		System.out.print(sum);
	}
}
