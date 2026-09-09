class A {  // Parent Base Super
	int x=10;

	A(){
		System.out.println("A constructor");
	}

	void displayX(){
		System.out.println(x);
	}
	 
}

class B extends A{   // Child Derived Sub
	int y=20;
	
	B(){	
		System.out.println("B constructor");
	}
	
	void displayY(){
		System.out.println(y);
	}
	
}


public class Example02 {

	public static void main(String[] args) {
		

		B b1=new B();
		

	}
	
}