package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Name_Mobile {
	   public static void main(String []argh)
	   {
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      Map<String,Integer> contacts = new HashMap<>(n);
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	         contacts.put(name, phone);
	      }
	      String s;
	        while((s = in.nextLine()) != null) {
	        	
	            if (contacts.containsKey(s)) {
	                System.out.println(s + "=" + contacts.get(s));
	            } else {
	                System.out.println("Not found");
	            }
	   }
	   }}
