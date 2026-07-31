/*
AO      FM      JJ      MF      OA
        BN      GK      KG      NB
                CL      HH      LC
                        DI      ID
                                EE
*/
public class Example07{
	public static void main(String[] args) {
		int N=5;
		int cnt1=1;
		int cnt2=(N*(N+1))/2;

		for(int i=1;i<=N;i++){

				for(int sp=1;sp<i;sp++)
					System.out.print("\t");

				int c1=cnt1;
				int c2=cnt2;

			for(int j1=N,j2=i;(j1>=i && j2<=N);j1--,j2++){
					 System.out.print((char)(c1+64));
					 System.out.print((char)(c2+64)+"\t");
			 		 c2=c2-j2-1;
			  	 	 c1=c1+j1;
			}
			cnt1++;
			cnt2=cnt2-i;

			System.out.println();

		}
	}
}