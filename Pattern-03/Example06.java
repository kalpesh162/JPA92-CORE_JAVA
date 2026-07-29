/*
12345
 1234
  123
   12
    1
*/
public class Example06{
	public static void main(String[] args) {
		// i=5 Sp=NP
		// i=4 sp=1
		// i=3 sp=2
		int N=5;

		for(int i=N;i>=1;i--){

			for(int sp=N; sp>i  ;sp--)
				System.out.print(" ");

			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
	}
}