package hackerRank;

import java.util.Scanner;

public class AreaPositive {
static int Area(int x,int y){
	
	return x*y;
}
public static void main(String[] args) {
	Scanner s = new	 Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	if(AreaPositive.Area(x,y)<=0){
		 System.out.print("java.lang.Exception: Breadth and height must be positive");
	}else{
	System.out.println(AreaPositive.Area(x,y));
}
	}
}
