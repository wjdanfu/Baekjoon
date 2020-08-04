import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String form=sca.nextLine();
        StringTokenizer stk=new StringTokenizer(form,"-+",true);
        ArrayList<String> list = new ArrayList<String>(); 
        while(stk.hasMoreTokens()) {
        	list.add(stk.nextToken());
        }
      int sum=0;
      int mynum=0;
      for(int k=0;k<=list.size()/2;k++) {
    	  mynum+=Integer.parseInt(list.get(2*k));
      }
     
        for(int j=0;j<list.size()/2;j++) {
        	sum+=Integer.parseInt(list.get(2*j));
        	if(list.get(2*j+1).equals("-"))
        		break;
        }
        
        	if(list.contains("-")) {
        		System.out.print(mynum*(-1)+2*sum);
        	}
        	else {
        		System.out.print(mynum);
        	}
        
    }
}
