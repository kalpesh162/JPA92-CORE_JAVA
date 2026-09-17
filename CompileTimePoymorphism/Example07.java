
public  class Example07{
	
	public static void test(int x,int y){ System.out.println("int  int ");}
	public static void test(long x,long y){ System.out.println("long long ");}	
	

	public static void main(String[] args) {
		

		test(11,22);
		test(11l,22l);

	}
}