/*
A       F       J       M       O
        B       G       K       N
                C       H       L
                        D       I
                                E
*/

public class Example03{
	public static void main(String[] args) {
		int N=5;
		int cnt=1;

		for(int i=1;i<=N;i++){

				for(int sp=1;sp<i;sp++)
					System.out.print("\t");

				int c=cnt;
			  for(int j=N;j>=i;j--){
			  	 System.out.print((char)(c+64)+"\t");
			  	 c=c+j;
			  }
			  cnt++;
			  System.out.println();	
		}

	}
}