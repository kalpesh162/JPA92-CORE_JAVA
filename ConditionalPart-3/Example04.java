/*
Conditional Operator
Tertiary Operator 

?  :

Largest Among Four
*/

import java.util.Scanner;
public class Example04{
  public static void main(String[] args) {
  	int n1;
    int n2;
    int n3;
    int n4;
  	Scanner scanner=new Scanner(System.in);
  	System.out.println("Enter Num1 ");
  	n1=scanner.nextInt();
    System.out.println("Enter Num2 ");
    n2=scanner.nextInt();
    System.out.println("Enter Num3 ");
    n3=scanner.nextInt();
    System.out.println("Enter Num4 ");
    n4=scanner.nextInt();

     int large=(n1>n2 && n1>n3 && n1>n4)?n1 : (n2>n3 && n2>n4) ?n2  : (n3>n4) ? n3 : n4 ;  

       System.out.println(large);

  }
}