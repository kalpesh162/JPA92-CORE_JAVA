/*Write a  Java  program to check whether a year is leap year or not.*/
import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args) {
		int year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Year");
		year=scanner.nextInt();

		if(year%400==0){
			System.out.println("Century LeapYear ....");
		}
		else if(year%100!=0  && year %4==0)
			System.out.println(" LeapYear ....");
		else
			System.out.println(" NOT LeapYear ....");

		//if(year%400==0 || year%100!=0 && year%4==0)
	}
}

/*
public boolean isLeapYear(int year){
	if(year%400==0 || year%100!=0 && year%4==0) return true;
	else
		return false;
}
*/


