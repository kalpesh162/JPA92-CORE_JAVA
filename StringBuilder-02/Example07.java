/*
✅ Q12. Sort Words by Length

Problem: Sort words based on their length (shortest to longest).

Input: hello i am java developer

Output: i am java hello developer
*/
import java.util.Arrays;
class Example07{

	public static void main(String[] args) {
		
		String input[]={"hello", "i", "am", "java", "developer"};
		
		// Bubble Sort
		for(int i=0;i<input.length-1;i++){

			 for(int j=i+1;j<input.length;j++){
			 	  if(input[j].length() < input[j-1].length()){
			 	  	String temp=input[j];
			 	  	input[j]=input[j-1];
			 	  	input[j-1]=temp;
			 	  }
			 }
		}

		for(String word : input)
			System.out.println(word);

		
		
	}
	
}