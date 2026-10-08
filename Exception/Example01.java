 class Example01{
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
		
		System.out.println("END F3");
	}

	public static void main(String[] args) {
		System.out.println("IN Main");
			f1();
		System.out.println("END Main");
	}
}
