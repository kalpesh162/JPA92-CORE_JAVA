import java.util.Scanner;
public  class Example02{

	public static void inputData(int B[]){
		Scanner scanner=new Scanner(System.in);
		for(int index=0;index<B.length;index++){
			System.out.println("Enter Num");
			B[index]=scanner.nextInt();
		}
	}
	public static void displayData(int[] B){

		for(int i=0;i<B.length;i++){
			System.out.printf(" B[ %d ]  =  %d ",i,B[i]);
			System.out.println();
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