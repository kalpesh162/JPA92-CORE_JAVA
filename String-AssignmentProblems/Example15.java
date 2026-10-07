/*
✅ Q15. Append Length of Each Word

Problem: Add length of each word at the end of the word.

Input: hello i am java developer

Output: hello5 i1 am2 java4 developer9

*/
class Example15{

	public static String appendWordLengthPosition(String input){
		 // STEP -1 split input by spaces gets words[]
		String[] words=input.split(" ");
		// STEP -2 CREATE 
		StringBuilder res=new StringBuilder(input.length()+words.length);
		// STEP -3 apply loop with index  or take counter
		for(String word : words)
		res.append(word).append(word.length()).append(" ");
		// STEP -4
		return String.valueOf(res).trim();
	}

	public static void main(String[] args) {
		
		String input="hello i am java developer";

		System.out.println(input);

		String output=appendWordLengthPosition(input);

		System.out.println(output);

	}
	

}