import java.util.Scanner;
/*
class  Throwable extends Object{
	String desc;

	Throwable(){ desc="";}
	Throwable(String desc){ this.desc=desc;}
	
}

class Exception extends Throwable {
		Exception()
		Exception(String s) { super(s)}
}

class RuntimeException extends Exception{
	 RuntimeException(String s){
	 	 super(s);
	 }
}
*/

class InvalidAgeException extends RuntimeException{
	
		InvalidAgeException(){}
		InvalidAgeException(String desc){

				super(desc);
		}

		// methods
}


class App {

	public  static boolean isValidAge(int age){

		if(age>18){
			  System.out.println("VOTE");
		}
		else{
			 //throw new InvalidAgeException();
			throw new InvalidAgeException("InvalidAgeException  :  "+age);
		}

		return true;

	}

	public static void main(String[] args) {

		int age; 
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER AGE   ");
		age=scanner.nextInt();
		System.out.println(isValidAge(age));

		System.out.println("Thanks...");
		
	}
	
}