import java.util.Scanner;
import java.util.Random;
/*
Array Case 6: Elements Greater than Average
 
Find the average of the array, and then display all elements that are greater than this average.
 
Example Input:
Array = [3, 7, 9, 2, 6]
 
Step 1: Average = (3+7+9+2+6)/5 = 27/5 = 5.4
Step 2: Elements greater than 5.4 â†’ 7, 9, 6
 
Expected Output:
Average = 5.4
Elements greater than average = 7 9 6
*/

public  class Example06{

	public static void inputData(int B[]){
		 Random generator=new Random();
		for(int index=0;index<B.length;index++){
			B[index]=generator.nextInt(10000);
		}
	}
	public static double calculateAvg(int A[]){
		int sum=0;
		for(int i=0;i<A.length;i++)
			sum+=A[i];

		return (sum*1.0)/A.length;
	}
	
	public static void displayData(int[] B){
		
		for(int i=0;i<B.length;i++){
			System.out.printf("%-8d    %-8d ",i,B[i]);
			System.out.println();
		}
		double avg=calculateAvg(B);
		System.out.println("AVG of Array  "+avg);

		System.out.println("displayData  With GT Than AVG");
		for(int i=0;i<B.length;i++){
			if(B[i]>avg){
			System.out.printf("%-8d    %-8d ",i,B[i]);
			System.out.println();
		}
		}

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