

public class Hello{
	public static void main(String[] args) {
		int n=10;

		switch (n) {
			//System.out.println("Hi");  // Compile Time Error

			 case  1 :  System.out.println("1"); break;
			 case  2 :  System.out.println("2"); break;
			 case  3 :  System.out.println("3"); break;
			 case  4 :  System.out.println("4"); break;
			 case  5 :  System.out.println("5"); break;
			
			 //System.out.println("Bye");   // Compile Time Error
			 default : 
			 System.out.println("Not Matched");
		}


	}
}