import java.util.Scanner;

public class Example05{
	public static void main(String[] args) {
		int x, y;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter X");
		x=scanner.nextInt();
		System.out.println("Enter Y");
		y=scanner.nextInt();
		
		int arr[]={11,22,33,44,55};
		
		String str=null;
		String  name="Kareena";

		try{

		int res=x/y;

		System.out.println(arr[res]);

		System.out.println(name.charAt(10));

		System.out.println(str.length());




		}
		catch(ArithmeticException e){

			e.printStackTrace();

		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		catch(Exception e){
				e.printStackTrace();	
		}
		// IMP   MCQ
		// try with muliple catch --> catch at bottom must be parent
		// it shoud be chile to parent otherwise gets CompiltTime Error  Partiular Exxcpetion has been already Caught


		System.out.println("THANK YOU !!!!");
		
	}

}

// try with mutiple catch