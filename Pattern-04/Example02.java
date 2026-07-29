/*
15
14 13
12 11 10
9  8  7  6
5  4  3  2  1
*/
public class Example02{
	public static void main(String[] args) {
       int N=6;
       int cnt=((N)*(N+1))/2;
		for(int i=1;i<=N;i++){
		    for(int j=1;j<=i;j++){
		    	System.out.print(cnt+"\t");
		    	cnt--;
		    }
    	System.out.println();

		}
	}
}











