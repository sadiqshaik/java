package string;

public class CharCountInSteing {
	
	  public static int getMin(char[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		        
		      } 
		    }
			return minValue;
	  }
	public static void main(String[] args) {
		
		String str = "indian ";
		char[] ch = str.toCharArray();
		int size = ch.length;
		
		for (int i = 0; i < size; i++) {
			int count = 0;
			for (int j = 0; j < size; j++) {

				if (i < j && ch[i] == ch[j]) {
					break;
				}
				if (ch[j] == ch[i]) {
					count++;
					
					}					
				
			if (j == size-1 && count == 1) {
				System.out.println(ch[i]);
				break;	
					
				}
			}
			
		}
		

	}
	private static int getMin(int i) {
i=0;
		int minValue = i; 
		    int size=6;
			for(int j=0;j<size;j++){ 
		      if(i< minValue){ 
		        minValue = i; 
		        
		      } 
		    }
			return minValue;
	  }
	
	
	
}