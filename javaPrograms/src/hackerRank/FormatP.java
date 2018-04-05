package hackerRank;


//  Author: Rodney Shaghoulian
//  Github: github.com/rshaghoulian
//HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
public class FormatP {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     /*wew 23
     wewaw 45
     dgrd 45*/
     System.out.println("================================");
     for (int i = 0; i < 3; i++) {
         String s1 = scan.next();
         int x = scan.nextInt();
         System.out.format("%-15s%03d%n", s1, x);
     }
     scan.close();
     System.out.println("================================");
 }
}


