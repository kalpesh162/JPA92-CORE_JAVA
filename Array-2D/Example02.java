import java.util.Scanner;
public  class Example02 {
	public static void inputData(int arr[][]){
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter Element :");
				arr[i][j]=scanner.nextInt();
			}
		}
	}
	public static void displayArray(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.printf("[%d %d] = %d   ",i,j,arr[i][j]);
			}
			System.out.println();
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

		int arr[][]=new int[row][col];

		inputData(arr);  // What is type of arr  arr is int[][]

		displayArray(arr);
		

	}
	
}