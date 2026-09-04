import java.util.Scanner;
public  class Example06{

public static void main(String[] args) {
		int size;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size");
		size=scanner.nextInt();

		int A[]=new int[size];
		for(int i=0;i<A.length;i++){
			System.out.println("Enter");
			A[i]=scanner.nextInt();	
		}
		
		System.out.println("Add Element At End");
		int ele=scanner.nextInt();

		int B[]=new int[A.length+1];

		int i=0;
		for(int j=0;j<B.length;j++){
			B[j]=A[i];
			i++;
		}	

		B[i]=ele;

		for(int x : B)
			System.out.println(x);

		}
}