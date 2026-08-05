/*
11111
22221
33321
44321
54321
*/
public class Example06{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){
	
			  for(int j=i;j<N;j++){
			  	  	System.out.print(i);
			  }

			  for(int j=i;j>=1;j--)
			  	System.out.print(j);

			  System.out.println();
		}
	}
}