import java.util.Scanner;
class RaggedArray{

	public static void main(String[] args) {
		int A[][];
		Scanner scanner=new Scanner(System.in);
		int row;
		System.out.println("Enter Row !!!");
		row=scanner.nextInt();
		// Creation of An Array
		A=new int[row][];
		int col;

		for(int i=0;i<A.length;i++){
			System.out.println("Row "+i +"  Enter Col ");
  			col=scanner.nextInt();
  			A[i]=new int[col];
		} 
		// intialization
		for(int i=0;i<A.length;i++){
			  for(int j=0;j<A[i].length;j++){
			  	System.out.println("Enter Value");
			  	  A[i][j]=scanner.nextInt();
			  }
		}
		// DISPLAY	
		System.out.println("------------------------------");
		for(int i=0;i<A.length;i++){
			  for(int j=0;j<A[i].length;j++){
			  	System.out.print(A[i][j]);	  
			  }
			  System.out.println();
		}
	}
}