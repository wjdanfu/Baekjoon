import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	
    	Scanner sca=new Scanner(System.in);
    	 int T=sca.nextInt();
    	 int M;
    	 for(int i=0;i<T;i++) {
    		 int N=sca.nextInt();
    		 String str=sca.next();
    		 for(int j=0;j<N;j++) {
    			 if(str.equals("N")) {
    				 int alpa = sca.nextInt()+64;
    				 char calpa = (char)alpa;
    				 System.out.print(calpa+" ");
    			 }
    			 else if(str.equals("C")){
    				 char alpa = sca.next().charAt(0);
					int ialpa = (int)alpa-64;
		        	System.out.print(ialpa+" ");
    			 }
    		 }
    		 System.out.print("\n");
    	 }
    	 
    	 
     }
    
}
