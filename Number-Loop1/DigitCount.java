/*    Write a Java program to count the number of digits in any number.*/

// num=1234  op=4
import java.util.Scanner;
public class DigitCount{
	
	public static void main(String[] args) {
		int number;
		System.out.println("Enter Number to Count Digit");
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		int temp=number;
		int cnt=0;
		while(number>0){
			number=number/10;
			cnt++;
		}

		//System.out.println(number +"  " + cnt);
		System.out.println(temp +"  "+cnt);

	}
}    