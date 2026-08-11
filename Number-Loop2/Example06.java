//Average of Digits
//📜 Task: Calculate the average of all digits.

import java.util.Scanner;
public class Example06{
	public static void main(String args[]){
     int num;
     System.out.println("Enter Num");
     Scanner scanner=new Scanner(System.in);
     num=scanner.nextInt();
     int temp=num;
     int digitCount=0;
     // count Digit
     while(num>0){
     	 digitCount++;
     	 num=num/10;
     }
 // +=  num+=10  num/=10
     num=num/10;   // num=num/10   num/=10
     // sumOfDigit
     num=temp; int sum=0;

     while(num>0){
     	 sum=sum+num%10;   // +=  num+=10  num/=10
     	 num=num/10;   // num=num/10   num/=10
     }
     // Avg
     double avg=(sum*1.0)/digitCount;

     System.out.println(avg);

	}
}