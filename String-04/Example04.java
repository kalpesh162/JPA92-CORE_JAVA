
// public boolean equals(Object)

public  class Example04 {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Hello";

		System.out.println(s1.equals(s2));

		String s3=new String("time");
		String s4=new String("time");

		System.out.println(s3.equals(s4));

		String s5=new String("Happy");
		String s6="Happy";
		System.out.println(s5.equals(s6));


		// == operator will check references 
		// equals() method of String class check contents of String Object
	
	}
	
}