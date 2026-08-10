public class PrintOddNumbers{
	public static void main(String[] args) {
		int start=1;
		int end=100;

		while(start<=end){
				if(start%2==1)
					System.out.print(start+"  ");
				
			 start++;

		}
	}
}