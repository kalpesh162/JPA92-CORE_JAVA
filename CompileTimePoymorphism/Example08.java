
public  class Example08{
	
	public static void test(int x,long y){ System.out.println("int  int ");}
	
	public static void test(long x,int y){ System.out.println("long long ");}	
	
	public static void main(String[] args) {
		
		test(11,22);  // reference to test is ambiguous  test(11,22);

		test(11l ,22);
		test(11 ,22l);
		test(11L ,22);
		test(11 ,22L);
	}
}