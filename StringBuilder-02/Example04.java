class Example04  {

	public static void main(String[] args) {
			
			StringBuffer sb1=new StringBuffer("Kareena");
			long startTime1=System.currentTimeMillis();
			for(int i=1;i<=100000000;i++)
				sb1.append("Kapoor");
			long endTime1=System.currentTimeMillis();


			StringBuilder sb2=new StringBuilder("Raveena");
			long startTime2=System.currentTimeMillis();
			for(int i=1;i<=100000000;i++)
				sb2.append("Tandon");
			long endTime2=System.currentTimeMillis();

			System.out.println("Time Required for StringBuffer  "+(endTime1-startTime1) +"  ms");
			System.out.println("Time Required for StringBuilder  "+(endTime2-startTime2)+"  ms");

	}
	
}