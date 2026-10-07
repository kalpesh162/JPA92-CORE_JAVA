/*
✅ Q11. Sort Words Lexicographically

Problem: Sort all words in dictionary (alphabetical) order.

Input: hello i am java developer

Output: am developer hello i java

*/
import java.util.Arrays;
class Example06{

	public static void main(String[] args) {
		
		String input[]={"hello", "i", "am", "java", "developer"};

		Arrays.sort(input);

		for(String word : input)
			System.out.println(word);
	}
	
}