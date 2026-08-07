/*
* * *
 * *
* * *
 * *
* * *
*/
public class Example04{
	public static void main(String[] args) {
		
		int N=5;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){

				if(i%2==1){
					if(j%2==1) System.out.print("*");
					else	System.out.print(" ");
				}
				else{
					if(j%2==1) System.out.print(" ");
					else	System.out.print("*");

				}

			}

			System.out.println();
		}


	}
}