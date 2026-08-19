import java.util.Scanner;
public class Example01{

   public static int reverseNum(int num){
   	   int res=0;
   	   while(num>0){
   	   	  res=res*10+num%10;
   	   	  num=num/10;
   	   }
   	   System.out.println(res);
   	   return res;

   }

   public void palindrome(int num){
   			int ans=reverseNum(num);

   			num==ans
   }

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num1;
		System.out.println("Enter ");
		num1=scanner.nextInt();

		reverseNum(num1);
		palindrome(num1);
		// reverse Code
		
	}
}