/*
    *
   ***
  *****
 *******
*********
*/
public class Example01{
	public static void main(String[] args) {
		
		int N=5;
		for(int i=1;i<=N;i++){
			// space loop
			for(int sp=i;sp<N;sp++)
				System.out.print(" ");

			//* pattern 
			for(int j=1;j<=i;j++)
				System.out.print("*");
			//* pattern 
			for(int j=1;j<i;j++)
				System.out.print("*");

			System.out.println();

		}
	}
}