/*
    5
   444
  33333
 2222222
111111111   
*/
public class Example06{
	public static void main(String[] args) {
		int N=5;
		for(int i=N;i>=1;i--){
			
			for(int sp=i;sp>1;sp--)
				System.out.print(" ");
			
			//* pattern 
			for(int j=(2*i-1);j<2*N;j++)
				System.out.print(i);
			

			System.out.println();

		}
	}
}