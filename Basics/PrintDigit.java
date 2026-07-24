public class PrintDigit{
	public static void main(String a[]){
		int num=1234;

		int first=num%10;
		num=num/10;
		int second=num%10;
		num=num/10;
		int third=num%10;
		num=num/10;
		int  fourth=num%10;

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
	}
}