/*
*****  *****
*****  *****
*****  *****
*****  *****
*****  *****
*/
public class Example05{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				System.out.print("*");
			}
			System.out.print("  ");
			for(int k=1;k<=N;k++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}