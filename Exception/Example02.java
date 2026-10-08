 class Example02{
	public static void f1(){
		System.out.println("IN F1");
		f2();
		System.out.println("END F1");
	}
	public static void f2(){
		System.out.println("IN F2");
		f3();
		System.out.println("END F2");
	}
	public static void f3(){
		System.out.println("IN F3");
		try{		
			int res=11/0;   // throw new ArithmeticException("/ by zero")
			// 10 line of code
			System.out.println(res);
		}catch(ArithmeticException e){
		System.out.println(" ---> "+e);
		}
		System.out.println("END F3");
	}
	public static void main(String[] args) {
		System.out.println("IN Main");
			f1();
		System.out.println("END Main");
	}
}
