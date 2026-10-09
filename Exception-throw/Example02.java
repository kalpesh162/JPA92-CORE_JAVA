
public class Example02{
	
	public static void main(String[] args) {
			
			System.out.println("START");

			 throw new ArithmeticException();

			System.out.println("END");	

			/*
			Example02.java:10: error: unreachable statement
                        System.out.println("END");
                        ^
            */
	}
}