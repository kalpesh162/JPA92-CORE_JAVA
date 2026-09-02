class Example05{
	public static void main(String[] args) {
			
			int A[]={11,22,33,44,55};

			for(int i=0;i<A.length;i++)
				System.out.print(A[i]+ "  ");

			System.out.println("----------------");

			// for each loop | forEach method in java Consumer interface

			// Iterator Design Pattern
			for(int ele:A)
				System.out.println(ele);
	}
}