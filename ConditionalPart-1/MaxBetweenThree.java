
// WAIT Power CUT Issue Facing

import java.util.Scanner;

public class MaxBetweenThree{
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1");
		num1=scanner.nextInt();
		System.out.println("Enter Num2");
		num2=scanner.nextInt();
		System.out.println("Enter Num3");
		num3=scanner.nextInt();


		if(num1>num2 && num1>num3)
			System.out.println(num1);
		else{
			   if(num2>num3)
			   	System.out.println(num2);
			   else
			   	System.out.println(num3);

		}

		/*
		if(num1>num2 && num1>num3)
			System.out.println(num1);
		else if(num2>num3)
			 System.out.println(num2);
		else
			 System.out.println(num3);

		*/

			if(num1>num2){
				   if(num1>num3){
				   	   System.out.println(num1);
				   }
				   else
				   	   System.out.println(num3);
			}
			else{
				 if(num2>num3)
				    System.out.println(num2);
				 else
				    System.out.println(num3);	

			}






	}
}