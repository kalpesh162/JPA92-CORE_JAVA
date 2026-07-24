public class Example2{
	public static void main(String[] args) {
		int x=11;
		int y=22;

		int z=x++ + ++y;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}