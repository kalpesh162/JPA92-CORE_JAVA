/*  5
   545
  54345
 5432345
543212345
*/
public class Example09{
	public static void main(String[] args) {
		int N=5;
		for(int i=N;i>=1;i--){
			
			for(int sp=i;sp>1;sp--)
				System.out.print(" ");
			
			for(int j=N;j>=i;j--)
			System.out.print(j);

			for(int j=i+1;j<=N;j++)
			System.out.print(j);				
		
			System.out.println();

		}
	}
}