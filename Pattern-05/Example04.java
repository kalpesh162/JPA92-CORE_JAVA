/*
5
9       4
12      8       3
14      11      7       2
15      13      10      6       1
*/
public class Example04{
	public static void main(String[] args) {
		int N=5;
		int cnt=N;
		for(int i=N;i>=1;i--){
			   int c=cnt;
			  for(int j=i;j<=N;j++){
			  	System.out.print(c+"\t");
			  	c=c-j-1;
			  }
			  cnt=cnt+i-1;
			  System.out.println();
		}
		
	}
}