/*
Conditional Operator
Tertiary Operator 

?  :

Largest Among Three
*/

import java.util.Scanner;
public class Example03{
  public static void main(String[] args) {
  	int num1;
    int num2;
    int num3;
  	Scanner scanner=new Scanner(System.in);
  	System.out.println("Enter Num1 ");
  	num1=scanner.nextInt();
    System.out.println("Enter Num2 ");
    num2=scanner.nextInt();
    System.out.println("Enter Num3 ");
    num3=scanner.nextInt();

     int large=(num1>num2 && num1>num3) ? num1 : (num2>num3) ? num2 :num3;

       System.out.println(large);

  }
}