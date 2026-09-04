import java.util.Scanner;
public  class Example01 {
	public static void main(String[] args) {
		int row;
		int col;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Row");
		row=scanner.nextInt();
		System.out.println("Enter Column");
		col=scanner.nextInt();

		int arr[][]=new int[row][col];

		//for(int i=0;i<row;i++)
		for(int i=0;i<arr.length;i++){
			//for(int j=0;j<col;j++)
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter Element :");
				arr[i][j]=scanner.nextInt();
			}
		}

		for(int i=0;i<arr.length;i++){
			//for(int j=0;j<col;j++)
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] +" ");
				
			}
			System.out.println();
		}

	}
	
}