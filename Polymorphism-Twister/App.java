class A{
    static int x=11;
	
	static void f1(){
		System.out.println("A class f1()");
	}
}
class B extends A{
	
	 static int x=111;

    @Override
	static void f1(){
		System.out.println("B class f1()" +x);
	}

	void f2(){
	System.out.println("B class f2()");	
	}

}

class App{
	public static void main(String[] args) {
		  A a1=new B();
		  a1.f1();  
		  System.out.println(a1.x);  
	}
}
