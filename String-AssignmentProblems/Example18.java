/*
✅ Q18. Move First Character of Each Word to End of Sentence

Problem: Remove the first letter of each word and append them at the end.

Input: hello i am java developer

Output: ello m ava eveloperhiajd

*/
class Example18{

	public static String swapFirstAndLastLetterOfEachWord(String input){
		// Result to store
		StringBuilder res=new StringBuilder(input.length());
		StringBuilder allFirstLetters=new StringBuilder();
		// split string into spaces
		String words[]=input.split(" ");

		for(String word : words){
			if(word.length()==1){
				char firstLetter=word.charAt(0);
				allFirstLetters.append(firstLetter);	
			}else{
				char firstLetter=word.charAt(0);
				allFirstLetters.append(firstLetter);
				StringBuilder temp=new StringBuilder(word);
				temp.deleteCharAt(0);
				res.append(temp).append(" ");
			}	
		}

		res.deleteCharAt(res.length()-1);
			res.append(allFirstLetters);
		 	return String.valueOf(res).trim();
	}

	public static void main(String[] args) {
		
		String input="hello i am java developer";

		System.out.println(input);

		String output=swapFirstAndLastLetterOfEachWord(input);

		System.out.println(output);

	}
	

}