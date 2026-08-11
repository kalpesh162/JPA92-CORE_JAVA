/*Write a Java program to calculate the sum of digits of any number.*/
// num=1234;  sum=10
import java.util.Scanner;

public class Example01{
  public static void main(String[] args) {
    int number;
    System.out.println("Enter Number");
    Scanner scanner=new Scanner(System.in);
    number=scanner.nextInt();\
    int sum=0;

    while(num>0){
       int rem=num%10;
       sum=sum+rem;
       num=num/10;
    }

    System.out.println("Sum Of digits  "+sum);
  

  }
}