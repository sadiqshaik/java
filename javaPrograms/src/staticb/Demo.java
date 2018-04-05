package staticb;
class Demo extends Class1{ 
		@Override
		public void m1() {
			 System.out.println("hi m1");	
			
		}
		 public static void main(String[] args) {
			 Demo c = new Demo();
			 c.m2();
			 c.m1();
		 }

	}