import java.io.File;
import java.io.IOException;
// What is throws ?
// throws keyword generally used with checked Exception
// redirecting Exception to caller method 

// throws keywords can apply with the method ONLY
public class Example02 {

	public  static void f1() throws IOException{
		   f2();
	}
	public  static void f2() throws IOException{
		 f3();
	}
	public  static void f3() throws IOException{
		// path+fileName  D:/Programs/mycontact.txt
		// Current Director 
		
		File file=new File("movies.txt");

		file.createNewFile();
	
	}

	public static void main(String[] args) throws IOException{
		
		f1();

				System.out.println("THANK ....");
	}
	
}