import java.util.Scanner;

public class App{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=scanner.nextInt();
		NumberOperation numOp=new NumberOperation();
		numOp.number=num;   // Accessing member field of NumberOperation Type

		System.out.println("sum "+  numOp.sumOfDigit());

		numOp.printFactor();  // Accessing member method | instance method of NumberOperation Type
	}
}
	
// Note we can write n number of class in single .java
// But Threre is only one public class
// you cant write multiple public class inside single .java 
// name of public class must be filename

