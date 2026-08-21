import java.util.Scanner;
public class Example01{
    /*
	static boolean isPrime(int num){

		if(num<=1) return false;

		for(int i=2;i<num;i++){
			 if(num%i==0) return false;
		}

       return true;
	}
	*/

	/*
	static boolean isPrime(int num){

		if(num<=1) return false;

		for(int i=2;i<=num/2;i++){
			 if(num%i==0) return false;
		}

       return true;
	}
	*/

	static boolean isPrime(int num){

		if(num<=1) return false;

		int root=(int)Math.sqrt(num);

		for(int i=2;i<=root;i++){
			 if(num%i==0) return false;
		}

       return true;
	}

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num");
		num=scanner.nextInt();

		boolean res=isPrime(num);
		if(res)
		System.out.println("Prime");
		else
		System.out.println("NOT  Prime");


	}
	
}