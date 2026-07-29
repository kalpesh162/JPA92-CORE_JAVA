/*
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
*/
public class Example01{
	public static void main(String[] args) {
       int N=5;
       int cnt=1;
		for(int i=1;i<=N;i++){
		    for(int j=1;j<=i;j++){
		    	System.out.print(cnt+"\t");
		    	cnt++;
		    }
    	System.out.println();

		}
	}
}