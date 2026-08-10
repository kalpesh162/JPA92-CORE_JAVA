/*Write a Java program to find the first and last digit of any number.*/

// num=1234  last=num%10  first =? 
import java.util.Scanner;
public class FirstLastDigit{
	public static void main(String[] args) {
		int number;
		System.out.println("Enter Number ");
		Scanner scanner=new Scanner(System.in);  // System.in = stdin
		number=scanner.nextInt();
		int temp=number;
		int first;

		if(number>10){
		// First Digit caculation
		while(number>10){
			number=number/10;
		}
		first=number;
		}
		else{

		 if(number==10)
		 	first=number/10;
		 else{
		 	first=number;
		 }

		}

		int last=temp%10;

		

		System.out.println("first "+first);
		System.out.println("last "+last);

	}
}