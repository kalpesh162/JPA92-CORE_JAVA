/*
 5
 44
 333
 2222
 11111
 2222
 333
 44
 5
*/
public class Example07{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			if(i<=N){
			 for (int j=i;j>=1;j--) {
			 	System.out.print(N-i+1);
			 }

			} 
			else{
				
				for(int j=2*N-i;j>=1;j--)
					System.out.print(i-N+1);
			}

			 System.out.println();
		}

	}
 }
