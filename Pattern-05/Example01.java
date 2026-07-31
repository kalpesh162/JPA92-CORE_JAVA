/*
15
14      10
13      9       6
12      8       5       3
11      7       4       2       1
*/
public class Example01{
	public static void main(String[] args) {
		int N=5;
		int cnt=(N*(N+1))/2;

		for (int i=N;i>=1 ;i-- ) {
				int c=cnt;
			 for(int j=N;j>=i;j--){
			 	  System.out.print(c+"\t");
			 	  c=c-j+1;
			 }
			 cnt--;
			 System.out.println();
		}
	}
}