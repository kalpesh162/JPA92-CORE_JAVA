class Example07 {

	public static void main(String[] args) {

		int A[]={11,22,33,44,55};

		for(int j=A.length-1;j>=0;j--)
			System.out.print(A[j]+"  ");

		System.out.println();
		int B[]=new int[A.length];

		int j=A.length-1;
		for(int i=0;i<A.length;i++){
			 B[i]=A[j];
			 j--;
		}
		for(int x : B)
		System.out.print(x+"  ");

		System.out.println();
		for(int x  : A)
		System.out.print(x+"  ");	

		System.out.println();
		int k=A.length-1;
	    for(int i=0;i<=k;i++){
	    	int temp=A[i];
	    	A[i]=A[k];
	    	A[k]=temp;
	    	k--;
	    }
	    for(int x : A)
		System.out.print(x+"  ");

	}
	
}