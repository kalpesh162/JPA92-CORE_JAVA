
public  class Example04 {

	public static void main(String[] args) {
		 

		StringBuilder sb1=new StringBuilder("Hello"); 
		
		for(int i=0;i<sb1.length();i++)
			System.out.println(sb1.charAt(i));

		// int indexOf(String )
		System.out.println("indexof  " +sb1.indexOf("l"));
		System.out.println("lastindexof  " +sb1.lastIndexOf("l"));

		String sent=" Hi Hello Bye i love india love india love";
		System.out.println("indexof  " +sent.indexOf("india"));
		System.out.println("lastindexof  " +sent.lastIndexOf("india"));

		//String.valueof()

		StringBuilder sb2=new StringBuilder("helloworld");
		//	void deleteCharAt(int index)
		System.out.println(sb2);
		sb2.deleteCharAt(4);
		System.out.println(sb2);

		System.out.println("---------------------------");

		// public String substring(int start, int end )   >= start    <end
		StringBuilder sb3=new StringBuilder("Tere Nam");
		System.out.println(sb3.substring(5));
		System.out.println(sb3.substring(0,4));


	}
	
}