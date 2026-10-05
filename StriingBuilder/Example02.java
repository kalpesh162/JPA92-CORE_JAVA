/*
 public final class java.lang.StringBuilder implements Serilizable,CharSequence,Appendable {
	public StringBuilder()
	public StringBuilder(int capacity)
	public StringBuilder(String)
	public StringBuilder(CharSequence )

	public int length()
	public int capacity()

	@Overridr
	public String toString(){
	 
	}
}

*/


public  class Example02 {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder();  // it has capacity
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());  // 16 default Capacity

		System.out.println(" -----------------------------  ");
		StringBuilder sb2=new StringBuilder("India");
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());  // 21 default Capacity

		System.out.println(" -----------------------------  ");	

		// String s1="AAA";     s1.concat("BBB");    String concat(String)
		// StringBuilder append()  --> overloaded

		StringBuilder sb3=new StringBuilder();
		sb3.append("China");
		System.out.println(sb3);
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());  //  16 default Capacity

		System.out.println("+++++++++++++++++++++++++++");

		sb3.append("AAAAAAAAAAA");
		System.out.println(sb3);
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());  //  16 default Capacity

		System.out.println("+++++++++++++++++++++++++++");
		sb3.append("Z");


		System.out.println(sb3);
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());  //  16 default Capacity






	}
	
}