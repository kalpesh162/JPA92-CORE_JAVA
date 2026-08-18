
/* Write a  program to enter marks of five subjects and calculate total, average and percentage. */
import java.util.Scanner;
public class Subject{

	static void  total(int m1,int m2,int m3,int m4,int m5){
			int total=m1+m2+m3+m4+m5;		  
			System.out.println(total);

			average(total);
	}

	static void average(int total){
		    double res=total/5.0;
		    System.out.println(res);
		    percentage(total);
	}

	static void percentage(int total){
		   double percent=(total/5.0)*100;
		   System.out.println(percent);
	}
	

	public static void main(String[] args) {
		int marks1;int marks2;int marks3;int marks4;int marks5;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter marks1 ");
		marks1=scanner.nextInt();
		System.out.println("Enter marks2 ");
		marks2=scanner.nextInt();
		System.out.println("Enter marks3 ");
		marks3=scanner.nextInt();
		System.out.println("Enter marks4 ");
		marks4=scanner.nextInt();
		System.out.println("Enter marks5 ");
		marks5=scanner.nextInt();

//		int total=marks1+marks2+marks3+marks4+marks5;
		total(marks1,marks2,marks3,marks4,marks5);

		
	}
}