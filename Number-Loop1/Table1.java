/*Write a Java program to print a multiplication table of any number.*/
import java.util.Scanner;
public class Table1{
	public static void main(String[] args) {
		int number;
		System.out.println("Enter Number ");
		Scanner scanner=new Scanner(System.in);  // System.in = stdin
		number=scanner.nextInt();
		System.out.println("Number    *  I     =     Table ");
		System.out.println("--------------------------------");
		for(int i=1;i<=10;i++){
			//99 * 10 = 990
			// formatters %d  %c %f %s
			// - Left Side Alignment
			// 3 width
			System.out.printf("%-3d  *  %-3d  =  %-4d",number,i,(number*i));
			//System.out.printf("%-3d  *  %-3d  =  %-4d \n",number,i,(number*i));
			System.out.println();

			
		}

	}
}