/*
*****
 *  *
  * *
   **
    *
 */  	

public class Example05{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){
			//Space Loop
			 for(int sp=1;sp<i;sp++)
			 System.out.print(" ");	

			 for(int j=i;j<=N;j++){
				if(i==1  || j==N || j==i)		 	
			 	System.out.print("*");
			    else
				System.out.print(" ");				    	
			 }
			 
			 System.out.println();
		}
	}
}