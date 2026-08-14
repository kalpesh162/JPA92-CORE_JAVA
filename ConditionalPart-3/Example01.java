/*
Conditional Operator
Tertiary Operator 

?  :
*/

import java.util.Scanner;
public class Example01{
  public static void main(String[] args) {
  	int num;
  	Scanner scanner=new Scanner(System.in);
  	System.out.println("Enter Num ");
  	num=scanner.nextInt();

/*   
   int x;
     if(num%2==0)
     	System.out.println("Even");
     else
     	System.out.println("Odd");
*/
     	// (cond)? true  : false

     	String msg=(num%2==0)?"Even" : "Odd";
     	System.out.println(msg);

     	int x=(num%2==0)?num : num ;
     	System.out.println(x);

  }
}