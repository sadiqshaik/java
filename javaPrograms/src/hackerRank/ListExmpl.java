package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListExmpl {
	
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner s=  new Scanner(System.in);
	        int n = s.nextInt();//5
	        int num ;
	        String Insert = "Insert";
	        String Delete="Delete";
	        List<Integer> list =  new ArrayList();
	        for( int i=0; i<n; i++){
	        	num = s.nextInt();;//        	 12 0 1 78 12
	        	//System.out.println(" "+num+" ");	        			
	            list.add(i, num);
	            }
	        int Two = s.nextInt();//2
	        String insert1=s.next();//  Insert
	        int index =s.nextInt();//5
	        int obj = s.nextInt();//23

	        String remove1=s.next();//delete
	       
	        /*int insert = s.nextInt();
	        int pl = s.nextInt();*/
	        int remove =s.nextInt();//0
	        s.close();
	       // System.out.println(n+" "+Two+" "+insert1+" "+index+" "+obj+" "+remove1+" "+remove);
	       
	        	 list.add(index, obj);
	       
	        
	        	 list.remove(remove);
	        
	       
	       for (Integer integer : list) {
	    	   System.out.print(integer+" ");
		}
	        
	       /*5
	       12 0 1 78 12
	       2
	       Insert
	       5 23
	       Delete
	       0*/
	}
}
