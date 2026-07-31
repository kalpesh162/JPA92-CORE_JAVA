/*
11
12      7
13      8       4
14      9       5       2
15      10      6       3       1

*/

public class Example02{
	public static void main(String[] args) {
		int N=7;
		int cnt=((N*(N+1))/2)-(N-1);

		for(int i=N;i>=1;i--){
			int c=cnt;
			 for(int j=N;j>=i;j--){
			 		System.out.print(c+"\t");
			 		c=c-j;
			 }
			 cnt++;
			 System.out.println();
		}
	}
}