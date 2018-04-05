package secondLargestElement;

import java.util.TreeSet;

public class secendlargest {
public static void main(String[] args) {
	
	int array[]={7,1,5,3,9,5};
	
	TreeSet ts= new TreeSet();
	
	for (int i = 0; i < array.length; i++) {
		ts.add(array[i]);
	}

	System.out.println(ts);
}
}
