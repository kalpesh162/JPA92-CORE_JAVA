/*
5
54
543
5432
54321
*/

public class Example06{
	public static void main(String[] args) {
		int N=5;

		for(int i=N;i>=1;i--){
			 for(int j=N; j >= i; j--){
			 	System.out.print(j);	
			 }
			 System.out.println();
		}
	}
}