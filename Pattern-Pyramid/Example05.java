/*
    5
   444
  33333
 2222222
111111111   
*/
public class Example05{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<=N;i++){
			
			for(int sp=i;sp<N;sp++)
				System.out.print(" ");
			
			//* pattern 
			for(int j=1;j<=(2*i-1);j++)
				System.out.print(N-i+1);
			

			System.out.println();

		}
	}
}