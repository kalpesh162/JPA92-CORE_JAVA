import java.util.Scanner;
public class Example02{
	static void doAdd(int x,int y){
		int z=x+y;
		System.out.println(z);
	}
	static void doSub(int x,int y){
		int z=x-y;
		System.out.println(z);
	}
	static void doMul(int x,int y){
		int z=x*y;
		System.out.println(z);
	}
	static void doDiv(int x,int y){
		int z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		int num1; int num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1 ");
		num1=scanner.nextInt();
		System.out.println("Enter Num2 ");
		num2=scanner.nextInt();

		doAdd(num1,num2);  //
 
	}
}