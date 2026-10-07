/*
✅ Q16. Shift First Letter of Each Word to the End

Problem: Move first character of every word to the end.

Input: hello i am java developer

Output: elloh i ma avaj eveloperd
*/

class Example16{

	public static String shifLetterOfEachWord(String input){
		// Result to store
		StringBuilder res=new StringBuilder(input.length());

		// split string into spaces
		String words[]=input.split(" ");

		for(String word : words){
			  // String Lenght > 1
			if(word.length()>1){
						// word ---> hello
						// --> ello   substring(1)			
				char firstLetter=word.charAt(0);	

				String part=word.substring(1);
				// part + firstLetter
				res.append(part).append(firstLetter).append(" ");
			}
			else{
				 res.append(word).append(" ");
			}
		}

		 	return String.valueOf(res).trim();
	}

	public static void main(String[] args) {
		
		String input="hello i am java developer";

		System.out.println(input);

		String output=shifLetterOfEachWord(input);

		System.out.println(output);

	}
	

}