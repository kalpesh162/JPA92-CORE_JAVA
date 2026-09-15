package p2;
import p1.A;

public class Y  extends A {
	//  public protected ony inherited

	// A::proc
	// A::pub
	// A::f3()
	// A::f4()

	public void useA(){
		 System.out.println("A Member Proc Member   "+proc);

		 f3();
	}

	public static void main(String[] args) {
		
		//Y y1=new Y();
		//y1.useA();

		Y y2=new Y();
		System.out.println(y2.proc);
		y2.f4();
	}
	
}