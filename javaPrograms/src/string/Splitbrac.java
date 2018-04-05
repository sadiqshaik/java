package string;

public class Splitbrac {
public static void main(String[] args) {
	
		  String vals = "[Peter Jackson] [UK] [United Kingdom] [London]";
	  
	    String[] list = vals.split("\\] \\[");
    for(String str : list){
        str = str.replaceAll("\\[", "").replaceAll("\\]", "");
        System.out.print(str+" "); 
   
	
/*    public void strSplitExpn(){
    String vals1 = " [Peter Jackson] [UK] [United Kingdom] [London] ";
    vals = vals.trim(); //removes beginning whitspace
    vals = vals.substring(1,vals.length()-1); // removes beginning and ending bracket
    String[] list1 = vals.split("\\] \\[");
}*/

}}}
