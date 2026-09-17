
public  class Example05{
	public static void test(float x){ System.out.println("float "+x);}	
	
	//public static void test(double x){ System.out.println("double "+x);}	

	public static void main(String[] args) {

		//test(11.11);    // 11.11  double
		// incompatible types: possible lossy conversion from double to float
		test((float)11.11);    // 11.11  double
		test(11.11f);
	}
}