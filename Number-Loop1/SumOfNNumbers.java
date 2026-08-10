public class SumOfNNumbers{
	public static void main(String[] args) {
		
		int start=1; int end=10;
		int sum=0;  // Accumulator
		while(start<=end){
			sum=sum+start;
			start++;
		}

		System.out.println(sum);

	}
}