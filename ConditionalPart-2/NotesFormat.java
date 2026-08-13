/*Write a  Java  program to count the total number of notes in a given amount.*/

import java.util.Scanner;
public class NotesFormat{
	public static void main(String[] args) {
			int amount;
			Scanner scanner=new Scanner(System.in);
			System.out.print("Enter amount  ..");
			amount=scanner.nextInt();

			int temp=amount;

			System.out.println("Deno    Count    Total");
			System.out.println("------------------------");

			// is amt greater than 2000
			if(amount>=2000){
				int noteOf2000=amount/2000;
				System.out.printf("%-5s *  %-3d  =  %-7d ","2000",noteOf2000,(noteOf2000*2000));
				System.out.println();
				amount=amount-2000*noteOf2000;
			}

			if(amount>=500){
				int noteOf500=amount/500;
				System.out.printf("%-5s *  %-3d  =  %-7d ","500",noteOf500,(noteOf500*500));
				System.out.println();
				amount=amount-500*noteOf500;

			}

			if(amount>=200){
				int noteOf200=amount/200;
				System.out.printf("%-5s *  %-3d  =  %-7d ","200",noteOf200,(noteOf200*200));
				System.out.println();
				amount=amount-200*noteOf200;

			}

			if(amount>=100){
				int noteOf100=amount/100;
				System.out.printf("%-5s *  %-3d  =  %-7d ","100",noteOf100,(noteOf100*100));
				System.out.println();
				amount=amount-100*noteOf100;

			}


			if(amount>=50){
				int noteOf50=amount/50;
				System.out.printf("%-5s *  %-3d  =  %-7d ","50",noteOf50,(noteOf50*50));
				System.out.println();
				amount=amount-50*noteOf50;

			}


			if(amount>=20){
				int noteOf20=amount/20;
				System.out.printf("%-5s *  %-3d  =  %-7d ","20",noteOf20,(noteOf20*20));
				System.out.println();
				amount=amount-20*noteOf20;

			}


			if(amount>=10){
				int noteOf10=amount/10;
				System.out.printf("%-5s *  %-3d  =  %-7d ","10",noteOf10,(noteOf10*10));
				System.out.println();
				amount=amount-10*noteOf10;

			}


			if(amount>=5){
				int noteOf5=amount/5;
				System.out.printf("%-5s *  %-3d  =  %-7d ","5",noteOf5,(noteOf5*5));
				System.out.println();
				amount=amount-5*noteOf5;

			}


			if(amount>=2){
				int noteOf2=amount/2;
				System.out.printf("%-5s *  %-3d  =  %-7d ","2",noteOf2,(noteOf2*2));
				System.out.println();
				amount=amount-2*noteOf2;

			}


			if(amount>=1){
				int noteOf1=amount/1;
				System.out.printf("%-5s *  %-3d  =  %-7d ","1",noteOf1,(noteOf1*1));
				System.out.println();
				amount=amount-1*noteOf1;

			}


	}
}