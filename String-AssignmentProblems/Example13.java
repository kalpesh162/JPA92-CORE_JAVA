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
			/*
			for(String word : words){
				   res=res+new StringBuilder(word).reverse().toString()+" ";
			}
			*/

			int i;
			for(i=0;i<words.length-1;i++){
				   res=res+new StringBuilder(words[i]).reverse().toString()+" ";
			}
			if(i<words.length)
				res=res+new StringBuilder(words[i]).reverse().toString();


			return res;
	}


	public static String reverseWord1(String input){
		  if(input==null)
		  	return "";
		 
		  if(input.length()==1)
		  	return input;

		  if(input.trim().length()==0)
		  	return "";

			StringBuilder res=new StringBuilder();

			String words[]=input.split(" ");
			/*
			for(String word : words){
				   res=res+new StringBuilder(word).reverse().toString()+" ";
			}
			*/			
			int i;
			for(i=0;i<words.length-1;i++){
				   StringBuilder temp=new StringBuilder(words[i]).reverse();
				   res.append(temp).append(" ");
			}
			
			if(i<words.length){
					   StringBuilder temp=new StringBuilder(words[i]).reverse();
				   		res.append(temp);
			}

			return res.toString();
	}


	public static void main(String[] args) {

		String input="hello i am java developer";

		System.out.println(input);

		String output=reverseWord1(input);

		System.out.println(output);
		// for null
		System.out.println("-->  "+reverseWord1(null));

		// for Single String as a Character
		System.out.println("-->  "+reverseWord1("A"));

		// Space String
		System.out.println("-->  "+reverseWord1("           "));
	}
}