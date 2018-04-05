package palindrome;

import java.util.Scanner;

public class PalindromeSample {
public static void main(String[] args) {
	

	 int r,sum=0,temp;   
	 Scanner s = new Scanner(System.in);
	System.out.println("enter number : ");
	 int n =s.nextInt();
	
	  temp=n; 
	  
	  while(n>0){    
	   r=n%10;  //getting remainder  
	//   System.out.println("r "+r);
	   sum=(sum*10)+r; 
	//   System.out.println("sum "+sum);
	   n=n/10;    
	  // System.out.println("n "+n);
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
			
}
}