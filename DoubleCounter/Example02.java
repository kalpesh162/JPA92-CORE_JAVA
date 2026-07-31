/*
1       6       10      13      15
        2       7       11      14
                3       8       12
                        4       9
                                5
*/

public class Example02{
	public static void main(String[] args) {
		int N=5;
		int cnt=1;

		for(int i=1;i<=N;i++){

				for(int sp=1;sp<i;sp++)
					System.out.print("\t");

				int c=cnt;
			  for(int j=N;j>=i;j--){
			  	 System.out.print(c+"\t");
			  	 c=c+j;
			  }
			  cnt++;
			  System.out.println();	
		}

	}
}