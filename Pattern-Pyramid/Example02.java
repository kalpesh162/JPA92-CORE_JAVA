/*
    *
   ***
  *****
 *******
*********
*/
public class Example02{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<=N;i++){
			
			for(int sp=i;sp<N;sp++)
				System.out.print(" ");
			
			//* pattern 
			for(int j=1;j<=(2*i-1);j++)
				System.out.print("*");
			

			System.out.println();

		}
	}
}