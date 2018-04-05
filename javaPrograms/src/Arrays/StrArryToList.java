package Arrays;

import java.util.ArrayList;
import java.util.List;

public class StrArryToList {

	public static void main(String[] args) {

String [] str = {"sadiq", "java", "spring"};
	
	List list = new ArrayList();
	for (int i = 0; i < str.length; i++) {
		list.add(i, str[i]);		
	}	
	for (Object object : list) {
		System.out.println(object);
	}
	}
	

}
