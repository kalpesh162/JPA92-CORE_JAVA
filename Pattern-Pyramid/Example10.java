/*     
    5
   454
  34543
 2345432
123454321

*/
public class Example10{
	public static void main(String[] args) {
		int N=5;
		for(int i=N;i>=1;i--){
			
			for(int sp=i;sp>1;sp--)
				System.out.print(" ");
			
			for(int j=i;j<=N;j++)
			System.out.print(j);

			for(int j=N-1;j>=i;j--)
			System.out.print(j);				
		
			System.out.println();

		}
	}
}