package p2;
import p1.A;

public class X{

	public  void accessA(){

		A a1=new A();

		//System.out.println("Default "+a1.defaultField);
		//System.out.println("protected "+a1.proc);
		System.out.println("public  "+a1.pubField);

		//a1.f2();
		//a1.f3();
		a1.f4();
	}

	public static void main(String[] args) {
		X x1=new X();
		x1.accessA();
	}
}