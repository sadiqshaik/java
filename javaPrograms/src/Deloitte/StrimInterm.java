package Deloitte;

public class StrimInterm {
	public static void main(String[] args) {
		


	String str = "sadiq";
	String str2 = str.intern();
	System.out.println(" "+str2);
	
	boolean var =(str==str2);
	boolean test = (str.equals(str2));
	System.out.println(" == "+var+" equals op "+test);
}
}