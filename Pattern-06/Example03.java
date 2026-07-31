/*
15   
10   14
6     9    13
3     5     8    12
1     2     4     7    11


     					15   
				   10   14
			 6     9    13
	   3     5     8    12
 1     2     4     7    11

*/

public class Example03{
	public static void main(String[] args) {
		int N=5;
		int cnt=(N*(N+1))/2;

		for(int i=N;i>=1;i--){
			
		//space Loop
		for(int sp=1;sp<i;sp++)
		System.out.print("\t");	

		int c=cnt;
		for(int j=i;j<=N;j++){
			System.out.print((char)(64+c)+"\t");
			c=c+j;
		}

		cnt=cnt-i;

		System.out.println();
	}

	}
}