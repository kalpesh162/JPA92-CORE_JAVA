public  class Example03 {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Hello";

		System.out.println(s1==s2);

		String s3=new String("time");
		String s4=new String("time");

		System.out.println(s3==s4);

		String s5=new String("Happy");
		String s6="Happy";
		System.out.println(s5==s6);


		// == operator will check references 
		

	}
	
}