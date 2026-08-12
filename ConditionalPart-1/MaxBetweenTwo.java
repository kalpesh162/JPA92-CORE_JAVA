
// WAIT Power CUT Issue Facing

import java.util.Scanner;

public class MaxBetweenTwo{
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1");
		num1=scanner.nextInt();
		System.out.println("Enter Num2");
		num2=scanner.nextInt();

		if(num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		
	}
}