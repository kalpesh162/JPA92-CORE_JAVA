//Second Last Digit
// input 121   OP--  121
import java.util.Scanner;
public class Example04{
	public static void main(String[] args) {
    int num;
    System.out.println("Enter Number");
    Scanner scanner=new Scanner(System.in);
    num=scanner.nextInt();
        
     int secondDigit=(num/10) %10;

     System.out.println(secondDigit);

    }
}

//123456

