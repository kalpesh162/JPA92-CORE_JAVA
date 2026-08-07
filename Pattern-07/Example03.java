/*
123454321
2345 5432
345   543
45     54
5       5

*/
public class Example03{
	public static void main(String[] args) {
			int N=5;
			for(int i=1;i<=N;i++){
				if(i==1){
						for(int j=1;j<=N;j++)
							System.out.print(j);
						for(int j=N-1;j>=1;j--)
							System.out.print(j);

						System.out.println();
				}	
				else{
				 // * 
				 for(int j=i;j<=N;j++)
				 	System.out.print(j);
				 // space
				 for(int sp=1;sp<=2*(i-1)-1;sp++)
				 	System.out.print(" ");

				  // * 
				 for(int j=N;j>=i;j--)
				 	System.out.print(j);

				 System.out.println();
			  }
			}
	}
}