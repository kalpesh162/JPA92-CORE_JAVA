
public  class Example04{
	/*
	public static void test(byte x){ System.out.println("byte "+x);}	
	public static void test(short x){ System.out.println("short "+x);}	
	public static void test(char x){ System.out.println("char "+x);}	
	*/
	//public static void test(int x){ System.out.println("int "+x);}	
	
	//public static void test(long x){ System.out.println("long "+x);}	

	//public static void test(float x){ System.out.println("float "+x);}	
	
	public static void test(double x){ System.out.println("double "+x);}	

	public static void main(String[] args) {

		test(11);  // test(int) Compiler  internally int --->Promote --> double
		
	}
}