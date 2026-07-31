/*
15      13      10      6       1
14      11      7       2
12      8       3
9       4
5
*/
public class Example04{
	public static void main(String[] args) {
		int N=5;
		int cnt=N*(N+1)/2;

		for(int i=1;i<=N;i++){
			 int c=cnt;
			 for(int j=i;j<=N;j++){
			 	System.out.print(c+"\t");
			 	c=c-j-1;
			 }
			 cnt=cnt-i;
			 System.out.println();
		}
	}
}