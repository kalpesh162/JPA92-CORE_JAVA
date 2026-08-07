/*
1       1
22     22
333   333
4444 4444
555555555
*/
public class Example04{
	public static void main(String[] args) {
			int N=5;
			for(int i=1;i<=N;i++){
				if(i==N){
						for(int j=1;j<2*N;j++)
							System.out.print(i);
						System.out.println();
				}	
				else{
				 // * 
				 for(int j=1;j<=i;j++)
				 	System.out.print(i);
				 // space
				 for(int sp=1;sp<=2*(N-i)-1;sp++)
				 	System.out.print(" ");

				  // * 
				 for(int j=1;j<=i;j++)
				 	System.out.print(i);
				 
				 System.out.println();
			  }
			}
	}
}