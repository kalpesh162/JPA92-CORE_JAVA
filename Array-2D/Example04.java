import java.util.Scanner;
public  class Example04  {

	public static void main(String[] args) {
			
			// 1-D Array

			char name[]={'K','A','R','E','E','N','A'};

			for(char letter:name)
				System.out.println(letter);

			char A[][]={{'A','B','C'},{'D','E','F'},{'G','H','I'}};

			for(char symbols[]:A){

				 for(char alpha:symbols){
				 	System.out.print(alpha);
				 }
				 System.out.println();
			}

			System.out.println("-------------------");
			char arr[]=new char[7];
			Scanner scanner=new Scanner(System.in);
			// scanner.next().charAt(0)
			for(int i=0;i<arr.length;i++){
				System.out.println("Enter Letter :");
				arr[i]=scanner.next().charAt(0);
			}

			for(char ele:arr)
				System.out.println(ele);

			

	}
	
}