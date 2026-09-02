import java.util.Scanner;
import java.util.Random;
/**
 *   @author: Kalpesh
 *   @since : 2026
 *   @version:1.0
 */
public  class Example04{
	/**
	 * @param : int[] Passing  
	 * @return : nothing
	 * 
	*/
	public static void inputData(int B[]){
		 Random generator=new Random();
		for(int index=0;index<B.length;index++){
			B[index]=generator.nextInt(10000);
		}
	}
	
	public static void displayData(int[] B){
		System.out.printf("%-10s %-10s %-10s %-10s %-10s \n","Index","NUMBER",  "SUM","PRODUCT","REVERSE");
		System.out.println("-----------------------------------------------------------------------------");
		for(int i=0;i<B.length;i++){
			System.out.printf("%-8d    %-8d ",i,B[i]);
			System.out.printf("%-13d ",sumOfDigit(B[i]));
			System.out.printf("%-13d ",productOfDigit(B[i]));
			System.out.printf("%-13d ",reverseNum(B[i]));
			System.out.println();
		}

	}

	public static  int sumOfDigit(int num){
		  int sum=0;
		  while(num>0){
		  	 sum=sum+num%10;
		  	 num=num/10;
		  }
		  return sum;
	}
	public static int productOfDigit(int num){
		  int sum=1;
		  while(num>0){
		  	 sum=sum*(num%10);
		  	 num=num/10;
		  }
		  return sum;
	}
	public static int reverseNum(int num){
		  int sum=0;
		  while(num>0){
		  	 sum=sum*10+num%10;
		  	 num=num/10;
		  }
		  return sum;
	}

	public static void main(String[] args) {
    int size;	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Size");
	size=scanner.nextInt();

	int A[]=new int[size];
	inputData(A);
	
	System.out.println("Dispplay Array !!");
	displayData(A);

	}
	
}