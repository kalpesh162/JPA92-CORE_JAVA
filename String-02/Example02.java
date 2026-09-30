public class Example02{
	

	public static void main(String[] args) {
		String str="I Love India";
		// boolean startsWith(String)	
		// boolean endssWith(String)	

		System.out.println("start With  "+str.startsWith("I"));
		System.out.println("ends With  "+str.endsWith("India"));

		//String	substring(int beginIndex)	

		//String	substring(int beginIndex, int endIndex)
		// V IMP
		System.out.println(str.substring(1));
		System.out.println(str.substring(2,6));  // from=2 <end

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

	}

}