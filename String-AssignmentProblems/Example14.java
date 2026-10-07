/*
✅ Q14. Append Word Position to Each Word

Problem: Append word number (starting from 1) to each word.

Input: hello i am java developer

Output: hello1 i2 am3 java4 developer5

*/
class Example14{

	public static String appendWordPosition(String input){
		//StringBuilder res=new StringBuilder(input.length());

		   // split input by spaces gets words[]
		String[] words=input.split(" ");

		StringBuilder res=new StringBuilder(input.length()+words.length);

		int cnt=1;
		 //apply loop with index  or take counter
		for(String word : words){
			 res.append(word).append(cnt).append(" ");
			 cnt++;
		}

		// add after word that index or counter and stores in res   

		// res.toString().trim()
		return String.valueOf(res).trim();
	}

	public static void main(String[] args) {
		
		String input="hello i am java developer";

		System.out.println(input);

		String output=appendWordPosition(input);

		System.out.println(output);

	}
	

}