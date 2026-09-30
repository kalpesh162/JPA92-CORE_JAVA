public  class Example01 {

	public static void main(String[] args) {
		
		String s1="Hello";
		for(int i=0;i<s1.length();i++){
			System.out.println(s1.charAt(i));
		}
		// ASCII --> UNICODE
		for(int i=0;i<s1.length();i++){
			System.out.println(s1.codePointAt(i));
		}

		// public int indexOf(int)
		// public int lastIndexOf(int)
		System.out.println("indexOf  "+s1.indexOf('l'));
		// first Occurance
		System.out.println("lastIndexOf  "+s1.lastIndexOf('l'));

		//int	indexOf(int ch, int fromIndex)
		//int	lastIndexOf(int ch, int fromIndex)

		String str="";
		System.out.println("=== >  "+str.length());

		System.out.println("isEmpty   "+str.isEmpty());

		//String	replace(char oldChar, char newChar)
		//String	replace(CharSequence target, CharSequence replacement)
		String movie="Hum dil de chuke sanam HHHH";
		String changeMovinName=movie.replace('H','T');
		System.out.println(movie);
		System.out.println(changeMovinName);

		String text="Hello i love india i love india";
		//System.out.println(" replace String  "+text.replace("i","We"));
		System.out.println(" replace String  "+text.replace("i","V"));


		// String[]	split(String regex)
		// V IMP
		String mob="999-666-22-44";
		String numbers[]=mob.split("-");

		for(String num : numbers)
			System.out.println(num);

		String url="www.facebook.com";

		String words[]=url.split("\\.");

		for(String word : words)
			System.out.println(word);



	}
	
}