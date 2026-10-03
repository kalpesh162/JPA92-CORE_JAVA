
public  class Example01{

	public static void main(String[] args) {
			// public String toUpperCase()
			// public String toLowerCase()
			String str="Hello";
			System.out.println("Uppercase  "+str.toUpperCase());
			System.out.println("toLowerCase  "+str.toLowerCase());		

			// public String trim()   leading and trailing remove white spaces

			String s1="    Hello   ";
			System.out.println(s1);
			System.out.println(s1.trim());
			/*
			static String	valueOf(boolean b)	
			static String	valueOf(char c)	
			static String	valueOf(char[] data)	
			static String	valueOf(char[] data, int offset, int count)	
			static String	valueOf(double d)	
			static String	valueOf(float f)	
			static String	valueOf(int i)	
			static String	valueOf(long l)	
			static String	valueOf(Object obj)	
		*/

			int num=1234;   
			System.out.println(String.valueOf(num));

			// Boxing   What is Boxing ?  
			// Conversion of primitive type to reference type
			//Wrapper class   Boolean Byte Charcter Short Integer Long Float Double 
			// These Above All classes are called as Wrapper classes in Java

			// java.lang.Integer
			Integer i1=Integer.valueOf(num);
			Integer i2=new Integer(num);
			System.out.println(Integer.valueOf(num));

	}
}