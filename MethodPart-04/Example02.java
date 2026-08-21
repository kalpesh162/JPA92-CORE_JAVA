import java.util.Scanner;
public class Example02{
 
	static boolean isPrime(int num){

		if(num<=1) return false;

		int root=(int)Math.sqrt(num);

		for(int i=2;i<=root;i++){
			 if(num%i==0) return false;
		}

       return true;
	}

	public static void main(String[] args) {
		int start,end;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Start");
		start=scanner.nextInt();
		System.out.println("Enter End");
		end=scanner.nextInt();

		for(int i=start;i<=end;i++){

		boolean res=isPrime(i);
		
		if(res)
		System.out.println("Prime   "+  i);
		
		}
		
	}	
}