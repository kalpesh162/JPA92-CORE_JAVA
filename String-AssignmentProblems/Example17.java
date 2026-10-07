/*
✅ Q17. Swap First and Last Letter of Each Word

Problem: Swap the first and last character of each word.

Input: hello i am java developer

Output: oellh i ma avaj revelopd

*/


class Example17{

	public static String swapFirstAndLastLetterOfEachWord(String input){
		// Result to store
		StringBuilder res=new StringBuilder(input.length());

		// split string into spaces
		String words[]=input.split(" ");

		for(String word : words){
			if(word.length()==1){
				 res.append(word).append(" ");
			}else{
				char firstLetter=word.charAt(0);
				char lastLetter=word.charAt(word.length()-1);
				StringBuilder temp=new StringBuilder(word);
				temp.setCharAt(0,lastLetter);
				temp.setCharAt(word.length()-1,firstLetter);

				res.append(temp).append(" ");

			}
			
		}

		 	return String.valueOf(res).trim();
	}

	public static void main(String[] args) {
		
		String input="hello i am java developer";

		System.out.println(input);

		String output=swapFirstAndLastLetterOfEachWord(input);

		System.out.println(output);

	}
	

}