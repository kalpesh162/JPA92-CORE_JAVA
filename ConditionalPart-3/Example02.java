/*
Conditional Operator
Tertiary Operator 

?  :

Largest Among two num
*/

import java.util.Scanner;
public class Example02{
  public static void main(String[] args) {
  	int num1;
    int num2;
  	Scanner scanner=new Scanner(System.in);
  	System.out.println("Enter Num1 ");
  	num1=scanner.nextInt();
    System.out.println("Enter Num2 ");
    num2=scanner.nextInt();

       String msg=(num1>num2) ? "Num 1 is Large "+num1 : "Num2 is Large"+num2;
       System.out.println(msg);

       int large=(num1>num2) ? num1 : num2 ;

       System.out.println(large);

       //String msg=(num1>num2) ? System.out.println(num1) : System.out.println(num2);
  }
}