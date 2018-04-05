package Armstrong;

public class ArmStrong {
public static void main(String[] args) {
	int c=0,a,temp;
	int n = 153 ;
	temp =n;
	
	while(n>0){
		a=n%10;
		//System.out.println(" a "+ a);
		n=n/10;
		//System.out.println(" n "+ n);
		c=c+(a*a*a);
		//System.out.println(" c "+ c);
	}
		if(temp==c)
			System.out.println(" ArmStrong");
		else
			System.out.println(" not ArmStrong");		
	
}
}
