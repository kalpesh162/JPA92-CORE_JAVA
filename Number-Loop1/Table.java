/*Write a Java program to print a multiplication table of any number.*/
import java.util.Scanner;
public class Table{
	public static void main(String[] args) {
		int number;
		System.out.println("Enter Number ");
		Scanner scanner=new Scanner(System.in);  // System.in = stdin
		number=scanner.nextInt();

		for(int i=1;i<=10;i++){
			// 5  *  1 =5
			System.out.println(number+" * "+i+" = "+(number*i));
		}

	}
}