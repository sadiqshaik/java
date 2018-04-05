package secondLargestElement;

import java.util.Arrays;

public class PrintsecondLargesteltArray {

	public static void main(String[] args) {
		 int ktree[] = {1,7,4,9,2,5};
		 System.out.print("unsorted array : ");
		 for (int i = 0; i < ktree.length; i++) {
			
			System.out.print( "\t"+ktree[i]);
		}
		 System.out.println();
		 System.out.print("unsorted array : ");
		 Arrays.sort(ktree);
		 for (int j = 0; j < ktree.length; j++) {
				
				System.out.print( " "+ktree[j]);
			}
		 
		 System.out.println("\n"+"second largest element in array : "+ktree[ktree.length-2]);
	}

}
