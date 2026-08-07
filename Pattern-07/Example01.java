/*
111111111
2222 2222
333   333
44     44
5       5

*/
public class Example01{
	public static void main(String[] args) {
			int N=5;
			for(int i=1;i<=N;i++){
				if(i==1){
						for(int j=1;j<2*N;j++)
							System.out.print(i);
						System.out.println();
				}	
				else{
				 // * 
				 for(int j=i;j<=N;j++)
				 	System.out.print(i);
				 // space
				 for(int sp=1;sp<=2*(i-1)-1;sp++)
				 	System.out.print(" ");

				  // * 
				 for(int j=i;j<=N;j++)
				 	System.out.print(i);

				 System.out.println();
			  }
			}
	}
}