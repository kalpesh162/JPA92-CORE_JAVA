/*
✅ Q13. Reverse Each Word in Sentence

Problem: Reverse each individual word in the sentence.

Input: hello i am java developer

Output: olleh i ma avaj repoleved

*/
public class Example13{

	public static String reverseWord(String input){

			String res="";

			String words[]=input.split(" ");
			for(String word : words){
				   res=res+new StringBuilder(word).reverse().toString();
			}
			return res;
	}


	public static void main(String[] args) {

		String input="hello i am java developer";

		String output=reverseWord(input);

		System.out.println(output);
	}
}