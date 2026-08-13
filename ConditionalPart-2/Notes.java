/*Write a  Java  program to count the total number of notes in a given amount.*/

import java.util.Scanner;
public class Notes{
	public static void main(String[] args) {
			int amount;
			Scanner scanner=new Scanner(System.in);
			System.out.print("Enter amount  ..");
			amount=scanner.nextInt();

			// is amt greater than 2000
			if(amount>=2000){
				int noteOf2000=amount/2000;
				System.out.println("2000 Rs * "+noteOf2000);
				amount=amount-2000*noteOf2000;
			}

			if(amount>=500){
				int noteOf500=amount/500;
				System.out.println("500 Rs * "+noteOf500);
				amount=amount-500*noteOf500;

			}

			if(amount>=200){
				int noteOf200=amount/200;
				System.out.println("200 Rs * "+noteOf200);
				amount=amount-200*noteOf200;

			}

			if(amount>=100){
				int noteOf100=amount/100;
				System.out.println("100 Rs * "+noteOf100);
				amount=amount-100*noteOf100;

			}


			if(amount>=50){
				int noteOf50=amount/50;
				System.out.println("50 Rs * "+noteOf50);
				amount=amount-50*noteOf50;

			}


			if(amount>=20){
				int noteOf20=amount/20;
				System.out.println("20 Rs * "+noteOf20);
				amount=amount-20*noteOf20;

			}


			if(amount>=10){
				int noteOf10=amount/10;
				System.out.println("10 Rs * "+noteOf10);
				amount=amount-10*noteOf10;

			}


			if(amount>=5){
				int noteOf5=amount/5;
				System.out.println("5 Rs * "+noteOf5);
				amount=amount-5*noteOf5;

			}


			if(amount>=2){
				int noteOf2=amount/2;
				System.out.println("2 Rs * "+noteOf2);
				amount=amount-2*noteOf2;

			}


			if(amount>=1){
				int noteOf1=amount/1;
				System.out.println("1 Rs * "+noteOf1);
				amount=amount-1*noteOf1;

			}


	}
}