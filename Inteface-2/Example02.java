
// JAVA 8
interface Hello{
	 void say();

	 //not compulsary to Override
	default void gesture(){
		System.out.println("HMMMMMM");
	}

	static void f1(){
		System.out.println("Hello :: static method ");
	}
}

class A implements Hello{
		@Override
		public  void say(){
			System.out.println("Namste  ");
		}
}


public  class Example02 {

	public static void main(String[] args) {
			A a1=new A();
			a1.say();
			a1.gesture();
	}
	
}