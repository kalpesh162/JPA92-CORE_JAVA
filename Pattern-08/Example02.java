/*
     *****
    *****
   *****
  *****
 *****
 */
public class Example02{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<=N;i++){
				// space 
				for(int sp=i;sp<N;sp++)
					System.out.print(" ");

				// Star		
				for(int j=1;j<=N;j++){

					System.out.print("*");
				}
				System.out.println();
		}


	}
}