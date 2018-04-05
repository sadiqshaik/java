package string;

 class Sample {
public static void main(String args[]) {
	String test = "abc";
	test = test + test;
	System.out.println(test);
	
	char c;
	int i;
	c = 'B';		// 1
	i = c;		//2
//	c = i + 1;	//3
	System.out.println(test+" "+i);
	c++;		//4
}
}