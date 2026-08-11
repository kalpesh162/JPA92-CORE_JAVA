//Write a Java program to enter any number and check whether the number is palindrome or not.
// input 121   OP--  121
import java.util.Scanner;
public class Example03{
	public static void main(String[] args) {
    int num;
    System.out.println("Enter Number");
    Scanner scanner=new Scanner(System.in);
    num=scanner.nextInt();
    int temp=num;
    int sum=0;
    while(num>0){
    	int rem=num%10;
    	sum=sum*10+rem;
    	num=num/10;
    }
    if(temp==sum){
    System.out.println("Palindrome");
    }
    else
     System.out.println(" NOT Palindrome");   				
	}
}

