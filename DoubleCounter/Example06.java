/*
O       M       J       F       A
        N       K       G       B
                L       H       C
                        I       D
                                E
*/
public class Example06{
	public static void main(String[] args) {
		int N=5;
		int cnt=N*(N+1)/2;

		for(int i=1;i<=N;i++){
			for(int sp=1;sp<i;sp++)
				System.out.print("\t");
			 int c=cnt;
			 for(int j=i;j<=N;j++){
			 	System.out.print((char)(c+64)+"\t");
			 	c=c-j-1;
			 }
			 cnt=cnt-i;
			 System.out.println();
		}
	}
}