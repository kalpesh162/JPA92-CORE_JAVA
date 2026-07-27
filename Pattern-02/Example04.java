/*
1
21
321
4321
54321
*/

public class Example04{
	public static void main(String[] args) {
		int N=5;		
		for(int i=1;i<=N;i++){
			for(int j=i;j>= 1 ;j--){
				 System.out.print(j);
			}
			System.out.println();
		}
	}
}