class A{
	int x=0;  // Property | Field Intilization

	static{
		 System.out.println("static block");
	}
	// instance Block  
	{
		System.out.println("Before Instance Block "+this.x);
		 x=1;
		 System.out.println("After Instance Block "+this.x);
	}

	A(){
		System.out.println("Before Constructor "+this.x);
		 x=2;
		 System.out.println("After Constructor "+this.x);
	}
}
public  class Example04{
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		A a3=new A();
	}
}
