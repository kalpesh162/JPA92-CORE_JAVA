/*
15
13  14
10  11  12
6    7   8   9
1    2   3   4   5
*/
public class Example04{
	
	public static void main(String[] args) {
			int N=5;
			int cnt=(N*(N+1))/2;

			for(int i=1;i<=N;i++){
					int c=cnt;
				  for(int j=1;j<=i;j++){
				  		System.out.print(c+"\t");
				  		c++;
				  }
				  cnt=cnt-i-1;
				  System.out.println();
			}
	}

}