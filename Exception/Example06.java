import java.util.Scanner;

public class Example06{
	public static void main(String[] args) {
		int x, y;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter X");
		x=scanner.nextInt();
		System.out.println("Enter Y");
		y=scanner.nextInt();
		
		int arr[]={11,22,33,44,55};
		
		String str=null;

		try{

		int res=x/y;

		System.out.println(arr[res]);

		System.out.println(str.length());


		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){

			e.printStackTrace();
		}

		System.out.println("THANK YOU !!!!");
		
	}

}

// try with mutiple catch