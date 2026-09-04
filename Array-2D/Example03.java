
import java.util.Scanner;
// Addition of Matrix

public  class Example03 {
	public static void inputData(int arr[][]){
		System.out.println("----- InputArray ----------");
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter Element :");
				arr[i][j]=scanner.nextInt();
			}
		}

		System.out.println();
	}
	public static void displayArray(int arr[][]){
		System.out.println("----- displayArray ----------");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.printf(" %d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}

	public static void doAdd(int A[][],int B[][],int C[][]){
		for(int i=0;i<A.length;i++){
			 for(int j=0;j<A.length;j++){
			 	  C[i][j]=A[i][j]+B[i][j];
			 }
		}
	}
	public static void main(String[] args) {
		int row;
		int col;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Row");
		row=scanner.nextInt();
		System.out.println("Enter Column");
		col=scanner.nextInt();

		int A[][]=new int[row][col];
		int B[][]=new int[row][col];
		int C[][]=new int[row][col];

		System.out.println("Enter All Values For A Array");
		inputData(A);  // What is type of arr  arr is int[][]
		System.out.println("Enter All Values For B Array");	
		inputData(B);  // What is type of arr  arr is int[][]
		displayArray(A);
		displayArray(B);

		doAdd(A,B,C);
		displayArray(C);


		

	}
	
}