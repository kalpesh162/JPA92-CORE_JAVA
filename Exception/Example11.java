/*
🔢 Problem 7: Append Sum of Digits at the End
📜 Task: Append the sum of digits to the end of the number.
Input:
1234

Output:
123410
temp   sum
1234   10

tem*100+sum
 123410
*/
import java.util.Scanner;
public  class Example11{
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num  ");
		num=scanner.nextInt();

		// STEP 1  COPY Oroginal NUm
		int temp=num;

		// STEP 2 SUMOF DIGIT
		int sum=0;
		while(num>0){
			 sum=sum+num%10;
			 num=num/10;
		}

		//  ADD SUM TO THE COPY NUM

		temp=temp*100+sum;

		System.out.println(temp);
		
	}
}