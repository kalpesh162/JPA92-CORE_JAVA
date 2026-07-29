/*
    *
   **
  ***
 ****
*****

####
###
##
#


*/

public class Example03{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<=N;i++){
			// space
            for(int sp= i; sp<5  ; sp++){
            	System.out.print(" ");
            }

			// start
			 for(int j=1;j<=i;j++){
			 	 System.out.print("*");
			 }
			 System.out.println();
		}
	}
}