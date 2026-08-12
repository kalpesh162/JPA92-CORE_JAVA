
import java.util.Scanner;

public class LasttoFirst{
	public static void main(String[] args) {
			int num;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Num1 ");
			num=scanner.nextInt();
			int digit=num%10;
			int newNum=num/10;
			// last digit
			int temp=num;
			int multipler=1;
			while(temp>9){
				temp=temp/10;
				multipler=multipler*10; 
			}
			
			int res=digit*multipler+newNum;

			System.out.println(res);	
	}
}