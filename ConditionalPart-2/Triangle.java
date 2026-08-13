/*Write a  Java  program to input all sides of a triangle and check whether the triangle is valid or not.*/

import java.util.Scanner;

public class Triangle{
	public static void main(String[] args) {
		int side1;
		int side2;
		int side3;

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Side 1");
		side1=scanner.nextInt();
		System.out.println("Enter Side 2");
		side2=scanner.nextInt();
		System.out.println("Enter Side 3");
		side3=scanner.nextInt();

		// two side(add) > third side
		if(((side1+side2)>side3) && ((side1+side3)>side2) && ((side2+side3)>side1))
			System.out.println("Triangle Valid");
		else
			System.out.println("Triangle NOT  Valid");

	}
}