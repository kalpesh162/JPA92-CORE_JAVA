/*
    1
   121
  12321
 1234321
123454321  
*/
public class Example07{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<=N;i++){
			
			for(int sp=i;sp<N;sp++)
				System.out.print(" ");
			
			for(int j=1;j<=i;j++)
			System.out.print(j);

			for(int j=i-1;j>=1;j--)
			System.out.print(j);				
			

			System.out.println();

		}
	}
}