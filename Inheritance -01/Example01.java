class A {  // Parent Base Super
	int x=10;

	void displayX(){
		System.out.println(x);
	}
	 
}

class B extends A{   // Child Derived Sub
	int y=20;
	void displayY(){
		System.out.println(y);
	}
	
}


public class Example01 {

	public static void main(String[] args) {
		

		B b1=new B();
		System.out.println(b1.x);
		b1.displayX();
		System.out.println(b1.y);
		b1.displayY();


	}
	
}