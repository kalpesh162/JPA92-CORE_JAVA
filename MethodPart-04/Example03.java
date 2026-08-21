import java.util.Scanner;
public class Example03{
 
	static boolean isPrime(int num){

		if(num<=1) return false;

		int root=(int)Math.sqrt(num);

		for(int i=2;i<=root;i++){
			 if(num%i==0) return false;
		}

       return true;
	}

	public  static void  rangePrime(int s,int e){

		for(int i=s;i<=e;i++){

		boolean res=isPrime(i);
		
		if(res)
		System.out.println("Prime   "+  i);
		
		}
	}

	public static void main(String[] args) {
		int start,end;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Start");
		start=scanner.nextInt();
		System.out.println("Enter End");
		end=scanner.nextInt();

		rangePrime(start,end);  //CALL

			// int  --> Primitive
	      // Integer.MAX_VALUE
		//2,147,483,647
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//-2,147,483,648
	}	
}