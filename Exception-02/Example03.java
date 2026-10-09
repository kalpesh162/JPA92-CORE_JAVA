
// Runtime Exception are by default propagate
// What is an Exception Propgation ?
// Redeicting am exception to the caller method called as Exception Propgation
public class Example03 {

	public  static void f1() {
		   f2();
	}
	public  static void f2()  {
		 f3();
	}
	public  static void f3() throws ArithmeticException{
		
		System.out.println(11/0);   
	
	}

	public static void main(String[] args)  {
		
		f1();

				System.out.println("THANK ....");
	}
	
}