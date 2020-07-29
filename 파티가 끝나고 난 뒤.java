import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int person=sca.nextInt();
		int width=sca.nextInt();
		int people=person*width;
		int news[]=new int[5];
		for(int i=0;i<5;i++) {
			news[i]=sca.nextInt();
			System.out.print(news[i]-people+" ");
		}
	}
}
