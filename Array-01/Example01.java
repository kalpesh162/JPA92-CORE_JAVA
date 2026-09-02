import java.util.Scanner;
public  class Example01{
	public static void main(String[] args) {
			
// C++ C    int A[5];  Stack Area in C C++ you choice to create in Stack Or Heap
		//  int A[N];  N is a variable Here Bad Code in C C++
// Stack Memory is fater than Heap		
// int *p=(int*)malloc(n*sizeof(int));  // C
// int *a=new int[5];
// int *a=new int[n];

// Java   int A[5]; NOT ALLOW HERE
	int size;	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Size");
	size=scanner.nextInt();

	int A[]=new int[size];

	//for(int index=0;index<size;index++)
	// A.length  Property
	for(int index=0;index<A.length;index++){
		System.out.println("Enter Num");
			A[index]=scanner.nextInt();
	}

	System.out.println("Dispplay Array !!");

	for(int i=0;i<A.length;i++)
		System.out.print(A[i]+ "  " );

	System.out.println();


	}
	
}