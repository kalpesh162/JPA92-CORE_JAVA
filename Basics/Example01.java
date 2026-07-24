public class Example01{
	public static void main(String[] args) {
		int num=12993; // 23004
		System.out.println(num);
		int first=((num%10)+1)%10;  // 4
		num=num/10;
		int second=((num%10)+1)%10; // 0
		num=num/10;
		int third=((num%10)+1)%10;  // 0
		num=num/10;
		int fourth=((num%10)+1)%10; // 3
		num=num/10; 
		int fifth=((num%10)+1)%10;  // 2

		int finalNumber=fifth*10000+fourth*1000+third*100+second*10+first*1;
		System.out.println(finalNumber);
	}
}