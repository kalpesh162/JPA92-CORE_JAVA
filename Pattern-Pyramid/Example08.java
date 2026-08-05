/*
    1
   212
  32123
 4321234
543212345  
*/
public class Example08{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<=N;i++){
			
			for(int sp=i;sp<N;sp++)
				System.out.print(" ");
			
			for(int j=i;j>=1;j--)
			System.out.print(j);

			for(int j=2;j<=i;j++)
			System.out.print(j);				
			

			System.out.println();

		}
	}
}