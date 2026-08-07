/*
123454321
1234 4321
123   321
12     21
1       1

*/
public class Example02{
	public static void main(String[] args) {
			int N=5;
			for(int i=N;i>=1;i--){
				if(i==N){
						for(int j=1;j<=N;j++)
							System.out.print(j);
						for(int j=N-1;j>=1;j--)
							System.out.print(j);

						System.out.println();
				}	
				else{
				 // * 
				 for(int j=1;j<=i;j++)
				 	System.out.print(j);
				 // space
				 for(int sp=1;sp<=2*(N-i)-1;sp++)
				 	System.out.print(" ");

				  // * 
				 for(int j=i;j>=1;j--)
				 	System.out.print(j);

				 System.out.println();
			  }
			}
	}
}