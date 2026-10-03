class Example01{
	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Hello";
		// public int compareTo(String )

		int res=s1.compareTo(s2);
		System.out.println(res);

		String s3="Apple";
		String s4="Bannana";
		int res1=s3.compareTo(s4);
		System.out.println(res1);

		String s5="AAB";
		String s6="AABC";
		int res2=s5.compareTo(s6);
		System.out.println(res2);

		String s7="AAB";
		String s8="AABZ";
		int res3=s7.compareTo(s8);
		System.out.println(res3);

		String s9="A";
		String s10="a";
		int res4=s9.compareTo(s10);
		System.out.println(res4);

		String s11="";
		String s12="D";
		int res5=s11.compareTo(s12);
		System.out.println(res5);

	}
}
//
/* public interface java.lang.Comparable<T>{
	//public int compareTo(Object o)	
	public int compareTo(T o)	
}
*/
/* public class final java.lang.String  implements Comparable<String>{
		@Override
		public int compareTo(String o)	{
	      return 1;
	      return -1;
	       return 0;
		}
}
*/
