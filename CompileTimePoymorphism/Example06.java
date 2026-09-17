
public  class Example06{
	public static void test(byte x){ System.out.println("byte "+x);}	
	public static void test(short x){ System.out.println("shor "+x);}	
	//public static void test(char x){ System.out.println("char "+x);}
	public static void test(int x){ System.out.println("char "+x);}	
	

	public static void main(String[] args) {
		char letter='a';

		test(letter);  // test(char)  --> here char promote to int

	}
}