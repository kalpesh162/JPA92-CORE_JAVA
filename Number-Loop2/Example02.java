/*Write a Java program to enter any number and print its reverse.*/
// input 1234   OP  4321
import java.util.Scanner;

public class Example02{

	public static void main(String[] args) {

    int num;
    System.out.println("Enter Number");
    Scanner scanner=new Scanner(System.in);
    num=scanner.nextInt();
    int sum=0;
    while(num>0){
    	int rem=num%10;
    	sum=sum*10+rem;
    	num=num/10;
    }

    System.out.println(sum);
					
	}
}