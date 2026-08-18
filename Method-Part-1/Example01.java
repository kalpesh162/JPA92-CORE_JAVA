public class Example01{

    // non-static 
	static void sayHello(){   // METHOD DECLARATION
		System.out.println("Hello  1");
		System.out.println("Hello  2");
		System.out.println("Hello  3");
		// METHOD DEFINATION
	}


 	 // main   --> Name of method
    // void   --> return type
	public static void main(String[] args) {

		    int x=10;
	
			System.out.println("First ");
			
			sayHello(); // METHOD CALL
			sayHello(); // METHOD CALL

			System.out.println("END");


	}

}