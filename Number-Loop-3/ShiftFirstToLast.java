
import java.util.Scanner;

public class ShiftFirstToLast{
	public static void main(String[] args) {
			int num;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Num1 ");
			num=scanner.nextInt();
			
			// last digit
			int temp=num;
			while(temp>9)
			temp=temp/10;

			int lastDigit=temp;		

			
			int multipler=1;

			temp=num;  // 1234
			while(temp>9){
				temp=temp/10;
				multipler=multipler*10;  // 10000
			}


			int remainingNum=num%multipler;

			int res=remainingNum*10+lastDigit;

			System.out.println(res);


		
	}
}