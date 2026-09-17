class  A {
	 // data
	// no of methods

	void f1(){
		System.out.println("A class f1()");
	}
}

class  B extends A {
	// data
	// inherited from A class data

	//inherited form A class methods

	void f1(){
		System.out.println("B : f1()");
	}
}

public  class Example01 {

	public static void main(String[] args) {

		A a1=new A();
		a1.f1();

		B b1=new B();
		b1.f1();


		A a2=new B();
		//Parent reference A a2 is pointing or holding child Objject  new B();   UPCASTING
		a2.f1();   // compiler binds call with A class f1()

		// f1() method invoke from B class Object

		
	}
	
}