package Factorial;

import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {
		int i,fact=1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number  : ");
		int n = s.nextInt();
		for ( i = 1; i <= n; i++) {
			fact =fact * i;			
		}
System.out.println("factors of "+n+" = "+fact);
	}

}
