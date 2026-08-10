import java.util.Scanner;
// java package
//  util package
// Scanner  class (user Type)
// int 
// Drink Water from friend House
import java.lang.String;
import java.lang.System;

public class SumOfNNumbers1{
	public static void main(String[] args) {
		int start=1; int end;
		System.out.println("Enter End Value");
		// Object | variable
		Scanner scanner=new Scanner(System.in);
		end=scanner.nextInt();  // action

		int sum=0;  // Accumulator
		while(start<=end){
			sum=sum+start;
			start++;
		}

		System.out.println(sum);

	}
}